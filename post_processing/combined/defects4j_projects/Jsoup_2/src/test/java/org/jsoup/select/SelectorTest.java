package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 Tests that the selector selects correctly.

 @author Jonathan Hedley, jonathan@hedley.net */
public class SelectorTest {
@Test
public void parentChildStar() { 
     String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divChilds = doc.select("div > *"); 
     assertEquals(3, divChilds.size()); 
     assertEquals("p", divChilds.get(0).tagName()); 
     assertEquals("p", divChilds.get(1).tagName()); 
     assertEquals("span", divChilds.get(2).tagName()); 
 }
@Test
public void parentChildStar() { 
     String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divChilds = doc.select("div > *"); 
     assertEquals(2, divChilds.size()); 
     assertEquals("p", divChilds.get(0).tagName()); 
     assertEquals("span", divChilds.get(1).tagName()); 
 }
@Test
public void parentChildStar() { 
     String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divChilds = doc.select("div > *"); 
     assertEquals(3, divChilds.size()); 
     assertEquals("p", divChilds.get(0).tagName()); 
     assertEquals("p", divChilds.get(1).tagName()); 
     assertEquals("span", divChilds.get(2).tagName()); 
     assertEquals("p", divChilds.get(3).tagName()); 
 }
@Test
public void byId() { 
     String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divs = doc.select("div > *"); 
     assertEquals(2, divs.size()); 
     assertEquals("p", divs.get(0).id()); 
     assertEquals("span", divs.get(1).id()); 
     assertEquals("p", divs.get(2).id()); 
 }
@Test
public void testById21() { 
     String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divs = doc.select("div > *"); 
     assertEquals(2, divs.size()); 
     assertEquals("p", divs.get(0).id()); 
     assertEquals("span", divs.get(1).id()); 
     assertEquals("p", divs.get(2).id()); 
 }
@Test
public void testByClass22() { 
     String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divs = doc.select("div > *"); 
     assertEquals(2, divs.size()); 
     assertEquals("p", divs.get(0).tagName()); 
     assertEquals("span", divs.get(1).tagName()); 
     assertEquals("p", divs.get(2).tagName()); 
 }
@Test
public void parentChildStar() { 
     String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divChilds = doc.select("div > *"); 
     assertEquals(3, divChilds.size()); 
     assertEquals("p", divChilds.get(0).tagName()); 
     assertEquals("b", divChilds.get(1).tagName()); 
     assertEquals("p", divChilds.get(2).tagName()); 
 }
@Test
public void testFilterForDescendants23() { 
     String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divChilds = doc.select("div > *"); 
     assertEquals(3, divChilds.size()); 
     assertEquals("p", divChilds.get(0).tagName()); 
     assertEquals("p", divChilds.get(1).tagName()); 
     assertEquals("span", divChilds.get(2).tagName()); 
 }
@Test
public void parentChildStar() { 
     String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divChilds = doc.select("div > *"); 
     assertEquals(2, divChilds.size()); 
     assertEquals("p", divChilds.get(0).tagName()); 
     assertEquals("p", divChilds.get(1).tagName()); 
 }
    

    

    

    

    
    
    

    

    

    
    
    

    

    
    
    

    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // for http://github.com/jhy/jsoup/issues#issue/10
    
    
    // for http://github.com/jhy/jsoup/issues#issue/13
    
    
    
    
    
    
    
    
    
    
    
}
