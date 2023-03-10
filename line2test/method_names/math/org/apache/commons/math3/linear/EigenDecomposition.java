public EigenDecomposition(final RealMatrix matrix) throws MathArithmeticException
public EigenDecomposition(final RealMatrix matrix, final double splitTolerance) throws MathArithmeticException
public EigenDecomposition(final double[] main, final double[] secondary)
public EigenDecomposition(final double[] main, final double[] secondary, final double splitTolerance)
private Solver(final double[] realEigenvalues, final double[] imagEigenvalues, final ArrayRealVector[] eigenvectors)
public RealMatrix getV()
public RealMatrix getD()
public RealMatrix getVT()
public boolean hasComplexEigenvalues()
public double[] getRealEigenvalues()
public double getRealEigenvalue(final int i)
public double[] getImagEigenvalues()
public double getImagEigenvalue(final int i)
public RealVector getEigenvector(final int i)
public double getDeterminant()
public RealMatrix getSquareRoot()
public DecompositionSolver getSolver()
public RealVector solve(final RealVector b)
public RealMatrix solve(RealMatrix b)
public boolean isNonSingular()
public RealMatrix getInverse()
private void transformToTridiagonal(final RealMatrix matrix)
private void findEigenVectors(final double[][] householderMatrix)
private SchurTransformer transformToSchur(final RealMatrix matrix)
private Complex cdiv(final double xr, final double xi, final double yr, final double yi)
private void findEigenVectorsFromSchur(final SchurTransformer schur) throws MathArithmeticException
