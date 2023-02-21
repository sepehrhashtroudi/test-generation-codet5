public Vector3D(double x, double y, double z) { [EOL]     this.x = x; [EOL]     this.y = y; [EOL]     this.z = z; [EOL] } <line_num>: 95,99
public Vector3D(double[] v) throws DimensionMismatchException { [EOL]     if (v.length != 3) { [EOL]         throw new DimensionMismatchException(v.length, 3); [EOL]     } [EOL]     this.x = v[0]; [EOL]     this.y = v[1]; [EOL]     this.z = v[2]; [EOL] } <line_num>: 107,114
public Vector3D(double alpha, double delta) { [EOL]     double cosDelta = FastMath.cos(delta); [EOL]     this.x = FastMath.cos(alpha) * cosDelta; [EOL]     this.y = FastMath.sin(alpha) * cosDelta; [EOL]     this.z = FastMath.sin(delta); [EOL] } <line_num>: 124,129
public Vector3D(double a, Vector3D u) { [EOL]     this.x = a * u.x; [EOL]     this.y = a * u.y; [EOL]     this.z = a * u.z; [EOL] } <line_num>: 137,141
public Vector3D(double a1, Vector3D u1, double a2, Vector3D u2) { [EOL]     this.x = MathArrays.linearCombination(a1, u1.x, a2, u2.x); [EOL]     this.y = MathArrays.linearCombination(a1, u1.y, a2, u2.y); [EOL]     this.z = MathArrays.linearCombination(a1, u1.z, a2, u2.z); [EOL] } <line_num>: 151,155
public Vector3D(double a1, Vector3D u1, double a2, Vector3D u2, double a3, Vector3D u3) { [EOL]     this.x = MathArrays.linearCombination(a1, u1.x, a2, u2.x, a3, u3.x); [EOL]     this.y = MathArrays.linearCombination(a1, u1.y, a2, u2.y, a3, u3.y); [EOL]     this.z = MathArrays.linearCombination(a1, u1.z, a2, u2.z, a3, u3.z); [EOL] } <line_num>: 167,172
public Vector3D(double a1, Vector3D u1, double a2, Vector3D u2, double a3, Vector3D u3, double a4, Vector3D u4) { [EOL]     this.x = MathArrays.linearCombination(a1, u1.x, a2, u2.x, a3, u3.x, a4, u4.x); [EOL]     this.y = MathArrays.linearCombination(a1, u1.y, a2, u2.y, a3, u3.y, a4, u4.y); [EOL]     this.z = MathArrays.linearCombination(a1, u1.z, a2, u2.z, a3, u3.z, a4, u4.z); [EOL] } <line_num>: 186,191
public double getX() { [EOL]     return x; [EOL] } <line_num>: 197,199
public double getY() { [EOL]     return y; [EOL] } <line_num>: 205,207
public double getZ() { [EOL]     return z; [EOL] } <line_num>: 213,215
public double[] toArray() { [EOL]     return new double[] { x, y, z }; [EOL] } <line_num>: 221,223
public Space getSpace() { [EOL]     return Euclidean3D.getInstance(); [EOL] } <line_num>: 226,228
public Vector3D getZero() { [EOL]     return ZERO; [EOL] } <line_num>: 231,233
public double getNorm1() { [EOL]     return FastMath.abs(x) + FastMath.abs(y) + FastMath.abs(z); [EOL] } <line_num>: 236,238
public double getNorm() { [EOL]     return FastMath.sqrt(x * x + y * y + z * z); [EOL] } <line_num>: 241,244
public double getNormSq() { [EOL]     return x * x + y * y + z * z; [EOL] } <line_num>: 247,250
public double getNormInf() { [EOL]     return FastMath.max(FastMath.max(FastMath.abs(x), FastMath.abs(y)), FastMath.abs(z)); [EOL] } <line_num>: 253,255
public double getAlpha() { [EOL]     return FastMath.atan2(y, x); [EOL] } <line_num>: 261,263
public double getDelta() { [EOL]     return FastMath.asin(z / getNorm()); [EOL] } <line_num>: 269,271
public Vector3D add(final Vector<Euclidean3D> v) { [EOL]     final Vector3D v3 = (Vector3D) v; [EOL]     return new Vector3D(x + v3.x, y + v3.y, z + v3.z); [EOL] } <line_num>: 274,277
public Vector3D add(double factor, final Vector<Euclidean3D> v) { [EOL]     return new Vector3D(1, this, factor, (Vector3D) v); [EOL] } <line_num>: 280,282
public Vector3D subtract(final Vector<Euclidean3D> v) { [EOL]     final Vector3D v3 = (Vector3D) v; [EOL]     return new Vector3D(x - v3.x, y - v3.y, z - v3.z); [EOL] } <line_num>: 285,288
public Vector3D subtract(final double factor, final Vector<Euclidean3D> v) { [EOL]     return new Vector3D(1, this, -factor, (Vector3D) v); [EOL] } <line_num>: 291,293
public Vector3D normalize() throws MathArithmeticException { [EOL]     double s = getNorm(); [EOL]     if (s == 0) { [EOL]         throw new MathArithmeticException(LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR); [EOL]     } [EOL]     return scalarMultiply(1 / s); [EOL] } <line_num>: 296,302
public Vector3D orthogonal() throws MathArithmeticException { [EOL]     double threshold = 0.6 * getNorm(); [EOL]     if (threshold == 0) { [EOL]         throw new MathArithmeticException(LocalizedFormats.ZERO_NORM); [EOL]     } [EOL]     if (FastMath.abs(x) <= threshold) { [EOL]         double inverse = 1 / FastMath.sqrt(y * y + z * z); [EOL]         return new Vector3D(0, inverse * z, -inverse * y); [EOL]     } else if (FastMath.abs(y) <= threshold) { [EOL]         double inverse = 1 / FastMath.sqrt(x * x + z * z); [EOL]         return new Vector3D(-inverse * z, 0, inverse * x); [EOL]     } [EOL]     double inverse = 1 / FastMath.sqrt(x * x + y * y); [EOL]     return new Vector3D(inverse * y, -inverse * x, 0); [EOL] } <line_num>: 319,336
public static double angle(Vector3D v1, Vector3D v2) throws MathArithmeticException { [EOL]     double normProduct = v1.getNorm() * v2.getNorm(); [EOL]     if (normProduct == 0) { [EOL]         throw new MathArithmeticException(LocalizedFormats.ZERO_NORM); [EOL]     } [EOL]     double dot = v1.dotProduct(v2); [EOL]     double threshold = normProduct * 0.9999; [EOL]     if ((dot < -threshold) || (dot > threshold)) { [EOL]         Vector3D v3 = crossProduct(v1, v2); [EOL]         if (dot >= 0) { [EOL]             return FastMath.asin(v3.getNorm() / normProduct); [EOL]         } [EOL]         return FastMath.PI - FastMath.asin(v3.getNorm() / normProduct); [EOL]     } [EOL]     return FastMath.acos(dot / normProduct); [EOL] } <line_num>: 349,370
public Vector3D negate() { [EOL]     return new Vector3D(-x, -y, -z); [EOL] } <line_num>: 373,375
public Vector3D scalarMultiply(double a) { [EOL]     return new Vector3D(a * x, a * y, a * z); [EOL] } <line_num>: 378,380
public boolean isNaN() { [EOL]     return Double.isNaN(x) || Double.isNaN(y) || Double.isNaN(z); [EOL] } <line_num>: 383,385
public boolean isInfinite() { [EOL]     return !isNaN() && (Double.isInfinite(x) || Double.isInfinite(y) || Double.isInfinite(z)); [EOL] } <line_num>: 388,390
@Override [EOL] public boolean equals(Object other) { [EOL]     if (this == other) { [EOL]         return true; [EOL]     } [EOL]     if (other instanceof Vector3D) { [EOL]         final Vector3D rhs = (Vector3D) other; [EOL]         if (rhs.isNaN()) { [EOL]             return this.isNaN(); [EOL]         } [EOL]         return (x == rhs.x) && (y == rhs.y) && (z == rhs.z); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 411,427
@Override [EOL] public int hashCode() { [EOL]     if (isNaN()) { [EOL]         return 642; [EOL]     } [EOL]     return 643 * (164 * MathUtils.hash(x) + 3 * MathUtils.hash(y) + MathUtils.hash(z)); [EOL] } <line_num>: 436,442
public double dotProduct(final Vector<Euclidean3D> v) { [EOL]     final Vector3D v3 = (Vector3D) v; [EOL]     return MathArrays.linearCombination(x, v3.x, y, v3.y, z, v3.z); [EOL] } <line_num>: 452,455
public Vector3D crossProduct(final Vector<Euclidean3D> v) { [EOL]     final Vector3D v3 = (Vector3D) v; [EOL]     return new Vector3D(MathArrays.linearCombination(y, v3.z, -z, v3.y), MathArrays.linearCombination(z, v3.x, -x, v3.z), MathArrays.linearCombination(x, v3.y, -y, v3.x)); [EOL] } <line_num>: 461,466
public double distance1(Vector<Euclidean3D> v) { [EOL]     final Vector3D v3 = (Vector3D) v; [EOL]     final double dx = FastMath.abs(v3.x - x); [EOL]     final double dy = FastMath.abs(v3.y - y); [EOL]     final double dz = FastMath.abs(v3.z - z); [EOL]     return dx + dy + dz; [EOL] } <line_num>: 469,475
public double distance(Vector<Euclidean3D> v) { [EOL]     final Vector3D v3 = (Vector3D) v; [EOL]     final double dx = v3.x - x; [EOL]     final double dy = v3.y - y; [EOL]     final double dz = v3.z - z; [EOL]     return FastMath.sqrt(dx * dx + dy * dy + dz * dz); [EOL] } <line_num>: 478,484
public double distanceInf(Vector<Euclidean3D> v) { [EOL]     final Vector3D v3 = (Vector3D) v; [EOL]     final double dx = FastMath.abs(v3.x - x); [EOL]     final double dy = FastMath.abs(v3.y - y); [EOL]     final double dz = FastMath.abs(v3.z - z); [EOL]     return FastMath.max(FastMath.max(dx, dy), dz); [EOL] } <line_num>: 487,493
public double distanceSq(Vector<Euclidean3D> v) { [EOL]     final Vector3D v3 = (Vector3D) v; [EOL]     final double dx = v3.x - x; [EOL]     final double dy = v3.y - y; [EOL]     final double dz = v3.z - z; [EOL]     return dx * dx + dy * dy + dz * dz; [EOL] } <line_num>: 496,502
public static double dotProduct(Vector3D v1, Vector3D v2) { [EOL]     return v1.dotProduct(v2); [EOL] } <line_num>: 509,511
public static Vector3D crossProduct(final Vector3D v1, final Vector3D v2) { [EOL]     return v1.crossProduct(v2); [EOL] } <line_num>: 518,520
public static double distance1(Vector3D v1, Vector3D v2) { [EOL]     return v1.distance1(v2); [EOL] } <line_num>: 530,532
public static double distance(Vector3D v1, Vector3D v2) { [EOL]     return v1.distance(v2); [EOL] } <line_num>: 542,544
public static double distanceInf(Vector3D v1, Vector3D v2) { [EOL]     return v1.distanceInf(v2); [EOL] } <line_num>: 554,556
public static double distanceSq(Vector3D v1, Vector3D v2) { [EOL]     return v1.distanceSq(v2); [EOL] } <line_num>: 566,568
@Override [EOL] public String toString() { [EOL]     return Vector3DFormat.getInstance().format(this); [EOL] } <line_num>: 573,576
public String toString(final NumberFormat format) { [EOL]     return new Vector3DFormat(format).format(this); [EOL] } <line_num>: 579,581