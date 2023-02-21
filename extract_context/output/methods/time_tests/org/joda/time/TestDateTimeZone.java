public TestDateTimeZone(String name) { [EOL]     super(name); [EOL] } <line_num>: 144,146
public MockDateTimeZone(String id) { [EOL]     super(id); [EOL] } <line_num>: 740,742
public PermissionCollection getPermissions(CodeSource codesource) { [EOL]     Permissions p = new Permissions(); [EOL]     p.add(new AllPermission()); [EOL]     return p; [EOL] } <line_num>: 107,111
public void refresh() { [EOL] } <line_num>: 112,113
public boolean implies(ProtectionDomain domain, Permission permission) { [EOL]     if (permission instanceof JodaTimePermission) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 114,120
public PermissionCollection getPermissions(CodeSource codesource) { [EOL]     Permissions p = new Permissions(); [EOL]     p.add(new AllPermission()); [EOL]     return p; [EOL] } <line_num>: 123,127
public void refresh() { [EOL] } <line_num>: 128,129
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 136,138
public static TestSuite suite() { [EOL]     return new TestSuite(TestDateTimeZone.class); [EOL] } <line_num>: 140,142
protected void setUp() throws Exception { [EOL]     locale = Locale.getDefault(); [EOL]     zone = DateTimeZone.getDefault(); [EOL]     Locale.setDefault(Locale.UK); [EOL] } <line_num>: 148,152
protected void tearDown() throws Exception { [EOL]     Locale.setDefault(locale); [EOL]     DateTimeZone.setDefault(zone); [EOL] } <line_num>: 154,157
public void testDefault() { [EOL]     assertNotNull(DateTimeZone.getDefault()); [EOL]     DateTimeZone.setDefault(PARIS); [EOL]     assertSame(PARIS, DateTimeZone.getDefault()); [EOL]     try { [EOL]         DateTimeZone.setDefault(null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 160,170
public void testDefaultSecurity() { [EOL]     if (OLD_JDK) { [EOL]         return; [EOL]     } [EOL]     try { [EOL]         Policy.setPolicy(RESTRICT); [EOL]         System.setSecurityManager(new SecurityManager()); [EOL]         DateTimeZone.setDefault(PARIS); [EOL]         fail(); [EOL]     } catch (SecurityException ex) { [EOL]     } finally { [EOL]         System.setSecurityManager(null); [EOL]         Policy.setPolicy(ALLOW); [EOL]     } [EOL] } <line_num>: 172,187
public void testForID_String() { [EOL]     assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID((String) null)); [EOL]     DateTimeZone zone = DateTimeZone.forID("Europe/London"); [EOL]     assertEquals("Europe/London", zone.getID()); [EOL]     zone = DateTimeZone.forID("UTC"); [EOL]     assertSame(DateTimeZone.UTC, zone); [EOL]     zone = DateTimeZone.forID("+00:00"); [EOL]     assertSame(DateTimeZone.UTC, zone); [EOL]     zone = DateTimeZone.forID("+00"); [EOL]     assertSame(DateTimeZone.UTC, zone); [EOL]     zone = DateTimeZone.forID("+01:23"); [EOL]     assertEquals("+01:23", zone.getID()); [EOL]     assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); [EOL]     zone = DateTimeZone.forID("-02:00"); [EOL]     assertEquals("-02:00", zone.getID()); [EOL]     assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); [EOL]     zone = DateTimeZone.forID("-07:05:34.0"); [EOL]     assertEquals("-07:05:34", zone.getID()); [EOL]     assertEquals((-7L * DateTimeConstants.MILLIS_PER_HOUR) + (-5L * DateTimeConstants.MILLIS_PER_MINUTE) + (-34L * DateTimeConstants.MILLIS_PER_SECOND), zone.getOffset(TEST_TIME_SUMMER)); [EOL]     try { [EOL]         DateTimeZone.forID("SST"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         DateTimeZone.forID("europe/london"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         DateTimeZone.forID("Europe/UK"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         DateTimeZone.forID("+"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         DateTimeZone.forID("+0"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 190,242
public void testForID_String_old() { [EOL]     Map<String, String> map = new LinkedHashMap<String, String>(); [EOL]     map.put("GMT", "UTC"); [EOL]     map.put("WET", "WET"); [EOL]     map.put("CET", "CET"); [EOL]     map.put("MET", "CET"); [EOL]     map.put("ECT", "CET"); [EOL]     map.put("EET", "EET"); [EOL]     map.put("MIT", "Pacific/Apia"); [EOL]     map.put("HST", "Pacific/Honolulu"); [EOL]     map.put("AST", "America/Anchorage"); [EOL]     map.put("PST", "America/Los_Angeles"); [EOL]     map.put("MST", "America/Denver"); [EOL]     map.put("PNT", "America/Phoenix"); [EOL]     map.put("CST", "America/Chicago"); [EOL]     map.put("EST", "America/New_York"); [EOL]     map.put("IET", "America/Indiana/Indianapolis"); [EOL]     map.put("PRT", "America/Puerto_Rico"); [EOL]     map.put("CNT", "America/St_Johns"); [EOL]     map.put("AGT", "America/Argentina/Buenos_Aires"); [EOL]     map.put("BET", "America/Sao_Paulo"); [EOL]     map.put("ART", "Africa/Cairo"); [EOL]     map.put("CAT", "Africa/Harare"); [EOL]     map.put("EAT", "Africa/Addis_Ababa"); [EOL]     map.put("NET", "Asia/Yerevan"); [EOL]     map.put("PLT", "Asia/Karachi"); [EOL]     map.put("IST", "Asia/Kolkata"); [EOL]     map.put("BST", "Asia/Dhaka"); [EOL]     map.put("VST", "Asia/Ho_Chi_Minh"); [EOL]     map.put("CTT", "Asia/Shanghai"); [EOL]     map.put("JST", "Asia/Tokyo"); [EOL]     map.put("ACT", "Australia/Darwin"); [EOL]     map.put("AET", "Australia/Sydney"); [EOL]     map.put("SST", "Pacific/Guadalcanal"); [EOL]     map.put("NST", "Pacific/Auckland"); [EOL]     for (String key : map.keySet()) { [EOL]         String value = map.get(key); [EOL]         TimeZone juZone = TimeZone.getTimeZone(key); [EOL]         DateTimeZone zone = DateTimeZone.forTimeZone(juZone); [EOL]         assertEquals(value, zone.getID()); [EOL]     } [EOL] } <line_num>: 244,289
public void testForOffsetHours_int() { [EOL]     assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0)); [EOL]     assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetHours(3)); [EOL]     assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHours(-2)); [EOL]     try { [EOL]         DateTimeZone.forOffsetHours(999999); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 292,300
public void testForOffsetHoursMinutes_int_int() { [EOL]     assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0)); [EOL]     assertEquals(DateTimeZone.forID("+23:59"), DateTimeZone.forOffsetHoursMinutes(23, 59)); [EOL]     assertEquals(DateTimeZone.forID("+02:15"), DateTimeZone.forOffsetHoursMinutes(2, 15)); [EOL]     assertEquals(DateTimeZone.forID("+02:00"), DateTimeZone.forOffsetHoursMinutes(2, 0)); [EOL]     try { [EOL]         DateTimeZone.forOffsetHoursMinutes(2, -15); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     assertEquals(DateTimeZone.forID("+00:15"), DateTimeZone.forOffsetHoursMinutes(0, 15)); [EOL]     assertEquals(DateTimeZone.forID("+00:00"), DateTimeZone.forOffsetHoursMinutes(0, 0)); [EOL]     assertEquals(DateTimeZone.forID("-00:15"), DateTimeZone.forOffsetHoursMinutes(0, -15)); [EOL]     assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHoursMinutes(-2, 0)); [EOL]     assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, -15)); [EOL]     assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, 15)); [EOL]     assertEquals(DateTimeZone.forID("-23:59"), DateTimeZone.forOffsetHoursMinutes(-23, 59)); [EOL]     try { [EOL]         DateTimeZone.forOffsetHoursMinutes(2, 60); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         DateTimeZone.forOffsetHoursMinutes(-2, 60); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         DateTimeZone.forOffsetHoursMinutes(24, 0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         DateTimeZone.forOffsetHoursMinutes(-24, 0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 303,339
public void testForOffsetMillis_int() { [EOL]     assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0)); [EOL]     assertEquals(DateTimeZone.forID("+23:59:59.999"), DateTimeZone.forOffsetMillis((24 * 60 * 60 * 1000) - 1)); [EOL]     assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetMillis(3 * 60 * 60 * 1000)); [EOL]     assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetMillis(-2 * 60 * 60 * 1000)); [EOL]     assertEquals(DateTimeZone.forID("-23:59:59.999"), DateTimeZone.forOffsetMillis((-24 * 60 * 60 * 1000) + 1)); [EOL]     assertEquals(DateTimeZone.forID("+04:45:17.045"), DateTimeZone.forOffsetMillis(4 * 60 * 60 * 1000 + 45 * 60 * 1000 + 17 * 1000 + 45)); [EOL] } <line_num>: 342,351
public void testForTimeZone_TimeZone() { [EOL]     assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone((TimeZone) null)); [EOL]     DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/London")); [EOL]     assertEquals("Europe/London", zone.getID()); [EOL]     assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC"))); [EOL]     zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("+00:00")); [EOL]     assertSame(DateTimeZone.UTC, zone); [EOL]     zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00")); [EOL]     assertSame(DateTimeZone.UTC, zone); [EOL]     zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00")); [EOL]     assertSame(DateTimeZone.UTC, zone); [EOL]     zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00")); [EOL]     assertSame(DateTimeZone.UTC, zone); [EOL]     zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+01:23")); [EOL]     assertEquals("+01:23", zone.getID()); [EOL]     assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); [EOL]     zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+1:23")); [EOL]     assertEquals("+01:23", zone.getID()); [EOL]     assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); [EOL]     zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-02:00")); [EOL]     assertEquals("-02:00", zone.getID()); [EOL]     assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); [EOL]     zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+2")); [EOL]     assertEquals("+02:00", zone.getID()); [EOL]     assertEquals((2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); [EOL]     zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST")); [EOL]     assertEquals("America/New_York", zone.getID()); [EOL] } <line_num>: 354,393
public void testTimeZoneConversion() { [EOL]     TimeZone jdkTimeZone = TimeZone.getTimeZone("GMT-10"); [EOL]     assertEquals("GMT-10:00", jdkTimeZone.getID()); [EOL]     DateTimeZone jodaTimeZone = DateTimeZone.forTimeZone(jdkTimeZone); [EOL]     assertEquals("-10:00", jodaTimeZone.getID()); [EOL]     assertEquals(jdkTimeZone.getRawOffset(), jodaTimeZone.getOffset(0L)); [EOL]     TimeZone convertedTimeZone = jodaTimeZone.toTimeZone(); [EOL]     assertEquals("GMT-10:00", jdkTimeZone.getID()); [EOL]     assertEquals(jdkTimeZone.getID(), convertedTimeZone.getID()); [EOL]     assertEquals(jdkTimeZone.getRawOffset(), convertedTimeZone.getRawOffset()); [EOL] } <line_num>: 395,408
public void testGetAvailableIDs() { [EOL]     assertTrue(DateTimeZone.getAvailableIDs().contains("UTC")); [EOL] } <line_num>: 411,413
public void testProvider() { [EOL]     try { [EOL]         assertNotNull(DateTimeZone.getProvider()); [EOL]         Provider provider = DateTimeZone.getProvider(); [EOL]         DateTimeZone.setProvider(null); [EOL]         assertEquals(provider.getClass(), DateTimeZone.getProvider().getClass()); [EOL]         try { [EOL]             DateTimeZone.setProvider(new MockNullIDSProvider()); [EOL]             fail(); [EOL]         } catch (IllegalArgumentException ex) { [EOL]         } [EOL]         try { [EOL]             DateTimeZone.setProvider(new MockEmptyIDSProvider()); [EOL]             fail(); [EOL]         } catch (IllegalArgumentException ex) { [EOL]         } [EOL]         try { [EOL]             DateTimeZone.setProvider(new MockNoUTCProvider()); [EOL]             fail(); [EOL]         } catch (IllegalArgumentException ex) { [EOL]         } [EOL]         try { [EOL]             DateTimeZone.setProvider(new MockBadUTCProvider()); [EOL]             fail(); [EOL]         } catch (IllegalArgumentException ex) { [EOL]         } [EOL]         Provider prov = new MockOKProvider(); [EOL]         DateTimeZone.setProvider(prov); [EOL]         assertSame(prov, DateTimeZone.getProvider()); [EOL]         assertEquals(2, DateTimeZone.getAvailableIDs().size()); [EOL]         assertTrue(DateTimeZone.getAvailableIDs().contains("UTC")); [EOL]         assertTrue(DateTimeZone.getAvailableIDs().contains("Europe/London")); [EOL]     } finally { [EOL]         DateTimeZone.setProvider(null); [EOL]         assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); [EOL]     } [EOL]     try { [EOL]         System.setProperty("org.joda.time.DateTimeZone.Provider", "org.joda.time.tz.UTCProvider"); [EOL]         DateTimeZone.setProvider(null); [EOL]         assertEquals(UTCProvider.class, DateTimeZone.getProvider().getClass()); [EOL]     } finally { [EOL]         System.getProperties().remove("org.joda.time.DateTimeZone.Provider"); [EOL]         DateTimeZone.setProvider(null); [EOL]         assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); [EOL]     } [EOL] } <line_num>: 416,461
public void testProvider_badClassName() { [EOL]     try { [EOL]         System.setProperty("org.joda.time.DateTimeZone.Provider", "xxx"); [EOL]         DateTimeZone.setProvider(null); [EOL]     } catch (RuntimeException ex) { [EOL]         assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); [EOL]     } finally { [EOL]         System.getProperties().remove("org.joda.time.DateTimeZone.Provider"); [EOL]         DateTimeZone.setProvider(null); [EOL]     } [EOL] } <line_num>: 463,475
public void testProviderSecurity() { [EOL]     if (OLD_JDK) { [EOL]         return; [EOL]     } [EOL]     try { [EOL]         Policy.setPolicy(RESTRICT); [EOL]         System.setSecurityManager(new SecurityManager()); [EOL]         DateTimeZone.setProvider(new MockOKProvider()); [EOL]         fail(); [EOL]     } catch (SecurityException ex) { [EOL]     } finally { [EOL]         System.setSecurityManager(null); [EOL]         Policy.setPolicy(ALLOW); [EOL]     } [EOL] } <line_num>: 477,492
public Set getAvailableIDs() { [EOL]     return null; [EOL] } <line_num>: 495,497
public DateTimeZone getZone(String id) { [EOL]     return null; [EOL] } <line_num>: 498,500
public Set getAvailableIDs() { [EOL]     return new HashSet(); [EOL] } <line_num>: 503,505
public DateTimeZone getZone(String id) { [EOL]     return null; [EOL] } <line_num>: 506,508
public Set getAvailableIDs() { [EOL]     Set set = new HashSet(); [EOL]     set.add("Europe/London"); [EOL]     return set; [EOL] } <line_num>: 511,515
public DateTimeZone getZone(String id) { [EOL]     return null; [EOL] } <line_num>: 516,518
public Set getAvailableIDs() { [EOL]     Set set = new HashSet(); [EOL]     set.add("UTC"); [EOL]     set.add("Europe/London"); [EOL]     return set; [EOL] } <line_num>: 521,526
public DateTimeZone getZone(String id) { [EOL]     return null; [EOL] } <line_num>: 527,529
public Set getAvailableIDs() { [EOL]     Set set = new HashSet(); [EOL]     set.add("UTC"); [EOL]     set.add("Europe/London"); [EOL]     return set; [EOL] } <line_num>: 532,537
public DateTimeZone getZone(String id) { [EOL]     return DateTimeZone.UTC; [EOL] } <line_num>: 538,540
public void testNameProvider() { [EOL]     try { [EOL]         assertNotNull(DateTimeZone.getNameProvider()); [EOL]         NameProvider provider = DateTimeZone.getNameProvider(); [EOL]         DateTimeZone.setNameProvider(null); [EOL]         assertEquals(provider.getClass(), DateTimeZone.getNameProvider().getClass()); [EOL]         provider = new MockOKButNullNameProvider(); [EOL]         DateTimeZone.setNameProvider(provider); [EOL]         assertSame(provider, DateTimeZone.getNameProvider()); [EOL]         assertEquals("+00:00", DateTimeZone.UTC.getShortName(TEST_TIME_SUMMER)); [EOL]         assertEquals("+00:00", DateTimeZone.UTC.getName(TEST_TIME_SUMMER)); [EOL]     } finally { [EOL]         DateTimeZone.setNameProvider(null); [EOL]     } [EOL]     try { [EOL]         System.setProperty("org.joda.time.DateTimeZone.NameProvider", "org.joda.time.tz.DefaultNameProvider"); [EOL]         DateTimeZone.setNameProvider(null); [EOL]         assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); [EOL]     } finally { [EOL]         System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider"); [EOL]         DateTimeZone.setNameProvider(null); [EOL]         assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); [EOL]     } [EOL] } <line_num>: 544,571
public void testNameProvider_badClassName() { [EOL]     try { [EOL]         System.setProperty("org.joda.time.DateTimeZone.NameProvider", "xxx"); [EOL]         DateTimeZone.setProvider(null); [EOL]     } catch (RuntimeException ex) { [EOL]         assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); [EOL]     } finally { [EOL]         System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider"); [EOL]         DateTimeZone.setProvider(null); [EOL]     } [EOL] } <line_num>: 573,585
public void testNameProviderSecurity() { [EOL]     if (OLD_JDK) { [EOL]         return; [EOL]     } [EOL]     try { [EOL]         Policy.setPolicy(RESTRICT); [EOL]         System.setSecurityManager(new SecurityManager()); [EOL]         DateTimeZone.setNameProvider(new MockOKButNullNameProvider()); [EOL]         fail(); [EOL]     } catch (SecurityException ex) { [EOL]     } finally { [EOL]         System.setSecurityManager(null); [EOL]         Policy.setPolicy(ALLOW); [EOL]     } [EOL] } <line_num>: 587,602
public String getShortName(Locale locale, String id, String nameKey) { [EOL]     return null; [EOL] } <line_num>: 605,607
public String getName(Locale locale, String id, String nameKey) { [EOL]     return null; [EOL] } <line_num>: 608,610
public String getNameKey(long instant) { [EOL]     return null; [EOL] } <line_num>: 619,621
public int getOffset(long instant) { [EOL]     return 0; [EOL] } <line_num>: 622,624
public int getStandardOffset(long instant) { [EOL]     return 0; [EOL] } <line_num>: 625,627
public boolean isFixed() { [EOL]     return false; [EOL] } <line_num>: 628,630
public long nextTransition(long instant) { [EOL]     return 0; [EOL] } <line_num>: 631,633
public long previousTransition(long instant) { [EOL]     return 0; [EOL] } <line_num>: 634,636
public boolean equals(Object object) { [EOL]     return false; [EOL] } <line_num>: 637,639
public void testConstructor() { [EOL]     assertEquals(1, DateTimeZone.class.getDeclaredConstructors().length); [EOL]     assertTrue(Modifier.isProtected(DateTimeZone.class.getDeclaredConstructors()[0].getModifiers())); [EOL]     try { [EOL]         new DateTimeZone(null) { [EOL]  [EOL]             public String getNameKey(long instant) { [EOL]                 return null; [EOL]             } [EOL]  [EOL]             public int getOffset(long instant) { [EOL]                 return 0; [EOL]             } [EOL]  [EOL]             public int getStandardOffset(long instant) { [EOL]                 return 0; [EOL]             } [EOL]  [EOL]             public boolean isFixed() { [EOL]                 return false; [EOL]             } [EOL]  [EOL]             public long nextTransition(long instant) { [EOL]                 return 0; [EOL]             } [EOL]  [EOL]             public long previousTransition(long instant) { [EOL]                 return 0; [EOL]             } [EOL]  [EOL]             public boolean equals(Object object) { [EOL]                 return false; [EOL]             } [EOL]         }; [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 614,642
public void testGetID() { [EOL]     DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); [EOL]     assertEquals("Europe/Paris", zone.getID()); [EOL] } <line_num>: 645,648
public void testGetNameKey() { [EOL]     DateTimeZone zone = DateTimeZone.forID("Europe/London"); [EOL]     assertEquals("BST", zone.getNameKey(TEST_TIME_SUMMER)); [EOL]     assertEquals("GMT", zone.getNameKey(TEST_TIME_WINTER)); [EOL] } <line_num>: 650,654
public void testGetShortName() { [EOL] } <line_num>: 667,667
public void testGetShortName_berlin() { [EOL] } <line_num>: 676,676
public void testGetShortNameProviderName() { [EOL]     assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, "Europe/London", "BST")); [EOL]     assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, null, "BST")); [EOL]     assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, "Europe/London", null)); [EOL]     assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, null, null)); [EOL] } <line_num>: 691,696
public void testGetShortNameNullKey() { [EOL]     DateTimeZone zone = new MockDateTimeZone("Europe/London"); [EOL]     assertEquals("Europe/London", zone.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH)); [EOL] } <line_num>: 698,701
public void testGetName() { [EOL] } <line_num>: 703,703
public void testGetName_berlin() { [EOL] } <line_num>: 712,712
public void testGetNameProviderName() { [EOL]     assertEquals(null, DateTimeZone.getNameProvider().getName(null, "Europe/London", "BST")); [EOL]     assertEquals(null, DateTimeZone.getNameProvider().getName(Locale.ENGLISH, null, "BST")); [EOL]     assertEquals(null, DateTimeZone.getNameProvider().getName(Locale.ENGLISH, "Europe/London", null)); [EOL]     assertEquals(null, DateTimeZone.getNameProvider().getName(null, null, null)); [EOL] } <line_num>: 727,732
public void testGetNameNullKey() { [EOL]     DateTimeZone zone = new MockDateTimeZone("Europe/London"); [EOL]     assertEquals("Europe/London", zone.getName(TEST_TIME_SUMMER, Locale.ENGLISH)); [EOL] } <line_num>: 734,737
public String getNameKey(long instant) { [EOL]     return null; [EOL] } <line_num>: 743,745
public int getOffset(long instant) { [EOL]     return 0; [EOL] } <line_num>: 746,748
public int getStandardOffset(long instant) { [EOL]     return 0; [EOL] } <line_num>: 749,751
public boolean isFixed() { [EOL]     return false; [EOL] } <line_num>: 752,754
public long nextTransition(long instant) { [EOL]     return 0; [EOL] } <line_num>: 755,757
public long previousTransition(long instant) { [EOL]     return 0; [EOL] } <line_num>: 758,760
public boolean equals(Object object) { [EOL]     return false; [EOL] } <line_num>: 761,763
public void testGetOffset_long() { [EOL]     DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); [EOL]     assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_SUMMER)); [EOL]     assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_WINTER)); [EOL]     assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_SUMMER)); [EOL]     assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_WINTER)); [EOL]     assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_SUMMER)); [EOL]     assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_WINTER)); [EOL]     assertEquals(false, zone.isStandardOffset(TEST_TIME_SUMMER)); [EOL]     assertEquals(true, zone.isStandardOffset(TEST_TIME_WINTER)); [EOL] } <line_num>: 767,780
public void testGetOffset_RI() { [EOL]     DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); [EOL]     assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_SUMMER))); [EOL]     assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_WINTER))); [EOL]     assertEquals(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset(null)); [EOL] } <line_num>: 782,788
public void testGetOffsetFixed() { [EOL]     DateTimeZone zone = DateTimeZone.forID("+01:00"); [EOL]     assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_SUMMER)); [EOL]     assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_WINTER)); [EOL]     assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_SUMMER)); [EOL]     assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_WINTER)); [EOL]     assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_SUMMER)); [EOL]     assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_WINTER)); [EOL]     assertEquals(true, zone.isStandardOffset(TEST_TIME_SUMMER)); [EOL]     assertEquals(true, zone.isStandardOffset(TEST_TIME_WINTER)); [EOL] } <line_num>: 790,803
public void testGetOffsetFixed_RI() { [EOL]     DateTimeZone zone = DateTimeZone.forID("+01:00"); [EOL]     assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_SUMMER))); [EOL]     assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_WINTER))); [EOL]     assertEquals(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset(null)); [EOL] } <line_num>: 805,811
public void testGetMillisKeepLocal() { [EOL]     long millisLondon = TEST_TIME_SUMMER; [EOL]     long millisParis = TEST_TIME_SUMMER - 1L * DateTimeConstants.MILLIS_PER_HOUR; [EOL]     assertEquals(millisLondon, LONDON.getMillisKeepLocal(LONDON, millisLondon)); [EOL]     assertEquals(millisParis, LONDON.getMillisKeepLocal(LONDON, millisParis)); [EOL]     assertEquals(millisLondon, PARIS.getMillisKeepLocal(PARIS, millisLondon)); [EOL]     assertEquals(millisParis, PARIS.getMillisKeepLocal(PARIS, millisParis)); [EOL]     assertEquals(millisParis, LONDON.getMillisKeepLocal(PARIS, millisLondon)); [EOL]     assertEquals(millisLondon, PARIS.getMillisKeepLocal(LONDON, millisParis)); [EOL]     DateTimeZone zone = DateTimeZone.getDefault(); [EOL]     try { [EOL]         DateTimeZone.setDefault(LONDON); [EOL]         assertEquals(millisLondon, PARIS.getMillisKeepLocal(null, millisParis)); [EOL]     } finally { [EOL]         DateTimeZone.setDefault(zone); [EOL]     } [EOL] } <line_num>: 814,833
public void testIsFixed() { [EOL]     DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); [EOL]     assertEquals(false, zone.isFixed()); [EOL]     assertEquals(true, DateTimeZone.UTC.isFixed()); [EOL] } <line_num>: 836,840
public void testTransitionFixed() { [EOL]     DateTimeZone zone = DateTimeZone.forID("+01:00"); [EOL]     assertEquals(TEST_TIME_SUMMER, zone.nextTransition(TEST_TIME_SUMMER)); [EOL]     assertEquals(TEST_TIME_WINTER, zone.nextTransition(TEST_TIME_WINTER)); [EOL]     assertEquals(TEST_TIME_SUMMER, zone.previousTransition(TEST_TIME_SUMMER)); [EOL]     assertEquals(TEST_TIME_WINTER, zone.previousTransition(TEST_TIME_WINTER)); [EOL] } <line_num>: 843,849
public void testIsLocalDateTimeGap_Berlin() { [EOL]     DateTimeZone zone = DateTimeZone.forID("Europe/Berlin"); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 0))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 59, 59, 99))); [EOL]     assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 0))); [EOL]     assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 30))); [EOL]     assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 59, 59, 99))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 3, 0))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 4, 0))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 1, 30))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 2, 30))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 3, 30))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 12, 24, 12, 34))); [EOL] } <line_num>: 886,900
public void testIsLocalDateTimeGap_NewYork() { [EOL]     DateTimeZone zone = DateTimeZone.forID("America/New_York"); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 1, 0))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 1, 59, 59, 99))); [EOL]     assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 0))); [EOL]     assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 30))); [EOL]     assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 59, 59, 99))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 3, 0))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 4, 0))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 11, 4, 0, 30))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 11, 4, 1, 30))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 11, 4, 2, 30))); [EOL]     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 12, 24, 12, 34))); [EOL] } <line_num>: 903,917
public void testToTimeZone() { [EOL]     DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); [EOL]     TimeZone tz = zone.toTimeZone(); [EOL]     assertEquals("Europe/Paris", tz.getID()); [EOL] } <line_num>: 920,924
public void testEqualsHashCode() { [EOL]     DateTimeZone zone1 = DateTimeZone.forID("Europe/Paris"); [EOL]     DateTimeZone zone2 = DateTimeZone.forID("Europe/Paris"); [EOL]     assertEquals(true, zone1.equals(zone1)); [EOL]     assertEquals(true, zone1.equals(zone2)); [EOL]     assertEquals(true, zone2.equals(zone1)); [EOL]     assertEquals(true, zone2.equals(zone2)); [EOL]     assertEquals(true, zone1.hashCode() == zone2.hashCode()); [EOL]     DateTimeZone zone3 = DateTimeZone.forID("Europe/London"); [EOL]     assertEquals(true, zone3.equals(zone3)); [EOL]     assertEquals(false, zone1.equals(zone3)); [EOL]     assertEquals(false, zone2.equals(zone3)); [EOL]     assertEquals(false, zone3.equals(zone1)); [EOL]     assertEquals(false, zone3.equals(zone2)); [EOL]     assertEquals(false, zone1.hashCode() == zone3.hashCode()); [EOL]     assertEquals(true, zone3.hashCode() == zone3.hashCode()); [EOL]     DateTimeZone zone4 = DateTimeZone.forID("+01:00"); [EOL]     assertEquals(true, zone4.equals(zone4)); [EOL]     assertEquals(false, zone1.equals(zone4)); [EOL]     assertEquals(false, zone2.equals(zone4)); [EOL]     assertEquals(false, zone3.equals(zone4)); [EOL]     assertEquals(false, zone4.equals(zone1)); [EOL]     assertEquals(false, zone4.equals(zone2)); [EOL]     assertEquals(false, zone4.equals(zone3)); [EOL]     assertEquals(false, zone1.hashCode() == zone4.hashCode()); [EOL]     assertEquals(true, zone4.hashCode() == zone4.hashCode()); [EOL]     DateTimeZone zone5 = DateTimeZone.forID("+02:00"); [EOL]     assertEquals(true, zone5.equals(zone5)); [EOL]     assertEquals(false, zone1.equals(zone5)); [EOL]     assertEquals(false, zone2.equals(zone5)); [EOL]     assertEquals(false, zone3.equals(zone5)); [EOL]     assertEquals(false, zone4.equals(zone5)); [EOL]     assertEquals(false, zone5.equals(zone1)); [EOL]     assertEquals(false, zone5.equals(zone2)); [EOL]     assertEquals(false, zone5.equals(zone3)); [EOL]     assertEquals(false, zone5.equals(zone4)); [EOL]     assertEquals(false, zone1.hashCode() == zone5.hashCode()); [EOL]     assertEquals(true, zone5.hashCode() == zone5.hashCode()); [EOL] } <line_num>: 927,968
public void testToString() { [EOL]     DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); [EOL]     assertEquals("Europe/Paris", zone.toString()); [EOL]     assertEquals("UTC", DateTimeZone.UTC.toString()); [EOL] } <line_num>: 971,975
public void testSerialization1() throws Exception { [EOL]     DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); [EOL]     ByteArrayOutputStream baos = new ByteArrayOutputStream(); [EOL]     ObjectOutputStream oos = new ObjectOutputStream(baos); [EOL]     oos.writeObject(zone); [EOL]     byte[] bytes = baos.toByteArray(); [EOL]     oos.close(); [EOL]     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); [EOL]     ObjectInputStream ois = new ObjectInputStream(bais); [EOL]     DateTimeZone result = (DateTimeZone) ois.readObject(); [EOL]     ois.close(); [EOL]     assertSame(zone, result); [EOL] } <line_num>: 978,993
public void testSerialization2() throws Exception { [EOL]     DateTimeZone zone = DateTimeZone.forID("+01:00"); [EOL]     ByteArrayOutputStream baos = new ByteArrayOutputStream(); [EOL]     ObjectOutputStream oos = new ObjectOutputStream(baos); [EOL]     oos.writeObject(zone); [EOL]     byte[] bytes = baos.toByteArray(); [EOL]     oos.close(); [EOL]     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); [EOL]     ObjectInputStream ois = new ObjectInputStream(bais); [EOL]     DateTimeZone result = (DateTimeZone) ois.readObject(); [EOL]     ois.close(); [EOL]     assertSame(zone, result); [EOL] } <line_num>: 996,1011
public void testCommentParse() throws Exception { [EOL]     DateTimeZone zone = DateTimeZone.forID("Europe/Athens"); [EOL]     DateTime dt = new DateTime(2005, 5, 5, 20, 10, 15, 0, zone); [EOL]     assertEquals(1115313015000L, dt.getMillis()); [EOL] } <line_num>: 1013,1020
public void testPatchedNameKeysLondon() throws Exception { [EOL]     DateTimeZone zone = DateTimeZone.forID("Europe/London"); [EOL]     DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0); [EOL]     String str1 = zone.getName(now.getMillis()); [EOL]     String str2 = zone.getName(now.plusMonths(6).getMillis()); [EOL]     assertEquals(false, str1.equals(str2)); [EOL] } <line_num>: 1022,1030
public void testPatchedNameKeysSydney() throws Exception { [EOL]     DateTimeZone zone = DateTimeZone.forID("Australia/Sydney"); [EOL]     DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0); [EOL]     String str1 = zone.getName(now.getMillis()); [EOL]     String str2 = zone.getName(now.plusMonths(6).getMillis()); [EOL]     assertEquals(false, str1.equals(str2)); [EOL] } <line_num>: 1032,1040
public void testPatchedNameKeysSydneyHistoric() throws Exception { [EOL]     DateTimeZone zone = DateTimeZone.forID("Australia/Sydney"); [EOL]     DateTime now = new DateTime(1996, 1, 1, 0, 0, 0, 0); [EOL]     String str1 = zone.getName(now.getMillis()); [EOL]     String str2 = zone.getName(now.plusMonths(6).getMillis()); [EOL]     assertEquals(false, str1.equals(str2)); [EOL] } <line_num>: 1042,1050
public void testPatchedNameKeysGazaHistoric() throws Exception { [EOL]     DateTimeZone zone = DateTimeZone.forID("Africa/Johannesburg"); [EOL]     DateTime now = new DateTime(1943, 1, 1, 0, 0, 0, 0); [EOL]     String str1 = zone.getName(now.getMillis()); [EOL]     String str2 = zone.getName(now.plusMonths(6).getMillis()); [EOL]     assertEquals(false, str1.equals(str2)); [EOL] } <line_num>: 1052,1060
