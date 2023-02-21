@Test [EOL] public void parsesSimpleDocument() { [EOL]     String html = "<html><head><title>First!</title></head><body><p>First post! <img src=\"foo.png\" /></p></body></html>"; [EOL]     Document doc = Jsoup.parse(html); [EOL]     Element p = doc.body().child(0); [EOL]     assertEquals("p", p.tagName()); [EOL]     Element img = p.child(0); [EOL]     assertEquals("foo.png", img.attr("src")); [EOL]     assertEquals("img", img.tagName()); [EOL] } <line_num>: 22,31
@Test [EOL] public void parsesRoughAttributes() { [EOL]     String html = "<html><head><title>First!</title></head><body><p class=\"foo > bar\">First post! <img src=\"foo.png\" /></p></body></html>"; [EOL]     Document doc = Jsoup.parse(html); [EOL]     Element p = doc.body().child(0); [EOL]     assertEquals("p", p.tagName()); [EOL]     assertEquals("foo > bar", p.attr("class")); [EOL] } <line_num>: 33,41
@Test [EOL] public void parsesComments() { [EOL]     String html = "<html><head></head><body><img src=foo><!-- <table><tr><td></table> --><p>Hello</p></body></html>"; [EOL]     Document doc = Jsoup.parse(html); [EOL]     Element body = doc.body(); [EOL]     Comment comment = (Comment) body.childNode(1); [EOL]     assertEquals(" <table><tr><td></table> ", comment.getData()); [EOL]     Element p = body.child(1); [EOL]     TextNode text = (TextNode) p.childNode(0); [EOL]     assertEquals("Hello", text.getWholeText()); [EOL] } <line_num>: 43,53
@Test [EOL] public void parsesUnterminatedComments() { [EOL]     String html = "<p>Hello<!-- <tr><td>"; [EOL]     Document doc = Jsoup.parse(html); [EOL]     Element p = doc.getElementsByTag("p").get(0); [EOL]     assertEquals("Hello", p.text()); [EOL]     TextNode text = (TextNode) p.childNode(0); [EOL]     assertEquals("Hello", text.getWholeText()); [EOL]     Comment comment = (Comment) p.childNode(1); [EOL]     assertEquals(" <tr><td>", comment.getData()); [EOL] } <line_num>: 55,64
@Test [EOL] public void parsesUnterminatedTag() { [EOL]     String h1 = "<p"; [EOL]     Document doc = Jsoup.parse(h1); [EOL]     assertEquals(1, doc.getElementsByTag("p").size()); [EOL]     String h2 = "<div id=1<p id='2'"; [EOL]     doc = Jsoup.parse(h2); [EOL]     Element d = doc.getElementById("1"); [EOL]     assertEquals(1, d.children().size()); [EOL]     Element p = doc.getElementById("2"); [EOL]     assertNotNull(p); [EOL] } <line_num>: 66,77
@Test [EOL] public void parsesUnterminatedAttribute() { [EOL]     String h1 = "<p id=\"foo"; [EOL]     Document doc = Jsoup.parse(h1); [EOL]     Element p = doc.getElementById("foo"); [EOL]     assertNotNull(p); [EOL]     assertEquals("p", p.tagName()); [EOL] } <line_num>: 79,85
@Test [EOL] public void createsDocumentStructure() { [EOL]     String html = "<meta name=keywords /><link rel=stylesheet /><title>jsoup</title><p>Hello world</p>"; [EOL]     Document doc = Jsoup.parse(html); [EOL]     Element head = doc.head(); [EOL]     Element body = doc.body(); [EOL]     assertEquals(1, doc.children().size()); [EOL]     assertEquals(2, doc.child(0).children().size()); [EOL]     assertEquals(3, head.children().size()); [EOL]     assertEquals(1, body.children().size()); [EOL]     assertEquals("keywords", head.getElementsByTag("meta").get(0).attr("name")); [EOL]     assertEquals(0, body.getElementsByTag("meta").size()); [EOL]     assertEquals("jsoup", doc.title()); [EOL]     assertEquals("Hello world", body.text()); [EOL]     assertEquals("Hello world", body.children().get(0).text()); [EOL] } <line_num>: 87,103
@Test [EOL] public void createsStructureFromBodySnippet() { [EOL]     String html = "foo <b>bar</b> baz"; [EOL]     Document doc = Jsoup.parse(html); [EOL]     assertEquals("foo bar baz", doc.text()); [EOL] } <line_num>: 105,112
@Test [EOL] public void handlesEscapedData() { [EOL]     String html = "<div title='Surf &amp; Turf'>Reef &amp; Beef</div>"; [EOL]     Document doc = Jsoup.parse(html); [EOL]     Element div = doc.getElementsByTag("div").get(0); [EOL]     assertEquals("Surf & Turf", div.attr("title")); [EOL]     assertEquals("Reef & Beef", div.text()); [EOL] } <line_num>: 114,121
@Test [EOL] public void handlesDataOnlyTags() { [EOL]     String t = "<style>font-family: bold</style>"; [EOL]     List<Element> tels = Jsoup.parse(t).getElementsByTag("style"); [EOL]     assertEquals("font-family: bold", tels.get(0).data()); [EOL]     assertEquals("", tels.get(0).text()); [EOL]     String s = "<p>Hello</p><script>Nope</script><p>There</p>"; [EOL]     Document doc = Jsoup.parse(s); [EOL]     assertEquals("Hello There", doc.text()); [EOL]     assertEquals("Nope", doc.data()); [EOL] } <line_num>: 123,133
@Test [EOL] public void handlesTextArea() { [EOL]     Document doc = Jsoup.parse("<textarea>Hello</textarea>"); [EOL]     Elements els = doc.select("textarea"); [EOL]     assertEquals("Hello", els.text()); [EOL]     assertEquals("Hello", els.val()); [EOL] } <line_num>: 135,140
@Test [EOL] public void createsImplicitLists() { [EOL]     String h = "<li>Point one<li>Point two"; [EOL]     Document doc = Jsoup.parse(h); [EOL]     Elements ol = doc.select("ul"); [EOL]     assertEquals(1, ol.size()); [EOL]     assertEquals(2, ol.get(0).children().size()); [EOL]     String h2 = "<ol><li><p>Point the first<li><p>Point the second"; [EOL]     Document doc2 = Jsoup.parse(h2); [EOL]     assertEquals(0, doc2.select("ul").size()); [EOL]     assertEquals(1, doc2.select("ol").size()); [EOL]     assertEquals(2, doc2.select("ol li").size()); [EOL]     assertEquals(2, doc2.select("ol li p").size()); [EOL]     assertEquals(1, doc2.select("ol li").get(0).children().size()); [EOL] } <line_num>: 142,158
@Test [EOL] public void createsImplicitTable() { [EOL]     String h = "<td>Hello<td><p>There<p>now"; [EOL]     Document doc = Jsoup.parse(h); [EOL]     assertEquals("<table><tr><td>Hello</td><td><p>There</p><p>now</p></td></tr></table>", TextUtil.stripNewlines(doc.body().html())); [EOL] } <line_num>: 160,164
@Test [EOL] public void handlesBaseTags() { [EOL]     String h = "<a href=1>#</a><base href='/2/'><a href='3'>#</a><base href='http://bar'><a href=4>#</a>"; [EOL]     Document doc = Jsoup.parse(h, "http://foo/"); [EOL]     assertEquals("http://bar", doc.baseUri()); [EOL]     Elements anchors = doc.getElementsByTag("a"); [EOL]     assertEquals(3, anchors.size()); [EOL]     assertEquals("http://foo/", anchors.get(0).baseUri()); [EOL]     assertEquals("http://foo/2/", anchors.get(1).baseUri()); [EOL]     assertEquals("http://bar", anchors.get(2).baseUri()); [EOL]     assertEquals("http://foo/1", anchors.get(0).absUrl("href")); [EOL]     assertEquals("http://foo/2/3", anchors.get(1).absUrl("href")); [EOL]     assertEquals("http://bar/4", anchors.get(2).absUrl("href")); [EOL] } <line_num>: 166,181
@Test [EOL] public void handlesCdata() { [EOL]     String h = "<div id=1><![CData[<html>\n<foo><&amp;]]></div>"; [EOL]     Document doc = Jsoup.parse(h); [EOL]     Element div = doc.getElementById("1"); [EOL]     assertEquals("<html> <foo><&amp;", div.text()); [EOL]     assertEquals(0, div.children().size()); [EOL]     assertEquals(1, div.childNodes().size()); [EOL] } <line_num>: 183,190
@Test [EOL] public void handlesInvalidStartTags() { [EOL]     String h = "<div>Hello < There <&amp;></div>"; [EOL]     Document doc = Jsoup.parse(h); [EOL]     assertEquals("Hello < There <&>", doc.select("div").first().text()); [EOL] } <line_num>: 192,196
@Test [EOL] public void handlesUnknownTags() { [EOL]     String h = "<div><foo title=bar>Hello<foo title=qux>there</foo></div>"; [EOL]     Document doc = Jsoup.parse(h); [EOL]     Elements foos = doc.select("foo"); [EOL]     assertEquals(2, foos.size()); [EOL]     assertEquals("bar", foos.first().attr("title")); [EOL]     assertEquals("qux", foos.last().attr("title")); [EOL]     assertEquals("there", foos.last().text()); [EOL] } <line_num>: 198,206
@Test [EOL] public void handlesUnknownInlineTags() { [EOL]     String h = "<p><cust>Test</cust></p><p><cust><cust>Test</cust></cust></p>"; [EOL]     Document doc = Jsoup.parseBodyFragment(h); [EOL]     String out = doc.body().html(); [EOL]     assertEquals(h, TextUtil.stripNewlines(out)); [EOL] } <line_num>: 208,213
@Test [EOL] public void handlesEmptyBlocks() { [EOL]     String h = "<div id=1/><div id=2><img /></div>"; [EOL]     Document doc = Jsoup.parse(h); [EOL]     Element div1 = doc.getElementById("1"); [EOL]     assertTrue(div1.children().isEmpty()); [EOL] } <line_num>: 215,220
@Test [EOL] public void handlesMultiClosingBody() { [EOL]     String h = "<body><p>Hello</body><p>there</p></body></body></html><p>now"; [EOL]     Document doc = Jsoup.parse(h); [EOL]     assertEquals(3, doc.select("p").size()); [EOL]     assertEquals(3, doc.body().children().size()); [EOL] } <line_num>: 222,227
@Test [EOL] public void handlesUnclosedDefinitionLists() { [EOL]     String h = "<dt>Foo<dd>Bar<dt>Qux<dd>Zug"; [EOL]     Document doc = Jsoup.parse(h); [EOL]     assertEquals(4, doc.body().getElementsByTag("dl").first().children().size()); [EOL]     Elements dts = doc.select("dt"); [EOL]     assertEquals(2, dts.size()); [EOL]     assertEquals("Zug", dts.get(1).nextElementSibling().text()); [EOL] } <line_num>: 229,236
@Test [EOL] public void handlesFrames() { [EOL]     String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>"; [EOL]     Document doc = Jsoup.parse(h); [EOL]     assertEquals("<html><head><script></script><noscript></noscript></head><frameset><frame src=\"foo\" /><frame src=\"foo\" /></frameset><body></body></html>", TextUtil.stripNewlines(doc.html())); [EOL] } <line_num>: 238,243
@Test [EOL] public void handlesJavadocFont() { [EOL]     String h = "<TD BGCOLOR=\"#EEEEFF\" CLASS=\"NavBarCell1\">    <A HREF=\"deprecated-list.html\"><FONT CLASS=\"NavBarFont1\"><B>Deprecated</B></FONT></A>&nbsp;</TD>"; [EOL]     Document doc = Jsoup.parse(h); [EOL]     Element a = doc.select("a").first(); [EOL]     assertEquals("Deprecated", a.text()); [EOL]     assertEquals("font", a.child(0).tagName()); [EOL]     assertEquals("b", a.child(0).child(0).tagName()); [EOL] } <line_num>: 245,252
@Test [EOL] public void handlesBaseWithoutHref() { [EOL]     String h = "<head><base target='_blank'></head><body><a href=/foo>Test</a></body>"; [EOL]     Document doc = Jsoup.parse(h, "http://example.com/"); [EOL]     Element a = doc.select("a").first(); [EOL]     assertEquals("/foo", a.attr("href")); [EOL]     assertEquals("http://example.com/foo", a.attr("abs:href")); [EOL] } <line_num>: 254,260
@Test [EOL] public void normalisesDocument() { [EOL] } <line_num>: 262,262
@Test [EOL] public void normalisesEmptyDocument() { [EOL]     Document doc = Jsoup.parse(""); [EOL]     assertEquals("<html><head></head><body></body></html>", TextUtil.stripNewlines(doc.html())); [EOL] } <line_num>: 271,274
@Test [EOL] public void normalisesHeadlessBody() { [EOL]     Document doc = Jsoup.parse("<html><body><span class=\"foo\">bar</span>"); [EOL]     assertEquals("<html><head></head><body><span class=\"foo\">bar</span></body></html>", TextUtil.stripNewlines(doc.html())); [EOL] } <line_num>: 276,280