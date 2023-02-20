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
public void handlesInvalidStartTags() { 
     String h = "<div><p>Hello</p><p><span>there</span></p></div>"; 
     String cleanHtml = Jsoup.clean(h, Whitelist.basic()); 
     assertEquals("Hello there", cleanHtml); 
 }
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    

    
    
    
    
    
}
