@Override [EOL] public UnivariateStatistic getUnivariateStatistic() { [EOL]     return new StandardDeviation(); [EOL] } <line_num>: 37,40
@Override [EOL] public double expectedValue() { [EOL]     return this.std; [EOL] } <line_num>: 45,48
@Test [EOL] public void testNaN() { [EOL]     StandardDeviation std = new StandardDeviation(); [EOL]     Assert.assertTrue(Double.isNaN(std.getResult())); [EOL]     std.increment(1d); [EOL]     Assert.assertEquals(0d, std.getResult(), 0); [EOL] } <line_num>: 54,60
@Test [EOL] public void testPopulation() { [EOL]     double[] values = { -1.0d, 3.1d, 4.0d, -2.1d, 22d, 11.7d, 3d, 14d }; [EOL]     double sigma = populationStandardDeviation(values); [EOL]     SecondMoment m = new SecondMoment(); [EOL]     m.evaluate(values); [EOL]     StandardDeviation s1 = new StandardDeviation(); [EOL]     s1.setBiasCorrected(false); [EOL]     Assert.assertEquals(sigma, s1.evaluate(values), 1E-14); [EOL]     s1.incrementAll(values); [EOL]     Assert.assertEquals(sigma, s1.getResult(), 1E-14); [EOL]     s1 = new StandardDeviation(false, m); [EOL]     Assert.assertEquals(sigma, s1.getResult(), 1E-14); [EOL]     s1 = new StandardDeviation(false); [EOL]     Assert.assertEquals(sigma, s1.evaluate(values), 1E-14); [EOL]     s1.incrementAll(values); [EOL]     Assert.assertEquals(sigma, s1.getResult(), 1E-14); [EOL] } <line_num>: 65,82
protected double populationStandardDeviation(double[] v) { [EOL]     double mean = new Mean().evaluate(v); [EOL]     double sum = 0; [EOL]     for (int i = 0; i < v.length; i++) { [EOL]         sum += (v[i] - mean) * (v[i] - mean); [EOL]     } [EOL]     return FastMath.sqrt(sum / v.length); [EOL] } <line_num>: 87,94
