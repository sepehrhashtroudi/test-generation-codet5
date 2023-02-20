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
public void handlesInvalidStartTags() { 
     Document doc = Jsoup.parse("<p>One <span>two</span> three</p>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("two", ps.get(0).text()); 
     assertEquals("three", ps.get(1).text()); 
 }
@Test
public void handlesInvalidStartTags() { 
     String h = "<div>Hello < There <&amp;></div>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals("Hello < There <&>", doc.select("div").first().text()); 
 }
@Test
public void testIndent10() { 
     Document doc = Jsoup.parse("<p>One <span>two</span> three</p>"); 
     assertEquals("<p>One <span>two</span> three</p>", doc.select("p").first().text()); 
     assertEquals("<p>One <span>two</span> three</p>", TextUtil.stripNewlines(doc.body().html())); 
     assertEquals("<p>One <span>two</span> three</p>", TextUtil.stripNewlines(doc.body().html())); 
     assertEquals("<p>One <span>two</span> three</p>", TextUtil.stripNewlines(doc.body().html())); 
 }
@Test
public void testElements13() { 
     String h = "<div><p>Hello<p><b>there</b></p></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements els = doc.select("p"); 
     assertEquals(3, els.size()); 
     assertEquals("p", els.get(0).tagName()); 
     assertEquals("p", els.get(1).tagName()); 
     assertEquals("p", els.get(2).tagName()); 
     assertEquals("p", els.get(3).tagName()); 
     assertEquals("p", els.get(4).tagName()); 
     assertEquals("p", els.get(5).tagName()); 
     assertEquals("p", els.get(6).tagName()); 
     assertEquals("p", els.get(7).tagName()); 
     assertEquals("p", els.get(8).tagName()); 
 }
@Test
public void testList14() { 
     String h = "<div><p>Hello<p><b>there</b></p></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements els = doc.select("p"); 
     assertEquals(3, els.size()); 
     assertEquals("p", els.get(0).tagName()); 
     assertEquals("p", els.get(1).tagName()); 
     assertEquals("p", els.get(2).tagName()); 
     assertEquals("p", els.get(3).tagName()); 
     assertEquals("p", els.get(4).tagName()); 
     assertEquals("p", els.get(5).tagName()); 
     assertEquals("p", els.get(6).tagName()); 
     assertEquals("p", els.get(7).tagName()); 
     assertEquals("p", els.get(8).tagName()); 
 }
@Test
public void els() { 
     String h = "<div><p>Hello<p><b>there</b></p></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements els = doc.select("p"); 
     assertEquals(3, els.size()); 
     assertEquals("p", els.get(0).tagName()); 
     assertEquals("p", els.get(1).tagName()); 
     assertEquals("p", els.get(2).tagName()); 
     assertEquals("p", els.get(3).tagName()); 
     assertEquals("p", els.get(4).tagName()); 
     assertEquals("p", els.get(5).tagName()); 
     assertEquals("p", els.get(6).tagName()); 
     assertEquals("p", els.get(7).tagName()); 
     assertEquals("p", els.get(8).tagName()); 
 }
@Test
public void els() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>"); 
     Elements els = doc.select("p"); 
     assertEquals(3, els.size()); 
     assertEquals("One", els.get(0).text()); 
     assertEquals("Four", els.get(1).text()); 
     assertEquals("Five", els.get(2).text()); 
     assertEquals("Five", els.get(3).text()); 
     assertEquals("Seven", els.get(4).text()); 
     assertEquals("Seven", els.get(5).text()); 
     assertEquals("Seven", els.get(6).text()); 
     assertEquals("Seven", els.get(7).text()); 
     assertEquals("Seven", els.get(8).text()); 
     assertEquals("Seven", els.get(9).text()); 
     assertEquals("Seven", els.get(10).text()); 
     assertEquals("Seven", els.get(11).text()); 
     assertEquals("Seven", els.get(12).text()); 
     assertEquals("Seven", els.get(11).text()); 
     assertEquals("Seven", els.get(12).text()); 
     assertEquals("Seven", els.get(12).text()); 
     assertEquals("Seven", els.get(13).text()); 
 }
