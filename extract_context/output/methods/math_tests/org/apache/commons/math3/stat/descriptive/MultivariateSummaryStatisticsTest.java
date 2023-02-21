protected MultivariateSummaryStatistics createMultivariateSummaryStatistics(int k, boolean isCovarianceBiasCorrected) { [EOL]     return new MultivariateSummaryStatistics(k, isCovarianceBiasCorrected); [EOL] } <line_num>: 38,40
@Test [EOL] public void testSetterInjection() { [EOL]     MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(2, true); [EOL]     u.setMeanImpl(new StorelessUnivariateStatistic[] { new sumMean(), new sumMean() }); [EOL]     u.addValue(new double[] { 1, 2 }); [EOL]     u.addValue(new double[] { 3, 4 }); [EOL]     Assert.assertEquals(4, u.getMean()[0], 1E-14); [EOL]     Assert.assertEquals(6, u.getMean()[1], 1E-14); [EOL]     u.clear(); [EOL]     u.addValue(new double[] { 1, 2 }); [EOL]     u.addValue(new double[] { 3, 4 }); [EOL]     Assert.assertEquals(4, u.getMean()[0], 1E-14); [EOL]     Assert.assertEquals(6, u.getMean()[1], 1E-14); [EOL]     u.clear(); [EOL]     u.setMeanImpl(new StorelessUnivariateStatistic[] { new Mean(), new Mean() }); [EOL]     u.addValue(new double[] { 1, 2 }); [EOL]     u.addValue(new double[] { 3, 4 }); [EOL]     Assert.assertEquals(2, u.getMean()[0], 1E-14); [EOL]     Assert.assertEquals(3, u.getMean()[1], 1E-14); [EOL]     Assert.assertEquals(2, u.getDimension()); [EOL] } <line_num>: 42,66
@Test [EOL] public void testSetterIllegalState() { [EOL]     MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(2, true); [EOL]     u.addValue(new double[] { 1, 2 }); [EOL]     u.addValue(new double[] { 3, 4 }); [EOL]     try { [EOL]         u.setMeanImpl(new StorelessUnivariateStatistic[] { new sumMean(), new sumMean() }); [EOL]         Assert.fail("Expecting IllegalStateException"); [EOL]     } catch (IllegalStateException ex) { [EOL]     } [EOL] } <line_num>: 68,81
@Test [EOL] public void testToString() { [EOL]     MultivariateSummaryStatistics stats = createMultivariateSummaryStatistics(2, true); [EOL]     stats.addValue(new double[] { 1, 3 }); [EOL]     stats.addValue(new double[] { 2, 2 }); [EOL]     stats.addValue(new double[] { 3, 1 }); [EOL]     Locale d = Locale.getDefault(); [EOL]     Locale.setDefault(Locale.US); [EOL]     final String suffix = System.getProperty("line.separator"); [EOL]     Assert.assertEquals("MultivariateSummaryStatistics:" + suffix + "n: 3" + suffix + "min: 1.0, 1.0" + suffix + "max: 3.0, 3.0" + suffix + "mean: 2.0, 2.0" + suffix + "geometric mean: 1.817..., 1.817..." + suffix + "sum of squares: 14.0, 14.0" + suffix + "sum of logarithms: 1.791..., 1.791..." + suffix + "standard deviation: 1.0, 1.0" + suffix + "covariance: Array2DRowRealMatrix{{1.0,-1.0},{-1.0,1.0}}" + suffix, stats.toString().replaceAll("([0-9]+\\.[0-9][0-9][0-9])[0-9]+", "$1...")); [EOL]     Locale.setDefault(d); [EOL] } <line_num>: 83,104
@Test [EOL] public void testShuffledStatistics() { [EOL]     MultivariateSummaryStatistics reference = createMultivariateSummaryStatistics(2, true); [EOL]     MultivariateSummaryStatistics shuffled = createMultivariateSummaryStatistics(2, true); [EOL]     StorelessUnivariateStatistic[] tmp = shuffled.getGeoMeanImpl(); [EOL]     shuffled.setGeoMeanImpl(shuffled.getMeanImpl()); [EOL]     shuffled.setMeanImpl(shuffled.getMaxImpl()); [EOL]     shuffled.setMaxImpl(shuffled.getMinImpl()); [EOL]     shuffled.setMinImpl(shuffled.getSumImpl()); [EOL]     shuffled.setSumImpl(shuffled.getSumsqImpl()); [EOL]     shuffled.setSumsqImpl(shuffled.getSumLogImpl()); [EOL]     shuffled.setSumLogImpl(tmp); [EOL]     for (int i = 100; i > 0; --i) { [EOL]         reference.addValue(new double[] { i, i }); [EOL]         shuffled.addValue(new double[] { i, i }); [EOL]     } [EOL]     TestUtils.assertEquals(reference.getMean(), shuffled.getGeometricMean(), 1.0e-10); [EOL]     TestUtils.assertEquals(reference.getMax(), shuffled.getMean(), 1.0e-10); [EOL]     TestUtils.assertEquals(reference.getMin(), shuffled.getMax(), 1.0e-10); [EOL]     TestUtils.assertEquals(reference.getSum(), shuffled.getMin(), 1.0e-10); [EOL]     TestUtils.assertEquals(reference.getSumSq(), shuffled.getSum(), 1.0e-10); [EOL]     TestUtils.assertEquals(reference.getSumLog(), shuffled.getSumSq(), 1.0e-10); [EOL]     TestUtils.assertEquals(reference.getGeometricMean(), shuffled.getSumLog(), 1.0e-10); [EOL] } <line_num>: 106,136
public double evaluate(double[] values, int begin, int length) { [EOL]     return 0; [EOL] } <line_num>: 145,147
public double evaluate(double[] values) { [EOL]     return 0; [EOL] } <line_num>: 148,150
public void clear() { [EOL]     sum = 0; [EOL]     n = 0; [EOL] } <line_num>: 151,154
public long getN() { [EOL]     return n; [EOL] } <line_num>: 155,157
public double getResult() { [EOL]     return sum; [EOL] } <line_num>: 158,160
public void increment(double d) { [EOL]     sum += d; [EOL]     n++; [EOL] } <line_num>: 161,164
public void incrementAll(double[] values, int start, int length) { [EOL] } <line_num>: 165,166
public void incrementAll(double[] values) { [EOL] } <line_num>: 167,168
public StorelessUnivariateStatistic copy() { [EOL]     return new sumMean(); [EOL] } <line_num>: 169,171
@Test [EOL] public void testDimension() { [EOL]     try { [EOL]         createMultivariateSummaryStatistics(2, true).addValue(new double[3]); [EOL]         Assert.fail("Expecting DimensionMismatchException"); [EOL]     } catch (DimensionMismatchException dme) { [EOL]     } [EOL] } <line_num>: 174,182
@Test [EOL] public void testStats() { [EOL]     MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(2, true); [EOL]     Assert.assertEquals(0, u.getN()); [EOL]     u.addValue(new double[] { 1, 2 }); [EOL]     u.addValue(new double[] { 2, 3 }); [EOL]     u.addValue(new double[] { 2, 3 }); [EOL]     u.addValue(new double[] { 3, 4 }); [EOL]     Assert.assertEquals(4, u.getN()); [EOL]     Assert.assertEquals(8, u.getSum()[0], 1.0e-10); [EOL]     Assert.assertEquals(12, u.getSum()[1], 1.0e-10); [EOL]     Assert.assertEquals(18, u.getSumSq()[0], 1.0e-10); [EOL]     Assert.assertEquals(38, u.getSumSq()[1], 1.0e-10); [EOL]     Assert.assertEquals(1, u.getMin()[0], 1.0e-10); [EOL]     Assert.assertEquals(2, u.getMin()[1], 1.0e-10); [EOL]     Assert.assertEquals(3, u.getMax()[0], 1.0e-10); [EOL]     Assert.assertEquals(4, u.getMax()[1], 1.0e-10); [EOL]     Assert.assertEquals(2.4849066497880003102, u.getSumLog()[0], 1.0e-10); [EOL]     Assert.assertEquals(4.276666119016055311, u.getSumLog()[1], 1.0e-10); [EOL]     Assert.assertEquals(1.8612097182041991979, u.getGeometricMean()[0], 1.0e-10); [EOL]     Assert.assertEquals(2.9129506302439405217, u.getGeometricMean()[1], 1.0e-10); [EOL]     Assert.assertEquals(2, u.getMean()[0], 1.0e-10); [EOL]     Assert.assertEquals(3, u.getMean()[1], 1.0e-10); [EOL]     Assert.assertEquals(FastMath.sqrt(2.0 / 3.0), u.getStandardDeviation()[0], 1.0e-10); [EOL]     Assert.assertEquals(FastMath.sqrt(2.0 / 3.0), u.getStandardDeviation()[1], 1.0e-10); [EOL]     Assert.assertEquals(2.0 / 3.0, u.getCovariance().getEntry(0, 0), 1.0e-10); [EOL]     Assert.assertEquals(2.0 / 3.0, u.getCovariance().getEntry(0, 1), 1.0e-10); [EOL]     Assert.assertEquals(2.0 / 3.0, u.getCovariance().getEntry(1, 0), 1.0e-10); [EOL]     Assert.assertEquals(2.0 / 3.0, u.getCovariance().getEntry(1, 1), 1.0e-10); [EOL]     u.clear(); [EOL]     Assert.assertEquals(0, u.getN()); [EOL] } <line_num>: 185,216
@Test [EOL] public void testN0andN1Conditions() { [EOL]     MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(1, true); [EOL]     Assert.assertTrue(Double.isNaN(u.getMean()[0])); [EOL]     Assert.assertTrue(Double.isNaN(u.getStandardDeviation()[0])); [EOL]     u.addValue(new double[] { 1 }); [EOL]     Assert.assertEquals(1.0, u.getMean()[0], 1.0e-10); [EOL]     Assert.assertEquals(1.0, u.getGeometricMean()[0], 1.0e-10); [EOL]     Assert.assertEquals(0.0, u.getStandardDeviation()[0], 1.0e-10); [EOL]     u.addValue(new double[] { 2 }); [EOL]     Assert.assertTrue(u.getStandardDeviation()[0] > 0); [EOL] } <line_num>: 218,234
@Test [EOL] public void testNaNContracts() { [EOL]     MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(1, true); [EOL]     Assert.assertTrue(Double.isNaN(u.getMean()[0])); [EOL]     Assert.assertTrue(Double.isNaN(u.getMin()[0])); [EOL]     Assert.assertTrue(Double.isNaN(u.getStandardDeviation()[0])); [EOL]     Assert.assertTrue(Double.isNaN(u.getGeometricMean()[0])); [EOL]     u.addValue(new double[] { 1.0 }); [EOL]     Assert.assertFalse(Double.isNaN(u.getMean()[0])); [EOL]     Assert.assertFalse(Double.isNaN(u.getMin()[0])); [EOL]     Assert.assertFalse(Double.isNaN(u.getStandardDeviation()[0])); [EOL]     Assert.assertFalse(Double.isNaN(u.getGeometricMean()[0])); [EOL] } <line_num>: 236,250
@Test [EOL] public void testSerialization() { [EOL]     MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(2, true); [EOL]     TestUtils.checkSerializedEquality(u); [EOL]     MultivariateSummaryStatistics s = (MultivariateSummaryStatistics) TestUtils.serializeAndRecover(u); [EOL]     Assert.assertEquals(u, s); [EOL]     u.addValue(new double[] { 2d, 1d }); [EOL]     u.addValue(new double[] { 1d, 1d }); [EOL]     u.addValue(new double[] { 3d, 1d }); [EOL]     u.addValue(new double[] { 4d, 1d }); [EOL]     u.addValue(new double[] { 5d, 1d }); [EOL]     TestUtils.checkSerializedEquality(u); [EOL]     s = (MultivariateSummaryStatistics) TestUtils.serializeAndRecover(u); [EOL]     Assert.assertEquals(u, s); [EOL] } <line_num>: 252,272
@Test [EOL] public void testEqualsAndHashCode() { [EOL]     MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(2, true); [EOL]     MultivariateSummaryStatistics t = null; [EOL]     int emptyHash = u.hashCode(); [EOL]     Assert.assertTrue(u.equals(u)); [EOL]     Assert.assertFalse(u.equals(t)); [EOL]     Assert.assertFalse(u.equals(Double.valueOf(0))); [EOL]     t = createMultivariateSummaryStatistics(2, true); [EOL]     Assert.assertTrue(t.equals(u)); [EOL]     Assert.assertTrue(u.equals(t)); [EOL]     Assert.assertEquals(emptyHash, t.hashCode()); [EOL]     u.addValue(new double[] { 2d, 1d }); [EOL]     u.addValue(new double[] { 1d, 1d }); [EOL]     u.addValue(new double[] { 3d, 1d }); [EOL]     u.addValue(new double[] { 4d, 1d }); [EOL]     u.addValue(new double[] { 5d, 1d }); [EOL]     Assert.assertFalse(t.equals(u)); [EOL]     Assert.assertFalse(u.equals(t)); [EOL]     Assert.assertTrue(u.hashCode() != t.hashCode()); [EOL]     t.addValue(new double[] { 2d, 1d }); [EOL]     t.addValue(new double[] { 1d, 1d }); [EOL]     t.addValue(new double[] { 3d, 1d }); [EOL]     t.addValue(new double[] { 4d, 1d }); [EOL]     t.addValue(new double[] { 5d, 1d }); [EOL]     Assert.assertTrue(t.equals(u)); [EOL]     Assert.assertTrue(u.equals(t)); [EOL]     Assert.assertEquals(u.hashCode(), t.hashCode()); [EOL]     u.clear(); [EOL]     t.clear(); [EOL]     Assert.assertTrue(t.equals(u)); [EOL]     Assert.assertTrue(u.equals(t)); [EOL]     Assert.assertEquals(emptyHash, t.hashCode()); [EOL]     Assert.assertEquals(emptyHash, u.hashCode()); [EOL] } <line_num>: 274,314
