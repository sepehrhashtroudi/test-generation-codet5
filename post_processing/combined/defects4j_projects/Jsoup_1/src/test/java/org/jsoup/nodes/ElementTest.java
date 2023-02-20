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
public void testGetSiblings4() { 
     Document doc = Jsoup.parse("<div><p>Hello<p id=1>there<p>this<p>is<p>an<p id=last>element</div>"); 
     Element p = doc.getElementById("1"); 
     assertEquals("there", p.text()); 
     assertEquals("Hello", p.previousElementSibling().text()); 
     assertEquals("this", p.nextElementSibling().text()); 
     assertEquals("Hello", p.firstElementSibling().text()); 
     assertEquals("element", p.lastElementSibling().text()); 
 }
@Test
public void testSetHtml5() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.html("<p>there</p><p>now</p>"); 
     assertEquals("<p>there</p><p>now</p>", TextUtil.stripNewlines(div.html())); 
 }
@Test
public void testGetText6() { 
     Document doc = Jsoup.parse("<p>One <span>two</span> three</p>"); 
     Element p = doc.select("p").first(); 
     TextNode tn = (TextNode) p.childNode(2); 
     assertEquals(" three", tn.text()); 
     tn.text(" POW!"); 
     assertEquals("One <span>two</span> POW!", p.html()); 
 }
@Test
public void setTextPreservesDocumentStructure() { 
     Document doc = Jsoup.parse("<p>Hello</p>"); 
     doc.text("Replaced"); 
     assertEquals("Replaced", doc.text()); 
     assertEquals("Replaced", doc.body().text()); 
     assertEquals(1, doc.select("head").size()); 
 }
@Test
public void testAddNewText7() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.text(" there & now >"); 
     assertEquals("<p>Hello</p> there &amp; now &gt;", TextUtil.stripNewlines(div.html())); 
 }
@Test
public void handlesFrames() { 
     String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals("<html><head><script></script><noscript></noscript></head><frameset><frame src=\"foo\" /><frame src=\"foo\" /></frameset><body></body></html>", TextUtil.stripNewlines(doc.html())); 
 }
@Test
public void parsesComments() { 
     String html = "<html><head><title>First!</title></head><body><p>First post! <img src=\"foo.png\" /></p></body></html>"; 
     Document doc = Jsoup.parse(html); 
     Element p = doc.body().child(0); 
     assertEquals("p", p.tagName()); 
     Element img = p.child(0); 
     assertEquals("foo.png", img.attr("src")); 
     assertEquals("img", img.tagName()); 
 }
    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    

    


}
