package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 Tag tests.
 @author Jonathan Hedley, jonathan@hedley.net */
public class TagTest {

@Test
public void spanSemantics() { 
     Tag span = Tag.valueOf("span"); 
     Tag p = Tag.valueOf("p"); 
     Tag div = Tag.valueOf("div"); 
     assertTrue(span.canContain(span)); 
     assertFalse(span.canContain(p)); 
     assertFalse(span.canContain(div)); 
 }
@Test
public void divSemantics() { 
     Tag div = Tag.valueOf("div"); 
     Tag p = Tag.valueOf("p"); 
     assertTrue(div.canContain(div)); 
     assertTrue(div.canContain(p)); 
 }
    

    

    

    

    

    

    

    

    

    
}
