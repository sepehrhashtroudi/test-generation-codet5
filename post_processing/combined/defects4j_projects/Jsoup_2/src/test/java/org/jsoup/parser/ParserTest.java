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
public void testId17() { 
     String h = "<div id=foo><div id=bar><p>Hello</p></div>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals("foo", doc.id()); 
     assertEquals("bar", doc.id()); 
     assertEquals("p", doc.id()); 
     assertEquals("p", doc.id()); 
     assertEquals("foo", doc.id()); 
     assertEquals("bar", doc.id()); 
     assertEquals("p", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("p", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("p", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
     assertEquals("foo bar", doc.id()); 
 }
@Test
public void testId18() { 
     String h = "<div id=1><p>Hello</p></div><div id=2><p>There</p></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divs = doc.select("div"); 
     assertEquals(2, divs.size()); 
     assertEquals("1", divs.get(0).id()); 
     assertEquals("2", divs.get(1).id()); 
     }
@Test
public void testId19() { 
     String h = "<div id=1><p>Hello</p></div><div id=2><p>There</p></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divs = doc.select("div"); 
     assertEquals(3, divs.size()); 
     assertEquals("1", divs.get(0).id()); 
     assertEquals("2", divs.get(1).id()); 
     assertEquals("3", divs.get(2).id()); 
     assertEquals("Hello", divs.get(3).id()); 
     assertEquals("There", divs.get(4).id()); 
     Elements p = doc.select("p"); 
     assertEquals("1", p.get(0).id()); 
     assertEquals("2", p.get(1).id()); 
     assertEquals("3", p.get(2).id()); 
     assertEquals("There", p.get(3).id()); 
     }
@Test
public void handlesInvalidStartTags() { 
     String h = "<div>Hello < There <&amp;></div>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals("Hello < There <&>", doc.select("div").first().text()); 
     assertEquals("There <&>", doc.select("div").last().text()); 
     assertEquals("Hello < There <&>", doc.select("div").last().text()); 
 }
@Test
public void handlesInvalidStartTags() { 
     Document doc = Jsoup.parse("<p>One <span>two</span> three</p>"); 
     assertEquals("<p>One <span>two</span> three</p>", doc.body().html()); 
     assertEquals("<p>One <span>two</span> three</p>", TextUtil.stripNewlines(doc.body().html())); 
 }
@Test
public void quote() { 
     Document doc = Jsoup.parse("<p>One</p><p>Two</p><p>Three</>p>"); 
     Element p = doc.select("p").first(); 
     assertEquals("One", p.attr("p")); 
     assertEquals("Two", p.attr("p")); 
     assertEquals("Three", p.attr("p")); 
 }
@Test
public void testAttribute75() { 
     String h = "<div><p>Hello</p><p>there</p></div>"; 
     Document doc = Jsoup.parse(h); 
     Element p = doc.select("p").first(); 
     assertEquals("p", p.attr("p")); 
     assertEquals("there", p.attr("p")); 
     assertEquals("there", p.attr("p")); 
 }
@Test
public void testAttribute76() { 
     String h = "<div><p>Hello</p><p>there</p></div>"; 
     Document doc = Jsoup.parse(h); 
     Element p = doc.select("p").first(); 
     assertEquals("p", p.attr("p")); 
     assertEquals("there", p.attr("p")); 
     assertEquals("there", p.attr("p")); 
     assertEquals("there", p.attr("p")); 
     Element div = doc.select("div").first(); 
     assertEquals("div", div.attr("p")); 
     assertEquals("div", div.attr("div")); 
     assertEquals("div", div.attr("div")); 
     Element div2 = doc.select("div").first(); 
     assertEquals("div", div2.attr("div")); 
     assertEquals("div", div2.attr("div")); 
     assertEquals("div", div2.attr("div")); 
     assertEquals("div", div2.attr("div")); 
     assertEquals("div", div2.attr("div")); 
 }
@Test
public void HTML() { 
     Document doc = Jsoup.parse("<html><head><title>Title</title></head><body><p>Hello</p></body></html>"); 
     assertEquals("<html><head><title>Title</title></head><body><p>Hello</p></body></html>", TextUtil.stripNewlines(doc.html())); 
     assertEquals("<html><head><title>Title</title></head><body><p>Hello</p></body></html>", TextUtil.stripNewlines(doc.html())); 
     assertEquals("<html><head><title>Hello</title></head><body><p>Hello</p></body></html>", TextUtil.stripNewlines(doc.html())); 
     assertEquals("<html><head><title>Hello</title></head><body><p>Hello</p></body></html>", TextUtil.stripNewlines(doc.html())); 
     assertEquals("<html><head><title>Hello</title></head><body><p>Hello</p></body></html>", TextUtil.stripNewlines(doc.html())); 
 }
@Test
public void quote() { 
     String h = "<p>Hello < There <&amp;></p>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals("Hello < There <&>", doc.select("p").first().text()); 
     assertEquals("there <&>", doc.select("p").last().text()); 
 }
@Test
public void quote() { 
     String h = "<p>Hello < There <&amp;></p>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals("Hello < There <&>", doc.select("p").first().text()); 
     assertEquals("There <&>", doc.select("p").last().text()); 
     assertEquals("Hello < There <&>", doc.select("p").last().text()); 
     assertEquals("There <&>", doc.select("p").last().text()); 
     assertEquals("Hello < There <&>", doc.select("p").last().text()); 
     }
@Test
public void escapeHtml() { 
     String h = "<div>Hello < There <&amp;></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divs = doc.select("div"); 
     assertEquals(3, divs.size()); 
     assertEquals("Hello < There <&>", divs.get(0).text()); 
     assertEquals("there <&>", divs.get(1).text()); 
     Elements divs2 = doc.select("div"); 
     assertEquals(2, divs2.size()); 
     assertEquals("Hello < There <&>", divs2.get(0).text()); 
     assertEquals("there <&>", divs2.get(1).text()); 
     assertEquals("Hello <&>", divs2.get(2).text()); 
 }
@Test
public void escapeHtmlChars() { 
     String h = "<div>Hello < There <&amp;></div>"; 
     Document doc = Jsoup.parse(h); 
     Element div = doc.select("div").first(); 
     assertEquals("Hello < There <&>", div.text()); 
     }
@Test
public void escapeHtml() { 
     String h = "<div>Hello < There <&amp;></div>"; 
     Document doc = Jsoup.parse(h); 
     Element div = doc.select("div").first(); 
     assertEquals("Hello < There <&>", div.text()); 
     }
    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    
    
    

    
    
    
    
    
    
    

    

    

    

    
// Defects4J: flaky method
//     @Test public void normalisesDocument() {
//         String h = "<!doctype html>One<html>Two<head>Three<link></head>Four<body>Five </body>Six </html>Seven ";
//         Document doc = Jsoup.parse(h);
//         assertEquals("<!doctype html><html><head><link /></head><body>Five Six Seven  One Two Four Three</body></html>",
//                 TextUtil.stripNewlines(doc.html())); // is spaced OK if not newline & space stripped
//     }

    

    


}
