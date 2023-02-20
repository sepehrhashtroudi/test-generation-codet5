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

import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.IdentityManager;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.xml.DocumentContainer;

/**
 * Abstract superclass for pure XPath 1.0.  Subclasses
 * apply the same XPaths to contexts using different models:
 * DOM, JDOM etc.
 *
 * @author Dmitri Plotnikov
 * @version $Revision$ $Date$
 */

public abstract class XMLModelTestCase extends JXPathTestCase {
    protected JXPathContext context;

    /**
     * Construct a new instance of this test case.
     *
     * @param name Name of the test case
     */
    public XMLModelTestCase(String name) {
        super(name);
    }

    public void setUp() {
        if (context == null) {
            DocumentContainer docCtr = createDocumentContainer();
            context = createContext();
            Variables vars = context.getVariables();
            vars.declareVariable("document", docCtr.getValue());
            vars.declareVariable("container", docCtr);
            vars.declareVariable(
                "element",
                context.getPointer("vendor/location/address/street").getNode());
        }
    }

    protected abstract String getModel();

    protected DocumentContainer createDocumentContainer() {
        return new DocumentContainer(
                JXPathTestCase.class.getResource("Vendor.xml"),
                getModel());
    }
    
    protected abstract AbstractFactory getAbstractFactory();
        
    protected JXPathContext createContext() {
        JXPathContext context =
            JXPathContext.newContext(createDocumentContainer());
        context.setFactory(getAbstractFactory());
        context.registerNamespace("product", "productNS");
        return context;
    }

    /**
     * An XML signature is used to determine if we have the right result
     * after a modification of XML by JXPath.  It is basically a piece
     * of simplified XML.
     */
    protected abstract String getXMLSignature(
        Object node,
        boolean elements,
        boolean attributes,
        boolean text,
        boolean pi);

    protected void assertXMLSignature(
        JXPathContext context,
        String path,
        String signature,
        boolean elements,
        boolean attributes,
        boolean text,
        boolean pi) 
    {
        Object node = context.getPointer(path).getNode();
        String sig = getXMLSignature(node, elements, attributes, text, pi);
        assertEquals("XML Signature mismatch: ", signature, sig);
    }

