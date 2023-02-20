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
public void attr() { 
     Document doc = Jsoup.parse("<p title=foo><p title=bar><p class=foo><p class=bar>"); 
     String classVal = doc.select("p").attr("class"); 
     assertEquals("foo", classVal); 
 }
@Test
public void setHtml() { 
     Document doc = Jsoup.parse("<p>One</p><p>Two</p><p>Three</p>"); 
     Elements ps = doc.select("p"); 
     ps.prepend("<b>Bold</b>").append("<i>Ital</i>"); 
     assertEquals("<p><b>Bold</b>Two<i>Ital</i></p>", TextUtil.stripNewlines(ps.get(1).outerHtml())); 
     ps.html("<span>Gone</span>"); 
     assertEquals("<p><span>Gone</span></p>", TextUtil.stripNewlines(ps.get(1).outerHtml())); 
 }
@Test
public void removeClass() { 
     String h = "<p>Hello<p title=foo>there<p>world"; 
     Document doc = Jsoup.parse(h); 
     doc.select("p").removeClass("foo"); 
     assertEquals("there", doc.select("p").size()); 
 }
@Test
public void removeClass() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("Hello", divs.get(0).className()); 
     assertEquals("There", divs.get(1).className()); 
 }
@Test
public void removeClass() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p></p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("p", divs.get(0).className()); 
     assertEquals("Hello", divs.get(1).className()); 
 }
@Test
public void toggleClass() { 
     Document doc = Jsoup.parse("<p>One</p><p>Two</p><p>Three</p>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("Two", ps.get(0).className()); 
     assertEquals("Three", ps.get(1).className()); 
 }
@Test
public void toggleClass() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("Hello", divs.get(0).className()); 
     assertEquals("There", divs.get(1).className()); 
 }
@Test
public void hasClass() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p></p></div>"); 
     Elements divs = doc.select("div"); 
     assertTrue(divs.hasClass("p")); 
     assertFalse(doc.select("div + div").hasClass("p")); 
 }
@Test
public void testClassNames11() { 
     String h = "<div Title=Foo /><div Title=Bar /><div Style=Qux /><div title=Bam /><div title=SLAM /><div />"; 
     Document doc = Jsoup.parse(h); 
     Elements withTitle = doc.select("[title]"); 
     assertEquals(4, withTitle.size()); 
     Elements foo = doc.select("[title=foo]"); 
     assertEquals(1, foo.size()); 
     Elements not = doc.select("div[title!=bar]"); 
     assertEquals(5, not.size()); 
     assertEquals("Foo", not.first().attr("title")); 
     Elements starts = doc.select("[title^=ba]"); 
     assertEquals(2, starts.size()); 
     assertEquals("Bar", starts.first().attr("title")); 
     assertEquals("Bam", starts.last().attr("title")); 
     Elements ends = doc.select("[title$=am]"); 
     assertEquals(2, ends.size()); 
     assertEquals("Bam", ends.first().attr("title")); 
     assertEquals("SLAM", ends.last().attr("title")); 
     Elements contains = doc.select("[title*=a]"); 
     assertEquals(3, contains.size()); 
     assertEquals("Bar", contains.first().attr("title")); 
     assertEquals("SLAM", contains.last().attr("title")); 
 }
@Test
public void testSetHtml12() { 
     Document doc = Jsoup.parse("<p>One</p><p>Two</p><p>Three</p>"); 
     Elements ps = doc.select("p"); 
     ps.prepend("<b>Bold</b>").append("<i>Ital</i>"); 
     assertEquals("<p><b>Bold</b>Two<i>Ital</i></p>", TextUtil.stripNewlines(ps.get(1).outerHtml())); 
     ps.html("<span>Gone</span>"); 
     assertEquals("<p><span>Gone</span></p>", TextUtil.stripNewlines(ps.get(1).outerHtml())); 
 }
    

    
    
    
    
    

    
    
    

    
    
    
    
    
    
    
    
    

    
    
    
    
    
}
