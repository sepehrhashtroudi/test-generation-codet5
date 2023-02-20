package com.fasterxml.jackson.databind.struct;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.PropertyAccessor;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;

public class TestObjectIdWithPolymorphic extends BaseMapTest
{
    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
    @JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="id")
    static abstract class Base
    {
        public int value;

        public Base next;
        
        public Base() { this(0); }
        public Base(int v) {
            value = v;
        }
    }

    static class Impl extends Base
    {
        public int extra;

        public Impl() { this(0, 0); }
        public Impl(int v, int e) {
            super(v);
            extra = e;
        }
    }

    // [JACKSON-811] types

    @JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
    public static class Base811 {
        public int id;
        public Base811 owner;
            
        private Base811() {}
        public Base811(Process owner) {
            this.owner = owner;
            if (owner == null) {
                id = 0;
            } else {
                id = ++owner.childIdCounter;
                owner.children.add(this);
            }
        }
    }

    public static class Process extends Base811 {
        protected int childIdCounter = 0;
        protected List<Base811> children = new ArrayList<Base811>();
        
        public Process() { super(null); }
    }
    
    public static abstract class Activity extends Base811 {
        protected Activity parent;
        public Activity(Process owner, Activity parent) {
                super(owner);
                this.parent = parent;
        }
        private Activity() {
                super();
        }
    }
    
    public static class Scope extends Activity {
        public final List<FaultHandler> faultHandlers = new ArrayList<FaultHandler>();
        public Scope(Process owner, Activity parent) {
            super(owner, parent);
        }
        private Scope() {
            super();
        }
    }
    
    public static class FaultHandler extends Base811 {
        public final List<Catch> catchBlocks = new ArrayList<Catch>();
        
        public FaultHandler(Process owner) {
            super(owner);
        }

        protected FaultHandler() {}
    }
    
    public static class Catch extends Scope {
        public Catch(Process owner, Activity parent) {
            super(owner, parent);
        }
        protected Catch() {};
    }

    /*
    /*****************************************************
    /* Unit tests for polymorphic type handling
    /*****************************************************
     */

    private final ObjectMapper mapper = new ObjectMapper();

    

    
}
