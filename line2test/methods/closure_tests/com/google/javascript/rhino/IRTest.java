public void testEmpty() { [EOL]     testIR(IR.empty(), "EMPTY\n"); [EOL] } <line_num>: 50,52
public void testFunction() { [EOL]     testIR(IR.function(IR.name("hi"), IR.paramList(), IR.block()), "FUNCTION hi\n" + "    NAME hi\n" + "    PARAM_LIST\n" + "    BLOCK\n"); [EOL] } <line_num>: 54,60
public void testParamList() { [EOL]     testIR(IR.paramList(), "PARAM_LIST\n"); [EOL]     testIR(IR.paramList(IR.name("a"), IR.name("b")), "PARAM_LIST\n" + "    NAME a\n" + "    NAME b\n"); [EOL]     testIR(IR.paramList(Lists.newArrayList(IR.name("a"), IR.name("b"))), "PARAM_LIST\n" + "    NAME a\n" + "    NAME b\n"); [EOL] } <line_num>: 62,75
public void testBlock() { [EOL]     testIR(IR.block(), "BLOCK\n"); [EOL]     testIR(IR.block(IR.empty(), IR.empty()), "BLOCK\n" + "    EMPTY\n" + "    EMPTY\n"); [EOL]     testIR(IR.block(Lists.newArrayList(IR.empty(), IR.empty())), "BLOCK\n" + "    EMPTY\n" + "    EMPTY\n"); [EOL] } <line_num>: 77,90
public void testScript() { [EOL]     testIR(IR.script(), "SCRIPT\n"); [EOL]     testIR(IR.script(IR.empty(), IR.empty()), "SCRIPT\n" + "    EMPTY\n" + "    EMPTY\n"); [EOL]     testIR(IR.script(Lists.newArrayList(IR.empty(), IR.empty())), "SCRIPT\n" + "    EMPTY\n" + "    EMPTY\n"); [EOL] } <line_num>: 92,105
public void testScriptThrows() { [EOL]     boolean caught = false; [EOL]     try { [EOL]         IR.script(IR.returnNode()); [EOL]     } catch (IllegalStateException e) { [EOL]         caught = true; [EOL]     } [EOL]     assertTrue("expected exception was not seen", caught); [EOL] } <line_num>: 107,115
public void testVar() { [EOL]     testIR(IR.var(IR.name("a")), "VAR\n" + "    NAME a\n"); [EOL]     testIR(IR.var(IR.name("a"), IR.trueNode()), "VAR\n" + "    NAME a\n" + "        TRUE\n"); [EOL] } <line_num>: 117,126
public void testReturn() { [EOL]     testIR(IR.returnNode(), "RETURN\n"); [EOL]     testIR(IR.returnNode(IR.name("a")), "RETURN\n" + "    NAME a\n"); [EOL] } <line_num>: 128,135
public void testThrow() { [EOL]     testIR(IR.throwNode(IR.name("a")), "THROW\n" + "    NAME a\n"); [EOL] } <line_num>: 137,141
public void testExprResult() { [EOL]     testIR(IR.exprResult(IR.name("a")), "EXPR_RESULT\n" + "    NAME a\n"); [EOL] } <line_num>: 143,147
public void testIf() { [EOL]     testIR(IR.ifNode(IR.name("a"), IR.block()), "IF\n" + "    NAME a\n" + "    BLOCK\n"); [EOL]     testIR(IR.ifNode(IR.name("a"), IR.block(), IR.block()), "IF\n" + "    NAME a\n" + "    BLOCK\n" + "    BLOCK\n"); [EOL] } <line_num>: 149,160
public void testIssue727_1() { [EOL]     testIR(IR.tryFinally(IR.block(), IR.block()), "TRY\n" + "    BLOCK\n" + "    BLOCK\n" + "    BLOCK\n"); [EOL] } <line_num>: 162,171
public void testIssue727_2() { [EOL]     testIR(IR.tryCatch(IR.block(), IR.catchNode(IR.name("e"), IR.block())), "TRY\n" + "    BLOCK\n" + "    BLOCK\n" + "        CATCH\n" + "            NAME e\n" + "            BLOCK\n"); [EOL] } <line_num>: 173,186
public void testIssue727_3() { [EOL]     testIR(IR.tryCatchFinally(IR.block(), IR.catchNode(IR.name("e"), IR.block()), IR.block()), "TRY\n" + "    BLOCK\n" + "    BLOCK\n" + "        CATCH\n" + "            NAME e\n" + "            BLOCK\n" + "    BLOCK\n"); [EOL] } <line_num>: 188,201
private void testIR(Node node, String expectedStructure) { [EOL]     assertEquals(expectedStructure, node.toStringTree()); [EOL] } <line_num>: 203,205
