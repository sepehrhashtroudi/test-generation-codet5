@Test [EOL] public void testConstructor() { [EOL]     assertNotNull(new StringEscapeUtils()); [EOL]     final Constructor<?>[] cons = StringEscapeUtils.class.getDeclaredConstructors(); [EOL]     assertEquals(1, cons.length); [EOL]     assertTrue(Modifier.isPublic(cons[0].getModifiers())); [EOL]     assertTrue(Modifier.isPublic(StringEscapeUtils.class.getModifiers())); [EOL]     assertFalse(Modifier.isFinal(StringEscapeUtils.class.getModifiers())); [EOL] } <line_num>: 44,52
@Test [EOL] public void testEscapeJava() throws IOException { [EOL]     assertEquals(null, StringEscapeUtils.escapeJava(null)); [EOL]     try { [EOL]         StringEscapeUtils.ESCAPE_JAVA.translate(null, null); [EOL]         fail(); [EOL]     } catch (final IOException ex) { [EOL]         fail(); [EOL]     } catch (final IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         StringEscapeUtils.ESCAPE_JAVA.translate("", null); [EOL]         fail(); [EOL]     } catch (final IOException ex) { [EOL]         fail(); [EOL]     } catch (final IllegalArgumentException ex) { [EOL]     } [EOL]     assertEscapeJava("empty string", "", ""); [EOL]     assertEscapeJava(FOO, FOO); [EOL]     assertEscapeJava("tab", "\\t", "\t"); [EOL]     assertEscapeJava("backslash", "\\\\", "\\"); [EOL]     assertEscapeJava("single quote should not be escaped", "'", "'"); [EOL]     assertEscapeJava("\\\\\\b\\t\\r", "\\\b\t\r"); [EOL]     assertEscapeJava("\\u1234", "\u1234"); [EOL]     assertEscapeJava("\\u0234", "\u0234"); [EOL]     assertEscapeJava("\\u00EF", "\u00ef"); [EOL]     assertEscapeJava("\\u0001", "\u0001"); [EOL]     assertEscapeJava("Should use capitalized Unicode hex", "\\uABCD", "\uabcd"); [EOL]     assertEscapeJava("He didn't say, \\\"stop!\\\"", "He didn't say, \"stop!\""); [EOL]     assertEscapeJava("non-breaking space", "This space is non-breaking:" + "\\u00A0", "This space is non-breaking:\u00a0"); [EOL]     assertEscapeJava("\\uABCD\\u1234\\u012C", "\uABCD\u1234\u012C"); [EOL] } <line_num>: 54,90
@Test [EOL] public void testEscapeJavaWithSlash() { [EOL]     final String input = "String with a slash (/) in it"; [EOL]     final String expected = input; [EOL]     final String actual = StringEscapeUtils.escapeJava(input); [EOL]     assertEquals(expected, actual); [EOL] } <line_num>: 95,107
private void assertEscapeJava(final String escaped, final String original) throws IOException { [EOL]     assertEscapeJava(null, escaped, original); [EOL] } <line_num>: 109,111
private void assertEscapeJava(String message, final String expected, final String original) throws IOException { [EOL]     final String converted = StringEscapeUtils.escapeJava(original); [EOL]     message = "escapeJava(String) failed" + (message == null ? "" : (": " + message)); [EOL]     assertEquals(message, expected, converted); [EOL]     final StringWriter writer = new StringWriter(); [EOL]     StringEscapeUtils.ESCAPE_JAVA.translate(original, writer); [EOL]     assertEquals(expected, writer.toString()); [EOL] } <line_num>: 113,121
@Test [EOL] public void testUnescapeJava() throws IOException { [EOL]     assertEquals(null, StringEscapeUtils.unescapeJava(null)); [EOL]     try { [EOL]         StringEscapeUtils.UNESCAPE_JAVA.translate(null, null); [EOL]         fail(); [EOL]     } catch (final IOException ex) { [EOL]         fail(); [EOL]     } catch (final IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         StringEscapeUtils.UNESCAPE_JAVA.translate("", null); [EOL]         fail(); [EOL]     } catch (final IOException ex) { [EOL]         fail(); [EOL]     } catch (final IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         StringEscapeUtils.unescapeJava("\\u02-3"); [EOL]         fail(); [EOL]     } catch (final RuntimeException ex) { [EOL]     } [EOL]     assertUnescapeJava("", ""); [EOL]     assertUnescapeJava("test", "test"); [EOL]     assertUnescapeJava("\ntest\b", "\\ntest\\b"); [EOL]     assertUnescapeJava("\u123425foo\ntest\b", "\\u123425foo\\ntest\\b"); [EOL]     assertUnescapeJava("'\foo\teste\r", "\\'\\foo\\teste\\r"); [EOL]     assertUnescapeJava("", "\\"); [EOL]     assertUnescapeJava("lowercase Unicode", "\uABCDx", "\\uabcdx"); [EOL]     assertUnescapeJava("uppercase Unicode", "\uABCDx", "\\uABCDx"); [EOL]     assertUnescapeJava("Unicode as final character", "\uABCD", "\\uabcd"); [EOL] } <line_num>: 123,156
private void assertUnescapeJava(final String unescaped, final String original) throws IOException { [EOL]     assertUnescapeJava(null, unescaped, original); [EOL] } <line_num>: 158,160
private void assertUnescapeJava(final String message, final String unescaped, final String original) throws IOException { [EOL]     final String expected = unescaped; [EOL]     final String actual = StringEscapeUtils.unescapeJava(original); [EOL]     assertEquals("unescape(String) failed" + (message == null ? "" : (": " + message)) + ": expected '" + StringEscapeUtils.escapeJava(expected) + "' actual '" + StringEscapeUtils.escapeJava(actual) + "'", expected, actual); [EOL]     final StringWriter writer = new StringWriter(); [EOL]     StringEscapeUtils.UNESCAPE_JAVA.translate(original, writer); [EOL]     assertEquals(unescaped, writer.toString()); [EOL] } <line_num>: 162,177
@Test [EOL] public void testEscapeEcmaScript() { [EOL]     assertEquals(null, StringEscapeUtils.escapeEcmaScript(null)); [EOL]     try { [EOL]         StringEscapeUtils.ESCAPE_ECMASCRIPT.translate(null, null); [EOL]         fail(); [EOL]     } catch (final IOException ex) { [EOL]         fail(); [EOL]     } catch (final IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         StringEscapeUtils.ESCAPE_ECMASCRIPT.translate("", null); [EOL]         fail(); [EOL]     } catch (final IOException ex) { [EOL]         fail(); [EOL]     } catch (final IllegalArgumentException ex) { [EOL]     } [EOL]     assertEquals("He didn\\'t say, \\\"stop!\\\"", StringEscapeUtils.escapeEcmaScript("He didn't say, \"stop!\"")); [EOL]     assertEquals("document.getElementById(\\\"test\\\").value = \\'<script>alert(\\'aaa\\');<\\/script>\\';", StringEscapeUtils.escapeEcmaScript("document.getElementById(\"test\").value = '<script>alert('aaa');</script>';")); [EOL] } <line_num>: 179,200
@Test [EOL] public void testEscapeHtml() { [EOL]     for (int i = 0; i < HTML_ESCAPES.length; ++i) { [EOL]         final String message = HTML_ESCAPES[i][0]; [EOL]         final String expected = HTML_ESCAPES[i][1]; [EOL]         final String original = HTML_ESCAPES[i][2]; [EOL]         assertEquals(message, expected, StringEscapeUtils.escapeHtml4(original)); [EOL]         final StringWriter sw = new StringWriter(); [EOL]         try { [EOL]             StringEscapeUtils.ESCAPE_HTML4.translate(original, sw); [EOL]         } catch (final IOException e) { [EOL]         } [EOL]         final String actual = original == null ? null : sw.toString(); [EOL]         assertEquals(message, expected, actual); [EOL]     } [EOL] } <line_num>: 220,235
@Test [EOL] public void testUnescapeHtml4() { [EOL]     for (int i = 0; i < HTML_ESCAPES.length; ++i) { [EOL]         final String message = HTML_ESCAPES[i][0]; [EOL]         final String expected = HTML_ESCAPES[i][2]; [EOL]         final String original = HTML_ESCAPES[i][1]; [EOL]         assertEquals(message, expected, StringEscapeUtils.unescapeHtml4(original)); [EOL]         final StringWriter sw = new StringWriter(); [EOL]         try { [EOL]             StringEscapeUtils.UNESCAPE_HTML4.translate(original, sw); [EOL]         } catch (final IOException e) { [EOL]         } [EOL]         final String actual = original == null ? null : sw.toString(); [EOL]         assertEquals(message, expected, actual); [EOL]     } [EOL]     assertEquals("funny chars pass through OK", "Fran\u00E7ais", StringEscapeUtils.unescapeHtml4("Fran\u00E7ais")); [EOL]     assertEquals("Hello&;World", StringEscapeUtils.unescapeHtml4("Hello&;World")); [EOL]     assertEquals("Hello&#;World", StringEscapeUtils.unescapeHtml4("Hello&#;World")); [EOL]     assertEquals("Hello&# ;World", StringEscapeUtils.unescapeHtml4("Hello&# ;World")); [EOL]     assertEquals("Hello&##;World", StringEscapeUtils.unescapeHtml4("Hello&##;World")); [EOL] } <line_num>: 237,262
@Test [EOL] public void testUnescapeHexCharsHtml() { [EOL]     assertEquals("hex number unescape", "\u0080\u009F", StringEscapeUtils.unescapeHtml4("&#x80;&#x9F;")); [EOL]     assertEquals("hex number unescape", "\u0080\u009F", StringEscapeUtils.unescapeHtml4("&#X80;&#X9F;")); [EOL]     for (char i = Character.MIN_VALUE; i < Character.MAX_VALUE; i++) { [EOL]         final Character c1 = new Character(i); [EOL]         final Character c2 = new Character((char) (i + 1)); [EOL]         final String expected = c1.toString() + c2.toString(); [EOL]         final String escapedC1 = "&#x" + Integer.toHexString((c1.charValue())) + ";"; [EOL]         final String escapedC2 = "&#x" + Integer.toHexString((c2.charValue())) + ";"; [EOL]         assertEquals("hex number unescape index " + (int) i, expected, StringEscapeUtils.unescapeHtml4(escapedC1 + escapedC2)); [EOL]     } [EOL] } <line_num>: 264,278
@Test [EOL] public void testUnescapeUnknownEntity() throws Exception { [EOL]     assertEquals("&zzzz;", StringEscapeUtils.unescapeHtml4("&zzzz;")); [EOL] } <line_num>: 280,283
@Test [EOL] public void testEscapeHtmlVersions() throws Exception { [EOL]     assertEquals("&Beta;", StringEscapeUtils.escapeHtml4("\u0392")); [EOL]     assertEquals("\u0392", StringEscapeUtils.unescapeHtml4("&Beta;")); [EOL] } <line_num>: 285,291
@Test [EOL] public void testEscapeXml() throws Exception { [EOL]     assertEquals("&lt;abc&gt;", StringEscapeUtils.escapeXml("<abc>")); [EOL]     assertEquals("<abc>", StringEscapeUtils.unescapeXml("&lt;abc&gt;")); [EOL]     assertEquals("XML should not escape >0x7f values", "\u00A1", StringEscapeUtils.escapeXml("\u00A1")); [EOL]     assertEquals("XML should be able to unescape >0x7f values", "\u00A0", StringEscapeUtils.unescapeXml("&#160;")); [EOL]     assertEquals("XML should be able to unescape >0x7f values with one leading 0", "\u00A0", StringEscapeUtils.unescapeXml("&#0160;")); [EOL]     assertEquals("XML should be able to unescape >0x7f values with two leading 0s", "\u00A0", StringEscapeUtils.unescapeXml("&#00160;")); [EOL]     assertEquals("XML should be able to unescape >0x7f values with three leading 0s", "\u00A0", StringEscapeUtils.unescapeXml("&#000160;")); [EOL]     assertEquals("ain't", StringEscapeUtils.unescapeXml("ain&apos;t")); [EOL]     assertEquals("ain&apos;t", StringEscapeUtils.escapeXml("ain't")); [EOL]     assertEquals("", StringEscapeUtils.escapeXml("")); [EOL]     assertEquals(null, StringEscapeUtils.escapeXml(null)); [EOL]     assertEquals(null, StringEscapeUtils.unescapeXml(null)); [EOL]     StringWriter sw = new StringWriter(); [EOL]     try { [EOL]         StringEscapeUtils.ESCAPE_XML.translate("<abc>", sw); [EOL]     } catch (final IOException e) { [EOL]     } [EOL]     assertEquals("XML was escaped incorrectly", "&lt;abc&gt;", sw.toString()); [EOL]     sw = new StringWriter(); [EOL]     try { [EOL]         StringEscapeUtils.UNESCAPE_XML.translate("&lt;abc&gt;", sw); [EOL]     } catch (final IOException e) { [EOL]     } [EOL]     assertEquals("XML was unescaped incorrectly", "<abc>", sw.toString()); [EOL] } <line_num>: 293,328
@Test [EOL] public void testEscapeXmlSupplementaryCharacters() { [EOL]     final CharSequenceTranslator escapeXml = StringEscapeUtils.ESCAPE_XML.with(NumericEntityEscaper.between(0x7f, Integer.MAX_VALUE)); [EOL]     assertEquals("Supplementary character must be represented using a single escape", "&#144308;", escapeXml.translate("\uD84C\uDFB4")); [EOL] } <line_num>: 344,351
@Test [EOL] public void testEscapeXmlAllCharacters() { [EOL]     final CharSequenceTranslator escapeXml = StringEscapeUtils.ESCAPE_XML.with(NumericEntityEscaper.below(9), NumericEntityEscaper.between(0xB, 0xC), NumericEntityEscaper.between(0xE, 0x19), NumericEntityEscaper.between(0xD800, 0xDFFF), NumericEntityEscaper.between(0xFFFE, 0xFFFF), NumericEntityEscaper.above(0x110000)); [EOL]     assertEquals("&#0;&#1;&#2;&#3;&#4;&#5;&#6;&#7;&#8;", escapeXml.translate("\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\u0008")); [EOL]     assertEquals("\t", escapeXml.translate("\t")); [EOL]     assertEquals("\n", escapeXml.translate("\n")); [EOL]     assertEquals("&#11;&#12;", escapeXml.translate("\u000B\u000C")); [EOL]     assertEquals("\r", escapeXml.translate("\r")); [EOL]     assertEquals("Hello World! Ain&apos;t this great?", escapeXml.translate("Hello World! Ain't this great?")); [EOL]     assertEquals("&#14;&#15;&#24;&#25;", escapeXml.translate("\u000E\u000F\u0018\u0019")); [EOL] } <line_num>: 353,369
@Test [EOL] public void testUnescapeXmlSupplementaryCharacters() { [EOL]     assertEquals("Supplementary character must be represented using a single escape", "\uD84C\uDFB4", StringEscapeUtils.unescapeXml("&#144308;")); [EOL] } <line_num>: 376,380
@Test [EOL] public void testStandaloneAmphersand() { [EOL]     assertEquals("<P&O>", StringEscapeUtils.unescapeHtml4("&lt;P&O&gt;")); [EOL]     assertEquals("test & <", StringEscapeUtils.unescapeHtml4("test & &lt;")); [EOL]     assertEquals("<P&O>", StringEscapeUtils.unescapeXml("&lt;P&O&gt;")); [EOL]     assertEquals("test & <", StringEscapeUtils.unescapeXml("test & &lt;")); [EOL] } <line_num>: 384,390
@Test [EOL] public void testLang313() { [EOL]     assertEquals("& &", StringEscapeUtils.unescapeHtml4("& &amp;")); [EOL] } <line_num>: 392,395
@Test [EOL] public void testEscapeCsvString() throws Exception { [EOL]     assertEquals("foo.bar", StringEscapeUtils.escapeCsv("foo.bar")); [EOL]     assertEquals("\"foo,bar\"", StringEscapeUtils.escapeCsv("foo,bar")); [EOL]     assertEquals("\"foo\nbar\"", StringEscapeUtils.escapeCsv("foo\nbar")); [EOL]     assertEquals("\"foo\rbar\"", StringEscapeUtils.escapeCsv("foo\rbar")); [EOL]     assertEquals("\"foo\"\"bar\"", StringEscapeUtils.escapeCsv("foo\"bar")); [EOL]     assertEquals("", StringEscapeUtils.escapeCsv("")); [EOL]     assertEquals(null, StringEscapeUtils.escapeCsv(null)); [EOL] } <line_num>: 397,406
@Test [EOL] public void testEscapeCsvWriter() throws Exception { [EOL]     checkCsvEscapeWriter("foo.bar", "foo.bar"); [EOL]     checkCsvEscapeWriter("\"foo,bar\"", "foo,bar"); [EOL]     checkCsvEscapeWriter("\"foo\nbar\"", "foo\nbar"); [EOL]     checkCsvEscapeWriter("\"foo\rbar\"", "foo\rbar"); [EOL]     checkCsvEscapeWriter("\"foo\"\"bar\"", "foo\"bar"); [EOL]     checkCsvEscapeWriter("", null); [EOL]     checkCsvEscapeWriter("", ""); [EOL] } <line_num>: 408,417
private void checkCsvEscapeWriter(final String expected, final String value) { [EOL]     try { [EOL]         final StringWriter writer = new StringWriter(); [EOL]         StringEscapeUtils.ESCAPE_CSV.translate(value, writer); [EOL]         assertEquals(expected, writer.toString()); [EOL]     } catch (final IOException e) { [EOL]         fail("Threw: " + e); [EOL]     } [EOL] } <line_num>: 419,427
@Test [EOL] public void testUnescapeCsvString() throws Exception { [EOL]     assertEquals("foo.bar", StringEscapeUtils.unescapeCsv("foo.bar")); [EOL]     assertEquals("foo,bar", StringEscapeUtils.unescapeCsv("\"foo,bar\"")); [EOL]     assertEquals("foo\nbar", StringEscapeUtils.unescapeCsv("\"foo\nbar\"")); [EOL]     assertEquals("foo\rbar", StringEscapeUtils.unescapeCsv("\"foo\rbar\"")); [EOL]     assertEquals("foo\"bar", StringEscapeUtils.unescapeCsv("\"foo\"\"bar\"")); [EOL]     assertEquals("", StringEscapeUtils.unescapeCsv("")); [EOL]     assertEquals(null, StringEscapeUtils.unescapeCsv(null)); [EOL]     assertEquals("\"foo.bar\"", StringEscapeUtils.unescapeCsv("\"foo.bar\"")); [EOL] } <line_num>: 429,440
@Test [EOL] public void testUnescapeCsvWriter() throws Exception { [EOL]     checkCsvUnescapeWriter("foo.bar", "foo.bar"); [EOL]     checkCsvUnescapeWriter("foo,bar", "\"foo,bar\""); [EOL]     checkCsvUnescapeWriter("foo\nbar", "\"foo\nbar\""); [EOL]     checkCsvUnescapeWriter("foo\rbar", "\"foo\rbar\""); [EOL]     checkCsvUnescapeWriter("foo\"bar", "\"foo\"\"bar\""); [EOL]     checkCsvUnescapeWriter("", null); [EOL]     checkCsvUnescapeWriter("", ""); [EOL]     checkCsvUnescapeWriter("\"foo.bar\"", "\"foo.bar\""); [EOL] } <line_num>: 442,453
private void checkCsvUnescapeWriter(final String expected, final String value) { [EOL]     try { [EOL]         final StringWriter writer = new StringWriter(); [EOL]         StringEscapeUtils.UNESCAPE_CSV.translate(value, writer); [EOL]         assertEquals(expected, writer.toString()); [EOL]     } catch (final IOException e) { [EOL]         fail("Threw: " + e); [EOL]     } [EOL] } <line_num>: 455,463
@Test [EOL] public void testEscapeHtmlHighUnicode() throws java.io.UnsupportedEncodingException { [EOL]     final byte[] data = new byte[] { (byte) 0xF0, (byte) 0x9D, (byte) 0x8D, (byte) 0xA2 }; [EOL]     final String original = new String(data, "UTF8"); [EOL]     final String escaped = StringEscapeUtils.escapeHtml4(original); [EOL]     assertEquals("High Unicode should not have been escaped", original, escaped); [EOL]     final String unescaped = StringEscapeUtils.unescapeHtml4(escaped); [EOL]     assertEquals("High Unicode should have been unchanged", original, unescaped); [EOL] } <line_num>: 470,489
@Test [EOL] public void testEscapeHiragana() { [EOL]     final String original = "\u304B\u304C\u3068"; [EOL]     final String escaped = StringEscapeUtils.escapeHtml4(original); [EOL]     assertEquals("Hiragana character Unicode behaviour should not be being escaped by escapeHtml4", original, escaped); [EOL]     final String unescaped = StringEscapeUtils.unescapeHtml4(escaped); [EOL]     assertEquals("Hiragana character Unicode behaviour has changed - expected no unescaping", escaped, unescaped); [EOL] } <line_num>: 494,505
@Test [EOL] public void testLang708() throws IOException { [EOL]     final String input = IOUtils.toString(new FileInputStream("src/test/resources/lang-708-input.txt"), "UTF-8"); [EOL]     final String escaped = StringEscapeUtils.escapeEcmaScript(input); [EOL]     assertTrue(escaped, escaped.endsWith("}]")); [EOL]     assertTrue(escaped, escaped.endsWith("\"valueCode\\\":\\\"\\\"}]")); [EOL] } <line_num>: 513,521
@Test [EOL] public void testLang720() { [EOL]     final String input = new StringBuilder("\ud842\udfb7").append("A").toString(); [EOL]     final String escaped = StringEscapeUtils.escapeXml(input); [EOL]     assertEquals(input, escaped); [EOL] } <line_num>: 526,531
@Test [EOL] public void testEscapeJson() { [EOL]     assertEquals(null, StringEscapeUtils.escapeJson(null)); [EOL]     try { [EOL]         StringEscapeUtils.ESCAPE_JSON.translate(null, null); [EOL]         fail(); [EOL]     } catch (final IOException ex) { [EOL]         fail(); [EOL]     } catch (final IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         StringEscapeUtils.ESCAPE_JSON.translate("", null); [EOL]         fail(); [EOL]     } catch (final IOException ex) { [EOL]         fail(); [EOL]     } catch (final IllegalArgumentException ex) { [EOL]     } [EOL]     assertEquals("He didn't say, \\\"stop!\\\"", StringEscapeUtils.escapeJson("He didn't say, \"stop!\"")); [EOL]     String expected = "\\\"foo\\\" isn't \\\"bar\\\". specials: \\b\\r\\n\\f\\t\\\\\\/"; [EOL]     String input = "\"foo\" isn't \"bar\". specials: \b\r\n\f\t\\/"; [EOL]     assertEquals(expected, StringEscapeUtils.escapeJson(input)); [EOL] } <line_num>: 533,557