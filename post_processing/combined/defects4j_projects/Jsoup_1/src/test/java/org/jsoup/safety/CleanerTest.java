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
public void testCleanJavascriptHref2() { 
     String h = "<A HREF=\"javascript:document.location='http://www.google.com/'\">XSS</A>"; 
     String cleanHtml = Jsoup.clean(h, Whitelist.relaxed()); 
     assertEquals("<a>XSS</a>", cleanHtml); 
 }
@Test
public void basicTest() { 
     String h = "<div><p>Hello</p><p>There</p></div>"; 
     String cleanHtml = Jsoup.clean(h, Whitelist.basic()); 
     assertEquals("Hello There", cleanHtml); 
 }
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    

    
    
    
    
    
}
