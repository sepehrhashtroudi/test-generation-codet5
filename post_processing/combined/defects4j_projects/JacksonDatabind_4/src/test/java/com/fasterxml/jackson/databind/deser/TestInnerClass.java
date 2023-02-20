package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;

public class TestInnerClass extends BaseMapTest
{
    // [JACKSON-594]
    static class Dog
    {
      public String name;
      public Brain brain;

      public Dog() { }
      public Dog(String n, boolean thinking) {
          name = n;
          brain = new Brain();
          brain.isThinking = thinking;
      }
      
      // note: non-static
      public class Brain {
          public boolean isThinking;

          public String parentName() { return name; }
      }
    }

    /*
    /**********************************************************
    /* Tests
    /**********************************************************
     */

    
}
