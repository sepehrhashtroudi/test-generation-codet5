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


public void testAxisDescendant18() { 
     assertXPathValue(context, "//Key1", "Value 1"); 
 } 


public void testCreatePathAndSetValueCollectionElement62() { 
     TestBean bean = (TestBean) context.getContextBean(); 
     bean.setMap(null); 
     assertXPathCreatePathAndSetValue(context, "/map/TestKey3[2]", "Test1", "/map[@name='TestKey3'][2]"); 
     assertXPathCreatePathAndSetValue(context, "/map[@name='TestKey3'][3]", "Test2", "/map[@name='TestKey3'][3]"); 
 } 


public void testCreatePathAndSetValueCreateBean68() { 
     TestBean bean = (TestBean) context.getContextBean(); 
     bean.setMap(null); 
     assertXPathCreatePathAndSetValue(context, "/map[@name='TestKey2']/int", new Integer(4), "/map[@name='TestKey2']/int"); 
 } 


public void testMapOfMaps76() { 
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


public void testSetCollection82() { 
     context.setValue("map/Key1", new Integer[] { new Integer(7), new Integer(8) }); 
     assertXPathSetValue(context, "map/Key1[1]", new Integer(9)); 
 } 


public void testCreatePathAndSetValue83() { 
     TestBean bean = (TestBean) context.getContextBean(); 
     bean.setMap(null); 
     assertXPathCreatePathAndSetValue(context, "/map[@name='TestKey1']", "Test", "/map[@name='TestKey1']"); 
 } 


public void testRemovePath84() { 
     TestBean bean = (TestBean) context.getContextBean(); 
     bean.getMap().put("TestKey1", "test"); 
     context.removePath("map[@name = 'TestKey1']"); 
     assertEquals("Remove dynamic property value", null, context.getValue("map[@name = 'TestKey1']")); 
 } 


public void testRemovePathArrayElement85() { 
     TestBean bean = (TestBean) context.getContextBean(); 
     bean.getMap().put("TestKey2", new String[] { "temp1", "temp2" }); 
     context.removePath("map[@name = 'TestKey2'][1]"); 
     assertEquals("Remove dynamic property collection element", "temp2", context.getValue("map[@name = 'TestKey2'][1]")); 
 } 


public void testCollectionOfMaps94() { 
     TestBean bean = (TestBean) context.getContextBean(); 
     List list = new ArrayList(); 
     bean.getMap().put("stuff", list); 
     Map m = new HashMap(); 
     m.put("fruit", "apple"); 
     list.add(m); 
     m = new HashMap(); 
     m.put("berry", "watermelon"); 
     list.add(m); 
     m = new HashMap(); 
     m.put("fruit", "banana"); 
     list.add(m); 
     assertXPathValueIterator(context, "/map/stuff/fruit", list("apple", "banana")); 
     assertXPathValueIterator(context, "/map/stuff[@name='fruit']", list("apple", "banana")); 
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
