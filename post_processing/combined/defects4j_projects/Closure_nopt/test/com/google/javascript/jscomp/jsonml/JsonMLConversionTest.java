/*
 * Copyright 2010 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.javascript.jscomp.jsonml;

import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerPass;
import com.google.javascript.jscomp.CompilerTestCase;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.jsonml.Writer;
import com.google.javascript.jscomp.jsonml.JsonML;
import com.google.javascript.jscomp.jsonml.JsonMLAst;
import com.google.javascript.jscomp.jsonml.JsonMLUtil;

import com.google.javascript.rhino.Node;

import com.google.caja.parser.js.JsonMLParser;

/**
 * Tests for parsing JsonML to AST and vice versa.
 * @author dhans@google.com (Daniel Hans)
 *
 */
public class JsonMLConversionTest extends CompilerTestCase {

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return null; // unused
  }

  @Override
  public void setUp() {
    enableEcmaScript5(true);
  }

  private void testJsonMLToAstConversion(String js) throws Exception {
    JsonML jsonml = JsonMLParser.parse(js);
    Node root = parseExpectedJs(js);
    Node ast = root.getFirstChild();
    Preconditions.checkState(ast.getType() == Token.SCRIPT);

    testJsonMLToAstConversion(ast, jsonml, js);
  }

  private void testJsonMLToAstConversion(Node astRoot, JsonML jsonmlRoot,
      String js) {
    Compiler compiler = new Compiler();
    JsonMLAst ast = new JsonMLAst(jsonmlRoot);
    Node resultAstRoot = ast.getAstRoot(compiler);

    String explanation = resultAstRoot.checkTreeEquals(astRoot);
    assertNull("JsonML -> AST converter returned incorect result for " + js
       + "\n" + explanation, explanation);
  }

  private void testAstToJsonMLConverstion(Node astRoot, JsonML jsonmlRoot,
      String js) {
    JsonML resultJsonMLRoot = (new Writer()).processAst(astRoot);
    String explanation = JsonMLUtil.compare(resultJsonMLRoot, jsonmlRoot);
    assertNull("AST -> JsonML converter returned incorrect result for " + js +
        "\n" + explanation, explanation);
  }

  private void testConversion(String js) throws Exception {
    JsonML jsonml = JsonMLParser.parse(js);
    Node root = parseExpectedJs(js);
    Node ast = root.getFirstChild();
    Preconditions.checkState(ast.getType() == Token.SCRIPT);

    testJsonMLToAstConversion(ast, jsonml, js);

    jsonml = JsonMLParser.parse(js);
    testAstToJsonMLConverstion(ast, jsonml, js);
  }

void testLabel1666() { String s1 = "s1"; String s2 = "s2"; String s3 = "s3"; String s4 = "s4"; String s5 = "s5"; String s6 = "s6"; String s7 = "s7"; String s8 = "s8"; String s9 = "s9"; String s10 = "s10"; String s11 = "s11"; String s12 = "s12"; String s13 = "s13"; String s14 = "s14"; String s15 = "s15"; String s16 = "16"; String s21 = "21"; String s22 = "22";
}

public void testValidateEmptyStmt1717() { String msg = "validateEmptyStmt"; assertEquals(msg, ""); }
void testName1730() { String s1 = "s1"; String s2 = "s2"; String s3 = "s3"; String s4 = "s4"; String s5 = "s5"; String s6 = "s6"; String s7 = "s7"; String s8 = "s8"; String s9 = "s9"; String s10 = "s10"; String s11 = "s11"; String s12 = "s12"; String s13 = "s13"; String s14 = "s14"; String s15 = "s15"; String s16 = "16"; String s21 = "21"; String s22 = "22";
}

void testProcessTwoArgExpr1750() { String oneArg = "oneArg"; String oneArg2 = "oneArg2"; String oneArg3 = "oneArg3"; String oneArg4 = "oneArg4"; String oneArg5 = "oneArg5"; String oneArg6 = "oneArg6"; String oneArg7 = "oneArg7"; String oneArg8 = "oneArg8"; String oneArg9 = "oneArg9"; String oneArg10 = "oneArg10"; String oneArg11 = "oneArg11"; String oneArg12 = "oneArg12"; String oneArg13 = "oneArg13"; String oneArg14 = "oneArg14";
}

void testObjectLiteral1781() { String s1 = "test1"; String s2 = "test2"; String s3 = "test3"; String s4 = "test4"; String s5 = "test5"; String s6 = "test6"; String s7 = "test7"; String s8 = "test8"; String s9 = "test9"; String s10 = "test10"; String s11 = "test11"; String s12 = "test12"; String s13 = "test13"; String s14 = "test14"; String s15 = "test15"; String s16 = "test16"; String s16_1 = "test16_1";
}

void testProcessChildren1838() { String s1 = "test1"; String s2 = "test2"; String s3 = "test3"; String s4 = "test4"; String s5 = "test5"; String s6 = "test6"; String s7 = "test7"; String s8 = "test8"; String s9 = "test9"; String s10 = "test10"; String s11 = "test11"; String s12 = "test12"; String s13 = "test13"; String s14 = "test14"; String s15 = "test15"; String s16 = "test16"; String s16_1 = "test16_1";
}

public void testValidateFunction1880() { }
void testProcessEmpty1933() { String s1 = "empty"; String s2 = "1"; String s3 = "2"; String s4 = "3"; String s5 = "4"; String s6 = "5"; String s7 = "6"; String s8 = "8"; String s9 = "9"; String s10 = "10"; String s11 = "11"; String s12 = "12"; String s13 = "13"; String s14 = "14"; String s15 = "15"; String s16 = "16"; String s17 = "17"; String s18 = "18"; String s19 = "19"; String s20 = "20";
}

void testProcessEmpty1939() { String s1 = "value1"; String s2 = "value2"; String s3 = "value3"; String s4 = "value4"; String s5 = "value5"; String s6 = "value6"; String s7 = "value7"; String s8 = "value8"; String s9 = "value9"; String s10 = "value10"; String s11 = "value11"; String s12 = "value12"; String s13 = "value13"; String s14 = "value14"; String s15 = "value15"; String s16 = "value16"; String s16_1 = "value16_1";
}

void testProcessDirectives1944() { String s1 = "sub1"; String s2 = "sub2"; String s3 = "sub3"; String s4 = "sub4"; String s5 = "sub5"; String s6 = "sub6"; String s7 = "sub7"; String s8 = "sub8"; String s9 = "sub9"; String s10 = "sub10"; String s11 = "sub11"; String s12 = "sub12"; String s13 = "sub13"; String s14 = "sub14"; String s15 = "sub15"; String s16 = "sub16"; String s16_1 = "sub16_1";
}

void testProcessLiteral2022() { String s1 = "1"; String s2 = "2"; String s3 = "3"; String s4 = "4"; String s5 = "5"; String s6 = "6"; String s7 = "7"; String s8 = "8"; String s9 = "9"; String s10 = "10"; String s11 = "11"; String s12 = "12"; String s13 = "13"; String s14 = "14"; String s15 = "15"; String s16 = "16"; String s17 = "17"; String s18 = "18"; String s19 = "19"; String s20 = "20";
}

public void testDoValidate2077() throws Exception { }
public void testValidateJmpStmt2130() { String msg = "validateJmpStmt"; assertEquals(msg, "Success"); }
  

  

  

  

  
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
