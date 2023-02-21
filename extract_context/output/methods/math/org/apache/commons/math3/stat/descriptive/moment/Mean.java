public Mean() { [EOL]     incMoment = true; [EOL]     moment = new FirstMoment(); [EOL] } <line_num>: 80,83
public Mean(final FirstMoment m1) { [EOL]     this.moment = m1; [EOL]     incMoment = false; [EOL] } <line_num>: 90,93
public Mean(Mean original) throws NullArgumentException { [EOL]     copy(original, this); [EOL] } <line_num>: 102,104
@Override [EOL] public void increment(final double d) { [EOL]     if (incMoment) { [EOL]         moment.increment(d); [EOL]     } [EOL] } <line_num>: 112,117
@Override [EOL] public void clear() { [EOL]     if (incMoment) { [EOL]         moment.clear(); [EOL]     } [EOL] } <line_num>: 122,127
@Override [EOL] public double getResult() { [EOL]     return moment.m1; [EOL] } <line_num>: 132,135
public long getN() { [EOL]     return moment.getN(); [EOL] } <line_num>: 140,142
@Override [EOL] public double evaluate(final double[] values, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     if (test(values, begin, length)) { [EOL]         Sum sum = new Sum(); [EOL]         double sampleSize = length; [EOL]         double xbar = sum.evaluate(values, begin, length) / sampleSize; [EOL]         double correction = 0; [EOL]         for (int i = begin; i < begin + length; i++) { [EOL]             correction += values[i] - xbar; [EOL]         } [EOL]         return xbar + (correction / sampleSize); [EOL]     } [EOL]     return Double.NaN; [EOL] } <line_num>: 160,178
public double evaluate(final double[] values, final double[] weights, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     if (test(values, weights, begin, length)) { [EOL]         Sum sum = new Sum(); [EOL]         double sumw = sum.evaluate(weights, begin, length); [EOL]         double xbarw = sum.evaluate(values, weights, begin, length) / sumw; [EOL]         double correction = 0; [EOL]         for (int i = begin; i < begin + length; i++) { [EOL]             correction += weights[i] * (values[i] - xbarw); [EOL]         } [EOL]         return xbarw + (correction / sumw); [EOL]     } [EOL]     return Double.NaN; [EOL] } <line_num>: 209,226
public double evaluate(final double[] values, final double[] weights) throws MathIllegalArgumentException { [EOL]     return evaluate(values, weights, 0, values.length); [EOL] } <line_num>: 252,255
@Override [EOL] public Mean copy() { [EOL]     Mean result = new Mean(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 260,266
public static void copy(Mean source, Mean dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     dest.setData(source.getDataRef()); [EOL]     dest.incMoment = source.incMoment; [EOL]     dest.moment = source.moment.copy(); [EOL] } <line_num>: 277,284
