@Test [EOL] public void testZero() { [EOL]     Assert.assertEquals(BigReal.ZERO, BigRealField.getInstance().getZero()); [EOL] } <line_num>: 26,29
@Test [EOL] public void testOne() { [EOL]     Assert.assertEquals(BigReal.ONE, BigRealField.getInstance().getOne()); [EOL] } <line_num>: 31,34
@Test [EOL] public void testSerial() { [EOL]     BigRealField field = BigRealField.getInstance(); [EOL]     Assert.assertTrue(field == TestUtils.serializeAndRecover(field)); [EOL] } <line_num>: 36,41
