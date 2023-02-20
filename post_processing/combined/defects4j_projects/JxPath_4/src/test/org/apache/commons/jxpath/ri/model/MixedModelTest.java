/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.jxpath.ri.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.TestBean;
import org.apache.commons.jxpath.TestMixedModelBean;
import org.apache.commons.jxpath.TestNull;
import org.apache.commons.jxpath.Variables;

/**
 * Tests JXPath with mixed model: beans, maps, DOM etc.
 *
 * @author Dmitri Plotnikov
 * @version $Revision$ $Date$
 */

public class MixedModelTest extends JXPathTestCase {
    private JXPathContext context;

    /**
     * Construct a new instance of this test case.
     *
     * @param name Name of the test case
     */
    public MixedModelTest(String name) {
        super(name);
    }

    public static void main(String[] args) {
        TestRunner.run(new MixedModelTest("testContainerWithCollection"));
    }
    
    /**
     * Return the tests included in this test suite.
     */
    public static Test suite() {
        return (new TestSuite(MixedModelTest.class));
    }

    public void setUp() {
        TestMixedModelBean bean = new TestMixedModelBean();
        context = JXPathContext.newContext(bean);
        context.setFactory(new TestMixedModelFactory());
        context.setLocale(Locale.US);
        Variables vars = context.getVariables();
        vars.declareVariable("string", bean.getString());
        vars.declareVariable("bean", bean.getBean());
        vars.declareVariable("map", bean.getMap());
        vars.declareVariable("list", bean.getList());
        vars.declareVariable("document", bean.getDocument());
        vars.declareVariable("element", bean.getElement());
        vars.declareVariable("container", bean.getContainer());
        vars.declareVariable("testnull", new TestNull());

        int[][] matrix = new int[1][];
        matrix[0] = new int[1];
        matrix[0][0] = 3;
        vars.declareVariable("matrix", matrix);
    }

public void testCreatePathAndSetValueCreateBean50() { 
     TestBean bean = (TestBean) context.getContextBean(); 
     bean.setMap(null); 
     assertXPathCreatePathAndSetValue(context, "/map[@name='TestKey2']/int", new Integer(4), "/map[@name='TestKey2']/int"); 
 }
    
    
    

    

    

    

    

    

    

    // ----------------------------------------------------------------------

    

    

    

    

    

    

    

    // ----------------------------------------------------------------------

    

    

    

    

    

    

    

    // ----------------------------------------------------------------------

    

    

    

    

    

    

    

    

    

    

    /**
     * Test JXPath.iterate() with map containing an array
     */
    

    

    

    

    

    

    
    
    /**
     * Scott Heaberlin's test - collection of collections
     */
    
}
