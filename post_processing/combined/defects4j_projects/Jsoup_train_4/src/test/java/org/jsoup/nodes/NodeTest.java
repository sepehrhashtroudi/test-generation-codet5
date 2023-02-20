package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 Tests Nodes

 @author Jonathan Hedley, jonathan@hedley.net */
public class NodeTest {
@Test
public void testReplace3() { 
     Document doc = Jsoup.parse("<p>One <span>two</span> three</p>"); 
     Element p = doc.select("p").first(); 
     Element insert = doc.createElement("em").text("foo"); 
     p.childNode(1).replaceWith(insert); 
     assertEquals("One <em>foo</em> three", p.html()); 
 }
@Test
public void testRemove4() { 
     Document doc = Jsoup.parse("<p>One <span>two</span> three</p>"); 
     Element p = doc.select("p").first(); 
     p.childNode(0).remove(); 
     assertEquals("two three", p.text()); 
     assertEquals("<span>two</span> three", p.html()); 
 }
    

    
    
    
    
    
}