@Test
public void text() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>there</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("there", ps.get(0).text()); 
     assertEquals("there", ps.get(1).text()); 
     assertEquals("there", ps.get(2).text()); 
 }
@Test
public void text() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>there</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("there", divs.get(0).text()); 
     assertEquals("there", divs.get(1).text()); 
     assertEquals("there", divs.get(2).text()); 
 }
@Test
public void html() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>there</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals("<div><p>Hello</p></div><div><p>there</p></div>", TextUtil.stripNewlines(divs.html())); 
     assertEquals("<div><p>there</p></div><div><p>now</p></div>", TextUtil.stripNewlines(doc.body().html())); 
 }
@Test
public void html() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals("<div><p>Hello</p></div><div><p>There</p></div>", TextUtil.stripNewlines(divs.html())); 
 }
@Test
public void html() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>there</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals("<p>Hello</p><p>there</p>", TextUtil.stripNewlines(divs.html())); 
 }
@Test
public void html() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>there</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals("<div><p>Hello</p></div><div><p>there</p></div>", TextUtil.stripNewlines(divs.html())); 
 }
@Test
public void html() { 
     String h = "<p>Hello<p><b>there</b></p>"; 
     Document doc = Jsoup.parse(h); 
     Elements els = doc.select("p"); 
     assertEquals(3, els.size()); 
     assertEquals("p", els.get(0).html()); 
     assertEquals("p", els.get(1).html()); 
     assertEquals("p", els.get(2).html()); 
 }
@Test
public void html() { 
     Document doc = Jsoup.parse("<div><p>Hello <b>there</b></p> <p>now!</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals("<p>Hello <b>there</b></p> <p>now!</p>", TextUtil.stripNewlines(ps.html())); 
 }
@Test
public void html() { 
     Document doc = Jsoup.parse("<div><p>Hello <b>there</b></p> <p>now!</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals("<p>Hello <b>there</b></p> <p>now!</p>", TextUtil.stripNewlines(ps.html())); 
     assertEquals("<p>now!</p>", TextUtil.stripNewlines(ps.html())); 
 }
@Test
public void html() { 
     Document doc = Jsoup.parse("<div><p>Hello <b>there</b></p> <p>now!</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("there", ps.get(0).html()); 
     assertEquals("now!", ps.get(1).html()); 
 }
@Test
public void prepend() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>there</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("p", divs.get(0).html()); 
     assertEquals("there", divs.get(1).html()); 
     assertEquals("p", divs.get(2).html()); 
 }
@Test
public void prepend() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(3, divs.size()); 
     assertEquals("Hello", divs.get(0).text()); 
     assertEquals("There", divs.get(1).text()); 
     assertEquals("There", divs.get(2).text()); 
 }
@Test
public void prepend() { 
     Document doc = Jsoup.parse("<p>Hello <b>there</b> now</p>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("there", ps.get(0).text()); 
     assertEquals("now", ps.get(1).text()); 
 }
@Test
public void append() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>there</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("p", divs.get(0).html()); 
     assertEquals("there", divs.get(1).html()); 
 }
@Test
public void append() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p></p></div><div><p></p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("p", divs.get(0).tagName()); 
     assertEquals("p", divs.get(1).tagName()); 
     assertEquals("p", divs.get(2).tagName()); 
     assertEquals("p", divs.get(3).tagName()); 
     Elements p = doc.select("p"); 
     assertEquals(2, p.size()); 
     assertEquals("p", p.get(0).tagName()); 
     assertEquals("p", p.get(1).tagName()); 
     assertEquals("p", p.get(2).tagName()); 
 }
