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
