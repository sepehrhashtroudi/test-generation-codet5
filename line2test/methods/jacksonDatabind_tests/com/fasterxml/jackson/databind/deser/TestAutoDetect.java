private PrivateBean() { [EOL] } <line_num>: 21,21
private PrivateBean(String a) { [EOL]     this.a = a; [EOL] } <line_num>: 23,23
public void testPrivateCtor() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     PrivateBean bean = m.readValue("\"abc\"", PrivateBean.class); [EOL]     assertEquals("abc", bean.a); [EOL]     m = new ObjectMapper(); [EOL]     VisibilityChecker<?> vc = m.getVisibilityChecker(); [EOL]     vc = vc.withCreatorVisibility(JsonAutoDetect.Visibility.PUBLIC_ONLY); [EOL]     m.setVisibilityChecker(vc); [EOL]     try { [EOL]         m.readValue("\"abc\"", PrivateBean.class); [EOL]         fail("Expected exception for missing constructor"); [EOL]     } catch (JsonProcessingException e) { [EOL]         verifyException(e, "no single-String constructor/factory"); [EOL]     } [EOL] } <line_num>: 32,51