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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.TestBean;
import org.apache.commons.jxpath.TestMixedModelBean;
import org.apache.commons.jxpath.TestNull;
import org.apache.commons.jxpath.Variables;

/**
 * Tests JXPath with mixed model: beans, maps, DOM etc.
 *
 * @author Dmitri Plotnikov
 * @version $Revision$ $Date$
 */

public class MixedModelTest extends JXPathTestCase {
    private JXPathContext context;

    /**
     * Construct a new instance of this test case.
     *
     * @param name Name of the test case
     */
    public MixedModelTest(String name) {
        super(name);
    }

    public static void main(String[] args) {
        TestRunner.run(new MixedModelTest("testContainerWithCollection"));
    }
    
    /**
     * Return the tests included in this test suite.
     */
    public static Test suite() {
        return (new TestSuite(MixedModelTest.class));
    }

    public void setUp() {
        TestMixedModelBean bean = new TestMixedModelBean();
        context = JXPathContext.newContext(bean);
        context.setFactory(new TestMixedModelFactory());
        context.setLocale(Locale.US);
        Variables vars = context.getVariables();
        vars.declareVariable("string", bean.getString());
        vars.declareVariable("bean", bean.getBean());
        vars.declareVariable("map", bean.getMap());
        vars.declareVariable("list", bean.getList());
        vars.declareVariable("document", bean.getDocument());
        vars.declareVariable("element", bean.getElement());
        vars.declareVariable("container", bean.getContainer());
        vars.declareVariable("testnull", new TestNull());

        int[][] matrix = new int[1][];
        matrix[0] = new int[1];
        matrix[0][0] = 3;
        vars.declareVariable("matrix", matrix);
    }


public void testNull34() { 
     assertXPathPointerLenient(context, "$null", "$null"); 
     assertXPathPointerLenient(context, "$null[3]", "$null[3]"); 
     assertXPathPointerLenient(context, "$testnull/nothing", "$testnull/nothing"); 
     assertXPathPointerLenient(context, "$testnull/nothing[2]", "$testnull/nothing[2]"); 
     assertXPathPointerLenient(context, "beans[8]/int", "/beans[8]/int"); 
     assertXPathValueIterator(context, "$testnull/nothing[1]", Collections.EMPTY_LIST); 
     JXPathContext ctx = JXPathContext.newContext(new TestNull()); 
     assertXPathValue(ctx, "nothing", null); 
     assertXPathValue(ctx, "child/nothing", null); 
     assertXPathValue(ctx, "array[2]", null); 
     assertXPathValueLenient(ctx, "nothing/something", null); 
     assertXPathValueLenient(ctx, "array[2]/something", null); 
 } 


public void testVar39() { 
     context.getVariables().declareVariable("foo:bar", "baz"); 
     assertXPathValueAndPointer(context, "$foo:bar", "baz", "$foo:bar"); 
 } 


public void testIterateArray66() { 
     Map map = new HashMap(); 
     map.put("foo", new String[] { "a", "b", "c" }); 
     JXPathContext context = JXPathContext.newContext(map); 
     assertXPathValueIterator(context, "foo", list("a", "b", "c")); 
 } 


public void testErrorProperty76() { 
     context.getVariables().declareVariable("e", new ExceptionPropertyTestBean()); 
     boolean ex = false; 
     try { 
         assertXPathValue(context, "$e/errorString", null); 
     } catch (Throwable t) { 
         ex = true; 
     } 
     assertTrue("Legitimate exception accessing property", ex); 
     assertXPathPointer(context, "$e/errorString", "$e/errorString"); 
     assertXPathPointerLenient(context, "$e/errorStringArray[1]", "$e/errorStringArray[1]"); 
     assertXPathPointerIterator(context, "$e/errorString", list("$e/errorString")); 
     assertXPathPointerIterator(context, "$e//error", Collections.EMPTY_LIST); 
 } 


public void testCreatePathAndSetValueWithMatrix78() { 
     context.setValue("matrix", null); 
     assertXPathCreatePathAndSetValue(context, "/matrix[1]/.[1]", new Integer(4), "/matrix[1]/.[1]"); 
 } 


public void testMatrix82() { 
     assertXPathValueAndPointer(context, "$matrix[1]/.[1]", new Integer(3), "$matrix[1]/.[1]"); 
     context.setValue("$matrix[1]/.[1]", new Integer(2)); 
     assertXPathValueAndPointer(context, "matrix[1]/.[1]", new Integer(3), "/matrix[1]/.[1]"); 
     context.setValue("matrix[1]/.[1]", "2"); 
     assertXPathValue(context, "matrix[1]/.[1]", new Integer(2)); 
     context.getVariables().declareVariable("wholebean", context.getContextBean()); 
     assertXPathValueAndPointer(context, "$wholebean/matrix[1]/.[1]", new Integer(2), "$wholebean/matrix[1]/.[1]"); 
     boolean ex = false; 
     try { 
         context.setValue("$wholebean/matrix[1]/.[2]", "4"); 
     } catch (Exception e) { 
         ex = true; 
     } 
     assertTrue("Exception setting value of non-existent element", ex); 
     ex = false; 
     try { 
         context.setValue("$wholebean/matrix[2]/.[1]", "4"); 
     } catch (Exception e) { 
         ex = true; 
     } 
     assertTrue("Exception setting value of non-existent element", ex); 
 } 


public void testCollectionPointer83() { 
     List list = new ArrayList(); 
     Map map = new HashMap(); 
     map.put("KeyOne", "SomeStringOne"); 
     map.put("KeyTwo", "SomeStringTwo"); 
     Map map2 = new HashMap(); 
     map2.put("KeyA", "StringA"); 
     map2.put("KeyB", "StringB"); 
     map.put("KeyThree", map2); 
     list.add(map); 
     List list2 = new ArrayList(); 
     list2.add("foo"); 
     list2.add(map); 
     list2.add(map); 
     list.add(list2); 
     context = JXPathContext.newContext(list); 
     assertEquals("SomeStringOne", context.getValue(".[1]/KeyOne")); 
     assertEquals("StringA", context.getValue(".[1]/KeyThree/KeyA")); 
     assertEquals(new Integer(3), context.getValue("size(.[1]/KeyThree)")); 
     assertEquals(new Double(6.0), context.getValue("count(.[1]/KeyThree/*)")); 
     assertEquals(new Double(3.0), context.getValue("count(.[1]/KeyThree/KeyA)")); 
 } 


public void testIterateVector87() { 
     Map map = new HashMap(); 
     Vector vec = new Vector(); 
     vec.add(new HashMap()); 
     vec.add(new HashMap()); 
     map.put("vec", vec); 
     JXPathContext context = JXPathContext.newContext(map); 
     assertXPathPointerIterator(context, "/vec", list("/.[@name='vec'][1]", "/.[@name='vec'][2]")); 
 } 


public void testCreatePath117() { 
     context = JXPathContext.newContext(new TestBean()); 
     context.setFactory(new TestMixedModelFactory()); 
     TestBean bean = (TestBean) context.getContextBean(); 
     bean.setMap(null); 
     assertXPathCreatePath(context, "/map[@name='TestKey5']/nestedBean/int", new Integer(1), "/map[@name='TestKey5']/nestedBean/int"); 
     bean.setMap(null); 
     assertXPathCreatePath(context, "/map[@name='TestKey5']/beans[2]/int", new Integer(1), "/map[@name='TestKey5']/beans[2]/int"); 
 } 


public void testListContainer132() { 
     assertXPathValueAndPointer(context, "list[7]/vendor/location/address/city", "Fruit Market", "/list[7]/vendor[1]/location[2]/address[1]/city[1]"); 
 } 


public void testListList136() { 
     assertXPathValueAndPointer(context, "list[4]/.[1]", "string2", "/list[4]/.[1]"); 
 } 

    
    
    

    

    

    

    

    

    

    // ----------------------------------------------------------------------

    

    

    

    

    

    

    

    // ----------------------------------------------------------------------

    

    

    

    

    

    

    

    // ----------------------------------------------------------------------

    

    

    

    

    

    

    

    

    

    

    /**
     * Test JXPath.iterate() with map containing an array
     */
    

    

    

    

    

    

    
    
    /**
     * Scott Heaberlin's test - collection of collections
     */
    
}
