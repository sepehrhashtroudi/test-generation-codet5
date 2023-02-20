package org.jsoup.integration;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

/**

 Integration test: parses from real-world example HTML.

 @author Jonathan Hedley, jonathan@hedley.net */
public class ParseTest {

@Test
public void testByAttribute3() { 
     String h = "<div Title=Foo /><div Title=Bar /><div Style=Qux /><div title=Bam /><div title=SLAM /><div />"; 
     Document doc = Jsoup.parse(h); 
     Elements withTitle = doc.select("[title]"); 
     assertEquals(4, withTitle.size()); 
     Elements foo = doc.select("[title=foo]"); 
     assertEquals(1, foo.size()); 
     Elements not = doc.select("div[title!=bar]"); 
     assertEquals(5, not.size()); 
     assertEquals("Foo", not.first().attr("title")); 
     Elements starts = doc.select("[title^=ba]"); 
     assertEquals(2, starts.size()); 
     assertEquals("Bar", starts.first().attr("title")); 
     assertEquals("Bam", starts.last().attr("title")); 
     Elements ends = doc.select("[title$=am]"); 
     assertEquals(2, ends.size()); 
     assertEquals("Bam", ends.first().attr("title")); 
     assertEquals("SLAM", ends.last().attr("title")); 
     Elements contains = doc.select("[title*=a]"); 
     assertEquals(3, contains.size()); 
     assertEquals("Bar", contains.first().attr("title")); 
     assertEquals("SLAM", contains.last().attr("title")); 
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
public void parentChildStar() { 
     String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divChilds = doc.select("div > *"); 
     assertEquals(3, divChilds.size()); 
     assertEquals("p", divChilds.get(0).tagName()); 
     assertEquals("p", divChilds.get(1).tagName()); 
     assertEquals("span", divChilds.get(2).tagName()); 
 }
@Test
public void and() { 
     String h = "<div id=1 class='foo bar' title=bar name=qux><p class=foo title=bar>Hello</p></div"; 
     Document doc = Jsoup.parse(h); 
     Elements div = doc.select("div.foo"); 
     assertEquals(1, div.size()); 
     assertEquals("div", div.first().tagName()); 
     Elements p = doc.select("div .foo"); 
     assertEquals(1, p.size()); 
     assertEquals("p", p.first().tagName()); 
     Elements div2 = doc.select("div#1.foo.bar[title=bar][name=qux]"); 
     assertEquals(1, div2.size()); 
     assertEquals("div", div2.first().tagName()); 
     Elements p2 = doc.select("div *.foo"); 
     assertEquals(1, p2.size()); 
     assertEquals("p", p2.first().tagName()); 
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
     
    @Test public void testNewsHomepage() throws IOException {
        File in = getFile("/htmltests/news-com-au-home.html");
        Document doc = Jsoup.parse(in, "UTF-8", "http://www.news.com.au/");
        assertEquals("News.com.au | News from Australia and around the world online | NewsComAu", doc.title());
        assertEquals("Brace yourself for Metro meltdown", doc.select(".id1225817868581 h4").text().trim());
        
        Element a = doc.select("a[href=/entertainment/horoscopes]").first();
        assertEquals("/entertainment/horoscopes", a.attr("href"));
        assertEquals("http://www.news.com.au/entertainment/horoscopes", a.attr("abs:href"));
        
        Element hs = doc.select("a[href*=naughty-corners-are-a-bad-idea]").first();
        assertEquals("http://www.heraldsun.com.au/news/naughty-corners-are-a-bad-idea-for-kids/story-e6frf7jo-1225817899003", hs.attr("href"));
        assertEquals(hs.attr("href"), hs.attr("abs:href"));
    }
    
    @Test public void testGoogleSearchIpod() throws IOException {
        File in = getFile("/htmltests/google-ipod.html");
        Document doc = Jsoup.parse(in, "UTF-8", "http://www.google.com/search?hl=en&q=ipod&aq=f&oq=&aqi=g10");
        assertEquals("ipod - Google Search", doc.title());
        Elements results = doc.select("h3.r > a");
        assertEquals(12, results.size());
        assertEquals("http://news.google.com/news?hl=en&q=ipod&um=1&ie=UTF-8&ei=uYlKS4SbBoGg6gPf-5XXCw&sa=X&oi=news_group&ct=title&resnum=1&ved=0CCIQsQQwAA", 
                results.get(0).attr("href"));
        assertEquals("http://www.apple.com/itunes/",
                results.get(1).attr("href"));
    }
    
    @Test public void testBinary() throws IOException {
        File in = getFile("/htmltests/thumb.jpg");
        Document doc = Jsoup.parse(in, "UTF-8");
        // nothing useful, but did not blow up
        assertTrue(doc.text().contains("gd-jpeg"));
    }
    
    @Test public void testYahooJp() throws IOException {
        File in = getFile("/htmltests/yahoo-jp.html");
        Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html"); // http charset is utf-8.
        assertEquals("Yahoo! JAPAN", doc.title());
        Element a = doc.select("a[href=t/2322m2]").first();
        assertEquals("http://www.yahoo.co.jp/_ylh=X3oDMTB0NWxnaGxsBF9TAzIwNzcyOTYyNjUEdGlkAzEyBHRtcGwDZ2Ex/t/2322m2", 
                a.attr("abs:href")); // session put into <base>
        assertEquals("全国、人気の駅ランキング", a.text());
    }
    
    File getFile(String resourceName) {
        try {
            File file = new File(ParseTest.class.getResource(resourceName).toURI());
            return file;
        }
        catch (URISyntaxException e) {
            throw new IllegalStateException(e);
        }
    }
}
