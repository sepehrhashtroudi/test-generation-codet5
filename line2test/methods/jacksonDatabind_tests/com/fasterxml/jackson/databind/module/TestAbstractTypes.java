public MyString(String s) { [EOL]     value = s; [EOL] } <line_num>: 23,23
@Override [EOL] public char charAt(int index) { [EOL]     return value.charAt(index); [EOL] } <line_num>: 25,28
@Override [EOL] public int length() { [EOL]     return value.length(); [EOL] } <line_num>: 30,33
@Override [EOL] public CharSequence subSequence(int arg0, int arg1) { [EOL]     return this; [EOL] } <line_num>: 35,36
public void testCollectionDefaulting() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     SimpleModule mod = new SimpleModule("test", Version.unknownVersion()); [EOL]     mod.addAbstractTypeMapping(Collection.class, List.class); [EOL]     mod.addAbstractTypeMapping(List.class, LinkedList.class); [EOL]     mapper.registerModule(mod); [EOL]     Collection<?> result = mapper.readValue("[]", Collection.class); [EOL]     assertEquals(LinkedList.class, result.getClass()); [EOL] } <line_num>: 45,55
public void testMapDefaulting() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     SimpleModule mod = new SimpleModule("test", Version.unknownVersion()); [EOL]     mod.addAbstractTypeMapping(Map.class, TreeMap.class); [EOL]     mapper.registerModule(mod); [EOL]     Map<?, ?> result = mapper.readValue("{}", Map.class); [EOL]     assertEquals(TreeMap.class, result.getClass()); [EOL] } <line_num>: 57,66
public void testInterfaceDefaulting() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     SimpleModule mod = new SimpleModule("test", Version.unknownVersion()); [EOL]     mod.addAbstractTypeMapping(CharSequence.class, MyString.class); [EOL]     mapper.registerModule(mod); [EOL]     Object result = mapper.readValue(quote("abc"), CharSequence.class); [EOL]     assertEquals(MyString.class, result.getClass()); [EOL]     assertEquals("abc", ((MyString) result).value); [EOL] } <line_num>: 68,78