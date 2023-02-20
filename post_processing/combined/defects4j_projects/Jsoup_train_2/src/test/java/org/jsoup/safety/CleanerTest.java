package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.safety.Whitelist;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 Tests for the cleaner.

 @author Jonathan Hedley, jonathan@hedley.net */
public class CleanerTest {
@Test
public void testDropXmlProc4() { 
     String h = "<?import namespace=\"xss\"><p>Hello</p>"; 
     String cleanHtml = Jsoup.clean(h, Whitelist.relaxed()); 
     assertEquals("<p>Hello</p>", cleanHtml); 
 }
@Test
public void testCleanJavascriptHref12() { 
     String h = "<A HREF=\"javascript:document.location='http://www.google.com/'\">XSS</A>"; 
     String cleanHtml = Jsoup.clean(h, Whitelist.relaxed()); 
     assertEquals("<a>XSS</a>", cleanHtml); 
 }
@Test
public void basicBehaviourTest() { 
     String h = "<div><p><a href='javascript:sendAllMoney()'>Dodgy</a> <A HREF='HTTP://nice.com'>Nice</p><blockquote>Hello</blockquote>"; 
     String cleanHtml = Jsoup.clean(h, Whitelist.basic()); 
     assertEquals("<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p><blockquote>Hello</blockquote>", TextUtil.stripNewlines(cleanHtml)); 
 }
@Test
public void testHandlesEmptyAttributes26() { 
     String h = "<img alt=\"\" src= unknown=''>"; 
     String cleanHtml = Jsoup.clean(h, Whitelist.basicWithImages()); 
     assertEquals("<img alt=\"\" />", cleanHtml); 
 }
@Test
public void simpleBehaviourTest2() { 
     String h = "Hello <b>there</b>!"; 
     String cleanHtml = Jsoup.clean(h, Whitelist.simpleText()); 
     assertEquals("Hello <b>there</b>!", TextUtil.stripNewlines(cleanHtml)); 
 }
@Test
public void basicWithImagesTest() { 
     String h = "<div><p><img src='http://example.com/' alt=Image></p><p><img src='ftp://ftp.example.com'></p></div>"; 
     String cleanHtml = Jsoup.clean(h, Whitelist.basicWithImages()); 
     assertEquals("<p><img src=\"http://example.com/\" alt=\"Image\" /></p><p><img /></p>", TextUtil.stripNewlines(cleanHtml)); 
 }
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    

    
    
    
    
    
}
