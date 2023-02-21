private MillerUpdatingRegression()
public MillerUpdatingRegression(int numberOfVariables, boolean includeConstant, double errorTolerance) throws ModelSpecificationException
public MillerUpdatingRegression(int numberOfVariables, boolean includeConstant) throws ModelSpecificationException
public boolean hasIntercept()
public long getN()
public void addObservation(final double[] x, final double y) throws ModelSpecificationException
public void addObservations(double[][] x, double[] y) throws ModelSpecificationException
private void include(final double[] x, final double wi, final double yi)
private double smartAdd(double a, double b)
public void clear()
private void tolset()
private double[] regcf(int nreq) throws ModelSpecificationException
private void singcheck()
private void ss()
private double[] cov(int nreq)
private void inverse(double[] rinv, int nreq)
public double[] getPartialCorrelations(int in)
private void vmove(int from, int to)
private int reorderRegressors(int[] list, int pos1)
public double getDiagonalOfHatMatrix(double[] row_data)
public int[] getOrderOfRegressors()
public RegressionResults regress() throws ModelSpecificationException
public RegressionResults regress(int numberOfRegressors) throws ModelSpecificationException
public RegressionResults regress(int[] variablesToInclude) throws ModelSpecificationException
