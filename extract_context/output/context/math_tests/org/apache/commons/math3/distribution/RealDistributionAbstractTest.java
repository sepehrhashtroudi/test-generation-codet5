public abstract RealDistribution makeDistribution()
public abstract double[] makeCumulativeTestPoints()
public abstract double[] makeCumulativeTestValues()
public abstract double[] makeDensityTestValues()
public double[] makeInverseCumulativeTestPoints()
public double[] makeInverseCumulativeTestValues()
public void setUp()
public void tearDown()
protected void verifyCumulativeProbabilities()
protected void verifyInverseCumulativeProbabilities()
protected void verifyDensities()
public void testCumulativeProbabilities()
public void testInverseCumulativeProbabilities()
public void testDensities()
public void testConsistency()
public void testIllegalArguments()
public void testSampling()
public double value(double x)
public void testDensityIntegrals()
public void testIsSupportLowerBoundInclusive()
public void testIsSupportUpperBoundInclusive()
public void testDistributionClone() throws IOException, ClassNotFoundException
protected double[] getCumulativeTestPoints()
protected void setCumulativeTestPoints(double[] cumulativeTestPoints)
protected double[] getCumulativeTestValues()
protected void setCumulativeTestValues(double[] cumulativeTestValues)
protected double[] getDensityTestValues()
protected void setDensityTestValues(double[] densityTestValues)
protected RealDistribution getDistribution()
protected void setDistribution(RealDistribution distribution)
protected double[] getInverseCumulativeTestPoints()
protected void setInverseCumulativeTestPoints(double[] inverseCumulativeTestPoints)
protected double[] getInverseCumulativeTestValues()
protected void setInverseCumulativeTestValues(double[] inverseCumulativeTestValues)
protected double getTolerance()
protected void setTolerance(double tolerance)
private RealDistribution deepClone() throws IOException, ClassNotFoundException
RealDistribution distribution
double tolerance=Optional[1E-4]
double[] cumulativeTestPoints
double[] cumulativeTestValues
double[] inverseCumulativeTestPoints
double[] inverseCumulativeTestValues
double[] densityTestValues
