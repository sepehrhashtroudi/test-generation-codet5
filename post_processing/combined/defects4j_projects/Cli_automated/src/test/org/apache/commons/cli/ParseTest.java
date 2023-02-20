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

public void testExtraOption8() { 
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
public void test1145810() { 
     Options options = new Options(); 
     options.addOption(OptionBuilder.withValueSeparator('=').hasArgs().create('D')); 
     options.addOption(OptionBuilder.withValueSeparator(':').hasArgs().create('p')); 
     String[] args = new String[] { "-DJAVA_HOME=/opt/java", "-pfile1:file2:file3" }; 
     CommandLineParser parser = new PosixParser(); 
     try { 
         CommandLine cmd = parser.parse(options, args); 
         String[] values = cmd.getOptionValues('D'); 
         assertEquals(values[0], "JAVA_HOME"); 
         assertEquals(values[1], "/opt/java"); 
         values = cmd.getOptionValues('p'); 
         assertEquals(values[0], "file1"); 
         assertEquals(values[1], "file2"); 
         assertEquals(values[2], "file3"); 
         java.util.Iterator iter = cmd.iterator(); 
         while (iter.hasNext()) { 
             Option opt = (Option) iter.next(); 
             switch(opt.getId()) { 
                 case 'D': 
                     assertEquals(opt.getValue(0), "JAVA_HOME"); 
                     assertEquals(opt.getValue(1), "/opt/java"); 
                     break; 
                 case 'p': 
                     assertEquals(opt.getValue(0), "file1"); 
                     assertEquals(opt.getValue(1), "file2"); 
                     assertEquals(opt.getValue(2), "file3"); 
                     break; 
                 default: 
                     fail("-D option not found"); 
             } 
         } 
     } catch (ParseException exp) { 
         fail("Unexpected Exception:\nMessage:" + exp.getMessage() + "Type: " + exp.getClass().getName()); 
     } 
 }
    

    

    

    

    

    

    

    

    

    
}
