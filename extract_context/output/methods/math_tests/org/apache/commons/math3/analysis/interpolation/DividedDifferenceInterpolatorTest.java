@Test [EOL] public void testSinFunction() { [EOL]     UnivariateFunction f = new Sin(); [EOL]     UnivariateInterpolator interpolator = new DividedDifferenceInterpolator(); [EOL]     double x[], y[], z, expected, result, tolerance; [EOL]     int n = 6; [EOL]     double min = 0.0, max = 2 * FastMath.PI; [EOL]     x = new double[n]; [EOL]     y = new double[n]; [EOL]     for (int i = 0; i < n; i++) { [EOL]         x[i] = min + i * (max - min) / n; [EOL]         y[i] = f.value(x[i]); [EOL]     } [EOL]     double derivativebound = 1.0; [EOL]     UnivariateFunction p = interpolator.interpolate(x, y); [EOL]     z = FastMath.PI / 4; [EOL]     expected = f.value(z); [EOL]     result = p.value(z); [EOL]     tolerance = FastMath.abs(derivativebound * partialerror(x, z)); [EOL]     Assert.assertEquals(expected, result, tolerance); [EOL]     z = FastMath.PI * 1.5; [EOL]     expected = f.value(z); [EOL]     result = p.value(z); [EOL]     tolerance = FastMath.abs(derivativebound * partialerror(x, z)); [EOL]     Assert.assertEquals(expected, result, tolerance); [EOL] } <line_num>: 49,74
@Test [EOL] public void testExpm1Function() { [EOL]     UnivariateFunction f = new Expm1(); [EOL]     UnivariateInterpolator interpolator = new DividedDifferenceInterpolator(); [EOL]     double x[], y[], z, expected, result, tolerance; [EOL]     int n = 5; [EOL]     double min = -1.0, max = 1.0; [EOL]     x = new double[n]; [EOL]     y = new double[n]; [EOL]     for (int i = 0; i < n; i++) { [EOL]         x[i] = min + i * (max - min) / n; [EOL]         y[i] = f.value(x[i]); [EOL]     } [EOL]     double derivativebound = FastMath.E; [EOL]     UnivariateFunction p = interpolator.interpolate(x, y); [EOL]     z = 0.0; [EOL]     expected = f.value(z); [EOL]     result = p.value(z); [EOL]     tolerance = FastMath.abs(derivativebound * partialerror(x, z)); [EOL]     Assert.assertEquals(expected, result, tolerance); [EOL]     z = 0.5; [EOL]     expected = f.value(z); [EOL]     result = p.value(z); [EOL]     tolerance = FastMath.abs(derivativebound * partialerror(x, z)); [EOL]     Assert.assertEquals(expected, result, tolerance); [EOL]     z = -0.5; [EOL]     expected = f.value(z); [EOL]     result = p.value(z); [EOL]     tolerance = FastMath.abs(derivativebound * partialerror(x, z)); [EOL]     Assert.assertEquals(expected, result, tolerance); [EOL] } <line_num>: 81,110
@Test [EOL] public void testParameters() { [EOL]     UnivariateInterpolator interpolator = new DividedDifferenceInterpolator(); [EOL]     try { [EOL]         double[] x = { 1.0, 2.0, 2.0, 4.0 }; [EOL]         double[] y = { 0.0, 4.0, 4.0, 2.5 }; [EOL]         UnivariateFunction p = interpolator.interpolate(x, y); [EOL]         p.value(0.0); [EOL]         Assert.fail("Expecting NonMonotonicSequenceException - bad abscissas array"); [EOL]     } catch (NonMonotonicSequenceException ex) { [EOL]     } [EOL] } <line_num>: 115,129
protected double partialerror(double[] x, double z) throws IllegalArgumentException { [EOL]     if (x.length < 1) { [EOL]         throw new IllegalArgumentException("Interpolation array cannot be empty."); [EOL]     } [EOL]     double out = 1; [EOL]     for (int i = 0; i < x.length; i++) { [EOL]         out *= (z - x[i]) / (i + 1); [EOL]     } [EOL]     return out; [EOL] } <line_num>: 134,146
