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
public void handlesUnknownTags() { 
     String h = "<div><foo title=bar>Hello<foo title=qux>there</foo></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements foos = doc.select("foo"); 
     assertEquals(2, foos.size()); 
     assertEquals("bar", foos.first().attr("title")); 
     assertEquals("qux", foos.last().attr("title")); 
     assertEquals("there", foos.last().text()); 
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
@Test
public void handlesTextArea() { 
     Document doc = Jsoup.parse("<textarea>Hello</textarea>"); 
     Elements els = doc.select("textarea"); 
     assertEquals("Hello", els.text()); 
     assertEquals("Hello", els.val()); 
 }
@Test
public void divSemantics() { 
     Tag div = Tag.valueOf("div"); 
     Tag p = Tag.valueOf("p"); 
     assertTrue(div.canContain(div)); 
     assertTrue(div.canContain(p)); 
 }
@Test
public void handlesUnclosedDefinitionLists() { 
     String h = "<dt>Foo<dd>Bar<dt>Qux<dd>Zug"; 
     Document doc = Jsoup.parse(h); 
     assertEquals(4, doc.body().getElementsByTag("dl").first().children().size()); 
     Elements dts = doc.select("dt"); 
     assertEquals(2, dts.size()); 
     assertEquals("Zug", dts.get(1).nextElementSibling().text()); 
 }
    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    
    
    

    
    
    
    
    
    
    

    

    

    

    
// Defects4J: flaky method
//     @Test public void normalisesDocument() {
//         String h = "<!doctype html>One<html>Two<head>Three<link></head>Four<body>Five </body>Six </html>Seven ";
//         Document doc = Jsoup.parse(h);
//         assertEquals("<!doctype html><html><head><link /></head><body>Five Six Seven  One Two Four Three</body></html>",
//                 TextUtil.stripNewlines(doc.html())); // is spaced OK if not newline & space stripped
//     }

    

    


}
