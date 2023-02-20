/*
 *
 * ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is Rhino code, released
 * May 6, 1999.
 *
 * The Initial Developer of the Original Code is
 * Netscape Communications Corporation.
 * Portions created by the Initial Developer are Copyright (C) 1997-1999
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *   Nick Santos
 *
 * Alternatively, the contents of this file may be used under the terms of
 * the GNU General Public License Version 2 or later (the "GPL"), in which
 * case the provisions of the GPL are applicable instead of those above. If
 * you wish to allow use of your version of this file only under the terms of
 * the GPL and not to allow others to use your version of this file under the
 * MPL, indicate your decision by deleting the provisions above and replacing
 * them with the notice and other provisions required by the GPL. If you do
 * not delete the provisions above, a recipient may use your version of this
 * file under either the MPL or the GPL.
 *
 * ***** END LICENSE BLOCK ***** */

package com.google.javascript.rhino;

import com.google.javascript.rhino.Node.NodeMismatch;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.testing.TestErrorReporter;

import junit.framework.TestCase;

public class NodeTest extends TestCase {
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testMergeExtract(int lineno, int charno) {
    int linecharno = Node.mergeLineCharNo(lineno, charno);
    assertEquals(lineno, Node.extractLineno(linecharno));
    assertEquals(charno, Node.extractCharno(linecharno));
  }

  

  // TODO(johnlenz): reenable this test.
  

  

  

  

  

  

  // Verify that annotations on cloned nodes are properly handled.
  

  

  

  

  

  

  

  private static Node getVarRef(String name) {
    return Node.newString(Token.NAME, name);
  }

  private static Node getAssignExpr(String name1, String name2) {
    return new Node(Token.ASSIGN, getVarRef(name1), getVarRef(name2));
  }

  private static Node getNode(String js) {
    /*
    Node root = parse("var a=(" + js + ");");
    Node expr = root.getFirstChild();
    Node var = expr.getFirstChild();
    return var.getFirstChild();
    */
    return null;
  }

  private static Node parse(String string) {
    /*
    CompilerEnvirons environment = new CompilerEnvirons();
    TestErrorReporter testErrorReporter = new TestErrorReporter(null, null);
    environment.setErrorReporter(testErrorReporter);
    environment.setParseJSDoc(true);
    Parser p = new Parser(environment, testErrorReporter);
    return p.parse(string, null, 0);
    */
    return null;
  }
}
