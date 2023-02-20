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
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.TestBean;

/**
 * @todo more iterator testing with maps
 *
 * @author Dmitri Plotnikov
 * @version $Revision$ $Date$
 */

public class DynamicPropertiesModelTest extends JXPathTestCase {
    private static boolean enabled = true;
    private JXPathContext context;

    /**
     * Construct a new instance of this test case.
     *
     * @param name Name of the test case
     */
    public DynamicPropertiesModelTest(String name) {
        super(name);
    }

    public void setUp() {
        if (context == null) {
            context = JXPathContext.newContext(new TestBean());
            context.setFactory(new TestDynamicPropertyFactory());
        }
    }

public void testMapOfMaps44() { 
     TestBean bean = (TestBean) context.getContextBean(); 
     Map fruit = new HashMap(); 
     fruit.put("apple", "green"); 
     fruit.put("orange", "red"); 
     Map meat = new HashMap(); 
     meat.put("pork", "pig"); 
     meat.put("beef", "cow"); 
     bean.getMap().put("fruit", fruit); 
     bean.getMap().put("meat", meat); 
     assertXPathPointer(context, "//beef", "/map[@name='meat'][@name='beef']"); 
     assertXPathPointer(context, "map//apple", "/map[@name='fruit'][@name='apple']"); 
     assertXPathPointerLenient(context, "map//banana", "null()"); 
     assertXPathPointerLenient(context, "//fruit/pear", "/map[@name='fruit']/pear"); 
 }
public void testCreatePathAndSetValue46() { 
     TestBean bean = (TestBean) context.getContextBean(); 
     bean.setMap(null); 
     assertXPathCreatePathAndSetValue(context, "/map[@name='TestKey1']", "Test", "/map[@name='TestKey1']"); 
 }
public void testRemovePathArrayElement47() { 
     TestBean bean = (TestBean) context.getContextBean(); 
     bean.getMap().put("TestKey2", new String[] { "temp1", "temp2" }); 
     context.removePath("map[@name = 'TestKey2'][1]"); 
     assertEquals("Remove dynamic property collection element", "temp2", context.getValue("map[@name = 'TestKey2'][1]")); 
 }
public void testCreatePathAndSetValue48() { 
     context.setValue("nestedBean", null); 
     assertXPathCreatePathAndSetValue(context, "/nestedBean/int", new Integer(2), "/nestedBean/int"); 
 }
public void testAxisChild77() { 
     assertXPathValue(context, "boolean", Boolean.FALSE); 
     assertXPathPointer(context, "boolean", "/boolean"); 
     assertXPathPointerIterator(context, "boolean", list("/boolean")); 
     assertXPathValue(context, "count(set)", new Double(3)); 
     assertXPathValueIterator(context, "foo:boolean", list()); 
     assertXPathValue(context, "count(*)", new Double(21)); 
     assertXPathValue(context, "count(child::node())", new Double(21)); 
 }
    

    

    /**
     * Testing the pseudo-attribute "name" that dynamic property
     * objects appear to have.
     */
    

    

    

    /**
     * The key does not exist, but the assignment should succeed anyway,
     * because you should always be able to store anything in a Map.
     */
    

    

    

    

    

    

    

    

    

    

    
    
    

    
}
