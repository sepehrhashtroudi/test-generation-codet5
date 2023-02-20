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
public void testPseudoEquals5() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>"); 
     Elements ps = doc.select("div p:eq(0)"); 
     assertEquals(2, ps.size()); 
     assertEquals("One", ps.get(0).text()); 
     assertEquals("Four", ps.get(1).text()); 
     Elements ps2 = doc.select("div:eq(0) p:eq(0)"); 
     assertEquals(1, ps2.size()); 
     assertEquals("One", ps2.get(0).text()); 
     assertEquals("p", ps2.get(0).tagName()); 
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
 }
@Test
public void and() { 
     String h = "<div id=1 class='foo bar' title=bar name=qux><p class=foo title=bar>Hello</p></div"; 
     Document doc = Jsoup.parse(h); 
     Elements div = doc.select("div.foo"); 
     assertEquals(1, div.size()); 
     assertEquals("div", div.first().tagName()); 
     Elements p = doc.select("div .foo"); 
     assertEquals(1, p.size()); 
     assertEquals("p", p.first().tagName()); 
     Elements div2 = doc.select("div#1.foo.bar[title=bar][name=qux]"); 
     assertEquals(1, div2.size()); 
     assertEquals("div", div2.first().tagName()); 
     Elements p2 = doc.select("div *.foo"); 
     assertEquals(1, p2.size()); 
     assertEquals("p", p2.first().tagName()); 
 }
@Test
public void parsesUnterminatedAttribute() { 
     String h1 = "<p id=\"foo"; 
     Document doc = Jsoup.parse(h1); 
     Element p = doc.getElementById("foo"); 
     assertNotNull(p); 
     assertEquals("p", p.tagName()); 
 }
    

    

    

    

    
    
    

    

    

    
    
    

    

    
    
    

    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // for http://github.com/jhy/jsoup/issues#issue/10
    
    
    // for http://github.com/jhy/jsoup/issues#issue/13
    
    
    
    
    
    
    
    
    
    
    
}
