protected MultistepIntegrator(final String name, final int nSteps, final int order, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) throws NumberIsTooSmallException
protected MultistepIntegrator(final String name, final int nSteps, final int order, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance)
public NordsieckInitializer(final int nSteps, final int n)
public InitializationCompletedMarkerException()
public ODEIntegrator getStarterIntegrator()
public void setStarterIntegrator(FirstOrderIntegrator starterIntegrator)
public int getDimension()
public void computeDerivatives(double t, double[] y, double[] yDot)
protected void start(final double t0, final double[] y0, final double t) throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
protected abstract Array2DRowRealMatrix initializeHighOrderDerivatives(final double h, final double[] t, final double[][] y, final double[][] yDot)
public double getMinReduction()
public void setMinReduction(final double minReduction)
public double getMaxGrowth()
public void setMaxGrowth(final double maxGrowth)
public double getSafety()
public void setSafety(final double safety)
protected double computeStepGrowShrinkFactor(final double error)
 Array2DRowRealMatrix initializeHighOrderDerivatives(final double h, final double[] t, final double[][] y, final double[][] yDot)
public void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException
public void init(double t0, double[] y0, double time)
double[] scaled
Array2DRowRealMatrix nordsieck
FirstOrderIntegrator starter
int nSteps
double exp
double safety
double minReduction
double maxGrowth