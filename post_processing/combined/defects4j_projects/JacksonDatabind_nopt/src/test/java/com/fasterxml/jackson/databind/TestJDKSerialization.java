package com.fasterxml.jackson.databind;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Tests to verify that most core Jackson components can be serialized
 * using default JDK serialization: this feature is useful for some
 * platforms, such as Android, where memory management is handled
 * much more aggressively.
 */
public class TestJDKSerialization extends BaseMapTest
{
    static class MyPojo {
        public int x;
        private int y;
        
        public MyPojo() { }
        public MyPojo(int x0, int y0) {
            x = x0;
            y = y0;
        }
        
        public int getY() { return y; }
        public void setY(int y) { this.y = y; }
    }
    
    /*
    /**********************************************************
    /* Tests for individual objects
    /**********************************************************
     */

    

    
    
    

    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    protected byte[] jdkSerialize(Object o) throws IOException
    {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream(1000);
        ObjectOutputStream obOut = new ObjectOutputStream(bytes);
        obOut.writeObject(o);
        obOut.close();
        return bytes.toByteArray();
    }

    @SuppressWarnings("unchecked")
    protected <T> T jdkDeserialize(byte[] raw) throws IOException
    {
        ObjectInputStream objIn = new ObjectInputStream(new ByteArrayInputStream(raw));
        try {
            return (T) objIn.readObject();
        } catch (ClassNotFoundException e) {
            fail("Missing class: "+e.getMessage());
            return null;
        } finally {
            objIn.close();
        }
    }

}
