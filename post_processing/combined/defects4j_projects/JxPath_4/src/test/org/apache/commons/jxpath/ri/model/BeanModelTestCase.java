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
public void testAxisAncestor21() { 
     assertXPathValue(context, "int/ancestor::root = /", Boolean.TRUE); 
     assertXPathValue(context, "count(beans/name/ancestor-or-self::node())", new Double(5)); 
     assertXPathValue(context, "beans/name/ancestor-or-self::node()[3] = /", Boolean.TRUE); 
 }
public void testAxisPrecedingSibling29() { 
     assertXPathValue(context, "vendor/location[.//employeeCount = 10]/" + "following-sibling::location//street", "Tangerine Drive"); 
     assertXPathPointer(context, "vendor/location[.//employeeCount = 10]/" + "following-sibling::location//street", "/vendor[1]/location[2]/address[1]/street[1]"); 
 }
public void testAxisPrecedingSibling36() { 
     assertXPathValue(context, "count(/beans/following-sibling::node())", new Double(8)); 
     assertXPathValue(context, "count(/beans/following-sibling::object)", new Double(1)); 
     assertXPathValue(context, "count(/beans/boolean/../following-sibling::node())", new Double(8)); 
     assertXPathValue(context, "count(/beans/boolean/../following-sibling::object)", new Double(1)); 
     assertXPathValue(context, "count(/descendant::boolean/following-sibling::node())", new Double(53)); 
     assertXPathValue(context, "count(/descendant::boolean/following-sibling::name)", new Double(7)); 
 }
public void testIterateAndSet51() { 
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
public void testAxisPreceding62() { 
     assertXPathValue(context, "count(beans[2]/int/preceding::node())", new Double(8)); 
     assertXPathValue(context, "count(beans[2]/int/preceding::boolean)", new Double(2)); 
 }
public void testCreatePathAndSetValueExpandNewCollection65() { 
     context.setValue("beans", null); 
     assertXPathCreatePathAndSetValue(context, "/beans[2]/int", new Integer(2), "/beans[2]/int"); 
 }
public void testRelativeContextSelf89() { 
     JXPathContext relative = context.getRelativeContext(context.getPointer("nestedBean")); 
     assertXPathValueAndPointer(relative, "../integers[2]", new Integer(2), "/integers[2]"); 
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
