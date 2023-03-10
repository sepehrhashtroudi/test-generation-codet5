public FieldVector3D(final T x, final T y, final T z)
public FieldVector3D(final T[] v) throws DimensionMismatchException
public FieldVector3D(final T alpha, final T delta)
public FieldVector3D(final T a, final FieldVector3D<T> u)
public FieldVector3D(final T a, final Vector3D u)
public FieldVector3D(final double a, final FieldVector3D<T> u)
public FieldVector3D(final T a1, final FieldVector3D<T> u1, final T a2, final FieldVector3D<T> u2)
public FieldVector3D(final T a1, final Vector3D u1, final T a2, final Vector3D u2)
public FieldVector3D(final double a1, final FieldVector3D<T> u1, final double a2, final FieldVector3D<T> u2)
public FieldVector3D(final T a1, final FieldVector3D<T> u1, final T a2, final FieldVector3D<T> u2, final T a3, final FieldVector3D<T> u3)
public FieldVector3D(final T a1, final Vector3D u1, final T a2, final Vector3D u2, final T a3, final Vector3D u3)
public FieldVector3D(final double a1, final FieldVector3D<T> u1, final double a2, final FieldVector3D<T> u2, final double a3, final FieldVector3D<T> u3)
public FieldVector3D(final T a1, final FieldVector3D<T> u1, final T a2, final FieldVector3D<T> u2, final T a3, final FieldVector3D<T> u3, final T a4, final FieldVector3D<T> u4)
public FieldVector3D(final T a1, final Vector3D u1, final T a2, final Vector3D u2, final T a3, final Vector3D u3, final T a4, final Vector3D u4)
public FieldVector3D(final double a1, final FieldVector3D<T> u1, final double a2, final FieldVector3D<T> u2, final double a3, final FieldVector3D<T> u3, final double a4, final FieldVector3D<T> u4)
public T getX()
public T getY()
public T getZ()
public T[] toArray()
public Vector3D toVector3D()
public T getNorm1()
public T getNorm()
public T getNormSq()
public T getNormInf()
public T getAlpha()
public T getDelta()
public FieldVector3D<T> add(final FieldVector3D<T> v)
public FieldVector3D<T> add(final Vector3D v)
public FieldVector3D<T> add(final T factor, final FieldVector3D<T> v)
public FieldVector3D<T> add(final T factor, final Vector3D v)
public FieldVector3D<T> add(final double factor, final FieldVector3D<T> v)
public FieldVector3D<T> add(final double factor, final Vector3D v)
public FieldVector3D<T> subtract(final FieldVector3D<T> v)
public FieldVector3D<T> subtract(final Vector3D v)
public FieldVector3D<T> subtract(final T factor, final FieldVector3D<T> v)
public FieldVector3D<T> subtract(final T factor, final Vector3D v)
public FieldVector3D<T> subtract(final double factor, final FieldVector3D<T> v)
public FieldVector3D<T> subtract(final double factor, final Vector3D v)
public FieldVector3D<T> normalize() throws MathArithmeticException
public FieldVector3D<T> orthogonal() throws MathArithmeticException
public static T angle(final FieldVector3D<T> v1, final FieldVector3D<T> v2) throws MathArithmeticException
public static T angle(final FieldVector3D<T> v1, final Vector3D v2) throws MathArithmeticException
public static T angle(final Vector3D v1, final FieldVector3D<T> v2) throws MathArithmeticException
public FieldVector3D<T> negate()
public FieldVector3D<T> scalarMultiply(final T a)
public FieldVector3D<T> scalarMultiply(final double a)
public boolean isNaN()
public boolean isInfinite()
public boolean equals(Object other)
public int hashCode()
public T dotProduct(final FieldVector3D<T> v)
public T dotProduct(final Vector3D v)
public FieldVector3D<T> crossProduct(final FieldVector3D<T> v)
public FieldVector3D<T> crossProduct(final Vector3D v)
public T distance1(final FieldVector3D<T> v)
public T distance1(final Vector3D v)
public T distance(final FieldVector3D<T> v)
public T distance(final Vector3D v)
public T distanceInf(final FieldVector3D<T> v)
public T distanceInf(final Vector3D v)
public T distanceSq(final FieldVector3D<T> v)
public T distanceSq(final Vector3D v)
public static T dotProduct(final FieldVector3D<T> v1, final FieldVector3D<T> v2)
public static T dotProduct(final FieldVector3D<T> v1, final Vector3D v2)
public static T dotProduct(final Vector3D v1, final FieldVector3D<T> v2)
public static FieldVector3D<T> crossProduct(final FieldVector3D<T> v1, final FieldVector3D<T> v2)
public static FieldVector3D<T> crossProduct(final FieldVector3D<T> v1, final Vector3D v2)
public static FieldVector3D<T> crossProduct(final Vector3D v1, final FieldVector3D<T> v2)
public static T distance1(final FieldVector3D<T> v1, final FieldVector3D<T> v2)
public static T distance1(final FieldVector3D<T> v1, final Vector3D v2)
public static T distance1(final Vector3D v1, final FieldVector3D<T> v2)
public static T distance(final FieldVector3D<T> v1, final FieldVector3D<T> v2)
public static T distance(final FieldVector3D<T> v1, final Vector3D v2)
public static T distance(final Vector3D v1, final FieldVector3D<T> v2)
public static T distanceInf(final FieldVector3D<T> v1, final FieldVector3D<T> v2)
public static T distanceInf(final FieldVector3D<T> v1, final Vector3D v2)
public static T distanceInf(final Vector3D v1, final FieldVector3D<T> v2)
public static T distanceSq(final FieldVector3D<T> v1, final FieldVector3D<T> v2)
public static T distanceSq(final FieldVector3D<T> v1, final Vector3D v2)
public static T distanceSq(final Vector3D v1, final FieldVector3D<T> v2)
public String toString()
public String toString(final NumberFormat format)
long serialVersionUID=Optional[20130224L]
T x
T y
T z
