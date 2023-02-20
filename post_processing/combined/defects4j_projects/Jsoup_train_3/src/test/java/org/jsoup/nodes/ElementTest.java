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
public void getElementsByTagName() { 
     Document doc = Jsoup.parse(reference); 
     List<Element> divs = doc.getElementsByTag("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("div1", divs.get(0).id()); 
     assertEquals("div2", divs.get(1).id()); 
     List<Element> ps = doc.getElementsByTag("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("Hello", ((TextNode) ps.get(0).childNode(0)).getWholeText()); 
     assertEquals("Another ", ((TextNode) ps.get(1).childNode(0)).getWholeText()); 
     List<Element> ps2 = doc.getElementsByTag("P"); 
     assertEquals(ps, ps2); 
     List<Element> imgs = doc.getElementsByTag("img"); 
     assertEquals("foo.png", imgs.get(0).attr("src")); 
     List<Element> empty = doc.getElementsByTag("wtf"); 
     assertEquals(0, empty.size()); 
 }
@Test
public void testOuterHtml12() { 
     Document doc = Jsoup.parse("<div title='Tags &amp;c.'><img src=foo.png><p><!-- comment -->Hello<p>there"); 
     assertEquals("<html><head></head><body><div title=\"Tags &amp;c.\"><img src=\"foo.png\" /><p><!-- comment -->Hello</p><p>there</p></div></body></html>", TextUtil.stripNewlines(doc.outerHtml())); 
 }
@Test
public void testPrependElement14() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.prependElement("p").text("Before"); 
     assertEquals("Before", div.child(0).text()); 
     assertEquals("Hello", div.child(1).text()); 
 }
@Test
public void testAddNewText15() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.appendText(" there & now >"); 
     assertEquals("<p>Hello</p> there &amp; now &gt;", TextUtil.stripNewlines(div.html())); 
 }
@Test
public void testPrependText16() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.prependText("there & now > "); 
     assertEquals("there & now > Hello", div.text()); 
     assertEquals("there &amp; now &gt; <p>Hello</p>", TextUtil.stripNewlines(div.html())); 
 }
@Test
public void testWrap17() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); 
     Element p = doc.select("p").first(); 
     p.wrap("<div class='head'></div>"); 
     assertEquals("<div><div class=\"head\"><p>Hello</p></div><p>There</p></div>", TextUtil.stripNewlines(doc.body().html())); 
     Element ret = p.wrap("<div><div class=foo></div><p>What?</p></div>"); 
     assertEquals("<div><div class=\"head\"><div><div class=\"foo\"><p>Hello</p></div><p>What?</p></div></div><p>There</p></div>", TextUtil.stripNewlines(doc.body().html())); 
     assertEquals(ret, p); 
 }
@Test
public void testGetSiblings18() { 
     Document doc = Jsoup.parse("<div><p>Hello<p id=1>there<p>this<p>is<p>an<p id=last>element</div>"); 
     Element p = doc.getElementById("1"); 
     assertEquals("there", p.text()); 
     assertEquals("Hello", p.previousElementSibling().text()); 
     assertEquals("this", p.nextElementSibling().text()); 
     assertEquals("Hello", p.firstElementSibling().text()); 
     assertEquals("element", p.lastElementSibling().text()); 
 }
@Test
public void testElementSiblingIndex19() { 
     Document doc = Jsoup.parse("<div><p>One</p>...<p>Two</p>...<p>Three</p>"); 
     Elements ps = doc.select("p"); 
     assertTrue(0 == ps.get(0).elementSiblingIndex()); 
     assertTrue(1 == ps.get(1).elementSiblingIndex()); 
     assertTrue(2 == ps.get(2).elementSiblingIndex()); 
 }
@Test
public void testGetElementById20() { 
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
public void testSetText21() { 
     String h = "<div id=1>Hello <p>there <b>now</b></p></div>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals("Hello there now", doc.text()); 
     assertEquals("there now", doc.select("p").get(0).text()); 
     Element div = doc.getElementById("1").text("Gone"); 
     assertEquals("Gone", div.text()); 
     assertEquals(0, doc.select("p").size()); 
 }
@Test
public void testInnerHtml22() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div>"); 
     assertEquals("<p>Hello</p>", doc.getElementsByTag("div").get(0).html()); 
 }
    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    

    


}
