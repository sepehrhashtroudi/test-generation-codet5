package com.fasterxml.jackson.databind.jsontype;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;

/**
 * Unit tests for checking how combination of interfaces, implementation
 * classes are handled, with respect to type names.
 */
public class TestAbstractTypeNames  extends BaseMapTest
{
    @JsonTypeName("Employee")
    public interface Employee extends User {
        public abstract String getEmployer();
    }

    @JsonTypeInfo(use=Id.NAME, include=As.PROPERTY, property="userType")
    @JsonTypeName("User")
    @JsonSubTypes({ @JsonSubTypes.Type(value=Employee.class,name="Employee") })
    public interface User {
            public abstract String getName();
            public abstract List<User> getFriends();
    }

    @JsonTypeName("Employee")
    static class DefaultEmployee extends DefaultUser implements Employee
    {
        private String _employer;

        @JsonCreator
        public DefaultEmployee(@JsonProperty("name") String name,
                @JsonProperty("friends") List<User> friends,
                @JsonProperty("employer") String employer) {
            super(name, friends);
            _employer = employer;
        }

        @Override
        public String getEmployer() {
            return _employer;
        }
    }

    @JsonTypeInfo(use=Id.NAME, include=As.PROPERTY, property="userType")
    @JsonTypeName("User")
    @JsonSubTypes({ @JsonSubTypes.Type(value=DefaultEmployee.class,name="Employee") })
    static class DefaultUser implements User
    {
        private String _name;
        private List<User> _friends;

        @JsonCreator
        public DefaultUser(@JsonProperty("name") String name,
                @JsonProperty("friends") List<User> friends)
        {
            super();
            _name = name;
            _friends = friends;
        }

        @Override
        public String getName() {
            return _name;
        }

        @Override
        public List<User> getFriends() {
            return _friends;
        }
    }

    static class BaseValue {
        public int value = 42;

        public int getValue() { return value; }
    }

    final static class BeanWithAnon {
        public BaseValue bean = new BaseValue() {
            @Override
            public String toString() { return "sub!"; }
        };
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    // Testing [JACKSON-498], partial fix
    
    
    // [JACKSON-584]: change anonymous non-static inner type into static type:
    
}
