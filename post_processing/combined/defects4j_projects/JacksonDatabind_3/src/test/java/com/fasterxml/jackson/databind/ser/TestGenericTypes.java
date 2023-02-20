package com.fasterxml.jackson.databind.ser;

import java.util.*;


import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestGenericTypes extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */
    
    static class Account {
        private Long id;        
        private String name;
        
        public Account(String name, Long id) {
            this.id = id;
            this.name = name;
        }

        public String getName() { return name; }
        public Long getId() { return id; }
    }

    static class Key<T> {
        private final T id;
        
        public Key(T id) { this.id = id; }
        
        public T getId() { return id; }

        public <V> Key<V> getParent() { return null; }
    }
 
    static class Person1 {
        private Long id;
        private String name;
        private Key<Account> account;
        
        public Person1(String name) { this.name = name; }

        public String getName() {
                return name;
        }

        public Key<Account> getAccount() {
                return account;
        }

        public Long getId() {
                return id;
        }

        public void setAccount(Key<Account> account) {
            this.account = account;
        }    
    }

    static class Person2 {
        private Long id;
        private String name;
        private List<Key<Account>> accounts;
        
        public Person2(String name) {
                this.name = name;
        }

        public String getName() { return name; }
        public List<Key<Account>> getAccounts() { return accounts; }
        public Long getId() { return id; }

        public void setAccounts(List<Key<Account>> accounts) {
            this.accounts = accounts;
        }
    }

    static class GenericBogusWrapper<T> {
        public Element wrapped;

        public GenericBogusWrapper(T v) { wrapped = new Element(v); }

        class Element {
            public T value;
    
            public Element(T v) { value = v; }
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    

    

    /**
     * Issue [JACKSON-572] is about unbound type variables, usually resulting
     * from inner classes of generic classes (like Sets).
     */
    
}

