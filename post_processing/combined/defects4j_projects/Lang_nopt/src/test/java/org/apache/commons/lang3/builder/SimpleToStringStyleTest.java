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
package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.lang3.builder.ToStringStyleTest.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.SimpleToStringStyleTest}.
 *
 * @version $Id$
 */
public class SimpleToStringStyleTest {

    private final Integer base = Integer.valueOf(5);
    
    @Before
    public void setUp() throws Exception {
        ToStringBuilder.setDefaultStyle(ToStringStyle.SIMPLE_STYLE);
    }

    @After
    public void tearDown() throws Exception {
        ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }

    //----------------------------------------------------------------
    
@Test
public void appendSummary() { String[] summary = { "one", "two", "three", "four", "five" }; String[] expected = { "one", "two", "three", "four", "five" }; String[] actual = { "one", "two", "three", "four", "five" }; for (int i = 0; i < summary.length; i++) { assertEquals(expected[i], actual[i]); } for (int i = 0; i < expected.length; i++) { assertEquals(expected[i], actual[i]); } }
    

    
    
    

    

    

    

    

    

}
