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
public void testTextBean1() { 
     Document doc = Jsoup.parse("<p>One <span>two</span> three</p>"); 
     Element p = doc.select("p").first(); 
     TextNode tn = (TextNode) p.childNode(2); 
     assertEquals(" three", tn.text()); 
     tn.text(" POW!"); 
     assertEquals("One <span>two</span> POW!", p.html()); 
 }
@Test
public void testReplace2() { 
     Document doc = Jsoup.parse("<p>One <span>two</span> three</p>"); 
     Element p = doc.select("p").first(); 
     Element insert = doc.createElement("em").text("foo"); 
     p.childNode(1).replaceWith(insert); 
     assertEquals("One <em>foo</em> three", p.html()); 
 }
@Test
public void divSemantics() { 
     Tag div = Tag.valueOf("div"); 
     Tag p = Tag.valueOf("p"); 
     assertTrue(div.canContain(div)); 
     assertTrue(div.canContain(p)); 
 }
    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    
    
    

    
    
    
    
    
    
    

    

    

    

    
// Defects4J: flaky method
//     @Test public void normalisesDocument() {
//         String h = "<!doctype html>One<html>Two<head>Three<link></head>Four<body>Five </body>Six </html>Seven ";
//         Document doc = Jsoup.parse(h);
//         assertEquals("<!doctype html><html><head><link /></head><body>Five Six Seven  One Two Four Three</body></html>",
//                 TextUtil.stripNewlines(doc.html())); // is spaced OK if not newline & space stripped
//     }

    

    


}
