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

/**
 * @author John Keyes (john at integralsource.com)
 * @version $Revision$
 */
public class OptionGroupTest extends TestCase
{

    private Options _options = null;
    private CommandLineParser parser = new PosixParser();


    public static Test suite() 
    { 
        return new TestSuite ( OptionGroupTest.class ); 
    }

    public OptionGroupTest( String name )
    {
        super( name );
    }

    public void setUp()
    {
        Option file = new Option( "f", "file", false, "file to process" );
        Option dir = new Option( "d", "directory", false, "directory to process" );
        OptionGroup group = new OptionGroup();
        group.addOption( file );
        group.addOption( dir );
        _options = new Options().addOptionGroup( group );

        Option section = new Option( "s", "section", false, "section to process" );
        Option chapter = new Option( "c", "chapter", false, "chapter to process" );
        OptionGroup group2 = new OptionGroup();
        group2.addOption( section );
        group2.addOption( chapter );

        _options.addOptionGroup( group2 );

        Option importOpt = new Option( null, "import", false, "section to process" );
        Option exportOpt = new Option( null, "export", false, "chapter to process" );
        OptionGroup group3 = new OptionGroup();
        group3.addOption( importOpt );
        group3.addOption( exportOpt );
        _options.addOptionGroup( group3 );

        _options.addOption( "r", "revision", false, "revision number" );
    }

    public void tearDown()
    {
    }

public void testAlreadySelectedException5() { final String message = "test"; try { throw new AlreadySelectedException(message); } catch (final AlreadySelectedException e) { assertEquals(message, e.getMessage()); } }
    

    

    

    

    

    

    

    

    

    


}
