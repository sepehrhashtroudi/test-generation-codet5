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
public void parsesSimpleDocument() { 
     String html = "<html><head><title>First!</title></head><body><p>First post! <img src=\"foo.png\" /></p></body></html>"; 
     Document doc = Jsoup.parse(html); 
     Element p = doc.body().child(0); 
     assertEquals("p", p.tagName()); 
     Element img = p.child(0); 
     assertEquals("foo.png", img.attr("src")); 
     assertEquals("img", img.tagName()); 
 }
@Test
public void parsesComments() { 
     String html = "<html><head></head><body><img src=foo><!-- <table><tr><td></table> --><p>Hello</p></body></html>"; 
     Document doc = Jsoup.parse(html); 
     Element body = doc.body(); 
     Comment comment = (Comment) body.childNode(1); 
     assertEquals(" <table><tr><td></table> ", comment.getData()); 
     Element p = body.child(1); 
     TextNode text = (TextNode) p.childNode(0); 
     assertEquals("Hello", text.getWholeText()); 
 }
@Test
public void handlesInvalidStartTags() { 
     String h = "<div>Hello < There <&amp;></div>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals("Hello < There <&>", doc.select("div").first().text()); 
 }
@Test
public void handlesEmptyBlocks() { 
     String h = "<div id=1/><div id=2><img /></div>"; 
     Document doc = Jsoup.parse(h); 
     Element div1 = doc.getElementById("1"); 
     assertTrue(div1.children().isEmpty()); 
 }
@Test
public void handlesBaseWithoutHref() { 
     String h = "<head><base target='_blank'></head><body><a href=/foo>Test</a></body>"; 
     Document doc = Jsoup.parse(h, "http://example.com/"); 
     Element a = doc.select("a").first(); 
     assertEquals("/foo", a.attr("href")); 
     assertEquals("http://example.com/foo", a.attr("abs:href")); 
 }
    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    
    
    

    
    
    
    
    
    
    

    

    

    

    
// Defects4J: flaky method
//     @Test public void normalisesDocument() {
//         String h = "<!doctype html>One<html>Two<head>Three<link></head>Four<body>Five </body>Six </html>Seven ";
//         Document doc = Jsoup.parse(h);
//         assertEquals("<!doctype html><html><head><link /></head><body>Five Six Seven  One Two Four Three</body></html>",
//                 TextUtil.stripNewlines(doc.html())); // is spaced OK if not newline & space stripped
//     }

    

    


}
