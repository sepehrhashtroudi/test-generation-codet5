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


public void testCreatePathAndSetValueExpandCollection57() { 
     context.getVariables().declareVariable("array", new String[] { "Value1" }); 
     assertXPathCreatePathAndSetValue(context, "$array[2]", "Value2", "$array[2]"); 
     assertEquals("Created <" + "$array[1]" + ">", "Value1", context.getValue("$array[1]")); 
 } 


public void testCreatePathAndSetValueDeclVarSetCollectionElementProperty79() { 
     assertXPathCreatePathAndSetValue(context, "$testArray[2]/boolean", Boolean.TRUE, "$testArray[2]/boolean"); 
 } 


public void testVariablesInExpressions93() { 
     assertXPathValue(context, "$a = $b", Boolean.TRUE); 
     assertXPathValue(context, "$a = $nan", Boolean.FALSE); 
     assertXPathValue(context, "$a + 1", new Double(2)); 
     assertXPathValue(context, "$c", null); 
     assertXPathValue(context, "$d[2]", "b"); 
 } 


public void testVariables102() { 
     assertXPathValueAndPointer(context, "$a", new Double(1), "$a"); 
 } 


public void testCreateAndSetValuePathDeclareVariableSetCollectionElement116() { 
     assertXPathCreatePathAndSetValue(context, "$stringArray[2]", "Value2", "$stringArray[2]"); 
     assertEquals("Created <" + "$stringArray[1]" + ">", "Value1", context.getValue("$stringArray[1]")); 
 } 


public void testCreatePathExpandCollection124() { 
     context.getVariables().declareVariable("array", new String[] { "Value1" }); 
     assertXPathCreatePath(context, "$array[2]", "", "$array[2]"); 
     assertEquals("Created <" + "$array[1]" + ">", "Value1", context.getValue("$array[1]")); 
 } 


public void testCreatePathAndSetValueDeclareVariable125() { 
     assertXPathCreatePathAndSetValue(context, "$string", "Value", "$string"); 
 } 


public void testInvalidVariableName126() { 
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


public void testCreatePathDeclareVariableSetProperty128() { 
     assertXPathCreatePath(context, "$test/boolean", Boolean.FALSE, "$test/boolean"); 
 } 

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
}
