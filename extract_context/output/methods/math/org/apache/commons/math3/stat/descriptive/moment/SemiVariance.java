public SemiVariance() { [EOL] } <line_num>: 87,88
public SemiVariance(final boolean biasCorrected) { [EOL]     this.biasCorrected = biasCorrected; [EOL] } <line_num>: 98,100
public SemiVariance(final Direction direction) { [EOL]     this.varianceDirection = direction; [EOL] } <line_num>: 110,112
public SemiVariance(final boolean corrected, final Direction direction) { [EOL]     this.biasCorrected = corrected; [EOL]     this.varianceDirection = direction; [EOL] } <line_num>: 126,129
public SemiVariance(final SemiVariance original) throws NullArgumentException { [EOL]     copy(original, this); [EOL] } <line_num>: 139,141
Direction(boolean b) { [EOL]     direction = b; [EOL] } <line_num>: 357,359
@Override [EOL] public SemiVariance copy() { [EOL]     SemiVariance result = new SemiVariance(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 147,153
public static void copy(final SemiVariance source, SemiVariance dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     dest.setData(source.getDataRef()); [EOL]     dest.biasCorrected = source.biasCorrected; [EOL]     dest.varianceDirection = source.varianceDirection; [EOL] } <line_num>: 164,171
@Override [EOL] public double evaluate(final double[] values, final int start, final int length) throws MathIllegalArgumentException { [EOL]     double m = (new Mean()).evaluate(values, start, length); [EOL]     return evaluate(values, m, varianceDirection, biasCorrected, 0, values.length); [EOL] } <line_num>: 187,192
public double evaluate(final double[] values, Direction direction) throws MathIllegalArgumentException { [EOL]     double m = (new Mean()).evaluate(values); [EOL]     return evaluate(values, m, direction, biasCorrected, 0, values.length); [EOL] } <line_num>: 205,209
public double evaluate(final double[] values, final double cutoff) throws MathIllegalArgumentException { [EOL]     return evaluate(values, cutoff, varianceDirection, biasCorrected, 0, values.length); [EOL] } <line_num>: 223,226
public double evaluate(final double[] values, final double cutoff, final Direction direction) throws MathIllegalArgumentException { [EOL]     return evaluate(values, cutoff, direction, biasCorrected, 0, values.length); [EOL] } <line_num>: 241,244
public double evaluate(final double[] values, final double cutoff, final Direction direction, final boolean corrected, final int start, final int length) throws MathIllegalArgumentException { [EOL]     test(values, start, length); [EOL]     if (values.length == 0) { [EOL]         return Double.NaN; [EOL]     } else { [EOL]         if (values.length == 1) { [EOL]             return 0.0; [EOL]         } else { [EOL]             final boolean booleanDirection = direction.getDirection(); [EOL]             double dev = 0.0; [EOL]             double sumsq = 0.0; [EOL]             for (int i = start; i < length; i++) { [EOL]                 if ((values[i] > cutoff) == booleanDirection) { [EOL]                     dev = values[i] - cutoff; [EOL]                     sumsq += dev * dev; [EOL]                 } [EOL]             } [EOL]             if (corrected) { [EOL]                 return sumsq / (length - 1.0); [EOL]             } else { [EOL]                 return sumsq / length; [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 264,292
public boolean isBiasCorrected() { [EOL]     return biasCorrected; [EOL] } <line_num>: 299,301
public void setBiasCorrected(boolean biasCorrected) { [EOL]     this.biasCorrected = biasCorrected; [EOL] } <line_num>: 308,310
public Direction getVarianceDirection() { [EOL]     return varianceDirection; [EOL] } <line_num>: 317,319
public void setVarianceDirection(Direction varianceDirection) { [EOL]     this.varianceDirection = varianceDirection; [EOL] } <line_num>: 326,328
boolean getDirection() { [EOL]     return direction; [EOL] } <line_num>: 366,368