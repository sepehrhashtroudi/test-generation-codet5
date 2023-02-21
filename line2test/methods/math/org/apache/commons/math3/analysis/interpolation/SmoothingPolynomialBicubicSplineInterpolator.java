public SmoothingPolynomialBicubicSplineInterpolator() { [EOL]     this(3); [EOL] } <line_num>: 53,55
public SmoothingPolynomialBicubicSplineInterpolator(int degree) throws NotPositiveException { [EOL]     this(degree, degree); [EOL] } <line_num>: 61,64
public SmoothingPolynomialBicubicSplineInterpolator(int xDegree, int yDegree) throws NotPositiveException { [EOL]     if (xDegree < 0) { [EOL]         throw new NotPositiveException(xDegree); [EOL]     } [EOL]     if (yDegree < 0) { [EOL]         throw new NotPositiveException(yDegree); [EOL]     } [EOL]     this.xDegree = xDegree; [EOL]     this.yDegree = yDegree; [EOL]     final double safeFactor = 1e2; [EOL]     final SimpleVectorValueChecker checker = new SimpleVectorValueChecker(safeFactor * Precision.EPSILON, safeFactor * Precision.SAFE_MIN); [EOL]     xFitter = new PolynomialFitter(new GaussNewtonOptimizer(false, checker)); [EOL]     yFitter = new PolynomialFitter(new GaussNewtonOptimizer(false, checker)); [EOL] } <line_num>: 73,90
@Override [EOL] public BicubicSplineInterpolatingFunction interpolate(final double[] xval, final double[] yval, final double[][] fval) throws NoDataException, NullArgumentException, DimensionMismatchException, NonMonotonicSequenceException { [EOL]     if (xval.length == 0 || yval.length == 0 || fval.length == 0) { [EOL]         throw new NoDataException(); [EOL]     } [EOL]     if (xval.length != fval.length) { [EOL]         throw new DimensionMismatchException(xval.length, fval.length); [EOL]     } [EOL]     final int xLen = xval.length; [EOL]     final int yLen = yval.length; [EOL]     for (int i = 0; i < xLen; i++) { [EOL]         if (fval[i].length != yLen) { [EOL]             throw new DimensionMismatchException(fval[i].length, yLen); [EOL]         } [EOL]     } [EOL]     MathArrays.checkOrder(xval); [EOL]     MathArrays.checkOrder(yval); [EOL]     final PolynomialFunction[] yPolyX = new PolynomialFunction[yLen]; [EOL]     for (int j = 0; j < yLen; j++) { [EOL]         xFitter.clearObservations(); [EOL]         for (int i = 0; i < xLen; i++) { [EOL]             xFitter.addObservedPoint(1, xval[i], fval[i][j]); [EOL]         } [EOL]         yPolyX[j] = new PolynomialFunction(xFitter.fit(new double[xDegree + 1])); [EOL]     } [EOL]     final double[][] fval_1 = new double[xLen][yLen]; [EOL]     for (int j = 0; j < yLen; j++) { [EOL]         final PolynomialFunction f = yPolyX[j]; [EOL]         for (int i = 0; i < xLen; i++) { [EOL]             fval_1[i][j] = f.value(xval[i]); [EOL]         } [EOL]     } [EOL]     final PolynomialFunction[] xPolyY = new PolynomialFunction[xLen]; [EOL]     for (int i = 0; i < xLen; i++) { [EOL]         yFitter.clearObservations(); [EOL]         for (int j = 0; j < yLen; j++) { [EOL]             yFitter.addObservedPoint(1, yval[j], fval_1[i][j]); [EOL]         } [EOL]         xPolyY[i] = new PolynomialFunction(yFitter.fit(new double[yDegree + 1])); [EOL]     } [EOL]     final double[][] fval_2 = new double[xLen][yLen]; [EOL]     for (int i = 0; i < xLen; i++) { [EOL]         final PolynomialFunction f = xPolyY[i]; [EOL]         for (int j = 0; j < yLen; j++) { [EOL]             fval_2[i][j] = f.value(yval[j]); [EOL]         } [EOL]     } [EOL]     return super.interpolate(xval, yval, fval_2); [EOL] } <line_num>: 95,169