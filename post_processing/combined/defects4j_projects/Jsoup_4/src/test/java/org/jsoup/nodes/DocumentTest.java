package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 Tests for Document.

 @author Jonathan Hedley, jonathan@hedley.net */
public class DocumentTest {
@Test
public void parsesSimpleDocument() { 
     String html = "<html><head><title>First!</title></head><body><p>First post! <img src=\"foo.png\" /></p></body></html>"; 
     Document doc = Jsoup.parse(html); 
     Element p = doc.body().child(0); 
     assertEquals("p", p.tagName()); 
     Element img = p.child(0); 
     assertEquals("foo.png", img.attr("src")); 
     assertEquals("img", img.tagName()); 
 }
@Test
public void createsStructureFromBodySnippet() { 
     String html = "foo <b>bar</b> baz"; 
     Document doc = Jsoup.parse(html); 
     assertEquals("foo bar baz", doc.text()); 
 }
    
    
    
}
