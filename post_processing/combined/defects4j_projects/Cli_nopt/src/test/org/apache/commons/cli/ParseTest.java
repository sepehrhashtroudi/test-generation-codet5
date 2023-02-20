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

public void testGetArgs17() { CommandLine cmd = new CommandLine(); cmd.addOption(new Option("a", "a")); cmd.addOption(new Option("b", "b")); cmd.addOption(new Option("c", "c")); String[] args = cmd.getArgs(); assertEquals(3, args.length); assertEquals("a", args[0]); assertEquals("b", args[1]); assertEquals("c", args[2]); }
public void testAddArg22() { CommandLine cmd = new CommandLine(); cmd.addArg("-a"); cmd.addArg("-b"); cmd.addArg("-c"); assertEquals(3, cmd.getArgs().length); assertEquals("-a", cmd.getArgs()[0]); assertEquals("-b", cmd.getArgs()[1]); assertEquals("-c", cmd.getArgs()[2]); }
public void testGetArgs26() { CommandLine cl = new CommandLine(); cl.addOption(new Option("a", "a")); cl.addOption(new Option("b", "b")); cl.addOption(new Option("c", "c")); String[] args = cl.getArgs(); assertEquals(3, args.length); assertEquals("a", args[0]); assertEquals("b", args[1]); assertEquals("c", args[2]); }
public void testGetArgs28() { CommandLine cmd = new CommandLine(); String[] args = cmd.getArgs(); for (String arg : args) { System.out.println(arg); } }
    

    

    

    

    

    

    

    

    

    
}
