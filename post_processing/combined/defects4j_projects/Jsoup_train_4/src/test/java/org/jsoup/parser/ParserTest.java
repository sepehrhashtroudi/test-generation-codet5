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
public void handlesBaseTags() { 
     String h = "<a href=1>#</a><base href='/2/'><a href='3'>#</a><base href='http://bar'><a href=4>#</a>"; 
     Document doc = Jsoup.parse(h, "http://foo/"); 
     assertEquals("http://bar", doc.baseUri()); 
     Elements anchors = doc.getElementsByTag("a"); 
     assertEquals(3, anchors.size()); 
     assertEquals("http://foo/", anchors.get(0).baseUri()); 
     assertEquals("http://foo/2/", anchors.get(1).baseUri()); 
     assertEquals("http://bar", anchors.get(2).baseUri()); 
     assertEquals("http://foo/1", anchors.get(0).absUrl("href")); 
     assertEquals("http://foo/2/3", anchors.get(1).absUrl("href")); 
     assertEquals("http://bar/4", anchors.get(2).absUrl("href")); 
 }
@Test
public void handlesUnknownInlineTags() { 
     String h = "<p><cust>Test</cust></p><p><cust><cust>Test</cust></cust></p>"; 
     Document doc = Jsoup.parseBodyFragment(h); 
     String out = doc.body().html(); 
     assertEquals(h, TextUtil.stripNewlines(out)); 
 }
@Test
public void parsesUnterminatedAttribute() { 
     String h1 = "<p id=\"foo"; 
     Document doc = Jsoup.parse(h1); 
     Element p = doc.getElementById("foo"); 
     assertNotNull(p); 
     assertEquals("p", p.tagName()); 
 }
@Test
public void handlesInvalidStartTags() { 
     String h = "<div>Hello < There <&amp;></div>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals("Hello < There <&>", doc.select("div").first().text()); 
 }
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
public void normalisesEmptyDocument() { 
     Document doc = Jsoup.parse(""); 
     assertEquals("<html><head></head><body></body></html>", TextUtil.stripNewlines(doc.html())); 
 }
@Test
public void createsStructureFromBodySnippet() { 
     String html = "foo <b>bar</b> baz"; 
     Document doc = Jsoup.parse(html); 
     assertEquals("foo bar baz", doc.text()); 
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
public void handlesCdata() { 
     String h = "<div id=1><![CData[<html>\n<foo><&amp;]]></div>"; 
     Document doc = Jsoup.parse(h); 
     Element div = doc.getElementById("1"); 
     assertEquals("<html> <foo><&amp;", div.text()); 
     assertEquals(0, div.children().size()); 
     assertEquals(1, div.childNodes().size()); 
 }
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
public void handlesEmptyBlocks() { 
     String h = "<div id=1/><div id=2><img /></div>"; 
     Document doc = Jsoup.parse(h); 
     Element div1 = doc.getElementById("1"); 
     assertTrue(div1.children().isEmpty()); 
 }
@Test
public void handlesTextArea() { 
     Document doc = Jsoup.parse("<textarea>Hello</textarea>"); 
     Elements els = doc.select("textarea"); 
     assertEquals("Hello", els.text()); 
     assertEquals("Hello", els.val()); 
 }
@Test
public void handlesFrames() { 
     String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals("<html><head><script></script><noscript></noscript></head><frameset><frame src=\"foo\" /><frame src=\"foo\" /></frameset><body></body></html>", TextUtil.stripNewlines(doc.html())); 
 }
@Test
public void handlesBaseWithoutHref() { 
     String h = "<head><base target='_blank'></head><body><a href=/foo>Test</a></body>"; 
     Document doc = Jsoup.parse(h, "http://example.com/"); 
     Element a = doc.select("a").first(); 
     assertEquals("/foo", a.attr("href")); 
     assertEquals("http://example.com/foo", a.attr("abs:href")); 
 }
@Test
public void parsesRoughAttributes() { 
     String html = "<html><head><title>First!</title></head><body><p class=\"foo > bar\">First post! <img src=\"foo.png\" /></p></body></html>"; 
     Document doc = Jsoup.parse(html); 
     Element p = doc.body().child(0); 
     assertEquals("p", p.tagName()); 
     assertEquals("foo > bar", p.attr("class")); 
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
