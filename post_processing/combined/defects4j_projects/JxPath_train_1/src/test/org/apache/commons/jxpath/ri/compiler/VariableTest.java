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
package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.Variables;

/**
 * Test basic functionality of JXPath - infoset types,
 * operations.
 *
 * @author Dmitri Plotnikov
 * @version $Revision$ $Date$
 */

public class VariableTest extends JXPathTestCase {
    private JXPathContext context;

    /**
     * Construct a new instance of this test case.
     *
     * @param name Name of the test case
     */
    public VariableTest(String name) {
        super(name);
    }

    public void setUp() {
        if (context == null) {
            context = JXPathContext.newContext(null);
            context.setFactory(new VariableFactory());

            Variables vars = context.getVariables();
            vars.declareVariable("a", new Double(1));
            vars.declareVariable("b", new Double(1));
            vars.declareVariable("c", null);
            vars.declareVariable("d", new String[] { "a", "b" });
            vars.declareVariable("integer", new Integer(1));
            vars.declareVariable("nan", new Double(Double.NaN));
            vars.declareVariable("x", null);
        }
    }


public void testCreatePathDeclareVariable62() { 
     assertXPathCreatePath(context, "$string", null, "$string"); 
 } 


public void testCreatePathAndSetValueDeclVarSetCollectionElementProperty78() { 
     assertXPathCreatePathAndSetValue(context, "$testArray[2]/boolean", Boolean.TRUE, "$testArray[2]/boolean"); 
 } 


public void testVariablesInExpressions91() { 
     assertXPathValue(context, "$a = $b", Boolean.TRUE); 
     assertXPathValue(context, "$a = $nan", Boolean.FALSE); 
     assertXPathValue(context, "$a + 1", new Double(2)); 
     assertXPathValue(context, "$c", null); 
     assertXPathValue(context, "$d[2]", "b"); 
 } 


public void testVariables99() { 
     assertXPathValueAndPointer(context, "$a", new Double(1), "$a"); 
 } 


public void testRemovePathCollectionElement100() { 
     context.getVariables().declareVariable("temp", list("temp1", "temp2")); 
     context.removePath("$temp[1]"); 
     assertEquals("Remove collection element", "temp2", context.getValue("$temp[1]")); 
 } 


public void testRemovePathUndeclareVariable101() { 
     context.getVariables().declareVariable("temp", "temp"); 
     context.removePath("$temp"); 
     assertTrue("Undeclare variable", !context.getVariables().isDeclaredVariable("temp")); 
 } 


public void testCreateAndSetValuePathDeclareVariableSetCollectionElement115() { 
     assertXPathCreatePathAndSetValue(context, "$stringArray[2]", "Value2", "$stringArray[2]"); 
     assertEquals("Created <" + "$stringArray[1]" + ">", "Value1", context.getValue("$stringArray[1]")); 
 } 


public void testCreatePathAndSetValueDeclareVariable122() { 
     assertXPathCreatePathAndSetValue(context, "$string", "Value", "$string"); 
 } 


public void testInvalidVariableName123() { 
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


public void testCreatePathDeclareVariableSetProperty125() { 
     assertXPathCreatePath(context, "$test/boolean", Boolean.FALSE, "$test/boolean"); 
 } 


public void testRemovePathArrayElement128() { 
     context.getVariables().declareVariable("temp", new String[] { "temp1", "temp2" }); 
     context.removePath("$temp[1]"); 
     assertEquals("Remove array element", "temp2", context.getValue("$temp[1]")); 
 } 

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
}
