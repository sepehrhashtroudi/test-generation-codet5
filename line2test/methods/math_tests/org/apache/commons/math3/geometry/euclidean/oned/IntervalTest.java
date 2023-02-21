@Test [EOL] public void testInterval() { [EOL]     Interval interval = new Interval(2.3, 5.7); [EOL]     Assert.assertEquals(3.4, interval.getSize(), 1.0e-10); [EOL]     Assert.assertEquals(4.0, interval.getBarycenter(), 1.0e-10); [EOL]     Assert.assertEquals(Region.Location.BOUNDARY, interval.checkPoint(2.3, 1.0e-10)); [EOL]     Assert.assertEquals(Region.Location.BOUNDARY, interval.checkPoint(5.7, 1.0e-10)); [EOL]     Assert.assertEquals(Region.Location.OUTSIDE, interval.checkPoint(1.2, 1.0e-10)); [EOL]     Assert.assertEquals(Region.Location.OUTSIDE, interval.checkPoint(8.7, 1.0e-10)); [EOL]     Assert.assertEquals(Region.Location.INSIDE, interval.checkPoint(3.0, 1.0e-10)); [EOL]     Assert.assertEquals(2.3, interval.getInf(), 1.0e-10); [EOL]     Assert.assertEquals(5.7, interval.getSup(), 1.0e-10); [EOL] } <line_num>: 27,39
@Test [EOL] public void testTolerance() { [EOL]     Interval interval = new Interval(2.3, 5.7); [EOL]     Assert.assertEquals(Region.Location.OUTSIDE, interval.checkPoint(1.2, 1.0)); [EOL]     Assert.assertEquals(Region.Location.BOUNDARY, interval.checkPoint(1.2, 1.2)); [EOL]     Assert.assertEquals(Region.Location.OUTSIDE, interval.checkPoint(8.7, 2.9)); [EOL]     Assert.assertEquals(Region.Location.BOUNDARY, interval.checkPoint(8.7, 3.1)); [EOL]     Assert.assertEquals(Region.Location.INSIDE, interval.checkPoint(3.0, 0.6)); [EOL]     Assert.assertEquals(Region.Location.BOUNDARY, interval.checkPoint(3.0, 0.8)); [EOL] } <line_num>: 41,50
@Test [EOL] public void testInfinite() { [EOL]     Interval interval = new Interval(9.0, Double.POSITIVE_INFINITY); [EOL]     Assert.assertEquals(Region.Location.BOUNDARY, interval.checkPoint(9.0, 1.0e-10)); [EOL]     Assert.assertEquals(Region.Location.OUTSIDE, interval.checkPoint(8.4, 1.0e-10)); [EOL]     for (double e = 1.0; e <= 6.0; e += 1.0) { [EOL]         Assert.assertEquals(Region.Location.INSIDE, interval.checkPoint(FastMath.pow(10.0, e), 1.0e-10)); [EOL]     } [EOL]     Assert.assertTrue(Double.isInfinite(interval.getSize())); [EOL]     Assert.assertEquals(9.0, interval.getInf(), 1.0e-10); [EOL]     Assert.assertTrue(Double.isInfinite(interval.getSup())); [EOL] } <line_num>: 52,65
@Test [EOL] public void testSinglePoint() { [EOL]     Interval interval = new Interval(1.0, 1.0); [EOL]     Assert.assertEquals(0.0, interval.getSize(), Precision.SAFE_MIN); [EOL]     Assert.assertEquals(1.0, interval.getBarycenter(), Precision.EPSILON); [EOL] } <line_num>: 67,72
