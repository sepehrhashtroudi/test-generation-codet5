@Before [EOL] public void setUp() throws Exception { [EOL]     ToStringBuilder.setDefaultStyle(STYLE); [EOL] } <line_num>: 54,57
@After [EOL] public void tearDown() throws Exception { [EOL]     ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE); [EOL] } <line_num>: 59,62
@Test [EOL] public void testBlank() { [EOL]     assertEquals(baseStr + "[]", new ToStringBuilder(base).toString()); [EOL] } <line_num>: 66,69
@Test [EOL] public void testAppendSuper() { [EOL]     assertEquals(baseStr + "[]", new ToStringBuilder(base).appendSuper("Integer@8888[]").toString()); [EOL]     assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).appendSuper("Integer@8888[%NULL%]").toString()); [EOL]     assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[]").append("a", "hello").toString()); [EOL]     assertEquals(baseStr + "[%NULL%,a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[%NULL%]").append("a", "hello").toString()); [EOL]     assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString()); [EOL] } <line_num>: 71,79
@Test [EOL] public void testObject() { [EOL]     final Integer i3 = Integer.valueOf(3); [EOL]     final Integer i4 = Integer.valueOf(4); [EOL]     assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append((Object) null).toString()); [EOL]     assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(i3).toString()); [EOL]     assertEquals(baseStr + "[a=%NULL%]", new ToStringBuilder(base).append("a", (Object) null).toString()); [EOL]     assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", i3).toString()); [EOL]     assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString()); [EOL]     assertEquals(baseStr + "[a=%Integer%]", new ToStringBuilder(base).append("a", i3, false).toString()); [EOL]     assertEquals(baseStr + "[a=%SIZE=0%]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), false).toString()); [EOL]     assertEquals(baseStr + "[a=[]]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), true).toString()); [EOL]     assertEquals(baseStr + "[a=%SIZE=0%]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), false).toString()); [EOL]     assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), true).toString()); [EOL]     assertEquals(baseStr + "[a=%SIZE=0%]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString()); [EOL]     assertEquals(baseStr + "[a=[]]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString()); [EOL] } <line_num>: 81,97
@Test [EOL] public void testPerson() { [EOL]     final Person p = new Person(); [EOL]     p.name = "Suzy Queue"; [EOL]     p.age = 19; [EOL]     p.smoker = false; [EOL]     final String pBaseStr = "ToStringStyleTest.Person"; [EOL]     assertEquals(pBaseStr + "[name=Suzy Queue,age=19,smoker=false]", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString()); [EOL] } <line_num>: 99,107
@Test [EOL] public void testLong() { [EOL]     assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(3L).toString()); [EOL]     assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", 3L).toString()); [EOL]     assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString()); [EOL] } <line_num>: 109,114
@Test [EOL] public void testObjectArray() { [EOL]     Object[] array = new Object[] { null, base, new int[] { 3, 6 } }; [EOL]     assertEquals(baseStr + "[[%NULL%, 5, [3, 6]]]", new ToStringBuilder(base).append(array).toString()); [EOL]     assertEquals(baseStr + "[[%NULL%, 5, [3, 6]]]", new ToStringBuilder(base).append((Object) array).toString()); [EOL]     array = null; [EOL]     assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append(array).toString()); [EOL]     assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append((Object) array).toString()); [EOL] } <line_num>: 116,124
@Test [EOL] public void testLongArray() { [EOL]     long[] array = new long[] { 1, 2, -3, 4 }; [EOL]     assertEquals(baseStr + "[[1, 2, -3, 4]]", new ToStringBuilder(base).append(array).toString()); [EOL]     assertEquals(baseStr + "[[1, 2, -3, 4]]", new ToStringBuilder(base).append((Object) array).toString()); [EOL]     array = null; [EOL]     assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append(array).toString()); [EOL]     assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append((Object) array).toString()); [EOL] } <line_num>: 126,134
@Test [EOL] public void testLongArrayArray() { [EOL]     long[][] array = new long[][] { { 1, 2 }, null, { 5 } }; [EOL]     assertEquals(baseStr + "[[[1, 2], %NULL%, [5]]]", new ToStringBuilder(base).append(array).toString()); [EOL]     assertEquals(baseStr + "[[[1, 2], %NULL%, [5]]]", new ToStringBuilder(base).append((Object) array).toString()); [EOL]     array = null; [EOL]     assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append(array).toString()); [EOL]     assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append((Object) array).toString()); [EOL] } <line_num>: 136,144