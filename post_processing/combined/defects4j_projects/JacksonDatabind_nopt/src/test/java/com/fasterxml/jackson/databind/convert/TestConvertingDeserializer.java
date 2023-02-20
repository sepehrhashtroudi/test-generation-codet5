package com.fasterxml.jackson.databind.convert;

import java.util.*;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.util.StdConverter;

public class TestConvertingDeserializer
extends com.fasterxml.jackson.databind.BaseMapTest
{
    @JsonDeserialize(converter=ConvertingBeanConverter.class)
    static class ConvertingBean
    {
        protected int x, y;

        protected ConvertingBean(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    static class Point
    {
        protected int x, y;
    
        public Point(int v1, int v2) {
            x = v1;
            y = v2;
        }
    }

    static class ConvertingBeanContainer
    {
        public List<ConvertingBean> values;

        public ConvertingBeanContainer() { }
        public ConvertingBeanContainer(ConvertingBean... beans) {
            values = Arrays.asList(beans);
        }
    }

    static class ConvertingBeanConverter extends StdConverter<int[],ConvertingBean>
    {
        @Override
        public ConvertingBean convert(int[] values) {
            return new ConvertingBean(values[0], values[1]);
        }
    }
    
    static class PointConverter extends StdConverter<int[], Point>
    {
        @Override public Point convert(int[] value) {
            return new Point(value[0], value[1]);
        }
    }

    static class PointWrapper {
        @JsonDeserialize(converter=PointConverter.class)
        public Point value;

        protected PointWrapper() { }
        public PointWrapper(int x, int y) {
            value = new Point(x, y);
        }
    }
    
    static class PointListWrapperArray {
        @JsonDeserialize(contentConverter=PointConverter.class)
        public Point[] values;
    }

    static class PointListWrapperList {
        @JsonDeserialize(contentConverter=PointConverter.class)
        public List<Point> values;
    }

    static class PointListWrapperMap {
        @JsonDeserialize(contentConverter=PointConverter.class)
        public Map<String,Point> values;
    }

    static class LowerCaser extends StdConverter<String, String>
    {
        @Override
        public String convert(String value) {
            return value.toLowerCase();
        }
        
    }

    static class LowerCaseText {
        @JsonDeserialize(converter=LowerCaser.class)
        public String text;
    }

    static class LowerCaseTextArray {
        @JsonDeserialize(contentConverter=LowerCaser.class)
        public String[] texts;
    }
     
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

public void testStdDelegatingDeserializer274() throws Exception { Map<String, Object> testMap = new HashMap<String, Object>(); testMap.put("key1", "value1"); testMap.put("key2", "value2"); testMap.put("key3", "value3"); testMap.put("key4", "value4"); Map<String, Object> testMap2 = new HashMap<String, Object>(); testMap2.put("key1", "value1"); testMap2.put("key2", "value2"); testMap2.put("key3", "value3"); testMap2.put("key4", "value4");
}

public void testStdDelegatingDeserializer275() throws Exception { Map<String, Object> stringObjectMap = new HashMap<String, Object>(); stringObjectMap.put("foo", "bar"); Map<String, Object> stringObjectMap2 = new HashMap<String, Object>(); stringObjectMap2.put("foo", "bar"); Map<String, Object> stringObjectMap3 = new HashMap<String, Object>(); stringObjectMap3.put("foo", "bar"); Map<String, Object> stringObjectMap4 = new HashMap<String, Object>(); stringObjectMap4.put("foo", "bar"); stringObjectMap4.put("bar", "baz");
}

    

    

    

    

    

    

    

    
}
