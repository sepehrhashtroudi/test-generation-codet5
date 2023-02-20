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
public void testAxisFollowingSibling11() { 
     assertXPathValue(context, "count(/nestedBean/following-sibling::node())", new Double(8)); 
     assertXPathValue(context, "count(/nestedBean/following-sibling::object)", new Double(1)); 
     assertXPathValue(context, "count(/nestedBean/boolean/../following-sibling::node())", new Double(8)); 
     assertXPathValue(context, "count(/nestedBean/boolean/../following-sibling::object)", new Double(1)); 
     assertXPathValue(context, "count(/descendant::boolean/following-sibling::node())", new Double(53)); 
     assertXPathValue(context, "count(/descendant::boolean/following-sibling::name)", new Double(7)); 
 }
public void testAxisSelf25() { 
     assertXPathValue(context, "//price:sale/self::price:sale/saleEnds", "never"); 
     assertXPathValueLenient(context, "//price:sale/self::x/saleEnds", null); 
 }
public void testAxisAncestor36() { 
     assertXPathValue(context, "int/ancestor::root = /", Boolean.TRUE); 
     assertXPathValue(context, "count(beans/name/ancestor-or-self::node())", new Double(5)); 
     assertXPathValue(context, "beans/name/ancestor-or-self::node()[3] = /", Boolean.TRUE); 
 }
public void testCreatePathAndSetValue44() { 
     assertXPathCreatePathAndSetValue(context, "vendor/location[3]", "", "/vendor[1]/location[3]"); 
     assertXPathCreatePathAndSetValue(context, "vendor/location[3]/address/street", "Lemon Circle", "/vendor[1]/location[3]/address[1]/street[1]"); 
     assertXPathCreatePathAndSetValue(context, "vendor/location[2]/@manager", "John Doe", "/vendor[1]/location[2]/@manager"); 
     assertXPathCreatePathAndSetValue(context, "vendor/location[1]/@manager", "John Doe", "/vendor[1]/location[1]/@manager"); 
     assertXPathCreatePathAndSetValue(context, "/vendor[1]/location[4]/@manager", "James Dow", "/vendor[1]/location[4]/@manager"); 
     assertXPathCreatePathAndSetValue(context, "vendor/product/product:name/attribute::price:language", "English", "/vendor[1]/product[1]/product:name[1]/@price:language"); 
     context.registerNamespace("price", "priceNS"); 
     assertXPathCreatePathAndSetValue(context, "/vendor[1]/price:foo/price:bar", "123.20", "/vendor[1]/price:foo[1]/price:bar[1]"); 
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
