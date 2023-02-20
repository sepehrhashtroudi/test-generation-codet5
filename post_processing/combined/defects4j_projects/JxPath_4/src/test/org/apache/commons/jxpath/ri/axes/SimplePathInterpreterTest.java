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
package org.apache.commons.jxpath.ri.axes;

import java.util.HashMap;

import junit.framework.TestCase;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NestedTestBean;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.TestNull;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.TestBeanFactory;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer;

public class SimplePathInterpreterTest extends TestCase {

    private TestBeanWithNode bean;
    private JXPathContext context;

    /**
     * Constructor for SimplePathInterpreterTest.
     */
    public SimplePathInterpreterTest(String name) {
        super(name);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(SimplePathInterpreterTest.class);
    }

    /**
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        bean = TestBeanWithNode.createTestBeanWithDOM();
        HashMap submap = new HashMap();
        submap.put("key", new NestedTestBean("Name 9"));
        submap.put("strings", bean.getNestedBean().getStrings());
        bean.getList().add(new int[]{1, 2});
        bean.getList().add(bean.getVendor());
        bean.getMap().put("Key3",
            new Object[]{
                new NestedTestBean("some"),
                new Integer(2),
                bean.getVendor(),
                submap
            }
        );
        bean.getMap().put("Key4", bean.getVendor());
        bean.getMap().put("Key5", submap);
        bean.getMap().put("Key6", new Object[0]);
        context = JXPathContext.newContext(null, bean);
        context.setLenient(true);
        context.setFactory(new TestBeanFactory());
    }

public void testDoStepNoPredicatesPropertyOwner42() { 
     assertValueAndPointer("/int", new Integer(1), "/int", "Bb", "BbB"); 
     assertValueAndPointer("/./int", new Integer(1), "/int", "Bb", "BbB"); 
     assertNullPointer("/foo", "/foo", "Bn"); 
     assertValueAndPointer("/nestedBean/int", new Integer(1), "/nestedBean/int", "BbBb", "BbBbB"); 
     assertValueAndPointer("/nestedBean/strings", bean.getNestedBean().getStrings(), "/nestedBean/strings", "BbBb", "BbBbC"); 
     assertNullPointer("/nestedBean/foo", "/nestedBean/foo", "BbBn"); 
     assertNullPointer("/map/foo", "/map[@name='foo']", "BbDd"); 
     assertValueAndPointer("/list/int", new Integer(1), "/list[3]/int", "BbBb", "BbBbB"); 
     assertNullPointer("/list/foo", "/list[1]/foo", "BbBn"); 
     assertNullPointer("/nestedBean/foo/bar", "/nestedBean/foo/bar", "BbBnNn"); 
     assertNullPointer("/list/int/bar", "/list[3]/int/bar", "BbBbBn"); 
     assertNullPointer("/list/foo/bar", "/list[1]/foo/bar", "BbBnNn"); 
     assertNullPointer("/map/foo/bar", "/map[@name='foo']/bar", "BbDdNn"); 
     assertValueAndPointer("/map/Key1", "Value 1", "/map[@name='Key1']", "BbDd", "BbDdB"); 
     assertValueAndPointer("/integers", bean.getIntegers(), "/integers", "Bb", "BbC"); 
 }
public void testDoStepPredicatesStandard43() { 
     assertValueAndPointer("/vendor/contact[@name='jack']", "Jack", "/vendor/contact[2]", "BbMM"); 
     assertValueAndPointer("/vendor/contact[2]", "Jack", "/vendor/contact[2]", "BbMM"); 
     assertNullPointer("/vendor/contact[5]", "/vendor/contact[5]", "BbMn"); 
     assertValueAndPointer("/vendor/contact[@name='jack'][2]", "Jack Black", "/vendor/contact[4]", "BbMM"); 
     assertValueAndPointer("/vendor/contact[@name='jack'][2]", "Jack Black", "/vendor/contact[4]", "BbMM"); 
 }
    

    

    

    

    

    

    

    

    private void assertValueAndPointer(
            String path, Object expectedValue, String expectedPath,
            String expectedSignature)
    {
        assertValueAndPointer(
            path,
            expectedValue,
            expectedPath,
            expectedSignature,
            expectedSignature);
    }
    
    private void assertValueAndPointer(
            String path, Object expectedValue, String expectedPath,
            String expectedSignature, String expectedValueSignature)
    {
        Object value = context.getValue(path);
        assertEquals("Checking value: " + path, expectedValue, value);

        Pointer pointer = context.getPointer(path);
        assertEquals("Checking pointer: " + path,
                expectedPath, pointer.toString());

        assertEquals("Checking signature: " + path,
                expectedSignature, pointerSignature(pointer));
        
        Pointer vPointer = ((NodePointer) pointer).getValuePointer();
        assertEquals("Checking value pointer signature: " + path,
                expectedValueSignature, pointerSignature(vPointer));
    }

    private void assertNullPointer(String path, String expectedPath,
            String expectedSignature)
    {
        Pointer pointer = context.getPointer(path);
        assertNotNull("Null path exists: " + path,
                    pointer);
        assertEquals("Null path as path: " + path,
                    expectedPath, pointer.asPath());
        assertEquals("Checking Signature: " + path,
                    expectedSignature, pointerSignature(pointer));
                
        Pointer vPointer = ((NodePointer) pointer).getValuePointer();
        assertTrue("Null path is null: " + path,
                    !((NodePointer) vPointer).isActual());
        assertEquals("Checking value pointer signature: " + path,
                    expectedSignature + "N", pointerSignature(vPointer));
    }

    /**
     * Since we need to test the internal Signature of a pointer,
     * we will get a signature which will contain a single character
     * per pointer in the chain, representing that pointer's type.
     */
    private String pointerSignature(Pointer pointer) {
        if (pointer == null) {
            return "";
        }

        char type = '?';
        if (pointer instanceof NullPointer) {                 type = 'N'; }
        else if (pointer instanceof NullPropertyPointer) {    type = 'n'; }
        else if (pointer instanceof NullElementPointer) {     type = 'E'; }
        else if (pointer instanceof VariablePointer) {        type = 'V'; }
        else if (pointer instanceof CollectionPointer) {      type = 'C'; }
        else if (pointer instanceof BeanPointer) {            type = 'B'; }
        else if (pointer instanceof BeanPropertyPointer) {    type = 'b'; }
        else if (pointer instanceof DynamicPointer) {         type = 'D'; }
        else if (pointer instanceof DynamicPropertyPointer) { type = 'd'; }
        else if (pointer instanceof DOMNodePointer) {         type = 'M'; }
        else {
            System.err.println("UNKNOWN TYPE: " + pointer.getClass());
        }
        NodePointer parent = 
            ((NodePointer) pointer).getImmediateParentPointer();
        return pointerSignature(parent) + type;
    }
}

