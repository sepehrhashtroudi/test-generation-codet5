public MyDateAxis(String label) { [EOL]     super(label); [EOL] } <line_num>: 100,102
public DateAxisTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 123,125
public Date previousStandardDate(Date d, DateTickUnit unit) { [EOL]     return super.previousStandardDate(d, unit); [EOL] } <line_num>: 104,106
public static Test suite() { [EOL]     return new TestSuite(DateAxisTests.class); [EOL] } <line_num>: 114,116
public void testEquals() { [EOL]     DateAxis a1 = new DateAxis("Test"); [EOL]     DateAxis a2 = new DateAxis("Test"); [EOL]     assertTrue(a1.equals(a2)); [EOL]     assertFalse(a1.equals(null)); [EOL]     assertFalse(a1.equals("Some non-DateAxis object")); [EOL]     a1.setTickUnit(new DateTickUnit(DateTickUnitType.DAY, 7)); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setTickUnit(new DateTickUnit(DateTickUnitType.DAY, 7)); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setDateFormatOverride(new SimpleDateFormat("yyyy")); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setDateFormatOverride(new SimpleDateFormat("yyyy")); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setTimeline(SegmentedTimeline.newMondayThroughFridayTimeline()); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setTimeline(SegmentedTimeline.newMondayThroughFridayTimeline()); [EOL]     assertTrue(a1.equals(a2)); [EOL] } <line_num>: 130,162
public void test1472942() { [EOL]     DateAxis a1 = new DateAxis("Test"); [EOL]     DateAxis a2 = new DateAxis("Test"); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setRange(new Date(1L), new Date(2L)); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setRange(new Date(1L), new Date(2L)); [EOL]     assertTrue(a1.equals(a2)); [EOL] } <line_num>: 168,178
public void testHashCode() { [EOL]     DateAxis a1 = new DateAxis("Test"); [EOL]     DateAxis a2 = new DateAxis("Test"); [EOL]     assertTrue(a1.equals(a2)); [EOL]     int h1 = a1.hashCode(); [EOL]     int h2 = a2.hashCode(); [EOL]     assertEquals(h1, h2); [EOL] } <line_num>: 183,190
public void testCloning() { [EOL]     DateAxis a1 = new DateAxis("Test"); [EOL]     DateAxis a2 = null; [EOL]     try { [EOL]         a2 = (DateAxis) a1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(a1 != a2); [EOL]     assertTrue(a1.getClass() == a2.getClass()); [EOL]     assertTrue(a1.equals(a2)); [EOL] } <line_num>: 195,207
public void testSetRange() { [EOL]     DateAxis axis = new DateAxis("Test Axis"); [EOL]     Calendar calendar = Calendar.getInstance(); [EOL]     calendar.set(1999, Calendar.JANUARY, 3); [EOL]     Date d1 = calendar.getTime(); [EOL]     calendar.set(1999, Calendar.JANUARY, 31); [EOL]     Date d2 = calendar.getTime(); [EOL]     axis.setRange(d1, d2); [EOL]     DateRange range = (DateRange) axis.getRange(); [EOL]     assertEquals(d1, range.getLowerDate()); [EOL]     assertEquals(d2, range.getUpperDate()); [EOL] } <line_num>: 212,226
public void testSetMaximumDate() { [EOL]     DateAxis axis = new DateAxis("Test Axis"); [EOL]     Date date = new Date(); [EOL]     axis.setMaximumDate(date); [EOL]     assertEquals(date, axis.getMaximumDate()); [EOL]     Date d1 = new Date(); [EOL]     Date d2 = new Date(d1.getTime() + 1); [EOL]     Date d0 = new Date(d1.getTime() - 1); [EOL]     axis.setMaximumDate(d2); [EOL]     axis.setMinimumDate(d1); [EOL]     axis.setMaximumDate(d1); [EOL]     assertEquals(d0, axis.getMinimumDate()); [EOL] } <line_num>: 231,246
public void testSetMinimumDate() { [EOL]     DateAxis axis = new DateAxis("Test Axis"); [EOL]     Date d1 = new Date(); [EOL]     Date d2 = new Date(d1.getTime() + 1); [EOL]     axis.setMaximumDate(d2); [EOL]     axis.setMinimumDate(d1); [EOL]     assertEquals(d1, axis.getMinimumDate()); [EOL]     Date d3 = new Date(d2.getTime() + 1); [EOL]     axis.setMinimumDate(d2); [EOL]     assertEquals(d3, axis.getMaximumDate()); [EOL] } <line_num>: 251,264
private boolean same(double d1, double d2, double tolerance) { [EOL]     return (Math.abs(d1 - d2) < tolerance); [EOL] } <line_num>: 275,277
public void testJava2DToValue() { [EOL]     DateAxis axis = new DateAxis(); [EOL]     axis.setRange(50.0, 100.0); [EOL]     Rectangle2D dataArea = new Rectangle2D.Double(10.0, 50.0, 400.0, 300.0); [EOL]     double y1 = axis.java2DToValue(75.0, dataArea, RectangleEdge.LEFT); [EOL]     assertTrue(same(y1, 95.8333333, 1.0)); [EOL]     double y2 = axis.java2DToValue(75.0, dataArea, RectangleEdge.RIGHT); [EOL]     assertTrue(same(y2, 95.8333333, 1.0)); [EOL]     double x1 = axis.java2DToValue(75.0, dataArea, RectangleEdge.TOP); [EOL]     assertTrue(same(x1, 58.125, 1.0)); [EOL]     double x2 = axis.java2DToValue(75.0, dataArea, RectangleEdge.BOTTOM); [EOL]     assertTrue(same(x2, 58.125, 1.0)); [EOL]     axis.setInverted(true); [EOL]     double y3 = axis.java2DToValue(75.0, dataArea, RectangleEdge.LEFT); [EOL]     assertTrue(same(y3, 54.1666667, 1.0)); [EOL]     double y4 = axis.java2DToValue(75.0, dataArea, RectangleEdge.RIGHT); [EOL]     assertTrue(same(y4, 54.1666667, 1.0)); [EOL]     double x3 = axis.java2DToValue(75.0, dataArea, RectangleEdge.TOP); [EOL]     assertTrue(same(x3, 91.875, 1.0)); [EOL]     double x4 = axis.java2DToValue(75.0, dataArea, RectangleEdge.BOTTOM); [EOL]     assertTrue(same(x4, 91.875, 1.0)); [EOL] } <line_num>: 282,303
public void testSerialization() { [EOL]     DateAxis a1 = new DateAxis("Test Axis"); [EOL]     DateAxis a2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(a1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         a2 = (DateAxis) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     boolean b = a1.equals(a2); [EOL]     assertTrue(b); [EOL] } <line_num>: 308,330
public void testPreviousStandardDateYearA() { [EOL]     MyDateAxis axis = new MyDateAxis("Year"); [EOL]     Year y2006 = new Year(2006); [EOL]     Year y2007 = new Year(2007); [EOL]     Date d0 = new Date(y2006.getFirstMillisecond()); [EOL]     Date d1 = new Date(y2006.getFirstMillisecond() + 500L); [EOL]     Date d2 = new Date(y2006.getMiddleMillisecond()); [EOL]     Date d3 = new Date(y2006.getMiddleMillisecond() + 500L); [EOL]     Date d4 = new Date(y2006.getLastMillisecond()); [EOL]     Date end = new Date(y2007.getLastMillisecond()); [EOL]     DateTickUnit unit = new DateTickUnit(DateTickUnitType.YEAR, 1); [EOL]     axis.setTickUnit(unit); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.START); [EOL]     axis.setRange(d0, end); [EOL]     Date psd = axis.previousStandardDate(d0, unit); [EOL]     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setRange(d2, end); [EOL]     psd = axis.previousStandardDate(d2, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d2.getTime()); [EOL]     assertTrue(nsd.getTime() >= d2.getTime()); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setRange(d4, end); [EOL]     psd = axis.previousStandardDate(d4, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d4.getTime()); [EOL]     assertTrue(nsd.getTime() >= d4.getTime()); [EOL] } <line_num>: 336,403
public void testPreviousStandardDateYearB() { [EOL]     MyDateAxis axis = new MyDateAxis("Year"); [EOL]     Year y2006 = new Year(2006); [EOL]     Year y2007 = new Year(2007); [EOL]     Date d0 = new Date(y2006.getFirstMillisecond()); [EOL]     Date d1 = new Date(y2006.getFirstMillisecond() + 500L); [EOL]     Date d2 = new Date(y2006.getMiddleMillisecond()); [EOL]     Date d3 = new Date(y2006.getMiddleMillisecond() + 500L); [EOL]     Date d4 = new Date(y2006.getLastMillisecond()); [EOL]     Date end = new Date(y2007.getLastMillisecond()); [EOL]     DateTickUnit unit = new DateTickUnit(DateTickUnitType.YEAR, 10); [EOL]     axis.setTickUnit(unit); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.START); [EOL]     axis.setRange(d0, end); [EOL]     Date psd = axis.previousStandardDate(d0, unit); [EOL]     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setRange(d2, end); [EOL]     psd = axis.previousStandardDate(d2, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d2.getTime()); [EOL]     assertTrue(nsd.getTime() >= d2.getTime()); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setRange(d4, end); [EOL]     psd = axis.previousStandardDate(d4, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d4.getTime()); [EOL]     assertTrue(nsd.getTime() >= d4.getTime()); [EOL] } <line_num>: 409,476
public void testPreviousStandardDateMonthA() { [EOL]     MyDateAxis axis = new MyDateAxis("Month"); [EOL]     Month nov2006 = new Month(11, 2006); [EOL]     Month dec2006 = new Month(12, 2006); [EOL]     Date d0 = new Date(nov2006.getFirstMillisecond()); [EOL]     Date d1 = new Date(nov2006.getFirstMillisecond() + 500L); [EOL]     Date d2 = new Date(nov2006.getMiddleMillisecond()); [EOL]     Date d3 = new Date(nov2006.getMiddleMillisecond() + 500L); [EOL]     Date d4 = new Date(nov2006.getLastMillisecond()); [EOL]     Date end = new Date(dec2006.getLastMillisecond()); [EOL]     DateTickUnit unit = new DateTickUnit(DateTickUnitType.MONTH, 1); [EOL]     axis.setTickUnit(unit); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.START); [EOL]     axis.setRange(d0, end); [EOL]     Date psd = axis.previousStandardDate(d0, unit); [EOL]     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setRange(d2, end); [EOL]     psd = axis.previousStandardDate(d2, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d2.getTime()); [EOL]     assertTrue(nsd.getTime() >= d2.getTime()); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setRange(d4, end); [EOL]     psd = axis.previousStandardDate(d4, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d4.getTime()); [EOL]     assertTrue(nsd.getTime() >= d4.getTime()); [EOL] } <line_num>: 482,549
public void testPreviousStandardDateMonthB() { [EOL]     MyDateAxis axis = new MyDateAxis("Month"); [EOL]     Month nov2006 = new Month(11, 2006); [EOL]     Month dec2006 = new Month(12, 2006); [EOL]     Date d0 = new Date(nov2006.getFirstMillisecond()); [EOL]     Date d1 = new Date(nov2006.getFirstMillisecond() + 500L); [EOL]     Date d2 = new Date(nov2006.getMiddleMillisecond()); [EOL]     Date d3 = new Date(nov2006.getMiddleMillisecond() + 500L); [EOL]     Date d4 = new Date(nov2006.getLastMillisecond()); [EOL]     Date end = new Date(dec2006.getLastMillisecond()); [EOL]     DateTickUnit unit = new DateTickUnit(DateTickUnitType.MONTH, 3); [EOL]     axis.setTickUnit(unit); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.START); [EOL]     axis.setRange(d0, end); [EOL]     Date psd = axis.previousStandardDate(d0, unit); [EOL]     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setRange(d2, end); [EOL]     psd = axis.previousStandardDate(d2, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d2.getTime()); [EOL]     assertTrue(nsd.getTime() >= d2.getTime()); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setRange(d4, end); [EOL]     psd = axis.previousStandardDate(d4, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d4.getTime()); [EOL]     assertTrue(nsd.getTime() >= d4.getTime()); [EOL] } <line_num>: 555,622
public void testPreviousStandardDateDayA() { [EOL]     MyDateAxis axis = new MyDateAxis("Day"); [EOL]     Day apr12007 = new Day(1, 4, 2007); [EOL]     Day apr22007 = new Day(2, 4, 2007); [EOL]     Date d0 = new Date(apr12007.getFirstMillisecond()); [EOL]     Date d1 = new Date(apr12007.getFirstMillisecond() + 500L); [EOL]     Date d2 = new Date(apr12007.getMiddleMillisecond()); [EOL]     Date d3 = new Date(apr12007.getMiddleMillisecond() + 500L); [EOL]     Date d4 = new Date(apr12007.getLastMillisecond()); [EOL]     Date end = new Date(apr22007.getLastMillisecond()); [EOL]     DateTickUnit unit = new DateTickUnit(DateTickUnitType.DAY, 1); [EOL]     axis.setTickUnit(unit); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.START); [EOL]     axis.setRange(d0, end); [EOL]     Date psd = axis.previousStandardDate(d0, unit); [EOL]     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setRange(d2, end); [EOL]     psd = axis.previousStandardDate(d2, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d2.getTime()); [EOL]     assertTrue(nsd.getTime() >= d2.getTime()); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setRange(d4, end); [EOL]     psd = axis.previousStandardDate(d4, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d4.getTime()); [EOL]     assertTrue(nsd.getTime() >= d4.getTime()); [EOL] } <line_num>: 628,695
public void testPreviousStandardDateDayB() { [EOL]     MyDateAxis axis = new MyDateAxis("Day"); [EOL]     Day apr12007 = new Day(1, 4, 2007); [EOL]     Day apr22007 = new Day(2, 4, 2007); [EOL]     Date d0 = new Date(apr12007.getFirstMillisecond()); [EOL]     Date d1 = new Date(apr12007.getFirstMillisecond() + 500L); [EOL]     Date d2 = new Date(apr12007.getMiddleMillisecond()); [EOL]     Date d3 = new Date(apr12007.getMiddleMillisecond() + 500L); [EOL]     Date d4 = new Date(apr12007.getLastMillisecond()); [EOL]     Date end = new Date(apr22007.getLastMillisecond()); [EOL]     DateTickUnit unit = new DateTickUnit(DateTickUnitType.DAY, 7); [EOL]     axis.setTickUnit(unit); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.START); [EOL]     axis.setRange(d0, end); [EOL]     Date psd = axis.previousStandardDate(d0, unit); [EOL]     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setRange(d2, end); [EOL]     psd = axis.previousStandardDate(d2, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d2.getTime()); [EOL]     assertTrue(nsd.getTime() >= d2.getTime()); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setRange(d4, end); [EOL]     psd = axis.previousStandardDate(d4, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d4.getTime()); [EOL]     assertTrue(nsd.getTime() >= d4.getTime()); [EOL] } <line_num>: 701,768
public void testPreviousStandardDateHourA() { [EOL]     MyDateAxis axis = new MyDateAxis("Hour"); [EOL]     Hour h0 = new Hour(12, 1, 4, 2007); [EOL]     Hour h1 = new Hour(13, 1, 4, 2007); [EOL]     Date d0 = new Date(h0.getFirstMillisecond()); [EOL]     Date d1 = new Date(h0.getFirstMillisecond() + 500L); [EOL]     Date d2 = new Date(h0.getMiddleMillisecond()); [EOL]     Date d3 = new Date(h0.getMiddleMillisecond() + 500L); [EOL]     Date d4 = new Date(h0.getLastMillisecond()); [EOL]     Date end = new Date(h1.getLastMillisecond()); [EOL]     DateTickUnit unit = new DateTickUnit(DateTickUnitType.HOUR, 1); [EOL]     axis.setTickUnit(unit); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.START); [EOL]     axis.setRange(d0, end); [EOL]     Date psd = axis.previousStandardDate(d0, unit); [EOL]     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setRange(d2, end); [EOL]     psd = axis.previousStandardDate(d2, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d2.getTime()); [EOL]     assertTrue(nsd.getTime() >= d2.getTime()); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setRange(d4, end); [EOL]     psd = axis.previousStandardDate(d4, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d4.getTime()); [EOL]     assertTrue(nsd.getTime() >= d4.getTime()); [EOL] } <line_num>: 774,841
public void testPreviousStandardDateHourB() { [EOL]     MyDateAxis axis = new MyDateAxis("Hour"); [EOL]     Hour h0 = new Hour(12, 1, 4, 2007); [EOL]     Hour h1 = new Hour(13, 1, 4, 2007); [EOL]     Date d0 = new Date(h0.getFirstMillisecond()); [EOL]     Date d1 = new Date(h0.getFirstMillisecond() + 500L); [EOL]     Date d2 = new Date(h0.getMiddleMillisecond()); [EOL]     Date d3 = new Date(h0.getMiddleMillisecond() + 500L); [EOL]     Date d4 = new Date(h0.getLastMillisecond()); [EOL]     Date end = new Date(h1.getLastMillisecond()); [EOL]     DateTickUnit unit = new DateTickUnit(DateTickUnitType.HOUR, 6); [EOL]     axis.setTickUnit(unit); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.START); [EOL]     axis.setRange(d0, end); [EOL]     Date psd = axis.previousStandardDate(d0, unit); [EOL]     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setRange(d2, end); [EOL]     psd = axis.previousStandardDate(d2, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d2.getTime()); [EOL]     assertTrue(nsd.getTime() >= d2.getTime()); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setRange(d4, end); [EOL]     psd = axis.previousStandardDate(d4, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d4.getTime()); [EOL]     assertTrue(nsd.getTime() >= d4.getTime()); [EOL] } <line_num>: 847,914
public void testPreviousStandardDateSecondA() { [EOL]     MyDateAxis axis = new MyDateAxis("Second"); [EOL]     Second s0 = new Second(58, 31, 12, 1, 4, 2007); [EOL]     Second s1 = new Second(59, 31, 12, 1, 4, 2007); [EOL]     Date d0 = new Date(s0.getFirstMillisecond()); [EOL]     Date d1 = new Date(s0.getFirstMillisecond() + 50L); [EOL]     Date d2 = new Date(s0.getMiddleMillisecond()); [EOL]     Date d3 = new Date(s0.getMiddleMillisecond() + 50L); [EOL]     Date d4 = new Date(s0.getLastMillisecond()); [EOL]     Date end = new Date(s1.getLastMillisecond()); [EOL]     DateTickUnit unit = new DateTickUnit(DateTickUnitType.SECOND, 1); [EOL]     axis.setTickUnit(unit); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.START); [EOL]     axis.setRange(d0, end); [EOL]     Date psd = axis.previousStandardDate(d0, unit); [EOL]     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setRange(d2, end); [EOL]     psd = axis.previousStandardDate(d2, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d2.getTime()); [EOL]     assertTrue(nsd.getTime() >= d2.getTime()); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setRange(d4, end); [EOL]     psd = axis.previousStandardDate(d4, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d4.getTime()); [EOL]     assertTrue(nsd.getTime() >= d4.getTime()); [EOL] } <line_num>: 920,987
public void testPreviousStandardDateSecondB() { [EOL]     MyDateAxis axis = new MyDateAxis("Second"); [EOL]     Second s0 = new Second(58, 31, 12, 1, 4, 2007); [EOL]     Second s1 = new Second(59, 31, 12, 1, 4, 2007); [EOL]     Date d0 = new Date(s0.getFirstMillisecond()); [EOL]     Date d1 = new Date(s0.getFirstMillisecond() + 50L); [EOL]     Date d2 = new Date(s0.getMiddleMillisecond()); [EOL]     Date d3 = new Date(s0.getMiddleMillisecond() + 50L); [EOL]     Date d4 = new Date(s0.getLastMillisecond()); [EOL]     Date end = new Date(s1.getLastMillisecond()); [EOL]     DateTickUnit unit = new DateTickUnit(DateTickUnitType.SECOND, 5); [EOL]     axis.setTickUnit(unit); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.START); [EOL]     axis.setRange(d0, end); [EOL]     Date psd = axis.previousStandardDate(d0, unit); [EOL]     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); [EOL]     axis.setRange(d1, end); [EOL]     psd = axis.previousStandardDate(d1, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d1.getTime()); [EOL]     assertTrue(nsd.getTime() >= d1.getTime()); [EOL]     axis.setRange(d2, end); [EOL]     psd = axis.previousStandardDate(d2, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d2.getTime()); [EOL]     assertTrue(nsd.getTime() >= d2.getTime()); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     axis.setRange(d3, end); [EOL]     psd = axis.previousStandardDate(d3, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d3.getTime()); [EOL]     assertTrue(nsd.getTime() >= d3.getTime()); [EOL]     axis.setRange(d4, end); [EOL]     psd = axis.previousStandardDate(d4, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d4.getTime()); [EOL]     assertTrue(nsd.getTime() >= d4.getTime()); [EOL] } <line_num>: 993,1060
public void testPreviousStandardDateMillisecondA() { [EOL]     MyDateAxis axis = new MyDateAxis("Millisecond"); [EOL]     Millisecond m0 = new Millisecond(458, 58, 31, 12, 1, 4, 2007); [EOL]     Millisecond m1 = new Millisecond(459, 58, 31, 12, 1, 4, 2007); [EOL]     Date d0 = new Date(m0.getFirstMillisecond()); [EOL]     Date end = new Date(m1.getLastMillisecond()); [EOL]     DateTickUnit unit = new DateTickUnit(DateTickUnitType.MILLISECOND, 1); [EOL]     axis.setTickUnit(unit); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.START); [EOL]     axis.setRange(d0, end); [EOL]     Date psd = axis.previousStandardDate(d0, unit); [EOL]     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); [EOL]     axis.setRange(d0, end); [EOL]     psd = axis.previousStandardDate(d0, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     axis.setRange(d0, end); [EOL]     psd = axis.previousStandardDate(d0, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL] } <line_num>: 1066,1103
public void testPreviousStandardDateMillisecondB() { [EOL]     MyDateAxis axis = new MyDateAxis("Millisecond"); [EOL]     Millisecond m0 = new Millisecond(458, 58, 31, 12, 1, 4, 2007); [EOL]     Millisecond m1 = new Millisecond(459, 58, 31, 12, 1, 4, 2007); [EOL]     Date d0 = new Date(m0.getFirstMillisecond()); [EOL]     Date end = new Date(m1.getLastMillisecond()); [EOL]     DateTickUnit unit = new DateTickUnit(DateTickUnitType.MILLISECOND, 10); [EOL]     axis.setTickUnit(unit); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.START); [EOL]     axis.setRange(d0, end); [EOL]     Date psd = axis.previousStandardDate(d0, unit); [EOL]     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); [EOL]     axis.setRange(d0, end); [EOL]     psd = axis.previousStandardDate(d0, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     axis.setRange(d0, end); [EOL]     psd = axis.previousStandardDate(d0, unit); [EOL]     nsd = unit.addToDate(psd, TimeZone.getDefault()); [EOL]     assertTrue(psd.getTime() < d0.getTime()); [EOL]     assertTrue(nsd.getTime() >= d0.getTime()); [EOL] } <line_num>: 1109,1146
public void testBug2201869() { [EOL]     TimeZone tz = TimeZone.getTimeZone("GMT"); [EOL]     GregorianCalendar c = new GregorianCalendar(tz, Locale.UK); [EOL]     DateAxis axis = new DateAxis("Date", tz, Locale.UK); [EOL]     SimpleDateFormat sdf = new SimpleDateFormat("d-MMM-yyyy", Locale.UK); [EOL]     sdf.setCalendar(c); [EOL]     axis.setTickUnit(new DateTickUnit(DateTickUnitType.MONTH, 1, sdf)); [EOL]     Day d1 = new Day(1, 3, 2008); [EOL]     d1.peg(c); [EOL]     Day d2 = new Day(30, 6, 2008); [EOL]     d2.peg(c); [EOL]     axis.setRange(d1.getStart(), d2.getEnd()); [EOL]     BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB); [EOL]     Graphics2D g2 = image.createGraphics(); [EOL]     Rectangle2D area = new Rectangle2D.Double(0.0, 0.0, 200, 100); [EOL]     axis.setTickMarkPosition(DateTickMarkPosition.END); [EOL]     List ticks = axis.refreshTicks(g2, new AxisState(), area, RectangleEdge.BOTTOM); [EOL]     assertEquals(3, ticks.size()); [EOL]     DateTick t1 = (DateTick) ticks.get(0); [EOL]     assertEquals("31-Mar-2008", t1.getText()); [EOL]     DateTick t2 = (DateTick) ticks.get(1); [EOL]     assertEquals("30-Apr-2008", t2.getText()); [EOL]     DateTick t3 = (DateTick) ticks.get(2); [EOL]     assertEquals("31-May-2008", t3.getText()); [EOL]     ticks = axis.refreshTicks(g2, new AxisState(), area, RectangleEdge.LEFT); [EOL]     assertEquals(3, ticks.size()); [EOL]     t1 = (DateTick) ticks.get(0); [EOL]     assertEquals("31-Mar-2008", t1.getText()); [EOL]     t2 = (DateTick) ticks.get(1); [EOL]     assertEquals("30-Apr-2008", t2.getText()); [EOL]     t3 = (DateTick) ticks.get(2); [EOL]     assertEquals("31-May-2008", t3.getText()); [EOL] } <line_num>: 1151,1188
