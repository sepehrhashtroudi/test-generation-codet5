@Override [EOL] public GammaDistribution makeDistribution() { [EOL]     return new GammaDistribution(4d, 2d); [EOL] } <line_num>: 44,47
@Override [EOL] public double[] makeCumulativeTestPoints() { [EOL]     return new double[] { 0.857104827257, 1.64649737269, 2.17973074725, 2.7326367935, 3.48953912565, 26.1244815584, 20.0902350297, 17.5345461395, 15.5073130559, 13.3615661365 }; [EOL] } <line_num>: 50,55
@Override [EOL] public double[] makeCumulativeTestValues() { [EOL]     return new double[] { 0.001, 0.01, 0.025, 0.05, 0.1, 0.999, 0.990, 0.975, 0.950, 0.900 }; [EOL] } <line_num>: 58,61
@Override [EOL] public double[] makeDensityTestValues() { [EOL]     return new double[] { 0.00427280075546, 0.0204117166709, 0.0362756163658, 0.0542113174239, 0.0773195272491, 0.000394468852816, 0.00366559696761, 0.00874649473311, 0.0166712508128, 0.0311798227954 }; [EOL] } <line_num>: 64,68
@Override [EOL] public void setUp() { [EOL]     super.setUp(); [EOL]     setTolerance(1e-9); [EOL] } <line_num>: 71,75
@Test [EOL] public void testParameterAccessors() { [EOL]     GammaDistribution distribution = (GammaDistribution) getDistribution(); [EOL]     Assert.assertEquals(4d, distribution.getAlpha(), 0); [EOL]     Assert.assertEquals(2d, distribution.getBeta(), 0); [EOL] } <line_num>: 78,83
@Test [EOL] public void testPreconditions() { [EOL]     try { [EOL]         new GammaDistribution(0, 1); [EOL]         Assert.fail("Expecting NotStrictlyPositiveException for alpha = 0"); [EOL]     } catch (NotStrictlyPositiveException ex) { [EOL]     } [EOL]     try { [EOL]         new GammaDistribution(1, 0); [EOL]         Assert.fail("Expecting NotStrictlyPositiveException for alpha = 0"); [EOL]     } catch (NotStrictlyPositiveException ex) { [EOL]     } [EOL] } <line_num>: 85,99
@Test [EOL] public void testProbabilities() { [EOL]     testProbability(-1.000, 4.0, 2.0, .0000); [EOL]     testProbability(15.501, 4.0, 2.0, .9499); [EOL]     testProbability(0.504, 4.0, 1.0, .0018); [EOL]     testProbability(10.011, 1.0, 2.0, .9933); [EOL]     testProbability(5.000, 2.0, 2.0, .7127); [EOL] } <line_num>: 101,108
@Test [EOL] public void testValues() { [EOL]     testValue(15.501, 4.0, 2.0, .9499); [EOL]     testValue(0.504, 4.0, 1.0, .0018); [EOL]     testValue(10.011, 1.0, 2.0, .9933); [EOL]     testValue(5.000, 2.0, 2.0, .7127); [EOL] } <line_num>: 110,116
private void testProbability(double x, double a, double b, double expected) { [EOL]     GammaDistribution distribution = new GammaDistribution(a, b); [EOL]     double actual = distribution.cumulativeProbability(x); [EOL]     Assert.assertEquals("probability for " + x, expected, actual, 10e-4); [EOL] } <line_num>: 118,122
private void testValue(double expected, double a, double b, double p) { [EOL]     GammaDistribution distribution = new GammaDistribution(a, b); [EOL]     double actual = distribution.inverseCumulativeProbability(p); [EOL]     Assert.assertEquals("critical value for " + p, expected, actual, 10e-4); [EOL] } <line_num>: 124,128
@Test [EOL] public void testDensity() { [EOL]     double[] x = new double[] { -0.1, 1e-6, 0.5, 1, 2, 5 }; [EOL]     checkDensity(1, 1, x, new double[] { 0.000000000000, 0.999999000001, 0.606530659713, 0.367879441171, 0.135335283237, 0.006737946999 }); [EOL]     checkDensity(2, 1, x, new double[] { 0.000000000000, 0.000000999999, 0.303265329856, 0.367879441171, 0.270670566473, 0.033689734995 }); [EOL]     checkDensity(4, 1, x, new double[] { 0.000000000e+00, 1.666665000e-19, 1.263605541e-02, 6.131324020e-02, 1.804470443e-01, 1.403738958e-01 }); [EOL]     checkDensity(4, 10, x, new double[] { 0.000000000e+00, 1.666650000e-15, 1.403738958e+00, 7.566654960e-02, 2.748204830e-05, 4.018228850e-17 }); [EOL]     checkDensity(0.1, 10, x, new double[] { 0.000000000e+00, 3.323953832e+04, 1.663849010e-03, 6.007786726e-06, 1.461647647e-10, 5.996008322e-24 }); [EOL]     checkDensity(0.1, 20, x, new double[] { 0.000000000e+00, 3.562489883e+04, 1.201557345e-05, 2.923295295e-10, 3.228910843e-19, 1.239484589e-45 }); [EOL]     checkDensity(0.1, 4, x, new double[] { 0.000000000e+00, 3.032938388e+04, 3.049322494e-02, 2.211502311e-03, 2.170613371e-05, 5.846590589e-11 }); [EOL]     checkDensity(0.1, 1, x, new double[] { 0.000000000e+00, 2.640334143e+04, 1.189704437e-01, 3.866916944e-02, 7.623306235e-03, 1.663849010e-04 }); [EOL] } <line_num>: 130,149
private void checkDensity(double alpha, double rate, double[] x, double[] expected) { [EOL]     GammaDistribution d = new GammaDistribution(alpha, 1 / rate); [EOL]     for (int i = 0; i < x.length; i++) { [EOL]         Assert.assertEquals(expected[i], d.density(x[i]), 1e-5); [EOL]     } [EOL] } <line_num>: 151,156
@Test [EOL] public void testInverseCumulativeProbabilityExtremes() { [EOL]     setInverseCumulativeTestPoints(new double[] { 0, 1 }); [EOL]     setInverseCumulativeTestValues(new double[] { 0, Double.POSITIVE_INFINITY }); [EOL]     verifyInverseCumulativeProbabilities(); [EOL] } <line_num>: 158,163
@Test [EOL] public void testMoments() { [EOL]     final double tol = 1e-9; [EOL]     GammaDistribution dist; [EOL]     dist = new GammaDistribution(1, 2); [EOL]     Assert.assertEquals(dist.getNumericalMean(), 2, tol); [EOL]     Assert.assertEquals(dist.getNumericalVariance(), 4, tol); [EOL]     dist = new GammaDistribution(1.1, 4.2); [EOL]     Assert.assertEquals(dist.getNumericalMean(), 1.1d * 4.2d, tol); [EOL]     Assert.assertEquals(dist.getNumericalVariance(), 1.1d * 4.2d * 4.2d, tol); [EOL] } <line_num>: 165,177
public static double logGamma(double x) { [EOL]     double ret; [EOL]     if (Double.isNaN(x) || (x <= 0.0)) { [EOL]         ret = Double.NaN; [EOL]     } else { [EOL]         double sum = Gamma.lanczos(x); [EOL]         double tmp = x + Gamma.LANCZOS_G + .5; [EOL]         ret = ((x + .5) * FastMath.log(tmp)) - tmp + HALF_LOG_2_PI + FastMath.log(sum / x); [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 181,199
public static double density(final double x, final double shape, final double scale) { [EOL]     if (x < 0) { [EOL]         return 0; [EOL]     } [EOL]     return FastMath.pow(x / scale, shape - 1) / scale * FastMath.exp(-x / scale) / FastMath.exp(logGamma(shape)); [EOL] } <line_num>: 201,213
private void doTestMath753(final double shape, final double meanNoOF, final double sdNoOF, final double meanOF, final double sdOF, final String resourceName) throws IOException { [EOL]     final GammaDistribution distribution = new GammaDistribution(shape, 1.0); [EOL]     final SummaryStatistics statOld = new SummaryStatistics(); [EOL]     final SummaryStatistics statNewNoOF = new SummaryStatistics(); [EOL]     final SummaryStatistics statNewOF = new SummaryStatistics(); [EOL]     final InputStream resourceAsStream; [EOL]     resourceAsStream = this.getClass().getResourceAsStream(resourceName); [EOL]     Assert.assertNotNull("Could not find resource " + resourceName, resourceAsStream); [EOL]     final BufferedReader in; [EOL]     in = new BufferedReader(new InputStreamReader(resourceAsStream)); [EOL]     try { [EOL]         for (String line = in.readLine(); line != null; line = in.readLine()) { [EOL]             if (line.startsWith("#")) { [EOL]                 continue; [EOL]             } [EOL]             final String[] tokens = line.split(", "); [EOL]             Assert.assertTrue("expected two floating-point values", tokens.length == 2); [EOL]             final double x = Double.parseDouble(tokens[0]); [EOL]             final String msg = "x = " + x + ", shape = " + shape + ", scale = 1.0"; [EOL]             final double expected = Double.parseDouble(tokens[1]); [EOL]             final double ulp = FastMath.ulp(expected); [EOL]             final double actualOld = density(x, shape, 1.0); [EOL]             final double actualNew = distribution.density(x); [EOL]             final double errOld, errNew; [EOL]             errOld = FastMath.abs((actualOld - expected) / ulp); [EOL]             errNew = FastMath.abs((actualNew - expected) / ulp); [EOL]             if (Double.isNaN(actualOld) || Double.isInfinite(actualOld)) { [EOL]                 Assert.assertFalse(msg, Double.isNaN(actualNew)); [EOL]                 Assert.assertFalse(msg, Double.isInfinite(actualNew)); [EOL]                 statNewOF.addValue(errNew); [EOL]             } else { [EOL]                 statOld.addValue(errOld); [EOL]                 statNewNoOF.addValue(errNew); [EOL]             } [EOL]         } [EOL]         if (statOld.getN() != 0) { [EOL]             final StringBuilder sb = new StringBuilder("shape = "); [EOL]             sb.append(shape); [EOL]             sb.append(", scale = 1.0\n"); [EOL]             sb.append("Old implementation\n"); [EOL]             sb.append("------------------\n"); [EOL]             sb.append(statOld.toString()); [EOL]             sb.append("New implementation\n"); [EOL]             sb.append("------------------\n"); [EOL]             sb.append(statNewNoOF.toString()); [EOL]             final String msg = sb.toString(); [EOL]             final double oldMin = statOld.getMin(); [EOL]             final double newMin = statNewNoOF.getMin(); [EOL]             Assert.assertTrue(msg, newMin <= oldMin); [EOL]             final double oldMax = statOld.getMax(); [EOL]             final double newMax = statNewNoOF.getMax(); [EOL]             Assert.assertTrue(msg, newMax <= oldMax); [EOL]             final double oldMean = statOld.getMean(); [EOL]             final double newMean = statNewNoOF.getMean(); [EOL]             Assert.assertTrue(msg, newMean <= oldMean); [EOL]             final double oldSd = statOld.getStandardDeviation(); [EOL]             final double newSd = statNewNoOF.getStandardDeviation(); [EOL]             Assert.assertTrue(msg, newSd <= oldSd); [EOL]             Assert.assertTrue(msg, newMean <= meanNoOF); [EOL]             Assert.assertTrue(msg, newSd <= sdNoOF); [EOL]         } [EOL]         if (statNewOF.getN() != 0) { [EOL]             final double newMean = statNewOF.getMean(); [EOL]             final double newSd = statNewOF.getStandardDeviation(); [EOL]             final StringBuilder sb = new StringBuilder("shape = "); [EOL]             sb.append(shape); [EOL]             sb.append(", scale = 1.0"); [EOL]             sb.append(", max. mean error (ulps) = "); [EOL]             sb.append(meanOF); [EOL]             sb.append(", actual mean error (ulps) = "); [EOL]             sb.append(newMean); [EOL]             sb.append(", max. sd of error (ulps) = "); [EOL]             sb.append(sdOF); [EOL]             sb.append(", actual sd of error (ulps) = "); [EOL]             sb.append(newSd); [EOL]             final String msg = sb.toString(); [EOL]             Assert.assertTrue(msg, newMean <= meanOF); [EOL]             Assert.assertTrue(msg, newSd <= sdOF); [EOL]         } [EOL]     } catch (IOException e) { [EOL]         Assert.fail(e.getMessage()); [EOL]     } finally { [EOL]         in.close(); [EOL]     } [EOL] } <line_num>: 222,326
@Test [EOL] public void testMath753Shape1() throws IOException { [EOL]     doTestMath753(1.0, 1.5, 0.5, 0.0, 0.0, "gamma-distribution-shape-1.csv"); [EOL] } <line_num>: 329,332
@Test [EOL] public void testMath753Shape8() throws IOException { [EOL]     doTestMath753(8.0, 1.5, 1.0, 0.0, 0.0, "gamma-distribution-shape-8.csv"); [EOL] } <line_num>: 334,337
@Test [EOL] public void testMath753Shape10() throws IOException { [EOL]     doTestMath753(10.0, 1.0, 1.0, 0.0, 0.0, "gamma-distribution-shape-10.csv"); [EOL] } <line_num>: 339,342
@Test [EOL] public void testMath753Shape100() throws IOException { [EOL]     doTestMath753(100.0, 1.5, 1.0, 0.0, 0.0, "gamma-distribution-shape-100.csv"); [EOL] } <line_num>: 344,347
@Test [EOL] public void testMath753Shape142() throws IOException { [EOL]     doTestMath753(142.0, 0.5, 1.5, 40.0, 40.0, "gamma-distribution-shape-142.csv"); [EOL] } <line_num>: 349,352
@Test [EOL] public void testMath753Shape1000() throws IOException { [EOL]     doTestMath753(1000.0, 1.0, 1.0, 160.0, 220.0, "gamma-distribution-shape-1000.csv"); [EOL] } <line_num>: 354,357