@Test
public void append() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p></p></div><div><p></p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("p", divs.get(0).tagName()); 
     assertEquals("p", divs.get(1).tagName()); 
     assertEquals("p", divs.get(2).tagName()); 
     assertEquals("p", divs.get(3).tagName()); 
     assertEquals("p", divs.get(4).tagName()); 
     assertEquals("p", divs.get(5).tagName()); 
     assertEquals("p", divs.get(6).tagName()); 
     assertEquals("p", divs.get(7).tagName()); 
     assertEquals("p", divs.get(8).tagName()); 
 }
@Test
public void append() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("Hello", divs.get(0).outerHtml()); 
     assertEquals("There", divs.get(1).outerHtml()); 
     assertEquals("there", divs.get(2).outerHtml()); 
     assertEquals("<p>Hello</p>", divs.get(0).outerHtml()); 
     assertEquals("<p>There</p>", divs.get(1).outerHtml()); 
 }
@Test
public void eq() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>there</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("p", ps.get(0).text()); 
     assertEquals("there", ps.get(1).text()); 
     assertEquals("p", ps.get(2).text()); 
 }
@Test
public void eq() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p></p></div><div><p></p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("p", divs.get(0).tagName()); 
     assertEquals("p", divs.get(1).tagName()); 
     assertEquals("p", divs.get(2).tagName()); 
     assertEquals("p", divs.get(3).tagName()); 
     assertEquals("p", divs.get(4).tagName()); 
     assertEquals("p", divs.get(5).tagName()); 
     assertEquals("p", divs.get(6).tagName()); 
     assertEquals("p", divs.get(7).tagName()); 
     assertEquals("p", divs.get(8).tagName()); 
 }
@Test
public void first() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p></p></div><div><p></p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("p", divs.get(0).tagName()); 
     assertEquals("p", divs.get(1).tagName()); 
     assertEquals("p", divs.get(2).tagName()); 
     assertEquals("p", divs.get(3).tagName()); 
     assertEquals("p", divs.get(4).tagName()); 
     assertEquals("p", divs.get(5).tagName()); 
     assertEquals("p", divs.get(6).tagName()); 
     assertEquals("p", divs.get(7).tagName()); 
     assertEquals("p", divs.get(8).tagName()); 
     }
@Test
public void first() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>there</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("p", divs.get(0).tagName()); 
     assertEquals("there", divs.get(1).tagName()); 
     assertEquals("there", divs.get(2).tagName()); 
     assertEquals("p", divs.get(3).tagName()); 
     }
@Test
public void testIsEmpty15() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p></p></div>"); 
     Elements divs = doc.select("div"); 
     assertTrue(divs.isEmpty()); 
     assertFalse(doc.select("div > *").isEmpty()); 
     assertFalse(doc.select("p > *").isEmpty()); 
     }
@Test
public void add() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>there</p></div>"); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("p", divs.get(0).tagName()); 
     assertEquals("there", divs.get(1).tagName()); 
     assertEquals("there", divs.get(2).tagName()); 
     assertEquals("p", divs.get(3).tagName()); 
     assertEquals("p", divs.get(4).tagName()); 
     assertEquals("p", divs.get(5).tagName()); 
     assertEquals("p", divs.get(6).tagName()); 
     assertEquals("p", divs.get(7).tagName()); 
     assertEquals("p", divs.get(8).tagName()); 
     assertEquals("p", divs.get(9).tagName()); 
     assertEquals("p", divs.get(10).tagName()); 
     assertEquals("p", divs.get(11).tagName()); 
     assertEquals("p", divs.get(12).tagName()); 
 }
@Test
public void get() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>there</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("p", ps.get(0).text()); 
     assertEquals("there", ps.get(1).text()); 
     assertEquals("p", ps.get(2).text()); 
 }
