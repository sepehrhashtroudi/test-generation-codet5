package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

/**
 * Tests for Element (DOM stuff mostly).
 *
 * @author Jonathan Hedley
 */
public class ElementTest {
    private String reference = "<div id=div1><p>Hello</p><p>Another <b>element</b></p><div id=div2><img src=foo.png></div></div>";

@Test
public void id() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     assertEquals("1", div.id()); 
     assertEquals("Hello", div.text()); 
     Element p = doc.getElementById("2"); 
     assertEquals("2", p.id()); 
     assertEquals("p", p.tagName()); 
 }
@Test
public void testGetElementById6() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     assertEquals("1", div.id()); 
     assertNull(doc.getElementById("none")); 
     Document doc2 = Jsoup.parse("<div id=2><p>There</p></div>"); 
     Element div2 = doc2.getElementById("2"); 
     assertEquals("2", div2.id()); 
     Element div3 = doc2.getElementById("3"); 
     assertEquals("3", div3.id()); 
 }
@Test
public void testGetElementById7() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     assertEquals("1", div.id()); 
     assertNull(doc.getElementById("none")); 
     Element div2 = doc.getElementById("2"); 
     assertEquals("2", div2.id()); 
     Element p2 = doc.getElementById("p"); 
     assertEquals("p", p2.tagName()); 
 }
@Test
public void testGetElementById8() { 
     Document doc = Jsoup.parse("<div id=1><div id=2><p>Hello</p></div></div>"); 
     Element div = doc.getElementById("1"); 
     assertEquals("1", div.id()); 
     assertNull(doc.getElementById("2")); 
 }
@Test
public void hasText() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div>"); 
     Elements divs = doc.select("div"); 
     assertTrue(divs.hasText()); 
     assertFalse(doc.select("div + div").hasText()); 
 }
@Test
public void hasText() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div>"); 
     Element p = doc.select("p").first(); 
     assertTrue(p.hasText()); 
     assertFalse(doc.select("p").hasText()); 
 }
    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    

    


}
