protected RealMatrix getX()
protected RealVector getY()
public boolean isNoIntercept()
public void setNoIntercept(boolean noIntercept)
public void newSampleData(double[] data, int nobs, int nvars)
protected void newYSampleData(double[] y)
protected void newXSampleData(double[][] x)
protected void validateSampleData(double[][] x, double[] y) throws MathIllegalArgumentException
protected void validateCovarianceData(double[][] x, double[][] covariance)
public double[] estimateRegressionParameters()
public double[] estimateResiduals()
public double[][] estimateRegressionParametersVariance()
public double[] estimateRegressionParametersStandardErrors()
public double estimateRegressandVariance()
public double estimateErrorVariance()
public double estimateRegressionStandardError()
protected abstract RealVector calculateBeta()
protected abstract RealMatrix calculateBetaVariance()
protected double calculateYVariance()
protected double calculateErrorVariance()
protected RealVector calculateResiduals()
