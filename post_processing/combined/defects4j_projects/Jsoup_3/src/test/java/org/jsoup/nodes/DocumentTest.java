package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 Tests for Document.

 @author Jonathan Hedley, jonathan@hedley.net */
public class DocumentTest {
@Test
public void testSetText5() { 
     String h = "<div id=1>Hello <p>there <b>now</b></p></div>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals("Hello there now", doc.text()); 
     assertEquals("there now", doc.select("p").get(0).text()); 
     Element div = doc.getElementById("1").text("Gone"); 
     assertEquals("Gone", div.text()); 
     assertEquals(0, doc.select("p").size()); 
 }
    
    
    
}
