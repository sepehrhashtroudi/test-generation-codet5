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

public void testRelativeContextAbsolutePath12() { 
     JXPathContext relative = context.getRelativeContext(context.getPointer("nestedBean")); 
     assertXPathValueAndPointer(relative, "/integers[2]", new Integer(2), "/integers[2]"); 
 }
public void testCreatePath13() { 
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
public void testSetValue14() { 
     assertXPathSetValue(context, "vendor/location[@id = '100']", "New Text"); 
     assertXMLSignature(context, "vendor/location[@id = '100']", "<E>New Text</E>", false, false, true, false); 
     assertXPathSetValue(context, "vendor/location[@id = '101']", "Replacement Text"); 
     assertXMLSignature(context, "vendor/location[@id = '101']", "<E>Replacement Text</E>", false, false, true, false); 
 }
public void testCreatePath17() { 
     assertXPathCreatePath(context, "/vendor[1]/location[3]", "", "/vendor[1]/location[3]"); 
     assertXPathCreatePath(context, "/vendor[1]/location[3]/address/street", "", "/vendor[1]/location[3]/address[1]/street[1]"); 
     assertXPathCreatePath(context, "/vendor[1]/location[2]/@manager", "", "/vendor[1]/location[2]/@manager"); 
     assertXPathCreatePath(context, "/vendor[1]/location[1]/@name", "local", "/vendor[1]/location[1]/@name"); 
     assertXPathCreatePathAndSetValue(context, "/vendor[1]/location[4]/@manager", "", "/vendor[1]/location[4]/@manager"); 
     context.registerNamespace("price", "priceNS"); 
     assertXPathCreatePath(context, "/vendor[1]/price:foo/price:bar", "", "/vendor[1]/price:foo[1]/price:bar[1]"); 
 }
public void testDefaultNamespaceIgnored18() { 
     context.registerDefaultNamespace("temp"); 
     assertXPathValueAndPointer(context, "//pos//number", "110", "/node()[1]/pos[2]/register[1]/number[1]"); 
     context.registerDefaultNamespace(null); 
 }
public void testNodeTypeText19() { 
     assertXPathValue(context, "//product/text()[. != '']", "We love this product."); 
     assertXPathPointer(context, "//product/text()", "/vendor[1]/product[1]/text()[1]"); 
 }
public void testNodeTypeProcessingInstruction20() { 
     assertXPathValue(context, "//product/processing-instruction()", "do not show anybody"); 
     assertXPathValue(context, "//product/processing-instruction('report')", "average only"); 
     assertXPathPointer(context, "//product/processing-instruction('report')", "/vendor[1]/product[1]/processing-instruction('report')[1]"); 
     assertXPathValue(context, "name(//product/processing-instruction()[1])", "security"); 
 }
public void testCreatePathAndSetValue25() { 
     assertXPathCreatePathAndSetValue(context, "vendor/location[3]", "", "/vendor[1]/location[3]"); 
     assertXPathCreatePathAndSetValue(context, "vendor/location[3]/address/street", "Lemon Circle", "/vendor[1]/location[3]/address[1]/street[1]"); 
     assertXPathCreatePathAndSetValue(context, "vendor/location[2]/@manager", "John Doe", "/vendor[1]/location[2]/@manager"); 
     assertXPathCreatePathAndSetValue(context, "vendor/location[1]/@manager", "John Doe", "/vendor[1]/location[1]/@manager"); 
     assertXPathCreatePathAndSetValue(context, "/vendor[1]/location[4]/@manager", "James Dow", "/vendor[1]/location[4]/@manager"); 
     assertXPathCreatePathAndSetValue(context, "vendor/product/product:name/attribute::price:language", "English", "/vendor[1]/product[1]/product:name[1]/@price:language"); 
     context.registerNamespace("price", "priceNS"); 
     assertXPathCreatePathAndSetValue(context, "/vendor[1]/price:foo/price:bar", "123.20", "/vendor[1]/price:foo[1]/price:bar[1]"); 
 }
public void testAxisFollowingSibling28() { 
     assertXPathValue(context, "vendor/location[.//employeeCount = 10]/" + "following-sibling::location//street", "Tangerine Drive"); 
     assertXPathPointer(context, "vendor/location[.//employeeCount = 10]/" + "following-sibling::location//street", "/vendor[1]/location[2]/address[1]/street[1]"); 
 }
public void testCreatePathAndSetValueExpandCollection32() { 
     context.getVariables().declareVariable("array", new String[] { "Value1" }); 
     assertXPathCreatePathAndSetValue(context, "$array[2]", "Value2", "$array[2]"); 
     assertEquals("Created <" + "$array[1]" + ">", "Value1", context.getValue("$array[1]")); 
 }
public void testCreatePathAndSetValueCreateBeanExpandCollection40() { 
     context.setValue("nestedBean", null); 
     assertXPathCreatePathAndSetValue(context, "/nestedBean/strings[2]", "Test", "/nestedBean/strings[2]"); 
 }
public void testRemovePathBeanValue61() { 
     context.removePath("nestedBean"); 
     assertEquals("Remove collection element", null, context.getValue("nestedBean")); 
 }
public void testVariables63() { 
     assertXPathValueAndPointer(context, "$a", new Double(1), "$a"); 
 }
public void testAxisAncestor71() { 
     assertXPathValue(context, "vendor/product/price:sale/saleEnds/" + "ancestor::price:sale/saleEnds", "never"); 
     assertXPathValue(context, "vendor/product/price:sale/saleEnds/ancestor::price:*" + "/saleEnds", "never"); 
 }
public void testAxisDescendant73() { 
     assertXPathValue(context, "//street", "Orchard Road"); 
     assertXPathValue(context, "count(//price:*)", new Double(2)); 
     assertXPathValueIterator(context, "vendor//saleEnds", list("never")); 
     assertXPathValueIterator(context, "vendor//promotion", list("")); 
     assertXPathValueIterator(context, "vendor//saleEnds[../@stores = 'all']", list("never")); 
     assertXPathValueIterator(context, "vendor//promotion[../@stores = 'all']", list("")); 
 }
public void testElementInVariable74() { 
     assertXPathValue(context, "$element", "Orchard Road"); 
 }
public void testRelativeContextParent75() { 
     JXPathContext relative = context.getRelativeContext(context.getPointer("nestedBean")); 
     assertXPathValueAndPointer(relative, "../integers[2]", new Integer(2), "/integers[2]"); 
 }
public void testAxisParent76() { 
     assertXPathValue(context, "count(/beans/..)", new Double(1)); 
     assertXPathValue(context, "count(//..)", new Double(9)); 
     assertXPathValue(context, "count(//../..)", new Double(2)); 
     assertXPathValueIterator(context, "//parent::beans/name", list("Name 1", "Name 2")); 
 }
public void testAxisFollowing77() { 
     assertXPathValueIterator(context, "vendor/contact/following::location//street", list("Orchard Road", "Tangerine Drive")); 
     assertXPathValue(context, "//location/following::price:sale/saleEnds", "never"); 
 }
public void testAxisChild81() { 
     assertXPathValue(context, "boolean", Boolean.FALSE); 
     assertXPathPointer(context, "boolean", "/boolean"); 
     assertXPathPointerIterator(context, "boolean", list("/boolean")); 
     assertXPathValue(context, "count(set)", new Double(3)); 
     assertXPathValueIterator(context, "foo:boolean", list()); 
     assertXPathValue(context, "count(*)", new Double(21)); 
     assertXPathValue(context, "count(child::node())", new Double(21)); 
 }
public void testCreatePathDeclareVariable85() { 
     assertXPathCreatePath(context, "$string", null, "$string"); 
 }
public void testCreateAndSetValuePathDeclareVariableSetCollectionElement86() { 
     assertXPathCreatePathAndSetValue(context, "$stringArray[2]", "Value2", "$stringArray[2]"); 
     assertEquals("Created <" + "$stringArray[1]" + ">", "Value1", context.getValue("$stringArray[1]")); 
 }
public void testSelf88() { 
     assertXPathValue(context, "self::node()/name", "Name 1"); 
     assertXPathPointer(context, "self::node()/name", "/vendor[1]/location[1]/address[1]/street[1]"); 
     assertXPathValueIterator(context, "self::node()/name", list("/vendor[1]/location[2]/address[1]/street[1]")); 
     assertXPathValue(context, "name(vendor/product/price:amount/@price:discount)", "value:amount/@price:discount"); 
     assertXPathValue(context, "name(vendor/location)", "location"); 
     assertXPathValue(context, "namespace-uri(vendor/product/price:amount/@price:discount)", "priceNS"); 
     assertXPathValue(context, "vendor/product/prix", "934.99"); 
     assertXPathValue(context, "/vendor/contact[@name='jim']", "Jim"); 
     boolean nsv = false; 
     try { 
         context.setLenient(false); 
         context.getValue("/vendor/contact[@name='jane']"); 
     } catch (JXPathException ex) { 
         nsv = true; 
     } 
     assertTrue("No such value: /vendor/contact[@name='jim']", nsv); 
     nsv = false; 
     try { 
         context.setLenient(false); 
         context.getValue("/vendor/contact[@name='jane']/*"); 
     } catch (JXPathException ex) { 
         nsv = true; 
     } 
     assertTrue("No such value: /vendor/contact[@name='jane']/*", nsv); 
     assertXPathValue(context, "count(vendor/product/price:*)", new Double(2)); 
     assertXPathValue(context, "count(vendor/product/*)", new Double(4));
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
