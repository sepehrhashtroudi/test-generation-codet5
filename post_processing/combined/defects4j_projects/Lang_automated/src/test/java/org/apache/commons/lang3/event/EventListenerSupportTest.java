/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.lang3.event;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * @since 3.0
 * @version $Id$
 */
public class EventListenerSupportTest 
{
    

    

    

    

    

    

    

@Test
public void testRemoveListenerDuringEvent497() throws PropertyVetoException { 
     final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class); 
     for (int i = 0; i < 10; ++i) { 
         addDeregisterListener(listenerSupport); 
     } 
     assertEquals(listenerSupport.getListenerCount(), 10); 
     listenerSupport.fire().vetoableChange(new PropertyChangeEvent(new Date(), "Day", 4, 5)); 
     assertEquals(listenerSupport.getListenerCount(), 0); 
 }
@Test(expected = NullPointerException.class) 
 public void testNullListenerSupport498() { 
     final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class); 
     listenerSupport.addListener(null); 
 }
@Test
public void testCreateProxy499() { 
     final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class); 
     final VetoableChangeListener[] listeners = listenerSupport.getListeners(); 
     assertEquals(0, listeners.length); 
     assertEquals(VetoableChangeListener.class, listeners.getClass().getComponentType()); 
     final VetoableChangeListener[] empty = listeners; 
     assertSame(empty, listenerSupport.getListeners()); 
     final VetoableChangeListener listener1 = EasyMock.createNiceMock(VetoableChangeListener.class); 
     listenerSupport.addListener(listener1); 
     assertEquals(1, listenerSupport.getListeners().length); 
     final VetoableChangeListener listener2 = EasyMock.createNiceMock(VetoableChangeListener.class); 
     listenerSupport.addListener(listener2); 
     assertEquals(2, listenerSupport.getListeners().length); 
     listenerSupport.removeListener(listener1); 
     assertEquals(1, listenerSupport.getListeners().length); 
     listenerSupport.removeListener(listener2); 
     assertSame(empty, listenerSupport.getListeners()); 
 }
@Test(expected = NullPointerException.class) 
 public void testAddNullListener500() { 
     final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class); 
     listenerSupport.addListener(null); 
 }
@Test
public void testSerialization502() throws IOException, ClassNotFoundException, PropertyVetoException { 
     final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class); 
     listenerSupport.addListener(new VetoableChangeListener() { 
  
         @Override 
         public void vetoableChange(final PropertyChangeEvent e) { 
         } 
     }); 
     listenerSupport.addListener(EasyMock.createNiceMock(VetoableChangeListener.class)); 
     final ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
     final ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream); 
     objectOutputStream.writeObject(listenerSupport); 
     objectOutputStream.close(); 
     @SuppressWarnings("unchecked") 
     final EventListenerSupport<VetoableChangeListener> deserializedListenerSupport = (EventListenerSupport<VetoableChangeListener>) new ObjectInputStream(new ByteArrayInputStream(outputStream.toByteArray())).readObject(); 
     final VetoableChangeListener[] listeners = deserializedListenerSupport.getListeners(); 
     assertEquals(VetoableChangeListener.class, listeners.getClass().getComponentType()); 
     assertEquals(1, listeners.length); 
     final VetoableChangeListener listener = listeners[0]; 
     final PropertyChangeEvent evt = new PropertyChangeEvent(new Date(), "Day", 7, 9); 
     listener.vetoableChange(evt); 
     EasyMock.replay(listener); 
     deserializedListenerSupport.fire().vetoableChange(evt); 
     EasyMock.verify(listener); 
     deserializedListenerSupport.removeListener(listener); 
     assertEquals(0, deserializedListenerSupport.getListeners().length); 
 }
    

    

    private void addDeregisterListener(final EventListenerSupport<VetoableChangeListener> listenerSupport)
    {
        listenerSupport.addListener(new VetoableChangeListener()
        {
            @Override
            public void vetoableChange(final PropertyChangeEvent e)
            {
                listenerSupport.removeListener(this);
            }
        });
    }

    private VetoableChangeListener createListener(final List<VetoableChangeListener> calledListeners)
    {
        return new VetoableChangeListener()
        {
            @Override
            public void vetoableChange(final PropertyChangeEvent e)
            {
                calledListeners.add(this);
            }
        };
    }
}
