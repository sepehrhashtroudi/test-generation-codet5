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
public void testRemovePathBeanValue5() { 
     context.removePath("nestedBean"); 
     assertEquals("Remove collection element", null, context.getValue("nestedBean")); 
 }
public void testCollectionMethodCall37() { 
     List list = new ArrayList(); 
     list.add("foo"); 
     context.getVariables().declareVariable("myList", list); 
     assertXPathValue(context, "size($myList)", new Integer(1)); 
     assertXPathValue(context, "size(beans)", new Integer(2)); 
     context.getValue("add($myList, 'hello')"); 
     assertEquals("After adding an element", 2, list.size()); 
     JXPathContext context = JXPathContext.newContext(new ArrayList()); 
     assertEquals("Extension function on root collection", "0", String.valueOf(context.getValue("size(/)"))); 
 }
public void testExpressionContext42() { 
     assertXPathValue(context, "//.[test:isMap()]/Key1", "Value 1"); 
     assertXPathValue(context, "count(//.[test:count(strings) = 3])", new Double(7)); 
     assertXPathValue(context, "test:count(//strings)", new Integer(21)); 
     assertXPathValue(context, "test:countPointers(//strings)", new Integer(21)); 
     assertXPathValue(context, "/beans[contains(test:path(), '[2]')]/name", "Name 2"); 
 }
public void testNamespaceMapping72() { 
     context.registerNamespace("rate", "priceNS"); 
     context.registerNamespace("goods", "productNS"); 
     assertEquals("Context node namespace resolution", "priceNS", context.getNamespaceURI("price")); 
     assertEquals("Registered namespace resolution", "priceNS", context.getNamespaceURI("rate")); 
     assertXPathValue(context, "count(vendor/product/rate:*)", new Double(2)); 
     assertXPathValueAndPointer(context, "//product:name", "Box of oranges", "/vendor[1]/product[1]/goods:name[1]"); 
     JXPathContext childCtx = JXPathContext.newContext(context, context.getContextBean()); 
     assertXPathValueAndPointer(childCtx, "//product:name", "Box of oranges", "/vendor[1]/product[1]/goods:name[1]"); 
     JXPathContext relativeCtx = context.getRelativeContext(context.getPointer("/vendor")); 
     assertXPathValueAndPointer(relativeCtx, "product/product:name", "Box of oranges", "/vendor[1]/product[1]/goods:name[1]"); 
 }
public void testIterateAndSet73() { 
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
public void testAxisAttribute79() { 
     assertXPathValue(context, "count(@*)", new Double(21.0)); 
     assertXPathValueLenient(context, "@foo", null); 
 }
public void testRelativeContextRelativePath90() { 
     JXPathContext relative = context.getRelativeContext(context.getPointer("nestedBean")); 
     assertXPathValueAndPointer(relative, "int", new Integer(1), "/nestedBean/int"); 
 }
public void testInvalidVariableName91() { 
     boolean exception = false; 
     try { 
         context.getValue("$none"); 
     } catch (Exception ex) { 
         exception = true; 
     } 
     assertTrue("Evaluating '$none', expected exception - did not get it", exception); 
     exception = false; 
     try { 
         context.setValue("$none", new Integer(1)); 
     } catch (Exception ex) { 
         exception = true; 
     } 
     assertTrue("Setting '$none = 1', expected exception - did not get it", exception); 
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
