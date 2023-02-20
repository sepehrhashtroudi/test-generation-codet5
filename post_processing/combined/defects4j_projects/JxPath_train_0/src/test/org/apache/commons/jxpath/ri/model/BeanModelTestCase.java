/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.jxpath.ri.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.ClassFunctions;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.NestedTestBean;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.TestFunctions;
import org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;

/**
 * Abstract superclass for Bean access with JXPath.
 *
 * @author Dmitri Plotnikov
 * @version $Revision$ $Date$
 */

public abstract class BeanModelTestCase extends JXPathTestCase {
    private JXPathContext context;

    /**
     * Construct a new instance of this test case.
     *
     * @param name Name of the test case
     */
    public BeanModelTestCase(String name) {
        super(name);
    }

    public void setUp() {
//        if (context == null) {
            context = JXPathContext.newContext(createContextBean());
            context.setLocale(Locale.US);
            context.setFactory(getAbstractFactory());
//        }
    }

    protected abstract Object createContextBean();
    protected abstract AbstractFactory getAbstractFactory();

    /**
     * Test property iterators, the core of the graph traversal engine
     */

public void testCoreFunctions3() { 
     assertXPathValue(context, "boolean(boolean)", Boolean.TRUE); 
     assertXPathValue(context, "boolean(boolean = false())", Boolean.TRUE); 
     assertXPathValue(context, "boolean(integers[position() < 3])", Boolean.TRUE); 
     assertXPathValue(context, "boolean(integers[position() > 4])", Boolean.FALSE); 
     assertXPathValue(context, "sum(integers)", new Double(10)); 
     assertXPathValueAndPointer(context, "integers[last()]", new Integer(4), "/integers[4]"); 
     assertXPathValueAndPointer(context, "//strings[last()]", "String 3", "/beans[1]/strings[3]"); 
 } 


public void testUnion6() { 
     assertXPathValueIterator(context, "integers | beans[1]/strings", list("String 1", "String 2", "String 3", new Integer(1), new Integer(2), new Integer(3), new Integer(4))); 
     assertXPathValue(context, "count((integers | beans[1]/strings)[contains(., '1')])", new Double(2)); 
     assertXPathValue(context, "count((integers | beans[1]/strings)[name(.) = 'strings'])", new Double(3)); 
     assertXPathValue(context, "(integers)[2]", new Integer(2)); 
 } 


public void testBooleanPredicate11() { 
     assertXPathValue(context, "beans[int > 2]/name", "Name 2"); 
     assertXPathValueIterator(context, "beans[int > 2]/name", list("Name 2")); 
     assertXPathValueIterator(context, "beans[int >= 1]/name", list("Name 1", "Name 2")); 
     assertXPathValueIterator(context, "beans[int < 2]/name", list("Name 1")); 
     assertXPathValueIterator(context, "beans[int <= 3]/name", list("Name 1", "Name 2")); 
     assertXPathValueIterator(context, "beans[1]/strings[string-length() = 8]", list("String 1", "String 2", "String 3")); 
     assertXPathValueIterator(context, "//self::node()[name = 'Name 0']/name", list("Name 0")); 
     assertXPathValue(context, "beans/strings[name(.)='strings'][2]", "String 2"); 
     assertXPathValueIterator(context, "//self::node()[name(.) = concat('n', 'a', 'm', 'e')]", list("Name 1", "Name 2", "Name 3", "Name 6", "Name 0", "Name 5", "Name 4")); 
     assertXPathValueIterator(context, "integers[position()<3]", list(new Integer(1), new Integer(2))); 
     context.getVariables().declareVariable("temp", context.getValue("beans")); 
     assertXPathValueIterator(context, "$temp[int < 2]/int", list(new Integer(1))); 
 } 


public void testRemovePathBeanValue14() { 
     context.removePath("nestedBean"); 
     assertEquals("Remove collection element", null, context.getValue("nestedBean")); 
 } 


public void testRelativeContextRelativePath25() { 
     JXPathContext relative = context.getRelativeContext(context.getPointer("nestedBean")); 
     assertXPathValueAndPointer(relative, "int", new Integer(1), "/nestedBean/int"); 
 } 


public void testCreatePathExpandExistingCollection26() { 
     assertXPathCreatePathAndSetValue(context, "/integers[5]", new Integer(3), "/integers[5]"); 
 } 


public void testAxisAncestor27() { 
     assertXPathValue(context, "int/ancestor::root = /", Boolean.TRUE); 
     assertXPathValue(context, "count(beans/name/ancestor-or-self::node())", new Double(5)); 
     assertXPathValue(context, "beans/name/ancestor-or-self::node()[3] = /", Boolean.TRUE); 
 } 


public void testAxisPrecedingSibling28() { 
     assertXPathValue(context, "count(/boolean/preceding-sibling::node())", new Double(2)); 
     assertXPathValue(context, "count(/nestedBean/int/../preceding-sibling::node())", new Double(12)); 
     assertXPathValue(context, "count(/descendant::int/preceding-sibling::node())", new Double(10)); 
 } 


public void testAxisFollowingSibling32() { 
     assertXPathValue(context, "count(/nestedBean/following-sibling::node())", new Double(8)); 
     assertXPathValue(context, "count(/nestedBean/following-sibling::object)", new Double(1)); 
     assertXPathValue(context, "count(/nestedBean/boolean/../following-sibling::node())", new Double(8)); 
     assertXPathValue(context, "count(/nestedBean/boolean/../following-sibling::object)", new Double(1)); 
     assertXPathValue(context, "count(/descendant::boolean/following-sibling::node())", new Double(53)); 
     assertXPathValue(context, "count(/descendant::boolean/following-sibling::name)", new Double(7)); 
 } 


public void testCreatePath35() { 
     context.setValue("nestedBean", null); 
     assertXPathCreatePath(context, "/nestedBean/int", new Integer(1), "/nestedBean/int"); 
     boolean ex = false; 
     try { 
         assertXPathCreatePath(context, "/nestedBean/beans[last() + 1]", new Integer(1), "/nestedBean/beans[last() + 1]"); 
     } catch (Exception e) { 
         ex = true; 
     } 
     assertTrue("Exception thrown on invalid path for creation", ex); 
 } 


public void testAxisSelf41() { 
     assertXPathValue(context, "self::node() = /", Boolean.TRUE); 
     assertXPathValue(context, "self::root = /", Boolean.TRUE); 
 } 


public void testAxisChild42() { 
     assertXPathValue(context, "boolean", Boolean.FALSE); 
     assertXPathPointer(context, "boolean", "/boolean"); 
     assertXPathPointerIterator(context, "boolean", list("/boolean")); 
     assertXPathValue(context, "count(set)", new Double(3)); 
     assertXPathValueIterator(context, "foo:boolean", list()); 
     assertXPathValue(context, "count(*)", new Double(21)); 
     assertXPathValue(context, "count(child::node())", new Double(21)); 
 } 


public void testAxisDescendant45() { 
     assertXPathValue(context, "count(descendant::node())", new Double(65)); 
     assertXPathValue(context, "count(descendant::root)", new Double(0)); 
     assertXPathValue(context, "count(descendant::name)", new Double(7)); 
 } 


public void testAxisDescendantOrSelf46() { 
     assertXPathValueIterator(context, "descendant-or-self::name", set("Name 1", "Name 2", "Name 3", "Name 6", "Name 0", "Name 5", "Name 4")); 
     assertXPathValueIterator(context, "//name", set("Name 1", "Name 2", "Name 3", "Name 6", "Name 0", "Name 5", "Name 4")); 
     assertXPathValue(context, "count(descendant-or-self::root)", new Double(1)); 
     assertXPathValue(context, "count(nestedBean//.)", new Double(7)); 
     assertXPathValue(context, "count(//self::beans)", new Double(2)); 
     assertXPathValue(context, "count(descendant-or-self::node())", new Double(66)); 
 } 


public void testSetContextDependentNode47() { 
     assertXPathSetValue(context, "integers[position() = 1]", new Integer(8)); 
     assertXPathSetValue(context, "beans[name = 'Name 1']/int", new Integer(9)); 
 } 


public void testRelativeContextParent48() { 
     JXPathContext relative = context.getRelativeContext(context.getPointer("nestedBean")); 
     assertXPathValueAndPointer(relative, "../integers[2]", new Integer(2), "/integers[2]"); 
 } 


public void testAxisParent51() { 
     assertXPathValue(context, "count(/beans/..)", new Double(1)); 
     assertXPathValue(context, "count(//..)", new Double(9)); 
     assertXPathValue(context, "count(//../..)", new Double(2)); 
     assertXPathValueIterator(context, "//parent::beans/name", list("Name 1", "Name 2")); 
 } 


public void testAxisAttribute54() { 
     assertXPathValue(context, "count(@*)", new Double(21.0)); 
     assertXPathValueLenient(context, "@foo", null); 
 } 


public void testAxisPreceding62() { 
     assertXPathValue(context, "count(beans[2]/int/preceding::node())", new Double(8)); 
     assertXPathValue(context, "count(beans[2]/int/preceding::boolean)", new Double(2)); 
 } 


public void testIteratePropertyArrayWithoutHasNext74() { 
     JXPathContext context = JXPathContext.newContext(createContextBean()); 
     Iterator it = context.iteratePointers("/integers"); 
     List actual = new ArrayList(); 
     for (int i = 0; i < 4; i++) { 
         actual.add(it.next().toString()); 
     } 
     assertEquals("Iterating 'next'<" + "/integers" + ">", list("/integers[1]", "/integers[2]", "/integers[3]", "/integers[4]"), actual); 
 } 


public void testCreatePathAndSetValue90() { 
     context.setValue("nestedBean", null); 
     assertXPathCreatePathAndSetValue(context, "/nestedBean/int", new Integer(2), "/nestedBean/int"); 
 } 


public void testRemovePathArrayElement91() { 
     context.removePath("nestedBean/strings[1]"); 
     assertEquals("Remove array element", "String 2", context.getValue("nestedBean/strings[1]")); 
 } 


public void testRemovePathPropertyValue100() { 
     context.removePath("nestedBean/int"); 
     assertEquals("Remove property value", new Integer(0), context.getValue("nestedBean/int")); 
 } 


public void testMultipleIterators106() { 
     testMultiple(0, 0, true, false, 20); 
     testMultiple(3, 0, true, false, 16); 
     testMultiple(3, -1, true, true, 8); 
     testMultiple(3, 0, true, true, 4); 
     testMultiple(0, 0, false, false, 21); 
     testMultiple(0, 0, false, true, 21); 
     testMultiple(3, 1, true, false, 15); 
     testMultiple(3, 3, true, false, 13); 
 } 


public void testIndividualIterators107() { 
     testIndividual(+1, 0, true, false, 0); 
     testIndividual(-1, 0, true, false, 4); 
     testIndividual(0, -1, true, true, 4); 
     testIndividual(+1, -1, true, true, 4); 
     testIndividual(-1, -1, true, true, 0); 
     testIndividual(0, 1, true, false, 2); 
     testIndividual(0, 1, true, true, 1); 
     testIndividual(0, 0, false, false, 4); 
     testIndividual(0, 0, false, true, 4); 
 } 


public void testDocumentOrder112() { 
     assertDocumentOrder(context, "boolean", "int", -1); 
     assertDocumentOrder(context, "integers[1]", "integers[2]", -1); 
     assertDocumentOrder(context, "integers[1]", "integers[1]", 0); 
     assertDocumentOrder(context, "nestedBean/int", "nestedBean", 1); 
     assertDocumentOrder(context, "nestedBean/int", "nestedBean/strings", -1); 
     assertDocumentOrder(context, "nestedBean/int", "object/int", -1); 
 } 


public void testIterateAndSet116() { 
     JXPathContext context = JXPathContext.newContext(createContextBean()); 
     Iterator it = context.iteratePointers("beans/int"); 
     int i = 5; 
     while (it.hasNext()) { 
         NodePointer pointer = (NodePointer) it.next(); 
         pointer.setValue(new Integer(i++)); 
     } 
     it = context.iteratePointers("beans/int"); 
     List actual = new ArrayList(); 
     while (it.hasNext()) { 
         actual.add(((Pointer) it.next()).getValue()); 
     } 
     assertEquals("Iterating <" + "beans/int" + ">", list(new Integer(5), new Integer(6)), actual); 
 } 


public void testCreatePathAndSetValueExpandExistingCollection130() { 
     assertXPathCreatePathAndSetValue(context, "/beans[3]/int", new Integer(2), "/beans[3]/int"); 
 } 

    

