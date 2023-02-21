public void testDateSerialization() throws Exception { [EOL]     int dateStyle = DateFormat.LONG; [EOL]     DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(dateStyle); [EOL]     DateFormat formatter = DateFormat.getDateInstance(dateStyle); [EOL]     Date currentDate = new Date(); [EOL]     String dateString = dateTypeAdapter.serialize(currentDate, Date.class, null).getAsString(); [EOL]     assertEquals(formatter.format(currentDate), dateString); [EOL] } <line_num>: 34,42
public void testDatePattern() throws Exception { [EOL]     String pattern = "yyyy-MM-dd"; [EOL]     DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(pattern); [EOL]     DateFormat formatter = new SimpleDateFormat(pattern); [EOL]     Date currentDate = new Date(); [EOL]     String dateString = dateTypeAdapter.serialize(currentDate, Date.class, null).getAsString(); [EOL]     assertEquals(formatter.format(currentDate), dateString); [EOL] } <line_num>: 44,52
public void testInvalidDatePattern() throws Exception { [EOL]     try { [EOL]         new DefaultDateTypeAdapter("I am a bad Date pattern...."); [EOL]         fail("Invalid date pattern should fail."); [EOL]     } catch (IllegalArgumentException expected) { [EOL]     } [EOL] } <line_num>: 54,59