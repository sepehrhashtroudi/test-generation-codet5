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

public void testDocumentOrder81() { 
     assertDocumentOrder(context, "vendor/location", "vendor/location/address/street", -1); 
     assertDocumentOrder(context, "vendor/location[@id = '100']", "vendor/location[@id = '101']", -1); 
     assertDocumentOrder(context, "vendor//price:amount", "vendor/location", 1); 
 }
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
}