    // ------------------------------------------------ Individual Test Methods

public void testDocument8() { 
     assertXPathValue(context, "$document/vendor/location[1]//street", "Orchard Road"); 
     assertXPathPointer(context, "$document/vendor/location[1]//street", "$document/vendor[1]/location[1]/address[1]/street[1]"); 
     assertXPathValue(context, "$document/vendor//street", "Orchard Road"); 
 }
public void testAxisParent10() { 
     assertXPathPointer(context, "//street/..", "/vendor[1]/location[1]/address[1]"); 
     assertXPathPointerIterator(context, "//street/..", list("/vendor[1]/location[2]/address[1]", "/vendor[1]/location[1]/address[1]")); 
     assertXPathValue(context, "vendor/product/price:sale/saleEnds/parent::price:*" + "/saleEnds", "never"); 
 }
public void testNodeTypeComment12() { 
     assertXPathValue(context, "//product/comment()", "We are not buying this product, ever"); 
 }
public void testNodeTypeText13() { 
     assertXPathValue(context, "//product/text()[. != '']", "We love this product."); 
     assertXPathPointer(context, "//product/text()", "/vendor[1]/product[1]/text()[1]"); 
 }
public void testRemovePath14() { 
     context.removePath("vendor/location[@id = '101']//street/text()"); 
     assertEquals("Remove DOM text", "", context.getValue("vendor/location[@id = '101']//street")); 
     context.removePath("vendor/location[@id = '101']//street"); 
     assertEquals("Remove DOM element", new Double(0), context.getValue("count(vendor/location[@id = '101']//street)")); 
     context.removePath("vendor/location[@id = '100']/@name"); 
     assertEquals("Remove DOM attribute", new Double(0), context.getValue("count(vendor/location[@id = '100']/@name)")); 
 }
public void testCreatePath15() { 
     assertXPathCreatePath(context, "/vendor[1]/location[3]", "", "/vendor[1]/location[3]"); 
     assertXPathCreatePath(context, "/vendor[1]/location[3]/address/street", "", "/vendor[1]/location[3]/address[1]/street[1]"); 
     assertXPathCreatePath(context, "/vendor[1]/location[2]/@manager", "", "/vendor[1]/location[2]/@manager"); 
     assertXPathCreatePath(context, "/vendor[1]/location[1]/@name", "local", "/vendor[1]/location[1]/@name"); 
     assertXPathCreatePathAndSetValue(context, "/vendor[1]/location[4]/@manager", "", "/vendor[1]/location[4]/@manager"); 
     context.registerNamespace("price", "priceNS"); 
     assertXPathCreatePath(context, "/vendor[1]/price:foo/price:bar", "", "/vendor[1]/price:foo[1]/price:bar[1]"); 
 }
public void testBooleanFunction16() { 
     assertXPathValue(context, "boolean(vendor//saleEnds[../@stores = 'all'])", Boolean.TRUE); 
     assertXPathValue(context, "boolean(vendor//promotion[../@stores = 'all'])", Boolean.TRUE); 
     assertXPathValue(context, "boolean(vendor//promotion[../@stores = 'some'])", Boolean.FALSE); 
 }
public void testAxisSelf25() { 
     assertXPathValue(context, "//price:sale/self::price:sale/saleEnds", "never"); 
     assertXPathValueLenient(context, "//price:sale/self::x/saleEnds", null); 
 }
public void testUnion28() { 
     assertXPathValueIterator(context, "integers | beans[1]/strings", list("String 1", "String 2", "String 3", new Integer(1), new Integer(2), new Integer(3), new Integer(4))); 
     assertXPathValue(context, "count((integers | beans[1]/strings)[contains(., '1')])", new Double(2)); 
     assertXPathValue(context, "count((integers | beans[1]/strings)[name(.) = 'strings'])", new Double(3)); 
     assertXPathValue(context, "(integers)[2]", new Integer(2)); 
 }
public void testContainer33() { 
     assertXPathValue(context, "$container/vendor//street", "Orchard Road"); 
     assertXPathValue(context, "$container//street", "Orchard Road"); 
     assertXPathPointer(context, "$container//street", "$container/vendor[1]/location[1]/address[1]/street[1]"); 
     assertXPathValue(context, "number(vendor/location/employeeCount)", new Double(10)); 
 }
public void testRelativeContextAbsolutePath34() { 
     JXPathContext relative = context.getRelativeContext(context.getPointer("nestedBean")); 
     assertXPathValueAndPointer(relative, "/integers[2]", new Integer(2), "/integers[2]"); 
 }
public void testBeanPrimitive35() { 
     assertXPathValueAndPointer(context, "string", "string", "/string"); 
 }
public void testAxisDescendantOrSelf37() { 
     assertXPathValueIterator(context, "descendant-or-self::name", set("Name 1", "Name 2", "Name 3", "Name 6", "Name 0", "Name 5", "Name 4")); 
     assertXPathValueIterator(context, "//name", set("Name 1", "Name 2", "Name 3", "Name 6", "Name 0", "Name 5", "Name 4")); 
     assertXPathValue(context, "count(descendant-or-self::root)", new Double(1)); 
     assertXPathValue(context, "count(nestedBean//.)", new Double(7)); 
     assertXPathValue(context, "count(//self::beans)", new Double(2)); 
     assertXPathValue(context, "count(descendant-or-self::node())", new Double(66)); 
 }
public void testAxisFollowingSibling38() { 
     assertXPathValue(context, "vendor/location[.//employeeCount = 10]/" + "following-sibling::location//street", "Tangerine Drive"); 
     assertXPathPointer(context, "vendor/location[.//employeeCount = 10]/" + "following-sibling::location//street", "/vendor[1]/location[2]/address[1]/street[1]"); 
 }
public void testAxisPreceding39() { 
     assertXPathValue(context, "count(beans[2]/int/preceding::node())", new Double(8)); 
     assertXPathValue(context, "count(beans[2]/int/preceding::boolean)", new Double(2)); 
 }
public void testAxisNamespace40() { 
     assertXPathValueAndPointer(context, "vendor/product/prix/namespace::price", "priceNS", "/vendor[1]/product[1]/prix[1]/namespace::price"); 
     assertXPathValue(context, "count(vendor/product/namespace::*)", new Double(3)); 
     assertXPathValue(context, "name(vendor/product/prix/namespace::price)", "price"); 
     assertXPathValue(context, "local-name(vendor/product/prix/namespace::price)", "price"); 
 }
public void testAxisParent41() { 
     assertXPathValue(context, "count(/beans/..)", new Double(1)); 
     assertXPathValue(context, "count(//..)", new Double(9)); 
     assertXPathValue(context, "count(//../..)", new Double(2)); 
     assertXPathValueIterator(context, "//parent::beans/name", list("Name 1", "Name 2")); 
 }
public void testCreatePathAndSetValueCreateBeanExpandCollection44() { 
     context.setValue("nestedBean", null); 
     assertXPathCreatePathAndSetValue(context, "/nestedBean/strings[2]", "Test", "/nestedBean/strings[2]"); 
 }
public void testRemovePathBeanValue62() { 
     context.removePath("nestedBean"); 
     assertEquals("Remove collection element", null, context.getValue("nestedBean")); 
 }
    
    

    

    /**
     * Test JXPathContext.createPath() with various arguments
     */
    

    /**
     * Test JXPath.createPathAndSetValue() with various arguments
     */
    

    /**
     * Test JXPathContext.removePath() with various arguments
     */
    

    

    
    
    

    

    
    
//    public void testAxisDescendantDocumentOrder() {
//        Iterator iter = context.iteratePointers("//*");
//        while (iter.hasNext()) {
//            System.err.println(iter.next());
//        }
//    }

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
    
    

    
}
