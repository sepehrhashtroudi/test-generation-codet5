@Override [EOL] public UnivariateStatistic getUnivariateStatistic() { [EOL]     return new Kurtosis(); [EOL] } <line_num>: 35,38
@Override [EOL] public double expectedValue() { [EOL]     return this.kurt; [EOL] } <line_num>: 43,46
@Test [EOL] public void testNaN() { [EOL]     Kurtosis kurt = new Kurtosis(); [EOL]     Assert.assertTrue(Double.isNaN(kurt.getResult())); [EOL]     kurt.increment(1d); [EOL]     Assert.assertTrue(Double.isNaN(kurt.getResult())); [EOL]     kurt.increment(1d); [EOL]     Assert.assertTrue(Double.isNaN(kurt.getResult())); [EOL]     kurt.increment(1d); [EOL]     Assert.assertTrue(Double.isNaN(kurt.getResult())); [EOL]     kurt.increment(1d); [EOL]     Assert.assertFalse(Double.isNaN(kurt.getResult())); [EOL] } <line_num>: 52,64
