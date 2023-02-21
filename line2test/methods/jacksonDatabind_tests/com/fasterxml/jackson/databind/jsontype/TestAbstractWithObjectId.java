void addInstance(BaseInterfaceImpl instance) { [EOL]     myInstances.add(instance); [EOL] } <line_num>: 20,22
void add(T t) { [EOL]     myList.add(t); [EOL] } <line_num>: 30,32
int size() { [EOL]     return myList.size(); [EOL] } <line_num>: 34,36
public void testIssue877() throws Exception { [EOL]     BaseInterfaceImpl one = new BaseInterfaceImpl(); [EOL]     BaseInterfaceImpl two = new BaseInterfaceImpl(); [EOL]     one.addInstance(two); [EOL]     two.addInstance(one); [EOL]     ListWrapper<BaseInterfaceImpl> myList = new ListWrapper<BaseInterfaceImpl>(); [EOL]     myList.add(one); [EOL]     myList.add(two); [EOL]     ObjectMapper om = new ObjectMapper(); [EOL]     om.enableDefaultTypingAsProperty(ObjectMapper.DefaultTyping.NON_FINAL, "@class"); [EOL]     String json = om.writerWithDefaultPrettyPrinter().writeValueAsString(myList); [EOL]     ListWrapper<BaseInterfaceImpl> result; [EOL]     result = om.readValue(json, new TypeReference<ListWrapper<BaseInterfaceImpl>>() { [EOL]     }); [EOL]     assertNotNull(result); [EOL]     System.out.println("deserialised list size = " + result.size()); [EOL] } <line_num>: 39,67