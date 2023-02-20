package com.fasterxml.jackson.databind.creators;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

public class TestBuilderSimple extends BaseMapTest
{
    // // Simple 2-property value class, builder with standard naming
	
    @JsonDeserialize(builder=SimpleBuilderXY.class)
    static class ValueClassXY
    {
        final int _x, _y;

        protected ValueClassXY(int x, int y) {
            _x = x+1;
            _y = y+1;
        }
    }

    static class SimpleBuilderXY
    {
    	public int x, y;
    	
    	public SimpleBuilderXY withX(int x) {
    		this.x = x;
    		return this;
    	}

    	public SimpleBuilderXY withY(int y) {
    		this.y = y;
    		return this;
    	}

    	public ValueClassXY build() {
    		return new ValueClassXY(x, y);
    	}
    }

    // // 3-property value, with more varied builder
	
    @JsonDeserialize(builder=BuildABC.class)
    static class ValueClassABC
    {
        final int a, b, c;

        protected ValueClassABC(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    static class BuildABC
    {
    	public int a; // to be used as is
    	private int b, c;
    	
    	@JsonProperty("b")
    	public BuildABC assignB(int b) {
    		this.b = b;
    		return this;
    	}

    	// Also ok NOT to return 'this'
    	@JsonSetter("c")
    	public void c(int c) {
    		this.c = c;
    	}

    	public ValueClassABC build() {
    		return new ValueClassABC(a, b, c);
    	}
    }

    // // Then Builder that is itself immutable
    
    @JsonDeserialize(builder=BuildImmutable.class)
    static class ValueImmutable
    {
        final int value;
        protected ValueImmutable(int v) { value = v; }
    }
    
    static class BuildImmutable {
        private final int value;
        
        private BuildImmutable() { this(0); }
        private BuildImmutable(int v) {
            value = v;
        }
        public BuildImmutable withValue(int v) {
            return new BuildImmutable(v);
        }
        public ValueImmutable build() {
            return new ValueImmutable(value);
        }
    }
    
    // And then with custom naming:

    @JsonDeserialize(builder=BuildFoo.class)
    static class ValueFoo
    {
        final int value;
        protected ValueFoo(int v) { value = v; }
    }

    @JsonPOJOBuilder(withPrefix="foo", buildMethodName="construct")
    static class BuildFoo {
        private int value;
        
        public BuildFoo fooValue(int v) {
            value = v;
            return this;
        }
        public ValueFoo construct() {
            return new ValueFoo(value);
        }
    }

    // And with creator(s)
	
    @JsonDeserialize(builder=CreatorBuilder.class)
    static class CreatorValue
    {
        final int a, b, c;

        protected CreatorValue(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    static class CreatorBuilder {
        private final int a, b;
        private int c;

        @JsonCreator
        public CreatorBuilder(@JsonProperty("a") int a,
                @JsonProperty("b") int b)
        {
            this.a = a;
            this.b = b;
        }
        
        public CreatorBuilder withC(int v) {
            c = v;
            return this;
        }
        public CreatorValue build() {
            return new CreatorValue(a, b, c);
        }
    }
        
	/*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    private final ObjectMapper mapper = new ObjectMapper();
    
public void testImmutable274() throws Exception { 
     final String json = "{\"value\":13}"; 
     ValueImmutable value = mapper.readValue(json, ValueImmutable.class); 
     assertEquals(13, value.value); 
 }
    

    

    // test for Immutable builder, to ensure return value is used
    

    // test with custom 'with-prefix'
    

    // test to ensure @JsonCreator also work
    
}
