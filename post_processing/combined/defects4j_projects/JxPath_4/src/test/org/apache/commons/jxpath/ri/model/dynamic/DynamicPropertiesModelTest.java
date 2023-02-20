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

public void testSetNewKey48() { 
     assertXPathSetValue(context, "map/Key4", new Integer(7)); 
     assertXPathPointerLenient(context, "//map/Key5", "/map/Key5"); 
     assertXPathSetValue(context, "//map/Key5", new Integer(8)); 
 }
public void testCreatePathAndSetValueCollectionElement49() { 
     TestBean bean = (TestBean) context.getContextBean(); 
     bean.setMap(null); 
     assertXPathCreatePathAndSetValue(context, "/map/TestKey3[2]", "Test1", "/map[@name='TestKey3'][2]"); 
     assertXPathCreatePathAndSetValue(context, "/map[@name='TestKey3'][3]", "Test2", "/map[@name='TestKey3'][3]"); 
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
