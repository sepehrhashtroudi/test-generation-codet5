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
public void testEmptyFile3() throws Exception { 
     CSVParser parser = new CSVParser("", CSVFormat.DEFAULT); 
     assertNull(parser.getRecord()); 
 }
@Test
public void testEndOfFileBehaviorCSV9() throws Exception { 
     String[] codes = { "hello,\r\n\r\nworld,\r\n", "hello,\r\n\r\nworld,", "hello,\r\n\r\nworld,\"\"\r\n", "hello,\r\n\r\nworld,\"\"", "hello,\r\n\r\nworld,\n", "hello,\r\n\r\nworld,", "hello,\r\n\r\nworld,\"\"\n", "hello,\r\n\r\nworld,\"\"" }; 
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
public void testForEach10() throws Exception { 
     List<CSVRecord> records = new ArrayList<CSVRecord>(); 
     Reader in = new StringReader("a,b,c\n1,2,3\nx,y,z"); 
     for (CSVRecord record : CSVFormat.DEFAULT.parse(in)) { 
         records.add(record); 
     } 
     assertEquals(3, records.size()); 
     assertArrayEquals(new String[] { "a", "b", "c" }, records.get(0).values()); 
     assertArrayEquals(new String[] { "1", "2", "3" }, records.get(1).values()); 
     assertArrayEquals(new String[] { "x", "y", "z" }, records.get(2).values()); 
 }
@Test
public void testIterator15() throws Exception { 
     Reader in = new StringReader("a,b,c\n1,2,3\nx,y,z"); 
     Iterator<CSVRecord> iterator = CSVFormat.DEFAULT.parse(in).iterator(); 
     assertTrue(iterator.hasNext()); 
     try { 
         iterator.remove(); 
         fail("expected UnsupportedOperationException"); 
     } catch (UnsupportedOperationException expected) { 
     } 
     assertArrayEquals(new String[] { "a", "b", "c" }, iterator.next().values()); 
     assertArrayEquals(new String[] { "1", "2", "3" }, iterator.next().values()); 
     assertTrue(iterator.hasNext()); 
     assertTrue(iterator.hasNext()); 
     assertTrue(iterator.hasNext()); 
     assertArrayEquals(new String[] { "x", "y", "z" }, iterator.next().values()); 
     assertFalse(iterator.hasNext()); 
     try { 
         iterator.next(); 
         fail("NoSuchElementException expected"); 
     } catch (NoSuchElementException e) { 
     } 
 }
@Test
public void testBackslashEscaping17() throws IOException { 
     String code = "one,two,three\n" + "'',''\n" + "/',/'\n" + "'/'','/''\n" + "'''',''''\n" + "/,,/,\n" + "//,//\n" + "'//','//'\n" + "   8   ,   \"quoted \"\" /\" // string\"   \n" + "9,   /\n   \n" + ""; 
     String[][] res = { { "one", "two", "three" }, { "", "" }, { "'", "'" }, { "'", "'" }, { "'", "'" }, { ",", "," }, { "/", "/" }, { "/", "/" }, { "   8   ", "   \"quoted \"\" \" / string\"   " }, { "9", "   \n   " } }; 
     CSVFormat format = new CSVFormat(',', '\'', CSVFormat.DISABLED, '/', false, true, "\r\n", null); 
     CSVParser parser = new CSVParser(code, format); 
     List<CSVRecord> records = parser.getRecords(); 
     assertTrue(records.size() > 0); 
     for (int i = 0; i < res.length; i++) { 
         assertArrayEquals(res[i], records.get(i).values()); 
     } 
 }
@Test
public void testGetLineNumberWithCRLF18() throws Exception { 
     CSVParser parser = new CSVParser("a\r\nb\r\nc", CSVFormat.DEFAULT.withLineSeparator("\r\n")); 
     assertEquals(0, parser.getLineNumber()); 
     assertNotNull(parser.getRecord()); 
     assertEquals(1, parser.getLineNumber()); 
     assertNotNull(parser.getRecord()); 
     assertEquals(2, parser.getLineNumber()); 
     assertNotNull(parser.getRecord()); 
     assertEquals(2, parser.getLineNumber()); 
     assertNull(parser.getRecord()); 
 }
@Test
public void testHeader20() throws Exception { 
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
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    
}
