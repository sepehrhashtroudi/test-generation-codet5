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
public void testAppendText42() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); 
     Element p = doc.select("p").first(); 
     p.appendText("there"); 
     assertEquals("there", p.text()); 
 }
@Test
public void testAppendText44() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("there", ps.get(0).text()); 
     assertEquals("p", ps.get(1).text()); 
     assertEquals("there", ps.get(2).text()); 
 }
@Test
public void testNextElementSibling50() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("One", ps.get(0).text()); 
     assertEquals("Two", ps.get(1).text()); 
     assertEquals("Three", ps.get(2).text()); 
 }
@Test
public void testNextElementSibling51() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("Two", ps.get(0).text()); 
     assertEquals("Three", ps.get(1).text()); 
 }
@Test
public void testFirstElementSibling52() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div>"); 
     Elements ps = doc.select("p"); 
     assertTrue(ps.size() == 3); 
     assertEquals("One", ps.get(0).text()); 
     assertEquals("Two", ps.get(1).text()); 
     assertEquals("Three", ps.get(2).text()); 
 }
@Test
public void lastElementSibling() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("Two", ps.get(0).text()); 
     assertEquals("Three", ps.get(1).text()); 
 }
@Test
public void testLastElementSibling54() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("Two", ps.get(0).text()); 
     assertEquals("Three", ps.get(1).text()); 
 }
    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    

    


}
