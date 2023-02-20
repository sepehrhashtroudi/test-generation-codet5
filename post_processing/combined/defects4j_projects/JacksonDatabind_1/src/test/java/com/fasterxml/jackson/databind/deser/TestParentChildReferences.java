package com.fasterxml.jackson.databind.deser;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import com.fasterxml.jackson.databind.*;

public class TestParentChildReferences
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Test classes
    /**********************************************************
     */

    /**
     * First, a simple 'tree': just parent/child linkage
     */
    static class SimpleTreeNode
    {
        public String name;
        
        // Reference back to parent; reference, ignored during ser,
        // re-constructed during deser
        @JsonBackReference
        public SimpleTreeNode parent;

        // Reference that is serialized normally during ser, back
        // reference within pointed-to instance assigned to point to
        // referring bean ("this")
        @JsonManagedReference
        public SimpleTreeNode child;

        public SimpleTreeNode() { this(null); }
        public SimpleTreeNode(String n) { name = n; }
    }

    static class SimpleTreeNode2
    {
        public String name;
        private SimpleTreeNode2 parent;
        private SimpleTreeNode2 child;

        public SimpleTreeNode2() { this(null); }
        public SimpleTreeNode2(String n) { name = n; }

        @JsonBackReference
        public SimpleTreeNode2 getParent() { return parent; }
        public void setParent(SimpleTreeNode2 p) { parent = p; }

        @JsonManagedReference
        public SimpleTreeNode2 getChild() { return child; }
        public void setChild(SimpleTreeNode2 c) { child = c; }
    }
    
    /**
     * Then nodes with two separate linkages; parent/child
     * and prev/next-sibling
     */
    static class FullTreeNode
    {
        public String name;

        // parent-child links
        @JsonBackReference("parent")
        public FullTreeNode parent;
        @JsonManagedReference("parent")
        public FullTreeNode firstChild;

        // sibling-links
        @JsonManagedReference("sibling")
        public FullTreeNode next;
        @JsonBackReference("sibling")
        protected FullTreeNode prev;
        
        public FullTreeNode() { this(null); }
        public FullTreeNode(String name) {
            this.name = name;
        }
    }

    /**
     * Class for testing managed references via arrays
     */
    static class NodeArray
    {
        @JsonManagedReference("arr")
        public ArrayNode[] nodes;
    }

    static class ArrayNode
    {
        public String name;
        
        @JsonBackReference("arr")
        public NodeArray parent;

        public ArrayNode() { this(null); }
        public ArrayNode(String n) { name = n; }
    }
    
    /**
     * Class for testing managed references via Collections
     */
    static class NodeList
    {
        @JsonManagedReference
        public List<NodeForList> nodes;
    }

    static class NodeForList
    {
        public String name;
        
        @JsonBackReference
        public NodeList parent;

        public NodeForList() { this(null); }
        public NodeForList(String n) { name = n; }
    }
    
    static class NodeMap
    {
        @JsonManagedReference
        public Map<String,NodeForMap> nodes;
    }

    static class NodeForMap
    {
        public String name;
        
        @JsonBackReference
        public NodeMap parent;

        public NodeForMap() { this(null); }
        public NodeForMap(String n) { name = n; }
    }

    public static class Parent {
        @JsonManagedReference
        private final List<Child> children = new ArrayList<Child>();

        public List<Child> getChildren() { return children; }

        public void addChild(Child child) { children.add(child); child.setParent(this); }
    }

    public static class Child {
        private Parent parent;
        private final String value; // So that the bean is not empty of properties

        public Child(@JsonProperty("value") String value) { this.value = value; }

        public String getValue() { return value; }

        @JsonBackReference
        public Parent getParent() { return parent; }

        public void setParent(Parent parent) { this.parent = parent; }
    }    

    // [JACKSON-368]

    @JsonTypeInfo(use=Id.NAME)
    @JsonSubTypes({@JsonSubTypes.Type(ConcreteNode.class)})
    static abstract class AbstractNode
    {
        public String id;
        
        @JsonManagedReference public AbstractNode next;
        @JsonBackReference public AbstractNode prev;
    }

    @JsonTypeName("concrete")
    static class ConcreteNode extends AbstractNode {
        public ConcreteNode() { }
        public ConcreteNode(String id) { this.id = id; }
    }
    
    // [JACKSON-708]
    static class Model708 { }
    
    static class Advertisement708 extends Model708 {
        public String title;
        @JsonManagedReference public List<Photo708> photos;
    }

    static class Photo708 extends Model708 {
        public int id;
        @JsonBackReference public Advertisement708 advertisement;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    
public void testIssue69357() throws Exception { 
     Parent parent = new Parent(); 
     parent.addChild(new Child("foo")); 
     parent.addChild(new Child("bar")); 
     ObjectMapper mapper = new ObjectMapper(); 
     byte[] bytes = mapper.writeValueAsBytes(parent); 
     Parent value = mapper.readValue(bytes, Parent.class); 
     for (Child child : value.children) { 
         assertEquals(value, child.getParent()); 
     } 
 }
public void testMapOfRefs58() throws Exception { 
     NodeMap root = new NodeMap(); 
     NodeForMap node1 = new NodeForMap("a"); 
     NodeForMap node2 = new NodeForMap("b"); 
     Map<String, NodeForMap> nodes = new HashMap<String, NodeForMap>(); 
     nodes.put("a1", node1); 
     nodes.put("b2", node2); 
     root.nodes = nodes; 
     ObjectMapper mapper = new ObjectMapper(); 
     String json = mapper.writeValueAsString(root); 
     NodeMap result = mapper.readValue(json, NodeMap.class); 
     Map<String, NodeForMap> kids = result.nodes; 
     assertNotNull(kids); 
     assertEquals(2, kids.size()); 
     assertNotNull(kids.get("a1")); 
     assertNotNull(kids.get("b2")); 
     assertEquals("a", kids.get("a1").name); 
     assertEquals("b", kids.get("b2").name); 
     assertSame(result, kids.get("a1").parent); 
     assertSame(result, kids.get("b2").parent); 
 }
public void testIssue708166() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     Advertisement708 ad = mapper.readValue("{\"title\":\"Hroch\",\"photos\":[{\"id\":3}]}", Advertisement708.class); 
     assertNotNull(ad); 
 }
public void testAbstract368167() throws Exception { 
     AbstractNode parent = new ConcreteNode("p"); 
     AbstractNode child = new ConcreteNode("c"); 
     parent.next = child; 
     child.prev = parent; 
     ObjectMapper mapper = new ObjectMapper(); 
     String json = mapper.writeValueAsString(parent); 
     AbstractNode root = mapper.readValue(json, AbstractNode.class); 
     assertEquals(ConcreteNode.class, root.getClass()); 
     assertEquals("p", root.id); 
     assertNull(root.prev); 
     AbstractNode leaf = root.next; 
     assertNotNull(leaf); 
     assertEquals("c", leaf.id); 
     assertSame(root, leaf.prev); 
 }
    

    // [JACKSON-693]
    
    
    

    

    

    

    // for [JACKSON-368]
    
    
    

       
}
