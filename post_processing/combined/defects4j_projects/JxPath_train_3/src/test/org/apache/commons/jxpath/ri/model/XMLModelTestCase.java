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


public void testLang5() { 
     assertXPathValue(context, "//product/prix/@xml:lang", "fr"); 
     assertXPathValue(context, "//product/prix[lang('fr')]", "934.99"); 
     assertXPathValue(context, "//product/price:sale[lang('en')]/saleEnds", "never"); 
 } 


public void testAxisAttribute7() { 
     assertXPathValue(context, "vendor/location/@id", "100"); 
     assertXPathPointer(context, "vendor/location/@id", "/vendor[1]/location[1]/@id"); 
     assertXPathValueIterator(context, "vendor/location/@id", list("100", "101")); 
     assertXPathValue(context, "vendor/product/price:amount/@price:discount", "10%"); 
     assertXPathValue(context, "namespace-uri(vendor/product/price:amount/@price:discount)", "priceNS"); 
     assertXPathValue(context, "local-name(vendor/product/price:amount/@price:discount)", "discount"); 
     assertXPathValue(context, "name(vendor/product/price:amount/@price:discount)", "price:discount"); 
     assertXPathValue(context, "vendor/product/price:amount/@discount", "20%"); 
     assertXPathValue(context, "namespace-uri(vendor/product/price:amount/@discount)", ""); 
     assertXPathValue(context, "local-name(vendor/product/price:amount/@discount)", "discount"); 
     assertXPathValue(context, "name(vendor/product/price:amount/@discount)", "discount"); 
     assertXPathValueIterator(context, "vendor/product/price:amount/@price:*", list("10%")); 
     assertXPathValueIterator(context, "vendor/location[1]/@*", set("100", "", "local")); 
     assertXPathValueIterator(context, "vendor/product/price:amount/@*", list("20%")); 
     assertXPathValue(context, "vendor/location/@manager", ""); 
     assertXPathValueLenient(context, "vendor/location/@missing", null); 
     assertXPathValueLenient(context, "vendor/location/@miss:missing", null); 
     assertXPathValue(context, "vendor/location[@id='101']//street", "Tangerine Drive"); 
     assertXPathValueIterator(context, "/vendor/location[1]/@*[name()!= 'manager']", list("100", "local")); 
 } 


public void testCreatePathAndSetValue9() { 
     assertXPathCreatePathAndSetValue(context, "vendor/location[3]", "", "/vendor[1]/location[3]"); 
     assertXPathCreatePathAndSetValue(context, "vendor/location[3]/address/street", "Lemon Circle", "/vendor[1]/location[3]/address[1]/street[1]"); 
     assertXPathCreatePathAndSetValue(context, "vendor/location[2]/@manager", "John Doe", "/vendor[1]/location[2]/@manager"); 
     assertXPathCreatePathAndSetValue(context, "vendor/location[1]/@manager", "John Doe", "/vendor[1]/location[1]/@manager"); 
     assertXPathCreatePathAndSetValue(context, "/vendor[1]/location[4]/@manager", "James Dow", "/vendor[1]/location[4]/@manager"); 
     assertXPathCreatePathAndSetValue(context, "vendor/product/product:name/attribute::price:language", "English", "/vendor[1]/product[1]/product:name[1]/@price:language"); 
     context.registerNamespace("price", "priceNS"); 
     assertXPathCreatePathAndSetValue(context, "/vendor[1]/price:foo/price:bar", "123.20", "/vendor[1]/price:foo[1]/price:bar[1]"); 
 } 


public void testDocument15() { 
     assertXPathValue(context, "$document/vendor/location[1]//street", "Orchard Road"); 
     assertXPathPointer(context, "$document/vendor/location[1]//street", "$document/vendor[1]/location[1]/address[1]/street[1]"); 
     assertXPathValue(context, "$document/vendor//street", "Orchard Road"); 
 } 


