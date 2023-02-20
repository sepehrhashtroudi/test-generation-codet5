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
public void handlesDataOnlyTags() { 
     String t = "<style>font-family: bold</style>"; 
     List<Element> tels = Jsoup.parse(t).getElementsByTag("style"); 
     assertEquals("font-family: bold", tels.get(0).data()); 
     assertEquals("", tels.get(0).text()); 
     String s = "<p>Hello</p><script>Nope</script><p>There</p>"; 
     Document doc = Jsoup.parse(s); 
     assertEquals("Hello There", doc.text()); 
     assertEquals("Nope", doc.data()); 
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
