public SimplePointChecker(final double relativeThreshold, final double absoluteThreshold) { [EOL]     super(relativeThreshold, absoluteThreshold); [EOL]     maxIterationCount = ITERATION_CHECK_DISABLED; [EOL] } <line_num>: 66,70
public SimplePointChecker(final double relativeThreshold, final double absoluteThreshold, final int maxIter) { [EOL]     super(relativeThreshold, absoluteThreshold); [EOL]     if (maxIter <= 0) { [EOL]         throw new NotStrictlyPositiveException(maxIter); [EOL]     } [EOL]     maxIterationCount = maxIter; [EOL] } <line_num>: 85,94
@Override [EOL] public boolean converged(final int iteration, final PAIR previous, final PAIR current) { [EOL]     if (maxIterationCount != ITERATION_CHECK_DISABLED && iteration >= maxIterationCount) { [EOL]         return true; [EOL]     } [EOL]     final double[] p = previous.getKey(); [EOL]     final double[] c = current.getKey(); [EOL]     for (int i = 0; i < p.length; ++i) { [EOL]         final double pi = p[i]; [EOL]         final double ci = c[i]; [EOL]         final double difference = FastMath.abs(pi - ci); [EOL]         final double size = FastMath.max(FastMath.abs(pi), FastMath.abs(ci)); [EOL]         if (difference > size * getRelativeThreshold() && difference > getAbsoluteThreshold()) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 112,133
