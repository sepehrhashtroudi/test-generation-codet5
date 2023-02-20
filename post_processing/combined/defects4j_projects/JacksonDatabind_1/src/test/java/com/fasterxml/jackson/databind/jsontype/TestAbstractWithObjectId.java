package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

import java.util.*;

public class TestAbstractWithObjectId extends BaseMapTest
{
    interface BaseInterface { }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class BaseInterfaceImpl implements BaseInterface {

        @JsonProperty
        private List<BaseInterfaceImpl> myInstances = new ArrayList<BaseInterfaceImpl>();

        void addInstance(BaseInterfaceImpl instance) {
            myInstances.add(instance);
        }
    }

    static class ListWrapper<T extends BaseInterface> {

        @JsonProperty
        private List<T> myList = new ArrayList<T>();

        void add(T t) {
            myList.add(t);
        }

        int size() {
            return myList.size();
        }
    }

    
}
