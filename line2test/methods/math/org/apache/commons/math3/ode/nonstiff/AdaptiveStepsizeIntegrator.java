public AdaptiveStepsizeIntegrator(final String name, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) { [EOL]     super(name); [EOL]     setStepSizeControl(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance); [EOL]     resetInternalState(); [EOL] } <line_num>: 105,114
public AdaptiveStepsizeIntegrator(final String name, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance) { [EOL]     super(name); [EOL]     setStepSizeControl(minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance); [EOL]     resetInternalState(); [EOL] } <line_num>: 128,137
public void setStepSizeControl(final double minimalStep, final double maximalStep, final double absoluteTolerance, final double relativeTolerance) { [EOL]     minStep = FastMath.abs(minimalStep); [EOL]     maxStep = FastMath.abs(maximalStep); [EOL]     initialStep = -1; [EOL]     scalAbsoluteTolerance = absoluteTolerance; [EOL]     scalRelativeTolerance = relativeTolerance; [EOL]     vecAbsoluteTolerance = null; [EOL]     vecRelativeTolerance = null; [EOL] } <line_num>: 153,166
public void setStepSizeControl(final double minimalStep, final double maximalStep, final double[] absoluteTolerance, final double[] relativeTolerance) { [EOL]     minStep = FastMath.abs(minimalStep); [EOL]     maxStep = FastMath.abs(maximalStep); [EOL]     initialStep = -1; [EOL]     scalAbsoluteTolerance = 0; [EOL]     scalRelativeTolerance = 0; [EOL]     vecAbsoluteTolerance = absoluteTolerance.clone(); [EOL]     vecRelativeTolerance = relativeTolerance.clone(); [EOL] } <line_num>: 182,195
public void setInitialStepSize(final double initialStepSize) { [EOL]     if ((initialStepSize < minStep) || (initialStepSize > maxStep)) { [EOL]         initialStep = -1.0; [EOL]     } else { [EOL]         initialStep = initialStepSize; [EOL]     } [EOL] } <line_num>: 208,214
@Override [EOL] protected void sanityChecks(final ExpandableStatefulODE equations, final double t) throws DimensionMismatchException, NumberIsTooSmallException { [EOL]     super.sanityChecks(equations, t); [EOL]     mainSetDimension = equations.getPrimaryMapper().getDimension(); [EOL]     if ((vecAbsoluteTolerance != null) && (vecAbsoluteTolerance.length != mainSetDimension)) { [EOL]         throw new DimensionMismatchException(mainSetDimension, vecAbsoluteTolerance.length); [EOL]     } [EOL]     if ((vecRelativeTolerance != null) && (vecRelativeTolerance.length != mainSetDimension)) { [EOL]         throw new DimensionMismatchException(mainSetDimension, vecRelativeTolerance.length); [EOL]     } [EOL] } <line_num>: 217,233
public double initializeStep(final boolean forward, final int order, final double[] scale, final double t0, final double[] y0, final double[] yDot0, final double[] y1, final double[] yDot1) throws MaxCountExceededException, DimensionMismatchException { [EOL]     if (initialStep > 0) { [EOL]         return forward ? initialStep : -initialStep; [EOL]     } [EOL]     double ratio; [EOL]     double yOnScale2 = 0; [EOL]     double yDotOnScale2 = 0; [EOL]     for (int j = 0; j < scale.length; ++j) { [EOL]         ratio = y0[j] / scale[j]; [EOL]         yOnScale2 += ratio * ratio; [EOL]         ratio = yDot0[j] / scale[j]; [EOL]         yDotOnScale2 += ratio * ratio; [EOL]     } [EOL]     double h = ((yOnScale2 < 1.0e-10) || (yDotOnScale2 < 1.0e-10)) ? 1.0e-6 : (0.01 * FastMath.sqrt(yOnScale2 / yDotOnScale2)); [EOL]     if (!forward) { [EOL]         h = -h; [EOL]     } [EOL]     for (int j = 0; j < y0.length; ++j) { [EOL]         y1[j] = y0[j] + h * yDot0[j]; [EOL]     } [EOL]     computeDerivatives(t0 + h, y1, yDot1); [EOL]     double yDDotOnScale = 0; [EOL]     for (int j = 0; j < scale.length; ++j) { [EOL]         ratio = (yDot1[j] - yDot0[j]) / scale[j]; [EOL]         yDDotOnScale += ratio * ratio; [EOL]     } [EOL]     yDDotOnScale = FastMath.sqrt(yDDotOnScale) / h; [EOL]     final double maxInv2 = FastMath.max(FastMath.sqrt(yDotOnScale2), yDDotOnScale); [EOL]     final double h1 = (maxInv2 < 1.0e-15) ? FastMath.max(1.0e-6, 0.001 * FastMath.abs(h)) : FastMath.pow(0.01 / maxInv2, 1.0 / order); [EOL]     h = FastMath.min(100.0 * FastMath.abs(h), h1); [EOL]     h = FastMath.max(h, 1.0e-12 * FastMath.abs(t0)); [EOL]     if (h < getMinStep()) { [EOL]         h = getMinStep(); [EOL]     } [EOL]     if (h > getMaxStep()) { [EOL]         h = getMaxStep(); [EOL]     } [EOL]     if (!forward) { [EOL]         h = -h; [EOL]     } [EOL]     return h; [EOL] } <line_num>: 248,310
protected double filterStep(final double h, final boolean forward, final boolean acceptSmall) throws NumberIsTooSmallException { [EOL]     double filteredH = h; [EOL]     if (FastMath.abs(h) < minStep) { [EOL]         if (acceptSmall) { [EOL]             filteredH = forward ? minStep : -minStep; [EOL]         } else { [EOL]             throw new NumberIsTooSmallException(LocalizedFormats.MINIMAL_STEPSIZE_REACHED_DURING_INTEGRATION, FastMath.abs(h), minStep, true); [EOL]         } [EOL]     } [EOL]     if (filteredH > maxStep) { [EOL]         filteredH = maxStep; [EOL]     } else if (filteredH < -maxStep) { [EOL]         filteredH = -maxStep; [EOL]     } [EOL]     return filteredH; [EOL] } <line_num>: 321,342
@Override [EOL] public abstract void integrate(ExpandableStatefulODE equations, double t) throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException; <line_num>: 345,348
@Override [EOL] public double getCurrentStepStart() { [EOL]     return stepStart; [EOL] } <line_num>: 351,354
protected void resetInternalState() { [EOL]     stepStart = Double.NaN; [EOL]     stepSize = FastMath.sqrt(minStep * maxStep); [EOL] } <line_num>: 357,360
public double getMinStep() { [EOL]     return minStep; [EOL] } <line_num>: 365,367
public double getMaxStep() { [EOL]     return maxStep; [EOL] } <line_num>: 372,374