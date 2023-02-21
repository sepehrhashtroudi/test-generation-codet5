public void setData(final double[] values) { [EOL]     storedData = (values == null) ? null : values.clone(); [EOL] } <line_num>: 53,55
public double[] getData() { [EOL]     return (storedData == null) ? null : storedData.clone(); [EOL] } <line_num>: 61,63
protected double[] getDataRef() { [EOL]     return storedData; [EOL] } <line_num>: 69,71
public void setData(final double[] values, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     if (values == null) { [EOL]         throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY); [EOL]     } [EOL]     if (begin < 0) { [EOL]         throw new NotPositiveException(LocalizedFormats.START_POSITION, begin); [EOL]     } [EOL]     if (length < 0) { [EOL]         throw new NotPositiveException(LocalizedFormats.LENGTH, length); [EOL]     } [EOL]     if (begin + length > values.length) { [EOL]         throw new NumberIsTooLargeException(LocalizedFormats.SUBARRAY_ENDS_AFTER_ARRAY_END, begin + length, values.length, true); [EOL]     } [EOL]     storedData = new double[length]; [EOL]     System.arraycopy(values, begin, storedData, 0, length); [EOL] } <line_num>: 83,103
public double evaluate() throws MathIllegalArgumentException { [EOL]     return evaluate(storedData); [EOL] } <line_num>: 113,115
public double evaluate(final double[] values) throws MathIllegalArgumentException { [EOL]     test(values, 0, 0); [EOL]     return evaluate(values, 0, values.length); [EOL] } <line_num>: 120,123
public abstract double evaluate(final double[] values, final int begin, final int length) throws MathIllegalArgumentException; <line_num>: 128,129
public abstract UnivariateStatistic copy(); <line_num>: 134,134
protected boolean test(final double[] values, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     return test(values, begin, length, false); [EOL] } <line_num>: 155,160
protected boolean test(final double[] values, final int begin, final int length, final boolean allowEmpty) throws MathIllegalArgumentException { [EOL]     if (values == null) { [EOL]         throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY); [EOL]     } [EOL]     if (begin < 0) { [EOL]         throw new NotPositiveException(LocalizedFormats.START_POSITION, begin); [EOL]     } [EOL]     if (length < 0) { [EOL]         throw new NotPositiveException(LocalizedFormats.LENGTH, length); [EOL]     } [EOL]     if (begin + length > values.length) { [EOL]         throw new NumberIsTooLargeException(LocalizedFormats.SUBARRAY_ENDS_AFTER_ARRAY_END, begin + length, values.length, true); [EOL]     } [EOL]     if (length == 0 && !allowEmpty) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 183,209
protected boolean test(final double[] values, final double[] weights, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     return test(values, weights, begin, length, false); [EOL] } <line_num>: 240,246
protected boolean test(final double[] values, final double[] weights, final int begin, final int length, final boolean allowEmpty) throws MathIllegalArgumentException { [EOL]     if (weights == null || values == null) { [EOL]         throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY); [EOL]     } [EOL]     if (weights.length != values.length) { [EOL]         throw new DimensionMismatchException(weights.length, values.length); [EOL]     } [EOL]     boolean containsPositiveWeight = false; [EOL]     for (int i = begin; i < begin + length; i++) { [EOL]         if (Double.isNaN(weights[i])) { [EOL]             throw new MathIllegalArgumentException(LocalizedFormats.NAN_ELEMENT_AT_INDEX, i); [EOL]         } [EOL]         if (Double.isInfinite(weights[i])) { [EOL]             throw new MathIllegalArgumentException(LocalizedFormats.INFINITE_ARRAY_ELEMENT, weights[i], i); [EOL]         } [EOL]         if (weights[i] < 0) { [EOL]             throw new MathIllegalArgumentException(LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX, i, weights[i]); [EOL]         } [EOL]         if (!containsPositiveWeight && weights[i] > 0.0) { [EOL]             containsPositiveWeight = true; [EOL]         } [EOL]     } [EOL]     if (!containsPositiveWeight) { [EOL]         throw new MathIllegalArgumentException(LocalizedFormats.WEIGHT_AT_LEAST_ONE_NON_ZERO); [EOL]     } [EOL]     return test(values, begin, length, allowEmpty); [EOL] } <line_num>: 281,313
