public HarmonicOscillator(double amplitude, double omega, double phase) { [EOL]     this.amplitude = amplitude; [EOL]     this.omega = omega; [EOL]     this.phase = phase; [EOL] } <line_num>: 52,58
public double value(double x) { [EOL]     return value(omega * x + phase, amplitude); [EOL] } <line_num>: 61,63
@Deprecated [EOL] public UnivariateFunction derivative() { [EOL]     return FunctionUtils.toDifferentiableUnivariateFunction(this).derivative(); [EOL] } <line_num>: 68,71
public double value(double x, double... param) throws NullArgumentException, DimensionMismatchException { [EOL]     validateParameters(param); [EOL]     return HarmonicOscillator.value(x * param[1] + param[2], param[0]); [EOL] } <line_num>: 93,98
public double[] gradient(double x, double... param) throws NullArgumentException, DimensionMismatchException { [EOL]     validateParameters(param); [EOL]     final double amplitude = param[0]; [EOL]     final double omega = param[1]; [EOL]     final double phase = param[2]; [EOL]     final double xTimesOmegaPlusPhase = omega * x + phase; [EOL]     final double a = HarmonicOscillator.value(xTimesOmegaPlusPhase, 1); [EOL]     final double p = -amplitude * FastMath.sin(xTimesOmegaPlusPhase); [EOL]     final double w = p * x; [EOL]     return new double[] { a, w, p }; [EOL] } <line_num>: 113,128
private void validateParameters(double[] param) throws NullArgumentException, DimensionMismatchException { [EOL]     if (param == null) { [EOL]         throw new NullArgumentException(); [EOL]     } [EOL]     if (param.length != 3) { [EOL]         throw new DimensionMismatchException(param.length, 3); [EOL]     } [EOL] } <line_num>: 140,149
private static double value(double xTimesOmegaPlusPhase, double amplitude) { [EOL]     return amplitude * FastMath.cos(xTimesOmegaPlusPhase); [EOL] } <line_num>: 157,160
public DerivativeStructure value(final DerivativeStructure t) throws DimensionMismatchException { [EOL]     final double x = t.getValue(); [EOL]     double[] f = new double[t.getOrder() + 1]; [EOL]     final double alpha = omega * x + phase; [EOL]     f[0] = amplitude * FastMath.cos(alpha); [EOL]     if (f.length > 1) { [EOL]         f[1] = -amplitude * omega * FastMath.sin(alpha); [EOL]         final double mo2 = -omega * omega; [EOL]         for (int i = 2; i < f.length; ++i) { [EOL]             f[i] = mo2 * f[i - 2]; [EOL]         } [EOL]     } [EOL]     return t.compose(f); [EOL] } <line_num>: 165,182