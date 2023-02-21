public IgnoreCajaProperties(AbstractCompiler compiler) { [EOL]     this.compiler = compiler; [EOL]     this.counter = 0; [EOL] } <line_num>: 43,46
@Override [EOL] public void process(Node externs, Node root) { [EOL]     NodeTraversal.traverse(compiler, root, new Traversal()); [EOL] } <line_num>: 48,51
@Override [EOL] public void visit(NodeTraversal t, Node n, Node parent) { [EOL]     if (n.isFor() && n.getChildCount() == 3) { [EOL]         Node body = n.getLastChild(); [EOL]         n.removeChild(body); [EOL]         Node key = n.getFirstChild(); [EOL]         n.removeChild(key); [EOL]         Node tmp = IR.name("JSCompiler_IgnoreCajaProperties_" + counter++); [EOL]         n.addChildToFront(IR.var(tmp)); [EOL]         Node assignment; [EOL]         Node ifBody; [EOL]         if (key.isVar()) { [EOL]             ifBody = IR.block(key, IR.exprResult(IR.assign(key.getFirstChild().cloneNode(), tmp.cloneTree())), body); [EOL]         } else { [EOL]             ifBody = IR.block(IR.exprResult(IR.assign(key, tmp.cloneTree())), body); [EOL]         } [EOL]         Node newBody = IR.block(IR.ifNode(IR.not(IR.call(IR.getprop(tmp.cloneTree(), IR.string("match")), IR.regexp(IR.string("___$")))), ifBody)); [EOL]         n.addChildToBack(newBody); [EOL]         compiler.reportCodeChange(); [EOL]     } [EOL] } <line_num>: 54,117