@Test
public void testPseudoTags26() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>"); 
     Elements ps = doc.select("p"); 
     assertEquals(3, ps.size()); 
     assertEquals("One", ps.get(0).text()); 
     assertEquals("Two", ps.get(1).text()); 
     assertEquals("Four", ps.get(2).text()); 
     assertEquals("Five", ps.get(3).text()); 
     Elements ps2 = doc.select("p"); 
     assertEquals(2, ps2.size()); 
     assertEquals("Three", ps2.get(0).text()); 
     assertEquals("Four", ps2.get(1).text()); 
     assertEquals("Five", ps2.get(0).text()); 
     assertEquals("Five", ps2.get(1).text()); 
 }
@Test
public void testChildren29() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>there</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("there", ps.get(0).text()); 
     assertEquals("p", ps.get(1).text()); 
     assertEquals("there", ps.get(2).text()); 
     assertEquals("p", ps.get(3).text()); 
     Elements ps2 = doc.select("p"); 
     assertEquals(2, ps2.size()); 
     assertEquals("there", ps2.get(0).text()); 
     assertEquals("there", ps2.get(1).text()); 
     assertEquals("there", ps2.get(2).text()); 
 }
@Test
public void testChildren30() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>"); 
     Elements ps = doc.select("p"); 
     assertEquals(3, ps.size()); 
     assertEquals("One", ps.get(0).text()); 
     assertEquals("Two", ps.get(1).text()); 
     assertEquals("Three", ps.get(2).text()); 
     assertEquals("Four", ps.get(3).text()); 
     Elements ps2 = doc.select("p"); 
     assertEquals(2, ps2.size()); 
     assertEquals("Five", ps2.get(0).text()); 
     assertEquals("Five", ps2.get(1).text()); 
     assertEquals("Four", ps2.get(0).text()); 
     assertEquals("Five", ps2.get(1).text()); 
 }
@Test
public void testChildren31() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(3, ps.size()); 
     assertEquals("One", ps.get(0).text()); 
     assertEquals("Two", ps.get(1).text()); 
     assertEquals("Three", ps.get(2).text()); 
 }
@Test
public void testChildren32() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>there</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("p", ps.get(0).tagName()); 
     assertEquals("there", ps.get(1).tagName()); 
     assertEquals("p", ps.get(2).tagName()); 
 }
@Test
public void parentChildStar() { 
     String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divChilds = doc.select("div > *"); 
     assertEquals(2, divChilds.size()); 
     assertEquals("p", divChilds.get(0).tagName()); 
     assertEquals("span", divChilds.get(1).tagName()); 
     assertEquals("p", divChilds.get(2).tagName()); 
 }
@Test
public void testPseudoHas33() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>"); 
     Elements ps = doc.select("p:has(p)"); 
     assertEquals(3, ps.size()); 
     assertEquals("One", ps.get(0).text()); 
     assertEquals("Four", ps.get(1).text()); 
     assertEquals("Five", ps.get(2).text()); 
     assertEquals("Seven", ps.get(3).text()); 
     assertEquals("Seven", ps.get(4).text()); 
     Elements ps2 = doc.select("p:has(p)"); 
     assertEquals("Seven", ps2.get(0).text()); 
     assertEquals("Seven", ps2.get(1).text()); 
     assertEquals("Seven", ps2.get(0).text()); 
     assertEquals("Seven", ps2.get(1).text()); 
     assertEquals("Seven", ps2.get(1).text()); 
     assertEquals("Seven", ps2.get(2).text()); 
 }
@Test
public void handlesInvalidStartTags() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("Hello", ps.get(0).text()); 
     assertEquals("There", ps.get(1).text()); 
 }
@Test
public void testEmpty48() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p></p></div>"); 
     Elements ps = doc.select("p"); 
     assertTrue(ps.isEmpty()); 
     assertEquals("", ps.first().text()); 
     assertEquals("Hello", ps.last().text()); 
 }
