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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import junit.textui.TestRunner;

import org.apache.commons.jxpath.ClassFunctions;
import org.apache.commons.jxpath.ExpressionContext;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.FunctionLibrary;
import org.apache.commons.jxpath.Functions;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.PackageFunctions;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.TestBean;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.model.NodePointer;

/**
 * Test extension functions.
 *
 * @author Dmitri Plotnikov
 * @version $Revision$ $Date$
 */

public class ExtensionFunctionTest extends JXPathTestCase {
    private Functions functions;
    private JXPathContext context;

    public static void main(String[] args) {
        TestRunner.run(ExtensionFunctionTest.class);
    }
    
    /**
     * Construct a new instance of this test case.
     *
     * @param name Name of the test case
     */
    public ExtensionFunctionTest(String name) {
        super(name);
    }

    public void setUp() {
        if (context == null) {
            context = JXPathContext.newContext(new TestBean());
            Variables vars = context.getVariables();
            vars.declareVariable("test", new TestFunctions(4, "test"));

            FunctionLibrary lib = new FunctionLibrary();
            lib.addFunctions(new ClassFunctions(TestFunctions.class, "test"));
            lib.addFunctions(new ClassFunctions(TestFunctions2.class, "test"));
            lib.addFunctions(new PackageFunctions("", "call"));
            lib.addFunctions(
                new PackageFunctions(
                    "org.apache.commons.jxpath.ri.compiler.",
                    "jxpathtest"));
            lib.addFunctions(new PackageFunctions("", null));
            context.setFunctions(lib);
        }
        functions = new ClassFunctions(TestFunctions.class, "test");
    }

public void testCollectionReturn9() { 
     assertXPathValueIterator(context, "test:collection()/name", list("foo", "bar")); 
     assertXPathPointerIterator(context, "test:collection()/name", list("/.[1]/name", "/.[2]/name")); 
     assertXPathValue(context, "test:collection()/name", "foo"); 
     assertXPathValue(context, "test:collection()/@name", "foo"); 
     List list = new ArrayList(); 
     list.add("foo"); 
     list.add("bar"); 
     context.getVariables().declareVariable("list", list); 
     Object values = context.getValue("test:items($list)"); 
     assertTrue("Return type: ", values instanceof Collection); 
     assertEquals("Return values: ", list, new ArrayList((Collection) values)); 
 }
public void testMethodLookupWithExpressionContext66() { 
     Object[] args = new Object[] { new TestFunctions() }; 
     Function func = functions.getFunction("test", "instancePath", args); 
     assertEquals("test:instancePath()", func.invoke(new Context(new Integer(1)), args), "1"); 
 }
public void testConstructorLookup75() { 
     Object[] args = new Object[] { new Integer(1), "x" }; 
     Function func = functions.getFunction("test", "new", args); 
     assertEquals("test:new(1, x)", func.invoke(new Context(null), args).toString(), "foo=1; bar=x"); 
 }
    

    

    

    

    

    

    

    

    

    
    
    

    

    
    
    

    

    private static class Context implements ExpressionContext {
        private Object object;

        public Context(Object object) {
            this.object = object;
        }

        public Pointer getContextNodePointer() {
            return NodePointer
                    .newNodePointer(null, object, Locale.getDefault());
        }

        public List getContextNodeList() {
            return null;
        }

        public JXPathContext getJXPathContext() {
            return null;
        }

        public int getPosition() {
            return 0;
        }
    }
}
