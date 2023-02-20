package com.fasterxml.jackson.databind.creators;

import java.awt.Point; // just for convenience
import java.math.BigDecimal;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * This unit test suite that tests use of {@link JsonCreator}
 * with "delegate" constructors and factory methods: ones that
 * take a deserializable type that is bound from JSON content.
 * This is usually done to get two-phase data binding, often using
 * {@link java.util.Map} as the intermediate form.
 */
public class TestConstructFromMap
    extends BaseMapTest
{
    static class ConstructorFromMap
    {
        int _x;
        String _y;

        @JsonCreator
        ConstructorFromMap(Map<?,?> arg)
        {
            _x = ((Number) arg.get("x")).intValue();
            _y = (String) arg.get("y");
        }
    }

    static class FactoryFromPoint
    {
        int _x, _y;

        private FactoryFromPoint(Point p) {
            _x = p.x;
            _y = p.y;
        }

        @JsonCreator
        static FactoryFromPoint createIt(Point p)
        {
            return new FactoryFromPoint(p);
        }
    }

    // Also: let's test BigDecimal-from-JSON-String factory
    static class FactoryFromDecimalString
    {
	int _value;

        private FactoryFromDecimalString(BigDecimal d) {
	    _value = d.intValue();
        }

        @JsonCreator
        static FactoryFromDecimalString whateverNameWontMatter(BigDecimal d)
        {
            return new FactoryFromDecimalString(d);
        }
    }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    

    

    
}
