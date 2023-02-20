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
package org.apache.commons.jxpath.util;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;

/**
 * Tests BasicTypeConverter
 * 
 * @author Dmitri Plotnikov
 * @version $Revision$ $Date$
 */

public class BasicTypeConverterTest extends TestCase {
    /**
     * Construct a new instance of this test case.
     *
     * @param name Name of the test case
     */
    public BasicTypeConverterTest(String name) {
        super(name);
    }

public void testArrayToList54() { 
     assertConversion(new int[] { 1, 2 }, List.class, Arrays.asList(new Object[] { new Integer(1), new Integer(2) })); 
 }
public void testSingletonArrayToString55() { 
     assertConversion(new String[] { "Earth" }, String.class, "Earth"); 
 }
public void testNodeSetToInteger56() { 
     assertConversion(new NodeSet() { 
  
         public List getNodes() { 
             return null; 
         } 
  
         public List getPointers() { 
             return null; 
         } 
  
         public List getValues() { 
             return Collections.singletonList("9"); 
         } 
     }, Integer.class, new Integer(9)); 
 }
public void testListToArray57() { 
     assertConversion(Arrays.asList(new Integer[] { new Integer(1), new Integer(2) }), String[].class, Arrays.asList(new String[] { "1", "2" })); 
     assertConversion(Arrays.asList(new String[] { "1", "2" }), int[].class, Arrays.asList(new Integer[] { new Integer(1), new Integer(2) })); 
 }
    

    

    

    

    

    public void assertConversion(Object from, Class toType, Object expected) {
        boolean can = TypeUtils.canConvert(from, toType);
        assertTrue("Can convert: " + from.getClass() + " to " + toType, can);
        Object result = TypeUtils.convert(from, toType);
        if (result.getClass().isArray()) {
            ArrayList list = new ArrayList();
            for (int j = 0; j < Array.getLength(result); j++) {
                list.add(Array.get(result, j));
            }
            result = list;
        }
        assertEquals(
            "Convert: " + from.getClass() + " to " + toType,
            expected,
            result);
    }
    
    

    

    

    

    // succeeds in current version
        
    
    
}
