/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

/**
 * Tests ArrayUtils remove and removeElement methods.
 * 
 * @version $Id$
 */
public class ArrayUtilsRemoveTest {

@Test
public void testRemoveElementIntArray44() { 
     int[] array; 
     array = ArrayUtils.removeElement((int[]) null, 1); 
     assertNull(array); 
     array = ArrayUtils.removeElement(ArrayUtils.EMPTY_INT_ARRAY, 1); 
     assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array)); 
     assertEquals(Integer.TYPE, array.getClass().getComponentType()); 
     array = ArrayUtils.removeElement(new int[] { 1 }, 1); 
     assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array)); 
     assertEquals(Integer.TYPE, array.getClass().getComponentType()); 
     array = ArrayUtils.removeElement(new int[] { 1, 2 }, 1); 
     assertTrue(Arrays.equals(new int[] { 2 }, array)); 
     assertEquals(Integer.TYPE, array.getClass().getComponentType()); 
     array = ArrayUtils.removeElement(new int[] { 1, 2, 1 }, 1); 
     assertTrue(Arrays.equals(new int[] { 2, 1 }, array)); 
     assertEquals(Integer.TYPE, array.getClass().getComponentType()); 
 }
@Test
public void testCloneInt263() { 
     assertEquals(null, ArrayUtils.clone((int[]) null)); 
     final int[] original = new int[] { 1, 4 }; 
     final int[] cloned = ArrayUtils.clone(original); 
     assertTrue(Arrays.equals(original, cloned)); 
     assertTrue(original != cloned); 
 }
    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
