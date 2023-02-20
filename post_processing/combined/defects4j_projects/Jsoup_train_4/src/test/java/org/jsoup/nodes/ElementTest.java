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
public void testWrapWithRemainder5() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div>"); 
     Element p = doc.select("p").first(); 
     p.wrap("<div class='head'></div><p>There!</p>"); 
     assertEquals("<div><div class=\"head\"><p>Hello</p><p>There!</p></div></div>", TextUtil.stripNewlines(doc.body().html())); 
 }
@Test
public void testClassDomMethods8() { 
     Document doc = Jsoup.parse("<div><span class='mellow yellow'>Hello <b>Yellow</b></span></div>"); 
     List<Element> els = doc.getElementsByAttribute("class"); 
     Element span = els.get(0); 
     assertEquals("mellow yellow", span.className()); 
     assertTrue(span.hasClass("mellow")); 
     assertTrue(span.hasClass("yellow")); 
     Set<String> classes = span.classNames(); 
     assertEquals(2, classes.size()); 
     assertTrue(classes.contains("mellow")); 
     assertTrue(classes.contains("yellow")); 
     assertEquals("", doc.className()); 
     assertFalse(doc.hasClass("mellow")); 
 }
@Test
public void testOuterHtml15() { 
     Document doc = Jsoup.parse("<div title='Tags &amp;c.'><img src=foo.png><p><!-- comment -->Hello<p>there"); 
     assertEquals("<html><head></head><body><div title=\"Tags &amp;c.\"><img src=\"foo.png\" /><p><!-- comment -->Hello</p><p>there</p></div></body></html>", TextUtil.stripNewlines(doc.outerHtml())); 
 }
@Test
public void testSetHtml17() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.html("<p>there</p><p>now</p>"); 
     assertEquals("<p>there</p><p>now</p>", TextUtil.stripNewlines(div.html())); 
 }
@Test
public void testPrependElement18() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.prependElement("p").text("Before"); 
     assertEquals("Before", div.child(0).text()); 
     assertEquals("Hello", div.child(1).text()); 
 }
@Test
public void testAddNewText19() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.appendText(" there & now >"); 
     assertEquals("<p>Hello</p> there &amp; now &gt;", TextUtil.stripNewlines(div.html())); 
 }
@Test
public void testGetSiblings20() { 
     Document doc = Jsoup.parse("<div><p>Hello<p id=1>there<p>this<p>is<p>an<p id=last>element</div>"); 
     Element p = doc.getElementById("1"); 
     assertEquals("there", p.text()); 
     assertEquals("Hello", p.previousElementSibling().text()); 
     assertEquals("this", p.nextElementSibling().text()); 
     assertEquals("Hello", p.firstElementSibling().text()); 
     assertEquals("element", p.lastElementSibling().text()); 
 }
@Test
public void testElementSiblingIndex21() { 
     Document doc = Jsoup.parse("<div><p>One</p>...<p>Two</p>...<p>Three</p>"); 
     Elements ps = doc.select("p"); 
     assertTrue(0 == ps.get(0).elementSiblingIndex()); 
     assertTrue(1 == ps.get(1).elementSiblingIndex()); 
     assertTrue(2 == ps.get(2).elementSiblingIndex()); 
 }
@Test
public void testGetElementById22() { 
     Document doc = Jsoup.parse(reference); 
     Element div = doc.getElementById("div1"); 
     assertEquals("div1", div.id()); 
     assertNull(doc.getElementById("none")); 
     Document doc2 = Jsoup.parse("<div id=1><div id=2><p>Hello <span id=2>world!</span></p></div></div>"); 
     Element div2 = doc2.getElementById("2"); 
     assertEquals("div", div2.tagName()); 
     Element span = div2.child(0).getElementById("2"); 
     assertEquals("span", span.tagName()); 
 }
@Test
public void testSetText23() { 
     String h = "<div id=1>Hello <p>there <b>now</b></p></div>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals("Hello there now", doc.text()); 
     assertEquals("there now", doc.select("p").get(0).text()); 
     Element div = doc.getElementById("1").text("Gone"); 
     assertEquals("Gone", div.text()); 
     assertEquals(0, doc.select("p").size()); 
 }
@Test
public void testGetText24() { 
     Document doc = Jsoup.parse(reference); 
     assertEquals("Hello Another element", doc.text()); 
     assertEquals("Another element", doc.getElementsByTag("p").get(1).text()); 
 }
@Test
public void testHasText25() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p></p></div>"); 
     Element div = doc.select("div").first(); 
     Elements ps = doc.select("p"); 
     assertTrue(div.hasText()); 
     assertTrue(ps.first().hasText()); 
     assertFalse(ps.last().hasText()); 
 }
    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    

    


}
