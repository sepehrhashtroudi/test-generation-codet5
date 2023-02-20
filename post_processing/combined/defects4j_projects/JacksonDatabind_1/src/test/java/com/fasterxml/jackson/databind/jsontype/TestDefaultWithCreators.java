package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDefaultWithCreators
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    static abstract class Job
    {
        public long id;
    }

    static class UrlJob extends Job
    {
        private final String url;
        private final int count;
        
        @JsonCreator
        public UrlJob(@JsonProperty("id") long id, @JsonProperty("url") String url,
                @JsonProperty("count") int count)
        {
            this.id = id;
            this.url = url;
            this.count = count;
        }

        public String getUrl() { return url; }
        public int getCount() { return count; }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    
}
