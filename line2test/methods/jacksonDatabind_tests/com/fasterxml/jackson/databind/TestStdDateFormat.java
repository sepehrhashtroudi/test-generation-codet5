public void testFactories() { [EOL]     assertNotNull(StdDateFormat.getBlueprintISO8601Format()); [EOL]     assertNotNull(StdDateFormat.getBlueprintRFC1123Format()); [EOL]     TimeZone tz = TimeZone.getTimeZone("GMT"); [EOL]     assertNotNull(StdDateFormat.getISO8601Format(tz)); [EOL]     assertNotNull(StdDateFormat.getRFC1123Format(tz)); [EOL] } <line_num>: 10,16
public void testInvalid() { [EOL]     StdDateFormat std = new StdDateFormat(); [EOL]     try { [EOL]         std.parse("foobar"); [EOL]     } catch (java.text.ParseException e) { [EOL]         verifyException(e, "Can not parse"); [EOL]     } [EOL] } <line_num>: 18,25
