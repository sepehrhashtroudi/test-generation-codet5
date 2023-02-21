@Test [EOL] public void testNextDouble() { [EOL]     StableRandomGenerator generator = new StableRandomGenerator(rg, 1.3, 0.1); [EOL]     double[] sample = new double[2 * sampleSize]; [EOL]     for (int i = 0; i < sample.length; ++i) { [EOL]         sample[i] = generator.nextNormalizedDouble(); [EOL]     } [EOL]     Assert.assertEquals(0.0, StatUtils.mean(sample), 0.3); [EOL] } <line_num>: 42,51
@Test [EOL] public void testGaussianCase() { [EOL]     StableRandomGenerator generator = new StableRandomGenerator(rg, 2d, 0.0); [EOL]     double[] sample = new double[sampleSize]; [EOL]     for (int i = 0; i < sample.length; ++i) { [EOL]         sample[i] = generator.nextNormalizedDouble(); [EOL]     } [EOL]     Assert.assertEquals(0.0, StatUtils.mean(sample), 0.02); [EOL]     Assert.assertEquals(1.0, StatUtils.variance(sample), 0.02); [EOL] } <line_num>: 56,66
@Test [EOL] public void testCauchyCase() { [EOL]     StableRandomGenerator generator = new StableRandomGenerator(rg, 1d, 0.0); [EOL]     DescriptiveStatistics summary = new DescriptiveStatistics(); [EOL]     for (int i = 0; i < sampleSize; ++i) { [EOL]         double sample = generator.nextNormalizedDouble(); [EOL]         summary.addValue(sample); [EOL]     } [EOL]     double median = summary.getPercentile(50); [EOL]     Assert.assertEquals(0.0, median, 0.2); [EOL] } <line_num>: 71,84
@Test [EOL] public void testAlphaRangeBelowZero() { [EOL]     try { [EOL]         new StableRandomGenerator(rg, -1.0, 0.0); [EOL]         Assert.fail("Expected OutOfRangeException"); [EOL]     } catch (OutOfRangeException e) { [EOL]         Assert.assertEquals(-1.0, e.getArgument()); [EOL]     } [EOL] } <line_num>: 89,98
@Test [EOL] public void testAlphaRangeAboveTwo() { [EOL]     try { [EOL]         new StableRandomGenerator(rg, 3.0, 0.0); [EOL]         Assert.fail("Expected OutOfRangeException"); [EOL]     } catch (OutOfRangeException e) { [EOL]         Assert.assertEquals(3.0, e.getArgument()); [EOL]     } [EOL] } <line_num>: 100,109
@Test [EOL] public void testBetaRangeBelowMinusOne() { [EOL]     try { [EOL]         new StableRandomGenerator(rg, 1.0, -2.0); [EOL]         Assert.fail("Expected OutOfRangeException"); [EOL]     } catch (OutOfRangeException e) { [EOL]         Assert.assertEquals(-2.0, e.getArgument()); [EOL]     } [EOL] } <line_num>: 111,120
@Test [EOL] public void testBetaRangeAboveOne() { [EOL]     try { [EOL]         new StableRandomGenerator(rg, 1.0, 2.0); [EOL]         Assert.fail("Expected OutOfRangeException"); [EOL]     } catch (OutOfRangeException e) { [EOL]         Assert.assertEquals(2.0, e.getArgument()); [EOL]     } [EOL] } <line_num>: 122,131
