public LUDecomposition(RealMatrix matrix)
public LUDecomposition(RealMatrix matrix, double singularityThreshold)
private Solver(final double[][] lu, final int[] pivot, final boolean singular)
public RealMatrix getL()
public RealMatrix getU()
public RealMatrix getP()
public int[] getPivot()
public double getDeterminant()
public DecompositionSolver getSolver()
public boolean isNonSingular()
public RealVector solve(RealVector b)
public RealMatrix solve(RealMatrix b)
public RealMatrix getInverse()
double DEFAULT_TOO_SMALL=Optional[1e-11]
double[][] lu
int[] pivot
boolean even
boolean singular
RealMatrix cachedL
RealMatrix cachedU
RealMatrix cachedP
