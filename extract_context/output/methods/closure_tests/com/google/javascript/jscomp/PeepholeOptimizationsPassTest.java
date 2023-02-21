@Override [EOL] public void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     super.enableLineNumberCheck(true); [EOL] } <line_num>: 36,40
@Override [EOL] public CompilerPass getProcessor(final Compiler compiler) { [EOL]     return new PeepholeOptimizationsPass(compiler, currentPeepholePasses.toArray(new AbstractPeepholeOptimization[currentPeepholePasses.size()])); [EOL] } <line_num>: 42,47
@Override [EOL] protected int getNumRepetitions() { [EOL]     return 1; [EOL] } <line_num>: 49,53
public void testEmptyPass() { [EOL]     currentPeepholePasses = ImmutableList.<AbstractPeepholeOptimization>of(); [EOL]     testSame("var x; var y;"); [EOL] } <line_num>: 59,63
@Override [EOL] public Node optimizeSubtree(Node node) { [EOL]     if (node.isName()) { [EOL]         visitationLog.add(node.getString() + "1"); [EOL]     } [EOL]     return node; [EOL] } <line_num>: 88,95
@Override [EOL] public Node optimizeSubtree(Node node) { [EOL]     if (node.isName()) { [EOL]         visitationLog.add(node.getString() + "2"); [EOL]     } [EOL]     return node; [EOL] } <line_num>: 100,107
public void testOptimizationOrder() { [EOL]     final List<String> visitationLog = Lists.newArrayList(); [EOL]     AbstractPeepholeOptimization note1Applied = new AbstractPeepholeOptimization() { [EOL]  [EOL]         @Override [EOL]         public Node optimizeSubtree(Node node) { [EOL]             if (node.isName()) { [EOL]                 visitationLog.add(node.getString() + "1"); [EOL]             } [EOL]             return node; [EOL]         } [EOL]     }; [EOL]     AbstractPeepholeOptimization note2Applied = new AbstractPeepholeOptimization() { [EOL]  [EOL]         @Override [EOL]         public Node optimizeSubtree(Node node) { [EOL]             if (node.isName()) { [EOL]                 visitationLog.add(node.getString() + "2"); [EOL]             } [EOL]             return node; [EOL]         } [EOL]     }; [EOL]     currentPeepholePasses = ImmutableList.<AbstractPeepholeOptimization>of(note1Applied, note2Applied); [EOL]     test("var x; var y", "var x; var y"); [EOL]     assertEquals(4, visitationLog.size()); [EOL]     assertEquals("x1", visitationLog.get(0)); [EOL]     assertEquals("x2", visitationLog.get(1)); [EOL]     assertEquals("y1", visitationLog.get(2)); [EOL]     assertEquals("y2", visitationLog.get(3)); [EOL] } <line_num>: 65,127
@Override [EOL] public Node optimizeSubtree(Node node) { [EOL]     if (node.isVar()) { [EOL]         Set<Node> nodesToRemove = Sets.newHashSet(); [EOL]         for (Node child : node.children()) { [EOL]             if ("x".equals(child.getString())) { [EOL]                 nodesToRemove.add(child); [EOL]             } [EOL]         } [EOL]         for (Node childToRemove : nodesToRemove) { [EOL]             node.removeChild(childToRemove); [EOL]             reportCodeChange(); [EOL]         } [EOL]     } [EOL]     return node; [EOL] } <line_num>: 135,153
@Override [EOL] public Node optimizeSubtree(Node node) { [EOL]     if (node.isName() && "x".equals(node.getString())) { [EOL]         node.getParent().removeChild(node); [EOL]         reportCodeChange(); [EOL]         return null; [EOL]     } [EOL]     return node; [EOL] } <line_num>: 162,172
@Override [EOL] public Node optimizeSubtree(Node node) { [EOL]     if (node.isName() && "x".equals(node.getString())) { [EOL]         Node parent = node.getParent(); [EOL]         if (parent.isVar()) { [EOL]             parent.getParent().removeChild(parent); [EOL]             reportCodeChange(); [EOL]             return null; [EOL]         } [EOL]     } [EOL]     return node; [EOL] } <line_num>: 181,192
@Override [EOL] public Node optimizeSubtree(Node node) { [EOL]     if (node.isName() && "y".equals(node.getString())) { [EOL]         Node replacement = Node.newString(Token.NAME, "x"); [EOL]         node.getParent().replaceChild(node, replacement); [EOL]         reportCodeChange(); [EOL]         return replacement; [EOL]     } [EOL]     return node; [EOL] } <line_num>: 200,211
public void testOptimizationRemovingSubtreeChild() { [EOL]     currentPeepholePasses = ImmutableList.<AbstractPeepholeOptimization>of(new RemoveNodesNamedXUnderVarOptimization()); [EOL]     test("var x,y;", "var y;"); [EOL]     test("var y,x;", "var y;"); [EOL]     test("var x,y,x;", "var y;"); [EOL] } <line_num>: 214,221
public void testOptimizationRemovingSubtree() { [EOL]     currentPeepholePasses = ImmutableList.<AbstractPeepholeOptimization>of(new RemoveNodesNamedXOptimization()); [EOL]     test("var x,y;", "var y;"); [EOL]     test("var y,x;", "var y;"); [EOL]     test("var x,y,x;", "var y;"); [EOL] } <line_num>: 223,230
public void testOptimizationRemovingSubtreeParent() { [EOL]     currentPeepholePasses = ImmutableList.<AbstractPeepholeOptimization>of(new RemoveParentVarsForNodesNamedX()); [EOL]     test("var x; var y", "var y"); [EOL] } <line_num>: 232,237
public void testOptimizationsRemoveParentAfterRemoveChild() { [EOL]     currentPeepholePasses = ImmutableList.<AbstractPeepholeOptimization>of(new RemoveNodesNamedXOptimization(), new RemoveParentVarsForNodesNamedX()); [EOL]     test("var x,y; var z;", "var y; var z;"); [EOL] } <line_num>: 243,249
public void testOptimizationReplacingNode() { [EOL]     currentPeepholePasses = ImmutableList.<AbstractPeepholeOptimization>of(new RenameYToX(), new RemoveParentVarsForNodesNamedX()); [EOL]     test("var y; var z;", "var z;"); [EOL] } <line_num>: 251,257