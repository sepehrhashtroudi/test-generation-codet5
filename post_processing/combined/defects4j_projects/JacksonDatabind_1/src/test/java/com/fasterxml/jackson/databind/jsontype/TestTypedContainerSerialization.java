package com.fasterxml.jackson.databind.jsontype;

import java.util.*;

import org.junit.Assert;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TestTypedContainerSerialization
	extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    @JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "object-type")
    @JsonSubTypes( { @Type(value = Dog.class, name = "doggy"),
        @Type(value = Cat.class, name = "kitty") })
    static abstract class Animal {
	    public String name;

	    protected Animal(String n) {
	        name = n;
	    }
	}

	@JsonTypeName("doggie")
	static class Dog extends Animal {
		public int boneCount;

		public Dog() {
			super(null);
		}

		@JsonCreator
		public Dog(@JsonProperty("name") String name) {
			super(name);
		}

		public void setBoneCount(int i) {
			boneCount = i;
		}
	}

	@JsonTypeName("kitty")
	static class Cat extends Animal {
		public String furColor;

		public Cat() {
			super(null);
		}

		@JsonCreator
		public Cat(@JsonProperty("furColor") String c) {
			super(null);
			furColor = c;
		}

		public void setName(String n) {
			name = n;
		}
	}

	static class Container1 {
		Animal animal;

		public Animal getAnimal() {
			return animal;
		}

		public void setAnimal(Animal animal) {
			this.animal = animal;
		}
	}

	static class Container2<T extends Animal> {
		@JsonSerialize
		T animal;

		public T getAnimal() {
			return animal;
		}

		public void setAnimal(T animal) {
			this.animal = animal;
		}

	}

    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
    static class Issue508A { }
    static class Issue508B extends Issue508A { }

    private final static ObjectMapper mapper = new ObjectMapper();

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
	
    

    

    
}
