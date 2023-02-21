public MultivariateNormalMixtureExpectationMaximization(double[][] data) throws NotStrictlyPositiveException, DimensionMismatchException, NumberIsTooSmallException
 DataRow(final double[] data)
public void fit(final MixtureMultivariateNormalDistribution initialMixture, final int maxIterations, final double threshold) throws SingularMatrixException, NotStrictlyPositiveException, DimensionMismatchException
public void fit(MixtureMultivariateNormalDistribution initialMixture) throws SingularMatrixException, NotStrictlyPositiveException
public static MixtureMultivariateNormalDistribution estimate(final double[][] data, final int numComponents) throws NotStrictlyPositiveException, DimensionMismatchException
public double getLogLikelihood()
public MixtureMultivariateNormalDistribution getFittedModel()
public int compareTo(final DataRow other)
public boolean equals(Object other)
public int hashCode()
public double[] getRow()
