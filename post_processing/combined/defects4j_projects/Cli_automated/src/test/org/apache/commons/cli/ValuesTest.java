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

import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ValuesTest extends TestCase
{
    /** CommandLine instance */
    private CommandLine _cmdline = null;
    private Option _option = null;

    public static Test suite() { 
        return new TestSuite( ValuesTest.class );
    }

    public ValuesTest( String name )
    {
        super( name );
    }

    public void setUp()
    {
        Options opts = new Options();

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
        
        opts.addOption( OptionBuilder.withLongOpt( "e" )
                                     .hasArgs()
                                     .withDescription( "set -e ")
                                     .create( 'e' ) );

        opts.addOption("f",
                       "f",
                       false,
                       "jk");
        
        opts.addOption( OptionBuilder.withLongOpt( "g" )
                        .hasArgs( 2 )
                        .withDescription( "set -g")
                        .create( 'g' ) );

        opts.addOption( OptionBuilder.withLongOpt( "h" )
                        .hasArgs( 2 )
                        .withDescription( "set -h")
                        .create( 'h' ) );

        opts.addOption( OptionBuilder.withLongOpt( "i" )
                        .withDescription( "set -i")
                        .create( 'i' ) );

        opts.addOption( OptionBuilder.withLongOpt( "j" )
                        .hasArgs( )
                        .withDescription( "set -j")
                        .withValueSeparator( '=' )
                        .create( 'j' ) );

        opts.addOption( OptionBuilder.withLongOpt( "k" )
                        .hasArgs( )
                        .withDescription( "set -k")
                        .withValueSeparator( '=' )
                        .create( 'k' ) );

        _option = OptionBuilder.withLongOpt( "m" )
                        .hasArgs( )
                        .withDescription( "set -m")
                        .withValueSeparator( )
                        .create( 'm' );

        opts.addOption( _option );
        
        String[] args = new String[] { "-a",
                                       "-b", "foo",
                                       "--c",
                                       "--d", "bar",
                                       "-e", "one", "two",
                                       "-f",
                                       "arg1", "arg2",
                                       "-g", "val1", "val2" , "arg3",
                                       "-h", "val1", "-i",
                                       "-h", "val2",
                                       "-jkey=value",
                                       "-j", "key=value",
                                       "-kkey1=value1", 
                                       "-kkey2=value2",
                                       "-mkey=value"};

        CommandLineParser parser = new PosixParser();

        try
        {
            _cmdline = parser.parse(opts,args);
        }
        catch (ParseException e)
        {
            fail("Cannot setUp() CommandLine: " + e.toString());
        }
    }

    public void tearDown()
    {

    }

public void testCLI134() throws ParseException { 
     final String debugOpt = "debug"; 
     Option debug = OptionBuilder.withArgName(debugOpt).withDescription("turn on debugging").withLongOpt(debugOpt).hasArg().create('d'); 
     Options options = new Options(); 
     options.addOption(debug); 
     CommandLine commandLine = new PosixParser().parse(options, new String[] { "-d", "true" }); 
     assertEquals("true", commandLine.getOptionValue(debugOpt)); 
     assertEquals("true", commandLine.getOptionValue('d')); 
     assertTrue(commandLine.hasOption('d')); 
     assertTrue(commandLine.hasOption(debugOpt)); 
 }
    

    

    

    

    

    

    

    /**
     * jkeyes - commented out this test as the new architecture
     * breaks this type of functionality.  I have left the test 
     * here in case I get a brainwave on how to resolve this.
     */
    /*
    public void testGetValue()
    {
        // the 'm' option
        assertTrue( _option.getValues().length == 2 );
        assertEquals( _option.getValue(), "key" );
        assertEquals( _option.getValue( 0 ), "key" );
        assertEquals( _option.getValue( 1 ), "value" );

        try {
            assertEquals( _option.getValue( 2 ), "key" );
            fail( "IndexOutOfBounds not caught" );
        }
        catch( IndexOutOfBoundsException exp ) {
            
        }

        try {
            assertEquals( _option.getValue( -1 ), "key" );
            fail( "IndexOutOfBounds not caught" );
        }
        catch( IndexOutOfBoundsException exp ) {

        }
    }
    */
}
