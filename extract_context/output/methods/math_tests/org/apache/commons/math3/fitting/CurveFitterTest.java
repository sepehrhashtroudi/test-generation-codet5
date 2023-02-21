@Test [EOL] public void testMath303() { [EOL]     LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(); [EOL]     CurveFitter<ParametricUnivariateFunction> fitter = new CurveFitter<ParametricUnivariateFunction>(optimizer); [EOL]     fitter.addObservedPoint(2.805d, 0.6934785852953367d); [EOL]     fitter.addObservedPoint(2.74333333333333d, 0.6306772025518496d); [EOL]     fitter.addObservedPoint(1.655d, 0.9474675497289684); [EOL]     fitter.addObservedPoint(1.725d, 0.9013594835804194d); [EOL]     ParametricUnivariateFunction sif = new SimpleInverseFunction(); [EOL]     double[] initialguess1 = new double[1]; [EOL]     initialguess1[0] = 1.0d; [EOL]     Assert.assertEquals(1, fitter.fit(sif, initialguess1).length); [EOL]     double[] initialguess2 = new double[2]; [EOL]     initialguess2[0] = 1.0d; [EOL]     initialguess2[1] = .5d; [EOL]     Assert.assertEquals(2, fitter.fit(sif, initialguess2).length); [EOL] } <line_num>: 26,45
@Test [EOL] public void testMath304() { [EOL]     LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(); [EOL]     CurveFitter<ParametricUnivariateFunction> fitter = new CurveFitter<ParametricUnivariateFunction>(optimizer); [EOL]     fitter.addObservedPoint(2.805d, 0.6934785852953367d); [EOL]     fitter.addObservedPoint(2.74333333333333d, 0.6306772025518496d); [EOL]     fitter.addObservedPoint(1.655d, 0.9474675497289684); [EOL]     fitter.addObservedPoint(1.725d, 0.9013594835804194d); [EOL]     ParametricUnivariateFunction sif = new SimpleInverseFunction(); [EOL]     double[] initialguess1 = new double[1]; [EOL]     initialguess1[0] = 1.0d; [EOL]     Assert.assertEquals(1.6357215104109237, fitter.fit(sif, initialguess1)[0], 1.0e-14); [EOL]     double[] initialguess2 = new double[1]; [EOL]     initialguess2[0] = 10.0d; [EOL]     Assert.assertEquals(1.6357215104109237, fitter.fit(sif, initialguess1)[0], 1.0e-14); [EOL] } <line_num>: 47,65
public double value(double x, double... parameters) { [EOL]     double a = parameters[0]; [EOL]     double b = parameters[1]; [EOL]     double c = parameters[2]; [EOL]     double d = parameters[3]; [EOL]     return d + ((a - d) / (1 + FastMath.pow(x / c, b))); [EOL] } <line_num>: 80,87
public double[] gradient(double x, double... parameters) { [EOL]     double a = parameters[0]; [EOL]     double b = parameters[1]; [EOL]     double c = parameters[2]; [EOL]     double d = parameters[3]; [EOL]     double[] gradients = new double[4]; [EOL]     double den = 1 + FastMath.pow(x / c, b); [EOL]     gradients[0] = 1 / den; [EOL]     gradients[1] = -((a - d) * FastMath.pow(x / c, b) * FastMath.log(x / c)) / (den * den); [EOL]     gradients[2] = (b * FastMath.pow(x / c, b - 1) * (x / (c * c)) * (a - d)) / (den * den); [EOL]     gradients[3] = 1 - (1 / den); [EOL]     return gradients; [EOL] } <line_num>: 89,113
@Test [EOL] public void testMath372() { [EOL]     LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(); [EOL]     CurveFitter<ParametricUnivariateFunction> curveFitter = new CurveFitter<ParametricUnivariateFunction>(optimizer); [EOL]     curveFitter.addObservedPoint(15, 4443); [EOL]     curveFitter.addObservedPoint(31, 8493); [EOL]     curveFitter.addObservedPoint(62, 17586); [EOL]     curveFitter.addObservedPoint(125, 30582); [EOL]     curveFitter.addObservedPoint(250, 45087); [EOL]     curveFitter.addObservedPoint(500, 50683); [EOL]     ParametricUnivariateFunction f = new ParametricUnivariateFunction() { [EOL]  [EOL]         public double value(double x, double... parameters) { [EOL]             double a = parameters[0]; [EOL]             double b = parameters[1]; [EOL]             double c = parameters[2]; [EOL]             double d = parameters[3]; [EOL]             return d + ((a - d) / (1 + FastMath.pow(x / c, b))); [EOL]         } [EOL]  [EOL]         public double[] gradient(double x, double... parameters) { [EOL]             double a = parameters[0]; [EOL]             double b = parameters[1]; [EOL]             double c = parameters[2]; [EOL]             double d = parameters[3]; [EOL]             double[] gradients = new double[4]; [EOL]             double den = 1 + FastMath.pow(x / c, b); [EOL]             gradients[0] = 1 / den; [EOL]             gradients[1] = -((a - d) * FastMath.pow(x / c, b) * FastMath.log(x / c)) / (den * den); [EOL]             gradients[2] = (b * FastMath.pow(x / c, b - 1) * (x / (c * c)) * (a - d)) / (den * den); [EOL]             gradients[3] = 1 - (1 / den); [EOL]             return gradients; [EOL]         } [EOL]     }; [EOL]     double[] initialGuess = new double[] { 1500, 0.95, 65, 35000 }; [EOL]     double[] estimatedParameters = curveFitter.fit(f, initialGuess); [EOL]     Assert.assertEquals(2411.00, estimatedParameters[0], 500.00); [EOL]     Assert.assertEquals(1.62, estimatedParameters[1], 0.04); [EOL]     Assert.assertEquals(111.22, estimatedParameters[2], 0.30); [EOL]     Assert.assertEquals(55347.47, estimatedParameters[3], 300.00); [EOL]     Assert.assertTrue(optimizer.getRMS() < 600.0); [EOL] } <line_num>: 67,124
public double value(double x, double... parameters) { [EOL]     return parameters[0] / x + (parameters.length < 2 ? 0 : parameters[1]); [EOL] } <line_num>: 128,130
public double[] gradient(double x, double... doubles) { [EOL]     double[] gradientVector = new double[doubles.length]; [EOL]     gradientVector[0] = 1 / x; [EOL]     if (doubles.length >= 2) { [EOL]         gradientVector[1] = 1; [EOL]     } [EOL]     return gradientVector; [EOL] } <line_num>: 132,139
