package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 Test TextNodes

 @author Jonathan Hedley, jonathan@hedley.net */
public class TextNodeTest {
@Test
public void testParent14() { Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>"); Element div = doc.select("div").first(); assertTrue(doc.select("p").first().parent() == null); assertTrue(doc.select("div").last().parent() == null); assertTrue(doc.select("p").last().parent() == doc); assertTrue(doc.select("p").last().parent() == doc); assertTrue(doc.select("p").last().parent() == null); }
@Test
public void setParentNode() { Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>"); Element div = doc.select("div").first(); div.setParentNode(doc.select("p").first()); assertEquals(doc.select("div").first(), div); assertNull(doc.select("p").last()); }
@Test
public void testHashCode22() { Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>"); Element div1 = doc.select("div").first(); Element div2 = doc.select("div").first(); assertEquals(0, div1.hashCode()); assertEquals(0, div2.hashCode()); Element div3 = doc.select("div").first(); assertEquals(0, div3.hashCode()); Element div4 = doc.select("div").first(); assertEquals(0, div4.hashCode()); }
@Test
public void text() { Document doc = Jsoup.parse("<div>Hello there</div>"); Element div = doc.select("div").first(); TextNode tn = (TextNode) div.childNode(0); tn.text("there!"); assertEquals("Hello there!", tn.getWholeText()); }
@Test
public void testGetWholeText73() { TextNode one = new TextNode("one", ""); TextNode two = new TextNode("two", ""); TextNode three = new TextNode("three", ""); TextNode four = new TextNode("four", ""); assertEquals("one", one.getWholeText()); assertEquals("two", two.getWholeText()); assertEquals("three", three.getWholeText()); assertEquals("four", four.getWholeText()); }
@Test
public void isBlank() { TextNode one = new TextNode("one", ""); TextNode two = new TextNode("two", ""); TextNode three = new TextNode("three", ""); TextNode four = new TextNode("four", ""); TextNode five = new TextNode("five", ""); assertTrue(one.isBlank()); assertTrue(two.isBlank()); assertTrue(three.isBlank()); assertFalse(four.isBlank()); assertFalse(five.isBlank()); }
@Test
public void testOuterHtml78() { Document doc = Jsoup.parse("<div><p>Hello there</p></div>"); Element div = doc.select("div").first(); TextNode tn = (TextNode) div.childNode(0); tn.outerHtml(new StringBuilder()); assertEquals("Hello there", tn.getWholeText()); }
@Test
public void testCreateFromEncoded82() { Document doc = Jsoup.parse("<div>Hello there</div>"); Element div = doc.select("div").first(); TextNode tn = TextNode.createFromEncoded("Hello there", ""); assertEquals("Hello there", tn.text()); assertEquals("Hello there", div.text()); }
    
    
    
}
