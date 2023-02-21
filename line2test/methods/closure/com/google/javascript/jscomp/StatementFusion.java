@Override [EOL] Node optimizeSubtree(Node n) { [EOL]     if (!n.getParent().isFunction() && canFuseIntoOneStatement(n)) { [EOL]         fuseIntoOneStatement(n); [EOL]         reportCodeChange(); [EOL]     } [EOL]     return n; [EOL] } <line_num>: 36,44
private boolean canFuseIntoOneStatement(Node block) { [EOL]     if (!block.isBlock()) { [EOL]         return false; [EOL]     } [EOL]     if (!block.hasChildren() || block.hasOneChild()) { [EOL]         return false; [EOL]     } [EOL]     Node last = block.getLastChild(); [EOL]     for (Node c = block.getFirstChild(); c != null; c = c.getNext()) { [EOL]         if (!c.isExprResult() && c != last) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     switch(last.getType()) { [EOL]         case Token.IF: [EOL]         case Token.THROW: [EOL]         case Token.SWITCH: [EOL]         case Token.EXPR_RESULT: [EOL]             return true; [EOL]         case Token.RETURN: [EOL]             return last.hasChildren(); [EOL]         case Token.FOR: [EOL]             return NodeUtil.isForIn(last) && !mayHaveSideEffects(last.getFirstChild()); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 46,83
private void fuseIntoOneStatement(Node block) { [EOL]     Node cur = block.removeFirstChild(); [EOL]     Node commaTree = cur.removeFirstChild(); [EOL]     while (block.hasMoreThanOneChild()) { [EOL]         Node next = block.removeFirstChild().removeFirstChild(); [EOL]         commaTree = fuseExpressionIntoExpression(commaTree, next); [EOL]     } [EOL]     Preconditions.checkState(block.hasOneChild()); [EOL]     Node last = block.getLastChild(); [EOL]     switch(last.getType()) { [EOL]         case Token.IF: [EOL]         case Token.RETURN: [EOL]         case Token.THROW: [EOL]         case Token.SWITCH: [EOL]         case Token.EXPR_RESULT: [EOL]             fuseExpresssonIntoFirstChild(commaTree, last); [EOL]             return; [EOL]         case Token.FOR: [EOL]             if (NodeUtil.isForIn(last)) { [EOL]                 fuseExpresssonIntoSecondChild(commaTree, last); [EOL]             } [EOL]             return; [EOL]         default: [EOL]             throw new IllegalStateException("Statement fusion missing."); [EOL]     } [EOL] } <line_num>: 85,119
private static Node fuseExpressionIntoExpression(Node exp1, Node exp2) { [EOL]     Node comma = new Node(Token.COMMA, exp1); [EOL]     comma.copyInformationFrom(exp2); [EOL]     if (exp2.isComma()) { [EOL]         Node leftMostChild = exp2; [EOL]         while (leftMostChild.isComma()) { [EOL]             leftMostChild = leftMostChild.getFirstChild(); [EOL]         } [EOL]         Node parent = leftMostChild.getParent(); [EOL]         comma.addChildToBack(leftMostChild.detachFromParent()); [EOL]         parent.addChildToFront(comma); [EOL]         return exp2; [EOL]     } else { [EOL]         comma.addChildToBack(exp2); [EOL]         return comma; [EOL]     } [EOL] } <line_num>: 122,142
private static void fuseExpresssonIntoFirstChild(Node exp, Node stmt) { [EOL]     Node val = stmt.removeFirstChild(); [EOL]     Node comma = fuseExpressionIntoExpression(exp, val); [EOL]     stmt.addChildToFront(comma); [EOL] } <line_num>: 144,148
private static void fuseExpresssonIntoSecondChild(Node exp, Node stmt) { [EOL]     Node val = stmt.removeChildAfter(stmt.getFirstChild()); [EOL]     Node comma = fuseExpressionIntoExpression(exp, val); [EOL]     stmt.addChildAfter(comma, stmt.getFirstChild()); [EOL] } <line_num>: 150,154
