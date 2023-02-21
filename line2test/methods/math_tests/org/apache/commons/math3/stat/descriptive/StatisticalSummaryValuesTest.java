@Test [EOL] public void testSerialization() { [EOL]     StatisticalSummaryValues u = new StatisticalSummaryValues(1, 2, 3, 4, 5, 6); [EOL]     TestUtils.checkSerializedEquality(u); [EOL]     StatisticalSummaryValues t = (StatisticalSummaryValues) TestUtils.serializeAndRecover(u); [EOL]     verifyEquality(u, t); [EOL] } <line_num>: 34,40
@Test [EOL] public void testEqualsAndHashCode() { [EOL]     StatisticalSummaryValues u = new StatisticalSummaryValues(1, 2, 3, 4, 5, 6); [EOL]     StatisticalSummaryValues t = null; [EOL]     Assert.assertTrue("reflexive", u.equals(u)); [EOL]     Assert.assertFalse("non-null compared to null", u.equals(t)); [EOL]     Assert.assertFalse("wrong type", u.equals(Double.valueOf(0))); [EOL]     t = new StatisticalSummaryValues(1, 2, 3, 4, 5, 6); [EOL]     Assert.assertTrue("instances with same data should be equal", t.equals(u)); [EOL]     Assert.assertEquals("hash code", u.hashCode(), t.hashCode()); [EOL]     u = new StatisticalSummaryValues(Double.NaN, 2, 3, 4, 5, 6); [EOL]     t = new StatisticalSummaryValues(1, Double.NaN, 3, 4, 5, 6); [EOL]     Assert.assertFalse("instances based on different data should be different", (u.equals(t) || t.equals(u))); [EOL] } <line_num>: 42,57
private void verifyEquality(StatisticalSummaryValues s, StatisticalSummaryValues u) { [EOL]     Assert.assertEquals("N", s.getN(), u.getN()); [EOL]     TestUtils.assertEquals("sum", s.getSum(), u.getSum(), 0); [EOL]     TestUtils.assertEquals("var", s.getVariance(), u.getVariance(), 0); [EOL]     TestUtils.assertEquals("std", s.getStandardDeviation(), u.getStandardDeviation(), 0); [EOL]     TestUtils.assertEquals("mean", s.getMean(), u.getMean(), 0); [EOL]     TestUtils.assertEquals("min", s.getMin(), u.getMin(), 0); [EOL]     TestUtils.assertEquals("max", s.getMax(), u.getMax(), 0); [EOL] } <line_num>: 59,67
@Test [EOL] public void testToString() { [EOL]     StatisticalSummaryValues u = new StatisticalSummaryValues(4.5, 16, 10, 5, 4, 45); [EOL]     Locale d = Locale.getDefault(); [EOL]     Locale.setDefault(Locale.US); [EOL]     Assert.assertEquals("StatisticalSummaryValues:\n" + "n: 10\n" + "min: 4.0\n" + "max: 5.0\n" + "mean: 4.5\n" + "std dev: 4.0\n" + "variance: 16.0\n" + "sum: 45.0\n", u.toString()); [EOL]     Locale.setDefault(d); [EOL] } <line_num>: 69,83