@Test [EOL] public void testSolveDimensionErrors() { [EOL]     DecompositionSolver solver = new CholeskyDecomposition(MatrixUtils.createRealMatrix(testData)).getSolver(); [EOL]     RealMatrix b = MatrixUtils.createRealMatrix(new double[2][2]); [EOL]     try { [EOL]         solver.solve(b); [EOL]         Assert.fail("an exception should have been thrown"); [EOL]     } catch (MathIllegalArgumentException iae) { [EOL]     } [EOL]     try { [EOL]         solver.solve(b.getColumnVector(0)); [EOL]         Assert.fail("an exception should have been thrown"); [EOL]     } catch (MathIllegalArgumentException iae) { [EOL]     } [EOL]     try { [EOL]         solver.solve(new ArrayRealVectorTest.RealVectorTestImpl(b.getColumn(0))); [EOL]         Assert.fail("an exception should have been thrown"); [EOL]     } catch (MathIllegalArgumentException iae) { [EOL]     } [EOL] } <line_num>: 36,59
@Test [EOL] public void testSolve() { [EOL]     DecompositionSolver solver = new CholeskyDecomposition(MatrixUtils.createRealMatrix(testData)).getSolver(); [EOL]     RealMatrix b = MatrixUtils.createRealMatrix(new double[][] { { 78, -13, 1 }, { 414, -62, -1 }, { 1312, -202, -37 }, { 2989, -542, 145 }, { 5510, -1465, 201 } }); [EOL]     RealMatrix xRef = MatrixUtils.createRealMatrix(new double[][] { { 1, 0, 1 }, { 0, 1, 1 }, { 2, 1, -4 }, { 2, 2, 2 }, { 5, -3, 0 } }); [EOL]     Assert.assertEquals(0, solver.solve(b).subtract(xRef).getNorm(), 1.0e-13); [EOL]     for (int i = 0; i < b.getColumnDimension(); ++i) { [EOL]         Assert.assertEquals(0, solver.solve(b.getColumnVector(i)).subtract(xRef.getColumnVector(i)).getNorm(), 1.0e-13); [EOL]     } [EOL]     for (int i = 0; i < b.getColumnDimension(); ++i) { [EOL]         ArrayRealVectorTest.RealVectorTestImpl v = new ArrayRealVectorTest.RealVectorTestImpl(b.getColumn(i)); [EOL]         Assert.assertEquals(0, solver.solve(v).subtract(xRef.getColumnVector(i)).getNorm(), 1.0e-13); [EOL]     } [EOL] } <line_num>: 62,100
@Test [EOL] public void testDeterminant() { [EOL]     Assert.assertEquals(7290000.0, getDeterminant(MatrixUtils.createRealMatrix(testData)), 1.0e-15); [EOL] } <line_num>: 103,106
private double getDeterminant(RealMatrix m) { [EOL]     return new CholeskyDecomposition(m).getDeterminant(); [EOL] } <line_num>: 108,110