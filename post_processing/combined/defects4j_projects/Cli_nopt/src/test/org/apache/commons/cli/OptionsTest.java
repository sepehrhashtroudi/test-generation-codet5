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

import java.util.ArrayList;
import java.util.Collection;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author Rob Oxspring roxspring@apache.org
 * @version $Revision$
 */
public class OptionsTest extends TestCase
{

    public static Test suite() 
    { 
        return new TestSuite ( OptionsTest.class ); 
    }

    public OptionsTest( String name )
    {
        super( name );
    }

    public void setUp()
    {
    }

    public void tearDown()
    {
    }
    
public void testGetKey35() { Option opt = new Option("f", null, true, null); assertEquals("f", opt.getKey()); opt.setLongOpt("f"); assertEquals("f", opt.getKey()); opt.setLongOpt("f"); assertEquals("f", opt.getKey()); opt.setLongOpt("f"); assertEquals("f", opt.getKey()); opt.setLongOpt("f"); assertEquals("f", opt.getLongOpt()); }
public void testHasLongOpt37() { Option option = new Option("f", null, true, null); option.setLongOpt(null); assertTrue(option.hasLongOpt()); option.setLongOpt("foo"); assertFalse(option.hasLongOpt()); option.setLongOpt("bar"); assertFalse(option.hasLongOpt()); option.setLongOpt("baz"); assertTrue(option.hasLongOpt()); option.setLongOpt("baz"); assertTrue(option.hasLongOpt()); }
public void testEquals40() { Option a = new Option("a", null, true, null); Option b = new Option("b", null, true, null); Option c = new Option("c", null, true, null); assertTrue(a.equals(b)); assertTrue(b.equals(c)); assertFalse(c.equals(a)); assertFalse(a.equals(null)); }
public void testEquals45() { Option a = new Option("a", null, true, null); Option b = new Option("b", null, true, null); Option c = new Option("c", null, true, null); Option d = new Option("d", null, true, null); assertTrue(a.equals(b)); assertTrue(b.equals(c)); assertTrue(c.equals(d)); assertFalse(d.equals(a)); assertFalse(d.equals(null)); }
public void testHasLongOpt48() { Option option = new Option("f", null, true, null); option.setLongOpt(null); assertTrue(option.hasLongOpt()); option.setLongOpt("foo"); assertFalse(option.hasLongOpt()); option.setLongOpt("bar"); assertTrue(option.hasLongOpt()); option.setLongOpt("baz"); assertFalse(option.hasLongOpt()); }
public void testEquals50() { Option a = new Option("a", "b", true, null); Option b = new Option("b", "c", true, null); Option c = new Option("c", "d", true, null); Option d = new Option("d", "e", true, null); assertTrue(a.equals(b)); assertTrue(b.equals(c)); assertTrue(c.equals(d)); }
    



}

