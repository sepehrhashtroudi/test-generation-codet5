@Test [EOL] public void testDistance() { [EOL]     Vector2D start = new Vector2D(2, 2); [EOL]     Vector2D end = new Vector2D(-2, -2); [EOL]     Segment segment = new Segment(start, end, new Line(start, end)); [EOL]     Assert.assertEquals(FastMath.sqrt(2), segment.distance(new Vector2D(1, -1)), 1.0e-10); [EOL]     Assert.assertEquals(FastMath.sin(Math.PI / 4.0), segment.distance(new Vector2D(0, -1)), 1.0e-10); [EOL]     Assert.assertEquals(FastMath.sqrt(8), segment.distance(new Vector2D(0, 4)), 1.0e-10); [EOL]     Assert.assertEquals(FastMath.sqrt(8), segment.distance(new Vector2D(0, -4)), 1.0e-10); [EOL] } <line_num>: 27,44