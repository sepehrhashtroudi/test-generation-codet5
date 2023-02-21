@Test [EOL] public void testTestPositive() { [EOL]     for (int j = 0; j < 6; j++) { [EOL]         for (int i = 1; i < (7 - j); i++) { [EOL]             Assert.assertTrue(testStatistic.test(testArray, 0, i)); [EOL]         } [EOL]     } [EOL]     Assert.assertTrue(testStatistic.test(singletonArray, 0, 1)); [EOL]     Assert.assertTrue(testStatistic.test(singletonArray, 0, 0, true)); [EOL] } <line_num>: 39,48
@Test [EOL] public void testTestNegative() { [EOL]     Assert.assertFalse(testStatistic.test(singletonArray, 0, 0)); [EOL]     Assert.assertFalse(testStatistic.test(testArray, 0, 0)); [EOL]     try { [EOL]         testStatistic.test(singletonArray, 2, 1); [EOL]         Assert.fail("Expecting MathIllegalArgumentException"); [EOL]     } catch (MathIllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         testStatistic.test(testArray, 0, 7); [EOL]         Assert.fail("Expecting MathIllegalArgumentException"); [EOL]     } catch (MathIllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         testStatistic.test(testArray, -1, 1); [EOL]         Assert.fail("Expecting MathIllegalArgumentException"); [EOL]     } catch (MathIllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         testStatistic.test(testArray, 0, -1); [EOL]         Assert.fail("Expecting MathIllegalArgumentException"); [EOL]     } catch (MathIllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         testStatistic.test(nullArray, 0, 1); [EOL]         Assert.fail("Expecting MathIllegalArgumentException"); [EOL]     } catch (MathIllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         testStatistic.test(testArray, nullArray, 0, 1); [EOL]         Assert.fail("Expecting MathIllegalArgumentException"); [EOL]     } catch (MathIllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         testStatistic.test(singletonArray, testWeightsArray, 0, 1); [EOL]         Assert.fail("Expecting MathIllegalArgumentException"); [EOL]     } catch (MathIllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         testStatistic.test(testArray, testNegativeWeightsArray, 0, 6); [EOL]         Assert.fail("Expecting MathIllegalArgumentException"); [EOL]     } catch (MathIllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 50,102
