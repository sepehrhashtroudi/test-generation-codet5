package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 Tests for the Parser

 @author Jonathan Hedley, jonathan@hedley.net */
public class ParserTest {

@Test
public void addFirst() { TokenQueue tq = new TokenQueue("One Two Three"); tq.consumeWord(); tq.addFirst("One"); tq.addFirst("Two"); tq.addFirst("Three"); String data = tq.toString(); assertEquals("One Two Three", data); }
@Test
public void addFirst() { TokenQueue tq = new TokenQueue("One Two Three"); tq.consumeWord(); tq.addFirst("One"); tq.consumeWord(); String data = tq.toString(); assertEquals("One Two Three", data); }
@Test
public void addFirst() { TokenQueue tq = new TokenQueue("One Two Three"); tq.consumeWord(); tq.consumeWord(); tq.addFirst("One"); tq.addFirst("Two"); tq.consumeWord(); String data = tq.toString(); assertEquals("One Two Three", data); }
@Test
public void parsesComments() { String h = "<!DOCTYPE html><html><head><title>First!</title></head><body><p>Second!</p></body></html>"; Document doc = Jsoup.parse(h); assertEquals("<!DOCTYPE html><html><head><title>First!</title></head><body><p>Second!</p></body></html>", TextUtil.stripNewlines(doc.html())); assertEquals("<!DOCTYPE html><html><head><title>First!</title></head><body><p>Third!</p></body></html>", TextUtil.stripNewlines(doc.html())); }
@Test
public void testParse128() { String html = "<html><head><title>Title</title></head><body><p>Hello</p></body></html>"; Document doc = Jsoup.parse(html); assertEquals("html", doc.head().html()); assertEquals("body", doc.body().html()); assertEquals("p", doc.child(0).tagName()); assertEquals("Hello", doc.child(1).tagName()); assertEquals("p", doc.child(2).tagName()); assertEquals("Hello", doc.child(3).tagName()); }
@Test
public void testParse130() { String html = "<html><head></head><body><p>Hello</p></body></html>"; Document doc = Jsoup.parse(html); assertEquals("html", doc.head().html()); assertEquals("body", doc.body().html()); assertEquals("p", doc.child(0).tagName()); assertEquals("Hello", doc.child(1).tagName()); assertEquals("p", doc.child(2).tagName()); assertEquals("body", doc.child(3).tagName()); assertEquals("p", doc.child(4).tagName()); assertEquals("Hello", doc.child(5).tagName());
}

@Test
public void testParse132() { String html = "<html><head><title>Title</title><body>Body</body></html>"; Document doc = Jsoup.parse(html); assertEquals("html", doc.head().html()); assertEquals("body", doc.body().html()); assertEquals("body", doc.body().html()); }
@Test
public void testParseEndTag134() { String h = "<html><head><title>Hello</title></head><body><p>There</p></body></html>"; Document doc = Jsoup.parse(h); Element head = doc.select("head").first(); Element body = doc.select("body").first(); assertEquals("Hello", head.text()); assertEquals("There", body.text()); }
@Test
public void testParseEndTag135() { String h = "<html><head><title>Hello</title></head><body><p>There</p></body></html>"; Document doc = Jsoup.parse(h); Element head = doc.head(); Element body = doc.body(); List<Element> tags = head.children(); assertEquals(1, tags.size()); assertEquals("Hello", tags.get(0).attr("title")); assertEquals("There", tags.get(1).attr("title")); assertEquals("There", tags.get(2).attr("title")); assertEquals("There", tags.get(3).attr("title")); }
@Test
public void testParseEndTag136() { String h = "<html><head><title>Hello</title></head><body><p>There</p></body></html>"; Document doc = Jsoup.parse(h); Element head = doc.head(); assertEquals("head", head.tagName()); assertEquals("body", head.text()); Element body = doc.body(); assertEquals("html", body.tagName()); assertEquals("<html><head><title>Hello</title></head><body><p>There</p></body></html>", TextUtil.stripNewlines(body.html())); }
@Test
public void testParseEndTag137() { String h = "<html><head><title>Hello</title></head><body><p>There</p></body></html>"; Document doc = Jsoup.parseBodyFragment(h); Element head = doc.head(); Element body = doc.body(); List<Element> tags = head.children(); assertEquals(1, tags.size()); assertEquals("Hello", tags.get(0).attr("title")); assertEquals("There", tags.get(1).attr("title")); assertEquals("There", tags.get(2).attr("title")); assertEquals("There", tags.get(3).attr("title"));
}

@Test
public void testParseTextNode141() { String h = "<html><head><title>Hello</title></head><body><p>There</p></body></html>"; Document doc = Jsoup.parse(h); Element head = doc.select("head").first(); assertEquals("Hello", head.text()); assertEquals("There", head.attr("title")); Element body = doc.select("body").first(); assertEquals("There", body.attr("title")); assertEquals("There", body.attr("body")); Element p = doc.select("p").first(); assertEquals("Hello", p.text()); assertEquals("There", p.attr("body"));
}

@Test
public void parsesTextNodes() { Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); assertEquals("Hello There", doc.select("p").first().text()); assertEquals("Hello there", doc.select("p").first().text()); assertEquals("Hello there", doc.select("p").last().text()); assertEquals("Hello there", doc.select("p").last().text()); assertEquals("Hello there", doc.select("p").last().text()); assertEquals("Hello there", doc.select("p").last().text()); assertEquals("Hello there", doc.select("p").last().text());
}

