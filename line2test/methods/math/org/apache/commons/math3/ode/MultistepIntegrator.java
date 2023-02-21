protected MultistepIntegrator(final String name, final int nSteps, final int order, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) throws NumberIsTooSmallException { [EOL]     super(name, minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance); [EOL]     if (nSteps < 2) { [EOL]         throw new NumberIsTooSmallException(LocalizedFormats.INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS, nSteps, 2, true); [EOL]     } [EOL]     starter = new DormandPrince853Integrator(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance); [EOL]     this.nSteps = nSteps; [EOL]     exp = -1.0 / order; [EOL]     setSafety(0.9); [EOL]     setMinReduction(0.2); [EOL]     setMaxGrowth(FastMath.pow(2.0, -exp)); [EOL] } <line_num>: 111,138
protected MultistepIntegrator(final String name, final int nSteps, final int order, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance) { [EOL]     super(name, minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance); [EOL]     starter = new DormandPrince853Integrator(minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance); [EOL]     this.nSteps = nSteps; [EOL]     exp = -1.0 / order; [EOL]     setSafety(0.9); [EOL]     setMinReduction(0.2); [EOL]     setMaxGrowth(FastMath.pow(2.0, -exp)); [EOL] } <line_num>: 159,177
public NordsieckInitializer(final int nSteps, final int n) { [EOL]     this.count = 0; [EOL]     this.t = new double[nSteps]; [EOL]     this.y = new double[nSteps][n]; [EOL]     this.yDot = new double[nSteps][n]; [EOL] } <line_num>: 359,364
public InitializationCompletedMarkerException() { [EOL]     super((Throwable) null); [EOL] } <line_num>: 442,444
public ODEIntegrator getStarterIntegrator() { [EOL]     return starter; [EOL] } <line_num>: 183,185
public void setStarterIntegrator(FirstOrderIntegrator starterIntegrator) { [EOL]     this.starter = starterIntegrator; [EOL] } <line_num>: 194,196
public int getDimension() { [EOL]     return getExpandable().getTotalDimension(); [EOL] } <line_num>: 238,240
public void computeDerivatives(double t, double[] y, double[] yDot) { [EOL]     getExpandable().computeDerivatives(t, y, yDot); [EOL] } <line_num>: 243,245
protected void start(final double t0, final double[] y0, final double t) throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException { [EOL]     starter.clearEventHandlers(); [EOL]     starter.clearStepHandlers(); [EOL]     starter.addStepHandler(new NordsieckInitializer(nSteps, y0.length)); [EOL]     try { [EOL]         if (starter instanceof AbstractIntegrator) { [EOL]             ((AbstractIntegrator) starter).integrate(getExpandable(), t); [EOL]         } else { [EOL]             starter.integrate(new FirstOrderDifferentialEquations() { [EOL]  [EOL]                 public int getDimension() { [EOL]                     return getExpandable().getTotalDimension(); [EOL]                 } [EOL]  [EOL]                 public void computeDerivatives(double t, double[] y, double[] yDot) { [EOL]                     getExpandable().computeDerivatives(t, y, yDot); [EOL]                 } [EOL]             }, t0, y0, t, new double[y0.length]); [EOL]         } [EOL]     } catch (InitializationCompletedMarkerException icme) { [EOL]         getEvaluationsCounter().incrementCount(starter.getEvaluations()); [EOL]     } [EOL]     starter.clearStepHandlers(); [EOL] } <line_num>: 216,261
protected abstract Array2DRowRealMatrix initializeHighOrderDerivatives(final double h, final double[] t, final double[][] y, final double[][] yDot); <line_num>: 271,273
public double getMinReduction() { [EOL]     return minReduction; [EOL] } <line_num>: 278,280
public void setMinReduction(final double minReduction) { [EOL]     this.minReduction = minReduction; [EOL] } <line_num>: 285,287
public double getMaxGrowth() { [EOL]     return maxGrowth; [EOL] } <line_num>: 292,294
public void setMaxGrowth(final double maxGrowth) { [EOL]     this.maxGrowth = maxGrowth; [EOL] } <line_num>: 299,301
public double getSafety() { [EOL]     return safety; [EOL] } <line_num>: 306,308
public void setSafety(final double safety) { [EOL]     this.safety = safety; [EOL] } <line_num>: 313,315
protected double computeStepGrowShrinkFactor(final double error) { [EOL]     return FastMath.min(maxGrowth, FastMath.max(minReduction, safety * FastMath.pow(error, exp))); [EOL] } <line_num>: 321,323
Array2DRowRealMatrix initializeHighOrderDerivatives(final double h, final double[] t, final double[][] y, final double[][] yDot); <line_num>: 335,337
public void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException { [EOL]     final double prev = interpolator.getPreviousTime(); [EOL]     final double curr = interpolator.getCurrentTime(); [EOL]     if (count == 0) { [EOL]         interpolator.setInterpolatedTime(prev); [EOL]         t[0] = prev; [EOL]         final ExpandableStatefulODE expandable = getExpandable(); [EOL]         final EquationsMapper primary = expandable.getPrimaryMapper(); [EOL]         primary.insertEquationData(interpolator.getInterpolatedState(), y[count]); [EOL]         primary.insertEquationData(interpolator.getInterpolatedDerivatives(), yDot[count]); [EOL]         int index = 0; [EOL]         for (final EquationsMapper secondary : expandable.getSecondaryMappers()) { [EOL]             secondary.insertEquationData(interpolator.getInterpolatedSecondaryState(index), y[count]); [EOL]             secondary.insertEquationData(interpolator.getInterpolatedSecondaryDerivatives(index), yDot[count]); [EOL]             ++index; [EOL]         } [EOL]     } [EOL]     ++count; [EOL]     interpolator.setInterpolatedTime(curr); [EOL]     t[count] = curr; [EOL]     final ExpandableStatefulODE expandable = getExpandable(); [EOL]     final EquationsMapper primary = expandable.getPrimaryMapper(); [EOL]     primary.insertEquationData(interpolator.getInterpolatedState(), y[count]); [EOL]     primary.insertEquationData(interpolator.getInterpolatedDerivatives(), yDot[count]); [EOL]     int index = 0; [EOL]     for (final EquationsMapper secondary : expandable.getSecondaryMappers()) { [EOL]         secondary.insertEquationData(interpolator.getInterpolatedSecondaryState(index), y[count]); [EOL]         secondary.insertEquationData(interpolator.getInterpolatedSecondaryDerivatives(index), yDot[count]); [EOL]         ++index; [EOL]     } [EOL]     if (count == t.length - 1) { [EOL]         stepStart = t[0]; [EOL]         stepSize = (t[t.length - 1] - t[0]) / (t.length - 1); [EOL]         scaled = yDot[0].clone(); [EOL]         for (int j = 0; j < scaled.length; ++j) { [EOL]             scaled[j] *= stepSize; [EOL]         } [EOL]         nordsieck = initializeHighOrderDerivatives(stepSize, t, y, yDot); [EOL]         throw new InitializationCompletedMarkerException(); [EOL]     } [EOL] } <line_num>: 367,425
public void init(double t0, double[] y0, double time) { [EOL] } <line_num>: 428,430
