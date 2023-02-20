package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Document;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 Tests for ElementList.

 @author Jonathan Hedley, jonathan@hedley.net */
public class ElementsTest {
@Test
public void val() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals("Hello", divs.val()); 
     assertEquals("There", divs.last().val()); 
 }
@Test
public void attributes() { 
     String h = "<p title=foo><p title=bar><p class=foo><p class=bar>"; 
     Document doc = Jsoup.parse(h); 
     Elements withTitle = doc.select("p[title]"); 
     assertEquals(2, withTitle.size()); 
     assertTrue(withTitle.hasAttr("title")); 
     assertFalse(withTitle.hasAttr("class")); 
     assertEquals("foo", withTitle.attr("title")); 
     withTitle.val("bar"); 
     assertEquals(2, withTitle.size()); 
     assertEquals(0, doc.select("p[title]").size()); 
     Elements ps = doc.select("p").attr("style", "classy"); 
     assertEquals(4, ps.size()); 
     assertEquals("classy", ps.last().attr("style")); 
     assertEquals("bar", ps.last().attr("class")); 
 }
@Test
public void hasText() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p></p></div>"); 
     Elements divs = doc.select("div"); 
     assertTrue(divs.hasText()); 
     assertTrue(divs.first().hasText()); 
     assertFalse(divs.last().hasText()); 
 }
@Test
public void hasText() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p></p></div><div><p></p></div>"); 
     Elements divs = doc.select("div"); 
     assertTrue(divs.hasText()); 
     assertTrue(divs.first().hasText()); 
     assertFalse(divs.last().hasText()); 
 }
@Test
public void attributes() { 
     String h = "<p title=foo><p title=bar><p class=foo><p class=bar>"; 
     Document doc = Jsoup.parse(h); 
     Elements withTitle = doc.select("p[title]"); 
     assertEquals(2, withTitle.size()); 
     assertTrue(withTitle.hasAttr("title")); 
     assertFalse(withTitle.hasAttr("class")); 
     assertEquals("foo", withTitle.attr("title")); 
     withTitle.removeAttr("title"); 
     assertEquals(2, withTitle.size()); 
     assertEquals(0, doc.select("p[title]").size()); 
     Elements ps = doc.select("p").attr("style", "classy"); 
     assertEquals(4, ps.size()); 
     assertEquals("classy", ps.last().attr("style")); 
     assertEquals("bar", ps.last().attr("class")); 
 }
@Test
public void testSetHtml11() { 
     Document doc = Jsoup.parse("<p>One</p><p>Two</p><p>Three</p>"); 
     Elements ps = doc.select("p"); 
     ps.prepend("<b>Bold</b>").append("<i>Ital</i>"); 
     assertEquals("<p><b>Bold</b>Two<i>Ital</i></p>", TextUtil.stripNewlines(ps.get(1).outerHtml())); 
     ps.html("<span>Gone</span>"); 
     assertEquals("<p><span>Gone</span></p>", TextUtil.stripNewlines(ps.get(1).outerHtml())); 
 }
    

    
    
    
    
    

    
    
    

    
    
    
    
    
    
    
    
    

    
    
    
    
    
}
