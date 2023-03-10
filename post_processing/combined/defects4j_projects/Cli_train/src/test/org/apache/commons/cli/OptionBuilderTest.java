/**
 * Copyright 2001-2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.cli;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

public class OptionBuilderTest extends TestCase {

    public OptionBuilderTest( String name ) {
        super( name );
    }

    public static Test suite() { 
        return new TestSuite( OptionBuilderTest.class ); 
    }

    public static void main( String args[] ) { 
        TestRunner.run( suite() );
    }


public void testBaseOptionStringOpt8() { 
     Option base = OptionBuilder.withDescription("option description").create("o"); 
     assertEquals("o", base.getOpt()); 
     assertEquals("option description", base.getDescription()); 
     assertTrue(!base.hasArg()); 
 } 


public void testOptionArgNumbers21() { 
     Option opt = OptionBuilder.withDescription("option description").hasArgs(2).create('o'); 
     assertEquals(2, opt.getArgs()); 
 } 


public void testCompleteOption24() { 
     Option simple = OptionBuilder.withLongOpt("simple option").hasArg().isRequired().hasArgs().withType(new Float(10)).withDescription("this is a simple option").create('s'); 
     assertEquals("s", simple.getOpt()); 
     assertEquals("simple option", simple.getLongOpt()); 
     assertEquals("this is a simple option", simple.getDescription()); 
     assertEquals(simple.getType().getClass(), Float.class); 
     assertTrue(simple.hasArg()); 
     assertTrue(simple.isRequired()); 
     assertTrue(simple.hasArgs()); 
 } 


public void testTwoCompleteOptions30() { 
     Option simple = OptionBuilder.withLongOpt("simple option").hasArg().isRequired().hasArgs().withType(new Float(10)).withDescription("this is a simple option").create('s'); 
     assertEquals("s", simple.getOpt()); 
     assertEquals("simple option", simple.getLongOpt()); 
     assertEquals("this is a simple option", simple.getDescription()); 
     assertEquals(simple.getType().getClass(), Float.class); 
     assertTrue(simple.hasArg()); 
     assertTrue(simple.isRequired()); 
     assertTrue(simple.hasArgs()); 
     simple = OptionBuilder.withLongOpt("dimple option").hasArg().withDescription("this is a dimple option").create('d'); 
     assertEquals("d", simple.getOpt()); 
     assertEquals("dimple option", simple.getLongOpt()); 
     assertEquals("this is a dimple option", simple.getDescription()); 
     assertNull(simple.getType()); 
     assertTrue(simple.hasArg()); 
     assertTrue(!simple.isRequired()); 
     assertTrue(!simple.hasArgs()); 
 } 


public void testIllegalOptions31() { 
     try { 
         Option opt = OptionBuilder.withDescription("option description").create('"'); 
         fail("IllegalArgumentException not caught"); 
     } catch (IllegalArgumentException exp) { 
     } 
     try { 
         Option opt = OptionBuilder.create("opt`"); 
         fail("IllegalArgumentException not caught"); 
     } catch (IllegalArgumentException exp) { 
     } 
     try { 
         Option opt = OptionBuilder.create("opt"); 
     } catch (IllegalArgumentException exp) { 
         fail("IllegalArgumentException caught"); 
     } 
 } 

    

    

    

    

    

    

    
}
