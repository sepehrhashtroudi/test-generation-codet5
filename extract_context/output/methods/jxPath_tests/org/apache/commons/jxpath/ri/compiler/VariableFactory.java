public boolean createObject(JXPathContext context, Pointer pointer, Object parent, String name, int index) { [EOL]     if (name.equals("testArray")) { [EOL]         ((TestBean[]) parent)[index] = new TestBean(); [EOL]         return true; [EOL]     } else if (name.equals("stringArray")) { [EOL]         ((String[]) parent)[index] = ""; [EOL]         return true; [EOL]     } else if (name.equals("array")) { [EOL]         ((String[]) parent)[index] = ""; [EOL]         return true; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 34,54
public boolean declareVariable(JXPathContext context, String name) { [EOL]     if (name.equals("test")) { [EOL]         context.getVariables().declareVariable(name, new TestBean()); [EOL]         return true; [EOL]     } else if (name.equals("testArray")) { [EOL]         context.getVariables().declareVariable(name, new TestBean[0]); [EOL]         return true; [EOL]     } else if (name.equals("stringArray")) { [EOL]         context.getVariables().declareVariable(name, new String[] { "Value1" }); [EOL]         return true; [EOL]     } [EOL]     context.getVariables().declareVariable(name, null); [EOL]     return true; [EOL] } <line_num>: 59,76
