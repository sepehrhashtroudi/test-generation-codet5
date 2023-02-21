@Test [EOL] public void testEqualsWithRelativeTolerance() { [EOL]     Assert.assertTrue(Precision.equalsWithRelativeTolerance(0d, 0d, 0d)); [EOL]     Assert.assertTrue(Precision.equalsWithRelativeTolerance(0d, 1 / Double.NEGATIVE_INFINITY, 0d)); [EOL]     final double eps = 1e-14; [EOL]     Assert.assertFalse(Precision.equalsWithRelativeTolerance(1.987654687654968, 1.987654687654988, eps)); [EOL]     Assert.assertTrue(Precision.equalsWithRelativeTolerance(1.987654687654968, 1.987654687654987, eps)); [EOL]     Assert.assertFalse(Precision.equalsWithRelativeTolerance(1.987654687654968, 1.987654687654948, eps)); [EOL]     Assert.assertTrue(Precision.equalsWithRelativeTolerance(1.987654687654968, 1.987654687654949, eps)); [EOL]     Assert.assertFalse(Precision.equalsWithRelativeTolerance(Precision.SAFE_MIN, 0.0, eps)); [EOL]     Assert.assertFalse(Precision.equalsWithRelativeTolerance(1.0000000000001e-300, 1e-300, eps)); [EOL]     Assert.assertTrue(Precision.equalsWithRelativeTolerance(1.00000000000001e-300, 1e-300, eps)); [EOL]     Assert.assertFalse(Precision.equalsWithRelativeTolerance(Double.NEGATIVE_INFINITY, 1.23, eps)); [EOL]     Assert.assertFalse(Precision.equalsWithRelativeTolerance(Double.POSITIVE_INFINITY, 1.23, eps)); [EOL]     Assert.assertTrue(Precision.equalsWithRelativeTolerance(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, eps)); [EOL]     Assert.assertTrue(Precision.equalsWithRelativeTolerance(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, eps)); [EOL]     Assert.assertFalse(Precision.equalsWithRelativeTolerance(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, eps)); [EOL]     Assert.assertFalse(Precision.equalsWithRelativeTolerance(Double.NaN, 1.23, eps)); [EOL]     Assert.assertFalse(Precision.equalsWithRelativeTolerance(Double.NaN, Double.NaN, eps)); [EOL] } <line_num>: 30,55
@Test [EOL] public void testEqualsIncludingNaN() { [EOL]     double[] testArray = { Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, 1d, 0d }; [EOL]     for (int i = 0; i < testArray.length; i++) { [EOL]         for (int j = 0; j < testArray.length; j++) { [EOL]             if (i == j) { [EOL]                 Assert.assertTrue(Precision.equalsIncludingNaN(testArray[i], testArray[j])); [EOL]                 Assert.assertTrue(Precision.equalsIncludingNaN(testArray[j], testArray[i])); [EOL]             } else { [EOL]                 Assert.assertTrue(!Precision.equalsIncludingNaN(testArray[i], testArray[j])); [EOL]                 Assert.assertTrue(!Precision.equalsIncludingNaN(testArray[j], testArray[i])); [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 57,76
@Test [EOL] public void testEqualsWithAllowedDelta() { [EOL]     Assert.assertTrue(Precision.equals(153.0000, 153.0000, .0625)); [EOL]     Assert.assertTrue(Precision.equals(153.0000, 153.0625, .0625)); [EOL]     Assert.assertTrue(Precision.equals(152.9375, 153.0000, .0625)); [EOL]     Assert.assertFalse(Precision.equals(153.0000, 153.0625, .0624)); [EOL]     Assert.assertFalse(Precision.equals(152.9374, 153.0000, .0625)); [EOL]     Assert.assertFalse(Precision.equals(Double.NaN, Double.NaN, 1.0)); [EOL]     Assert.assertTrue(Precision.equals(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1.0)); [EOL]     Assert.assertTrue(Precision.equals(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 1.0)); [EOL]     Assert.assertFalse(Precision.equals(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 1.0)); [EOL] } <line_num>: 78,89
@Test [EOL] public void testMath475() { [EOL]     final double a = 1.7976931348623182E16; [EOL]     final double b = FastMath.nextUp(a); [EOL]     double diff = FastMath.abs(a - b); [EOL]     Assert.assertTrue(Precision.equals(a, b, 0.5 * diff)); [EOL]     final double c = FastMath.nextUp(b); [EOL]     diff = FastMath.abs(a - c); [EOL]     Assert.assertTrue(Precision.equals(a, c, diff)); [EOL]     Assert.assertFalse(Precision.equals(a, c, (1 - 1e-16) * diff)); [EOL] } <line_num>: 91,108
@Test [EOL] public void testEqualsIncludingNaNWithAllowedDelta() { [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(153.0000, 153.0000, .0625)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(153.0000, 153.0625, .0625)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(152.9375, 153.0000, .0625)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(Double.NaN, Double.NaN, 1.0)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1.0)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 1.0)); [EOL]     Assert.assertFalse(Precision.equalsIncludingNaN(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 1.0)); [EOL]     Assert.assertFalse(Precision.equalsIncludingNaN(153.0000, 153.0625, .0624)); [EOL]     Assert.assertFalse(Precision.equalsIncludingNaN(152.9374, 153.0000, .0625)); [EOL] } <line_num>: 110,121
@Test [EOL] public void testFloatEqualsWithAllowedUlps() { [EOL]     Assert.assertTrue("+0.0f == -0.0f", Precision.equals(0.0f, -0.0f)); [EOL]     Assert.assertTrue("+0.0f == -0.0f (1 ulp)", Precision.equals(0.0f, -0.0f, 1)); [EOL]     float oneFloat = 1.0f; [EOL]     Assert.assertTrue("1.0f == 1.0f + 1 ulp", Precision.equals(oneFloat, Float.intBitsToFloat(1 + Float.floatToIntBits(oneFloat)))); [EOL]     Assert.assertTrue("1.0f == 1.0f + 1 ulp (1 ulp)", Precision.equals(oneFloat, Float.intBitsToFloat(1 + Float.floatToIntBits(oneFloat)), 1)); [EOL]     Assert.assertFalse("1.0f != 1.0f + 2 ulp (1 ulp)", Precision.equals(oneFloat, Float.intBitsToFloat(2 + Float.floatToIntBits(oneFloat)), 1)); [EOL]     Assert.assertTrue(Precision.equals(153.0f, 153.0f, 1)); [EOL]     Assert.assertTrue(Precision.equals(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, 1)); [EOL]     Assert.assertTrue(Precision.equals(Double.MAX_VALUE, Float.POSITIVE_INFINITY, 1)); [EOL]     Assert.assertTrue(Precision.equals(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, 1)); [EOL]     Assert.assertTrue(Precision.equals(-Float.MAX_VALUE, Float.NEGATIVE_INFINITY, 1)); [EOL]     Assert.assertFalse(Precision.equals(Float.NaN, Float.NaN, 1)); [EOL]     Assert.assertFalse(Precision.equals(Float.NaN, Float.NaN, 0)); [EOL]     Assert.assertFalse(Precision.equals(Float.NaN, 0, 0)); [EOL]     Assert.assertFalse(Precision.equals(Float.NaN, Float.POSITIVE_INFINITY, 0)); [EOL]     Assert.assertFalse(Precision.equals(Float.NaN, Float.NEGATIVE_INFINITY, 0)); [EOL]     Assert.assertFalse(Precision.equals(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 100000)); [EOL] } <line_num>: 124,159
@Test [EOL] public void testEqualsWithAllowedUlps() { [EOL]     Assert.assertTrue(Precision.equals(0.0, -0.0, 1)); [EOL]     Assert.assertTrue(Precision.equals(1.0, 1 + FastMath.ulp(1d), 1)); [EOL]     Assert.assertFalse(Precision.equals(1.0, 1 + 2 * FastMath.ulp(1d), 1)); [EOL]     final double nUp1 = FastMath.nextAfter(1d, Double.POSITIVE_INFINITY); [EOL]     final double nnUp1 = FastMath.nextAfter(nUp1, Double.POSITIVE_INFINITY); [EOL]     Assert.assertTrue(Precision.equals(1.0, nUp1, 1)); [EOL]     Assert.assertTrue(Precision.equals(nUp1, nnUp1, 1)); [EOL]     Assert.assertFalse(Precision.equals(1.0, nnUp1, 1)); [EOL]     Assert.assertTrue(Precision.equals(0.0, FastMath.ulp(0d), 1)); [EOL]     Assert.assertTrue(Precision.equals(0.0, -FastMath.ulp(0d), 1)); [EOL]     Assert.assertTrue(Precision.equals(153.0, 153.0, 1)); [EOL]     Assert.assertTrue(Precision.equals(153.0, 153.00000000000003, 1)); [EOL]     Assert.assertFalse(Precision.equals(153.0, 153.00000000000006, 1)); [EOL]     Assert.assertTrue(Precision.equals(153.0, 152.99999999999997, 1)); [EOL]     Assert.assertFalse(Precision.equals(153, 152.99999999999994, 1)); [EOL]     Assert.assertTrue(Precision.equals(-128.0, -127.99999999999999, 1)); [EOL]     Assert.assertFalse(Precision.equals(-128.0, -127.99999999999997, 1)); [EOL]     Assert.assertTrue(Precision.equals(-128.0, -128.00000000000003, 1)); [EOL]     Assert.assertFalse(Precision.equals(-128.0, -128.00000000000006, 1)); [EOL]     Assert.assertTrue(Precision.equals(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1)); [EOL]     Assert.assertTrue(Precision.equals(Double.MAX_VALUE, Double.POSITIVE_INFINITY, 1)); [EOL]     Assert.assertTrue(Precision.equals(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 1)); [EOL]     Assert.assertTrue(Precision.equals(-Double.MAX_VALUE, Double.NEGATIVE_INFINITY, 1)); [EOL]     Assert.assertFalse(Precision.equals(Double.NaN, Double.NaN, 1)); [EOL]     Assert.assertFalse(Precision.equals(Double.NaN, Double.NaN, 0)); [EOL]     Assert.assertFalse(Precision.equals(Double.NaN, 0, 0)); [EOL]     Assert.assertFalse(Precision.equals(Double.NaN, Double.POSITIVE_INFINITY, 0)); [EOL]     Assert.assertFalse(Precision.equals(Double.NaN, Double.NEGATIVE_INFINITY, 0)); [EOL]     Assert.assertFalse(Precision.equals(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 100000)); [EOL] } <line_num>: 161,202
@Test [EOL] public void testEqualsIncludingNaNWithAllowedUlps() { [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(0.0, -0.0, 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(1.0, 1 + FastMath.ulp(1d), 1)); [EOL]     Assert.assertFalse(Precision.equalsIncludingNaN(1.0, 1 + 2 * FastMath.ulp(1d), 1)); [EOL]     final double nUp1 = FastMath.nextAfter(1d, Double.POSITIVE_INFINITY); [EOL]     final double nnUp1 = FastMath.nextAfter(nUp1, Double.POSITIVE_INFINITY); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(1.0, nUp1, 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(nUp1, nnUp1, 1)); [EOL]     Assert.assertFalse(Precision.equalsIncludingNaN(1.0, nnUp1, 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(0.0, FastMath.ulp(0d), 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(0.0, -FastMath.ulp(0d), 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(153.0, 153.0, 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(153.0, 153.00000000000003, 1)); [EOL]     Assert.assertFalse(Precision.equalsIncludingNaN(153.0, 153.00000000000006, 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(153.0, 152.99999999999997, 1)); [EOL]     Assert.assertFalse(Precision.equalsIncludingNaN(153, 152.99999999999994, 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(-128.0, -127.99999999999999, 1)); [EOL]     Assert.assertFalse(Precision.equalsIncludingNaN(-128.0, -127.99999999999997, 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(-128.0, -128.00000000000003, 1)); [EOL]     Assert.assertFalse(Precision.equalsIncludingNaN(-128.0, -128.00000000000006, 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(Double.MAX_VALUE, Double.POSITIVE_INFINITY, 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(-Double.MAX_VALUE, Double.NEGATIVE_INFINITY, 1)); [EOL]     Assert.assertTrue(Precision.equalsIncludingNaN(Double.NaN, Double.NaN, 1)); [EOL]     Assert.assertFalse(Precision.equalsIncludingNaN(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 100000)); [EOL] } <line_num>: 204,241
@Test [EOL] public void testCompareToEpsilon() { [EOL]     Assert.assertEquals(0, Precision.compareTo(152.33, 152.32, .011)); [EOL]     Assert.assertTrue(Precision.compareTo(152.308, 152.32, .011) < 0); [EOL]     Assert.assertTrue(Precision.compareTo(152.33, 152.318, .011) > 0); [EOL]     Assert.assertEquals(0, Precision.compareTo(Double.MIN_VALUE, +0.0, Double.MIN_VALUE)); [EOL]     Assert.assertEquals(0, Precision.compareTo(Double.MIN_VALUE, -0.0, Double.MIN_VALUE)); [EOL] } <line_num>: 243,250
@Test [EOL] public void testCompareToMaxUlps() { [EOL]     double a = 152.32; [EOL]     double delta = FastMath.ulp(a); [EOL]     for (int i = 0; i <= 10; ++i) { [EOL]         if (i <= 5) { [EOL]             Assert.assertEquals(0, Precision.compareTo(a, a + i * delta, 5)); [EOL]             Assert.assertEquals(0, Precision.compareTo(a, a - i * delta, 5)); [EOL]         } else { [EOL]             Assert.assertEquals(-1, Precision.compareTo(a, a + i * delta, 5)); [EOL]             Assert.assertEquals(+1, Precision.compareTo(a, a - i * delta, 5)); [EOL]         } [EOL]     } [EOL]     Assert.assertEquals(0, Precision.compareTo(-0.0, 0.0, 0)); [EOL]     Assert.assertEquals(-1, Precision.compareTo(-Double.MIN_VALUE, -0.0, 0)); [EOL]     Assert.assertEquals(0, Precision.compareTo(-Double.MIN_VALUE, -0.0, 1)); [EOL]     Assert.assertEquals(-1, Precision.compareTo(-Double.MIN_VALUE, +0.0, 0)); [EOL]     Assert.assertEquals(0, Precision.compareTo(-Double.MIN_VALUE, +0.0, 1)); [EOL]     Assert.assertEquals(+1, Precision.compareTo(Double.MIN_VALUE, -0.0, 0)); [EOL]     Assert.assertEquals(0, Precision.compareTo(Double.MIN_VALUE, -0.0, 1)); [EOL]     Assert.assertEquals(+1, Precision.compareTo(Double.MIN_VALUE, +0.0, 0)); [EOL]     Assert.assertEquals(0, Precision.compareTo(Double.MIN_VALUE, +0.0, 1)); [EOL]     Assert.assertEquals(-1, Precision.compareTo(-Double.MIN_VALUE, Double.MIN_VALUE, 0)); [EOL]     Assert.assertEquals(-1, Precision.compareTo(-Double.MIN_VALUE, Double.MIN_VALUE, 1)); [EOL]     Assert.assertEquals(0, Precision.compareTo(-Double.MIN_VALUE, Double.MIN_VALUE, 2)); [EOL]     Assert.assertEquals(0, Precision.compareTo(Double.MAX_VALUE, Double.POSITIVE_INFINITY, 1)); [EOL]     Assert.assertEquals(-1, Precision.compareTo(Double.MAX_VALUE, Double.POSITIVE_INFINITY, 0)); [EOL]     Assert.assertEquals(+1, Precision.compareTo(Double.MAX_VALUE, Double.NaN, Integer.MAX_VALUE)); [EOL]     Assert.assertEquals(+1, Precision.compareTo(Double.NaN, Double.MAX_VALUE, Integer.MAX_VALUE)); [EOL] } <line_num>: 252,287
@Test [EOL] public void testRoundDouble() { [EOL]     double x = 1.234567890; [EOL]     Assert.assertEquals(1.23, Precision.round(x, 2), 0.0); [EOL]     Assert.assertEquals(1.235, Precision.round(x, 3), 0.0); [EOL]     Assert.assertEquals(1.2346, Precision.round(x, 4), 0.0); [EOL]     Assert.assertEquals(39.25, Precision.round(39.245, 2), 0.0); [EOL]     Assert.assertEquals(39.24, Precision.round(39.245, 2, BigDecimal.ROUND_DOWN), 0.0); [EOL]     double xx = 39.0; [EOL]     xx = xx + 245d / 1000d; [EOL]     Assert.assertEquals(39.25, Precision.round(xx, 2), 0.0); [EOL]     Assert.assertEquals(30.1d, Precision.round(30.095d, 2), 0.0d); [EOL]     Assert.assertEquals(30.1d, Precision.round(30.095d, 1), 0.0d); [EOL]     Assert.assertEquals(33.1d, Precision.round(33.095d, 1), 0.0d); [EOL]     Assert.assertEquals(33.1d, Precision.round(33.095d, 2), 0.0d); [EOL]     Assert.assertEquals(50.09d, Precision.round(50.085d, 2), 0.0d); [EOL]     Assert.assertEquals(50.19d, Precision.round(50.185d, 2), 0.0d); [EOL]     Assert.assertEquals(50.01d, Precision.round(50.005d, 2), 0.0d); [EOL]     Assert.assertEquals(30.01d, Precision.round(30.005d, 2), 0.0d); [EOL]     Assert.assertEquals(30.65d, Precision.round(30.645d, 2), 0.0d); [EOL]     Assert.assertEquals(1.24, Precision.round(x, 2, BigDecimal.ROUND_CEILING), 0.0); [EOL]     Assert.assertEquals(1.235, Precision.round(x, 3, BigDecimal.ROUND_CEILING), 0.0); [EOL]     Assert.assertEquals(1.2346, Precision.round(x, 4, BigDecimal.ROUND_CEILING), 0.0); [EOL]     Assert.assertEquals(-1.23, Precision.round(-x, 2, BigDecimal.ROUND_CEILING), 0.0); [EOL]     Assert.assertEquals(-1.234, Precision.round(-x, 3, BigDecimal.ROUND_CEILING), 0.0); [EOL]     Assert.assertEquals(-1.2345, Precision.round(-x, 4, BigDecimal.ROUND_CEILING), 0.0); [EOL]     Assert.assertEquals(1.23, Precision.round(x, 2, BigDecimal.ROUND_DOWN), 0.0); [EOL]     Assert.assertEquals(1.234, Precision.round(x, 3, BigDecimal.ROUND_DOWN), 0.0); [EOL]     Assert.assertEquals(1.2345, Precision.round(x, 4, BigDecimal.ROUND_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.23, Precision.round(-x, 2, BigDecimal.ROUND_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.234, Precision.round(-x, 3, BigDecimal.ROUND_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.2345, Precision.round(-x, 4, BigDecimal.ROUND_DOWN), 0.0); [EOL]     Assert.assertEquals(1.23, Precision.round(x, 2, BigDecimal.ROUND_FLOOR), 0.0); [EOL]     Assert.assertEquals(1.234, Precision.round(x, 3, BigDecimal.ROUND_FLOOR), 0.0); [EOL]     Assert.assertEquals(1.2345, Precision.round(x, 4, BigDecimal.ROUND_FLOOR), 0.0); [EOL]     Assert.assertEquals(-1.24, Precision.round(-x, 2, BigDecimal.ROUND_FLOOR), 0.0); [EOL]     Assert.assertEquals(-1.235, Precision.round(-x, 3, BigDecimal.ROUND_FLOOR), 0.0); [EOL]     Assert.assertEquals(-1.2346, Precision.round(-x, 4, BigDecimal.ROUND_FLOOR), 0.0); [EOL]     Assert.assertEquals(1.23, Precision.round(x, 2, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(1.235, Precision.round(x, 3, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(1.2346, Precision.round(x, 4, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.23, Precision.round(-x, 2, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.235, Precision.round(-x, 3, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.2346, Precision.round(-x, 4, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(1.234, Precision.round(1.2345, 3, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.234, Precision.round(-1.2345, 3, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(1.23, Precision.round(x, 2, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(1.235, Precision.round(x, 3, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(1.2346, Precision.round(x, 4, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(-1.23, Precision.round(-x, 2, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(-1.235, Precision.round(-x, 3, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(-1.2346, Precision.round(-x, 4, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(1.234, Precision.round(1.2345, 3, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(-1.234, Precision.round(-1.2345, 3, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(1.236, Precision.round(1.2355, 3, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(-1.236, Precision.round(-1.2355, 3, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(1.23, Precision.round(x, 2, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(1.235, Precision.round(x, 3, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(1.2346, Precision.round(x, 4, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(-1.23, Precision.round(-x, 2, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(-1.235, Precision.round(-x, 3, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(-1.2346, Precision.round(-x, 4, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(1.235, Precision.round(1.2345, 3, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(-1.235, Precision.round(-1.2345, 3, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(-1.23, Precision.round(-1.23, 2, BigDecimal.ROUND_UNNECESSARY), 0.0); [EOL]     Assert.assertEquals(1.23, Precision.round(1.23, 2, BigDecimal.ROUND_UNNECESSARY), 0.0); [EOL]     try { [EOL]         Precision.round(1.234, 2, BigDecimal.ROUND_UNNECESSARY); [EOL]         Assert.fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL]     Assert.assertEquals(1.24, Precision.round(x, 2, BigDecimal.ROUND_UP), 0.0); [EOL]     Assert.assertEquals(1.235, Precision.round(x, 3, BigDecimal.ROUND_UP), 0.0); [EOL]     Assert.assertEquals(1.2346, Precision.round(x, 4, BigDecimal.ROUND_UP), 0.0); [EOL]     Assert.assertEquals(-1.24, Precision.round(-x, 2, BigDecimal.ROUND_UP), 0.0); [EOL]     Assert.assertEquals(-1.235, Precision.round(-x, 3, BigDecimal.ROUND_UP), 0.0); [EOL]     Assert.assertEquals(-1.2346, Precision.round(-x, 4, BigDecimal.ROUND_UP), 0.0); [EOL]     try { [EOL]         Precision.round(1.234, 2, 1923); [EOL]         Assert.fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     Assert.assertEquals(39.25, Precision.round(39.245, 2, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     TestUtils.assertEquals(Double.NaN, Precision.round(Double.NaN, 2), 0.0); [EOL]     Assert.assertEquals(0.0, Precision.round(0.0, 2), 0.0); [EOL]     Assert.assertEquals(Double.POSITIVE_INFINITY, Precision.round(Double.POSITIVE_INFINITY, 2), 0.0); [EOL]     Assert.assertEquals(Double.NEGATIVE_INFINITY, Precision.round(Double.NEGATIVE_INFINITY, 2), 0.0); [EOL] } <line_num>: 289,396
@Test [EOL] public void testRoundFloat() { [EOL]     float x = 1.234567890f; [EOL]     Assert.assertEquals(1.23f, Precision.round(x, 2), 0.0); [EOL]     Assert.assertEquals(1.235f, Precision.round(x, 3), 0.0); [EOL]     Assert.assertEquals(1.2346f, Precision.round(x, 4), 0.0); [EOL]     Assert.assertEquals(30.1f, Precision.round(30.095f, 2), 0.0f); [EOL]     Assert.assertEquals(30.1f, Precision.round(30.095f, 1), 0.0f); [EOL]     Assert.assertEquals(50.09f, Precision.round(50.085f, 2), 0.0f); [EOL]     Assert.assertEquals(50.19f, Precision.round(50.185f, 2), 0.0f); [EOL]     Assert.assertEquals(50.01f, Precision.round(50.005f, 2), 0.0f); [EOL]     Assert.assertEquals(30.01f, Precision.round(30.005f, 2), 0.0f); [EOL]     Assert.assertEquals(30.65f, Precision.round(30.645f, 2), 0.0f); [EOL]     Assert.assertEquals(1.24f, Precision.round(x, 2, BigDecimal.ROUND_CEILING), 0.0); [EOL]     Assert.assertEquals(1.235f, Precision.round(x, 3, BigDecimal.ROUND_CEILING), 0.0); [EOL]     Assert.assertEquals(1.2346f, Precision.round(x, 4, BigDecimal.ROUND_CEILING), 0.0); [EOL]     Assert.assertEquals(-1.23f, Precision.round(-x, 2, BigDecimal.ROUND_CEILING), 0.0); [EOL]     Assert.assertEquals(-1.234f, Precision.round(-x, 3, BigDecimal.ROUND_CEILING), 0.0); [EOL]     Assert.assertEquals(-1.2345f, Precision.round(-x, 4, BigDecimal.ROUND_CEILING), 0.0); [EOL]     Assert.assertEquals(1.23f, Precision.round(x, 2, BigDecimal.ROUND_DOWN), 0.0); [EOL]     Assert.assertEquals(1.234f, Precision.round(x, 3, BigDecimal.ROUND_DOWN), 0.0); [EOL]     Assert.assertEquals(1.2345f, Precision.round(x, 4, BigDecimal.ROUND_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.23f, Precision.round(-x, 2, BigDecimal.ROUND_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.234f, Precision.round(-x, 3, BigDecimal.ROUND_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.2345f, Precision.round(-x, 4, BigDecimal.ROUND_DOWN), 0.0); [EOL]     Assert.assertEquals(1.23f, Precision.round(x, 2, BigDecimal.ROUND_FLOOR), 0.0); [EOL]     Assert.assertEquals(1.234f, Precision.round(x, 3, BigDecimal.ROUND_FLOOR), 0.0); [EOL]     Assert.assertEquals(1.2345f, Precision.round(x, 4, BigDecimal.ROUND_FLOOR), 0.0); [EOL]     Assert.assertEquals(-1.24f, Precision.round(-x, 2, BigDecimal.ROUND_FLOOR), 0.0); [EOL]     Assert.assertEquals(-1.235f, Precision.round(-x, 3, BigDecimal.ROUND_FLOOR), 0.0); [EOL]     Assert.assertEquals(-1.2346f, Precision.round(-x, 4, BigDecimal.ROUND_FLOOR), 0.0); [EOL]     Assert.assertEquals(1.23f, Precision.round(x, 2, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(1.235f, Precision.round(x, 3, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(1.2346f, Precision.round(x, 4, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.23f, Precision.round(-x, 2, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.235f, Precision.round(-x, 3, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.2346f, Precision.round(-x, 4, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(1.234f, Precision.round(1.2345f, 3, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(-1.234f, Precision.round(-1.2345f, 3, BigDecimal.ROUND_HALF_DOWN), 0.0); [EOL]     Assert.assertEquals(1.23f, Precision.round(x, 2, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(1.235f, Precision.round(x, 3, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(1.2346f, Precision.round(x, 4, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(-1.23f, Precision.round(-x, 2, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(-1.235f, Precision.round(-x, 3, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(-1.2346f, Precision.round(-x, 4, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(1.234f, Precision.round(1.2345f, 3, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(-1.234f, Precision.round(-1.2345f, 3, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(1.236f, Precision.round(1.2355f, 3, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(-1.236f, Precision.round(-1.2355f, 3, BigDecimal.ROUND_HALF_EVEN), 0.0); [EOL]     Assert.assertEquals(1.23f, Precision.round(x, 2, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(1.235f, Precision.round(x, 3, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(1.2346f, Precision.round(x, 4, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(-1.23f, Precision.round(-x, 2, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(-1.235f, Precision.round(-x, 3, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(-1.2346f, Precision.round(-x, 4, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(1.235f, Precision.round(1.2345f, 3, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(-1.235f, Precision.round(-1.2345f, 3, BigDecimal.ROUND_HALF_UP), 0.0); [EOL]     Assert.assertEquals(-1.23f, Precision.round(-1.23f, 2, BigDecimal.ROUND_UNNECESSARY), 0.0); [EOL]     Assert.assertEquals(1.23f, Precision.round(1.23f, 2, BigDecimal.ROUND_UNNECESSARY), 0.0); [EOL]     try { [EOL]         Precision.round(1.234f, 2, BigDecimal.ROUND_UNNECESSARY); [EOL]         Assert.fail(); [EOL]     } catch (MathArithmeticException ex) { [EOL]     } [EOL]     Assert.assertEquals(1.24f, Precision.round(x, 2, BigDecimal.ROUND_UP), 0.0); [EOL]     Assert.assertEquals(1.235f, Precision.round(x, 3, BigDecimal.ROUND_UP), 0.0); [EOL]     Assert.assertEquals(1.2346f, Precision.round(x, 4, BigDecimal.ROUND_UP), 0.0); [EOL]     Assert.assertEquals(-1.24f, Precision.round(-x, 2, BigDecimal.ROUND_UP), 0.0); [EOL]     Assert.assertEquals(-1.235f, Precision.round(-x, 3, BigDecimal.ROUND_UP), 0.0); [EOL]     Assert.assertEquals(-1.2346f, Precision.round(-x, 4, BigDecimal.ROUND_UP), 0.0); [EOL]     try { [EOL]         Precision.round(1.234f, 2, 1923); [EOL]         Assert.fail(); [EOL]     } catch (MathIllegalArgumentException ex) { [EOL]     } [EOL]     TestUtils.assertEquals(Float.NaN, Precision.round(Float.NaN, 2), 0.0f); [EOL]     Assert.assertEquals(0.0f, Precision.round(0.0f, 2), 0.0f); [EOL]     Assert.assertEquals(Float.POSITIVE_INFINITY, Precision.round(Float.POSITIVE_INFINITY, 2), 0.0f); [EOL]     Assert.assertEquals(Float.NEGATIVE_INFINITY, Precision.round(Float.NEGATIVE_INFINITY, 2), 0.0f); [EOL] } <line_num>: 398,493
@Test [EOL] public void testIssue721() { [EOL]     Assert.assertEquals(-53, FastMath.getExponent(Precision.EPSILON)); [EOL]     Assert.assertEquals(-1022, FastMath.getExponent(Precision.SAFE_MIN)); [EOL] } <line_num>: 496,500
@Test [EOL] public void testRepresentableDelta() { [EOL]     int nonRepresentableCount = 0; [EOL]     final double x = 100; [EOL]     final int numTrials = 10000; [EOL]     for (int i = 0; i < numTrials; i++) { [EOL]         final double originalDelta = Math.random(); [EOL]         final double delta = Precision.representableDelta(x, originalDelta); [EOL]         if (delta != originalDelta) { [EOL]             ++nonRepresentableCount; [EOL]         } [EOL]     } [EOL]     Assert.assertTrue(nonRepresentableCount / (double) numTrials > 0.9); [EOL] } <line_num>: 503,517
@Test [EOL] public void testMath843() { [EOL]     final double afterEpsilon = FastMath.nextAfter(Precision.EPSILON, Double.POSITIVE_INFINITY); [EOL]     Assert.assertTrue(1 + Precision.EPSILON == 1); [EOL]     Assert.assertFalse(1 + afterEpsilon == 1); [EOL] } <line_num>: 519,529