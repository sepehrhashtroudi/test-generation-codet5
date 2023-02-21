public HourTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 89,91
public static Test suite() { [EOL]     return new TestSuite(HourTests.class); [EOL] } <line_num>: 80,82
protected void setUp() { [EOL] } <line_num>: 96,98
public void testEqualsSelf() { [EOL]     Hour hour = new Hour(); [EOL]     assertTrue(hour.equals(hour)); [EOL] } <line_num>: 105,108
public void testEquals() { [EOL]     Hour hour1 = new Hour(15, new Day(29, MonthConstants.MARCH, 2002)); [EOL]     Hour hour2 = new Hour(15, new Day(29, MonthConstants.MARCH, 2002)); [EOL]     assertTrue(hour1.equals(hour2)); [EOL] } <line_num>: 113,117
public void testDateConstructor1() { [EOL]     TimeZone zone = TimeZone.getTimeZone("GMT"); [EOL]     Calendar c = new GregorianCalendar(zone); [EOL]     Hour h1 = new Hour(new Date(1014307199999L), zone); [EOL]     Hour h2 = new Hour(new Date(1014307200000L), zone); [EOL]     assertEquals(15, h1.getHour()); [EOL]     assertEquals(1014307199999L, h1.getLastMillisecond(c)); [EOL]     assertEquals(16, h2.getHour()); [EOL]     assertEquals(1014307200000L, h2.getFirstMillisecond(c)); [EOL] } <line_num>: 123,136
public void testDateConstructor2() { [EOL]     TimeZone zone = TimeZone.getTimeZone("Australia/Sydney"); [EOL]     Calendar c = new GregorianCalendar(zone); [EOL]     Hour h1 = new Hour(new Date(1014267599999L), zone); [EOL]     Hour h2 = new Hour(new Date(1014267600000L), zone); [EOL]     assertEquals(15, h1.getHour()); [EOL]     assertEquals(1014267599999L, h1.getLastMillisecond(c)); [EOL]     assertEquals(16, h2.getHour()); [EOL]     assertEquals(1014267600000L, h2.getFirstMillisecond(c)); [EOL] } <line_num>: 142,155
public void testFirstHourPrevious() { [EOL]     Hour first = new Hour(0, new Day(1, MonthConstants.JANUARY, 1900)); [EOL]     Hour previous = (Hour) first.previous(); [EOL]     assertNull(previous); [EOL] } <line_num>: 161,167
public void testFirstHourNext() { [EOL]     Hour first = new Hour(0, new Day(1, MonthConstants.JANUARY, 1900)); [EOL]     Hour next = (Hour) first.next(); [EOL]     assertEquals(1, next.getHour()); [EOL]     assertEquals(1900, next.getYear()); [EOL] } <line_num>: 173,178
public void testLastHourPrevious() { [EOL]     Hour last = new Hour(23, new Day(31, MonthConstants.DECEMBER, 9999)); [EOL]     Hour previous = (Hour) last.previous(); [EOL]     assertEquals(22, previous.getHour()); [EOL]     assertEquals(9999, previous.getYear()); [EOL] } <line_num>: 184,191
public void testLastHourNext() { [EOL]     Hour last = new Hour(23, new Day(31, MonthConstants.DECEMBER, 9999)); [EOL]     Hour next = (Hour) last.next(); [EOL]     assertNull(next); [EOL] } <line_num>: 197,203
public void testParseHour() { [EOL]     Hour h = Hour.parseHour("2002-01-29 13"); [EOL]     assertEquals(13, h.getHour()); [EOL] } <line_num>: 208,214
public void testSerialization() { [EOL]     Hour h1 = new Hour(); [EOL]     Hour h2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(h1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         h2 = (Hour) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         System.out.println(e.toString()); [EOL]     } [EOL]     assertEquals(h1, h2); [EOL] } <line_num>: 219,240
public void testHashcode() { [EOL]     Hour h1 = new Hour(7, 9, 10, 1999); [EOL]     Hour h2 = new Hour(7, 9, 10, 1999); [EOL]     assertTrue(h1.equals(h2)); [EOL]     int hash1 = h1.hashCode(); [EOL]     int hash2 = h2.hashCode(); [EOL]     assertEquals(hash1, hash2); [EOL] } <line_num>: 245,252
public void testNotCloneable() { [EOL]     Hour h = new Hour(7, 9, 10, 1999); [EOL]     assertFalse(h instanceof Cloneable); [EOL] } <line_num>: 257,260
public void testGetFirstMillisecond() { [EOL]     Locale saved = Locale.getDefault(); [EOL]     Locale.setDefault(Locale.UK); [EOL]     TimeZone savedZone = TimeZone.getDefault(); [EOL]     TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); [EOL]     Hour h = new Hour(15, 1, 4, 2006); [EOL]     assertEquals(1143900000000L, h.getFirstMillisecond()); [EOL]     Locale.setDefault(saved); [EOL]     TimeZone.setDefault(savedZone); [EOL] } <line_num>: 265,274
public void testGetFirstMillisecondWithTimeZone() { [EOL]     Hour h = new Hour(15, 1, 4, 1950); [EOL]     TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles"); [EOL]     Calendar c = new GregorianCalendar(zone); [EOL]     assertEquals(-623293200000L, h.getFirstMillisecond(c)); [EOL]     boolean pass = false; [EOL]     try { [EOL]         h.getFirstMillisecond((Calendar) null); [EOL]     } catch (NullPointerException e) { [EOL]         pass = true; [EOL]     } [EOL]     assertTrue(pass); [EOL] } <line_num>: 279,294
public void testGetFirstMillisecondWithCalendar() { [EOL]     Hour h = new Hour(2, 15, 4, 2000); [EOL]     GregorianCalendar calendar = new GregorianCalendar(Locale.GERMANY); [EOL]     calendar.setTimeZone(TimeZone.getTimeZone("Europe/Frankfurt")); [EOL]     assertEquals(955764000000L, h.getFirstMillisecond(calendar)); [EOL]     boolean pass = false; [EOL]     try { [EOL]         h.getFirstMillisecond((Calendar) null); [EOL]     } catch (NullPointerException e) { [EOL]         pass = true; [EOL]     } [EOL]     assertTrue(pass); [EOL] } <line_num>: 299,314
public void testGetLastMillisecond() { [EOL]     Locale saved = Locale.getDefault(); [EOL]     Locale.setDefault(Locale.UK); [EOL]     TimeZone savedZone = TimeZone.getDefault(); [EOL]     TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); [EOL]     Hour h = new Hour(1, 1, 1, 1970); [EOL]     assertEquals(3599999L, h.getLastMillisecond()); [EOL]     Locale.setDefault(saved); [EOL]     TimeZone.setDefault(savedZone); [EOL] } <line_num>: 319,328
public void testGetLastMillisecondWithTimeZone() { [EOL]     Hour h = new Hour(2, 7, 7, 1950); [EOL]     TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles"); [EOL]     Calendar c = new GregorianCalendar(zone); [EOL]     assertEquals(-614959200001L, h.getLastMillisecond(c)); [EOL]     boolean pass = false; [EOL]     try { [EOL]         h.getLastMillisecond((Calendar) null); [EOL]     } catch (NullPointerException e) { [EOL]         pass = true; [EOL]     } [EOL]     assertTrue(pass); [EOL] } <line_num>: 333,348
public void testGetLastMillisecondWithCalendar() { [EOL]     Hour h = new Hour(21, 21, 4, 2001); [EOL]     GregorianCalendar calendar = new GregorianCalendar(Locale.GERMANY); [EOL]     calendar.setTimeZone(TimeZone.getTimeZone("Europe/Frankfurt")); [EOL]     assertEquals(987890399999L, h.getLastMillisecond(calendar)); [EOL]     boolean pass = false; [EOL]     try { [EOL]         h.getLastMillisecond((Calendar) null); [EOL]     } catch (NullPointerException e) { [EOL]         pass = true; [EOL]     } [EOL]     assertTrue(pass); [EOL] } <line_num>: 353,368
public void testGetSerialIndex() { [EOL]     Hour h = new Hour(1, 1, 1, 2000); [EOL]     assertEquals(876625L, h.getSerialIndex()); [EOL]     h = new Hour(1, 1, 1, 1900); [EOL]     assertEquals(49L, h.getSerialIndex()); [EOL] } <line_num>: 373,378
public void testNext() { [EOL]     Hour h = new Hour(1, 12, 12, 2000); [EOL]     h = (Hour) h.next(); [EOL]     assertEquals(2000, h.getYear()); [EOL]     assertEquals(12, h.getMonth()); [EOL]     assertEquals(12, h.getDayOfMonth()); [EOL]     assertEquals(2, h.getHour()); [EOL]     h = new Hour(23, 31, 12, 9999); [EOL]     assertNull(h.next()); [EOL] } <line_num>: 383,392
public void testGetStart() { [EOL]     Locale saved = Locale.getDefault(); [EOL]     Locale.setDefault(Locale.ITALY); [EOL]     Calendar cal = Calendar.getInstance(Locale.ITALY); [EOL]     cal.set(2006, Calendar.JANUARY, 16, 3, 0, 0); [EOL]     cal.set(Calendar.MILLISECOND, 0); [EOL]     Hour h = new Hour(3, 16, 1, 2006); [EOL]     assertEquals(cal.getTime(), h.getStart()); [EOL]     Locale.setDefault(saved); [EOL] } <line_num>: 397,406
public void testGetEnd() { [EOL]     Locale saved = Locale.getDefault(); [EOL]     Locale.setDefault(Locale.ITALY); [EOL]     Calendar cal = Calendar.getInstance(Locale.ITALY); [EOL]     cal.set(2006, Calendar.JANUARY, 8, 1, 59, 59); [EOL]     cal.set(Calendar.MILLISECOND, 999); [EOL]     Hour h = new Hour(1, 8, 1, 2006); [EOL]     assertEquals(cal.getTime(), h.getEnd()); [EOL]     Locale.setDefault(saved); [EOL] } <line_num>: 411,420
