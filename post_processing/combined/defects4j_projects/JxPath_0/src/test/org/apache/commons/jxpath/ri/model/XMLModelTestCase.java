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

public void testAxisNamespace3() { 
     assertXPathValueAndPointer(context, "vendor/product/prix/namespace::price", "priceNS", "/vendor[1]/product[1]/prix[1]/namespace::price"); 
     assertXPathValue(context, "count(vendor/product/namespace::*)", new Double(3)); 
     assertXPathValue(context, "name(vendor/product/prix/namespace::price)", "price"); 
     assertXPathValue(context, "local-name(vendor/product/prix/namespace::price)", "price"); 
 }
public void testNodeTypeProcessingInstruction6() { 
     assertXPathValue(context, "//product/processing-instruction()", "do not show anybody"); 
     assertXPathValue(context, "//product/processing-instruction('report')", "average only"); 
     assertXPathPointer(context, "//product/processing-instruction('report')", "/vendor[1]/product[1]/processing-instruction('report')[1]"); 
     assertXPathValue(context, "name(//product/processing-instruction()[1])", "security"); 
 }
public void testDocument8() { 
     assertXPathValue(context, "$document/vendor/location[1]//street", "Orchard Road"); 
     assertXPathPointer(context, "$document/vendor/location[1]//street", "$document/vendor[1]/location[1]/address[1]/street[1]"); 
     assertXPathValue(context, "$document/vendor//street", "Orchard Road"); 
 }
public void testLang10() { 
     assertXPathValue(context, "//product/prix/@xml:lang", "fr"); 
     assertXPathValue(context, "//product/prix[lang('fr')]", "934.99"); 
     assertXPathValue(context, "//product/price:sale[lang('en')]/saleEnds", "never"); 
 }
public void testCreatePathExpandCollection11() { 
     context.getVariables().declareVariable("array", new String[] { "Value1" }); 
     assertXPathCreatePath(context, "$array[2]", "", "$array[2]"); 
     assertEquals("Created <" + "$array[1]" + ">", "Value1", context.getValue("$array[1]")); 
 }
public void testCreatePath12() { 
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
public void testCreatePathAndSetValueWithMatrix13() { 
     context.setValue("matrix", null); 
     assertXPathCreatePathAndSetValue(context, "/matrix[1]/.[1]", new Integer(4), "/matrix[1]/.[1]"); 
 }
public void testRemovePathCollectionElement15() { 
     context.getVariables().declareVariable("temp", list("temp1", "temp2")); 
     context.removePath("$temp[1]"); 
     assertEquals("Remove collection element", "temp2", context.getValue("$temp[1]")); 
 }
public void testDefaultNamespaceIgnored16() { 
     context.registerDefaultNamespace("temp"); 
     assertXPathValueAndPointer(context, "//pos//number", "110", "/node()[1]/pos[2]/register[1]/number[1]"); 
     context.registerDefaultNamespace(null); 
 }
public void testUnion24() { 
     assertXPathValueIterator(context, "integers | beans[1]/strings", list("String 1", "String 2", "String 3", new Integer(1), new Integer(2), new Integer(3), new Integer(4))); 
     assertXPathValue(context, "count((integers | beans[1]/strings)[contains(., '1')])", new Double(2)); 
     assertXPathValue(context, "count((integers | beans[1]/strings)[name(.) = 'strings'])", new Double(3)); 
     assertXPathValue(context, "(integers)[2]", new Integer(2)); 
 }
public void testAxisSelf26() { 
     assertXPathValue(context, "//price:sale/self::price:sale/saleEnds", "never"); 
     assertXPathValueLenient(context, "//price:sale/self::x/saleEnds", null); 
 }
public void testCreatePathExpandExistingCollection43() { 
     assertXPathCreatePathAndSetValue(context, "/integers[5]", new Integer(3), "/integers[5]"); 
 }
public void testAxisSelf52() { 
     assertXPathValue(context, "self::node() = /", Boolean.TRUE); 
     assertXPathValue(context, "self::root = /", Boolean.TRUE); 
 }
public void testAxisDescendantOrSelf80() { 
     assertXPathValueIterator(context, "descendant-or-self::name", set("Name 1", "Name 2", "Name 3", "Name 6", "Name 0", "Name 5", "Name 4")); 
     assertXPathValueIterator(context, "//name", set("Name 1", "Name 2", "Name 3", "Name 6", "Name 0", "Name 5", "Name 4")); 
     assertXPathValue(context, "count(descendant-or-self::root)", new Double(1)); 
     assertXPathValue(context, "count(nestedBean//.)", new Double(7)); 
     assertXPathValue(context, "count(//self::beans)", new Double(2)); 
     assertXPathValue(context, "count(descendant-or-self::node())", new Double(66)); 
 }
public void testAxisParent83() { 
     assertXPathPointer(context, "//street/..", "/vendor[1]/location[1]/address[1]"); 
     assertXPathPointerIterator(context, "//street/..", list("/vendor[1]/location[2]/address[1]", "/vendor[1]/location[1]/address[1]")); 
     assertXPathValue(context, "vendor/product/price:sale/saleEnds/parent::price:*" + "/saleEnds", "never"); 
 }
public void testAxisFollowing84() { 
     assertXPathValueIterator(context, "vendor/contact/following::location//street", list("Orchard Road", "Tangerine Drive")); 
     assertXPathValue(context, "//location/following::price:sale/saleEnds", "never"); 
 }
public void testListContainer85() { 
     assertXPathValueAndPointer(context, "list[7]/vendor/location/address/city", "Fruit Market", "/list[7]/vendor[1]/location[2]/address[1]/city[1]"); 
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
