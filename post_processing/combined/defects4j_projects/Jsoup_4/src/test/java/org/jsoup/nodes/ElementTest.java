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
public void testPrependText4() { 
     Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>"); 
     Element div = doc.getElementById("1"); 
     div.prependText(" there & now >"); 
     assertEquals("<p>Hello</p> there &amp; now &gt;", TextUtil.stripNewlines(div.html())); 
 }
@Test
public void testWrapWithRemainder5() { 
     Document doc = Jsoup.parse("<div><p>Hello</p></div>"); 
     Element p = doc.select("p").first(); 
     p.wrap("<div class='head'></div><p>There!</p>"); 
     assertEquals("<div><div class=\"head\"><p>Hello</p><p>There!</p></div></div>", TextUtil.stripNewlines(doc.body().html())); 
 }
    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    

    


}
