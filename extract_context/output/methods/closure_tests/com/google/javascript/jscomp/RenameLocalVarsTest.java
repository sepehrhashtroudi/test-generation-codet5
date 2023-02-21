@Override [EOL] protected CompilerPass getProcessor(Compiler compiler) { [EOL]     return new RenameVars(compiler, prefix, true, false, false, false, null, null, null); [EOL] } <line_num>: 28,32
public void testRenameSimple() { [EOL]     test("function Foo(v1, v2) {return v1;} Foo();", "function Foo(a, b) {return a;} Foo();"); [EOL] } <line_num>: 34,37
public void testRenameGlobals() { [EOL]     testSame("var Foo; var Bar, y; function x() { Bar++; }"); [EOL] } <line_num>: 39,41
public void testRenameLocals() { [EOL]     test("(function (v1, v2) {}); (function (v3, v4) {});", "(function (a, b) {}); (function (a, b) {});"); [EOL]     test("function f1(v1, v2) {}; function f2(v3, v4) {};", "function f1(a, b) {}; function f2(a, b) {};"); [EOL] } <line_num>: 43,49
public void testRenameLocalsClashingWithGlobals() { [EOL]     test("function a(v1, v2) {return v1;} a();", "function a(b, c) {return b;} a();"); [EOL] } <line_num>: 51,54
public void testRenameNested() { [EOL]     test("function f1(v1, v2) { (function(v3, v4) {}) }", "function f1(a, b) { (function(c, d) {}) }"); [EOL]     test("function f1(v1, v2) { function f2(v3, v4) {} }", "function f1(a, b) { function c(d, e) {} }"); [EOL] } <line_num>: 56,61
public void testRenameWithExterns1() { [EOL]     String externs = "var bar; function alert() {}"; [EOL]     test(externs, "function foo(bar) { alert(bar); } foo(3)", "function foo(a) { alert(a); } foo(3)", null, null); [EOL] } <line_num>: 63,68
public void testRenameWithExterns2() { [EOL]     test("var a; function alert() {}", "function foo(bar) { alert(a);alert(bar); } foo(3);", "function foo(b) { alert(a);alert(b); } foo(3);", null, null); [EOL] } <line_num>: 70,75
public void testDoNotRenameExportedName() { [EOL]     test("_foo()", "_foo()"); [EOL] } <line_num>: 77,79
public void testRenameWithNameOverlap() { [EOL]     test("function local() { var a = 1; var b = 2; b + b; }", "function local() { var b = 1; var a = 2; a + a; }"); [EOL] } <line_num>: 81,84
public void testRenameWithPrefix1() { [EOL]     prefix = "PRE_"; [EOL]     test("function Foo(v1, v2) {return v1} Foo();", "function Foo(a, b) {return a} Foo();"); [EOL]     prefix = DEFAULT_PREFIX; [EOL] } <line_num>: 86,91
public void testRenameWithPrefix2() { [EOL]     prefix = "PRE_"; [EOL]     test("function Foo(v1, v2) {var v3 = v1 + v2; return v3;} Foo();", "function Foo(a, b) {var c = a + b; return c;} Foo();"); [EOL]     prefix = DEFAULT_PREFIX; [EOL] } <line_num>: 93,98
public void testRenameWithPrefix3() { [EOL]     prefix = "a"; [EOL]     test("function Foo() {return 1;}" + "function Bar() {" + "  var a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z," + "      A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,aa,ab;" + "  Foo();" + "} Bar();", "function Foo() {return 1;}" + "function Bar() {" + "  var a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C," + "      D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,$,aa;" + "  Foo();" + "} Bar();"); [EOL]     prefix = DEFAULT_PREFIX; [EOL] } <line_num>: 100,116
