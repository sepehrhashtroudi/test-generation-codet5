package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 Tag tests.
 @author Jonathan Hedley, jonathan@hedley.net */
public class TagTest {

@Test
public void imgSemantics() { 
     Tag img = Tag.valueOf("img"); 
     Tag p = Tag.valueOf("p"); 
     assertFalse(img.canContain(img)); 
     assertFalse(img.canContain(p)); 
 }
@Test
public void divSemantics() { 
     Tag div = Tag.valueOf("div"); 
     Tag p = Tag.valueOf("p"); 
     assertTrue(div.canContain(div)); 
     assertTrue(div.canContain(p)); 
 }
    

    

    

    

    

    

    

    

    

    
}
