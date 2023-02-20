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
import java.io.StringReader;

import org.junit.Test;

import static org.apache.commons.csv.Token.Type.*;
import static org.junit.Assert.*;

public class CSVLexerTest {
    
    private CSVLexer getLexer(String input, CSVFormat format) {
        return new CSVLexer(format, new ExtendedBufferedReader(new StringReader(input)));
    }

    private void assertTokenEquals(Token.Type expectedType, String expectedContent, Token token) {
        assertEquals("Token type", expectedType, token.type);
        assertEquals("Token content", expectedContent, token.content.toString());
    }
    
    // Single line (without comment)
@Test
public void testNextToken22() throws IOException { 
     String code = "1,2,3,\na,b x,c\n#foo\n\nd,e,\n\n"; 
     CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#'); 
     CSVLexer parser = getLexer(code, format); 
     assertTokenEquals(TOKEN, "1", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "2", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "3", parser.nextToken(new Token())); 
     assertTokenEquals(EORECORD, "", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "a", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "b x", parser.nextToken(new Token())); 
     assertTokenEquals(EORECORD, "c", parser.nextToken(new Token())); 
     assertTokenEquals(EORECORD, "", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "d", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "e", parser.nextToken(new Token())); 
     assertTokenEquals(EORECORD, "", parser.nextToken(new Token())); 
     assertTokenEquals(EOF, "", parser.nextToken(new Token())); 
     assertTokenEquals(EOF, "", parser.nextToken(new Token())); 
 }
@Test
public void testNextToken54() throws IOException { 
     String code = "a,\"foo\n\",b\n\"foo\n  baar ,,,\"\n\"\n\t \n\""; 
     CSVLexer parser = getLexer(code, CSVFormat.DEFAULT); 
     assertTokenEquals(TOKEN, "a", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "foo\n", parser.nextToken(new Token())); 
     assertTokenEquals(EORECORD, "b", parser.nextToken(new Token())); 
     assertTokenEquals(EORECORD, "foo\n  baar ,,,", parser.nextToken(new Token())); 
     assertTokenEquals(EOF, "\n\t \n", parser.nextToken(new Token())); 
 }
@Test
public void testNextToken65() throws IOException { 
     String code = "a;'b and '' more\n'\n!comment;;;;\n;;"; 
     CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';').withEncapsulator('\'').withCommentStart('!'); 
     CSVLexer parser = getLexer(code, format); 
     assertTokenEquals(TOKEN, "a", parser.nextToken(new Token())); 
     assertTokenEquals(EORECORD, "b and ' more\n", parser.nextToken(new Token())); 
 }
@Test
public void testNextToken112() throws IOException { 
     String code = "abc,def, hijk,  lmnop,   qrst,uv ,wxy   ,z , ,"; 
     CSVLexer parser = getLexer(code, CSVFormat.DEFAULT.withSurroundingSpacesIgnored(true)); 
     assertTokenEquals(TOKEN, "abc", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "def", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "hijk", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "lmnop", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "qrst", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "uv", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "wxy", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "z", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "", parser.nextToken(new Token())); 
     assertTokenEquals(EOF, "", parser.nextToken(new Token())); 
 }
@Test
public void testNextToken414() throws IOException { 
     String code = "a,\"foo\",b\na,   \" foo\",b\na,\"foo \"  ,b\na,  \" foo \"  ,b"; 
     CSVLexer parser = getLexer(code, CSVFormat.DEFAULT.withSurroundingSpacesIgnored(true)); 
     assertTokenEquals(TOKEN, "a", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "foo", parser.nextToken(new Token())); 
     assertTokenEquals(EORECORD, "b", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "a", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, " foo", parser.nextToken(new Token())); 
     assertTokenEquals(EORECORD, "b", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "a", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "foo ", parser.nextToken(new Token())); 
     assertTokenEquals(EORECORD, "b", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, "a", parser.nextToken(new Token())); 
     assertTokenEquals(TOKEN, " foo ", parser.nextToken(new Token())); 
     assertTokenEquals(EOF, "b", parser.nextToken(new Token())); 
 }
    

    // multiline including comments (and empty lines)
    

    // simple token with escaping
    

    // encapsulator tokenizer (sinle line)
    

    // encapsulator tokenizer (multi line, delimiter in string)
    

    // change delimiters, comment, encapsulater
    

    // From CSV-1
    
}
