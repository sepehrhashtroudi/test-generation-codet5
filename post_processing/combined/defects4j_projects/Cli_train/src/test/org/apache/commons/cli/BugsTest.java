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

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BugsTest extends TestCase
{
    /** CommandLine instance */
    private CommandLine _cmdline = null;
    private Option _option = null;

    public static Test suite() { 
        return new TestSuite( BugsTest.class );
    }

    public BugsTest( String name )
    {
        super( name );
    }

    public void setUp()
    {
    }

    public void tearDown()
    {
    }


public void test212152() { 
     Options options = new Options(); 
     HelpFormatter formatter = new HelpFormatter(); 
     String SEP = System.getProperty("line.separator"); 
     String header = SEP + "Header"; 
     String footer = "Footer"; 
     StringWriter out = new StringWriter(); 
     formatter.printHelp(new PrintWriter(out), 80, "foobar", header, options, 2, 2, footer, true); 
     assertEquals("usage: foobar" + SEP + "" + SEP + "Header" + SEP + "" + SEP + "Footer" + SEP, out.toString()); 
 } 


public void test136664() { 
     Options options = new Options(); 
     Option dir = OptionBuilder.withDescription("dir").hasArg().create('d'); 
     options.addOption(dir); 
     final PrintStream oldSystemOut = System.out; 
     try { 
         final ByteArrayOutputStream bytes = new ByteArrayOutputStream(); 
         final PrintStream print = new PrintStream(bytes); 
         print.println(); 
         final String eol = bytes.toString(); 
         bytes.reset(); 
         System.setOut(new PrintStream(bytes)); 
         try { 
             HelpFormatter formatter = new HelpFormatter(); 
             formatter.printHelp("dir", options); 
         } catch (Exception exp) { 
             fail("Unexpected Exception: " + exp.getMessage()); 
         } 
         assertEquals("usage: dir" + eol + " -d <arg>   dir" + eol, bytes.toString()); 
     } finally { 
         System.setOut(oldSystemOut); 
     } 
 } 


public void test122109() { 
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


public void test1145611() { 
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


public void test1564815() throws Exception { 
     CommandLineParser parser = new PosixParser(); 
     final String[] args = new String[] { "-m", "\"Two Words\"" }; 
     Option m = OptionBuilder.hasArgs().create("m"); 
     Options options = new Options(); 
     options.addOption(m); 
     CommandLine line = parser.parse(options, args); 
     assertEquals("Two Words", line.getOptionValue("m")); 
 } 


public void test1145816() { 
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


public void test1393520() { 
     OptionGroup directions = new OptionGroup(); 
     Option left = new Option("l", "left", false, "go left"); 
     Option right = new Option("r", "right", false, "go right"); 
     Option straight = new Option("s", "straight", false, "go straight"); 
     Option forward = new Option("f", "forward", false, "go forward"); 
     forward.setRequired(true); 
     directions.addOption(left); 
     directions.addOption(right); 
     directions.setRequired(true); 
     Options opts = new Options(); 
     opts.addOptionGroup(directions); 
     opts.addOption(straight); 
     CommandLineParser parser = new PosixParser(); 
     boolean exception = false; 
     String[] args = new String[] {}; 
     try { 
         CommandLine line = parser.parse(opts, args); 
     } catch (ParseException exp) { 
         exception = true; 
     } 
     if (!exception) { 
         fail("Expected exception not caught."); 
     } 
     exception = false; 
     args = new String[] { "-s" }; 
     try { 
         CommandLine line = parser.parse(opts, args); 
     } catch (ParseException exp) { 
         exception = true; 
     } 
     if (!exception) { 
         fail("Expected exception not caught."); 
     } 
     exception = false; 
     args = new String[] { "-s", "-l" }; 
     try { 
         CommandLine line = parser.parse(opts, args); 
     } catch (ParseException exp) { 
         fail("Unexpected exception: " + exp.getClass().getName() + ":" + exp.getMessage()); 
     } 
     opts.addOption(forward); 
     args = new String[] { "-s", "-l", "-f" }; 
     try { 
         CommandLine line = parser.parse(opts, args); 
     } catch (ParseException exp) { 
         fail("Unexpected exception: " + exp.getClass().getName() + ":" + exp.getMessage()); 
     } 
 } 


public void test1504627() throws Exception { 
     CommandLineParser parser = new PosixParser(); 
     final String[] CLI_ARGS = new String[] { "-z", "c" }; 
     Option option = new Option("z", "timezone", true, "affected option"); 
     Options cliOptions = new Options(); 
     cliOptions.addOption(option); 
     parser.parse(cliOptions, CLI_ARGS); 
     cliOptions.addOption("c", "conflict", true, "conflict option"); 
     CommandLine line = parser.parse(cliOptions, CLI_ARGS); 
     assertEquals(option.getValue(), "c"); 
     assertTrue(!line.hasOption("c")); 
 } 


public void test1478635() throws Exception { 
     Option o = OptionBuilder.isRequired().withDescription("test").create("test"); 
     Options opts = new Options(); 
     opts.addOption(o); 
     opts.addOption(o); 
     CommandLineParser parser = new GnuParser(); 
     String[] args = new String[] { "-test" }; 
     CommandLine line = parser.parse(opts, args); 
     assertTrue(line.hasOption("test")); 
 } 


public void test1168036() { 
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

    

    

    

    

    

    

    

    

    

    

    

    
// Defects4J: flaky method
//     
// Defects4J: flaky method
//     public void test27635() {
//         Option help = new Option("h", "help", false, "print this message");
//         Option version = new Option("v", "version", false, "print version information");
//         Option newRun = new Option("n", "new", false, "Create NLT cache entries only for new items");
//         Option trackerRun = new Option("t", "tracker", false, "Create NLT cache entries only for tracker items");
//         
//         Option timeLimit = OptionBuilder.withLongOpt("limit")
//                                         .hasArg()
//                                         .withValueSeparator()
//                                         .withDescription("Set time limit for execution, in mintues")
//                                         .create("l");
//         
//         Option age = OptionBuilder.withLongOpt("age")
//                                         .hasArg()
//                                         .withValueSeparator()
//                                         .withDescription("Age (in days) of cache item before being recomputed")
//                                         .create("a");
//         
//         Option server = OptionBuilder.withLongOpt("server")
//                                         .hasArg()
//                                         .withValueSeparator()
//                                         .withDescription("The NLT server address")
//                                         .create("s");
//         
//         Option numResults = OptionBuilder.withLongOpt("results")
//                                         .hasArg()
//                                         .withValueSeparator()
//                                         .withDescription("Number of results per item")
//                                         .create("r");
//         
//         Option configFile = OptionBuilder.withLongOpt("config")
//                                         .hasArg()
//                                         .withValueSeparator()
//                                         .withDescription("Use the specified configuration file")
//                                         .create();
//         
//         Options mOptions = new Options();
//         mOptions.addOption(help);
//         mOptions.addOption(version);
//         mOptions.addOption(newRun);
//         mOptions.addOption(trackerRun);
//         mOptions.addOption(timeLimit);
//         mOptions.addOption(age);
//         mOptions.addOption(server);
//         mOptions.addOption(numResults);
//         mOptions.addOption(configFile);
//         
//         HelpFormatter formatter = new HelpFormatter();
//         final String EOL = System.getProperty("line.separator");
//         StringWriter out = new StringWriter();
//         formatter.printHelp(new PrintWriter(out),80,"commandline","header",mOptions,2,2,"footer",true);
//         assertEquals(
//                 "usage: commandline [--config <arg>] [-r <arg>] [-a <arg>] [-h] [-t] [-n] [-l"+EOL+
//                 "       <arg>] [-s <arg>] [-v]"+EOL+
//                 "header"+EOL+
//                 "  -a,--age <arg>      Age (in days) of cache item before being recomputed"+EOL+
//                 "     --config <arg>   Use the specified configuration file"+EOL+
//                 "  -h,--help           print this message"+EOL+
//                 "  -l,--limit <arg>    Set time limit for execution, in mintues"+EOL+
//                 "  -n,--new            Create NLT cache entries only for new items"+EOL+
//                 "  -r,--results <arg>  Number of results per item"+EOL+
//                 "  -s,--server <arg>   The NLT server address"+EOL+
//                 "  -t,--tracker        Create NLT cache entries only for tracker items"+EOL+
//                 "  -v,--version        print version information"+EOL+
//                 "footer"+EOL
//                 ,out.toString());
//     }
    
    
    
    
    
    
// Defects4J: flaky method
//     public void test19383() {
//         Options options = new Options();
//         options.addOption(new Option("a","aaa",false,"aaaaaaa"));
//         options.addOption(new Option(null,"bbb",false,"bbbbbbb"));
//         options.addOption(new Option("c",null,false,"ccccccc"));
//         
//         HelpFormatter formatter = new HelpFormatter();
//         String SEP = System.getProperty("line.separator");
//         StringWriter out = new StringWriter();
//         formatter.printHelp(new PrintWriter(out),80, "foobar", "", options, 2, 2, "", true);
//         assertEquals(
//                 "usage: foobar [-a] [-c] [--bbb]"+SEP+
//                 "  -a,--aaa  aaaaaaa"+SEP+
//                 "     --bbb  bbbbbbb"+SEP+
//                 "  -c        ccccccc"+SEP
//                 ,out.toString());
//     }

}
