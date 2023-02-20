package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 Tests that the selector selects correctly.

 @author Jonathan Hedley, jonathan@hedley.net */
public class SelectorTest {
@Test
public void testByAttribute8() { 
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
public void parentChildStar() { 
     String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divChilds = doc.select("div > *"); 
     assertEquals(3, divChilds.size()); 
     assertEquals("p", divChilds.get(0).tagName()); 
     assertEquals("p", divChilds.get(1).tagName()); 
     assertEquals("span", divChilds.get(2).tagName()); 
 }
@Test
public void testPseudoBetween9() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>"); 
     Elements ps = doc.select("div p:gt(0):lt(2)"); 
     assertEquals(1, ps.size()); 
     assertEquals("Two", ps.get(0).text()); 
 }
@Test
public void testPseudoCombined10() { 
     Document doc = Jsoup.parse("<div class='foo'><p>One</p><p>Two</p></div><div><p>Three</p><p>Four</p></div>"); 
     Elements ps = doc.select("div.foo p:gt(0)"); 
     assertEquals(1, ps.size()); 
     assertEquals("Two", ps.get(0).text()); 
 }
@Test
public void testPseudoEquals11() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>"); 
     Elements ps = doc.select("div p:eq(0)"); 
     assertEquals(2, ps.size()); 
     assertEquals("One", ps.get(0).text()); 
     assertEquals("Four", ps.get(1).text()); 
     Elements ps2 = doc.select("div:eq(0) p:eq(0)"); 
     assertEquals(1, ps2.size()); 
     assertEquals("One", ps2.get(0).text()); 
     assertEquals("p", ps2.get(0).tagName()); 
 }
@Test
public void testSupportsLeadingCombinator15() { 
     String h = "<div><p><span>One</span><span>Two</span></p></div>"; 
     Document doc = Jsoup.parse(h); 
     Element p = doc.select("div > p").first(); 
     Elements spans = p.select("> span"); 
     assertEquals(2, spans.size()); 
     assertEquals("One", spans.first().text()); 
     h = "<div id=1><div id=2><div id=3></div></div></div>"; 
     doc = Jsoup.parse(h); 
     Element div = doc.select("div").select(" > div").first(); 
     assertEquals("2", div.id()); 
 }
@Test
public void mixCombinatorGroup() { 
     String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements els = doc.select(".foo > ol, ol > li + li"); 
     assertEquals(3, els.size()); 
     assertEquals("ol", els.get(0).tagName()); 
     assertEquals("Two", els.get(1).text()); 
     assertEquals("Three", els.get(2).text()); 
 }
@Test
public void adjacentSiblings() { 
     String h = "<ol><li>One<li>Two<li>Three</ol>"; 
     Document doc = Jsoup.parse(h); 
     Elements sibs = doc.select("li + li"); 
     assertEquals(2, sibs.size()); 
     assertEquals("Two", sibs.get(0).text()); 
     assertEquals("Three", sibs.get(1).text()); 
 }
@Test
public void generalSiblings() { 
     String h = "<ol><li id=1>One<li id=2>Two<li id=3>Three</ol>"; 
     Document doc = Jsoup.parse(h); 
     Elements els = doc.select("#1 ~ #3"); 
     assertEquals(1, els.size()); 
     assertEquals("Three", els.first().text()); 
 }
@Test
public void caseInsensitive() { 
     String h = "<dIv tItle=bAr><div>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals(2, doc.select("DIV").size()); 
     assertEquals(1, doc.select("DIV[TITLE]").size()); 
     assertEquals(1, doc.select("DIV[TITLE=BAR]").size()); 
     assertEquals(0, doc.select("DIV[TITLE=BARBARELLA").size()); 
 }
    

    

    

    

    
    
    

    

    

    
    
    

    

    
    
    

    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // for http://github.com/jhy/jsoup/issues#issue/10
    
    
    // for http://github.com/jhy/jsoup/issues#issue/13
    
    
    
    
    
    
    
    
    
    
    
}
