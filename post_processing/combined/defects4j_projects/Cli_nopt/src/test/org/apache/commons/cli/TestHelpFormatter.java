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
import java.io.PrintWriter;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/** 
 * Test case for the HelpFormatter class 
 *
 * @author Slawek Zachcial
 * @author John Keyes ( john at integralsource.com )
 **/
public class TestHelpFormatter extends TestCase
{
   public static void main( String[] args )
   {
      String[] testName = { TestHelpFormatter.class.getName() };
      junit.textui.TestRunner.main(testName);
   }

   public static TestSuite suite()
   {
      return new TestSuite(TestHelpFormatter.class);
   }

   public TestHelpFormatter( String s )
   {
      super( s );
   }

   

   

   

   
// Defects4J: flaky method
//    public void testAutomaticUsage()
//    throws Exception
//    {
//        HelpFormatter hf = new HelpFormatter();
//        Options options = null;
//        String expected = "usage: app [-a]";
//        ByteArrayOutputStream out = new ByteArrayOutputStream( );
//        PrintWriter pw = new PrintWriter( out );
// 
//        options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa");
//        hf.printUsage( pw, 60, "app", options );
//        pw.flush();
//        assertEquals("simple auto usage", expected, out.toString().trim());
//        out.reset();
// 
//        expected = "usage: app [-a] [-b]";
//        options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa")
//        .addOption("b", false, "bbb" );
//        hf.printUsage( pw, 60, "app", options );
//        pw.flush();
//        assertEquals("simple auto usage", expected, out.toString().trim());
//        out.reset();
//    }
}