@Test
public void testEmpty49() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div>"); 
     Elements ps = doc.select("p"); 
     assertTrue(ps.isEmpty()); 
     assertEquals("Hello", ps.first().text()); 
 }
@Test
public void testGetElementsByTag55() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>there</p></div>"); 
     Elements els = doc.select("p"); 
     assertEquals(2, els.size()); 
     assertEquals("p", els.get(0).tagName()); 
     assertEquals("there", els.get(1).tagName()); 
     assertEquals("p", els.get(2).tagName()); 
 }
@Test
public void testGetElementsByTag56() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); 
     Elements els = doc.select("p"); 
     assertEquals(2, els.size()); 
     assertEquals("p", els.get(0).tagName()); 
     assertEquals("there", els.get(1).tagName()); 
     assertEquals("p", els.get(2).tagName()); 
 }
@Test
public void testPseudoHas57() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>"); 
     Elements ps = doc.select("p"); 
     assertEquals(3, ps.size()); 
     assertEquals("One", ps.get(0).text()); 
     assertEquals("Four", ps.get(1).text()); 
     assertEquals("Five", ps.get(2).text()); 
 }
@Test
public void testClass58() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); 
     Elements els = doc.select("p"); 
     assertEquals(2, els.size()); 
     assertEquals("p", els.get(0).className()); 
     assertEquals("There", els.get(1).className()); 
     assertEquals("p", els.get(2).className()); 
 }
@Test
public void parentChild() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div><div id=2><p>There</p></div>"); 
     Elements ps = doc.select("div"); 
     assertEquals(2, ps.size()); 
     assertEquals("p", ps.get(0).className()); 
     assertEquals("span", ps.get(1).className()); 
     assertEquals("p", ps.get(2).className()); 
     assertEquals("span", ps.get(3).className()); 
     assertEquals("p", ps.get(4).className()); 
 }
@Test
public void testPreserveWhitespace59() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); 
     Elements ps = doc.select("p"); 
     assertTrue(ps.isEmpty()); 
     assertTrue(doc.select("p").isEmpty()); 
     assertFalse(doc.select("p").isEmpty()); 
     assertFalse(doc.select("p").isEmpty()); 
     assertFalse(doc.select("p").isEmpty()); 
     assertTrue(doc.select("p").isEmpty()); 
     assertTrue(doc.select("p").isEmpty()); 
     assertTrue(doc.select("p").isEmpty()); 
     assertTrue(doc.select("p").isEmpty()); 
     assertFalse(doc.select("p").isEmpty()); 
     assertFalse(doc.select("p").isEmpty()); 
     assertTrue(doc.select("p").isEmpty()); 
     assertTrue(doc.select("p").isEmpty()); 
     assertTrue(doc.select("p").isEmpty()); 
     assertTrue(doc.select("p").isEmpty()); 
     assertFalse(doc.select("p").isEmpty()); 
     assertFalse(doc.select("p").isEmpty()); 
     assertFalse(doc.select("p").isEmpty()); 
     assertFalse(doc.select("p").isEmpty()); 
     assertFalse(doc.select("p").isEmpty()); 
     assertFalse(doc.select("p").isEmpty()); 
     assertFalse(doc.select("p").isEmpty()); 
 }
@Test
public void testIndent62() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>there</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("p", ps.get(0).tagName()); 
     assertEquals("there", ps.get(1).tagName()); 
     assertEquals("p", ps.get(2).tagName()); 
 }
@Test
public void testIndent63() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>there</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("p", ps.get(0).tagName()); 
     assertEquals("there", ps.get(1).tagName()); 
     assertEquals("p", ps.get(2).tagName()); 
     assertEquals("<p>Hello</p><p>there</p>", TextUtil.stripNewlines(ps.html())); 
 }
@Test
public void testOuterHtml64() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>there</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("p", ps.get(0).tagName()); 
     assertEquals("there", ps.get(1).tagName()); 
     assertEquals("p", ps.get(2).tagName()); 
     assertEquals("<p>Hello</p><p>there</p>", TextUtil.stripNewlines(ps.html())); 
 }
