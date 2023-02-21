public abstract RealDistribution makeDistribution(); <line_num>: 101,101
public abstract double[] makeCumulativeTestPoints(); <line_num>: 104,104
public abstract double[] makeCumulativeTestValues(); <line_num>: 107,107
public abstract double[] makeDensityTestValues(); <line_num>: 110,110
public double[] makeInverseCumulativeTestPoints() { [EOL]     return makeCumulativeTestValues(); [EOL] } <line_num>: 115,117
public double[] makeInverseCumulativeTestValues() { [EOL]     return makeCumulativeTestPoints(); [EOL] } <line_num>: 120,122
@Before [EOL] public void setUp() { [EOL]     distribution = makeDistribution(); [EOL]     cumulativeTestPoints = makeCumulativeTestPoints(); [EOL]     cumulativeTestValues = makeCumulativeTestValues(); [EOL]     inverseCumulativeTestPoints = makeInverseCumulativeTestPoints(); [EOL]     inverseCumulativeTestValues = makeInverseCumulativeTestValues(); [EOL]     densityTestValues = makeDensityTestValues(); [EOL] } <line_num>: 129,137
@After [EOL] public void tearDown() { [EOL]     distribution = null; [EOL]     cumulativeTestPoints = null; [EOL]     cumulativeTestValues = null; [EOL]     inverseCumulativeTestPoints = null; [EOL]     inverseCumulativeTestValues = null; [EOL]     densityTestValues = null; [EOL] } <line_num>: 142,150
protected void verifyCumulativeProbabilities() { [EOL]     for (int i = 0; i < cumulativeTestPoints.length; i++) { [EOL]         TestUtils.assertEquals("Incorrect cumulative probability value returned for " + cumulativeTestPoints[i], cumulativeTestValues[i], distribution.cumulativeProbability(cumulativeTestPoints[i]), getTolerance()); [EOL]     } [EOL]     for (int i = 0; i < cumulativeTestPoints.length; i++) { [EOL]         for (int j = 0; j < cumulativeTestPoints.length; j++) { [EOL]             if (cumulativeTestPoints[i] <= cumulativeTestPoints[j]) { [EOL]                 TestUtils.assertEquals(cumulativeTestValues[j] - cumulativeTestValues[i], distribution.cumulativeProbability(cumulativeTestPoints[i], cumulativeTestPoints[j]), getTolerance()); [EOL]             } else { [EOL]                 try { [EOL]                     distribution.cumulativeProbability(cumulativeTestPoints[i], cumulativeTestPoints[j]); [EOL]                 } catch (NumberIsTooLargeException e) { [EOL]                     continue; [EOL]                 } [EOL]                 Assert.fail("distribution.cumulativeProbability(double, double) should have thrown an exception that second argument is too large"); [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 158,184
protected void verifyInverseCumulativeProbabilities() { [EOL]     for (int i = 0; i < inverseCumulativeTestPoints.length; i++) { [EOL]         TestUtils.assertEquals("Incorrect inverse cumulative probability value returned for " + inverseCumulativeTestPoints[i], inverseCumulativeTestValues[i], distribution.inverseCumulativeProbability(inverseCumulativeTestPoints[i]), getTolerance()); [EOL]     } [EOL] } <line_num>: 190,197
protected void verifyDensities() { [EOL]     for (int i = 0; i < cumulativeTestPoints.length; i++) { [EOL]         TestUtils.assertEquals("Incorrect probability density value returned for " + cumulativeTestPoints[i], densityTestValues[i], distribution.density(cumulativeTestPoints[i]), getTolerance()); [EOL]     } [EOL] } <line_num>: 202,209
@Test [EOL] public void testCumulativeProbabilities() { [EOL]     verifyCumulativeProbabilities(); [EOL] } <line_num>: 217,220
@Test [EOL] public void testInverseCumulativeProbabilities() { [EOL]     verifyInverseCumulativeProbabilities(); [EOL] } <line_num>: 226,229
@Test [EOL] public void testDensities() { [EOL]     verifyDensities(); [EOL] } <line_num>: 235,238
@Test [EOL] public void testConsistency() { [EOL]     for (int i = 1; i < cumulativeTestPoints.length; i++) { [EOL]         TestUtils.assertEquals(0d, distribution.cumulativeProbability(cumulativeTestPoints[i], cumulativeTestPoints[i]), tolerance); [EOL]         double upper = FastMath.max(cumulativeTestPoints[i], cumulativeTestPoints[i - 1]); [EOL]         double lower = FastMath.min(cumulativeTestPoints[i], cumulativeTestPoints[i - 1]); [EOL]         double diff = distribution.cumulativeProbability(upper) - distribution.cumulativeProbability(lower); [EOL]         double direct = distribution.cumulativeProbability(lower, upper); [EOL]         TestUtils.assertEquals("Inconsistent cumulative probabilities for (" + lower + "," + upper + ")", diff, direct, tolerance); [EOL]     } [EOL] } <line_num>: 243,263
@Test [EOL] public void testIllegalArguments() { [EOL]     try { [EOL]         distribution.cumulativeProbability(1, 0); [EOL]         Assert.fail("Expecting MathIllegalArgumentException for bad cumulativeProbability interval"); [EOL]     } catch (MathIllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         distribution.inverseCumulativeProbability(-1); [EOL]         Assert.fail("Expecting MathIllegalArgumentException for p = -1"); [EOL]     } catch (MathIllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         distribution.inverseCumulativeProbability(2); [EOL]         Assert.fail("Expecting MathIllegalArgumentException for p = 2"); [EOL]     } catch (MathIllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 268,289
@Test [EOL] public void testSampling() { [EOL]     final int sampleSize = 1000; [EOL]     distribution.reseedRandomGenerator(1000); [EOL]     double[] sample = distribution.sample(sampleSize); [EOL]     double[] quartiles = TestUtils.getDistributionQuartiles(distribution); [EOL]     double[] expected = { 250, 250, 250, 250 }; [EOL]     long[] counts = new long[4]; [EOL]     for (int i = 0; i < sampleSize; i++) { [EOL]         TestUtils.updateCounts(sample[i], counts, quartiles); [EOL]     } [EOL]     TestUtils.assertChiSquareAccept(expected, counts, 0.001); [EOL] } <line_num>: 294,306
public double value(double x) { [EOL]     return distribution.density(x); [EOL] } <line_num>: 322,324
@Test [EOL] public void testDensityIntegrals() { [EOL]     final double tol = 1.0e-9; [EOL]     final BaseAbstractUnivariateIntegrator integrator = new IterativeLegendreGaussIntegrator(5, 1.0e-12, 1.0e-10); [EOL]     final UnivariateFunction d = new UnivariateFunction() { [EOL]  [EOL]         public double value(double x) { [EOL]             return distribution.density(x); [EOL]         } [EOL]     }; [EOL]     final ArrayList<Double> integrationTestPoints = new ArrayList<Double>(); [EOL]     for (int i = 0; i < cumulativeTestPoints.length; i++) { [EOL]         if (Double.isNaN(cumulativeTestValues[i]) || cumulativeTestValues[i] < 1.0e-5 || cumulativeTestValues[i] > 1 - 1.0e-5) { [EOL]             continue; [EOL]         } [EOL]         integrationTestPoints.add(cumulativeTestPoints[i]); [EOL]     } [EOL]     Collections.sort(integrationTestPoints); [EOL]     for (int i = 1; i < integrationTestPoints.size(); i++) { [EOL]         Assert.assertEquals(distribution.cumulativeProbability(integrationTestPoints.get(0), integrationTestPoints.get(i)), integrator.integrate(1000000, d, integrationTestPoints.get(0), integrationTestPoints.get(i)), tol); [EOL]     } [EOL] } <line_num>: 316,345
@Test [EOL] public void testIsSupportLowerBoundInclusive() { [EOL]     final double lowerBound = distribution.getSupportLowerBound(); [EOL]     double result = Double.NaN; [EOL]     result = distribution.density(lowerBound); [EOL]     Assert.assertEquals(!Double.isInfinite(lowerBound) && !Double.isNaN(result) && !Double.isInfinite(result), distribution.isSupportLowerBoundInclusive()); [EOL] } <line_num>: 351,361
@Test [EOL] public void testIsSupportUpperBoundInclusive() { [EOL]     final double upperBound = distribution.getSupportUpperBound(); [EOL]     double result = Double.NaN; [EOL]     result = distribution.density(upperBound); [EOL]     Assert.assertEquals(!Double.isInfinite(upperBound) && !Double.isNaN(result) && !Double.isInfinite(result), distribution.isSupportUpperBoundInclusive()); [EOL] } <line_num>: 367,377
@Test [EOL] public void testDistributionClone() throws IOException, ClassNotFoundException { [EOL]     distribution.reseedRandomGenerator(123); [EOL]     distribution.sample(); [EOL]     final RealDistribution cloned = deepClone(); [EOL]     final double s1 = distribution.sample(); [EOL]     final double s2 = cloned.sample(); [EOL]     Assert.assertEquals(s1, s2, 0d); [EOL] } <line_num>: 379,395
protected double[] getCumulativeTestPoints() { [EOL]     return cumulativeTestPoints; [EOL] } <line_num>: 401,403
protected void setCumulativeTestPoints(double[] cumulativeTestPoints) { [EOL]     this.cumulativeTestPoints = cumulativeTestPoints; [EOL] } <line_num>: 408,410
protected double[] getCumulativeTestValues() { [EOL]     return cumulativeTestValues; [EOL] } <line_num>: 415,417
protected void setCumulativeTestValues(double[] cumulativeTestValues) { [EOL]     this.cumulativeTestValues = cumulativeTestValues; [EOL] } <line_num>: 422,424
protected double[] getDensityTestValues() { [EOL]     return densityTestValues; [EOL] } <line_num>: 426,428
protected void setDensityTestValues(double[] densityTestValues) { [EOL]     this.densityTestValues = densityTestValues; [EOL] } <line_num>: 430,432
protected RealDistribution getDistribution() { [EOL]     return distribution; [EOL] } <line_num>: 437,439
protected void setDistribution(RealDistribution distribution) { [EOL]     this.distribution = distribution; [EOL] } <line_num>: 444,446
protected double[] getInverseCumulativeTestPoints() { [EOL]     return inverseCumulativeTestPoints; [EOL] } <line_num>: 451,453
protected void setInverseCumulativeTestPoints(double[] inverseCumulativeTestPoints) { [EOL]     this.inverseCumulativeTestPoints = inverseCumulativeTestPoints; [EOL] } <line_num>: 458,460
protected double[] getInverseCumulativeTestValues() { [EOL]     return inverseCumulativeTestValues; [EOL] } <line_num>: 465,467
protected void setInverseCumulativeTestValues(double[] inverseCumulativeTestValues) { [EOL]     this.inverseCumulativeTestValues = inverseCumulativeTestValues; [EOL] } <line_num>: 472,474
protected double getTolerance() { [EOL]     return tolerance; [EOL] } <line_num>: 479,481
protected void setTolerance(double tolerance) { [EOL]     this.tolerance = tolerance; [EOL] } <line_num>: 486,488
private RealDistribution deepClone() throws IOException, ClassNotFoundException { [EOL]     final ByteArrayOutputStream bOut = new ByteArrayOutputStream(); [EOL]     final ObjectOutputStream oOut = new ObjectOutputStream(bOut); [EOL]     oOut.writeObject(distribution); [EOL]     final byte[] data = bOut.toByteArray(); [EOL]     final ByteArrayInputStream bIn = new ByteArrayInputStream(data); [EOL]     final ObjectInputStream oIn = new ObjectInputStream(bIn); [EOL]     final Object clone = oIn.readObject(); [EOL]     oIn.close(); [EOL]     return (RealDistribution) clone; [EOL] } <line_num>: 493,509