    private void testIndividual(
        int relativePropertyIndex,
        int offset,
        boolean useStartLocation,
        boolean reverse,
        int expected) 
    {
        PropertyOwnerPointer root =
            (PropertyOwnerPointer) NodePointer.newNodePointer(
                new QName(null, "root"),
                createContextBean(),
                Locale.getDefault());

        NodeIterator it;

        PropertyPointer start = null;

        if (useStartLocation) {
            start = root.getPropertyPointer();
            start.setPropertyIndex(
                relativeProperty(start, relativePropertyIndex));
            start.setIndex(offset);
        }
        it =
            root.childIterator(
                new NodeNameTest(new QName(null, "integers")),
                reverse,
                start);

        int size = 0;
        while (it.setPosition(it.getPosition() + 1)) {
            size++;
        }
        assertEquals(
            "ITERATIONS: Individual, relativePropertyIndex="
                + relativePropertyIndex
                + ", offset="
                + offset
                + ", useStartLocation="
                + useStartLocation
                + ", reverse="
                + reverse,
            expected,
            size);
    }

    /**
     * Test property iterators with multiple properties returned
     */
    

    private void testMultiple(
        int propertyIndex,
        int offset,
        boolean useStartLocation,
        boolean reverse,
        int expected) 
    {
        PropertyOwnerPointer root =
            (PropertyOwnerPointer) NodePointer.newNodePointer(
                new QName(null, "root"),
                createContextBean(),
                Locale.getDefault());
        NodeIterator it;

        PropertyPointer start = null;

        if (useStartLocation) {
            start = root.getPropertyPointer();
            start.setPropertyIndex(propertyIndex);
            start.setIndex(offset);
        }
        it = root.childIterator(null, reverse, start);

        int size = 0;
        while (it.setPosition(it.getPosition() + 1)) {
//            System.err.println("LOC: " + it.getCurrentNodePointer());
            size++;
        }
        assertEquals(
            "ITERATIONS: Multiple, propertyIndex="
                + propertyIndex
                + ", offset="
                + offset
                + ", useStartLocation="
                + useStartLocation
                + ", reverse="
                + reverse,
            expected,
            size);
    }

    private int relativeProperty(PropertyPointer holder, int offset) {
        String[] names = holder.getPropertyNames();
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("integers")) {
                return i + offset;
            }
        }
        return -1;
    }

    

    

    

    /**
     * Test contributed by Kate Dvortsova
     */
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    /**
     * Testing the pseudo-attribute "name" that java beans
     * objects appear to have.
     */
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
    
    

    

    
    
    
}
