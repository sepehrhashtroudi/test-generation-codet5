public Vector2D(double x, double y)
public Vector2D(double[] v) throws DimensionMismatchException
public Vector2D(double a, Vector2D u)
public Vector2D(double a1, Vector2D u1, double a2, Vector2D u2)
public Vector2D(double a1, Vector2D u1, double a2, Vector2D u2, double a3, Vector2D u3)
public Vector2D(double a1, Vector2D u1, double a2, Vector2D u2, double a3, Vector2D u3, double a4, Vector2D u4)
public double getX()
public double getY()
public double[] toArray()
public Space getSpace()
public Vector2D getZero()
public double getNorm1()
public double getNorm()
public double getNormSq()
public double getNormInf()
public Vector2D add(Vector<Euclidean2D> v)
public Vector2D add(double factor, Vector<Euclidean2D> v)
public Vector2D subtract(Vector<Euclidean2D> p)
public Vector2D subtract(double factor, Vector<Euclidean2D> v)
public Vector2D normalize() throws MathArithmeticException
public Vector2D negate()
public Vector2D scalarMultiply(double a)
public boolean isNaN()
public boolean isInfinite()
public double distance1(Vector<Euclidean2D> p)
public double distance(Vector<Euclidean2D> p)
public double distanceInf(Vector<Euclidean2D> p)
public double distanceSq(Vector<Euclidean2D> p)
public double dotProduct(final Vector<Euclidean2D> v)
public static double distance(Vector2D p1, Vector2D p2)
public static double distanceInf(Vector2D p1, Vector2D p2)
public static double distanceSq(Vector2D p1, Vector2D p2)
public boolean equals(Object other)
public int hashCode()
public String toString()
public String toString(final NumberFormat format)
Vector2D ZERO=Optional[new Vector2D(0, 0)]
Vector2D NaN=Optional[new Vector2D(Double.NaN, Double.NaN)]
Vector2D POSITIVE_INFINITY=Optional[new Vector2D(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY)]
Vector2D NEGATIVE_INFINITY=Optional[new Vector2D(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY)]
long serialVersionUID=Optional[266938651998679754L]
double x
double y