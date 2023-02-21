@Override [EOL] public TDistribution makeDistribution() { [EOL]     return new TDistribution(5.0); [EOL] } <line_num>: 35,38
@Override [EOL] public double[] makeCumulativeTestPoints() { [EOL]     return new double[] { -5.89342953136, -3.36492999891, -2.57058183564, -2.01504837333, -1.47588404882, 5.89342953136, 3.36492999891, 2.57058183564, 2.01504837333, 1.47588404882 }; [EOL] } <line_num>: 41,46
@Override [EOL] public double[] makeCumulativeTestValues() { [EOL]     return new double[] { 0.001, 0.01, 0.025, 0.05, 0.1, 0.999, 0.990, 0.975, 0.950, 0.900 }; [EOL] } <line_num>: 49,53
@Override [EOL] public double[] makeDensityTestValues() { [EOL]     return new double[] { 0.000756494565517, 0.0109109752919, 0.0303377878006, 0.0637967988952, 0.128289492005, 0.000756494565517, 0.0109109752919, 0.0303377878006, 0.0637967988952, 0.128289492005 }; [EOL] } <line_num>: 56,60
@Override [EOL] public void setUp() { [EOL]     super.setUp(); [EOL]     setTolerance(1E-9); [EOL] } <line_num>: 63,67
@Test [EOL] public void testCumulativeProbabilityAgainstStackOverflow() { [EOL]     TDistribution td = new TDistribution(5.); [EOL]     td.cumulativeProbability(.1); [EOL]     td.cumulativeProbability(.01); [EOL] } <line_num>: 74,79
@Test [EOL] public void testSmallDf() { [EOL]     setDistribution(new TDistribution(1d)); [EOL]     setCumulativeTestPoints(new double[] { -318.308838986, -31.8205159538, -12.7062047362, -6.31375151468, -3.07768353718, 318.308838986, 31.8205159538, 12.7062047362, 6.31375151468, 3.07768353718 }); [EOL]     setDensityTestValues(new double[] { 3.14158231817e-06, 0.000314055924703, 0.00195946145194, 0.00778959736375, 0.0303958893917, 3.14158231817e-06, 0.000314055924703, 0.00195946145194, 0.00778959736375, 0.0303958893917 }); [EOL]     setInverseCumulativeTestValues(getCumulativeTestPoints()); [EOL]     verifyCumulativeProbabilities(); [EOL]     verifyInverseCumulativeProbabilities(); [EOL]     verifyDensities(); [EOL] } <line_num>: 81,95
@Test [EOL] public void testInverseCumulativeProbabilityExtremes() { [EOL]     setInverseCumulativeTestPoints(new double[] { 0, 1 }); [EOL]     setInverseCumulativeTestValues(new double[] { Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY }); [EOL]     verifyInverseCumulativeProbabilities(); [EOL] } <line_num>: 97,103
@Test [EOL] public void testDfAccessors() { [EOL]     TDistribution dist = (TDistribution) getDistribution(); [EOL]     Assert.assertEquals(5d, dist.getDegreesOfFreedom(), Double.MIN_VALUE); [EOL] } <line_num>: 105,109
@Test(expected = NotStrictlyPositiveException.class) [EOL] public void testPreconditions() { [EOL]     new TDistribution(0); [EOL] } <line_num>: 111,114
@Test [EOL] public void testMoments() { [EOL]     final double tol = 1e-9; [EOL]     TDistribution dist; [EOL]     dist = new TDistribution(1); [EOL]     Assert.assertTrue(Double.isNaN(dist.getNumericalMean())); [EOL]     Assert.assertTrue(Double.isNaN(dist.getNumericalVariance())); [EOL]     dist = new TDistribution(1.5); [EOL]     Assert.assertEquals(dist.getNumericalMean(), 0, tol); [EOL]     Assert.assertTrue(Double.isInfinite(dist.getNumericalVariance())); [EOL]     dist = new TDistribution(5); [EOL]     Assert.assertEquals(dist.getNumericalMean(), 0, tol); [EOL]     Assert.assertEquals(dist.getNumericalVariance(), 5d / (5d - 2d), tol); [EOL] } <line_num>: 116,132
@Test [EOL] public void nistData() { [EOL]     double[] prob = new double[] { 0.10, 0.05, 0.025, 0.01, 0.005, 0.001 }; [EOL]     double[] args2 = new double[] { 1.886, 2.920, 4.303, 6.965, 9.925, 22.327 }; [EOL]     double[] args10 = new double[] { 1.372, 1.812, 2.228, 2.764, 3.169, 4.143 }; [EOL]     double[] args30 = new double[] { 1.310, 1.697, 2.042, 2.457, 2.750, 3.385 }; [EOL]     double[] args100 = new double[] { 1.290, 1.660, 1.984, 2.364, 2.626, 3.174 }; [EOL]     TestUtils.assertEquals(prob, makeNistResults(args2, 2), 1.0e-4); [EOL]     TestUtils.assertEquals(prob, makeNistResults(args10, 10), 1.0e-4); [EOL]     TestUtils.assertEquals(prob, makeNistResults(args30, 30), 1.0e-4); [EOL]     TestUtils.assertEquals(prob, makeNistResults(args100, 100), 1.0e-4); [EOL]     return; [EOL] } <line_num>: 140,152
private double[] makeNistResults(double[] args, int df) { [EOL]     TDistribution td = new TDistribution(df); [EOL]     double[] res = new double[args.length]; [EOL]     for (int i = 0; i < res.length; i++) { [EOL]         res[i] = 1.0 - td.cumulativeProbability(args[i]); [EOL]     } [EOL]     return res; [EOL] } <line_num>: 153,160
