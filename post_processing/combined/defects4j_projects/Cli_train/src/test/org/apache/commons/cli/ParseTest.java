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

public class ParseTest extends TestCase
{

    private Options _options = null;
    private CommandLineParser _parser = null;

    public static Test suite() { 
        return new TestSuite(ParseTest.class); 
    }

    public ParseTest(String name)
    {
        super(name);
    }

    public void setUp()
    {
        _options = new Options()
            .addOption("a",
                       "enable-a",
                       false,
                       "turn [a] on or off")
            .addOption("b",
                       "bfile",
                       true,
                       "set the value of [b]")
            .addOption("c",
                       "copt",
                       false,
                       "turn [c] on or off");

        _parser = new PosixParser();
    }

    public void tearDown()
    {

    }


public void testMissingArg18() { 
     String[] args = new String[] { "-acb" }; 
     boolean caught = false; 
     try { 
         CommandLine cl = _parser.parse(_options, args); 
     } catch (MissingArgumentException e) { 
         caught = true; 
     } catch (ParseException e) { 
         fail(e.toString()); 
     } 
     assertTrue("Confirm MissingArgumentException caught", caught); 
 } 


public void testExtraOption37() { 
     String[] args = new String[] { "-adbtoast", "foo", "bar" }; 
     boolean caught = false; 
     try { 
         CommandLine cl = _parser.parse(_options, args); 
         assertTrue("Confirm -a is set", cl.hasOption("a")); 
         assertTrue("Confirm -b is set", cl.hasOption("b")); 
         assertTrue("confirm arg of -b", cl.getOptionValue("b").equals("toast")); 
         assertTrue("Confirm size of extra args", cl.getArgList().size() == 3); 
     } catch (UnrecognizedOptionException e) { 
         caught = true; 
     } catch (ParseException e) { 
         fail(e.toString()); 
     } 
     assertTrue("Confirm UnrecognizedOptionException caught", caught); 
 } 

    

    

    

    

    

    

    

    

    

    
}
