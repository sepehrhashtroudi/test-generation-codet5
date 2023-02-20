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
public void testHasOption61() { CommandLine cmd = new CommandLine(); cmd.addOption(new Option("a", "a")); cmd.addOption(new Option("b", "b")); cmd.addOption(new Option("c", "c")); assertTrue(cmd.hasOption("a")); assertTrue(cmd.hasOption("b")); assertTrue(cmd.hasOption("c")); assertFalse(cmd.hasOption("d")); }
public void testGetOptionValues68() { CommandLine cmd = new CommandLine(); cmd.addOption(new Option("a", "a")); cmd.addOption(new Option("b", "b")); cmd.addOption(new Option("c", "c")); String[] args = cmd.getOptionValues("a"); assertEquals(3, args.length); assertEquals("a", args[0]); assertEquals("b", args[1]); assertEquals("c", args[2]); }
public void testGetOptionValue72() { CommandLine cmd = new CommandLine(); assertNull(cmd.getOptionValue(null)); cmd.addOption(new Option("a", "b")); assertEquals("b", cmd.getOptionValue("a")); cmd.addOption(new Option("b", "c")); assertEquals("c", cmd.getOptionValue("b")); cmd.addOption(new Option("c", "d")); assertEquals("d", cmd.getOptionValue("c")); cmd.addOption(new Option("d", "e")); assertEquals("e", cmd.getOptionValue("e")); }
public void testGetOptionValues105() { CommandLine cmd = new CommandLine(); cmd.addOption(new Option("a", "A")); cmd.addOption(new Option("b", "B")); cmd.addOption(new Option("c", "C")); assertEquals("A", cmd.getOptionValues("a")[0]); assertEquals("B", cmd.getOptionValues("b")[0]); assertEquals("C", cmd.getOptionValues("c")[0]); }
    

    /**
     * Ant test
     */
    

}
