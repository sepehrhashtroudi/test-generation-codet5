public FastCosineTransformer(final DctNormalization normalization) { [EOL]     this.normalization = normalization; [EOL] } <line_num>: 81,83
public double[] transform(final double[] f, final TransformType type) throws MathIllegalArgumentException { [EOL]     if (type == TransformType.FORWARD) { [EOL]         if (normalization == DctNormalization.ORTHOGONAL_DCT_I) { [EOL]             final double s = FastMath.sqrt(2.0 / (f.length - 1)); [EOL]             return TransformUtils.scaleArray(fct(f), s); [EOL]         } [EOL]         return fct(f); [EOL]     } [EOL]     final double s2 = 2.0 / (f.length - 1); [EOL]     final double s1; [EOL]     if (normalization == DctNormalization.ORTHOGONAL_DCT_I) { [EOL]         s1 = FastMath.sqrt(s2); [EOL]     } else { [EOL]         s1 = s2; [EOL]     } [EOL]     return TransformUtils.scaleArray(fct(f), s1); [EOL] } <line_num>: 91,108
public double[] transform(final UnivariateFunction f, final double min, final double max, final int n, final TransformType type) throws MathIllegalArgumentException { [EOL]     final double[] data = FunctionUtils.sample(f, min, max, n); [EOL]     return transform(data, type); [EOL] } <line_num>: 120,126
protected double[] fct(double[] f) throws MathIllegalArgumentException { [EOL]     final double[] transformed = new double[f.length]; [EOL]     final int n = f.length - 1; [EOL]     if (!ArithmeticUtils.isPowerOfTwo(n)) { [EOL]         throw new MathIllegalArgumentException(LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE, Integer.valueOf(f.length)); [EOL]     } [EOL]     if (n == 1) { [EOL]         transformed[0] = 0.5 * (f[0] + f[1]); [EOL]         transformed[1] = 0.5 * (f[0] - f[1]); [EOL]         return transformed; [EOL]     } [EOL]     final double[] x = new double[n]; [EOL]     x[0] = 0.5 * (f[0] + f[n]); [EOL]     x[n >> 1] = f[n >> 1]; [EOL]     double t1 = 0.5 * (f[0] - f[n]); [EOL]     for (int i = 1; i < (n >> 1); i++) { [EOL]         final double a = 0.5 * (f[i] + f[n - i]); [EOL]         final double b = FastMath.sin(i * FastMath.PI / n) * (f[i] - f[n - i]); [EOL]         final double c = FastMath.cos(i * FastMath.PI / n) * (f[i] - f[n - i]); [EOL]         x[i] = a - b; [EOL]         x[n - i] = a + b; [EOL]         t1 += c; [EOL]     } [EOL]     FastFourierTransformer transformer; [EOL]     transformer = new FastFourierTransformer(DftNormalization.STANDARD); [EOL]     Complex[] y = transformer.transform(x, TransformType.FORWARD); [EOL]     transformed[0] = y[0].getReal(); [EOL]     transformed[1] = t1; [EOL]     for (int i = 1; i < (n >> 1); i++) { [EOL]         transformed[2 * i] = y[i].getReal(); [EOL]         transformed[2 * i + 1] = transformed[2 * i - 1] - y[i].getImaginary(); [EOL]     } [EOL]     transformed[n] = y[n >> 1].getReal(); [EOL]     return transformed; [EOL] } <line_num>: 136,181
