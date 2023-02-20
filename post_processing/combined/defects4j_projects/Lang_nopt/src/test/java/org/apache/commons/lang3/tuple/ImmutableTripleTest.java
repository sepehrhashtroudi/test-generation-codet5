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
package org.apache.commons.lang3.tuple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * Test the Triple class.
 * @version $Id$
 */
public class ImmutableTripleTest {

@Test
void testGetMiddle1069() { final ImmutableTriple<String, Double, Double> triple = ImmutableTriple.of("A", Double.valueOf(3), Double.valueOf(4)); assertEquals(Double.valueOf(3), triple.getMiddle()); }
@Test
public void testImmutableTriple1071() { ImmutableTriple<String, Double, Double> triple = ImmutableTriple.of("A", Double.valueOf(1), Double.valueOf(2)); System.out.println(triple.getLeft()); System.out.println(triple.getMiddle()); System.out.println(triple.getRight()); assertEquals("A", triple.getLeft()); assertEquals(Double.valueOf(1), triple.getMiddle()); assertEquals(Double.valueOf(2), triple.getRight()); }
@Test
void testImmutableTriple1078() { ImmutableTriple<String, Double, Double> triple = ImmutableTriple.of("A", Double.valueOf(1), Double.valueOf(2)); System.out.println(triple.getLeft()); System.out.println(triple.getMiddle()); System.out.println(triple.getRight()); assertEquals("A", triple.getLeft()); assertEquals(Double.valueOf(1), triple.getMiddle()); assertEquals(Double.valueOf(2), triple.getRight()); }
    

    

    

    

    

    
}

