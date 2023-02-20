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
    

    // multiline including comments (and empty lines)
    

    // simple token with escaping
    

    // encapsulator tokenizer (sinle line)
    

    // encapsulator tokenizer (multi line, delimiter in string)
    

    // change delimiters, comment, encapsulater
    

    // From CSV-1
    
}
