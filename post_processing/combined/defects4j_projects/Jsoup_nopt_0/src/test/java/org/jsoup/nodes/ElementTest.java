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
public void testChild89() { Document doc = Jsoup.parse("<div><p>Hello\\nthere</p></div>"); Element p = doc.select("p").first(); assertTrue(p.children().get(0) == doc.select("p").get(1)); assertTrue(p.child(0).children().get(1) == doc.select("p").get(1)); assertTrue(p.child(1).children().get(0) == doc.select("p").get(1)); }
@Test
public void testPrependElement90() { Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); Element div = doc.getElementById("1"); div.prependElement("p").text("Before"); assertEquals("Before", div.child(0).text()); assertEquals("Hello", div.child(1).text()); }
@Test
public void testPrependElement91() { Document doc = Jsoup.parse("<div><p>Hello\\nthere</p></div>"); Element p = doc.select("p").first(); assertEquals("Hello", p.text()); assertEquals("there", p.child(0).text()); assertEquals("there", p.child(1).text()); }
@Test
public void testPrependElement92() { Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); Element div = doc.getElementById("1"); div.prependChild(div).text("Before"); assertEquals("Before", div.child(0).text()); assertEquals("Hello", div.child(1).text()); }
@Test
public void testWrap93() { Document doc = Jsoup.parse("<div><p>Hello\\nthere</p></div>"); Element p = doc.select("p").first(); Element w = p.wrap("<div><p>now!</p></div>"); assertEquals("<div><p>Hello\\nthere</p></div>", TextUtil.stripNewlines(doc.body().html())); w.append("<p>now!</p></div>"); assertEquals("<div><p>now!</p></div>", TextUtil.stripNewlines(doc.body().html())); }
@Test
public void testWrap95() { Document doc = Jsoup.parse("<div><p>Hello\\nthere</p></div>"); Element div = doc.select("div").first(); div.wrap("<div>one</div><div>two</div>").append("<p>Three</p>"); assertEquals("<div><div>one</div><div>two</div><p>Three</p></div>", TextUtil.stripNewlines(doc.body().html())); }
@Test
public void testGetDeepChild107() { Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); Element el = doc.select("p").first(); List<Element> children = el.children(); assertEquals(2, children.size()); assertEquals("Hello", children.get(0).text()); assertEquals("There", children.get(1).text()); el = doc.select("p").get(1); children = el.children(); assertEquals(2, children.size()); assertEquals("Hello", children.get(0).text()); assertEquals("There", children.get(1).text()); }
@Test
public void testGetDeepChild108() { Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); Element el = doc.select("p").first(); assertEquals("Hello", el.text()); assertEquals("There", el.child(0).text()); Element el2 = doc.select("p").get(1); assertEquals("Hello there", el2.text()); assertEquals("There", el2.child(0).text()); Element el3 = doc.select("p").get(2); assertEquals("Hello there", el3.text()); assertEquals("There", el3.child(0).text());
}

    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    

    


}
