public ParamClassBean() { [EOL] } <line_num>: 48,48
public ParamClassBean(String name) { [EOL]     this.name = name; [EOL]     clazz = String.class; [EOL] } <line_num>: 49,52
@JsonCreator [EOL] public BooleanBean(@JsonProperty("ctor") Boolean foo) { [EOL]     ctor = foo; [EOL] } <line_num>: 61,64
public void testFile() throws Exception { [EOL]     File src = new File("/test").getAbsoluteFile(); [EOL]     String abs = src.getAbsolutePath(); [EOL]     String json = mapper.writeValueAsString(abs); [EOL]     File result = mapper.readValue(json, File.class); [EOL]     assertEquals(abs, result.getAbsolutePath()); [EOL]     final ObjectMapper mapper2 = new ObjectMapper(); [EOL]     mapper2.setVisibility(PropertyAccessor.CREATOR, Visibility.NONE); [EOL]     result = mapper2.readValue(json, File.class); [EOL]     assertEquals(abs, result.getAbsolutePath()); [EOL] } <line_num>: 78,95
public void testRegexps() throws IOException { [EOL]     final String PATTERN_STR = "abc:\\s?(\\d+)"; [EOL]     Pattern exp = Pattern.compile(PATTERN_STR); [EOL]     String json = mapper.writeValueAsString(exp); [EOL]     Pattern result = mapper.readValue(json, Pattern.class); [EOL]     assertEquals(exp.pattern(), result.pattern()); [EOL] } <line_num>: 97,107
public void testCurrency() throws IOException { [EOL]     Currency usd = Currency.getInstance("USD"); [EOL]     assertEquals(usd, new ObjectMapper().readValue(quote("USD"), Currency.class)); [EOL] } <line_num>: 109,113
public void testLocale() throws IOException { [EOL]     assertEquals(new Locale("en"), mapper.readValue(quote("en"), Locale.class)); [EOL]     assertEquals(new Locale("es", "ES"), mapper.readValue(quote("es_ES"), Locale.class)); [EOL]     assertEquals(new Locale("FI", "fi", "savo"), mapper.readValue(quote("fi_FI_savo"), Locale.class)); [EOL] } <line_num>: 118,123
public void testNullForPrimitives() throws IOException { [EOL]     PrimitivesBean bean = mapper.readValue("{\"intValue\":null, \"booleanValue\":null, \"doubleValue\":null}", PrimitivesBean.class); [EOL]     assertNotNull(bean); [EOL]     assertEquals(0, bean.intValue); [EOL]     assertEquals(false, bean.booleanValue); [EOL]     assertEquals(0.0, bean.doubleValue); [EOL]     bean = mapper.readValue("{\"byteValue\":null, \"longValue\":null, \"floatValue\":null}", PrimitivesBean.class); [EOL]     assertNotNull(bean); [EOL]     assertEquals((byte) 0, bean.byteValue); [EOL]     assertEquals(0L, bean.longValue); [EOL]     assertEquals(0.0f, bean.floatValue); [EOL]     final ObjectMapper mapper2 = new ObjectMapper(); [EOL]     mapper2.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, true); [EOL]     try { [EOL]         mapper2.readValue("{\"booleanValue\":null}", PrimitivesBean.class); [EOL]         fail("Expected failure for boolean + null"); [EOL]     } catch (JsonMappingException e) { [EOL]         verifyException(e, "Can not map JSON null into type boolean"); [EOL]     } [EOL]     try { [EOL]         mapper2.readValue("{\"byteValue\":null}", PrimitivesBean.class); [EOL]         fail("Expected failure for byte + null"); [EOL]     } catch (JsonMappingException e) { [EOL]         verifyException(e, "Can not map JSON null into type byte"); [EOL]     } [EOL]     try { [EOL]         mapper2.readValue("{\"charValue\":null}", PrimitivesBean.class); [EOL]         fail("Expected failure for char + null"); [EOL]     } catch (JsonMappingException e) { [EOL]         verifyException(e, "Can not map JSON null into type char"); [EOL]     } [EOL]     try { [EOL]         mapper2.readValue("{\"shortValue\":null}", PrimitivesBean.class); [EOL]         fail("Expected failure for short + null"); [EOL]     } catch (JsonMappingException e) { [EOL]         verifyException(e, "Can not map JSON null into type short"); [EOL]     } [EOL]     try { [EOL]         mapper2.readValue("{\"intValue\":null}", PrimitivesBean.class); [EOL]         fail("Expected failure for int + null"); [EOL]     } catch (JsonMappingException e) { [EOL]         verifyException(e, "Can not map JSON null into type int"); [EOL]     } [EOL]     try { [EOL]         mapper2.readValue("{\"longValue\":null}", PrimitivesBean.class); [EOL]         fail("Expected failure for long + null"); [EOL]     } catch (JsonMappingException e) { [EOL]         verifyException(e, "Can not map JSON null into type long"); [EOL]     } [EOL]     try { [EOL]         mapper2.readValue("{\"floatValue\":null}", PrimitivesBean.class); [EOL]         fail("Expected failure for float + null"); [EOL]     } catch (JsonMappingException e) { [EOL]         verifyException(e, "Can not map JSON null into type float"); [EOL]     } [EOL]     try { [EOL]         mapper2.readValue("{\"doubleValue\":null}", PrimitivesBean.class); [EOL]         fail("Expected failure for double + null"); [EOL]     } catch (JsonMappingException e) { [EOL]         verifyException(e, "Can not map JSON null into type double"); [EOL]     } [EOL] } <line_num>: 128,201
public void testCharSequence() throws IOException { [EOL]     CharSequence cs = mapper.readValue("\"abc\"", CharSequence.class); [EOL]     assertEquals(String.class, cs.getClass()); [EOL]     assertEquals("abc", cs.toString()); [EOL] } <line_num>: 206,211
public void testInetAddress() throws IOException { [EOL]     InetAddress address = mapper.readValue(quote("127.0.0.1"), InetAddress.class); [EOL]     assertEquals("127.0.0.1", address.getHostAddress()); [EOL]     final String HOST = "www.ning.com"; [EOL]     address = mapper.readValue(quote(HOST), InetAddress.class); [EOL]     assertEquals(HOST, address.getHostName()); [EOL] } <line_num>: 214,223
public void testClass() throws IOException { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     assertSame(String.class, mapper.readValue(quote("java.lang.String"), Class.class)); [EOL]     assertSame(Boolean.TYPE, mapper.readValue(quote("boolean"), Class.class)); [EOL]     assertSame(Byte.TYPE, mapper.readValue(quote("byte"), Class.class)); [EOL]     assertSame(Short.TYPE, mapper.readValue(quote("short"), Class.class)); [EOL]     assertSame(Character.TYPE, mapper.readValue(quote("char"), Class.class)); [EOL]     assertSame(Integer.TYPE, mapper.readValue(quote("int"), Class.class)); [EOL]     assertSame(Long.TYPE, mapper.readValue(quote("long"), Class.class)); [EOL]     assertSame(Float.TYPE, mapper.readValue(quote("float"), Class.class)); [EOL]     assertSame(Double.TYPE, mapper.readValue(quote("double"), Class.class)); [EOL]     assertSame(Void.TYPE, mapper.readValue(quote("void"), Class.class)); [EOL] } <line_num>: 226,241
public void testClassWithParams() throws IOException { [EOL]     String json = mapper.writeValueAsString(new ParamClassBean("Foobar")); [EOL]     ParamClassBean result = mapper.readValue(json, ParamClassBean.class); [EOL]     assertEquals("Foobar", result.name); [EOL]     assertSame(String.class, result.clazz); [EOL] } <line_num>: 244,251
public void testEmptyStringForWrappers() throws IOException { [EOL]     WrappersBean bean; [EOL]     bean = mapper.readValue("{\"booleanValue\":\"\"}", WrappersBean.class); [EOL]     assertNull(bean.booleanValue); [EOL]     bean = mapper.readValue("{\"byteValue\":\"\"}", WrappersBean.class); [EOL]     assertNull(bean.byteValue); [EOL]     bean = mapper.readValue("{\"charValue\":\"\"}", WrappersBean.class); [EOL]     assertNull(bean.charValue); [EOL]     bean = mapper.readValue("{\"shortValue\":\"\"}", WrappersBean.class); [EOL]     assertNull(bean.shortValue); [EOL]     bean = mapper.readValue("{\"intValue\":\"\"}", WrappersBean.class); [EOL]     assertNull(bean.intValue); [EOL]     bean = mapper.readValue("{\"longValue\":\"\"}", WrappersBean.class); [EOL]     assertNull(bean.longValue); [EOL]     bean = mapper.readValue("{\"floatValue\":\"\"}", WrappersBean.class); [EOL]     assertNull(bean.floatValue); [EOL]     bean = mapper.readValue("{\"doubleValue\":\"\"}", WrappersBean.class); [EOL]     assertNull(bean.doubleValue); [EOL] } <line_num>: 254,278
public void testEmptyStringForPrimitives() throws IOException { [EOL]     PrimitivesBean bean; [EOL]     bean = mapper.readValue("{\"booleanValue\":\"\"}", PrimitivesBean.class); [EOL]     assertFalse(bean.booleanValue); [EOL]     bean = mapper.readValue("{\"byteValue\":\"\"}", PrimitivesBean.class); [EOL]     assertEquals((byte) 0, bean.byteValue); [EOL]     bean = mapper.readValue("{\"charValue\":\"\"}", PrimitivesBean.class); [EOL]     assertEquals((char) 0, bean.charValue); [EOL]     bean = mapper.readValue("{\"shortValue\":\"\"}", PrimitivesBean.class); [EOL]     assertEquals((short) 0, bean.shortValue); [EOL]     bean = mapper.readValue("{\"intValue\":\"\"}", PrimitivesBean.class); [EOL]     assertEquals(0, bean.intValue); [EOL]     bean = mapper.readValue("{\"longValue\":\"\"}", PrimitivesBean.class); [EOL]     assertEquals(0L, bean.longValue); [EOL]     bean = mapper.readValue("{\"floatValue\":\"\"}", PrimitivesBean.class); [EOL]     assertEquals(0.0f, bean.floatValue); [EOL]     bean = mapper.readValue("{\"doubleValue\":\"\"}", PrimitivesBean.class); [EOL]     assertEquals(0.0, bean.doubleValue); [EOL] } <line_num>: 282,301
public void testUntypedWithJsonArrays() throws Exception { [EOL]     Object ob = mapper.readValue("[1]", Object.class); [EOL]     assertTrue(ob instanceof List<?>); [EOL]     mapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true); [EOL]     ob = mapper.readValue("[1]", Object.class); [EOL]     assertEquals(Object[].class, ob.getClass()); [EOL] } <line_num>: 305,315
public void testLongToBoolean() throws Exception { [EOL]     long value = 1L + Integer.MAX_VALUE; [EOL]     BooleanBean b = mapper.readValue("{\"primitive\" : " + value + ", \"wrapper\":" + value + ", \"ctor\":" + value + "}", BooleanBean.class); [EOL]     assertEquals(Boolean.TRUE, b.wrapper); [EOL]     assertTrue(b.primitive); [EOL]     assertEquals(Boolean.TRUE, b.ctor); [EOL] } <line_num>: 318,326
public void testCharset() throws Exception { [EOL]     Charset UTF8 = Charset.forName("UTF-8"); [EOL]     assertSame(UTF8, mapper.readValue(quote("UTF-8"), Charset.class)); [EOL] } <line_num>: 329,333
public void testStackTraceElement() throws Exception { [EOL]     StackTraceElement elem = null; [EOL]     try { [EOL]         throw new IllegalStateException(); [EOL]     } catch (Exception e) { [EOL]         elem = e.getStackTrace()[0]; [EOL]     } [EOL]     String json = mapper.writeValueAsString(elem); [EOL]     StackTraceElement back = mapper.readValue(json, StackTraceElement.class); [EOL]     assertEquals("testStackTraceElement", back.getMethodName()); [EOL]     assertEquals(elem.getLineNumber(), back.getLineNumber()); [EOL]     assertEquals(elem.getClassName(), back.getClassName()); [EOL]     assertEquals(elem.isNativeMethod(), back.isNativeMethod()); [EOL]     assertTrue(back.getClassName().endsWith("TestJdkTypes")); [EOL]     assertFalse(back.isNativeMethod()); [EOL] } <line_num>: 336,353