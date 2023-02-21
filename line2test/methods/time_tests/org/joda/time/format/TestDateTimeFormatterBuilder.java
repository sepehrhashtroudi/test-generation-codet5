public TestDateTimeFormatterBuilder(String name) { [EOL]     super(name); [EOL] } <line_num>: 52,54
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 44,46
public static TestSuite suite() { [EOL]     return new TestSuite(TestDateTimeFormatterBuilder.class); [EOL] } <line_num>: 48,50
protected void setUp() throws Exception { [EOL] } <line_num>: 56,57
protected void tearDown() throws Exception { [EOL] } <line_num>: 59,60
public void test_toFormatter() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     try { [EOL]         bld.toFormatter(); [EOL]         fail(); [EOL]     } catch (UnsupportedOperationException ex) { [EOL]     } [EOL]     bld.appendLiteral('X'); [EOL]     assertNotNull(bld.toFormatter()); [EOL] } <line_num>: 63,71
public void test_toPrinter() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     try { [EOL]         bld.toPrinter(); [EOL]         fail(); [EOL]     } catch (UnsupportedOperationException ex) { [EOL]     } [EOL]     bld.appendLiteral('X'); [EOL]     assertNotNull(bld.toPrinter()); [EOL] } <line_num>: 73,81
public void test_toParser() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     try { [EOL]         bld.toParser(); [EOL]         fail(); [EOL]     } catch (UnsupportedOperationException ex) { [EOL]     } [EOL]     bld.appendLiteral('X'); [EOL]     assertNotNull(bld.toParser()); [EOL] } <line_num>: 83,91
public void test_canBuildFormatter() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     assertEquals(false, bld.canBuildFormatter()); [EOL]     bld.appendLiteral('X'); [EOL]     assertEquals(true, bld.canBuildFormatter()); [EOL] } <line_num>: 94,99
public void test_canBuildPrinter() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     assertEquals(false, bld.canBuildPrinter()); [EOL]     bld.appendLiteral('X'); [EOL]     assertEquals(true, bld.canBuildPrinter()); [EOL] } <line_num>: 101,106
public void test_canBuildParser() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     assertEquals(false, bld.canBuildParser()); [EOL]     bld.appendLiteral('X'); [EOL]     assertEquals(true, bld.canBuildParser()); [EOL] } <line_num>: 108,113
public void test_append_Formatter() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     bld.appendLiteral('Y'); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); [EOL]     bld2.appendLiteral('X'); [EOL]     bld2.append(f); [EOL]     bld2.appendLiteral('Z'); [EOL]     assertEquals("XYZ", bld2.toFormatter().print(0L)); [EOL] } <line_num>: 116,126
public void test_append_Printer() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     bld.appendLiteral('Y'); [EOL]     DateTimePrinter p = bld.toPrinter(); [EOL]     DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); [EOL]     bld2.appendLiteral('X'); [EOL]     bld2.append(p); [EOL]     bld2.appendLiteral('Z'); [EOL]     DateTimeFormatter f = bld2.toFormatter(); [EOL]     assertEquals(true, f.isPrinter()); [EOL]     assertEquals(false, f.isParser()); [EOL]     assertEquals("XYZ", f.print(0L)); [EOL] } <line_num>: 129,142
public void test_append_nullPrinter() { [EOL]     try { [EOL]         DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); [EOL]         bld2.append((DateTimePrinter) null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 144,152
public void test_append_Parser() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     bld.appendLiteral('Y'); [EOL]     DateTimeParser p = bld.toParser(); [EOL]     DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); [EOL]     bld2.appendLiteral('X'); [EOL]     bld2.append(p); [EOL]     bld2.appendLiteral('Z'); [EOL]     DateTimeFormatter f = bld2.toFormatter(); [EOL]     assertEquals(false, f.isPrinter()); [EOL]     assertEquals(true, f.isParser()); [EOL]     assertEquals(0, f.withZoneUTC().parseMillis("XYZ")); [EOL] } <line_num>: 155,168
public void test_append_nullParser() { [EOL]     try { [EOL]         DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); [EOL]         bld2.append((DateTimeParser) null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 170,178
public void test_append_Printer_nullParser() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     bld.appendLiteral('Y'); [EOL]     DateTimePrinter p = bld.toPrinter(); [EOL]     try { [EOL]         DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); [EOL]         bld2.append(p, (DateTimeParser) null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 181,193
public void test_append_nullPrinter_Parser() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     bld.appendLiteral('Y'); [EOL]     DateTimeParser p = bld.toParser(); [EOL]     try { [EOL]         DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); [EOL]         bld2.append((DateTimePrinter) null, p); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 195,207
public void test_appendOptional_Parser() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     bld.appendLiteral('Y'); [EOL]     DateTimeParser p = bld.toParser(); [EOL]     DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); [EOL]     bld2.appendLiteral('X'); [EOL]     bld2.appendOptional(p); [EOL]     bld2.appendLiteral('Z'); [EOL]     DateTimeFormatter f = bld2.toFormatter(); [EOL]     assertEquals(false, f.isPrinter()); [EOL]     assertEquals(true, f.isParser()); [EOL]     assertEquals(0, f.withZoneUTC().parseMillis("XYZ")); [EOL] } <line_num>: 210,223
public void test_appendOptional_nullParser() { [EOL]     try { [EOL]         DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); [EOL]         bld2.appendOptional((DateTimeParser) null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 225,233
public void test_appendFixedDecimal() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     bld.appendFixedDecimal(DateTimeFieldType.year(), 4); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     assertEquals("2007", f.print(new DateTime("2007-01-01"))); [EOL]     assertEquals("0123", f.print(new DateTime("123-01-01"))); [EOL]     assertEquals("0001", f.print(new DateTime("1-2-3"))); [EOL]     assertEquals("99999", f.print(new DateTime("99999-2-3"))); [EOL]     assertEquals("-0099", f.print(new DateTime("-99-2-3"))); [EOL]     assertEquals("0000", f.print(new DateTime("0-2-3"))); [EOL]     assertEquals(2001, f.parseDateTime("2001").getYear()); [EOL]     try { [EOL]         f.parseDateTime("-2001"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL]     try { [EOL]         f.parseDateTime("200"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL]     try { [EOL]         f.parseDateTime("20016"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL]     bld = new DateTimeFormatterBuilder(); [EOL]     bld.appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2); [EOL]     bld.appendLiteral(':'); [EOL]     bld.appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2); [EOL]     bld.appendLiteral(':'); [EOL]     bld.appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2); [EOL]     f = bld.toFormatter(); [EOL]     assertEquals("01:02:34", f.print(new DateTime("T1:2:34"))); [EOL]     DateTime dt = f.parseDateTime("01:02:34"); [EOL]     assertEquals(1, dt.getHourOfDay()); [EOL]     assertEquals(2, dt.getMinuteOfHour()); [EOL]     assertEquals(34, dt.getSecondOfMinute()); [EOL]     try { [EOL]         f.parseDateTime("0145:02:34"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL]     try { [EOL]         f.parseDateTime("01:0:34"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL] } <line_num>: 236,290
public void test_appendFixedSignedDecimal() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     bld.appendFixedSignedDecimal(DateTimeFieldType.year(), 4); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     assertEquals("2007", f.print(new DateTime("2007-01-01"))); [EOL]     assertEquals("0123", f.print(new DateTime("123-01-01"))); [EOL]     assertEquals("0001", f.print(new DateTime("1-2-3"))); [EOL]     assertEquals("99999", f.print(new DateTime("99999-2-3"))); [EOL]     assertEquals("-0099", f.print(new DateTime("-99-2-3"))); [EOL]     assertEquals("0000", f.print(new DateTime("0-2-3"))); [EOL]     assertEquals(2001, f.parseDateTime("2001").getYear()); [EOL]     assertEquals(-2001, f.parseDateTime("-2001").getYear()); [EOL]     assertEquals(2001, f.parseDateTime("+2001").getYear()); [EOL]     try { [EOL]         f.parseDateTime("20016"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL] } <line_num>: 293,313
public void test_appendTimeZoneId() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     bld.appendTimeZoneId(); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     assertEquals("Asia/Tokyo", f.print(new DateTime(2007, 3, 4, 0, 0, 0, TOKYO))); [EOL]     assertEquals(TOKYO, f.parseDateTime("Asia/Tokyo").getZone()); [EOL]     try { [EOL]         f.parseDateTime("Nonsense"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL] } <line_num>: 316,328
public void test_printParseZoneTokyo() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId(); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO); [EOL]     assertEquals("2007-03-04 12:30 Asia/Tokyo", f.print(dt)); [EOL]     assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Asia/Tokyo")); [EOL] } <line_num>: 330,338
public void test_printParseZoneParis() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId(); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, PARIS); [EOL]     assertEquals("2007-03-04 12:30 Europe/Paris", f.print(dt)); [EOL]     assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Europe/Paris")); [EOL]     assertEquals(dt, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 Europe/Paris")); [EOL] } <line_num>: 340,349
public void test_printParseZoneDawsonCreek() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId(); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Dawson_Creek")); [EOL]     assertEquals("2007-03-04 12:30 America/Dawson_Creek", f.print(dt)); [EOL]     assertEquals(dt, f.parseDateTime("2007-03-04 12:30 America/Dawson_Creek")); [EOL] } <line_num>: 351,359
public void test_printParseZoneBahiaBanderas() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId(); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Bahia_Banderas")); [EOL]     assertEquals("2007-03-04 12:30 America/Bahia_Banderas", f.print(dt)); [EOL]     assertEquals(dt, f.parseDateTime("2007-03-04 12:30 America/Bahia_Banderas")); [EOL] } <line_num>: 361,369
public void test_printParseOffset() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO); [EOL]     assertEquals("2007-03-04 12:30 +09:00", f.print(dt)); [EOL]     assertEquals(dt.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +09:00")); [EOL]     assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00")); [EOL]     assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00")); [EOL] } <line_num>: 371,381
public void test_printParseOffsetAndZone() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId(); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO); [EOL]     assertEquals("2007-03-04 12:30 +09:00 Asia/Tokyo", f.print(dt)); [EOL]     assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo")); [EOL]     assertEquals(dt.withZone(PARIS), f.withZone(PARIS).parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo")); [EOL]     assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo")); [EOL] } <line_num>: 383,393
public void test_parseWrongOffset() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7)); [EOL]     assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00")); [EOL]     assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00")); [EOL]     assertEquals(expected.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +07:00")); [EOL] } <line_num>: 395,407
public void test_parseWrongOffsetAndZone() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId(); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7)); [EOL]     assertEquals(expected.withZone(TOKYO), f.parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); [EOL]     assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); [EOL]     assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); [EOL] } <line_num>: 409,421
public void test_localPrintParseZoneTokyo() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId(); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO); [EOL]     assertEquals("2007-03-04 12:30 Asia/Tokyo", f.print(dt)); [EOL]     LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30); [EOL]     assertEquals(expected, f.parseLocalDateTime("2007-03-04 12:30 Asia/Tokyo")); [EOL] } <line_num>: 424,434
public void test_localPrintParseOffset() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO); [EOL]     assertEquals("2007-03-04 12:30 +09:00", f.print(dt)); [EOL]     LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30); [EOL]     assertEquals(expected, f.parseLocalDateTime("2007-03-04 12:30 +09:00")); [EOL]     assertEquals(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +09:00")); [EOL]     assertEquals(expected, f.withOffsetParsed().parseLocalDateTime("2007-03-04 12:30 +09:00")); [EOL] } <line_num>: 436,448
public void test_localPrintParseOffsetAndZone() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId(); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO); [EOL]     assertEquals("2007-03-04 12:30 +09:00 Asia/Tokyo", f.print(dt)); [EOL]     LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30); [EOL]     assertEquals(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo")); [EOL]     assertEquals(expected, f.withZone(PARIS).parseLocalDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo")); [EOL] } <line_num>: 450,461
public void test_localParseWrongOffsetAndZone() { [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId(); [EOL]     DateTimeFormatter f = bld.toFormatter(); [EOL]     LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30); [EOL]     assertEquals(expected, f.parseLocalDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); [EOL]     assertEquals(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); [EOL]     assertEquals(expected, f.withOffsetParsed().parseLocalDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); [EOL] } <line_num>: 463,475
public void test_printParseShortName() { [EOL] } <line_num>: 478,478
public void test_printParseShortNameWithLookup() { [EOL] } <line_num>: 498,498
public void test_printParseShortNameWithAutoLookup() { [EOL] } <line_num>: 524,524
public void test_printParseLongName() { [EOL] } <line_num>: 558,558
public void test_printParseLongNameWithLookup() { [EOL] } <line_num>: 578,578
