package com.fasterxml.jackson.databind.mixins;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

public class TestMixinSerWithViews
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper bean classes
    /**********************************************************
     */

    static class SimpleTestData
    {
        private String name = "shown";
        private String nameHidden = "hidden";

        public String getName() { return name; }
        public String getNameHidden( ) { return nameHidden; }

      public void setName( String name ) {
        this.name = name;
      }

      public void setNameHidden( String nameHidden ) {
        this.nameHidden = nameHidden;
      }
    }

    static class ComplexTestData
    {
      String nameNull = null;

      String nameComplex = "complexValue";

      String nameComplexHidden = "nameComplexHiddenValue";

      SimpleTestData testData = new SimpleTestData( );

      SimpleTestData[] testDataArray = new SimpleTestData[] { new SimpleTestData( ), null };

      public String getNameNull()
      {
        return nameNull;
      }

      public void setNameNull( String nameNull )
      {
        this.nameNull = nameNull;
      }

      public String getNameComplex()
      {
        return nameComplex;
      }

      public void setNameComplex( String nameComplex )
      {
        this.nameComplex = nameComplex;
      }

      public String getNameComplexHidden()
      {
        return nameComplexHidden;
      }

      public void setNameComplexHidden( String nameComplexHidden )
      {
        this.nameComplexHidden = nameComplexHidden;
      }

      public SimpleTestData getTestData()
      {
        return testData;
      }

      public void setTestData( SimpleTestData testData )
      {
        this.testData = testData;
      }

      public SimpleTestData[] getTestDataArray()
      {
        return testDataArray;
      }

      public void setTestDataArray( SimpleTestData[] testDataArray )
      {
        this.testDataArray = testDataArray;
      }
    }    

    public interface TestDataJAXBMixin
    {
      @JsonView( Views.View.class )
      String getName( );
    }

    public interface TestComplexDataJAXBMixin
    {
      @JsonView( Views.View.class )
      String getNameNull();

      @JsonView( Views.View.class )
      String getNameComplex();

      @JsonView( Views.View.class )
      String getNameComplexHidden();

      @JsonView( Views.View.class )
      SimpleTestData getTestData();

      @JsonView( Views.View.class )
      SimpleTestData[] getTestDataArray( );
    }

    static class Views {
        static class View { }
    }
    
    public class A {
        private String name;
        private int age;
        private String surname;

        public A(String name, int age, String surname) { super(); this.name = name; this.age = age; this.surname = surname; }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }

        public void setAge(int age) { this.age = age; }

        public String getSurname() { return surname; }

        public void setSurname(String surname) { this.surname = surname; }
    }

    public interface AView { }

    public abstract class AMixInAnnotation {
        @JsonProperty("name")
        @JsonView(AView.class)
        abstract String getName();
        @JsonProperty("age") @JsonView(AView.class)
        abstract int getAge();
    }

    /*
    /**********************************************************
    /* Tests
    /**********************************************************
     */
    
        

    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    private ObjectMapper createObjectMapper( )
    {
      ObjectMapper objectMapper = new ObjectMapper( );
      objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false );
      objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL );
      objectMapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false );

      Map<Class<?>, Class<?>> sourceMixins = new HashMap<Class<?>, Class<?>>( );
      sourceMixins.put( SimpleTestData.class, TestDataJAXBMixin.class );
      sourceMixins.put( ComplexTestData.class, TestComplexDataJAXBMixin.class );
      
      objectMapper.setMixInAnnotations(sourceMixins);
      return objectMapper;
    }
}
