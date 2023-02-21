public CtorBean(@JacksonInject String n, @JsonProperty("age") int a) { [EOL]     name = n; [EOL]     age = a; [EOL] } <line_num>: 41,45
public CtorBean2(@JacksonInject String n, @JacksonInject("number") Integer a) { [EOL]     name = n; [EOL]     age = a; [EOL] } <line_num>: 52,56
@JacksonInject [EOL] public void injectThird(long v) { [EOL]     third = v; [EOL] } <line_num>: 21,24
public void testSimple() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.setInjectableValues(new InjectableValues.Std().addValue(String.class, "stuffValue").addValue("myId", "xyz").addValue(Long.TYPE, Long.valueOf(37))); [EOL]     InjectedBean bean = mapper.readValue("{\"value\":3}", InjectedBean.class); [EOL]     assertEquals(3, bean.value); [EOL]     assertEquals("stuffValue", bean.stuff); [EOL]     assertEquals("xyz", bean.otherStuff); [EOL]     assertEquals(37L, bean.third); [EOL] } <line_num>: 65,78
public void testWithCtors() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.setInjectableValues(new InjectableValues.Std().addValue(String.class, "Bubba")); [EOL]     CtorBean bean = mapper.readValue("{\"age\":55}", CtorBean.class); [EOL]     assertEquals(55, bean.age); [EOL]     assertEquals("Bubba", bean.name); [EOL] } <line_num>: 80,89
public void testTwoInjectablesViaCreator() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.setInjectableValues(new InjectableValues.Std().addValue(String.class, "Bob").addValue("number", Integer.valueOf(13))); [EOL]     CtorBean2 bean = mapper.readValue("{ }", CtorBean2.class); [EOL]     assertEquals(Integer.valueOf(13), bean.age); [EOL]     assertEquals("Bob", bean.name); [EOL] } <line_num>: 92,102
public void testInvalidDup() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     try { [EOL]         mapper.readValue("{}", BadBean1.class); [EOL]     } catch (Exception e) { [EOL]         verifyException(e, "Duplicate injectable value"); [EOL]     } [EOL]     try { [EOL]         mapper.readValue("{}", BadBean2.class); [EOL]     } catch (Exception e) { [EOL]         verifyException(e, "Duplicate injectable value"); [EOL]     } [EOL] } <line_num>: 104,117
