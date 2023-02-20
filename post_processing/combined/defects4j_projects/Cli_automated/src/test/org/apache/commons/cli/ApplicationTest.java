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
public void test122105() { 
     Options mainOptions = new Options(); 
     String[] argv = new String[] { "-exec", "-exec_opt1", "-exec_opt2" }; 
     OptionGroup grp = new OptionGroup(); 
     grp.addOption(new Option("exec", false, "description for this option")); 
     grp.addOption(new Option("rep", false, "description for this option")); 
     mainOptions.addOptionGroup(grp); 
     Options execOptions = new Options(); 
     execOptions.addOption("exec_opt1", false, " desc"); 
     execOptions.addOption("exec_opt2", false, " desc"); 
     Options repOptions = new Options(); 
     repOptions.addOption("repopto", false, "desc"); 
     repOptions.addOption("repoptt", false, "desc"); 
     GnuParser parser = new GnuParser(); 
     try { 
         CommandLine cmd = parser.parse(mainOptions, argv, true); 
         argv = cmd.getArgs(); 
         if (cmd.hasOption("exec")) { 
             cmd = parser.parse(execOptions, argv, false); 
             assertTrue(cmd.hasOption("exec_opt1")); 
             assertTrue(cmd.hasOption("exec_opt2")); 
         } else if (cmd.hasOption("rep")) { 
             cmd = parser.parse(repOptions, argv, false); 
         } else { 
             fail("exec option not found"); 
         } 
     } catch (ParseException exp) { 
         fail("Unexpected exception: " + exp.getMessage()); 
     } 
 }
public void test1145616() { 
     Options options = new Options(); 
     options.addOption(OptionBuilder.hasOptionalArg().create('a')); 
     options.addOption(OptionBuilder.hasArg().create('b')); 
     String[] args = new String[] { "-a", "-bvalue" }; 
     CommandLineParser parser = new PosixParser(); 
     try { 
         CommandLine cmd = parser.parse(options, args); 
         assertEquals(cmd.getOptionValue('b'), "value"); 
     } catch (ParseException exp) { 
         fail("Unexpected Exception: " + exp.getMessage()); 
     } 
     options = new Options(); 
     options.addOption(OptionBuilder.hasOptionalArg().create('a')); 
     options.addOption(OptionBuilder.hasArg().create('b')); 
     args = new String[] { "-a", "-b", "value" }; 
     parser = new GnuParser(); 
     try { 
         CommandLine cmd = parser.parse(options, args); 
         assertEquals(cmd.getOptionValue('b'), "value"); 
     } catch (ParseException exp) { 
         fail("Unexpected Exception: " + exp.getMessage()); 
     } 
 }
public void test1168017() { 
     Options options = new Options(); 
     options.addOption("f", true, "foobar"); 
     options.addOption("m", true, "missing"); 
     String[] args = new String[] { "-f", "foo" }; 
     CommandLineParser parser = new PosixParser(); 
     try { 
         CommandLine cmd = parser.parse(options, args); 
         try { 
             cmd.getOptionValue("f", "default f"); 
             cmd.getOptionValue("m", "default m"); 
         } catch (NullPointerException exp) { 
             fail("NullPointer caught: " + exp.getMessage()); 
         } 
     } catch (ParseException exp) { 
         fail("Unexpected Exception: " + exp.getMessage()); 
     } 
 }
public void test1564818() throws Exception { 
     CommandLineParser parser = new PosixParser(); 
     final String[] args = new String[] { "-m", "\"Two Words\"" }; 
     Option m = OptionBuilder.hasArgs().create("m"); 
     Options options = new Options(); 
     options.addOption(m); 
     CommandLine line = parser.parse(options, args); 
     assertEquals("Two Words", line.getOptionValue("m")); 
 }
public void testCompleteOption20() { 
     Option simple = OptionBuilder.withLongOpt("simple option").hasArg().isRequired().hasArgs().withType(new Float(10)).withDescription("this is a simple option").create('s'); 
     assertEquals("s", simple.getOpt()); 
     assertEquals("simple option", simple.getLongOpt()); 
     assertEquals("this is a simple option", simple.getDescription()); 
     assertEquals(simple.getType().getClass(), Float.class); 
     assertTrue(simple.hasArg()); 
     assertTrue(simple.isRequired()); 
     assertTrue(simple.hasArgs()); 
 }
public void test1168021() { 
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
    

    /**
     * Ant test
     */
    

}
