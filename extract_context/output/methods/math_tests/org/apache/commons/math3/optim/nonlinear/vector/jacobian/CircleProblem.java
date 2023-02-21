public CircleProblem(double xError, double yError, int searchResolution) { [EOL]     points = new ArrayList<double[]>(); [EOL]     xSigma = xError; [EOL]     ySigma = yError; [EOL]     resolution = searchResolution; [EOL] } <line_num>: 58,65
public CircleProblem(double xError, double yError) { [EOL]     this(xError, yError, 500); [EOL] } <line_num>: 71,74
public void addPoint(double px, double py) { [EOL]     points.add(new double[] { px, py }); [EOL] } <line_num>: 76,78
public double[] target() { [EOL]     final double[] t = new double[points.size() * 2]; [EOL]     for (int i = 0; i < points.size(); i++) { [EOL]         final double[] p = points.get(i); [EOL]         final int index = i * 2; [EOL]         t[index] = p[0]; [EOL]         t[index + 1] = p[1]; [EOL]     } [EOL]     return t; [EOL] } <line_num>: 80,90
public double[] weight() { [EOL]     final double wX = 1 / (xSigma * xSigma); [EOL]     final double wY = 1 / (ySigma * ySigma); [EOL]     final double[] w = new double[points.size() * 2]; [EOL]     for (int i = 0; i < points.size(); i++) { [EOL]         final int index = i * 2; [EOL]         w[index] = wX; [EOL]         w[index + 1] = wY; [EOL]     } [EOL]     return w; [EOL] } <line_num>: 92,103
public double[] value(double[] params) { [EOL]     final double cx = params[0]; [EOL]     final double cy = params[1]; [EOL]     final double r = params[2]; [EOL]     final double[] model = new double[points.size() * 2]; [EOL]     final double deltaTheta = MathUtils.TWO_PI / resolution; [EOL]     for (int i = 0; i < points.size(); i++) { [EOL]         final double[] p = points.get(i); [EOL]         final double px = p[0]; [EOL]         final double py = p[1]; [EOL]         double bestX = 0; [EOL]         double bestY = 0; [EOL]         double dMin = Double.POSITIVE_INFINITY; [EOL]         for (double theta = 0; theta <= MathUtils.TWO_PI; theta += deltaTheta) { [EOL]             final double currentX = cx + r * FastMath.cos(theta); [EOL]             final double currentY = cy + r * FastMath.sin(theta); [EOL]             final double dX = currentX - px; [EOL]             final double dY = currentY - py; [EOL]             final double d = dX * dX + dY * dY; [EOL]             if (d < dMin) { [EOL]                 dMin = d; [EOL]                 bestX = currentX; [EOL]                 bestY = currentY; [EOL]             } [EOL]         } [EOL]         final int index = i * 2; [EOL]         model[index] = bestX; [EOL]         model[index + 1] = bestY; [EOL]     } [EOL]     return model; [EOL] } <line_num>: 107,146
public ModelFunction getModelFunction() { [EOL]     return new ModelFunction(new MultivariateVectorFunction() { [EOL]  [EOL]         public double[] value(double[] params) { [EOL]             final double cx = params[0]; [EOL]             final double cy = params[1]; [EOL]             final double r = params[2]; [EOL]             final double[] model = new double[points.size() * 2]; [EOL]             final double deltaTheta = MathUtils.TWO_PI / resolution; [EOL]             for (int i = 0; i < points.size(); i++) { [EOL]                 final double[] p = points.get(i); [EOL]                 final double px = p[0]; [EOL]                 final double py = p[1]; [EOL]                 double bestX = 0; [EOL]                 double bestY = 0; [EOL]                 double dMin = Double.POSITIVE_INFINITY; [EOL]                 for (double theta = 0; theta <= MathUtils.TWO_PI; theta += deltaTheta) { [EOL]                     final double currentX = cx + r * FastMath.cos(theta); [EOL]                     final double currentY = cy + r * FastMath.sin(theta); [EOL]                     final double dX = currentX - px; [EOL]                     final double dY = currentY - py; [EOL]                     final double d = dX * dX + dY * dY; [EOL]                     if (d < dMin) { [EOL]                         dMin = d; [EOL]                         bestX = currentX; [EOL]                         bestY = currentY; [EOL]                     } [EOL]                 } [EOL]                 final int index = i * 2; [EOL]                 model[index] = bestX; [EOL]                 model[index + 1] = bestY; [EOL]             } [EOL]             return model; [EOL]         } [EOL]     }); [EOL] } <line_num>: 105,148
public double[][] value(double[] point) { [EOL]     return jacobian(point); [EOL] } <line_num>: 152,154
public ModelFunctionJacobian getModelFunctionJacobian() { [EOL]     return new ModelFunctionJacobian(new MultivariateMatrixFunction() { [EOL]  [EOL]         public double[][] value(double[] point) { [EOL]             return jacobian(point); [EOL]         } [EOL]     }); [EOL] } <line_num>: 150,156
private double[][] jacobian(double[] params) { [EOL]     final double[][] jacobian = new double[points.size() * 2][3]; [EOL]     for (int i = 0; i < points.size(); i++) { [EOL]         final int index = i * 2; [EOL]         jacobian[index][0] = 1; [EOL]         jacobian[index + 1][0] = 0; [EOL]         jacobian[index][1] = 0; [EOL]         jacobian[index + 1][1] = 1; [EOL]         final double[] p = points.get(i); [EOL]         jacobian[index][2] = (p[0] - params[0]) / params[2]; [EOL]         jacobian[index + 1][2] = (p[1] - params[1]) / params[2]; [EOL]     } [EOL]     return jacobian; [EOL] } <line_num>: 158,176