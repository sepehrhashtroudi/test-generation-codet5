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
package org.apache.commons.jxpath.ri;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;

/**
 * Test compiler.
 *
 * @author Dmitri Plotnikov
 * @version $Revision$ $Date$
 */

public class JXPathCompiledExpressionTest extends JXPathTestCase {
    
    /**
     * Construct a new instance of this test case.
     *
     * @param name Name of the test case
     */
    public JXPathCompiledExpressionTest(String name) {
        super(name);
    }

public void testCoreOperationOr33() { 
     assertXPathExpression("2 or 4", CoreOperationOr.class); 
     assertXPathExpression("2 > 1 or 4 < 5", CoreOperationOr.class); 
     assertXPathExpression("1 > 1 and 2 <= 2 or 3 = 4", CoreOperationOr.class); 
 }
public void testCoreOperationGreaterThan37() { 
     assertXPathExpression("3>4", CoreOperationGreaterThan.class, "3 > 4"); 
     assertXPathExpression("3>(2>=1)", CoreOperationGreaterThan.class, "3 > (2 >= 1)"); 
     assertXPathExpression("1 > (1 and 2 <= (2 or 3) = 4)", CoreOperationGreaterThan.class); 
 }
public void testCoreOperationLessThanOrEqual66() { 
     assertXPathExpression("3<=4", CoreOperationLessThanOrEqual.class, "3 <= 4"); 
     assertXPathExpression("3<=(2>=1)", CoreOperationLessThanOrEqual.class, "3 <= (2 >= 1)"); 
 }
public void testLocationPathAxisSelf67() { 
     assertXPathExpression("self::foo:bar", LocationPath.class); 
     assertXPathExpression(".", LocationPath.class); 
 }
public void testLocationPathAxisDescendantOrSelf68() { 
     assertXPathExpression("descendant-or-self::foo:bar", LocationPath.class); 
     assertXPathExpression("//foo", LocationPath.class); 
     assertXPathExpression("foo//bar", LocationPath.class); 
 }
public void testCoreOperationMod84() { 
     assertXPathExpression("2 mod 4", CoreOperationMod.class); 
     assertXPathExpression("2|3 mod -3", CoreOperationMod.class, "2 | 3 mod -3"); 
 }
    
    
    
    
    
        
    

    
    
    

    

    
    
    

    
    
    

    

    

    
    
    
    
    
    
    

    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Compiles the xpath into an Expression, checks the expression
     * class, converts the expression to string and checks that the string
     * matches the expected one.
     */
    private void assertXPathExpression(
        String xpath,
        Class expectedClass,
        String expected) 
    {
        JXPathCompiledExpression expression =
            (JXPathCompiledExpression) JXPathContext.compile(xpath);
        
        assertEquals(
            "Expression class for " + xpath,
            expectedClass,
            expression.getExpression().getClass());
            
        assertEquals(
            "Expression toString() for " + xpath,
            expected,
            expression.getExpression().toString());
    }
    
    private void assertXPathExpression(
        String xpath,
        Class expectedClass) 
    {
        assertXPathExpression(xpath, expectedClass, xpath);
    }
    
}
