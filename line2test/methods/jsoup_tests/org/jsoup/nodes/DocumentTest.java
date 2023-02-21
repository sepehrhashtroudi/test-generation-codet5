@Test [EOL] public void setTextPreservesDocumentStructure() { [EOL]     Document doc = Jsoup.parse("<p>Hello</p>"); [EOL]     doc.text("Replaced"); [EOL]     assertEquals("Replaced", doc.text()); [EOL]     assertEquals("Replaced", doc.body().text()); [EOL]     assertEquals(1, doc.select("head").size()); [EOL] } <line_num>: 13,19
@Test [EOL] public void testTitles() { [EOL]     Document noTitle = Jsoup.parse("<p>Hello</p>"); [EOL]     Document withTitle = Jsoup.parse("<title>First</title><title>Ignore</title><p>Hello</p>"); [EOL]     assertEquals("", noTitle.title()); [EOL]     noTitle.title("Hello"); [EOL]     assertEquals("Hello", noTitle.title()); [EOL]     assertEquals("Hello", noTitle.select("title").first().text()); [EOL]     assertEquals("First", withTitle.title()); [EOL]     withTitle.title("Hello"); [EOL]     assertEquals("Hello", withTitle.title()); [EOL]     assertEquals("Hello", withTitle.select("title").first().text()); [EOL] } <line_num>: 21,34
