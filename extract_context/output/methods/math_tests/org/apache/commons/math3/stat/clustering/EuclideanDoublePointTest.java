@Test [EOL] public void testArrayIsReference() { [EOL]     final double[] array = { -3.0, -2.0, -1.0, 0.0, 1.0 }; [EOL]     Assert.assertArrayEquals(array, new EuclideanDoublePoint(array).getPoint(), 1.0e-15); [EOL] } <line_num>: 29,33
@Test [EOL] public void testDistance() { [EOL]     final EuclideanDoublePoint e1 = new EuclideanDoublePoint(new double[] { -3.0, -2.0, -1.0, 0.0, 1.0 }); [EOL]     final EuclideanDoublePoint e2 = new EuclideanDoublePoint(new double[] { 1.0, 0.0, -1.0, 1.0, 1.0 }); [EOL]     Assert.assertEquals(FastMath.sqrt(21.0), e1.distanceFrom(e2), 1.0e-15); [EOL]     Assert.assertEquals(0.0, e1.distanceFrom(e1), 1.0e-15); [EOL]     Assert.assertEquals(0.0, e2.distanceFrom(e2), 1.0e-15); [EOL] } <line_num>: 35,42
@Test [EOL] public void testCentroid() { [EOL]     final List<EuclideanDoublePoint> list = new ArrayList<EuclideanDoublePoint>(); [EOL]     list.add(new EuclideanDoublePoint(new double[] { 1.0, 3.0 })); [EOL]     list.add(new EuclideanDoublePoint(new double[] { 2.0, 2.0 })); [EOL]     list.add(new EuclideanDoublePoint(new double[] { 3.0, 3.0 })); [EOL]     list.add(new EuclideanDoublePoint(new double[] { 2.0, 4.0 })); [EOL]     final EuclideanDoublePoint c = list.get(0).centroidOf(list); [EOL]     Assert.assertEquals(2.0, c.getPoint()[0], 1.0e-15); [EOL]     Assert.assertEquals(3.0, c.getPoint()[1], 1.0e-15); [EOL] } <line_num>: 44,54
@Test [EOL] public void testSerial() { [EOL]     final EuclideanDoublePoint p = new EuclideanDoublePoint(new double[] { -3.0, -2.0, -1.0, 0.0, 1.0 }); [EOL]     Assert.assertEquals(p, TestUtils.serializeAndRecover(p)); [EOL] } <line_num>: 56,60
