@Override [EOL] public UnivariateStatistic getUnivariateStatistic() { [EOL]     return new Product(); [EOL] } <line_num>: 36,39
@Override [EOL] public double getTolerance() { [EOL]     return 10E8; [EOL] } <line_num>: 44,47
@Override [EOL] public double expectedValue() { [EOL]     return this.product; [EOL] } <line_num>: 52,55
public double expectedWeightedValue() { [EOL]     return this.weightedProduct; [EOL] } <line_num>: 58,60
@Test [EOL] public void testSpecialValues() { [EOL]     Product product = new Product(); [EOL]     Assert.assertEquals(1, product.getResult(), 0); [EOL]     product.increment(1); [EOL]     Assert.assertEquals(1, product.getResult(), 0); [EOL]     product.increment(Double.POSITIVE_INFINITY); [EOL]     Assert.assertEquals(Double.POSITIVE_INFINITY, product.getResult(), 0); [EOL]     product.increment(Double.NEGATIVE_INFINITY); [EOL]     Assert.assertEquals(Double.NEGATIVE_INFINITY, product.getResult(), 0); [EOL]     product.increment(Double.NaN); [EOL]     Assert.assertTrue(Double.isNaN(product.getResult())); [EOL]     product.increment(1); [EOL]     Assert.assertTrue(Double.isNaN(product.getResult())); [EOL] } <line_num>: 62,76
@Test [EOL] public void testWeightedProduct() { [EOL]     Product product = new Product(); [EOL]     Assert.assertEquals(expectedWeightedValue(), product.evaluate(testArray, testWeightsArray, 0, testArray.length), getTolerance()); [EOL]     Assert.assertEquals(expectedValue(), product.evaluate(testArray, unitWeightsArray, 0, testArray.length), getTolerance()); [EOL] } <line_num>: 78,83
@Override [EOL] protected void checkClearValue(StorelessUnivariateStatistic statistic) { [EOL]     Assert.assertEquals(1, statistic.getResult(), 0); [EOL] } <line_num>: 85,88
