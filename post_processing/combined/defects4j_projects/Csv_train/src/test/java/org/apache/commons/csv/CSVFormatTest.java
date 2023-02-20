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

package org.apache.commons.csv;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

public class CSVFormatTest {

@Test
public void testFormat7() { 
     CSVFormat format = CSVFormat.DEFAULT; 
     assertEquals("", format.format()); 
     assertEquals("a,b,c", format.format("a", "b", "c")); 
     assertEquals("\"x,y\",z", format.format("x,y", "z")); 
 }
@Test
public void testImmutalibity8() { 
     CSVFormat format = new CSVFormat('!', '!', '!', '!', true, true, "\r\n", null); 
     format.withDelimiter('?'); 
     format.withEncapsulator('?'); 
     format.withCommentStart('?'); 
     format.withLineSeparator("?"); 
     format.withEscape('?'); 
     format.withSurroundingSpacesIgnored(false); 
     format.withEmptyLinesIgnored(false); 
     assertEquals('!', format.getDelimiter()); 
     assertEquals('!', format.getEncapsulator()); 
     assertEquals('!', format.getCommentStart()); 
     assertEquals('!', format.getEscape()); 
     assertEquals("\r\n", format.getLineSeparator()); 
     assertTrue(format.isSurroundingSpacesIgnored()); 
     assertTrue(format.isEmptyLinesIgnored()); 
 }
@Test
public void testValidation13() { 
     CSVFormat format = CSVFormat.DEFAULT; 
     try { 
         format.withDelimiter('\n'); 
         fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     try { 
         format.withEscape('\r'); 
         fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     try { 
         format.withEncapsulator('\n'); 
         fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     try { 
         format.withCommentStart('\r'); 
         fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     try { 
         format.withDelimiter('!').withEscape('!').validate(); 
         fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     try { 
         format.withDelimiter('!').withCommentStart('!').validate(); 
         fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     try { 
         format.withEncapsulator('!').withCommentStart('!').validate(); 
         fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     format.withEncapsulator(CSVFormat.DISABLED).withCommentStart(CSVFormat.DISABLED).validate(); 
     try { 
         format.withEscape('!').withCommentStart('!').validate(); 
         fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     format.withEscape(CSVFormat.DISABLED).withCommentStart(CSVFormat.DISABLED).validate(); 
     try { 
         format.withEncapsulator('!').withDelimiter('!').validate(); 
         fail(); 
     } catch (IllegalArgumentException e) { 
     } 
 }
    

    

    
    
    

    
} 
