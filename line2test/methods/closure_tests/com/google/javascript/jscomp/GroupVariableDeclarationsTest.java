@Override [EOL] protected void setUp() { [EOL]     super.enableLineNumberCheck(false); [EOL] } <line_num>: 21,24
public void testGroupingUninitializedVarsInScope() { [EOL]     test("var a = 1; f1(); var b;", "var a = 1, b; f1();"); [EOL]     test("var a = \"mangoes\"; f1(); alert(a); var b;", "var a = \"mangoes\", b; f1(); alert(a);"); [EOL]     test("var a = 1; {var c; alert(c);} var b;", "var a = 1, c, b; {alert(c);}"); [EOL]     test("var a = 1; var b = 1; f1(); f2(); var c; var d;", "var a = 1, b, c, d; b = 1; f1(); f2();"); [EOL]     test("var a = 1; var b = 2; var c; f1(); f2(); var d, e;", "var a = 1, b, c, d, e; b = 2; f1(); f2();"); [EOL]     test("var a = 1, b = 2, c; f1(); f2(); var d; var e; " + "f3(); f4(); var f = 10; var g; var h = a + b;", "var a = 1, b = 2, c, d, e, f, g, h; f1(); f2(); f3(); f4(); " + "f = 10; h = a + b;"); [EOL] } <line_num>: 26,45
public void testGroupingInitializedVarsInScope() { [EOL]     test("var a = 1; f1(); var b = 2;", "var a = 1, b; f1(); b = 2;"); [EOL]     test("var a = \"mangoes\"; f1(); alert(a); var b = 2;", "var a = \"mangoes\", b; f1(); alert(a); b = 2;"); [EOL]     test("var a = 1; {var c = 34; alert(c);} var b = 2;", "var a = 1, c, b; {c = 34; alert(c);} b = 2;"); [EOL]     test("var a = 1; var b = 1; f1(); f2(); var c = 3; var d = 4;", "var a = 1, b, c, d; b = 1; f1(); f2(); c = 3; d = 4;"); [EOL]     test("var a = 1; var b = 2; var c; f1(); f2(); var d = 4, e;", "var a = 1, b, c, d, e; b = 2; f1(); f2(); d = 4;"); [EOL]     test("var a = 1, b = 2, c; f1(); f2(); var d; var e = 6; " + "f3(); f4(); var f; var g; var h = a + b;", "var a = 1, b = 2, c, d, e, f, g, h; f1(); f2(); e = 6; " + "f3(); f4(); h = a + b;"); [EOL] } <line_num>: 47,66
public void testGroupingVarsInForAndForInLoops() { [EOL]     test("var a = 1; for (var x = 0; x < 10; ++x) {a++;} var y;", "var a = 1, x, y; for (x = 0; x < 10; ++x) {a++;}"); [EOL]     test("var a = 1, x; for (x = 0; x < 10; ++x) {a++;} var y;", "var a = 1, x, y; for (x = 0; x < 10; ++x) {a++;}"); [EOL]     test("var a = 1, x; for (x; x < 10; ++x) {a++;} var y;", "var a = 1, x, y; for (x; x < 10; ++x) {a++;}"); [EOL]     test("var a = 1; for (; a < 10; ++a) {alert(a);} var y;", "var a = 1, y; for (; a < 10; ++a) {alert(a);}"); [EOL]     test("var a = 1; for (var x; x < 10; ++x) {a += 2;} var y = 5;", "var a = 1, x, y; for (; x < 10; ++x) {a += 2;} y = 5;"); [EOL]     test("var a = 1; " + "for (var a1 = 0, a2 = 10; a1 < 10 && a2 > 0; ++a1, --a2) {}" + "var x = 5;", "var a = 1, x;" + "for (var a1 = 0, a2 = 10; a1 < 10 && a2 > 0; ++a1, --a2) {} " + "x = 5;"); [EOL]     test("var a = 1; " + "for (var a1 = 0, a2; a1 < 10 && a2 > 0; ++a1, --a2) {}" + "var x = 5;", "var a = 1, a1, a2, x;" + "for (a1 = 0; a1 < 10 && a2 > 0; ++a1, --a2) {}" + "x = 5;"); [EOL]     test("var a = 1; " + "for (var a1, a2; a1 < 10 && a2 > 0; ++a1, --a2) {}" + "var x = 5;", "var a = 1, a1, a2, x;" + "for (; a1 < 10 && a2 > 0; ++a1, --a2) {}" + "x = 5;"); [EOL]     test("var a = [1, 2, 3, 4]; for (var z in a) {alert(z);} var y;", "var a = [1, 2, 3, 4], z, y; for (z in a) {alert(z);}"); [EOL]     test("var a = [1, 2, 3, 4]; for (var z in a) {alert(z);} var y = 5;", "var a = [1, 2, 3, 4], z, y; for (z in a) {alert(z);} y = 5;"); [EOL]     test("var a; for (var z in a = [1, 2, 3, 4]) {alert(z);} var y, x = 5;", "var a, z, y, x; for (z in a = [1, 2, 3, 4]) {alert(z);} x = 5;"); [EOL]     test("var a; for (var z = 1 in a = [1, 2, 3, 4]) {alert(z);} var y, x = 5;", "var a, y, x; for (var z = 1 in a = [1, 2, 3, 4]) {alert(z);} x = 5;"); [EOL]     test("var a, z; for (z in a = [1, 2, 3, 4]) {alert(z);} var y, x = 5;", "var a, z, y, x; for (z in a = [1, 2, 3, 4]) {alert(z);} x = 5;"); [EOL] } <line_num>: 68,111
public void testGroupingVarsNestedFunction() { [EOL]     test("function f(b) {var x; function g() {var x; a = x; var y;} var a;}", "function f(b) {var x, a; function g() {var x, y; a = x;}}"); [EOL] } <line_num>: 113,116
public void testGroupingVarsInnerFunction() { [EOL]     test("function f(b) {var x; h = x * x; var myfn = function() " + "{var x; a = x; var y;}; var a;}", "function f(b) {var x, myfn, a; h = x * x; myfn = function() " + "{var x, y; a = x;};}"); [EOL] } <line_num>: 118,123
public void testGroupingVarsFirstStatementNotVar() { [EOL]     test("f(); var a; g(); var b;", "f(); var a, b; g();"); [EOL] } <line_num>: 125,127
public void testGroupingVarsInScopeRegtest() { [EOL]     test("var x = 0, y = 1, z;" + "function f1(aa, bb) {" + "  if (y) {" + "    if (x === 0) {" + "      var h, r = 999;" + "    }" + "  } else {" + "    r = 1000;" + "  }" + "  var mylist = [1, 2, 3, 4];" + "  var k1 = 200, k2 = 400;" + "  for (var i1 = 0; i1 < 10; ++i1) {" + "    for (var i2 in mylist) {" + "      alert(i1);" + "    }" + "  }" + "  var jam, q = 100;" + "  var myfn = function() {" + "    var x = 1;" + "    f5();" + "    var z = 5;" + "  };" + "  function f5() {" + "    var aa = 5;" + "    if (y === 1) {" + "      var x = 100;" + "    }" + "  }" + "}" + "var h = x + y;" + "function g() {" + "  y = 0;" + "  { var x = 200;}" + "  var h = y + x;" + "}" + "var ggg = 0;", "var x = 0, y = 1, z, h, ggg;" + "function f1(aa, bb) {" + "  if (y) {" + "    if (x === 0) {" + "      var h, r = 999, mylist, i1, i2, jam, q, myfn;" + "    }" + "  } else {" + "    r = 1000;" + "  }" + "  mylist = [1, 2, 3, 4];" + "  var k1 = 200, k2 = 400;" + "  for (i1 = 0; i1 < 10; ++i1) {" + "    for (i2 in mylist) {" + "      alert(i1);" + "    }" + "  }" + "  q = 100; " + "  myfn = function() {" + "    var x = 1, z;" + "    f5();" + "    z = 5;" + "  };" + "  function f5() {" + "    var aa = 5, x;" + "    if (y === 1) {" + "      x = 100;" + "    }" + "  }" + "}" + "h = x + y;" + "function g() {" + "  y = 0;" + "  { var x = 200, h;}" + "  h = y + x;" + "}" + "ggg = 0;"); [EOL] } <line_num>: 129,203
@Override [EOL] protected CompilerPass getProcessor(Compiler compiler) { [EOL]     return new GroupVariableDeclarations(compiler); [EOL] } <line_num>: 205,208
