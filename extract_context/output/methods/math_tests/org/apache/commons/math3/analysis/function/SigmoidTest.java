@Test [EOL] public void testSomeValues() { [EOL]     final UnivariateFunction f = new Sigmoid(); [EOL]     Assert.assertEquals(0.5, f.value(0), EPS); [EOL]     Assert.assertEquals(0, f.value(Double.NEGATIVE_INFINITY), EPS); [EOL]     Assert.assertEquals(1, f.value(Double.POSITIVE_INFINITY), EPS); [EOL] } <line_num>: 34,41
@Test [EOL] public void testDerivative() { [EOL]     final Sigmoid f = new Sigmoid(); [EOL]     final DerivativeStructure f0 = f.value(new DerivativeStructure(1, 1, 0, 0.0)); [EOL]     Assert.assertEquals(0.25, f0.getPartialDerivative(1), 0); [EOL] } <line_num>: 43,49
@Test [EOL] public void testDerivativesHighOrder() { [EOL]     DerivativeStructure s = new Sigmoid(1, 3).value(new DerivativeStructure(1, 5, 0, 1.2)); [EOL]     Assert.assertEquals(2.5370495669980352859, s.getPartialDerivative(0), 5.0e-16); [EOL]     Assert.assertEquals(0.35578888129361140441, s.getPartialDerivative(1), 6.0e-17); [EOL]     Assert.assertEquals(-0.19107626464144938116, s.getPartialDerivative(2), 6.0e-17); [EOL]     Assert.assertEquals(-0.02396830286286711696, s.getPartialDerivative(3), 4.0e-17); [EOL]     Assert.assertEquals(0.21682059798981049049, s.getPartialDerivative(4), 3.0e-17); [EOL]     Assert.assertEquals(-0.19186320234632658055, s.getPartialDerivative(5), 2.0e-16); [EOL] } <line_num>: 51,60
@Test [EOL] public void testDerivativeLargeArguments() { [EOL]     final Sigmoid f = new Sigmoid(1, 2); [EOL]     Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, Double.NEGATIVE_INFINITY)).getPartialDerivative(1), 0); [EOL]     Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, -Double.MAX_VALUE)).getPartialDerivative(1), 0); [EOL]     Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, -1e50)).getPartialDerivative(1), 0); [EOL]     Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, -1e3)).getPartialDerivative(1), 0); [EOL]     Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, 1e3)).getPartialDerivative(1), 0); [EOL]     Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, 1e50)).getPartialDerivative(1), 0); [EOL]     Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, Double.MAX_VALUE)).getPartialDerivative(1), 0); [EOL]     Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, Double.POSITIVE_INFINITY)).getPartialDerivative(1), 0); [EOL] } <line_num>: 62,74
@Test(expected = NullArgumentException.class) [EOL] public void testParametricUsage1() { [EOL]     final Sigmoid.Parametric g = new Sigmoid.Parametric(); [EOL]     g.value(0, null); [EOL] } <line_num>: 76,80
@Test(expected = DimensionMismatchException.class) [EOL] public void testParametricUsage2() { [EOL]     final Sigmoid.Parametric g = new Sigmoid.Parametric(); [EOL]     g.value(0, new double[] { 0 }); [EOL] } <line_num>: 82,86
@Test(expected = NullArgumentException.class) [EOL] public void testParametricUsage3() { [EOL]     final Sigmoid.Parametric g = new Sigmoid.Parametric(); [EOL]     g.gradient(0, null); [EOL] } <line_num>: 88,92
@Test(expected = DimensionMismatchException.class) [EOL] public void testParametricUsage4() { [EOL]     final Sigmoid.Parametric g = new Sigmoid.Parametric(); [EOL]     g.gradient(0, new double[] { 0 }); [EOL] } <line_num>: 94,98
@Test [EOL] public void testParametricValue() { [EOL]     final double lo = 2; [EOL]     final double hi = 3; [EOL]     final Sigmoid f = new Sigmoid(lo, hi); [EOL]     final Sigmoid.Parametric g = new Sigmoid.Parametric(); [EOL]     Assert.assertEquals(f.value(-1), g.value(-1, new double[] { lo, hi }), 0); [EOL]     Assert.assertEquals(f.value(0), g.value(0, new double[] { lo, hi }), 0); [EOL]     Assert.assertEquals(f.value(2), g.value(2, new double[] { lo, hi }), 0); [EOL] } <line_num>: 100,110
