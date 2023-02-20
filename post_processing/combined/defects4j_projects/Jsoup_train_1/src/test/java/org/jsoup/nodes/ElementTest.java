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
public void testWrapWithRemainder4() { 
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
public void testClassDomMethods7() { 
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
public void testSetHtml15() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.html("<p>there</p><p>now</p>"); 
     assertEquals("<p>there</p><p>now</p>", TextUtil.stripNewlines(div.html())); 
 }
@Test
public void testPrependElement16() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.prependElement("p").text("Before"); 
     assertEquals("Before", div.child(0).text()); 
     assertEquals("Hello", div.child(1).text()); 
 }
@Test
public void testAddNewText17() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.appendText(" there & now >"); 
     assertEquals("<p>Hello</p> there &amp; now &gt;", TextUtil.stripNewlines(div.html())); 
 }
@Test
public void testPrependText18() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.prependText("there & now > "); 
     assertEquals("there & now > Hello", div.text()); 
     assertEquals("there &amp; now &gt; <p>Hello</p>", TextUtil.stripNewlines(div.html())); 
 }
@Test
public void testWrap19() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); 
     Element p = doc.select("p").first(); 
     p.wrap("<div class='head'></div>"); 
     assertEquals("<div><div class=\"head\"><p>Hello</p></div><p>There</p></div>", TextUtil.stripNewlines(doc.body().html())); 
     Element ret = p.wrap("<div><div class=foo></div><p>What?</p></div>"); 
     assertEquals("<div><div class=\"head\"><div><div class=\"foo\"><p>Hello</p></div><p>What?</p></div></div><p>There</p></div>", TextUtil.stripNewlines(doc.body().html())); 
     assertEquals(ret, p); 
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
public void testGetText21() { 
     Document doc = Jsoup.parse(reference); 
     assertEquals("Hello Another element", doc.text()); 
     assertEquals("Another element", doc.getElementsByTag("p").get(1).text()); 
 }
@Test
public void testHasText22() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p></p></div>"); 
     Element div = doc.select("div").first(); 
     Elements ps = doc.select("p"); 
     assertTrue(div.hasText()); 
     assertTrue(ps.first().hasText()); 
     assertFalse(ps.last().hasText()); 
 }
@Test
public void testInnerHtml23() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div>"); 
     assertEquals("<p>Hello</p>", doc.getElementsByTag("div").get(0).html()); 
 }
    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    

    


}
