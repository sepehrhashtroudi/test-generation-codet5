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
public void testExpressionContext2() { 
     assertXPathValue(context, "//.[test:isMap()]/Key1", "Value 1"); 
     assertXPathValue(context, "count(//.[test:count(strings) = 3])", new Double(7)); 
     assertXPathValue(context, "test:count(//strings)", new Integer(21)); 
     assertXPathValue(context, "test:countPointers(//strings)", new Integer(21)); 
     assertXPathValue(context, "/beans[contains(test:path(), '[2]')]/name", "Name 2"); 
 }
public void testCreatePath4() { 
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
public void testCreatePathExpandExistingCollection17() { 
     assertXPathCreatePathAndSetValue(context, "/integers[5]", new Integer(3), "/integers[5]"); 
 }
public void testAxisFollowingSibling18() { 
     assertXPathValue(context, "count(/nestedBean/following-sibling::node())", new Double(8)); 
     assertXPathValue(context, "count(/nestedBean/following-sibling::object)", new Double(1)); 
     assertXPathValue(context, "count(/nestedBean/boolean/../following-sibling::node())", new Double(8)); 
     assertXPathValue(context, "count(/nestedBean/boolean/../following-sibling::object)", new Double(1)); 
     assertXPathValue(context, "count(/descendant::boolean/following-sibling::node())", new Double(53)); 
     assertXPathValue(context, "count(/descendant::boolean/following-sibling::name)", new Double(7)); 
 }
public void testAxisPrecedingSibling19() { 
     assertXPathValue(context, "count(/boolean/preceding-sibling::node())", new Double(2)); 
     assertXPathValue(context, "count(/nestedBean/int/../preceding-sibling::node())", new Double(12)); 
     assertXPathValue(context, "count(/descendant::int/preceding-sibling::node())", new Double(10)); 
 }
public void testAxisChild27() { 
     assertXPathValue(context, "boolean", Boolean.FALSE); 
     assertXPathPointer(context, "boolean", "/boolean"); 
     assertXPathPointerIterator(context, "boolean", list("/boolean")); 
     assertXPathValue(context, "count(set)", new Double(3)); 
     assertXPathValueIterator(context, "foo:boolean", list()); 
     assertXPathValue(context, "count(*)", new Double(21)); 
     assertXPathValue(context, "count(child::node())", new Double(21)); 
 }
public void testDocumentOrder65() { 
     assertDocumentOrder(context, "boolean", "int", -1); 
     assertDocumentOrder(context, "integers[1]", "integers[2]", -1); 
     assertDocumentOrder(context, "integers[1]", "integers[1]", 0); 
     assertDocumentOrder(context, "nestedBean/int", "nestedBean", 1); 
     assertDocumentOrder(context, "nestedBean/int", "nestedBean/strings", -1); 
     assertDocumentOrder(context, "nestedBean/int", "object/int", -1); 
 }
public void testAttributeLang67() { 
     assertXPathValue(context, "@xml:lang", "en-US"); 
     assertXPathValue(context, "count(@xml:*)", new Double(1)); 
     assertXPathValue(context, "lang('en')", Boolean.TRUE); 
     assertXPathValue(context, "lang('fr')", Boolean.FALSE); 
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
