public TestBaseDateTimeField(String name) { [EOL]     super(name); [EOL] } <line_num>: 48,50
protected MockBaseDateTimeField() { [EOL]     super(DateTimeFieldType.secondOfMinute()); [EOL] } <line_num>: 519,521
protected MockBaseDateTimeField(DateTimeFieldType type) { [EOL]     super(type); [EOL] } <line_num>: 522,524
protected MockStandardBaseDateTimeField() { [EOL]     super(); [EOL] } <line_num>: 552,554
protected MockCountingDurationField(DurationFieldType type) { [EOL]     super(type); [EOL] } <line_num>: 569,571
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 40,42
public static TestSuite suite() { [EOL]     return new TestSuite(TestBaseDateTimeField.class); [EOL] } <line_num>: 44,46
protected void setUp() throws Exception { [EOL] } <line_num>: 52,53
protected void tearDown() throws Exception { [EOL] } <line_num>: 55,56
public void test_constructor() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); [EOL]     try { [EOL]         field = new MockBaseDateTimeField(null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 59,66
public void test_getType() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(DateTimeFieldType.secondOfDay()); [EOL]     assertEquals(DateTimeFieldType.secondOfDay(), field.getType()); [EOL] } <line_num>: 68,71
public void test_getName() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(DateTimeFieldType.secondOfDay()); [EOL]     assertEquals("secondOfDay", field.getName()); [EOL] } <line_num>: 73,76
public void test_toString() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(DateTimeFieldType.secondOfDay()); [EOL]     assertEquals("DateTimeField[secondOfDay]", field.toString()); [EOL] } <line_num>: 78,81
public void test_isSupported() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(true, field.isSupported()); [EOL] } <line_num>: 83,86
public void test_get() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(0, field.get(0)); [EOL]     assertEquals(1, field.get(60)); [EOL]     assertEquals(2, field.get(123)); [EOL] } <line_num>: 88,93
public void test_getAsText_long_Locale() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals("29", field.getAsText(60L * 29, Locale.ENGLISH)); [EOL]     assertEquals("29", field.getAsText(60L * 29, null)); [EOL] } <line_num>: 96,100
public void test_getAsText_long() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals("29", field.getAsText(60L * 29)); [EOL] } <line_num>: 102,105
public void test_getAsText_RP_int_Locale() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH)); [EOL]     assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null)); [EOL] } <line_num>: 107,111
public void test_getAsText_RP_Locale() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH)); [EOL]     assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null)); [EOL] } <line_num>: 113,117
public void test_getAsText_int_Locale() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals("80", field.getAsText(80, Locale.ENGLISH)); [EOL]     assertEquals("80", field.getAsText(80, null)); [EOL] } <line_num>: 119,123
public void test_getAsShortText_long_Locale() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH)); [EOL]     assertEquals("29", field.getAsShortText(60L * 29, null)); [EOL] } <line_num>: 126,130
public void test_getAsShortText_long() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals("29", field.getAsShortText(60L * 29)); [EOL] } <line_num>: 132,135
public void test_getAsShortText_RP_int_Locale() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH)); [EOL]     assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, null)); [EOL] } <line_num>: 137,141
public void test_getAsShortText_RP_Locale() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH)); [EOL]     assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null)); [EOL] } <line_num>: 143,147
public void test_getAsShortText_int_Locale() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals("80", field.getAsShortText(80, Locale.ENGLISH)); [EOL]     assertEquals("80", field.getAsShortText(80, null)); [EOL] } <line_num>: 149,153
public void test_add_long_int() { [EOL]     MockCountingDurationField.add_int = 0; [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(61, field.add(1L, 1)); [EOL]     assertEquals(1, MockCountingDurationField.add_int); [EOL] } <line_num>: 156,161
public void test_add_long_long() { [EOL]     MockCountingDurationField.add_long = 0; [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(61, field.add(1L, 1L)); [EOL]     assertEquals(1, MockCountingDurationField.add_long); [EOL] } <line_num>: 163,168
public void test_add_RP_int_intarray_int() { [EOL]     int[] values = new int[] { 10, 20, 30, 40 }; [EOL]     int[] expected = new int[] { 10, 20, 30, 40 }; [EOL]     BaseDateTimeField field = new MockStandardBaseDateTimeField(); [EOL]     int[] result = field.add(new TimeOfDay(), 2, values, 0); [EOL]     assertEquals(true, Arrays.equals(expected, result)); [EOL]     values = new int[] { 10, 20, 30, 40 }; [EOL]     expected = new int[] { 10, 20, 31, 40 }; [EOL]     result = field.add(new TimeOfDay(), 2, values, 1); [EOL]     assertEquals(true, Arrays.equals(expected, result)); [EOL]     values = new int[] { 10, 20, 30, 40 }; [EOL]     expected = new int[] { 10, 21, 0, 40 }; [EOL]     result = field.add(new TimeOfDay(), 2, values, 30); [EOL]     assertEquals(true, Arrays.equals(expected, result)); [EOL]     values = new int[] { 23, 59, 30, 40 }; [EOL]     try { [EOL]         field.add(new TimeOfDay(), 2, values, 30); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     values = new int[] { 10, 20, 30, 40 }; [EOL]     expected = new int[] { 10, 20, 29, 40 }; [EOL]     result = field.add(new TimeOfDay(), 2, values, -1); [EOL]     assertEquals(true, Arrays.equals(expected, result)); [EOL]     values = new int[] { 10, 20, 30, 40 }; [EOL]     expected = new int[] { 10, 19, 59, 40 }; [EOL]     result = field.add(new TimeOfDay(), 2, values, -31); [EOL]     assertEquals(true, Arrays.equals(expected, result)); [EOL]     values = new int[] { 0, 0, 30, 40 }; [EOL]     try { [EOL]         field.add(new TimeOfDay(), 2, values, -31); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     values = new int[] { 0, 0 }; [EOL]     try { [EOL]         field.add(new MockPartial(), 0, values, 1000); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     values = new int[] { 1, 0 }; [EOL]     try { [EOL]         field.add(new MockPartial(), 0, values, -1000); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 170,220
public void test_addWrapField_long_int() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(1029, field.addWrapField(60L * 29, 0)); [EOL]     assertEquals(1059, field.addWrapField(60L * 29, 30)); [EOL]     assertEquals(1000, field.addWrapField(60L * 29, 31)); [EOL] } <line_num>: 223,228
public void test_addWrapField_RP_int_intarray_int() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     int[] values = new int[] { 10, 20, 30, 40 }; [EOL]     int[] expected = new int[] { 10, 20, 30, 40 }; [EOL]     int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0); [EOL]     assertEquals(true, Arrays.equals(result, expected)); [EOL]     values = new int[] { 10, 20, 30, 40 }; [EOL]     expected = new int[] { 10, 20, 59, 40 }; [EOL]     result = field.addWrapField(new TimeOfDay(), 2, values, 29); [EOL]     assertEquals(true, Arrays.equals(result, expected)); [EOL]     values = new int[] { 10, 20, 30, 40 }; [EOL]     expected = new int[] { 10, 20, 0, 40 }; [EOL]     result = field.addWrapField(new TimeOfDay(), 2, values, 30); [EOL]     assertEquals(true, Arrays.equals(result, expected)); [EOL]     values = new int[] { 10, 20, 30, 40 }; [EOL]     expected = new int[] { 10, 20, 1, 40 }; [EOL]     result = field.addWrapField(new TimeOfDay(), 2, values, 31); [EOL]     assertEquals(true, Arrays.equals(result, expected)); [EOL] } <line_num>: 230,251
public void test_getDifference_long_long() { [EOL]     MockCountingDurationField.difference_long = 0; [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(30, field.getDifference(0L, 0L)); [EOL]     assertEquals(1, MockCountingDurationField.difference_long); [EOL] } <line_num>: 254,259
public void test_getDifferenceAsLong_long_long() { [EOL]     MockCountingDurationField.difference_long = 0; [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(30, field.getDifferenceAsLong(0L, 0L)); [EOL]     assertEquals(1, MockCountingDurationField.difference_long); [EOL] } <line_num>: 261,266
public void test_set_long_int() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(1000, field.set(0L, 0)); [EOL]     assertEquals(1029, field.set(0L, 29)); [EOL] } <line_num>: 269,273
public void test_set_RP_int_intarray_int() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     int[] values = new int[] { 10, 20, 30, 40 }; [EOL]     int[] expected = new int[] { 10, 20, 30, 40 }; [EOL]     int[] result = field.set(new TimeOfDay(), 2, values, 30); [EOL]     assertEquals(true, Arrays.equals(result, expected)); [EOL]     values = new int[] { 10, 20, 30, 40 }; [EOL]     expected = new int[] { 10, 20, 29, 40 }; [EOL]     result = field.set(new TimeOfDay(), 2, values, 29); [EOL]     assertEquals(true, Arrays.equals(result, expected)); [EOL]     values = new int[] { 10, 20, 30, 40 }; [EOL]     expected = new int[] { 10, 20, 30, 40 }; [EOL]     try { [EOL]         field.set(new TimeOfDay(), 2, values, 60); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     assertEquals(true, Arrays.equals(values, expected)); [EOL]     values = new int[] { 10, 20, 30, 40 }; [EOL]     expected = new int[] { 10, 20, 30, 40 }; [EOL]     try { [EOL]         field.set(new TimeOfDay(), 2, values, -1); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     assertEquals(true, Arrays.equals(values, expected)); [EOL] } <line_num>: 275,302
public void test_set_long_String_Locale() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(1000, field.set(0L, "0", null)); [EOL]     assertEquals(1029, field.set(0L, "29", Locale.ENGLISH)); [EOL] } <line_num>: 304,308
public void test_set_long_String() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(1000, field.set(0L, "0")); [EOL]     assertEquals(1029, field.set(0L, "29")); [EOL] } <line_num>: 310,314
public void test_set_RP_int_intarray_String_Locale() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     int[] values = new int[] { 10, 20, 30, 40 }; [EOL]     int[] expected = new int[] { 10, 20, 30, 40 }; [EOL]     int[] result = field.set(new TimeOfDay(), 2, values, "30", null); [EOL]     assertEquals(true, Arrays.equals(result, expected)); [EOL]     values = new int[] { 10, 20, 30, 40 }; [EOL]     expected = new int[] { 10, 20, 29, 40 }; [EOL]     result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH); [EOL]     assertEquals(true, Arrays.equals(result, expected)); [EOL]     values = new int[] { 10, 20, 30, 40 }; [EOL]     expected = new int[] { 10, 20, 30, 40 }; [EOL]     try { [EOL]         field.set(new TimeOfDay(), 2, values, "60", null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     assertEquals(true, Arrays.equals(values, expected)); [EOL]     values = new int[] { 10, 20, 30, 40 }; [EOL]     expected = new int[] { 10, 20, 30, 40 }; [EOL]     try { [EOL]         field.set(new TimeOfDay(), 2, values, "-1", null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     assertEquals(true, Arrays.equals(values, expected)); [EOL] } <line_num>: 316,343
public void test_convertText() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(0, field.convertText("0", null)); [EOL]     assertEquals(29, field.convertText("29", null)); [EOL]     try { [EOL]         field.convertText("2A", null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         field.convertText(null, null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 345,357
public void test_isLeap_long() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(false, field.isLeap(0L)); [EOL] } <line_num>: 364,367
public void test_getLeapAmount_long() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(0, field.getLeapAmount(0L)); [EOL] } <line_num>: 369,372
public void test_getLeapDurationField() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(null, field.getLeapDurationField()); [EOL] } <line_num>: 374,377
public void test_getMinimumValue() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(0, field.getMinimumValue()); [EOL] } <line_num>: 380,383
public void test_getMinimumValue_long() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(0, field.getMinimumValue(0L)); [EOL] } <line_num>: 385,388
public void test_getMinimumValue_RP() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(0, field.getMinimumValue(new TimeOfDay())); [EOL] } <line_num>: 390,393
public void test_getMinimumValue_RP_intarray() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(0, field.getMinimumValue(new TimeOfDay(), new int[4])); [EOL] } <line_num>: 395,398
public void test_getMaximumValue() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(59, field.getMaximumValue()); [EOL] } <line_num>: 400,403
public void test_getMaximumValue_long() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(59, field.getMaximumValue(0L)); [EOL] } <line_num>: 405,408
public void test_getMaximumValue_RP() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(59, field.getMaximumValue(new TimeOfDay())); [EOL] } <line_num>: 410,413
public void test_getMaximumValue_RP_intarray() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(59, field.getMaximumValue(new TimeOfDay(), new int[4])); [EOL] } <line_num>: 415,418
public int getMaximumValue() { [EOL]     return 5; [EOL] } <line_num>: 426,428
public int getMaximumValue() { [EOL]     return 555; [EOL] } <line_num>: 433,435
public int getMaximumValue() { [EOL]     return 5555; [EOL] } <line_num>: 440,442
public int getMaximumValue() { [EOL]     return -1; [EOL] } <line_num>: 447,449
public void test_getMaximumTextLength_Locale() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH)); [EOL]     field = new MockBaseDateTimeField() { [EOL]  [EOL]         public int getMaximumValue() { [EOL]             return 5; [EOL]         } [EOL]     }; [EOL]     assertEquals(1, field.getMaximumTextLength(Locale.ENGLISH)); [EOL]     field = new MockBaseDateTimeField() { [EOL]  [EOL]         public int getMaximumValue() { [EOL]             return 555; [EOL]         } [EOL]     }; [EOL]     assertEquals(3, field.getMaximumTextLength(Locale.ENGLISH)); [EOL]     field = new MockBaseDateTimeField() { [EOL]  [EOL]         public int getMaximumValue() { [EOL]             return 5555; [EOL]         } [EOL]     }; [EOL]     assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH)); [EOL]     field = new MockBaseDateTimeField() { [EOL]  [EOL]         public int getMaximumValue() { [EOL]             return -1; [EOL]         } [EOL]     }; [EOL]     assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH)); [EOL] } <line_num>: 421,452
public void test_getMaximumShortTextLength_Locale() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); [EOL] } <line_num>: 454,457
public void test_roundFloor_long() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(0L, field.roundFloor(0L)); [EOL]     assertEquals(0L, field.roundFloor(29L)); [EOL]     assertEquals(0L, field.roundFloor(30L)); [EOL]     assertEquals(0L, field.roundFloor(31L)); [EOL]     assertEquals(60L, field.roundFloor(60L)); [EOL] } <line_num>: 460,467
public void test_roundCeiling_long() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(0L, field.roundCeiling(0L)); [EOL]     assertEquals(60L, field.roundCeiling(29L)); [EOL]     assertEquals(60L, field.roundCeiling(30L)); [EOL]     assertEquals(60L, field.roundCeiling(31L)); [EOL]     assertEquals(60L, field.roundCeiling(60L)); [EOL] } <line_num>: 469,476
public void test_roundHalfFloor_long() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(0L, field.roundHalfFloor(0L)); [EOL]     assertEquals(0L, field.roundHalfFloor(29L)); [EOL]     assertEquals(0L, field.roundHalfFloor(30L)); [EOL]     assertEquals(60L, field.roundHalfFloor(31L)); [EOL]     assertEquals(60L, field.roundHalfFloor(60L)); [EOL] } <line_num>: 478,485
public void test_roundHalfCeiling_long() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(0L, field.roundHalfCeiling(0L)); [EOL]     assertEquals(0L, field.roundHalfCeiling(29L)); [EOL]     assertEquals(60L, field.roundHalfCeiling(30L)); [EOL]     assertEquals(60L, field.roundHalfCeiling(31L)); [EOL]     assertEquals(60L, field.roundHalfCeiling(60L)); [EOL] } <line_num>: 487,494
public void test_roundHalfEven_long() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(0L, field.roundHalfEven(0L)); [EOL]     assertEquals(0L, field.roundHalfEven(29L)); [EOL]     assertEquals(0L, field.roundHalfEven(30L)); [EOL]     assertEquals(60L, field.roundHalfEven(31L)); [EOL]     assertEquals(60L, field.roundHalfEven(60L)); [EOL]     assertEquals(60L, field.roundHalfEven(89L)); [EOL]     assertEquals(120L, field.roundHalfEven(90L)); [EOL]     assertEquals(120L, field.roundHalfEven(91L)); [EOL] } <line_num>: 496,506
public void test_remainder_long() { [EOL]     BaseDateTimeField field = new MockBaseDateTimeField(); [EOL]     assertEquals(0L, field.remainder(0L)); [EOL]     assertEquals(29L, field.remainder(29L)); [EOL]     assertEquals(30L, field.remainder(30L)); [EOL]     assertEquals(31L, field.remainder(31L)); [EOL]     assertEquals(0L, field.remainder(60L)); [EOL] } <line_num>: 508,515
public int get(long instant) { [EOL]     return (int) (instant / 60L); [EOL] } <line_num>: 525,527
public long set(long instant, int value) { [EOL]     return 1000 + value; [EOL] } <line_num>: 528,530
public DurationField getDurationField() { [EOL]     return new MockCountingDurationField(DurationFieldType.seconds()); [EOL] } <line_num>: 531,533
public DurationField getRangeDurationField() { [EOL]     return new MockCountingDurationField(DurationFieldType.minutes()); [EOL] } <line_num>: 534,536
public int getMinimumValue() { [EOL]     return 0; [EOL] } <line_num>: 537,539
public int getMaximumValue() { [EOL]     return 59; [EOL] } <line_num>: 540,542
public long roundFloor(long instant) { [EOL]     return (instant / 60L) * 60L; [EOL] } <line_num>: 543,545
public boolean isLenient() { [EOL]     return false; [EOL] } <line_num>: 546,548
public DurationField getDurationField() { [EOL]     return ISOChronology.getInstanceUTC().seconds(); [EOL] } <line_num>: 555,557
public DurationField getRangeDurationField() { [EOL]     return ISOChronology.getInstanceUTC().minutes(); [EOL] } <line_num>: 558,560
public boolean isPrecise() { [EOL]     return false; [EOL] } <line_num>: 572,574
public long getUnitMillis() { [EOL]     return 0; [EOL] } <line_num>: 575,577
public long getValueAsLong(long duration, long instant) { [EOL]     return 0; [EOL] } <line_num>: 578,580
public long getMillis(int value, long instant) { [EOL]     return 0; [EOL] } <line_num>: 581,583
public long getMillis(long value, long instant) { [EOL]     return 0; [EOL] } <line_num>: 584,586
public long add(long instant, int value) { [EOL]     add_int++; [EOL]     return instant + (value * 60L); [EOL] } <line_num>: 587,590
public long add(long instant, long value) { [EOL]     add_long++; [EOL]     return instant + (value * 60L); [EOL] } <line_num>: 591,594
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     difference_long++; [EOL]     return 30; [EOL] } <line_num>: 595,598
protected DateTimeField getField(int index, Chronology chrono) { [EOL]     if (index == 0) { [EOL]         return ISOChronology.getInstanceUTC().minuteOfHour(); [EOL]     } [EOL]     if (index == 1) { [EOL]         return ISOChronology.getInstanceUTC().millisOfSecond(); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 602,610
public int size() { [EOL]     return 2; [EOL] } <line_num>: 611,613
