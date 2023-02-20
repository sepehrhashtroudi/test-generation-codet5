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
     Document doc = Jsoup.parse("<input value='one' /><textarea>two</textarea>"); 
     Elements els = doc.select("form > *"); 
     assertEquals(2, els.size()); 
     assertEquals("one", els.val()); 
     assertEquals("two", els.last().val()); 
     els.val("three"); 
     assertEquals("three", els.first().val()); 
     assertEquals("three", els.last().val()); 
     assertEquals("<textarea>three</textarea>", els.last().outerHtml()); 
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
public void attr() { 
     Document doc = Jsoup.parse("<p title=foo><p title=bar><p class=foo><p class=bar>"); 
     String classVal = doc.select("p").attr("class"); 
     assertEquals("foo", classVal); 
 }
@Test
public void hasAttr() { 
     Document doc = Jsoup.parse("<p title=foo><p title=bar><p class=foo><p class=bar>"); 
     Elements ps = doc.select("p"); 
     assertTrue(ps.hasAttr("class")); 
     assertFalse(ps.hasAttr("style")); 
 }
@Test
public void classes() { 
     Document doc = Jsoup.parse("<div><p class='mellow yellow'></p><p class='red green'></p>"); 
     Elements els = doc.select("p"); 
     assertTrue(els.hasClass("red")); 
     assertFalse(els.hasClass("blue")); 
     els.addClass("blue"); 
     els.removeClass("yellow"); 
     els.toggleClass("mellow"); 
     assertEquals("blue", els.get(0).className()); 
     assertEquals("red green blue mellow", els.get(1).className()); 
 }
@Test
public void hasText() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p></p></div>"); 
     Elements divs = doc.select("div"); 
     assertTrue(divs.hasText()); 
     assertFalse(doc.select("div + div").hasText()); 
 }
@Test
public void outerHtml() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals("<div><p>Hello</p></div><div><p>There</p></div>", TextUtil.stripNewlines(divs.outerHtml())); 
 }
@Test
public void wrap() { 
     String h = "<p><b>This</b> is <b>jsoup</b></p>"; 
     Document doc = Jsoup.parse(h); 
     doc.select("b").wrap("<i></i>"); 
     assertEquals("<p><i><b>This</b></i> is <i><b>jsoup</b></i></p>", doc.body().html()); 
 }
@Test
public void is() { 
     String h = "<p>Hello<p title=foo>there<p>world"; 
     Document doc = Jsoup.parse(h); 
     Elements ps = doc.select("p"); 
     assertTrue(ps.is("[title=foo]")); 
     assertFalse(ps.is("[title=bar]")); 
 }
    

    
    
    
    
    

    
    
    

    
    
    
    
    
    
    
    
    

    
    
    
    
    
}
