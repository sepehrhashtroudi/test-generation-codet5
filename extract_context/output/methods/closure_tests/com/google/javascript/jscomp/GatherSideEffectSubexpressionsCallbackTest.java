public void testAndOr() throws Exception { [EOL]     Node andNode = getSideEffectsAndNode(); [EOL]     checkKeepSimplifiedShortCircuitExpr(andNode, ImmutableList.of("foo&&(bar=0)")); [EOL] } <line_num>: 34,38
public void testIllegalArgumentIfNotAndOr() throws Exception { [EOL]     Node nameNode = Node.newString(Token.NAME, "foo"); [EOL]     try { [EOL]         checkKeepSimplifiedShortCircuitExpr(nameNode, ImmutableList.<String>of()); [EOL]         fail("Expected exception"); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL] } <line_num>: 40,49
public void testIllegalArgumentIfNoSideEffectAndOr() throws Exception { [EOL]     Node andNode = getNoSideEffectsAndNode(); [EOL]     try { [EOL]         checkKeepSimplifiedShortCircuitExpr(andNode, ImmutableList.<String>of()); [EOL]         fail("Expected exception"); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL] } <line_num>: 51,60
public void testHook() throws Exception { [EOL]     Node hook = getSideEffectsHookNode(); [EOL]     checkKeepSimplifiedHookExpr(hook, true, true, ImmutableList.of("foo?bar=0:baz=0")); [EOL] } <line_num>: 62,69
public void testIllegalArgumentIfNotHook() throws Exception { [EOL]     Node nameNode = Node.newString(Token.NAME, "foo"); [EOL]     try { [EOL]         checkKeepSimplifiedHookExpr(nameNode, true, true, ImmutableList.<String>of()); [EOL]         fail("Expected exception"); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL] } <line_num>: 71,82
public void testIllegalArgumentIfNoSideEffectHook() throws Exception { [EOL]     Node hookNode = getNoSideEffectsHookNode(); [EOL]     try { [EOL]         checkKeepSimplifiedHookExpr(hookNode, true, true, ImmutableList.<String>of()); [EOL]         fail("Expected exception"); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL] } <line_num>: 84,95
public void testIllegalArgumentIfHookKeepNeitherBranch() throws Exception { [EOL]     Node hookNode = getSideEffectsHookNode(); [EOL]     try { [EOL]         checkKeepSimplifiedHookExpr(hookNode, false, false, ImmutableList.<String>of()); [EOL]         fail("Expected exception"); [EOL]     } catch (IllegalArgumentException e) { [EOL]     } [EOL] } <line_num>: 97,108
private Node getNoSideEffectsAndNode() { [EOL]     Node andNode = new Node(Token.AND); [EOL]     andNode.addChildToBack(Node.newString(Token.NAME, "foo")); [EOL]     andNode.addChildToBack(Node.newString(Token.NAME, "bar")); [EOL]     return andNode; [EOL] } <line_num>: 110,117
private Node getSideEffectsAndNode() { [EOL]     Node andNode = new Node(Token.AND); [EOL]     Node assign = new Node(Token.ASSIGN); [EOL]     assign.addChildToBack(Node.newString(Token.NAME, "bar")); [EOL]     assign.addChildToBack(Node.newNumber(0)); [EOL]     andNode.addChildToBack(Node.newString(Token.NAME, "foo")); [EOL]     andNode.addChildToBack(assign); [EOL]     return andNode; [EOL] } <line_num>: 119,130
private Node getNoSideEffectsHookNode() { [EOL]     Node hookNode = new Node(Token.HOOK); [EOL]     hookNode.addChildToBack(Node.newString(Token.NAME, "foo")); [EOL]     hookNode.addChildToBack(Node.newString(Token.NAME, "bar")); [EOL]     hookNode.addChildToBack(Node.newString(Token.NAME, "baz")); [EOL]     return hookNode; [EOL] } <line_num>: 132,140
private Node getSideEffectsHookNode() { [EOL]     Node hookNode = new Node(Token.HOOK); [EOL]     Node assign1 = new Node(Token.ASSIGN); [EOL]     assign1.addChildToBack(Node.newString(Token.NAME, "bar")); [EOL]     assign1.addChildToBack(Node.newNumber(0)); [EOL]     Node assign2 = new Node(Token.ASSIGN); [EOL]     assign2.addChildToBack(Node.newString(Token.NAME, "baz")); [EOL]     assign2.addChildToBack(Node.newNumber(0)); [EOL]     hookNode.addChildToBack(Node.newString(Token.NAME, "foo")); [EOL]     hookNode.addChildToBack(assign1); [EOL]     hookNode.addChildToBack(assign2); [EOL]     return hookNode; [EOL] } <line_num>: 142,158
private void checkKeepSimplifiedShortCircuitExpr(Node root, List<String> expected) { [EOL]     Compiler compiler = new Compiler(); [EOL]     List<Node> replacements = Lists.newArrayList(); [EOL]     GetReplacementSideEffectSubexpressions accumulator = new GetReplacementSideEffectSubexpressions(compiler, replacements); [EOL]     accumulator.keepSimplifiedShortCircuitExpression(root); [EOL]     List<String> actual = Lists.newArrayList(); [EOL]     for (Node replacement : replacements) { [EOL]         actual.add(compiler.toSource(replacement)); [EOL]     } [EOL]     assertEquals(expected, actual); [EOL] } <line_num>: 160,173
private void checkKeepSimplifiedHookExpr(Node root, boolean thenHasSideEffects, boolean elseHasSideEffects, List<String> expected) { [EOL]     Compiler compiler = new Compiler(); [EOL]     List<Node> replacements = Lists.newArrayList(); [EOL]     GetReplacementSideEffectSubexpressions accumulator = new GetReplacementSideEffectSubexpressions(compiler, replacements); [EOL]     accumulator.keepSimplifiedHookExpression(root, thenHasSideEffects, elseHasSideEffects); [EOL]     List<String> actual = Lists.newArrayList(); [EOL]     for (Node replacement : replacements) { [EOL]         actual.add(compiler.toSource(replacement)); [EOL]     } [EOL]     assertEquals(expected, actual); [EOL] } <line_num>: 175,191
