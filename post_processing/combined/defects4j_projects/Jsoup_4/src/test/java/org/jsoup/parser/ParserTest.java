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
public void testSetHtml6() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.html("<p>there</p><p>now</p>"); 
     assertEquals("<p>there</p><p>now</p>", TextUtil.stripNewlines(div.html())); 
 }
@Test
public void testData7() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p></p></div>"); 
     Element div = doc.select("div").first(); 
     Elements ps = doc.select("p"); 
     assertEquals("Hello", div.data()); 
     assertEquals("there", ps.first().text()); 
     assertEquals("Hello", ps.last().text()); 
 }
@Test
public void parsesUnterminatedComments() { 
     String html = "<p>Hello<!-- <tr><td>"; 
     Document doc = Jsoup.parse(html); 
     Element p = doc.getElementsByTag("p").get(0); 
     assertEquals("Hello", p.text()); 
     TextNode text = (TextNode) p.childNode(0); 
     assertEquals("Hello", text.getWholeText()); 
     Comment comment = (Comment) p.childNode(1); 
     assertEquals(" <tr><td>", comment.getData()); 
 }
    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    
    
    

    
    
    
    
    
    
    

    

    

    

    
// Defects4J: flaky method
//     @Test public void normalisesDocument() {
//         String h = "<!doctype html>One<html>Two<head>Three<link></head>Four<body>Five </body>Six </html>Seven ";
//         Document doc = Jsoup.parse(h);
//         assertEquals("<!doctype html><html><head><link /></head><body>Five Six Seven  One Two Four Three</body></html>",
//                 TextUtil.stripNewlines(doc.html())); // is spaced OK if not newline & space stripped
//     }

    

    


}
