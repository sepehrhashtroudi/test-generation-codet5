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


public void testCoreOperationNotEqual34() { 
     assertXPathExpression("2 != 4", CoreOperationNotEqual.class); 
     assertXPathExpression("2 + 1 != 3", CoreOperationNotEqual.class); 
 } 


public void testLocationPathNodeTest45() { 
     assertXPathExpression("node()", LocationPath.class); 
     assertXPathExpression("text()", LocationPath.class); 
     assertXPathExpression("comment()", LocationPath.class); 
     assertXPathExpression("processing-instruction()", LocationPath.class); 
     assertXPathExpression("processing-instruction('test')", LocationPath.class); 
 } 


public void testLocationPathAxisOther47() { 
     assertXPathExpression("ancestor::foo:bar", LocationPath.class); 
     assertXPathExpression("ancestor-or-self::foo:bar", LocationPath.class); 
     assertXPathExpression("namespace::foo:bar", LocationPath.class); 
     assertXPathExpression("preceding::foo:bar", LocationPath.class); 
     assertXPathExpression("preceding-sibling::foo:bar", LocationPath.class); 
     assertXPathExpression("following::foo:bar", LocationPath.class); 
     assertXPathExpression("following-sibling::foo:bar", LocationPath.class); 
 } 


public void testLocationPathAxisAttribute48() { 
     assertXPathExpression("attribute::foo:bar", LocationPath.class, "@foo:bar"); 
     assertXPathExpression("@foo:bar", LocationPath.class); 
     assertXPathExpression("../@foo:bar", LocationPath.class); 
     assertXPathExpression("@*", LocationPath.class); 
     assertXPathExpression("@*[last()]", LocationPath.class); 
 } 


public void testCoreOperationSum55() { 
     assertXPathExpression("3 + 1 + 4", CoreOperationAdd.class); 
     assertXPathExpression("(3 + 1) + 4", CoreOperationAdd.class, "3 + 1 + 4"); 
     assertXPathExpression("3 + (1 + 4)", CoreOperationAdd.class, "3 + 1 + 4"); 
     assertXPathExpression("3 + -1", CoreOperationAdd.class, "3 + -1"); 
     assertXPathExpression("2*-3 + -1", CoreOperationAdd.class, "2 * -3 + -1"); 
 } 


public void testCoreOperationUnion57() { 
     assertXPathExpression("3 | 1 | 4", CoreOperationUnion.class); 
 } 


public void testCoreOperationOr59() { 
     assertXPathExpression("2 or 4", CoreOperationOr.class); 
     assertXPathExpression("2 > 1 or 4 < 5", CoreOperationOr.class); 
     assertXPathExpression("1 > 1 and 2 <= 2 or 3 = 4", CoreOperationOr.class); 
 } 


public void testCoreOperationMinus60() { 
     assertXPathExpression("1 - 1", CoreOperationSubtract.class); 
     assertXPathExpression("1 - 1 - 2", CoreOperationSubtract.class); 
     assertXPathExpression("1 - (1 - 2)", CoreOperationSubtract.class); 
 } 


public void testCoreOperationMod61() { 
     assertXPathExpression("2 mod 4", CoreOperationMod.class); 
     assertXPathExpression("2|3 mod -3", CoreOperationMod.class, "2 | 3 mod -3"); 
 } 


public void testCoreOperationGreaterThan65() { 
     assertXPathExpression("3>4", CoreOperationGreaterThan.class, "3 > 4"); 
     assertXPathExpression("3>(2>=1)", CoreOperationGreaterThan.class, "3 > (2 >= 1)"); 
     assertXPathExpression("1 > (1 and 2 <= (2 or 3) = 4)", CoreOperationGreaterThan.class); 
 } 


public void testCoreOperationGreaterThanOrEqual68() { 
     assertXPathExpression("3>=4", CoreOperationGreaterThanOrEqual.class, "3 >= 4"); 
     assertXPathExpression("3>=(2>=1)", CoreOperationGreaterThanOrEqual.class, "3 >= (2 >= 1)"); 
 } 


public void testCoreOperationAnd87() { 
     assertXPathExpression("2 and 4", CoreOperationAnd.class); 
     assertXPathExpression("2 > 1 and 4 < 5", CoreOperationAnd.class); 
 } 


public void testCoreOperationLessThanOrEqual91() { 
     assertXPathExpression("3<=4", CoreOperationLessThanOrEqual.class, "3 <= 4"); 
     assertXPathExpression("3<=(2>=1)", CoreOperationLessThanOrEqual.class, "3 <= (2 >= 1)"); 
 } 


public void testVariableReference107() { 
     assertXPathExpression("$x", VariableReference.class); 
     assertXPathExpression("$x:y", VariableReference.class); 
 } 


public void testLocationPathAxisChild109() { 
     assertXPathExpression("child::foo:bar", LocationPath.class, "foo:bar"); 
     assertXPathExpression("foo:bar", LocationPath.class); 
     assertXPathExpression("/foo:bar", LocationPath.class); 
     assertXPathExpression("/foo/bar", LocationPath.class); 
     assertXPathExpression("*", LocationPath.class); 
     assertXPathExpression("foo:*", LocationPath.class); 
 } 


public void testExpressionPath110() { 
     assertXPathExpression("$x/foo/bar", ExpressionPath.class); 
     assertXPathExpression("(2 + 2)/foo/bar", ExpressionPath.class); 
     assertXPathExpression("$x[3][2 + 2]/foo/bar", ExpressionPath.class); 
 } 


public void testCoreOperationMultiply114() { 
     assertXPathExpression("2*4", CoreOperationMultiply.class, "2 * 4"); 
     assertXPathExpression("2*(3 + 1)", CoreOperationMultiply.class, "2 * (3 + 1)"); 
 } 


public void testCoreOperationNameAttributeTest115() { 
     assertXPathExpression("@name = 'bar'", NameAttributeTest.class); 
 } 


public void testLocationPathAxisSelf116() { 
     assertXPathExpression("self::foo:bar", LocationPath.class); 
     assertXPathExpression(".", LocationPath.class); 
 } 


public void testLocationPathAxisDescendantOrSelf117() { 
     assertXPathExpression("descendant-or-self::foo:bar", LocationPath.class); 
     assertXPathExpression("//foo", LocationPath.class); 
     assertXPathExpression("foo//bar", LocationPath.class); 
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
