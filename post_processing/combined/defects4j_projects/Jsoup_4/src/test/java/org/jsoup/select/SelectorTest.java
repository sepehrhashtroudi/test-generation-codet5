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
public void parsesUnterminatedAttribute() { 
     String h1 = "<p id=\"foo"; 
     Document doc = Jsoup.parse(h1); 
     Element p = doc.getElementById("foo"); 
     assertNotNull(p); 
     assertEquals("p", p.tagName()); 
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
 }
@Test
public void adjacentSiblings() { 
     String h = "<ol><li>One<li>Two<li>Three</ol>"; 
     Document doc = Jsoup.parse(h); 
     Elements sibs = doc.select("li + li"); 
     assertEquals(2, sibs.size()); 
     assertEquals("Two", sibs.get(0).text()); 
     assertEquals("Three", sibs.get(1).text()); 
 }
@Test
public void testPseudoCombined3() { 
     Document doc = Jsoup.parse("<div class='foo'><p>One</p><p>Two</p></div><div><p>Three</p><p>Four</p></div>"); 
     Elements ps = doc.select("div.foo p:gt(0)"); 
     assertEquals(1, ps.size()); 
     assertEquals("Two", ps.get(0).text()); 
 }
    

    

    

    

    
    
    

    

    

    
    
    

    

    
    
    

    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // for http://github.com/jhy/jsoup/issues#issue/10
    
    
    // for http://github.com/jhy/jsoup/issues#issue/13
    
    
    
    
    
    
    
    
    
    
    
}
