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
public void combinator() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div><div><p>Four</p>"); Elements ps = doc.select("p:gt(0)"); assertEquals(3, ps.size()); assertEquals("Two", ps.get(0).text()); assertEquals("Three", ps.get(1).text()); assertEquals("Four", ps.get(2).text()); }
@Test
public void combinator() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p><p>Four</p>"); Elements ps = doc.select("p:gt(0)"); assertEquals(3, ps.size()); assertEquals("One", ps.get(0).tagName()); assertEquals("Two", ps.get(1).tagName()); assertEquals("Three", ps.get(2).tagName()); assertEquals("Four", ps.get(3).tagName()); }
@Test
public void findElements() { Document doc = Jsoup.parse("<div><p>Hello <b>there</b></p> jsoup <p>now!</p></div>"); Elements ps = doc.select("p"); assertEquals(2, ps.size()); assertEquals("Hello ", ps.get(0).text()); assertEquals("there", ps.get(1).text()); }
@Test
public void findElements() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div><div><p>Four</p>"); Elements ps = doc.select("p:lt(2)"); assertEquals(3, ps.size()); Elements ps2 = ps.select("p:gt(2)"); assertEquals(2, ps2.size()); assertEquals("Two", ps2.get(0).text()); assertEquals("Three", ps2.get(1).text()); assertEquals("Four", ps2.get(2).text()); }
@Test
public void findElements() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div>"); Elements ps = doc.select("p:gt(0)"); assertEquals(2, ps.size()); Elements ps2 = ps.select("p:lt(0)"); assertEquals(1, ps2.size()); assertEquals("Two", ps2.get(0).text()); assertEquals("Three", ps2.get(1).text()); }
@Test
public void findElements() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div><div><p>Four</p>"); Elements ps = doc.select("p:gt(0)"); assertEquals(2, ps.size()); Elements ps2 = ps.select("p:lt(0)"); assertEquals(1, ps2.size()); assertEquals("Two", ps2.get(0).text()); assertEquals("Three", ps2.get(1).text()); }
@Test
public void byAttribute() { Document doc = Jsoup.parse("<p id=1>Hello <b>there</b> now</p>"); Elements ps = doc.select("p"); assertEquals(2, ps.size()); assertEquals("1", ps.get(0).id()); assertEquals("2", ps.get(1).id()); }
@Test
public void indexLessThan() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div><div><p>Four</p>"); Elements ps = doc.select("p:eq(0)"); assertEquals(3, ps.size()); assertEquals("One", ps.get(0).text()); assertEquals("Four", ps.get(1).text()); assertEquals("Five", ps.get(2).text()); }
@Test
public void indexGreaterThan() { Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div><div><p>3</p>"); Elements ps = doc.select("p:gt(0)"); assertEquals(3, ps.size()); assertEquals("1", ps.get(0).text()); assertEquals("2", ps.get(1).text()); assertEquals("3", ps.get(2).text()); }
@Test
public void consumeIndex() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div><div><p>Four</p>"); Elements ps = doc.select("p:eq(0)"); assertEquals(3, ps.size()); assertEquals("One", ps.get(0).text()); assertEquals("Four", ps.get(1).text()); assertEquals("Five", ps.get(2).text()); assertEquals("Seven", ps.get(3).text()); assertEquals("Seven", ps.get(4).text()); }
@Test
public void consumeIndex() { Document doc = Jsoup.parse("<div><p>One</p>...<p>Two</p>...<p>Three</p>"); Elements ps = doc.select("p:eq(0)"); assertEquals(3, ps.size()); assertEquals("One", ps.get(0).text()); assertEquals("Two", ps.get(1).text()); assertEquals("Three", ps.get(2).text()); }
@Test
public void consumeIndex() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div><div><p>Four</p>"); Elements ps = doc.select("p:eq(0)"); assertEquals(3, ps.size()); assertEquals("One", ps.get(0).text()); assertEquals("Two", ps.get(1).text()); assertEquals("Three", ps.get(2).text()); assertEquals("Four", ps.get(3).text()); }
@Test
public void consumeIndex() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div>"); Elements ps = doc.select("p:eq(0)"); assertEquals(1, ps.size()); assertEquals("One", ps.get(0).text()); assertEquals("Two", ps.get(1).text()); assertEquals("Three", ps.get(2).text()); }
@Test
public void consumeIndex() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div><div><p>Four</p>"); Elements ps = doc.select("p:eq(0)"); assertEquals(1, ps.size()); assertEquals("One", ps.get(0).text()); assertEquals("Four", ps.get(1).text()); assertEquals("Five", ps.get(2).text()); assertEquals("Seven", ps.get(3).text()); assertEquals("Seven", ps.get(4).text()); }
@Test
public void filterForAdjacentSiblings() { Document doc = Jsoup.parse("<div><span>One</span><span>Two</span><span>Three</span></div>"); Elements siblings = doc.select("span > span"); assertEquals(3, siblings.size()); assertEquals("One", siblings.get(0).text()); assertEquals("Two", siblings.get(1).text()); assertEquals("Three", siblings.get(2).text()); }
@Test
public void testFilterForAdjacentSiblings65() { Document doc = Jsoup.parse("<div><span>One</span><span>Two</span><span>Three</span></div>"); Elements els = doc.select("span > span"); assertEquals(3, els.size()); assertEquals("One", els.get(0).text()); assertEquals("Two", els.get(1).text()); assertEquals("Three", els.get(2).text()); }
@Test
public void filterForAdjacentSiblings() { Document doc = Jsoup.parse("<div><span>One</span><span>Two</span><span>Three</span></div>"); Elements els = doc.select("span"); assertEquals(3, els.size()); assertEquals("One", els.get(0).text()); assertEquals("Two", els.get(1).text()); assertEquals("Three", els.get(2).text()); }
@Test
public void testFilterForAdjacentSiblings67() { Document doc = Jsoup.parse("<div><span>One</span><span>Two</span><span>Three</span></div>"); Elements els = doc.select("span"); assertEquals(3, els.size()); assertEquals("One", els.get(0).text()); assertEquals("Two", els.get(1).text()); assertEquals("Three", els.get(2).text()); }
@Test
public void testFilterForAdjacentSiblings68() { Document doc = Jsoup.parse("<div><span>One</span><span>Two</span><span>Three</span></div>"); Elements siblings = doc.select("span > span"); assertEquals(3, siblings.size()); assertEquals("One", siblings.get(0).text()); assertEquals("Two", siblings.get(1).text()); assertEquals("Three", siblings.get(2).text()); }
@Test
public void testGetElementsByAttributeValueNot113() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div>"); Elements ps = doc.getElementsByAttributeValueNot("p", "one"); assertEquals(2, ps.size()); assertEquals("One", ps.get(0).text()); assertEquals("Two", ps.get(1).text()); }
@Test
public void testGetElementsByAttributeValueEnding114() { Document doc = Jsoup.parse("<div><p>One</p>...<p>Two</p>...<p>Three</p>"); Elements ps = doc.getElementsByAttributeValueEnding("p", ".."); assertEquals(2, ps.size()); assertEquals("One", ps.get(0).text()); assertEquals("Two", ps.get(1).text()); assertEquals("Three", ps.get(2).text()); }
@Test
public void collect() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div>"); Elements ps = doc.select("p"); assertEquals(3, ps.size()); assertEquals("One", ps.get(0).text()); assertEquals("Two", ps.get(1).text()); assertEquals("Three", ps.get(2).text()); }
@Test
public void testCollect116() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div>"); Elements ps = doc.select("p"); assertEquals(2, ps.size()); assertEquals("One", ps.get(0).text()); assertEquals("Two", ps.get(1).text()); assertEquals("Three", ps.get(2).text()); }
    

    

    

    

    
    
    

    

    

    
    
    

    

    
    
    

    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // for http://github.com/jhy/jsoup/issues#issue/10
    
    
    // for http://github.com/jhy/jsoup/issues#issue/13
    
    
    
    
    
    
    
    
    
    
    
}
