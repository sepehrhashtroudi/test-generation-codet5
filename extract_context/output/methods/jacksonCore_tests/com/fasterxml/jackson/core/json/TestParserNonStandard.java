public void testSimpleUnquoted() throws Exception { [EOL]     _testSimpleUnquoted(false); [EOL]     _testSimpleUnquoted(true); [EOL] } <line_num>: 10,14
public void testLargeUnquoted() throws Exception { [EOL]     _testLargeUnquoted(false); [EOL]     _testLargeUnquoted(true); [EOL] } <line_num>: 16,20
public void testSingleQuotesDefault() throws Exception { [EOL]     _testSingleQuotesDefault(false); [EOL]     _testSingleQuotesDefault(true); [EOL] } <line_num>: 22,26
public void testSingleQuotesEnabled() throws Exception { [EOL]     _testSingleQuotesEnabled(false); [EOL]     _testSingleQuotesEnabled(true); [EOL]     _testSingleQuotesEscaped(false); [EOL]     _testSingleQuotesEscaped(true); [EOL] } <line_num>: 28,34
public void testNonStandardNameChars() throws Exception { [EOL]     _testNonStandardNameChars(false); [EOL]     _testNonStandardNameChars(true); [EOL] } <line_num>: 37,41
public void testNonStandardAnyCharQuoting() throws Exception { [EOL]     _testNonStandarBackslashQuoting(false); [EOL]     _testNonStandarBackslashQuoting(true); [EOL] } <line_num>: 44,48
public void testLeadingZeroesUTF8() throws Exception { [EOL]     _testLeadingZeroes(true, false); [EOL]     _testLeadingZeroes(true, true); [EOL] } <line_num>: 51,54
public void testLeadingZeroesReader() throws Exception { [EOL]     _testLeadingZeroes(false, false); [EOL]     _testLeadingZeroes(false, true); [EOL] } <line_num>: 56,59
public void testAllowNaN() throws Exception { [EOL]     _testAllowNaN(false); [EOL]     _testAllowNaN(true); [EOL] } <line_num>: 62,65
public void testAllowInfinity() throws Exception { [EOL]     _testAllowInf(false); [EOL]     _testAllowInf(true); [EOL] } <line_num>: 68,71
private void _testLargeUnquoted(boolean useStream) throws Exception { [EOL]     StringBuilder sb = new StringBuilder(5000); [EOL]     sb.append("[\n"); [EOL]     final int REPS = 1050; [EOL]     for (int i = 0; i < REPS; ++i) { [EOL]         if (i > 0) { [EOL]             sb.append(','); [EOL]             if ((i & 7) == 0) { [EOL]                 sb.append('\n'); [EOL]             } [EOL]         } [EOL]         sb.append("{"); [EOL]         sb.append("abc").append(i & 127).append(':'); [EOL]         sb.append((i & 1) != 0); [EOL]         sb.append("}\n"); [EOL]     } [EOL]     sb.append("]"); [EOL]     String JSON = sb.toString(); [EOL]     JsonFactory f = new JsonFactory(); [EOL]     f.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true); [EOL]     JsonParser jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     for (int i = 0; i < REPS; ++i) { [EOL]         assertToken(JsonToken.START_OBJECT, jp.nextToken()); [EOL]         assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]         assertEquals("abc" + (i & 127), jp.getCurrentName()); [EOL]         assertToken(((i & 1) != 0) ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE, jp.nextToken()); [EOL]         assertToken(JsonToken.END_OBJECT, jp.nextToken()); [EOL]     } [EOL]     assertToken(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     jp.close(); [EOL] } <line_num>: 79,115
private void _testSimpleUnquoted(boolean useStream) throws Exception { [EOL]     final String JSON = "{ a : 1, _foo:true, $:\"money!\", \" \":null }"; [EOL]     JsonFactory f = new JsonFactory(); [EOL]     f.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true); [EOL]     JsonParser jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.START_OBJECT, jp.nextToken()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("a", jp.getCurrentName()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("_foo", jp.getCurrentName()); [EOL]     assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("$", jp.getCurrentName()); [EOL]     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]     assertEquals("money!", jp.getText()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals(" ", jp.getCurrentName()); [EOL]     assertToken(JsonToken.VALUE_NULL, jp.nextToken()); [EOL]     assertToken(JsonToken.END_OBJECT, jp.nextToken()); [EOL]     jp.close(); [EOL] } <line_num>: 118,148
private void _testSingleQuotesDefault(boolean useStream) throws Exception { [EOL]     JsonFactory f = new JsonFactory(); [EOL]     String JSON = "[ 'text' ]"; [EOL]     JsonParser jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     try { [EOL]         jp.nextToken(); [EOL]         fail("Expected exception"); [EOL]     } catch (JsonParseException e) { [EOL]         verifyException(e, "Unexpected character ('''"); [EOL]     } finally { [EOL]         jp.close(); [EOL]     } [EOL]     JSON = "{ 'a':1 }"; [EOL]     jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.START_OBJECT, jp.nextToken()); [EOL]     try { [EOL]         jp.nextToken(); [EOL]         fail("Expected exception"); [EOL]     } catch (JsonParseException e) { [EOL]         verifyException(e, "Unexpected character ('''"); [EOL]     } finally { [EOL]         jp.close(); [EOL]     } [EOL] } <line_num>: 155,184
private void _testSingleQuotesEnabled(boolean useStream) throws Exception { [EOL]     JsonFactory f = new JsonFactory(); [EOL]     f.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true); [EOL]     String JSON = "{ 'a' : 1, \"foobar\": 'b', '_abcde1234':'d', '\"' : '\"\"', '':'' }"; [EOL]     JsonParser jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.START_OBJECT, jp.nextToken()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("a", jp.getText()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals("1", jp.getText()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("foobar", jp.getText()); [EOL]     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]     assertEquals("b", jp.getText()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("_abcde1234", jp.getText()); [EOL]     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]     assertEquals("d", jp.getText()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("\"", jp.getText()); [EOL]     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("", jp.getText()); [EOL]     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]     assertEquals("", jp.getText()); [EOL]     assertToken(JsonToken.END_OBJECT, jp.nextToken()); [EOL]     jp.close(); [EOL] } <line_num>: 191,226
private void _testSingleQuotesEscaped(boolean useStream) throws Exception { [EOL]     JsonFactory f = new JsonFactory(); [EOL]     f.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true); [EOL]     String JSON = "[ '16\\'' ]"; [EOL]     JsonParser jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]     assertEquals("16'", jp.getText()); [EOL]     assertToken(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     jp.close(); [EOL] } <line_num>: 229,243
private void _testNonStandardNameChars(boolean useStream) throws Exception { [EOL]     JsonFactory f = new JsonFactory(); [EOL]     f.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true); [EOL]     String JSON = "{ @type : \"mytype\", #color : 123, *error* : true, " + " hyphen-ated : \"yes\", me+my : null" + "}"; [EOL]     JsonParser jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.START_OBJECT, jp.nextToken()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("@type", jp.getText()); [EOL]     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]     assertEquals("mytype", jp.getText()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("#color", jp.getText()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals(123, jp.getIntValue()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("*error*", jp.getText()); [EOL]     assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("hyphen-ated", jp.getText()); [EOL]     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]     assertEquals("yes", jp.getText()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("me+my", jp.getText()); [EOL]     assertToken(JsonToken.VALUE_NULL, jp.nextToken()); [EOL]     assertToken(JsonToken.END_OBJECT, jp.nextToken()); [EOL]     jp.close(); [EOL] } <line_num>: 245,282
private void _testNonStandarBackslashQuoting(boolean useStream) throws Exception { [EOL]     JsonFactory f = new JsonFactory(); [EOL]     assertFalse(f.isEnabled(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)); [EOL]     final String JSON = quote("\\'"); [EOL]     JsonParser jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     try { [EOL]         jp.nextToken(); [EOL]         jp.getText(); [EOL]         fail("Should have thrown an exception for doc <" + JSON + ">"); [EOL]     } catch (JsonParseException e) { [EOL]         verifyException(e, "unrecognized character escape"); [EOL]     } finally { [EOL]         jp.close(); [EOL]     } [EOL]     f.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true); [EOL]     assertTrue(f.isEnabled(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)); [EOL]     jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]     assertEquals("'", jp.getText()); [EOL]     jp.close(); [EOL] } <line_num>: 284,309
private void _testLeadingZeroes(boolean useStream, boolean appendSpace) throws Exception { [EOL]     JsonFactory f = new JsonFactory(); [EOL]     assertFalse(f.isEnabled(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)); [EOL]     String JSON = "00003"; [EOL]     if (appendSpace) { [EOL]         JSON += " "; [EOL]     } [EOL]     JsonParser jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     try { [EOL]         jp.nextToken(); [EOL]         jp.getText(); [EOL]         fail("Should have thrown an exception for doc <" + JSON + ">"); [EOL]     } catch (JsonParseException e) { [EOL]         verifyException(e, "invalid numeric value"); [EOL]     } finally { [EOL]         jp.close(); [EOL]     } [EOL]     f.configure(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS, true); [EOL]     assertTrue(f.isEnabled(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)); [EOL]     jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals(3, jp.getIntValue()); [EOL]     assertEquals("3", jp.getText()); [EOL]     jp.close(); [EOL]     JSON = "0" + Integer.MAX_VALUE; [EOL]     if (appendSpace) { [EOL]         JSON += " "; [EOL]     } [EOL]     jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals(String.valueOf(Integer.MAX_VALUE), jp.getText()); [EOL]     assertEquals(Integer.MAX_VALUE, jp.getIntValue()); [EOL]     Number nr = jp.getNumberValue(); [EOL]     assertSame(Integer.class, nr.getClass()); [EOL]     jp.close(); [EOL] } <line_num>: 311,354
private void _testAllowNaN(boolean useStream) throws Exception { [EOL]     final String JSON = "[ NaN]"; [EOL]     JsonFactory f = new JsonFactory(); [EOL]     assertFalse(f.isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)); [EOL]     JsonParser jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     try { [EOL]         jp.nextToken(); [EOL]         fail("Expected exception"); [EOL]     } catch (Exception e) { [EOL]         verifyException(e, "non-standard"); [EOL]     } finally { [EOL]         jp.close(); [EOL]     } [EOL]     f.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true); [EOL]     jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); [EOL]     double d = jp.getDoubleValue(); [EOL]     assertTrue(Double.isNaN(d)); [EOL]     assertEquals("NaN", jp.getText()); [EOL]     try { [EOL]         jp.getDecimalValue(); [EOL]         fail("Should fail when trying to access NaN as BigDecimal"); [EOL]     } catch (NumberFormatException e) { [EOL]         e.printStackTrace(); [EOL]         verifyException(e, "can not be represented as BigDecimal"); [EOL]     } [EOL]     assertToken(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     jp.close(); [EOL]     f.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true); [EOL]     jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); [EOL]     assertToken(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     jp.close(); [EOL] } <line_num>: 356,408
private void _testAllowInf(boolean useStream) throws Exception { [EOL]     final String JSON = "[ -INF, +INF, +Infinity, Infinity, -Infinity ]"; [EOL]     JsonFactory f = new JsonFactory(); [EOL]     assertFalse(f.isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)); [EOL]     JsonParser jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     try { [EOL]         jp.nextToken(); [EOL]         fail("Expected exception"); [EOL]     } catch (Exception e) { [EOL]         verifyException(e, "Non-standard token '-INF'"); [EOL]     } finally { [EOL]         jp.close(); [EOL]     } [EOL]     f.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true); [EOL]     jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); [EOL]     double d = jp.getDoubleValue(); [EOL]     assertEquals("-INF", jp.getText()); [EOL]     assertTrue(Double.isInfinite(d)); [EOL]     assertTrue(d == Double.NEGATIVE_INFINITY); [EOL]     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); [EOL]     d = jp.getDoubleValue(); [EOL]     assertEquals("+INF", jp.getText()); [EOL]     assertTrue(Double.isInfinite(d)); [EOL]     assertTrue(d == Double.POSITIVE_INFINITY); [EOL]     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); [EOL]     d = jp.getDoubleValue(); [EOL]     assertEquals("+Infinity", jp.getText()); [EOL]     assertTrue(Double.isInfinite(d)); [EOL]     assertTrue(d == Double.POSITIVE_INFINITY); [EOL]     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); [EOL]     d = jp.getDoubleValue(); [EOL]     assertEquals("Infinity", jp.getText()); [EOL]     assertTrue(Double.isInfinite(d)); [EOL]     assertTrue(d == Double.POSITIVE_INFINITY); [EOL]     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); [EOL]     d = jp.getDoubleValue(); [EOL]     assertEquals("-Infinity", jp.getText()); [EOL]     assertTrue(Double.isInfinite(d)); [EOL]     assertTrue(d == Double.NEGATIVE_INFINITY); [EOL]     assertToken(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     jp.close(); [EOL]     f.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true); [EOL]     jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); [EOL]     assertToken(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     jp.close(); [EOL] } <line_num>: 410,483
