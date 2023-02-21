public MicrosphereInterpolator() { [EOL]     this(DEFAULT_MICROSPHERE_ELEMENTS, DEFAULT_BRIGHTNESS_EXPONENT); [EOL] } <line_num>: 62,64
public MicrosphereInterpolator(final int elements, final int exponent) throws NotPositiveException, NotStrictlyPositiveException { [EOL]     if (exponent < 0) { [EOL]         throw new NotPositiveException(exponent); [EOL]     } [EOL]     if (elements <= 0) { [EOL]         throw new NotStrictlyPositiveException(elements); [EOL]     } [EOL]     microsphereElements = elements; [EOL]     brightnessExponent = exponent; [EOL] } <line_num>: 73,86
public MultivariateFunction interpolate(final double[][] xval, final double[] yval) throws DimensionMismatchException, NoDataException, NullArgumentException { [EOL]     final UnitSphereRandomVectorGenerator rand = new UnitSphereRandomVectorGenerator(xval[0].length); [EOL]     return new MicrosphereInterpolatingFunction(xval, yval, brightnessExponent, microsphereElements, rand); [EOL] } <line_num>: 91,102