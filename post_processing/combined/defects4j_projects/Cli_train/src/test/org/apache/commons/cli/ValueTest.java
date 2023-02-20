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

import java.util.Arrays;
import java.util.Properties;

public class ValueTest extends TestCase
{

    public static Test suite() { 
        return new TestSuite(ValueTest.class); 
    }

    private CommandLine _cl = null;
    private CommandLine _clOptional = null;
    private Options opts = new Options();

    public ValueTest(String name)
    {
        super(name);
    }

    public void setUp()
    {
        opts.addOption("a",
                       false,
                       "toggle -a");

        opts.addOption("b",
                       true,
                       "set -b");

        opts.addOption("c",
                       "c",
                       false,
                       "toggle -c");

        opts.addOption("d",
                       "d",
                       true,
                       "set -d");

        opts.addOption( OptionBuilder.hasOptionalArg()
                        .create( 'e') );

        opts.addOption( OptionBuilder.hasOptionalArg()
                        .withLongOpt( "fish" )
                        .create( ) );

        opts.addOption( OptionBuilder.hasOptionalArgs()
                        .withLongOpt( "gravy" )
                        .create( ) );

        opts.addOption( OptionBuilder.hasOptionalArgs( 2 )
                        .withLongOpt( "hide" )
                        .create( ) );

        opts.addOption( OptionBuilder.hasOptionalArgs( 2 )
                        .create( 'i' ) );

        opts.addOption( OptionBuilder.hasOptionalArgs( )
                        .create( 'j' ) );

        opts.addOption( OptionBuilder.hasArgs( ).withValueSeparator( ',' )
                        .create( 'k' ) );

        String[] args = new String[] { "-a",
            "-b", "foo",
            "--c",
            "--d", "bar" 
        };

        try
        {
            CommandLineParser parser = new PosixParser();
            _cl = parser.parse(opts,args);
        }
        catch (ParseException e)
        {
            fail("Cannot setUp() CommandLine: " + e.toString());
        }
    }

    public void tearDown()
    {

    }


public void testLongOptionalNArgValues12() { 
     String[] args = new String[] { "--hide", "house", "hair", "head" }; 
     CommandLineParser parser = new PosixParser(); 
     try { 
         CommandLine cmd = parser.parse(opts, args); 
         assertTrue(cmd.hasOption("hide")); 
         assertEquals("house", cmd.getOptionValue("hide")); 
         assertEquals("house", cmd.getOptionValues("hide")[0]); 
         assertEquals("hair", cmd.getOptionValues("hide")[1]); 
         assertEquals(cmd.getArgs().length, 1); 
         assertEquals("head", cmd.getArgs()[0]); 
     } catch (ParseException e) { 
         fail("Cannot setUp() CommandLine: " + e.toString()); 
     } 
 } 


public void testPropertyOptionMultipleValues22() { 
     Properties properties = new Properties(); 
     properties.setProperty("k", "one,two"); 
     CommandLineParser parser = new PosixParser(); 
     String[] values = new String[] { "one", "two" }; 
     try { 
         CommandLine cmd = parser.parse(opts, null, properties); 
         assertTrue(cmd.hasOption("k")); 
         assertTrue(Arrays.equals(values, cmd.getOptionValues('k'))); 
     } catch (ParseException e) { 
         fail("Cannot setUp() CommandLine: " + e.toString()); 
     } 
 } 


public void testLongOptionalNoValue32() { 
     String[] args = new String[] { "--fish" }; 
     try { 
         CommandLineParser parser = new PosixParser(); 
         CommandLine cmd = parser.parse(opts, args); 
         assertTrue(cmd.hasOption("fish")); 
         assertNull(cmd.getOptionValue("fish")); 
     } catch (ParseException e) { 
         fail("Cannot setUp() CommandLine: " + e.toString()); 
     } 
 } 


public void testPropertyOptionFlags39() { 
     Properties properties = new Properties(); 
     properties.setProperty("a", "true"); 
     properties.setProperty("c", "yes"); 
     properties.setProperty("e", "1"); 
     CommandLineParser parser = new PosixParser(); 
     try { 
         CommandLine cmd = parser.parse(opts, null, properties); 
         assertTrue(cmd.hasOption("a")); 
         assertTrue(cmd.hasOption("c")); 
         assertTrue(cmd.hasOption("e")); 
     } catch (ParseException e) { 
         fail("Cannot setUp() CommandLine: " + e.toString()); 
     } 
     properties = new Properties(); 
     properties.setProperty("a", "false"); 
     properties.setProperty("c", "no"); 
     properties.setProperty("e", "0"); 
     try { 
         CommandLine cmd = parser.parse(opts, null, properties); 
         assertTrue(!cmd.hasOption("a")); 
         assertTrue(!cmd.hasOption("c")); 
         assertTrue(!cmd.hasOption("e")); 
     } catch (ParseException e) { 
         fail("Cannot setUp() CommandLine: " + e.toString()); 
     } 
     properties = new Properties(); 
     properties.setProperty("a", "TRUE"); 
     properties.setProperty("c", "nO"); 
     properties.setProperty("e", "TrUe"); 
     try { 
         CommandLine cmd = parser.parse(opts, null, properties); 
         assertTrue(cmd.hasOption("a")); 
         assertTrue(!cmd.hasOption("c")); 
         assertTrue(cmd.hasOption("e")); 
     } catch (ParseException e) { 
         fail("Cannot setUp() CommandLine: " + e.toString()); 
     } 
     properties = new Properties(); 
     properties.setProperty("a", "just a string"); 
     properties.setProperty("e", ""); 
     try { 
         CommandLine cmd = parser.parse(opts, null, properties); 
         assertTrue(!cmd.hasOption("a")); 
         assertTrue(!cmd.hasOption("c")); 
         assertTrue(!cmd.hasOption("e")); 
     } catch (ParseException e) { 
         fail("Cannot setUp() CommandLine: " + e.toString()); 
     } 
 } 

    

    

    

    

    

    

    

    

    

    

    

    

    

     

    

    

}
