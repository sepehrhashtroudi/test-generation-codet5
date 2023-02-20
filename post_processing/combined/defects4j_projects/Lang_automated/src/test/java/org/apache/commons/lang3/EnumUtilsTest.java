/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @version $Id$
 */
public class EnumUtilsTest {

@Test
public void test_generateBitVectorsFromArray104() { 
     assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class), 0L); 
     assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED), 1L); 
     assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.AMBER), 2L); 
     assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.GREEN), 4L); 
     assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, Traffic.AMBER), 3L); 
     assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, Traffic.GREEN), 5L); 
     assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.AMBER, Traffic.GREEN), 6L); 
     assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, Traffic.AMBER, Traffic.GREEN), 7L); 
     assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, Traffic.AMBER, Traffic.GREEN, Traffic.GREEN), 7L); 
 }
@Test(expected = NullPointerException.class) 
 public void test_generateBitVectors_nullClassWithArray106() { 
     EnumUtils.generateBitVectors(null, Traffic.RED); 
 }
@Test
public void test_generateBitVector432() { 
     assertEquals(0L, EnumUtils.generateBitVector(Traffic.class, EnumSet.noneOf(Traffic.class))); 
     assertEquals(1L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.RED))); 
     assertEquals(2L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.AMBER))); 
     assertEquals(4L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.GREEN))); 
     assertEquals(3L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.RED, Traffic.AMBER))); 
     assertEquals(5L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.RED, Traffic.GREEN))); 
     assertEquals(6L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.AMBER, Traffic.GREEN))); 
     assertEquals(7L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.RED, Traffic.AMBER, Traffic.GREEN))); 
 }
    

    

    

    

    

    

    

    

    
    
    

    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    

    

    
    
    
    
    

    
    
    

    

    
    
    

    private void assertArrayEquals(final long[] actual, final long... expected) {
        Assert.assertArrayEquals(expected, actual);
    }

    

    

    

    

    
    
    public void test_processBitVectors_longClass() {
        assertEquals(EnumSet.noneOf(TooMany.class), EnumUtils.processBitVectors(TooMany.class, 0L));
        assertEquals(EnumSet.of(TooMany.A), EnumUtils.processBitVectors(TooMany.class, 1L));
        assertEquals(EnumSet.of(TooMany.B), EnumUtils.processBitVectors(TooMany.class, 2L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.B), EnumUtils.processBitVectors(TooMany.class, 3L));
        assertEquals(EnumSet.of(TooMany.C), EnumUtils.processBitVectors(TooMany.class, 4L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 5L));
        assertEquals(EnumSet.of(TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 6L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 7L));

        assertEquals(EnumSet.noneOf(TooMany.class), EnumUtils.processBitVectors(TooMany.class, 0L, 0L));
        assertEquals(EnumSet.of(TooMany.A), EnumUtils.processBitVectors(TooMany.class, 0L, 1L));
        assertEquals(EnumSet.of(TooMany.B), EnumUtils.processBitVectors(TooMany.class, 0L, 2L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.B), EnumUtils.processBitVectors(TooMany.class, 0L, 3L));
        assertEquals(EnumSet.of(TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 4L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 5L));
        assertEquals(EnumSet.of(TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 6L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 7L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 7L));

        assertEquals(EnumSet.of(TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 0L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 1L));
        assertEquals(EnumSet.of(TooMany.B, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 2L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 3L));
        assertEquals(EnumSet.of(TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 4L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 5L));
        assertEquals(EnumSet.of(TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 6L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 7L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 7L));

        // demonstrate tolerance of irrelevant high-order digits:
        assertEquals(EnumSet.of(TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 0L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 1L));
        assertEquals(EnumSet.of(TooMany.B, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 2L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 3L));
        assertEquals(EnumSet.of(TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 4L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 5L));
        assertEquals(EnumSet.of(TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 6L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 7L));
        assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 7L));
    }

}

enum Traffic {
    RED, AMBER, GREEN
}

enum TooMany {
    A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,
    A1,B1,C1,D1,E1,F1,G1,H1,I1,J1,K1,L1,M1,N1,O1,P1,Q1,R1,S1,T1,U1,V1,W1,X1,Y1,Z1,
    A2,B2,C2,D2,E2,F2,G2,H2,I2,J2,K2,L2,M2;
}