public void testNamespaceMapping18() { 
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


public void testCreatePath19() { 
     assertXPathCreatePath(context, "/vendor[1]/location[3]", "", "/vendor[1]/location[3]"); 
     assertXPathCreatePath(context, "/vendor[1]/location[3]/address/street", "", "/vendor[1]/location[3]/address[1]/street[1]"); 
     assertXPathCreatePath(context, "/vendor[1]/location[2]/@manager", "", "/vendor[1]/location[2]/@manager"); 
     assertXPathCreatePath(context, "/vendor[1]/location[1]/@name", "local", "/vendor[1]/location[1]/@name"); 
     assertXPathCreatePathAndSetValue(context, "/vendor[1]/location[4]/@manager", "", "/vendor[1]/location[4]/@manager"); 
     context.registerNamespace("price", "priceNS"); 
     assertXPathCreatePath(context, "/vendor[1]/price:foo/price:bar", "", "/vendor[1]/price:foo[1]/price:bar[1]"); 
 } 


public void testAxisParent20() { 
     assertXPathPointer(context, "//street/..", "/vendor[1]/location[1]/address[1]"); 
     assertXPathPointerIterator(context, "//street/..", list("/vendor[1]/location[2]/address[1]", "/vendor[1]/location[1]/address[1]")); 
     assertXPathValue(context, "vendor/product/price:sale/saleEnds/parent::price:*" + "/saleEnds", "never"); 
 } 


public void testAxisFollowing21() { 
     assertXPathValueIterator(context, "vendor/contact/following::location//street", list("Orchard Road", "Tangerine Drive")); 
     assertXPathValue(context, "//location/following::price:sale/saleEnds", "never"); 
 } 


public void testNodeTypeProcessingInstruction22() { 
     assertXPathValue(context, "//product/processing-instruction()", "do not show anybody"); 
     assertXPathValue(context, "//product/processing-instruction('report')", "average only"); 
     assertXPathPointer(context, "//product/processing-instruction('report')", "/vendor[1]/product[1]/processing-instruction('report')[1]"); 
     assertXPathValue(context, "name(//product/processing-instruction()[1])", "security"); 
 } 


public void testNodeTypeComment23() { 
     assertXPathValue(context, "//product/comment()", "We are not buying this product, ever"); 
 } 


public void testNodeTypeText24() { 
     assertXPathValue(context, "//product/text()[. != '']", "We love this product."); 
     assertXPathPointer(context, "//product/text()", "/vendor[1]/product[1]/text()[1]"); 
 } 


public void testSetValue25() { 
     assertXPathSetValue(context, "vendor/location[@id = '100']", "New Text"); 
     assertXMLSignature(context, "vendor/location[@id = '100']", "<E>New Text</E>", false, false, true, false); 
     assertXPathSetValue(context, "vendor/location[@id = '101']", "Replacement Text"); 
     assertXMLSignature(context, "vendor/location[@id = '101']", "<E>Replacement Text</E>", false, false, true, false); 
 } 


public void testRemovePath26() { 
     context.removePath("vendor/location[@id = '101']//street/text()"); 
     assertEquals("Remove DOM text", "", context.getValue("vendor/location[@id = '101']//street")); 
     context.removePath("vendor/location[@id = '101']//street"); 
     assertEquals("Remove DOM element", new Double(0), context.getValue("count(vendor/location[@id = '101']//street)")); 
     context.removePath("vendor/location[@id = '100']/@name"); 
     assertEquals("Remove DOM attribute", new Double(0), context.getValue("count(vendor/location[@id = '100']/@name)")); 
 } 


public void testDefaultNamespaceIgnored27() { 
     context.registerDefaultNamespace("temp"); 
     assertXPathValueAndPointer(context, "//pos//number", "110", "/node()[1]/pos[2]/register[1]/number[1]"); 
     context.registerDefaultNamespace(null); 
 } 


public void testDocumentOrder33() { 
     assertDocumentOrder(context, "vendor/location", "vendor/location/address/street", -1); 
     assertDocumentOrder(context, "vendor/location[@id = '100']", "vendor/location[@id = '101']", -1); 
     assertDocumentOrder(context, "vendor//price:amount", "vendor/location", 1); 
 } 


public void testBooleanFunction39() { 
     assertXPathValue(context, "boolean(vendor//saleEnds[../@stores = 'all'])", Boolean.TRUE); 
     assertXPathValue(context, "boolean(vendor//promotion[../@stores = 'all'])", Boolean.TRUE); 
     assertXPathValue(context, "boolean(vendor//promotion[../@stores = 'some'])", Boolean.FALSE); 
 } 


public void testAxisFollowingSibling48() { 
     assertXPathValue(context, "vendor/location[.//employeeCount = 10]/" + "following-sibling::location//street", "Tangerine Drive"); 
     assertXPathPointer(context, "vendor/location[.//employeeCount = 10]/" + "following-sibling::location//street", "/vendor[1]/location[2]/address[1]/street[1]"); 
 } 


public void testAxisSelf51() { 
     assertXPathValue(context, "//price:sale/self::price:sale/saleEnds", "never"); 
     assertXPathValueLenient(context, "//price:sale/self::x/saleEnds", null); 
 } 


public void testAxisAncestor53() { 
     assertXPathValue(context, "vendor/product/price:sale/saleEnds/" + "ancestor::price:sale/saleEnds", "never"); 
     assertXPathValue(context, "vendor/product/price:sale/saleEnds/ancestor::price:*" + "/saleEnds", "never"); 
 } 


public void testTypeConversions78() { 
     assertXPathValue(context, "vendor/location/employeeCount + 1", new Double(11)); 
     assertXPathValue(context, "vendor/location/employeeCount and true()", Boolean.TRUE); 
 } 


public void testID109() { 
     context.setIdentityManager(new IdentityManager() { 
  
         public Pointer getPointerByID(JXPathContext context, String id) { 
             NodePointer ptr = (NodePointer) context.getPointer("/"); 
             ptr = ptr.getValuePointer(); 
             return ptr.getPointerByID(context, id); 
         } 
     }); 
     assertXPathValueAndPointer(context, "id(101)//street", "Tangerine Drive", "id('101')/address[1]/street[1]"); 
     assertXPathPointerLenient(context, "id(105)/address/street", "id(105)/address/street"); 
 } 


public void testAxisAncestorOrSelf122() { 
     assertXPathValue(context, "vendor/product/price:sale/" + "ancestor-or-self::price:sale/saleEnds", "never"); 
 } 


public void testAxisDescendant127() { 
     assertXPathValue(context, "//street", "Orchard Road"); 
     assertXPathValue(context, "count(//price:*)", new Double(2)); 
     assertXPathValueIterator(context, "vendor//saleEnds", list("never")); 
     assertXPathValueIterator(context, "vendor//promotion", list("")); 
     assertXPathValueIterator(context, "vendor//saleEnds[../@stores = 'all']", list("never")); 
     assertXPathValueIterator(context, "vendor//promotion[../@stores = 'all']", list("")); 
 } 


public void testElementInVariable131() { 
     assertXPathValue(context, "$element", "Orchard Road"); 
 } 


public void testFunctionsLastAndPosition135() { 
     assertXPathPointer(context, "vendor//location[last()]", "/vendor[1]/location[2]"); 
 } 


public void testAxisPrecedingSibling136() { 
     assertXPathPointer(context, "//location[2]/preceding-sibling::location//street", "/vendor[1]/location[1]/address[1]/street[1]"); 
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
