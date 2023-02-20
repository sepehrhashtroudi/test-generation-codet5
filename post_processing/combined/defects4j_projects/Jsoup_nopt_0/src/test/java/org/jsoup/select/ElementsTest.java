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
public void val() { String h = "<input value=\'one\' /><textarea>two</textarea>"; Document doc = Jsoup.parse(h); doc.select("textarea").val("three").val("four"); assertEquals("one", doc.select("textarea").get(0).text()); assertEquals("two", doc.select("textarea").get(1).text()); assertEquals("three", doc.select("textarea").get(2).text()); assertEquals("four", doc.select("textarea").get(3).text()); }
@Test
public void val() { Document doc = Jsoup.parse("<input value=\'one\' /><textarea>two</textarea>"); doc.select("textarea").val("three"); assertEquals("three", doc.select("textarea").get(0).text()); assertEquals("two", doc.select("textarea").get(1).text()); assertEquals("three", doc.select("textarea").get(2).text()); }
@Test
public void val() { Document doc = Jsoup.parse("<input value=\'one\' /><textarea>two</textarea>"); doc.select("textarea").val("three"); assertEquals("one", doc.select("textarea").get(0).val()); assertEquals("three", doc.select("textarea").get(1).val()); assertEquals("two", doc.select("textarea").get(2).val()); assertEquals("three", doc.select("textarea").get(3).val()); }
@Test
public void val() { Document doc = Jsoup.parse("<input value=\'one\' /><textarea>two</textarea>"); doc.select("textarea").val("three"); assertEquals("one", doc.select("textarea").get(0).text()); assertEquals("two", doc.select("textarea").get(1).text()); assertEquals("three", doc.select("textarea").get(2).text()); }
@Test
public void hasText() { Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>"); Elements divs = doc.select("div"); assertTrue(divs.hasText()); assertFalse(doc.select("div + div").hasText()); }
@Test
public void hasText() { Document doc = Jsoup.parse("<div><p>Hello <b>there</b></p> jsoup <p>now!</p></div>"); Elements divs = doc.select("div"); assertTrue(divs.hasText()); assertFalse(doc.select("p").hasText()); }
@Test
public void hasText() { Document doc = Jsoup.parse("<div><p>Hello <b>there</b></p> jsoup <p>now!</p></div><div><p>now!</p></div>"); Elements divs = doc.select("div"); assertTrue(divs.hasText()); assertFalse(doc.select("p").hasText()); }
@Test
public void select() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>"); Elements ps = doc.select("p:eq(0)"); assertEquals(3, ps.size()); assertEquals("One", ps.get(0).text()); assertEquals("Two", ps.get(1).text()); assertEquals("Three", ps.get(2).text()); }
@Test
public void select() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>"); Elements ps = doc.select("p"); assertEquals(3, ps.size()); assertEquals("One", ps.get(0).text()); assertEquals("Two", ps.get(1).text()); assertEquals("Three", ps.get(2).text()); }
@Test
public void is() { String h = "<p>Hello<p title=foo>there<p>world"; Document doc = Jsoup.parse(h); Elements ps = doc.select("p"); assertTrue(ps.is("[title=foo]")); assertFalse(ps.is("[title=bar]")); }
@Test
public void is() { Document doc = Jsoup.parse("<div><p>Hello <b>there</b></p> jsoup <p>now!</p></div><div><p>now!</p></div>"); Elements ps = doc.select("p"); assertEquals(2, ps.size()); assertEquals("Hello ", ps.get(0).text()); assertEquals("there", ps.get(1).text()); }
@Test
public void is() { Document doc = Jsoup.parse("<div><p>Hello <b>there</b></p> jsoup <p>now!</p></div><div><p>now!</p></div>"); Elements ps = doc.select("p"); assertEquals(2, ps.size()); assertTrue(ps.is("p")); assertTrue(ps.is("b")); assertTrue(ps.is("p")); assertFalse(ps.is("p")); }
@Test
public void testGetElementsByAttributeValue112() { Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); Elements ps = doc.getElementsByAttributeValue("p", "Hello"); assertEquals(2, ps.size()); assertEquals("Hello", ps.get(0).text()); assertEquals("There", ps.get(1).text()); }
@Test
public void collect() { Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div>"); Elements ps = doc.select("p"); assertEquals(3, ps.size()); assertEquals("One", ps.get(0).text()); assertEquals("Two", ps.get(1).text()); assertEquals("Three", ps.get(2).text()); }
    

    
    
    
    
    

    
    
    

    
    
    
    
    
    
    
    
    

    
    
    
    
    
}
