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
 * <p>
 * This is a collection of tests that test real world
 * applications command lines.
 * </p>
 * 
 * <p>
 * The following are the applications that are tested:
 * <ul>
 * <li>Ant</li>
 * </ul>
 * </p>
 *
 * @author John Keyes (john at integralsource.com)
 */
public class ApplicationTest extends TestCase {

    public static Test suite() { 
        return new TestSuite(ApplicationTest.class); 
    }

    public ApplicationTest(String name)
    {
        super(name);
    }
    
    /**
     *	
     */

public void testAnt5() { 
     CommandLineParser parser = new GnuParser(); 
     Options options = new Options(); 
     options.addOption("help", false, "print this message"); 
     options.addOption("projecthelp", false, "print project help information"); 
     options.addOption("version", false, "print the version information and exit"); 
     options.addOption("quiet", false, "be extra quiet"); 
     options.addOption("verbose", false, "be extra verbose"); 
     options.addOption("debug", false, "print debug information"); 
     options.addOption("version", false, "produce logging information without adornments"); 
     options.addOption("logfile", true, "use given file for log"); 
     options.addOption("logger", true, "the class which is to perform the logging"); 
     options.addOption("listener", true, "add an instance of a class as a project listener"); 
     options.addOption("buildfile", true, "use given buildfile"); 
     options.addOption(OptionBuilder.withDescription("use value for given property").hasArgs().withValueSeparator().create('D')); 
     options.addOption("find", true, "search for buildfile towards the root of the filesystem and use it"); 
     String[] args = new String[] { "-buildfile", "mybuild.xml", "-Dproperty=value", "-Dproperty1=value1", "-projecthelp" }; 
     try { 
         CommandLine line = parser.parse(options, args); 
         String[] opts = line.getOptionValues("D"); 
         assertEquals("property", opts[0]); 
         assertEquals("value", opts[1]); 
         assertEquals("property1", opts[2]); 
         assertEquals("value1", opts[3]); 
         assertEquals(line.getOptionValue("buildfile"), "mybuild.xml"); 
         assertTrue(line.hasOption("projecthelp")); 
     } catch (ParseException exp) { 
         fail("Unexpected exception:" + exp.getMessage()); 
     } 
 } 

    

    /**
     * Ant test
     */
    

}
