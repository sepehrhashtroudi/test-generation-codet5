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
public void testCopySafeNodes52() { String h = "<div><p><b>Hello</b></p><p><b>there</b></p></div>"; String cleanHtml = Jsoup.clean(h, Whitelist.basic()); assertEquals("<p><b>Hello</b></p><p><b>there</b></p></div>", TextUtil.stripNewlines(cleanHtml)); }
@Test
public void isSafeTag() throws Exception { Whitelist tags = Whitelist.basic().addTags("foo", "bar"); assertTrue(tags.isSafeTag("foo")); assertTrue(tags.isSafeTag("bar")); assertFalse(tags.isSafeTag("baz")); }
@Test
public void handlesFrames() { String h = "<html><head><script></script><noscript></noscript></head><body><p>Hello</p></body></html>"; String cleanHtml = Jsoup.clean(h, Whitelist.basic()); assertEquals("<html><head><script></script><noscript></noscript></head><body><p>Hello</p></body></html>", TextUtil.stripNewlines(cleanHtml)); }
@Test
public void handlesFrames() { String h = "<html><head><script></script><noscript></noscript></head><body><p>Hello</p></body></html>"; String cleanHtml = Jsoup.clean(h, Whitelist.basic()); assertEquals("<html><head><script></script><noscript></noscript></head><body><p>Hello</p></body></html>", TextUtil.stripNewlines(cleanHtml)); assertEquals("<html><head><script></script><noscript></noscript></head><body><p>Hello</p></body></html>", TextUtil.stripNewlines(cleanHtml)); }
@Test
public void handlesFrames() { String h = "<html><head><script></script><noscript></noscript></head><body><p>Hello</p></body></html>"; String cleanHtml = Jsoup.clean(h, Whitelist.basic()); assertEquals("Hello", cleanHtml); }
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    

    
    
    
    
    
}
