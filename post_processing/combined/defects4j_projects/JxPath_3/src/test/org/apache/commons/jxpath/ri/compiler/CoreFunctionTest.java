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

import java.text.DecimalFormatSymbols;

import org.apache.commons.jxpath.IdentityManager;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.KeyManager;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.TestMixedModelBean;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.model.NodePointer;

/**
 * Test basic functionality of JXPath - core functions.
 *
 * @author Dmitri Plotnikov
 * @version $Revision$ $Date$
 */

public class CoreFunctionTest extends JXPathTestCase {
    private JXPathContext context;

    /**
     * Construct a new instance of this test case.
     *
     * @param name Name of the test case
     */
    public CoreFunctionTest(String name) {
        super(name);
    }

    public void setUp() {
        if (context == null) {
            context = JXPathContext.newContext(new TestMixedModelBean());
            Variables vars = context.getVariables();
            vars.declareVariable("nan", new Double(Double.NaN));
            vars.declareVariable("bool_true", new Boolean("true"));
            vars.declareVariable("bool_false", new Boolean("false"));
        }
    }

public void testFormatNumberFunction10() { 
     DecimalFormatSymbols symbols = new DecimalFormatSymbols(); 
     symbols.setDigit('D'); 
     context.setDecimalFormatSymbols("test", symbols); 
     assertXPathValue(context, "format-number(123456789, '#.000000000')", "123456789.000000000"); 
     assertXPathValue(context, "format-number(123456789, '#.0')", "123456789.0"); 
     assertXPathValue(context, "format-number(0.123456789, '##%')", "12%"); 
     assertXPathValue(context, "format-number(123456789, '################')", "123456789"); 
     assertXPathValue(context, "format-number(123456789, 'D.0', 'test')", "123456789.0"); 
     assertXPathValue(context, "format-number(123456789, '$DDD,DDD,DDD.DD', 'test')", "$123,456,789"); 
 }
    

    

    
    
    
}
