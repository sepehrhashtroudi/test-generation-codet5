/*
 * Copyright 2011 The Closure Compiler Authors.
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

package com.google.javascript.jscomp;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.SymbolTable.Reference;
import com.google.javascript.jscomp.SymbolTable.Symbol;
import com.google.javascript.jscomp.SymbolTable.SymbolScope;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Token;

import junit.framework.TestCase;

import java.util.List;
import java.util.Set;

/**
 * @author nicksantos@google.com (Nick Santos)
 */
public class SymbolTableTest extends TestCase {

  private static final String EXTERNS = CompilerTypeTestCase.DEFAULT_EXTERNS +
      "\nfunction customExternFn(customExternArg) {}";

  private CompilerOptions options;

  @Override
  public void setUp() throws Exception {
    super.setUp();

    options = new CompilerOptions();
    options.setCodingConvention(new ClosureCodingConvention());
    CompilationLevel.SIMPLE_OPTIMIZATIONS.setOptionsForCompilationLevel(
        options);
    WarningLevel.VERBOSE.setOptionsForWarningLevel(options);
    options.ideMode = true;
  }

public void testRemovalOfNamespacedReferencesOfProperties315() throws Exception { 
     SymbolTable table = createSymbolTable("/** @constructor */ var DomHelper = function(){};" + "/** method */ DomHelper.method = function() {};"); 
     Symbol domHelper = getGlobalVar(table, "DomHelper"); 
     assertNotNull(domHelper); 
     Symbol domHelperNamespacedMethod = getGlobalVar(table, "DomHelper.method"); 
     assertEquals("method", domHelperNamespacedMethod.getName()); 
     Symbol domHelperMethod = domHelper.getPropertyScope().getSlot("method"); 
     assertNotNull(domHelperMethod); 
 }
public void testTypeCheckingOff319() { 
     options = new CompilerOptions(); 
     SymbolTable table = createSymbolTable("/** @contstructor */" + "function F() {" + "  this.field1 = 3;" + "}" + "F.prototype.method1 = function() {" + "  this.field1 = 5;" + "};" + "(new F()).method1();"); 
     assertNull(getGlobalVar(table, "F.prototype.field1")); 
     Symbol sym = getGlobalVar(table, "F"); 
     assertEquals(3, table.getReferenceList(sym).size()); 
 }
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertSymmetricOrdering(
      Ordering<Symbol> ordering, Symbol first, Symbol second) {
    assertTrue(ordering.compare(first, first) == 0);
    assertTrue(ordering.compare(second, second) == 0);
    assertTrue(ordering.compare(first, second) < 0);
    assertTrue(ordering.compare(second, first) > 0);
  }

  private Symbol getGlobalVar(SymbolTable table, String name) {
    return table.getGlobalScope().getQualifiedSlot(name);
  }

  private Symbol getDocVar(SymbolTable table, String name) {
    for (Symbol sym : table.getAllSymbols()) {
      if (sym.isDocOnlyParameter() && sym.getName().equals(name)) {
        return sym;
      }
    }
    return null;
  }

  private Symbol getLocalVar(SymbolTable table, String name) {
    for (SymbolScope scope : table.getAllScopes()) {
      if (!scope.isGlobalScope() && scope.isLexicalScope() &&
          scope.getQualifiedSlot(name) != null) {
        return scope.getQualifiedSlot(name);
      }
    }
    return null;
  }

  /** Returns all non-extern vars. */
  private List<Symbol> getVars(SymbolTable table) {
    List<Symbol> result = Lists.newArrayList();
    for (Symbol symbol : table.getAllSymbols()) {
      if (symbol.getDeclaration() != null &&
          !symbol.getDeclaration().getNode().isFromExterns()) {
        result.add(symbol);
      }
    }
    return result;
  }

  private SymbolTable createSymbolTable(String input) {
    List<SourceFile> inputs = Lists.newArrayList(
        SourceFile.fromCode("in1", input));
    List<SourceFile> externs = Lists.newArrayList(
        SourceFile.fromCode("externs1", EXTERNS));

    Compiler compiler = new Compiler();
    compiler.compile(externs, inputs, options);
    return assertSymbolTableValid(compiler.buildKnownSymbolTable());
  }

  /**
   * Asserts that the symbol table meets some invariants.
   * Returns the same table for easy chaining.
   */
  private SymbolTable assertSymbolTableValid(SymbolTable table) {
    Set<Symbol> allSymbols = Sets.newHashSet(table.getAllSymbols());
    for (Symbol sym : table.getAllSymbols()) {
      // Make sure that grabbing the symbol's scope and looking it up
      // again produces the same symbol.
      assertEquals(sym, table.getScope(sym).getQualifiedSlot(sym.getName()));

      for (Reference ref : table.getReferences(sym)) {
        // Make sure that the symbol and reference are mutually linked.
        assertEquals(sym, ref.getSymbol());
      }

      Symbol scope = table.getSymbolForScope(table.getScope(sym));
      assertTrue(
          "The symbol's scope is a zombie scope that shouldn't exist.\n" +
          "Symbol: " + sym + "\n" +
          "Scope: " + table.getScope(sym),
          scope == null || allSymbols.contains(scope));
    }

    // Make sure that the global "this" is declared at the first input root.
    Symbol global = getGlobalVar(table, SymbolTable.GLOBAL_THIS);
    assertNotNull(global);
    assertNotNull(global.getDeclaration());
    assertEquals(Token.SCRIPT, global.getDeclaration().getNode().getType());

    List<Reference> globalRefs = table.getReferenceList(global);

    // The main reference list should never contain the synthetic declaration
    // for the global root.
    assertFalse(globalRefs.contains(global.getDeclaration()));

    return table;
  }
}
