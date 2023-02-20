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


public void testBooleanPredicate8() { 
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


public void testRelativeContextAbsolutePath11() { 
     JXPathContext relative = context.getRelativeContext(context.getPointer("nestedBean")); 
     assertXPathValueAndPointer(relative, "/integers[2]", new Integer(2), "/integers[2]"); 
 } 


public void testCreatePathAndSetValueCreateBeanExpandCollection13() { 
     context.setValue("nestedBean", null); 
     assertXPathCreatePathAndSetValue(context, "/nestedBean/strings[2]", "Test", "/nestedBean/strings[2]"); 
 } 


public void testAxisAncestor29() { 
     assertXPathValue(context, "int/ancestor::root = /", Boolean.TRUE); 
     assertXPathValue(context, "count(beans/name/ancestor-or-self::node())", new Double(5)); 
     assertXPathValue(context, "beans/name/ancestor-or-self::node()[3] = /", Boolean.TRUE); 
 } 


public void testAxisPrecedingSibling30() { 
     assertXPathValue(context, "count(/boolean/preceding-sibling::node())", new Double(2)); 
     assertXPathValue(context, "count(/nestedBean/int/../preceding-sibling::node())", new Double(12)); 
     assertXPathValue(context, "count(/descendant::int/preceding-sibling::node())", new Double(10)); 
 } 


public void testAxisSelf42() { 
     assertXPathValue(context, "self::node() = /", Boolean.TRUE); 
     assertXPathValue(context, "self::root = /", Boolean.TRUE); 
 } 


public void testAxisDescendant46() { 
     assertXPathValue(context, "count(descendant::node())", new Double(65)); 
     assertXPathValue(context, "count(descendant::root)", new Double(0)); 
     assertXPathValue(context, "count(descendant::name)", new Double(7)); 
 } 


public void testAxisDescendantOrSelf47() { 
     assertXPathValueIterator(context, "descendant-or-self::name", set("Name 1", "Name 2", "Name 3", "Name 6", "Name 0", "Name 5", "Name 4")); 
     assertXPathValueIterator(context, "//name", set("Name 1", "Name 2", "Name 3", "Name 6", "Name 0", "Name 5", "Name 4")); 
     assertXPathValue(context, "count(descendant-or-self::root)", new Double(1)); 
     assertXPathValue(context, "count(nestedBean//.)", new Double(7)); 
     assertXPathValue(context, "count(//self::beans)", new Double(2)); 
     assertXPathValue(context, "count(descendant-or-self::node())", new Double(66)); 
 } 


public void testRelativeContextParent49() { 
     JXPathContext relative = context.getRelativeContext(context.getPointer("nestedBean")); 
     assertXPathValueAndPointer(relative, "../integers[2]", new Integer(2), "/integers[2]"); 
 } 


public void testAxisParent52() { 
     assertXPathValue(context, "count(/beans/..)", new Double(1)); 
     assertXPathValue(context, "count(//..)", new Double(9)); 
     assertXPathValue(context, "count(//../..)", new Double(2)); 
     assertXPathValueIterator(context, "//parent::beans/name", list("Name 1", "Name 2")); 
 } 


public void testAxisAttribute55() { 
     assertXPathValue(context, "count(@*)", new Double(21.0)); 
     assertXPathValueLenient(context, "@foo", null); 
 } 


public void testAxisFollowing62() { 
     assertXPathValue(context, "count(nestedBean/strings[2]/following::node())", new Double(21)); 
     assertXPathValue(context, "count(nestedBean/strings[2]/following::strings)", new Double(7)); 
 } 


public void testAttributeLang72() { 
     assertXPathValue(context, "@xml:lang", "en-US"); 
     assertXPathValue(context, "count(@xml:*)", new Double(1)); 
     assertXPathValue(context, "lang('en')", Boolean.TRUE); 
     assertXPathValue(context, "lang('fr')", Boolean.FALSE); 
 } 


public void testIteratePropertyArrayWithoutHasNext73() { 
     JXPathContext context = JXPathContext.newContext(createContextBean()); 
     Iterator it = context.iteratePointers("/integers"); 
     List actual = new ArrayList(); 
     for (int i = 0; i < 4; i++) { 
         actual.add(it.next().toString()); 
     } 
     assertEquals("Iterating 'next'<" + "/integers" + ">", list("/integers[1]", "/integers[2]", "/integers[3]", "/integers[4]"), actual); 
 } 


public void testCreatePathExpandExistingCollectionAndSetProperty88() { 
     assertXPathCreatePath(context, "/beans[3]/int", new Integer(1), "/beans[3]/int"); 
 } 


public void testRemovePathPropertyValue99() { 
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


public void testDocumentOrder110() { 
     assertDocumentOrder(context, "boolean", "int", -1); 
     assertDocumentOrder(context, "integers[1]", "integers[2]", -1); 
     assertDocumentOrder(context, "integers[1]", "integers[1]", 0); 
     assertDocumentOrder(context, "nestedBean/int", "nestedBean", 1); 
     assertDocumentOrder(context, "nestedBean/int", "nestedBean/strings", -1); 
     assertDocumentOrder(context, "nestedBean/int", "object/int", -1); 
 } 


public void testCreatePathAndSetValueExpandNewCollection111() { 
     context.setValue("beans", null); 
     assertXPathCreatePathAndSetValue(context, "/beans[2]/int", new Integer(2), "/beans[2]/int"); 
 } 


public void testIterateAndSet117() { 
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


public void testRelativeContextInheritance119() { 
     context.setFunctions(new ClassFunctions(TestFunctions.class, "test")); 
     JXPathContext relative = context.getRelativeContext(context.getPointer("nestedBean")); 
     assertXPathValue(relative, "test:countPointers(strings)", new Integer(3)); 
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
