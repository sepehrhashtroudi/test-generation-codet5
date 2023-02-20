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
public void basicWithImages() { 
     String h = "<div><p><a href='javascript:sendAllMoney()'>Dodgy</a> <A HREF='HTTP://nice.com'>Nice</p><blockquote>Hello</blockquote>"; 
     String cleanHtml = Jsoup.clean(h, Whitelist.basicWithImages()); 
     assertEquals("<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p><blockquote>Hello</blockquote>", TextUtil.stripNewlines(cleanHtml)); 
 }
@Test
public void basicBehaviourTest2() { 
     String h = "<div><p><a href='javascript:sendAllMoney()'>Dodgy</a> <A HREF='HTTP://nice.com'>Nice</p><blockquote>Hello</blockquote>"; 
     String cleanHtml = Jsoup.clean(h, Whitelist.basicWithImages()); 
     assertEquals("<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p><blockquote>Hello</blockquote>", TextUtil.stripNewlines(cleanHtml)); 
 }
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    

    
    
    
    
    
}
