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
public void handlesAbsPrefix() { 
     Document doc = Jsoup.parse("<a href=/foo>Hello</a>", "http://jsoup.org/"); 
     Element a = doc.select("a").first(); 
     assertEquals("/foo", a.attr("href")); 
     assertEquals("http://jsoup.org/foo", a.attr("abs:href")); 
     assertFalse(a.hasAttr("abs:href")); 
 }
@Test
public void handlesBaseUri() { 
     Tag tag = Tag.valueOf("a"); 
     Attributes attribs = new Attributes(); 
     attribs.put("relHref", "/foo"); 
     attribs.put("absHref", "http://bar/qux"); 
     Element noBase = new Element(tag, "", attribs); 
     assertEquals("", noBase.absUrl("relHref")); 
     assertEquals("http://bar/qux", noBase.absUrl("absHref")); 
     Element withBase = new Element(tag, "http://foo/", attribs); 
     assertEquals("http://foo/foo", withBase.absUrl("relHref")); 
     assertEquals("http://bar/qux", withBase.absUrl("absHref")); 
     assertEquals("", withBase.absUrl("noval")); 
     Element dodgyBase = new Element(tag, "wtf://no-such-protocol/", attribs); 
     assertEquals("http://bar/qux", dodgyBase.absUrl("absHref")); 
     assertEquals("", dodgyBase.absUrl("relHref")); 
 }
@Test
public void testRemove2() { 
     Document doc = Jsoup.parse("<p>One <span>two</span> three</p>"); 
     Element p = doc.select("p").first(); 
     p.childNode(0).remove(); 
     assertEquals("two three", p.text()); 
     assertEquals("<span>two</span> three", p.html()); 
 }
    

    
    
    
    
    
}
