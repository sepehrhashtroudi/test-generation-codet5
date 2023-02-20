package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

public class TestAutoDetect
    extends BaseMapTest
{
    /*
    /********************************************************
    /* Helper beans
    /********************************************************
     */

    static class PrivateBean {
        String a;

        private PrivateBean() { }

        private PrivateBean(String a) { this.a = a; }
    }
    
    /*
    /********************************************************
    /* Unit tests
    /********************************************************
     */
    
    

}
