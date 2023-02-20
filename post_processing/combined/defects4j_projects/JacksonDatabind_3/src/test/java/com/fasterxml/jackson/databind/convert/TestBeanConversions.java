package com.fasterxml.jackson.databind.convert;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class TestBeanConversions
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    final ObjectMapper MAPPER = new ObjectMapper();

    static class Point {
        public int x, y;

        public int z = -13;

        public Point() { }
        public Point(int a, int b, int c)
        {
            x = a;
            y = b;
            z = c;
        }
    }

    static class PointStrings {
        public final String x, y;

        public PointStrings(String x, String y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class BooleanBean {
        public boolean boolProp;
    }

    static class WrapperBean {
        public BooleanBean x;
    }

    static class ObjectWrapper
    {
        private Object data;

        public ObjectWrapper() { }
        public ObjectWrapper(Object o) { data = o; }

        public Object getData() { return data; }
        public void setData(Object data) { this.data = data; }
    }

    static class Leaf {
        public int value;

        public Leaf() { }
        public Leaf(int v) { value = v; }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
    
    
    // For [JACKSON-371]; verify that we know property that caused issue...
    // (note: not optimal place for test, but will have to do for now)
    

    

    // [JACKSON-710]: should work regardless of wrapping...
    

    // [Issue-11]: simple cast, for POJOs etc
    
    
    // [Issue-11]: simple cast, for Tree
    
    
    private void _convertAndVerifyPoint(ObjectMapper m)
    {
        final Point input = new Point(1, 2, 3);
        Point output = m.convertValue(input, Point.class);
        assertEquals(1, output.x);
        assertEquals(2, output.y);
        assertEquals(3, output.z);
    }

    /**
     * Need to test "shortcuts" introduced by [Issue-11]
     */
    
}
