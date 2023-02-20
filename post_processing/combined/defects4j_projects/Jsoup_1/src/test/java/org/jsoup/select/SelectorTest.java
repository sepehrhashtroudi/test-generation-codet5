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
    

    

    

    

    
    
    

    

    

    
    
    

    

    
    
    

    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // for http://github.com/jhy/jsoup/issues#issue/10
    
    
    // for http://github.com/jhy/jsoup/issues#issue/13
    
    
    
    
    
    
    
    
    
    
    
}