@Test
public void testIndent65() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("p", ps.get(0).tagName()); 
     assertEquals("p", ps.get(1).tagName()); 
     assertEquals("p", ps.get(2).tagName()); 
     assertEquals("p", ps.get(3).tagName()); 
     assertEquals("p", ps.get(4).tagName()); 
     assertEquals("p", ps.get(5).tagName()); 
     assertEquals("p", ps.get(6).tagName()); 
     assertEquals("p", ps.get(7).tagName()); 
     assertEquals("p", ps.get(8).tagName()); 
     assertEquals("p", ps.get(9).tagName()); 
 }
@Test
public void testSetIndent66() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals("<p>One</p><p>Two</p><p>Three</p>", TextUtil.stripNewlines(ps.html())); 
     Elements ps2 = doc.select("p"); 
     assertEquals("<p>One</p><p>Two</p><p>Three</p>", TextUtil.stripNewlines(ps2.html())); 
     assertEquals("<p>One</p><p>Three</p>", TextUtil.stripNewlines(ps2.html())); 
 }
@Test
public void testEquals70() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("there", ps.get(0).text()); 
     assertEquals("there", ps.get(1).text()); 
     assertEquals("there", ps.get(2).text()); 
 }
@Test
public void handlesInvalidStartTags() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div><div id=2><p>There</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("1", ps.get(0).id()); 
     assertEquals("2", ps.get(1).id()); 
 }
@Test
public void testHashcode71() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div><div id=2><p>There</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(2, ps.size()); 
     assertEquals("1", ps.get(0).id()); 
     assertEquals("2", ps.get(1).id()); 
     assertEquals("1", ps.get(2).id()); 
     Elements ps2 = doc.select("p"); 
     assertEquals(2, ps2.size()); 
     assertEquals("1", ps2.get(0).id()); 
     assertEquals("2", ps2.get(1).id()); 
     assertEquals("1", ps2.get(0).id()); 
     assertEquals("1", ps2.get(1).id()); 
     assertEquals("2", ps2.get(1).id()); 
 }
@Test
public void testHashCode72() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div><div id=2><p>There</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(8, ps.size()); 
     assertEquals("1", ps.get(0).id()); 
     assertEquals("2", ps.get(1).id()); 
     assertEquals("3", ps.get(2).id()); 
     assertEquals("4", ps.get(3).id()); 
     assertEquals("5", ps.get(4).id()); 
     assertEquals("6", ps.get(5).id()); 
     assertEquals("7", ps.get(6).id()); 
     assertEquals("8", ps.get(7).id()); 
     assertEquals("9", ps.get(8).id()); 
 }
@Test
public void testHashCode73() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(8, ps.size()); 
     assertEquals("p", ps.get(0).tagName()); 
     assertEquals("p", ps.get(1).tagName()); 
     assertEquals("p", ps.get(2).tagName()); 
     assertEquals("p", ps.get(3).tagName()); 
     assertEquals("p", ps.get(4).tagName()); 
     assertEquals("p", ps.get(5).tagName()); 
     assertEquals("p", ps.get(6).tagName()); 
     assertEquals("p", ps.get(7).tagName()); 
     assertEquals("p", ps.get(8).tagName()); 
 }
@Test
public void testHashCode74() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); 
     Elements ps = doc.select("p"); 
     assertEquals(8, ps.size()); 
     assertEquals(8, ps.get(0).hashCode()); 
     assertEquals(8, ps.get(1).hashCode()); 
     assertEquals(8, ps.get(2).hashCode()); 
     assertEquals(8, ps.get(3).hashCode()); 
     assertEquals(8, ps.get(4).hashCode()); 
 }
    

    
    
    
    
    

    
    
    

    
    
    
    
    
    
    
    
    

    
    
    
    
    
}
