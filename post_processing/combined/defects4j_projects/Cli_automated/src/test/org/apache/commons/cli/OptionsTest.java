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
    
public void testBaseOptionStringOpt14() { 
     Option base = OptionBuilder.withDescription("option description").create("o"); 
     assertEquals("o", base.getOpt()); 
     assertEquals("option description", base.getDescription()); 
     assertTrue(!base.hasArg()); 
 }
    



}

