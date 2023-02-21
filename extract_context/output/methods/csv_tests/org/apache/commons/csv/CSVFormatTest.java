@Test [EOL] public void testImmutalibity() { [EOL]     CSVFormat format = new CSVFormat('!', '!', '!', '!', true, true, "\r\n", null); [EOL]     format.withDelimiter('?'); [EOL]     format.withEncapsulator('?'); [EOL]     format.withCommentStart('?'); [EOL]     format.withLineSeparator("?"); [EOL]     format.withEscape('?'); [EOL]     format.withSurroundingSpacesIgnored(false); [EOL]     format.withEmptyLinesIgnored(false); [EOL]     assertEquals('!', format.getDelimiter()); [EOL]     assertEquals('!', format.getEncapsulator()); [EOL]     assertEquals('!', format.getCommentStart()); [EOL]     assertEquals('!', format.getEscape()); [EOL]     assertEquals("\r\n", format.getLineSeparator()); [EOL]     assertTrue(format.isSurroundingSpacesIgnored()); [EOL]     assertTrue(format.isEmptyLinesIgnored()); [EOL] } <line_num>: 31,51
@Test [EOL] public void testMutators() { [EOL]     CSVFormat format = new CSVFormat('!', '!', '!', '!', true, true, "\r\n", null); [EOL]     assertEquals('?', format.withDelimiter('?').getDelimiter()); [EOL]     assertEquals('?', format.withEncapsulator('?').getEncapsulator()); [EOL]     assertEquals('?', format.withCommentStart('?').getCommentStart()); [EOL]     assertEquals("?", format.withLineSeparator("?").getLineSeparator()); [EOL]     assertEquals('?', format.withEscape('?').getEscape()); [EOL]     assertFalse(format.withSurroundingSpacesIgnored(false).isSurroundingSpacesIgnored()); [EOL]     assertFalse(format.withEmptyLinesIgnored(false).isEmptyLinesIgnored()); [EOL] } <line_num>: 53,65
@Test [EOL] public void testFormat() { [EOL]     CSVFormat format = CSVFormat.DEFAULT; [EOL]     assertEquals("", format.format()); [EOL]     assertEquals("a,b,c", format.format("a", "b", "c")); [EOL]     assertEquals("\"x,y\",z", format.format("x,y", "z")); [EOL] } <line_num>: 67,74
@Test [EOL] public void testValidation() { [EOL]     CSVFormat format = CSVFormat.DEFAULT; [EOL]     try { [EOL]         format.withDelimiter('\n'); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL]     try { [EOL]         format.withEscape('\r'); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL]     try { [EOL]         format.withEncapsulator('\n'); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL]     try { [EOL]         format.withCommentStart('\r'); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL]     try { [EOL]         format.withDelimiter('!').withEscape('!').validate(); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL]     try { [EOL]         format.withDelimiter('!').withCommentStart('!').validate(); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL]     try { [EOL]         format.withEncapsulator('!').withCommentStart('!').validate(); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL]     format.withEncapsulator(CSVFormat.DISABLED).withCommentStart(CSVFormat.DISABLED).validate(); [EOL]     try { [EOL]         format.withEscape('!').withCommentStart('!').validate(); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL]     format.withEscape(CSVFormat.DISABLED).withCommentStart(CSVFormat.DISABLED).validate(); [EOL]     try { [EOL]         format.withEncapsulator('!').withDelimiter('!').validate(); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL] } <line_num>: 76,147
@SuppressWarnings("boxing") [EOL] @Test [EOL] public void testSerialization() throws Exception { [EOL]     ByteArrayOutputStream out = new ByteArrayOutputStream(); [EOL]     ObjectOutputStream oos = new ObjectOutputStream(out); [EOL]     oos.writeObject(CSVFormat.DEFAULT); [EOL]     oos.flush(); [EOL]     oos.close(); [EOL]     ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(out.toByteArray())); [EOL]     CSVFormat format = (CSVFormat) in.readObject(); [EOL]     assertNotNull(format); [EOL]     assertEquals("delimiter", CSVFormat.DEFAULT.getDelimiter(), format.getDelimiter()); [EOL]     assertEquals("encapsulator", CSVFormat.DEFAULT.getEncapsulator(), format.getEncapsulator()); [EOL]     assertEquals("comment start", CSVFormat.DEFAULT.getCommentStart(), format.getCommentStart()); [EOL]     assertEquals("line separator", CSVFormat.DEFAULT.getLineSeparator(), format.getLineSeparator()); [EOL]     assertEquals("escape", CSVFormat.DEFAULT.getEscape(), format.getEscape()); [EOL]     assertEquals("trim", CSVFormat.DEFAULT.isSurroundingSpacesIgnored(), format.isSurroundingSpacesIgnored()); [EOL]     assertEquals("empty lines", CSVFormat.DEFAULT.isEmptyLinesIgnored(), format.isEmptyLinesIgnored()); [EOL] } <line_num>: 149,170