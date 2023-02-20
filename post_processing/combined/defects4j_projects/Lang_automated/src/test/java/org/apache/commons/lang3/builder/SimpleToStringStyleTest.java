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
public void testPerson463() { 
     final Person p = new Person(); 
     p.name = "John Q. Public"; 
     p.age = 45; 
     p.smoker = true; 
     final String pBaseStr = "ToStringStyleTest.Person"; 
     assertEquals(pBaseStr + "[name=John Q. Public,age=45,smoker=true]", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString()); 
 }
@Test
public void testLongArrayArray464() { 
     long[][] array = new long[][] { { 1, 2 }, null, { 5 } }; 
     assertEquals("{{1,2},<null>,{5}}", new ToStringBuilder(base).append(array).toString()); 
     assertEquals("{{1,2},<null>,{5}}", new ToStringBuilder(base).append((Object) array).toString()); 
     array = null; 
     assertEquals("<null>", new ToStringBuilder(base).append(array).toString()); 
     assertEquals("<null>", new ToStringBuilder(base).append((Object) array).toString()); 
 }
    

    
    
    

    

    

    

    

    

}
