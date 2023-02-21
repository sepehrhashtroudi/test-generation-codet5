public int getIdo() { [EOL]     return 13; [EOL] } <line_num>: 30,30
public String getNameo() { [EOL]     return "Bill"; [EOL] } <line_num>: 31,31
@Override [EOL] @JsonProperty("name") [EOL] public abstract String getNameo(); <line_num>: 35,37
@Override [EOL] @JsonProperty("id") [EOL] public abstract int getIdo(); <line_num>: 41,43
public void testMixinFieldInheritance() throws IOException { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.addMixInAnnotations(Beano.class, BeanoMixinSub.class); [EOL]     Map<String, Object> result; [EOL]     result = writeAndMap(mapper, new Beano()); [EOL]     assertEquals(2, result.size()); [EOL]     assertTrue(result.containsKey("id")); [EOL]     assertTrue(result.containsKey("name")); [EOL] } <line_num>: 52,61
public void testMixinMethodInheritance() throws IOException { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.addMixInAnnotations(Beano2.class, BeanoMixinSub2.class); [EOL]     Map<String, Object> result; [EOL]     result = writeAndMap(mapper, new Beano2()); [EOL]     assertEquals(2, result.size()); [EOL]     assertTrue(result.containsKey("id")); [EOL]     assertTrue(result.containsKey("name")); [EOL] } <line_num>: 63,72