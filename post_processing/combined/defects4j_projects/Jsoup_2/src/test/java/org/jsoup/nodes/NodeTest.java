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
public void handlesInvalidBaseUri() { 
     String h = "<A HREF=\"javascript:document.location=\'http://www.google.com\'>One</A>"; 
     Document doc = Jsoup.parse(h); 
     Element a = doc.select("a").first(); 
     assertEquals("http://www.google.com", a.baseUri()); 
     assertEquals("http://www.google.com", a.baseUri()); 
     assertEquals("http://www.google.com/", a.childNode(0).baseUri()); 
     assertEquals("http://www.google.com/", a.childNode(1).baseUri()); 
     assertEquals("http://www.google.com/", a.childNode(2).baseUri()); 
     assertEquals("http://www.google.com/", a.childNode(3).baseUri()); 
     assertEquals("http://www.google.com/", a.childNode(4).baseUri()); 
     assertEquals("http://www.google.com/", a.childNode(5).baseUri()); 
 }
@Test
public void handlesInvalidStartTags() { 
     String h = "<div id=1><p>Hello</p></div><div id=2><p>There</p></div>"; 
     Document doc = Jsoup.parse(h); 
     assertNull(doc.select("div").first()); 
     assertEquals("1", doc.select("div").first().text()); 
     assertEquals("2", doc.select("div").last().text()); 
 }
    

    
    
    
    
    
}
