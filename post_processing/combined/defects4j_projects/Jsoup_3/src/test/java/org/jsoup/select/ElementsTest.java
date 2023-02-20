package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Document;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 Tests for ElementList.

 @author Jonathan Hedley, jonathan@hedley.net */
public class ElementsTest {
@Test
public void hasAttr() { 
     Document doc = Jsoup.parse("<p title=foo><p title=bar><p class=foo><p class=bar>"); 
     Elements ps = doc.select("p"); 
     assertTrue(ps.hasAttr("title")); 
     assertFalse(ps.hasAttr("class")); 
 }
    

    
    
    
    
    

    
    
    

    
    
    
    
    
    
    
    
    

    
    
    
    
    
}
