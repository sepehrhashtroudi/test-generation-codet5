package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

/**
 * Tests for Element (DOM stuff mostly).
 *
 * @author Jonathan Hedley
 */
public class ElementTest {
    private String reference = "<div id=div1><p>Hello</p><p>Another <b>element</b></p><div id=div2><img src=foo.png></div></div>";

@Test
public void testReplace1() { 
     Document doc = Jsoup.parse("<p>One <span>two</span> three</p>"); 
     Element p = doc.select("p").first(); 
     Element insert = doc.createElement("em").text("foo"); 
     p.childNode(1).replaceWith(insert); 
     assertEquals("One <em>foo</em> three", p.html()); 
 }
@Test
public void testWrap7() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); 
     Element p = doc.select("p").first(); 
     p.wrap("<div class='head'></div>"); 
     assertEquals("<div><div class=\"head\"><div class=\"foo\" /></div><p>Hello</p></div><p>There</p></div>", TextUtil.stripNewlines(doc.body().html())); 
     Element ret = p.wrap("<div><div class=foo></div><p>What?</p></div>"); 
     assertEquals("<div><div class=\"head\"><div class=\"foo\" /></div><p>Hello</p></div><p>What?</p></div><p>There</p></div><p>What?</p></div>", TextUtil.stripNewlines(doc.body().html())); 
     assertEquals(ret, p); 
 }
@Test
public void testWrap8() { 
     Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>"); 
     Element p = doc.select("p").first(); 
     p.wrap("<div class='head'></div>"); 
     assertEquals("<div><div class=\"head\"><div><div class=\"foo\" /></div><p>Hello</p></div></div><p>There</p></div>", TextUtil.stripNewlines(doc.body().html())); 
     Element ret = p.wrap("<div><div class=foo></div><p>What?</p></div>"); 
     assertEquals("<div><div class=\"head\"><div><div class=\"foo\" /></div><p>Hello</p></div><p>What?</p></div><p>There</p></div></div><p>What?</p></div>", TextUtil.stripNewlines(doc.body().html())); 
     assertEquals(ret, p); 
 }
    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    

    


}
