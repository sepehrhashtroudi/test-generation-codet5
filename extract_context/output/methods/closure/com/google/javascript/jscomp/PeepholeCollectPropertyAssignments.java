@Override [EOL] Node optimizeSubtree(Node subtree) { [EOL]     if (!subtree.isScript() && !subtree.isBlock()) { [EOL]         return subtree; [EOL]     } [EOL]     boolean codeChanged = false; [EOL]     for (Node child = subtree.getFirstChild(); child != null; child = child.getNext()) { [EOL]         if (!child.isVar() && !NodeUtil.isExprAssign(child)) { [EOL]             continue; [EOL]         } [EOL]         if (!isPropertyAssignmentToName(child.getNext())) { [EOL]             continue; [EOL]         } [EOL]         Preconditions.checkState(child.hasOneChild()); [EOL]         Node name = getName(child); [EOL]         if (!name.isName()) { [EOL]             continue; [EOL]         } [EOL]         Node value = getValue(child); [EOL]         if (value == null || !isInterestingValue(value)) { [EOL]             continue; [EOL]         } [EOL]         Node propertyCandidate; [EOL]         while ((propertyCandidate = child.getNext()) != null) { [EOL]             if (!collectProperty(propertyCandidate, name.getString(), value)) { [EOL]                 break; [EOL]             } [EOL]             codeChanged = true; [EOL]         } [EOL]     } [EOL]     if (codeChanged) { [EOL]         reportCodeChange(); [EOL]     } [EOL]     return subtree; [EOL] } <line_num>: 35,82
private Node getName(Node n) { [EOL]     if (n.isVar()) { [EOL]         return n.getFirstChild(); [EOL]     } else if (NodeUtil.isExprAssign(n)) { [EOL]         return n.getFirstChild().getFirstChild(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 84,91
private Node getValue(Node n) { [EOL]     if (n.isVar()) { [EOL]         return n.getFirstChild().getFirstChild(); [EOL]     } else if (NodeUtil.isExprAssign(n)) { [EOL]         return n.getFirstChild().getLastChild(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 93,100
boolean isInterestingValue(Node n) { [EOL]     return n.isObjectLit() || n.isArrayLit(); [EOL] } <line_num>: 102,104
private boolean isPropertyAssignmentToName(Node propertyCandidate) { [EOL]     if (propertyCandidate == null) { [EOL]         return false; [EOL]     } [EOL]     if (!NodeUtil.isExprAssign(propertyCandidate)) { [EOL]         return false; [EOL]     } [EOL]     Node expr = propertyCandidate.getFirstChild(); [EOL]     Node lhs = expr.getFirstChild(); [EOL]     if (!NodeUtil.isGet(lhs)) { [EOL]         return false; [EOL]     } [EOL]     Node obj = lhs.getFirstChild(); [EOL]     if (!obj.isName()) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 106,128
private boolean collectProperty(Node propertyCandidate, String name, Node value) { [EOL]     if (!isPropertyAssignmentToName(propertyCandidate)) { [EOL]         return false; [EOL]     } [EOL]     Node lhs = propertyCandidate.getFirstChild().getFirstChild(); [EOL]     if (!name.equals(lhs.getFirstChild().getString())) { [EOL]         return false; [EOL]     } [EOL]     Node rhs = lhs.getNext(); [EOL]     if (mayHaveSideEffects(rhs) || NodeUtil.canBeSideEffected(rhs)) { [EOL]         return false; [EOL]     } [EOL]     if (!NodeUtil.isLiteralValue(rhs, true) && mightContainForwardReference(rhs, name)) { [EOL]         return false; [EOL]     } [EOL]     switch(value.getType()) { [EOL]         case Token.ARRAYLIT: [EOL]             if (!collectArrayProperty(value, propertyCandidate)) { [EOL]                 return false; [EOL]             } [EOL]             break; [EOL]         case Token.OBJECTLIT: [EOL]             if (!collectObjectProperty(value, propertyCandidate)) { [EOL]                 return false; [EOL]             } [EOL]             break; [EOL]         default: [EOL]             throw new IllegalStateException(); [EOL]     } [EOL]     return true; [EOL] } <line_num>: 130,169
private boolean collectArrayProperty(Node arrayLiteral, Node propertyCandidate) { [EOL]     Node assignment = propertyCandidate.getFirstChild(); [EOL]     final int sizeOfArrayAtStart = arrayLiteral.getChildCount(); [EOL]     int maxIndexAssigned = sizeOfArrayAtStart - 1; [EOL]     Node lhs = assignment.getFirstChild(); [EOL]     Node rhs = lhs.getNext(); [EOL]     if (!lhs.isGetElem()) { [EOL]         return false; [EOL]     } [EOL]     Node obj = lhs.getFirstChild(); [EOL]     Node property = obj.getNext(); [EOL]     if (!property.isNumber()) { [EOL]         return false; [EOL]     } [EOL]     double dindex = property.getDouble(); [EOL]     if (!(dindex >= 0) || Double.isInfinite(dindex) || dindex > 0x7fffffffL) { [EOL]         return false; [EOL]     } [EOL]     int index = (int) dindex; [EOL]     if (dindex != index) { [EOL]         return false; [EOL]     } [EOL]     if (maxIndexAssigned + 4 < index) { [EOL]         return false; [EOL]     } [EOL]     if (index > maxIndexAssigned) { [EOL]         while (maxIndexAssigned < index - 1) { [EOL]             Node emptyNode = IR.empty().srcref(arrayLiteral); [EOL]             arrayLiteral.addChildToBack(emptyNode); [EOL]             ++maxIndexAssigned; [EOL]         } [EOL]         arrayLiteral.addChildToBack(rhs.detachFromParent()); [EOL]     } else { [EOL]         Node currentValue = arrayLiteral.getChildAtIndex(index); [EOL]         if (!currentValue.isEmpty()) { [EOL]             return false; [EOL]         } [EOL]         arrayLiteral.replaceChild(currentValue, rhs.detachFromParent()); [EOL]     } [EOL]     propertyCandidate.detachFromParent(); [EOL]     return true; [EOL] } <line_num>: 172,226
private boolean collectObjectProperty(Node objectLiteral, Node propertyCandidate) { [EOL]     Node assignment = propertyCandidate.getFirstChild(); [EOL]     Node lhs = assignment.getFirstChild(), rhs = lhs.getNext(); [EOL]     Node obj = lhs.getFirstChild(); [EOL]     Node property = obj.getNext(); [EOL]     if (lhs.isGetElem() && (!property.isString() && !property.isNumber())) { [EOL]         return false; [EOL]     } [EOL]     String propertyName; [EOL]     if (property.isNumber()) { [EOL]         propertyName = NodeUtil.getStringValue(property); [EOL]     } else { [EOL]         propertyName = property.getString(); [EOL]     } [EOL]     Node newProperty = IR.stringKey(propertyName).copyInformationFrom(property); [EOL]     if (lhs.isGetElem()) { [EOL]         newProperty.setQuotedString(); [EOL]     } [EOL]     Node newValue = rhs.detachFromParent(); [EOL]     newProperty.addChildToBack(newValue); [EOL]     objectLiteral.addChildToBack(newProperty); [EOL]     propertyCandidate.detachFromParent(); [EOL]     return true; [EOL] } <line_num>: 228,261
private static boolean mightContainForwardReference(Node node, String varName) { [EOL]     if (node.isName()) { [EOL]         return varName.equals(node.getString()); [EOL]     } [EOL]     for (Node child = node.getFirstChild(); child != null; child = child.getNext()) { [EOL]         if (mightContainForwardReference(child, varName)) { [EOL]             return true; [EOL]         } [EOL]     } [EOL]     return false; [EOL] } <line_num>: 264,276