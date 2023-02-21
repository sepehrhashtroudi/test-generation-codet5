@Test [EOL] public void simpleBehaviourTest() { [EOL]     String h = "<div><p class=foo><a href='http://evil.com'>Hello <b id=bar>there</b>!</a></div>"; [EOL]     String cleanHtml = Jsoup.clean(h, Whitelist.simpleText()); [EOL]     assertEquals("Hello <b>there</b>!", TextUtil.stripNewlines(cleanHtml)); [EOL] } <line_num>: 14,19
@Test [EOL] public void simpleBehaviourTest2() { [EOL]     String h = "Hello <b>there</b>!"; [EOL]     String cleanHtml = Jsoup.clean(h, Whitelist.simpleText()); [EOL]     assertEquals("Hello <b>there</b>!", TextUtil.stripNewlines(cleanHtml)); [EOL] } <line_num>: 21,26
@Test [EOL] public void basicBehaviourTest() { [EOL]     String h = "<div><p><a href='javascript:sendAllMoney()'>Dodgy</a> <A HREF='HTTP://nice.com'>Nice</p><blockquote>Hello</blockquote>"; [EOL]     String cleanHtml = Jsoup.clean(h, Whitelist.basic()); [EOL]     assertEquals("<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p><blockquote>Hello</blockquote>", TextUtil.stripNewlines(cleanHtml)); [EOL] } <line_num>: 28,34
@Test [EOL] public void basicWithImagesTest() { [EOL]     String h = "<div><p><img src='http://example.com/' alt=Image></p><p><img src='ftp://ftp.example.com'></p></div>"; [EOL]     String cleanHtml = Jsoup.clean(h, Whitelist.basicWithImages()); [EOL]     assertEquals("<p><img src=\"http://example.com/\" alt=\"Image\" /></p><p><img /></p>", TextUtil.stripNewlines(cleanHtml)); [EOL] } <line_num>: 36,40
@Test [EOL] public void testRelaxed() { [EOL]     String h = "<h1>Head</h1><td>One<td>Two</td>"; [EOL]     String cleanHtml = Jsoup.clean(h, Whitelist.relaxed()); [EOL]     assertEquals("<h1>Head</h1><table><tr><td>One</td><td>Two</td></tr></table>", TextUtil.stripNewlines(cleanHtml)); [EOL] } <line_num>: 42,46
@Test [EOL] public void testDropComments() { [EOL]     String h = "<p>Hello<!-- no --></p>"; [EOL]     String cleanHtml = Jsoup.clean(h, Whitelist.relaxed()); [EOL]     assertEquals("<p>Hello</p>", cleanHtml); [EOL] } <line_num>: 48,52
@Test [EOL] public void testDropXmlProc() { [EOL]     String h = "<?import namespace=\"xss\"><p>Hello</p>"; [EOL]     String cleanHtml = Jsoup.clean(h, Whitelist.relaxed()); [EOL]     assertEquals("<p>Hello</p>", cleanHtml); [EOL] } <line_num>: 54,58
@Test [EOL] public void testDropScript() { [EOL]     String h = "<SCRIPT SRC=//ha.ckers.org/.j><SCRIPT>alert(/XSS/.source)</SCRIPT>"; [EOL]     String cleanHtml = Jsoup.clean(h, Whitelist.relaxed()); [EOL]     assertEquals("", cleanHtml); [EOL] } <line_num>: 60,64
@Test [EOL] public void testDropImageScript() { [EOL]     String h = "<IMG SRC=\"javascript:alert('XSS')\">"; [EOL]     String cleanHtml = Jsoup.clean(h, Whitelist.relaxed()); [EOL]     assertEquals("<img />", cleanHtml); [EOL] } <line_num>: 66,70
@Test [EOL] public void testCleanJavascriptHref() { [EOL]     String h = "<A HREF=\"javascript:document.location='http://www.google.com/'\">XSS</A>"; [EOL]     String cleanHtml = Jsoup.clean(h, Whitelist.relaxed()); [EOL]     assertEquals("<a>XSS</a>", cleanHtml); [EOL] } <line_num>: 72,76
@Test [EOL] public void testDropsUnknownTags() { [EOL]     String h = "<p><custom foo=true>Test</custom></p>"; [EOL]     String cleanHtml = Jsoup.clean(h, Whitelist.relaxed()); [EOL]     assertEquals("<p>Test</p>", cleanHtml); [EOL] } <line_num>: 78,82
@Test [EOL] public void testHandlesEmptyAttributes() { [EOL]     String h = "<img alt=\"\" src= unknown=''>"; [EOL]     String cleanHtml = Jsoup.clean(h, Whitelist.basicWithImages()); [EOL]     assertEquals("<img alt=\"\" />", cleanHtml); [EOL] } <line_num>: 84,88
@Test [EOL] public void testIsValid() { [EOL]     String ok = "<p>Test <b><a href='http://example.com/'>OK</a></b></p>"; [EOL]     String nok1 = "<p><script></script>Not <b>OK</b></p>"; [EOL]     String nok2 = "<p align=right>Test Not <b>OK</b></p>"; [EOL]     assertTrue(Jsoup.isValid(ok, Whitelist.basic())); [EOL]     assertFalse(Jsoup.isValid(nok1, Whitelist.basic())); [EOL]     assertFalse(Jsoup.isValid(nok2, Whitelist.basic())); [EOL] } <line_num>: 90,97
@Test [EOL] public void resolvesRelativeLinks() { [EOL]     String html = "<a href='/foo'>Link</a>"; [EOL]     String clean = Jsoup.clean(html, "http://example.com/", Whitelist.basic()); [EOL]     assertEquals("<a href=\"http://example.com/foo\" rel=\"nofollow\">Link</a>", clean); [EOL] } <line_num>: 99,103
@Test [EOL] public void dropsUnresolvableRelativeLinks() { [EOL]     String html = "<a href='/foo'>Link</a>"; [EOL]     String clean = Jsoup.clean(html, Whitelist.basic()); [EOL]     assertEquals("<a rel=\"nofollow\">Link</a>", clean); [EOL] } <line_num>: 105,109
