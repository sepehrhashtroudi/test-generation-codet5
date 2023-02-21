@Test [EOL] public void testCoordinatesStoC() throws DimensionMismatchException { [EOL]     double piO2 = 0.5 * FastMath.PI; [EOL]     SphericalCoordinates sc1 = new SphericalCoordinates(2.0, 0, piO2); [EOL]     Assert.assertEquals(0, sc1.getCartesian().distance(new Vector3D(2, 0, 0)), 1.0e-10); [EOL]     SphericalCoordinates sc2 = new SphericalCoordinates(2.0, piO2, piO2); [EOL]     Assert.assertEquals(0, sc2.getCartesian().distance(new Vector3D(0, 2, 0)), 1.0e-10); [EOL]     SphericalCoordinates sc3 = new SphericalCoordinates(2.0, FastMath.PI, piO2); [EOL]     Assert.assertEquals(0, sc3.getCartesian().distance(new Vector3D(-2, 0, 0)), 1.0e-10); [EOL]     SphericalCoordinates sc4 = new SphericalCoordinates(2.0, -piO2, piO2); [EOL]     Assert.assertEquals(0, sc4.getCartesian().distance(new Vector3D(0, -2, 0)), 1.0e-10); [EOL]     SphericalCoordinates sc5 = new SphericalCoordinates(2.0, 1.23456, 0); [EOL]     Assert.assertEquals(0, sc5.getCartesian().distance(new Vector3D(0, 0, 2)), 1.0e-10); [EOL]     SphericalCoordinates sc6 = new SphericalCoordinates(2.0, 6.54321, FastMath.PI); [EOL]     Assert.assertEquals(0, sc6.getCartesian().distance(new Vector3D(0, 0, -2)), 1.0e-10); [EOL] } <line_num>: 29,44
@Test [EOL] public void testCoordinatesCtoS() throws DimensionMismatchException { [EOL]     double piO2 = 0.5 * FastMath.PI; [EOL]     SphericalCoordinates sc1 = new SphericalCoordinates(new Vector3D(2, 0, 0)); [EOL]     Assert.assertEquals(2, sc1.getR(), 1.0e-10); [EOL]     Assert.assertEquals(0, sc1.getTheta(), 1.0e-10); [EOL]     Assert.assertEquals(piO2, sc1.getPhi(), 1.0e-10); [EOL]     SphericalCoordinates sc2 = new SphericalCoordinates(new Vector3D(0, 2, 0)); [EOL]     Assert.assertEquals(2, sc2.getR(), 1.0e-10); [EOL]     Assert.assertEquals(piO2, sc2.getTheta(), 1.0e-10); [EOL]     Assert.assertEquals(piO2, sc2.getPhi(), 1.0e-10); [EOL]     SphericalCoordinates sc3 = new SphericalCoordinates(new Vector3D(-2, 0, 0)); [EOL]     Assert.assertEquals(2, sc3.getR(), 1.0e-10); [EOL]     Assert.assertEquals(FastMath.PI, sc3.getTheta(), 1.0e-10); [EOL]     Assert.assertEquals(piO2, sc3.getPhi(), 1.0e-10); [EOL]     SphericalCoordinates sc4 = new SphericalCoordinates(new Vector3D(0, -2, 0)); [EOL]     Assert.assertEquals(2, sc4.getR(), 1.0e-10); [EOL]     Assert.assertEquals(-piO2, sc4.getTheta(), 1.0e-10); [EOL]     Assert.assertEquals(piO2, sc4.getPhi(), 1.0e-10); [EOL]     SphericalCoordinates sc5 = new SphericalCoordinates(new Vector3D(0, 0, 2)); [EOL]     Assert.assertEquals(2, sc5.getR(), 1.0e-10); [EOL]     Assert.assertEquals(0, sc5.getPhi(), 1.0e-10); [EOL]     SphericalCoordinates sc6 = new SphericalCoordinates(new Vector3D(0, 0, -2)); [EOL]     Assert.assertEquals(2, sc6.getR(), 1.0e-10); [EOL]     Assert.assertEquals(FastMath.PI, sc6.getPhi(), 1.0e-10); [EOL] } <line_num>: 46,73
@Test [EOL] public void testGradient() { [EOL]     for (double r = 0.2; r < 10; r += 0.5) { [EOL]         for (double theta = 0; theta < 2 * FastMath.PI; theta += 0.1) { [EOL]             for (double phi = 0.1; phi < FastMath.PI; phi += 0.1) { [EOL]                 SphericalCoordinates sc = new SphericalCoordinates(r, theta, phi); [EOL]                 DerivativeStructure svalue = valueSpherical(new DerivativeStructure(3, 1, 0, r), new DerivativeStructure(3, 1, 1, theta), new DerivativeStructure(3, 1, 2, phi)); [EOL]                 double[] sGradient = new double[] { svalue.getPartialDerivative(1, 0, 0), svalue.getPartialDerivative(0, 1, 0), svalue.getPartialDerivative(0, 0, 1) }; [EOL]                 DerivativeStructure cvalue = valueCartesian(new DerivativeStructure(3, 1, 0, sc.getCartesian().getX()), new DerivativeStructure(3, 1, 1, sc.getCartesian().getY()), new DerivativeStructure(3, 1, 2, sc.getCartesian().getZ())); [EOL]                 Vector3D refCGradient = new Vector3D(cvalue.getPartialDerivative(1, 0, 0), cvalue.getPartialDerivative(0, 1, 0), cvalue.getPartialDerivative(0, 0, 1)); [EOL]                 Vector3D testCGradient = new Vector3D(sc.toCartesianGradient(sGradient)); [EOL]                 Assert.assertEquals(0, testCGradient.distance(refCGradient) / refCGradient.getNorm(), 5.0e-14); [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 75,105
@Test [EOL] public void testHessian() { [EOL]     for (double r = 0.2; r < 10; r += 0.5) { [EOL]         for (double theta = 0; theta < 2 * FastMath.PI; theta += 0.2) { [EOL]             for (double phi = 0.1; phi < FastMath.PI; phi += 0.2) { [EOL]                 SphericalCoordinates sc = new SphericalCoordinates(r, theta, phi); [EOL]                 DerivativeStructure svalue = valueSpherical(new DerivativeStructure(3, 2, 0, r), new DerivativeStructure(3, 2, 1, theta), new DerivativeStructure(3, 2, 2, phi)); [EOL]                 double[] sGradient = new double[] { svalue.getPartialDerivative(1, 0, 0), svalue.getPartialDerivative(0, 1, 0), svalue.getPartialDerivative(0, 0, 1) }; [EOL]                 double[][] sHessian = new double[3][3]; [EOL]                 sHessian[0][0] = svalue.getPartialDerivative(2, 0, 0); [EOL]                 sHessian[1][0] = svalue.getPartialDerivative(1, 1, 0); [EOL]                 sHessian[2][0] = svalue.getPartialDerivative(1, 0, 1); [EOL]                 sHessian[0][1] = Double.NaN; [EOL]                 sHessian[1][1] = svalue.getPartialDerivative(0, 2, 0); [EOL]                 sHessian[2][1] = svalue.getPartialDerivative(0, 1, 1); [EOL]                 sHessian[0][2] = Double.NaN; [EOL]                 sHessian[1][2] = Double.NaN; [EOL]                 sHessian[2][2] = svalue.getPartialDerivative(0, 0, 2); [EOL]                 DerivativeStructure cvalue = valueCartesian(new DerivativeStructure(3, 2, 0, sc.getCartesian().getX()), new DerivativeStructure(3, 2, 1, sc.getCartesian().getY()), new DerivativeStructure(3, 2, 2, sc.getCartesian().getZ())); [EOL]                 double[][] refCHessian = new double[3][3]; [EOL]                 refCHessian[0][0] = cvalue.getPartialDerivative(2, 0, 0); [EOL]                 refCHessian[1][0] = cvalue.getPartialDerivative(1, 1, 0); [EOL]                 refCHessian[2][0] = cvalue.getPartialDerivative(1, 0, 1); [EOL]                 refCHessian[0][1] = refCHessian[1][0]; [EOL]                 refCHessian[1][1] = cvalue.getPartialDerivative(0, 2, 0); [EOL]                 refCHessian[2][1] = cvalue.getPartialDerivative(0, 1, 1); [EOL]                 refCHessian[0][2] = refCHessian[2][0]; [EOL]                 refCHessian[1][2] = refCHessian[2][1]; [EOL]                 refCHessian[2][2] = cvalue.getPartialDerivative(0, 0, 2); [EOL]                 double norm = 0; [EOL]                 for (int i = 0; i < 3; ++i) { [EOL]                     for (int j = 0; j < 3; ++j) { [EOL]                         norm = FastMath.max(norm, FastMath.abs(refCHessian[i][j])); [EOL]                     } [EOL]                 } [EOL]                 double[][] testCHessian = sc.toCartesianHessian(sHessian, sGradient); [EOL]                 for (int i = 0; i < 3; ++i) { [EOL]                     for (int j = 0; j < 3; ++j) { [EOL]                         Assert.assertEquals("" + FastMath.abs((refCHessian[i][j] - testCHessian[i][j]) / norm), refCHessian[i][j], testCHessian[i][j], 1.0e-14 * norm); [EOL]                     } [EOL]                 } [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 107,164
public DerivativeStructure valueCartesian(DerivativeStructure x, DerivativeStructure y, DerivativeStructure z) { [EOL]     return x.divide(y.multiply(5).add(10)).multiply(z.pow(3)); [EOL] } <line_num>: 166,168
public DerivativeStructure valueSpherical(DerivativeStructure r, DerivativeStructure theta, DerivativeStructure phi) { [EOL]     return valueCartesian(r.multiply(theta.cos()).multiply(phi.sin()), r.multiply(theta.sin()).multiply(phi.sin()), r.multiply(phi.cos())); [EOL] } <line_num>: 170,174
@Test [EOL] public void testSerialization() { [EOL]     SphericalCoordinates a = new SphericalCoordinates(3, 2, 1); [EOL]     SphericalCoordinates b = (SphericalCoordinates) TestUtils.serializeAndRecover(a); [EOL]     Assert.assertEquals(0, a.getCartesian().distance(b.getCartesian()), 1.0e-10); [EOL]     Assert.assertEquals(a.getR(), b.getR(), 1.0e-10); [EOL]     Assert.assertEquals(a.getTheta(), b.getTheta(), 1.0e-10); [EOL]     Assert.assertEquals(a.getPhi(), b.getPhi(), 1.0e-10); [EOL] } <line_num>: 176,184
