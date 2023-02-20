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

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * CSVParserTest
 *
 * The test are organized in three different sections:
 * The 'setter/getter' section, the lexer section and finally the parser
 * section. In case a test fails, you should follow a top-down approach for
 * fixing a potential bug (its likely that the parser itself fails if the lexer
 * has problems...).
 */
public class CSVParserTest {

    String code = "a,b,c,d\n"
                    + " a , b , 1 2 \n"
                    + "\"foo baar\", b,\n"
                    // + "   \"foo\n,,\n\"\",,\n\\\"\",d,e\n";
                    + "   \"foo\n,,\n\"\",,\n\"\"\",d,e\n";   // changed to use standard CSV escaping
    String[][] res = {
            {"a", "b", "c", "d"},
            {"a", "b", "1 2"},
            {"foo baar", "b", ""},
            {"foo\n,,\n\",,\n\"", "d", "e"}
    };

@Test
public void testEndOfFileBehaviorCSV2() throws Exception { 
     String[] codes = { "hello,\r\n\r\nworld,\r\n", "hello,\r\n\r\nworld,", "hello,\r\n\r\nworld,\"\"\r\n", "hello,\r\n\r\nworld,", "hello,\r\n\r\nworld,\"\"", "hello,\r\n\r\nworld,", "hello,\r\n\r\nworld,", "hello,\r\n\r\nworld,\"\"" }; 
     String[][] res = { { "hello", "" }, { "world", "" } }; 
     for (String code : codes) { 
         CSVParser parser = new CSVParser(new StringReader(code)); 
         List<CSVRecord> records = parser.getRecords(); 
         assertEquals(res.length, records.size()); 
         assertTrue(records.size() > 0); 
         for (int i = 0; i < res.length; i++) { 
             assertArrayEquals(res[i], records.get(i).values()); 
         } 
     } 
 }
@Test
public void testEndOfFileBehaviorCSV5() throws Exception { 
     String[] codes = { "hello,\r\n\r\nworld,\r\n", "hello,\r\n\r\nworld,", "hello,\r\n\r\nworld,\"\"\r\n", "hello,\r\n\r\nworld,\"\"", "hello,\r\n\r\nworld,\n", "hello,\r\n\r\nworld,", "hello,\r\n\r\nworld,", "hello,\r\n\r\nworld,\"\"" }; 
     String[][] res = { { "hello", "" }, { "world", "" } }; 
     for (String code : codes) { 
         CSVParser parser = new CSVParser(new StringReader(code)); 
         List<CSVRecord> records = parser.getRecords(); 
         assertEquals(res.length, records.size()); 
         assertTrue(records.size() > 0); 
         for (int i = 0; i < res.length; i++) { 
             assertArrayEquals(res[i], records.get(i).values()); 
         } 
     } 
 }
@Test
public void testHeader6() throws Exception { 
     Reader in = new StringReader("a,b,c\n1,2,3\nx,y,z"); 
     Iterator<CSVRecord> records = CSVFormat.DEFAULT.withHeader().parse(in).iterator(); 
     for (int i = 0; i < 2; i++) { 
         assertTrue(records.hasNext()); 
         CSVRecord record = records.next(); 
         assertEquals(record.get(0), record.get("a")); 
         assertEquals(record.get(1), record.get("b")); 
         assertEquals(record.get(2), record.get("c")); 
     } 
     assertFalse(records.hasNext()); 
 }
@Test
public void testImmutalibity7() { 
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
public void testImmutalibity8() throws IOException { 
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
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    
}
