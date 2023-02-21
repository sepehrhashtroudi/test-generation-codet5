@Override [EOL] protected CompilerPass getProcessor(Compiler compiler) { [EOL]     return new ClosureRewriteClass(compiler); [EOL] } <line_num>: 32,35
@Override [EOL] protected void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     this.enableEcmaScript5(false); [EOL] } <line_num>: 37,41
@Override [EOL] protected int getNumRepetitions() { [EOL]     return 1; [EOL] } <line_num>: 43,46
public void testBasic1() { [EOL]     test("var x = goog.defineClass(null, {\n" + "  constructor: function(){}\n" + "});", "{var x = function() {};}"); [EOL] } <line_num>: 48,55
public void testBasic2() { [EOL]     test("var x = {};\n" + "x.y = goog.defineClass(null, {\n" + "  constructor: function(){}\n" + "});", "var x = {};" + "{x.y = function() {};}"); [EOL] } <line_num>: 57,66
public void testBasic3() { [EOL]     test("var x = goog.labs.classdef.defineClass(null, {\n" + "  constructor: function(){}\n" + "});", "{var x = function() {};}"); [EOL] } <line_num>: 68,75
public void testInnerClass1() { [EOL]     test("var x = goog.defineClass(some.Super, {\n" + "  constructor: function(){\n" + "    this.foo = 1;\n" + "  },\n" + "  statics: {\n" + "    inner: goog.defineClass(x,{\n" + "      constructor: function(){\n" + "        this.bar = 1;\n" + "      }\n" + "    })\n" + "  }\n" + "});", "{" + "var x=function(){this.foo=1};" + "goog.inherits(x,some.Super);" + "{" + "x.inner=function(){this.bar=1};" + "goog.inherits(x.inner,x);" + "}" + "}"); [EOL] } <line_num>: 77,100
public void testComplete1() { [EOL]     test("var x = goog.defineClass(some.Super, {\n" + "  constructor: function(){\n" + "    this.foo = 1;\n" + "  },\n" + "  statics: {\n" + "    prop1: 1,\n" + "    /** @const */\n" + "    PROP2: 2\n" + "  },\n" + "  anotherProp: 1,\n" + "  aMethod: function() {}\n" + "});", "{" + "var x=function(){this.foo=1};" + "goog.inherits(x,some.Super);" + "x.prop1=1;" + "x.PROP2=2;" + "x.prototype.anotherProp=1;" + "x.prototype.aMethod=function(){};" + "}"); [EOL] } <line_num>: 102,125
public void testComplete2() { [EOL]     test("x.y = goog.defineClass(some.Super, {\n" + "  constructor: function(){\n" + "    this.foo = 1;\n" + "  },\n" + "  statics: {\n" + "    prop1: 1,\n" + "    /** @const */\n" + "    PROP2: 2\n" + "  },\n" + "  anotherProp: 1,\n" + "  aMethod: function() {}\n" + "});", "{\n" + "/** @constructor */\n" + "x.y=function(){this.foo=1};\n" + "goog.inherits(x.y,some.Super);" + "x.y.prop1=1;\n" + "/** @const */\n" + "x.y.PROP2=2;\n" + "x.y.prototype.anotherProp=1;" + "x.y.prototype.aMethod=function(){};" + "}"); [EOL] } <line_num>: 127,152
public void testClassWithStaticInitFn() { [EOL]     test("x.y = goog.defineClass(some.Super, {\n" + "  constructor: function(){\n" + "    this.foo = 1;\n" + "  },\n" + "  statics: function(cls) {\n" + "    cls.prop1 = 1;\n" + "    /** @const */\n" + "    cls.PROP2 = 2;\n" + "  },\n" + "  anotherProp: 1,\n" + "  aMethod: function() {}\n" + "});", "{\n" + "/** @constructor */\n" + "x.y=function(){this.foo=1};\n" + "goog.inherits(x.y,some.Super);" + "x.y.prototype.anotherProp=1;" + "x.y.prototype.aMethod=function(){};" + "(function(cls) {" + "  cls.prop1=1;\n" + "  /** @const */\n" + "  cls.PROP2=2;" + "})(x.y);\n" + "}"); [EOL] } <line_num>: 154,181
public void testInvalid1() { [EOL]     testSame("var x = goog.defineClass();", GOOG_CLASS_SUPER_CLASS_NOT_VALID, true); [EOL]     testSame("var x = goog.defineClass('foo');", GOOG_CLASS_SUPER_CLASS_NOT_VALID, true); [EOL]     testSame("var x = goog.defineClass(foo());", GOOG_CLASS_SUPER_CLASS_NOT_VALID, true); [EOL]     testSame("var x = goog.defineClass({'foo':1});", GOOG_CLASS_SUPER_CLASS_NOT_VALID, true); [EOL]     testSame("var x = goog.defineClass({1:1});", GOOG_CLASS_SUPER_CLASS_NOT_VALID, true); [EOL]     this.enableEcmaScript5(true); [EOL]     testSame("var x = goog.defineClass({get foo() {return 1}});", GOOG_CLASS_SUPER_CLASS_NOT_VALID, true); [EOL]     testSame("var x = goog.defineClass({set foo(a) {}});", GOOG_CLASS_SUPER_CLASS_NOT_VALID, true); [EOL] } <line_num>: 183,208
public void testInvalid2() { [EOL]     testSame("var x = goog.defineClass(null);", GOOG_CLASS_DESCRIPTOR_NOT_VALID, true); [EOL]     testSame("var x = goog.defineClass(null, null);", GOOG_CLASS_DESCRIPTOR_NOT_VALID, true); [EOL]     testSame("var x = goog.defineClass(null, foo());", GOOG_CLASS_DESCRIPTOR_NOT_VALID, true); [EOL] } <line_num>: 210,220
public void testInvalid3() { [EOL]     testSame("var x = goog.defineClass(null, {});", GOOG_CLASS_CONSTRUCTOR_MISING, true); [EOL] } <line_num>: 222,226
public void testInvalid4() { [EOL]     testSame("var x = goog.defineClass(null, {" + "  constructor: function(){}," + "  statics: null" + "});", GOOG_CLASS_STATICS_NOT_VALID, true); [EOL]     testSame("var x = goog.defineClass(null, {" + "  constructor: function(){}," + "  statics: foo" + "});", GOOG_CLASS_STATICS_NOT_VALID, true); [EOL]     testSame("var x = goog.defineClass(null, {" + "  constructor: function(){}," + "  statics: {'foo': 1}" + "});", GOOG_CLASS_STATICS_NOT_VALID, true); [EOL]     testSame("var x = goog.defineClass(null, {" + "  constructor: function(){}," + "  statics: {1: 1}" + "});", GOOG_CLASS_STATICS_NOT_VALID, true); [EOL] } <line_num>: 228,252
public void testInvalid5() { [EOL]     testSame("var x = goog.defineClass(null, {" + "  constructor: function(){}" + "}, null);", GOOG_CLASS_UNEXPECTED_PARAMS, true); [EOL] } <line_num>: 254,260
public void testInvalid6() { [EOL]     testSame("goog.defineClass();", GOOG_CLASS_TARGET_INVALID, true); [EOL]     testSame("var x = goog.defineClass() || null;", GOOG_CLASS_TARGET_INVALID, true); [EOL]     testSame("({foo: goog.defineClass()});", GOOG_CLASS_TARGET_INVALID, true); [EOL] } <line_num>: 262,274