package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 Test suite for attribute parser.

 @author Jonathan Hedley, jonathan@hedley.net */
public class AttributeParseTest {

@Test
public void emptyOnNoKey() { 
     String html = "<a =empty />"; 
     Element el = Jsoup.parse(html).getElementsByTag("a").get(0); 
     Attributes attr = el.attributes(); 
     assertEquals(0, attr.size()); 
 }
    

    

    
}
