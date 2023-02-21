public SphericalCoordinates(final Vector3D v)
public SphericalCoordinates(final double r, final double theta, final double phi)
public DataTransferObject(final double x, final double y, final double z)
public Vector3D getCartesian()
public double getR()
public double getTheta()
public double getPhi()
public double[] toCartesianGradient(final double[] sGradient)
public double[][] toCartesianHessian(final double[][] sHessian, final double[] sGradient)
private void computeJacobian()
private void computeHessians()
private Object writeReplace()
private Object readResolve()
long serialVersionUID=Optional[20130206L]
Vector3D v
double r
double theta
double phi
double[][] jacobian
double[][] rHessian
double[][] thetaHessian
double[][] phiHessian