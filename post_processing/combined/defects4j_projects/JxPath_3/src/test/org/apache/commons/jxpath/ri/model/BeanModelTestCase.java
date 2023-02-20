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
public void testBooleanFunction18() { 
     assertXPathValue(context, "boolean(vendor//saleEnds[../@stores = 'all'])", Boolean.TRUE); 
     assertXPathValue(context, "boolean(vendor//promotion[../@stores = 'all'])", Boolean.TRUE); 
     assertXPathValue(context, "boolean(vendor//promotion[../@stores = 'some'])", Boolean.FALSE); 
 }
public void testLang20() { 
     assertXPathValue(context, "//product/prix/@xml:lang", "fr"); 
     assertXPathValue(context, "//product/prix[lang('fr')]", "934.99"); 
     assertXPathValue(context, "//product/price:sale[lang('en')]/saleEnds", "never"); 
 }
public void testAxisDescendant22() { 
     assertXPathValue(context, "count(descendant::node())", new Double(65)); 
     assertXPathValue(context, "count(descendant::name)", new Double(7)); 
 }
public void testAxisParent24() { 
     assertXPathValue(context, "count(/beans/..)", new Double(1)); 
     assertXPathValue(context, "count(//..)", new Double(9)); 
     assertXPathValue(context, "count(//../..)", new Double(2)); 
     assertXPathValueIterator(context, "//parent::beans/name", list("Name 1", "Name 2")); 
 }
public void testAxisDescendantOrSelf25() { 
     assertXPathValueIterator(context, "descendant-or-self::name", set("Name 1", "Name 2", "Name 3", "Name 6", "Name 0", "Name 5", "Name 4")); 
     assertXPathValueIterator(context, "//name", set("Name 1", "Name 2", "Name 3", "Name 6", "Name 0", "Name 5", "Name 4")); 
     assertXPathValue(context, "count(descendant-or-self::root)", new Double(1)); 
     assertXPathValue(context, "count(nestedBean//.)", new Double(7)); 
     assertXPathValue(context, "count(//self::beans)", new Double(2)); 
     assertXPathValue(context, "count(descendant-or-self::node())", new Double(66)); 
 }
public void testAxisDescendant26() { 
     assertXPathValue(context, "//Key1", "Value 1"); 
 }
public void testAxisFollowingSibling30() { 
     assertXPathValue(context, "count(nestedBean/strings[2]/following-sibling::node())", new Double(21)); 
     assertXPathValue(context, "count(nestedBean/strings[2]/following-sibling::node())", new Double(7)); 
 }
public void testAxisFollowingSibling31() { 
     assertXPathValue(context, "count(/boolean/following-sibling::node())", new Double(2)); 
     assertXPathValue(context, "count(/nestedBean/int/../following-sibling::node())", new Double(12)); 
     assertXPathValue(context, "count(/descendant::int/following-sibling::node())", new Double(10)); 
 }
public void testAxisPreceding32() { 
     assertXPathValue(context, "count(/boolean/preceding-sibling::node())", new Double(2)); 
     assertXPathValue(context, "count(/nestedBean/int/../preceding-sibling::node())", new Double(12)); 
     assertXPathValue(context, "count(/descendant::int/preceding-sibling::node())", new Double(10)); 
 }
public void testIteratePropertyArrayWithoutHasNext43() { 
     JXPathContext context = JXPathContext.newContext(createContextBean()); 
     Iterator it = context.iteratePointers("/integers"); 
     List actual = new ArrayList(); 
     for (int i = 0; i < 4; i++) { 
         actual.add(it.next().toString()); 
     } 
     assertEquals("Iterating 'next'<" + "/integers" + ">", list("/integers[1]", "/integers[2]", "/integers[3]", "/integers[4]"), actual); 
 }
public void testStaticMethodCall45() { 
     assertXPathValue(context, "string(test:build(8, 'goober'))", "foo=8; bar=goober"); 
     assertXPathValue(context, "string(jxpathtest:TestFunctions.build(8, 'goober'))", "foo=8; bar=goober"); 
     assertXPathValue(context, "string(" + TestFunctions.class.getName() + ".build(8, 'goober'))", "foo=8; bar=goober"); 
     assertXPathValue(context, "string(test:increment(8))", "9"); 
     assertXPathValue(context, "test:string(/beans/name)", "Name 1"); 
 }
public void testAxisAncestor46() { 
     assertXPathValue(context, "int/ancestor::root = /", Boolean.TRUE); 
     assertXPathValue(context, "count(beans/name/ancestor-or-self::node())", new Double(5)); 
     assertXPathValue(context, "beans/name/ancestor-or-self::node()[3] = /", Boolean.TRUE); 
 }
public void testCreatePathAndSetValueDeclVarSetCollectionElementProperty47() { 
     assertXPathCreatePathAndSetValue(context, "$testArray[2]/boolean", Boolean.TRUE, "$testArray[2]/boolean"); 
 }
public void testRemovePath57() { 
     context.removePath("nestedBean/int"); 
     assertEquals("Remove property value", new Integer(0), context.getValue("nestedBean/int")); 
 }
public void testAxisSelf58() { 
     assertXPathValue(context, "self::node() = /", Boolean.TRUE); 
     assertXPathValue(context, "self::root = /", Boolean.TRUE); 
 }
public void testAllocation62() { 
     assertXPathValue(context, "string(test:new())", "foo=0; bar=null"); 
     assertXPathValue(context, "string(jxpathtest:TestFunctions.new())", "foo=0; bar=null"); 
     assertXPathValue(context, "string(" + TestFunctions.class.getName() + ".new())", "foo=0; bar=null"); 
     assertXPathValue(context, "string(test:new(3, 'baz'))", "foo=3; bar=baz"); 
     assertXPathValue(context, "string(test:new('3', 4))", "foo=3; bar=4.0"); 
     context.getVariables().declareVariable("A", "baz"); 
     assertXPathValue(context, "string(test:new(2, $A, false))", "foo=2; bar=baz"); 
 }
public void testPrecedingSibling64() { 
     assertXPathValue(context, "count(/boolean/preceding-sibling::node())", new Double(2)); 
     assertXPathValue(context, "count(/nestedBean/int/../preceding-sibling::node())", new Double(12)); 
     assertXPathValue(context, "count(/descendant::int/preceding-sibling::node())", new Double(10)); 
 }
public void testAxisFollowing65() { 
     assertXPathValueIterator(context, "vendor/contact/following::location//street", list("Orchard Road", "Tangerine Drive")); 
     assertXPathValue(context, "//location/following::price:sale/saleEnds", "never"); 
 }
public void testRemovePathCollectionElement68() { 
     context.getVariables().declareVariable("temp", list("temp1", "temp2")); 
     context.removePath("$temp[1]"); 
     assertEquals("Remove collection element", "temp2", context.getValue("$temp[1]")); 
 }
public void testAxisPrecedingSibling70() { 
     assertXPathValue(context, "count(/boolean/preceding-sibling::node())", new Double(2)); 
     assertXPathValue(context, "count(/nestedBean/int/../preceding-sibling::node())", new Double(12)); 
     assertXPathValue(context, "count(/descendant::int/preceding-sibling::node())", new Double(10)); 
 }
public void testRelativeContextAbsolutePath76() { 
     JXPathContext relative = context.getRelativeContext(context.getPointer("nestedBean")); 
     assertXPathValueAndPointer(relative, "/integers[2]", new Integer(2), "/integers[2]"); 
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
