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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Class to test BitField functionality
 *
 * @version $Id$
 */
public class BitFieldTest  {

    private static final BitField bf_multi  = new BitField(0x3F80);
    private static final BitField bf_single = new BitField(0x4000);
    private static final BitField bf_zero = new BitField(0);

    /**
     * test the getValue() method
     */
@Test(expected = IllegalArgumentException.class) public void testBitField1029() throws Exception { final BitField bf = new BitField(0); bf.setValue(1, 1); bf.setValue(2, 2); bf.setValue(3, 3); bf.setValue(4, 4); }
@Test(expected = IllegalArgumentException.class) public void testBitField1032() { final BitField bf = new BitField(1); bf.setValue(1, 1); bf.setValue(2, 2); bf.setValue(3, 3); }
@Test(expected = IllegalArgumentException.class) public void testBitField1035() throws Exception { final BitField bf = new BitField(8); bf.setValue(0, 1); bf.setValue(1, 2); bf.setValue(2, 3); bf.setValue(3, 4); }
    

    /**
     * test the getShortValue() method
     */
    

    /**
     * test the getRawValue() method
     */
    

    /**
     * test the getShortRawValue() method
     */
    

    /**
     * test the isSet() method
     */
    

    /**
     * test the isAllSet() method
     */
    

    /**
     * test the setValue() method
     */
    

    /**
     * test the setShortValue() method
     */
    

    

    /**
     * test the clear() method
     */
    

    /**
     * test the clearShort() method
     */
    

    /**
     * test the set() method
     */
    

    /**
     * test the setShort() method
     */
    

    /**
     * test the setBoolean() method
     */
    

    /**
     * test the setShortBoolean() method
     */
    

}