@Test
public void testPopStackToSuitableContainer151() { Document doc = Jsoup.parse("<div>one</div><div>two</div><div>three</div>"); Element div1 = doc.getElementById("one"); Element div2 = doc.getElementById("two"); Element div3 = doc.getElementById("three"); assertEquals("<div>one</div><div>two</div><div>three</div>", TextUtil.stripNewlines(div1.html())); assertEquals("<div>one</div><div>two</div><div>three</div>", TextUtil.stripNewlines(div2.html()));
}

@Test
public void testPopStackToSuitableContainer155() { Document doc = Jsoup.parse("<div>One</div><div>Two</div>"); Element div = doc.getElementById("one"); assertEquals("One", div.text()); Element div2 = doc.getElementById("two"); assertEquals("Two", div2.text()); Element div3 = doc.getElementById("three"); assertEquals("Three", div3.text()); Element div4 = doc.getElementById("four"); assertEquals("Two", div4.text()); Element div5 = doc.getElementById("five"); assertEquals("Three", div5.text()); Element div6 = doc.getElementById("six");
}

@Test
public void testTag195() { Tag p1 = Tag.valueOf("p"); Tag p2 = Tag.valueOf("p"); assertEquals(p1, p2); }
@Test
public void getName() { Tag p1 = Tag.valueOf("p"); assertEquals("p", p1.getName()); }
@Test
public void getName() { Tag p = Tag.valueOf("p"); assertEquals("p", p.getName()); }
@Test
public void valueOf() { Tag p1 = Tag.valueOf("p"); Tag p2 = Tag.valueOf("p"); assertEquals(p1, p2); }
@Test
public void canContain() { Tag a = Tag.valueOf("a"); Tag b = Tag.valueOf("b"); Tag c = Tag.valueOf("c"); assertFalse(a.canContain(b)); assertFalse(b.canContain(a)); assertFalse(c.canContain(b)); assertTrue(a.canContain(a)); assertTrue(b.canContain(b)); assertTrue(c.canContain(c)); }
@Test
public void canContain() { Tag p1 = Tag.valueOf("p"); Tag p2 = Tag.valueOf("p"); Tag p3 = Tag.valueOf("p"); Tag p4 = Tag.valueOf("p"); assertFalse(p1.canContain(p2)); assertFalse(p1.canContain(p3)); assertFalse(p1.canContain(p4)); assertTrue(p1.canContain(p1)); assertTrue(p1.canContain(p2)); assertTrue(p1.canContain(p3)); assertTrue(p1.canContain(p4)); }
@Test
public void canContain() { Tag head = Tag.valueOf("head"); Tag body = Tag.valueOf("body"); assertFalse(head.canContain(body)); assertTrue(body.canContain(head)); assertTrue(body.canContain(body)); assertFalse(body.canContain(body)); }
@Test
public void isData() { Tag a = Tag.valueOf("a"); Tag b = Tag.valueOf("b"); assertTrue(a.isData()); assertTrue(b.isData()); assertFalse(a.isData()); }
@Test
public void isData() { Tag a = Tag.valueOf("a"); Tag b = Tag.valueOf("b"); assertFalse(a.isData()); assertFalse(b.isData()); assertTrue(a.isData()); }
@Test
public void isEmpty() { Tag empty = Tag.valueOf("empty"); assertTrue(empty.isEmpty()); }
@Test
public void testGetImplicitParent197() { Tag p1 = Tag.valueOf("p"); Tag p2 = Tag.valueOf("p"); Tag p3 = Tag.valueOf("p"); assertNull(p1.getImplicitParent()); assertNull(p2.getImplicitParent()); assertNull(p3.getImplicitParent()); }
@Test
public void testHashCode200() { Tag p1 = Tag.valueOf("p"); Tag p2 = Tag.valueOf("p"); Tag p3 = Tag.valueOf("p"); assertEquals(p1.hashCode(), p2.hashCode()); assertEquals(p1.hashCode(), p3.hashCode()); }
@Test
public void setAncestor() { Tag p1 = Tag.valueOf("p"); Tag p2 = Tag.valueOf("p"); Tag p3 = Tag.valueOf("p"); Tag p4 = Tag.valueOf("p"); Tag p5 = Tag.valueOf("p"); assertEquals(p1, p2); assertEquals(p1, p3); assertEquals(p1, p4); assertEquals(p1, p5); Tag p6 = Tag.valueOf("p"); Tag p7 = Tag.valueOf("p"); assertEquals(p1, p2); assertEquals(p1, p3); assertEquals(p1, p4);
}

    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    
    
    

    
    
    
    
    
    
    

    

    

    

    
// Defects4J: flaky method
//     @Test public void normalisesDocument() {
//         String h = "<!doctype html>One<html>Two<head>Three<link></head>Four<body>Five </body>Six </html>Seven ";
//         Document doc = Jsoup.parse(h);
//         assertEquals("<!doctype html><html><head><link /></head><body>Five Six Seven  One Two Four Three</body></html>",
//                 TextUtil.stripNewlines(doc.html())); // is spaced OK if not newline & space stripped
//     }

    

    


}
