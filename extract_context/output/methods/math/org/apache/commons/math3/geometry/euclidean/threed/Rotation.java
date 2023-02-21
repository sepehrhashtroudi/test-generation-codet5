public Rotation(double q0, double q1, double q2, double q3, boolean needsNormalization) { [EOL]     if (needsNormalization) { [EOL]         double inv = 1.0 / FastMath.sqrt(q0 * q0 + q1 * q1 + q2 * q2 + q3 * q3); [EOL]         q0 *= inv; [EOL]         q1 *= inv; [EOL]         q2 *= inv; [EOL]         q3 *= inv; [EOL]     } [EOL]     this.q0 = q0; [EOL]     this.q1 = q1; [EOL]     this.q2 = q2; [EOL]     this.q3 = q3; [EOL] } <line_num>: 135,152
public Rotation(Vector3D axis, double angle) throws MathIllegalArgumentException { [EOL]     double norm = axis.getNorm(); [EOL]     if (norm == 0) { [EOL]         throw new MathIllegalArgumentException(LocalizedFormats.ZERO_NORM_FOR_ROTATION_AXIS); [EOL]     } [EOL]     double halfAngle = -0.5 * angle; [EOL]     double coeff = FastMath.sin(halfAngle) / norm; [EOL]     q0 = FastMath.cos(halfAngle); [EOL]     q1 = coeff * axis.getX(); [EOL]     q2 = coeff * axis.getY(); [EOL]     q3 = coeff * axis.getZ(); [EOL] } <line_num>: 175,190
public Rotation(double[][] m, double threshold) throws NotARotationMatrixException { [EOL]     if ((m.length != 3) || (m[0].length != 3) || (m[1].length != 3) || (m[2].length != 3)) { [EOL]         throw new NotARotationMatrixException(LocalizedFormats.ROTATION_MATRIX_DIMENSIONS, m.length, m[0].length); [EOL]     } [EOL]     double[][] ort = orthogonalizeMatrix(m, threshold); [EOL]     double det = ort[0][0] * (ort[1][1] * ort[2][2] - ort[2][1] * ort[1][2]) - ort[1][0] * (ort[0][1] * ort[2][2] - ort[2][1] * ort[0][2]) + ort[2][0] * (ort[0][1] * ort[1][2] - ort[1][1] * ort[0][2]); [EOL]     if (det < 0.0) { [EOL]         throw new NotARotationMatrixException(LocalizedFormats.CLOSEST_ORTHOGONAL_MATRIX_HAS_NEGATIVE_DETERMINANT, det); [EOL]     } [EOL]     double[] quat = mat2quat(ort); [EOL]     q0 = quat[0]; [EOL]     q1 = quat[1]; [EOL]     q2 = quat[2]; [EOL]     q3 = quat[3]; [EOL] } <line_num>: 222,252
public Rotation(Vector3D u1, Vector3D u2, Vector3D v1, Vector3D v2) throws MathArithmeticException { [EOL]     final Vector3D u3 = u1.crossProduct(u2).normalize(); [EOL]     u2 = u3.crossProduct(u1).normalize(); [EOL]     u1 = u1.normalize(); [EOL]     final Vector3D v3 = v1.crossProduct(v2).normalize(); [EOL]     v2 = v3.crossProduct(v1).normalize(); [EOL]     v1 = v1.normalize(); [EOL]     final double[][] m = new double[][] { { MathArrays.linearCombination(u1.getX(), v1.getX(), u2.getX(), v2.getX(), u3.getX(), v3.getX()), MathArrays.linearCombination(u1.getY(), v1.getX(), u2.getY(), v2.getX(), u3.getY(), v3.getX()), MathArrays.linearCombination(u1.getZ(), v1.getX(), u2.getZ(), v2.getX(), u3.getZ(), v3.getX()) }, { MathArrays.linearCombination(u1.getX(), v1.getY(), u2.getX(), v2.getY(), u3.getX(), v3.getY()), MathArrays.linearCombination(u1.getY(), v1.getY(), u2.getY(), v2.getY(), u3.getY(), v3.getY()), MathArrays.linearCombination(u1.getZ(), v1.getY(), u2.getZ(), v2.getY(), u3.getZ(), v3.getY()) }, { MathArrays.linearCombination(u1.getX(), v1.getZ(), u2.getX(), v2.getZ(), u3.getX(), v3.getZ()), MathArrays.linearCombination(u1.getY(), v1.getZ(), u2.getY(), v2.getZ(), u3.getY(), v3.getZ()), MathArrays.linearCombination(u1.getZ(), v1.getZ(), u2.getZ(), v2.getZ(), u3.getZ(), v3.getZ()) } }; [EOL]     double[] quat = mat2quat(m); [EOL]     q0 = quat[0]; [EOL]     q1 = quat[1]; [EOL]     q2 = quat[2]; [EOL]     q3 = quat[3]; [EOL] } <line_num>: 273,313
public Rotation(Vector3D u, Vector3D v) throws MathArithmeticException { [EOL]     double normProduct = u.getNorm() * v.getNorm(); [EOL]     if (normProduct == 0) { [EOL]         throw new MathArithmeticException(LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR); [EOL]     } [EOL]     double dot = u.dotProduct(v); [EOL]     if (dot < ((2.0e-15 - 1.0) * normProduct)) { [EOL]         Vector3D w = u.orthogonal(); [EOL]         q0 = 0.0; [EOL]         q1 = -w.getX(); [EOL]         q2 = -w.getY(); [EOL]         q3 = -w.getZ(); [EOL]     } else { [EOL]         q0 = FastMath.sqrt(0.5 * (1.0 + dot / normProduct)); [EOL]         double coeff = 1.0 / (2.0 * q0 * normProduct); [EOL]         Vector3D q = v.crossProduct(u); [EOL]         q1 = coeff * q.getX(); [EOL]         q2 = coeff * q.getY(); [EOL]         q3 = coeff * q.getZ(); [EOL]     } [EOL] } <line_num>: 328,356
public Rotation(RotationOrder order, double alpha1, double alpha2, double alpha3) { [EOL]     Rotation r1 = new Rotation(order.getA1(), alpha1); [EOL]     Rotation r2 = new Rotation(order.getA2(), alpha2); [EOL]     Rotation r3 = new Rotation(order.getA3(), alpha3); [EOL]     Rotation composed = r1.applyTo(r2.applyTo(r3)); [EOL]     q0 = composed.q0; [EOL]     q1 = composed.q1; [EOL]     q2 = composed.q2; [EOL]     q3 = composed.q3; [EOL] } <line_num>: 377,387
private static double[] mat2quat(final double[][] ort) { [EOL]     final double[] quat = new double[4]; [EOL]     double s = ort[0][0] + ort[1][1] + ort[2][2]; [EOL]     if (s > -0.19) { [EOL]         quat[0] = 0.5 * FastMath.sqrt(s + 1.0); [EOL]         double inv = 0.25 / quat[0]; [EOL]         quat[1] = inv * (ort[1][2] - ort[2][1]); [EOL]         quat[2] = inv * (ort[2][0] - ort[0][2]); [EOL]         quat[3] = inv * (ort[0][1] - ort[1][0]); [EOL]     } else { [EOL]         s = ort[0][0] - ort[1][1] - ort[2][2]; [EOL]         if (s > -0.19) { [EOL]             quat[1] = 0.5 * FastMath.sqrt(s + 1.0); [EOL]             double inv = 0.25 / quat[1]; [EOL]             quat[0] = inv * (ort[1][2] - ort[2][1]); [EOL]             quat[2] = inv * (ort[0][1] + ort[1][0]); [EOL]             quat[3] = inv * (ort[0][2] + ort[2][0]); [EOL]         } else { [EOL]             s = ort[1][1] - ort[0][0] - ort[2][2]; [EOL]             if (s > -0.19) { [EOL]                 quat[2] = 0.5 * FastMath.sqrt(s + 1.0); [EOL]                 double inv = 0.25 / quat[2]; [EOL]                 quat[0] = inv * (ort[2][0] - ort[0][2]); [EOL]                 quat[1] = inv * (ort[0][1] + ort[1][0]); [EOL]                 quat[3] = inv * (ort[2][1] + ort[1][2]); [EOL]             } else { [EOL]                 s = ort[2][2] - ort[0][0] - ort[1][1]; [EOL]                 quat[3] = 0.5 * FastMath.sqrt(s + 1.0); [EOL]                 double inv = 0.25 / quat[3]; [EOL]                 quat[0] = inv * (ort[0][1] - ort[1][0]); [EOL]                 quat[1] = inv * (ort[0][2] + ort[2][0]); [EOL]                 quat[2] = inv * (ort[2][1] + ort[1][2]); [EOL]             } [EOL]         } [EOL]     } [EOL]     return quat; [EOL] } <line_num>: 393,448
public Rotation revert() { [EOL]     return new Rotation(-q0, q1, q2, q3, false); [EOL] } <line_num>: 457,459
public double getQ0() { [EOL]     return q0; [EOL] } <line_num>: 464,466
public double getQ1() { [EOL]     return q1; [EOL] } <line_num>: 471,473
public double getQ2() { [EOL]     return q2; [EOL] } <line_num>: 478,480
public double getQ3() { [EOL]     return q3; [EOL] } <line_num>: 485,487
public Vector3D getAxis() { [EOL]     double squaredSine = q1 * q1 + q2 * q2 + q3 * q3; [EOL]     if (squaredSine == 0) { [EOL]         return new Vector3D(1, 0, 0); [EOL]     } else if (q0 < 0) { [EOL]         double inverse = 1 / FastMath.sqrt(squaredSine); [EOL]         return new Vector3D(q1 * inverse, q2 * inverse, q3 * inverse); [EOL]     } [EOL]     double inverse = -1 / FastMath.sqrt(squaredSine); [EOL]     return new Vector3D(q1 * inverse, q2 * inverse, q3 * inverse); [EOL] } <line_num>: 493,503
public double getAngle() { [EOL]     if ((q0 < -0.1) || (q0 > 0.1)) { [EOL]         return 2 * FastMath.asin(FastMath.sqrt(q1 * q1 + q2 * q2 + q3 * q3)); [EOL]     } else if (q0 < 0) { [EOL]         return 2 * FastMath.acos(-q0); [EOL]     } [EOL]     return 2 * FastMath.acos(q0); [EOL] } <line_num>: 509,516
public double[] getAngles(RotationOrder order) throws CardanEulerSingularityException { [EOL]     if (order == RotationOrder.XYZ) { [EOL]         Vector3D v1 = applyTo(Vector3D.PLUS_K); [EOL]         Vector3D v2 = applyInverseTo(Vector3D.PLUS_I); [EOL]         if ((v2.getZ() < -0.9999999999) || (v2.getZ() > 0.9999999999)) { [EOL]             throw new CardanEulerSingularityException(true); [EOL]         } [EOL]         return new double[] { FastMath.atan2(-(v1.getY()), v1.getZ()), FastMath.asin(v2.getZ()), FastMath.atan2(-(v2.getY()), v2.getX()) }; [EOL]     } else if (order == RotationOrder.XZY) { [EOL]         Vector3D v1 = applyTo(Vector3D.PLUS_J); [EOL]         Vector3D v2 = applyInverseTo(Vector3D.PLUS_I); [EOL]         if ((v2.getY() < -0.9999999999) || (v2.getY() > 0.9999999999)) { [EOL]             throw new CardanEulerSingularityException(true); [EOL]         } [EOL]         return new double[] { FastMath.atan2(v1.getZ(), v1.getY()), -FastMath.asin(v2.getY()), FastMath.atan2(v2.getZ(), v2.getX()) }; [EOL]     } else if (order == RotationOrder.YXZ) { [EOL]         Vector3D v1 = applyTo(Vector3D.PLUS_K); [EOL]         Vector3D v2 = applyInverseTo(Vector3D.PLUS_J); [EOL]         if ((v2.getZ() < -0.9999999999) || (v2.getZ() > 0.9999999999)) { [EOL]             throw new CardanEulerSingularityException(true); [EOL]         } [EOL]         return new double[] { FastMath.atan2(v1.getX(), v1.getZ()), -FastMath.asin(v2.getZ()), FastMath.atan2(v2.getX(), v2.getY()) }; [EOL]     } else if (order == RotationOrder.YZX) { [EOL]         Vector3D v1 = applyTo(Vector3D.PLUS_I); [EOL]         Vector3D v2 = applyInverseTo(Vector3D.PLUS_J); [EOL]         if ((v2.getX() < -0.9999999999) || (v2.getX() > 0.9999999999)) { [EOL]             throw new CardanEulerSingularityException(true); [EOL]         } [EOL]         return new double[] { FastMath.atan2(-(v1.getZ()), v1.getX()), FastMath.asin(v2.getX()), FastMath.atan2(-(v2.getZ()), v2.getY()) }; [EOL]     } else if (order == RotationOrder.ZXY) { [EOL]         Vector3D v1 = applyTo(Vector3D.PLUS_J); [EOL]         Vector3D v2 = applyInverseTo(Vector3D.PLUS_K); [EOL]         if ((v2.getY() < -0.9999999999) || (v2.getY() > 0.9999999999)) { [EOL]             throw new CardanEulerSingularityException(true); [EOL]         } [EOL]         return new double[] { FastMath.atan2(-(v1.getX()), v1.getY()), FastMath.asin(v2.getY()), FastMath.atan2(-(v2.getX()), v2.getZ()) }; [EOL]     } else if (order == RotationOrder.ZYX) { [EOL]         Vector3D v1 = applyTo(Vector3D.PLUS_I); [EOL]         Vector3D v2 = applyInverseTo(Vector3D.PLUS_K); [EOL]         if ((v2.getX() < -0.9999999999) || (v2.getX() > 0.9999999999)) { [EOL]             throw new CardanEulerSingularityException(true); [EOL]         } [EOL]         return new double[] { FastMath.atan2(v1.getY(), v1.getX()), -FastMath.asin(v2.getX()), FastMath.atan2(v2.getY(), v2.getZ()) }; [EOL]     } else if (order == RotationOrder.XYX) { [EOL]         Vector3D v1 = applyTo(Vector3D.PLUS_I); [EOL]         Vector3D v2 = applyInverseTo(Vector3D.PLUS_I); [EOL]         if ((v2.getX() < -0.9999999999) || (v2.getX() > 0.9999999999)) { [EOL]             throw new CardanEulerSingularityException(false); [EOL]         } [EOL]         return new double[] { FastMath.atan2(v1.getY(), -v1.getZ()), FastMath.acos(v2.getX()), FastMath.atan2(v2.getY(), v2.getZ()) }; [EOL]     } else if (order == RotationOrder.XZX) { [EOL]         Vector3D v1 = applyTo(Vector3D.PLUS_I); [EOL]         Vector3D v2 = applyInverseTo(Vector3D.PLUS_I); [EOL]         if ((v2.getX() < -0.9999999999) || (v2.getX() > 0.9999999999)) { [EOL]             throw new CardanEulerSingularityException(false); [EOL]         } [EOL]         return new double[] { FastMath.atan2(v1.getZ(), v1.getY()), FastMath.acos(v2.getX()), FastMath.atan2(v2.getZ(), -v2.getY()) }; [EOL]     } else if (order == RotationOrder.YXY) { [EOL]         Vector3D v1 = applyTo(Vector3D.PLUS_J); [EOL]         Vector3D v2 = applyInverseTo(Vector3D.PLUS_J); [EOL]         if ((v2.getY() < -0.9999999999) || (v2.getY() > 0.9999999999)) { [EOL]             throw new CardanEulerSingularityException(false); [EOL]         } [EOL]         return new double[] { FastMath.atan2(v1.getX(), v1.getZ()), FastMath.acos(v2.getY()), FastMath.atan2(v2.getX(), -v2.getZ()) }; [EOL]     } else if (order == RotationOrder.YZY) { [EOL]         Vector3D v1 = applyTo(Vector3D.PLUS_J); [EOL]         Vector3D v2 = applyInverseTo(Vector3D.PLUS_J); [EOL]         if ((v2.getY() < -0.9999999999) || (v2.getY() > 0.9999999999)) { [EOL]             throw new CardanEulerSingularityException(false); [EOL]         } [EOL]         return new double[] { FastMath.atan2(v1.getZ(), -v1.getX()), FastMath.acos(v2.getY()), FastMath.atan2(v2.getZ(), v2.getX()) }; [EOL]     } else if (order == RotationOrder.ZXZ) { [EOL]         Vector3D v1 = applyTo(Vector3D.PLUS_K); [EOL]         Vector3D v2 = applyInverseTo(Vector3D.PLUS_K); [EOL]         if ((v2.getZ() < -0.9999999999) || (v2.getZ() > 0.9999999999)) { [EOL]             throw new CardanEulerSingularityException(false); [EOL]         } [EOL]         return new double[] { FastMath.atan2(v1.getX(), -v1.getY()), FastMath.acos(v2.getZ()), FastMath.atan2(v2.getX(), v2.getY()) }; [EOL]     } else { [EOL]         Vector3D v1 = applyTo(Vector3D.PLUS_K); [EOL]         Vector3D v2 = applyInverseTo(Vector3D.PLUS_K); [EOL]         if ((v2.getZ() < -0.9999999999) || (v2.getZ() > 0.9999999999)) { [EOL]             throw new CardanEulerSingularityException(false); [EOL]         } [EOL]         return new double[] { FastMath.atan2(v1.getY(), v1.getX()), FastMath.acos(v2.getZ()), FastMath.atan2(v2.getY(), -v2.getX()) }; [EOL]     } [EOL] } <line_num>: 553,774
public double[][] getMatrix() { [EOL]     double q0q0 = q0 * q0; [EOL]     double q0q1 = q0 * q1; [EOL]     double q0q2 = q0 * q2; [EOL]     double q0q3 = q0 * q3; [EOL]     double q1q1 = q1 * q1; [EOL]     double q1q2 = q1 * q2; [EOL]     double q1q3 = q1 * q3; [EOL]     double q2q2 = q2 * q2; [EOL]     double q2q3 = q2 * q3; [EOL]     double q3q3 = q3 * q3; [EOL]     double[][] m = new double[3][]; [EOL]     m[0] = new double[3]; [EOL]     m[1] = new double[3]; [EOL]     m[2] = new double[3]; [EOL]     m[0][0] = 2.0 * (q0q0 + q1q1) - 1.0; [EOL]     m[1][0] = 2.0 * (q1q2 - q0q3); [EOL]     m[2][0] = 2.0 * (q1q3 + q0q2); [EOL]     m[0][1] = 2.0 * (q1q2 + q0q3); [EOL]     m[1][1] = 2.0 * (q0q0 + q2q2) - 1.0; [EOL]     m[2][1] = 2.0 * (q2q3 - q0q1); [EOL]     m[0][2] = 2.0 * (q1q3 - q0q2); [EOL]     m[1][2] = 2.0 * (q2q3 + q0q1); [EOL]     m[2][2] = 2.0 * (q0q0 + q3q3) - 1.0; [EOL]     return m; [EOL] } <line_num>: 779,813
public Vector3D applyTo(Vector3D u) { [EOL]     double x = u.getX(); [EOL]     double y = u.getY(); [EOL]     double z = u.getZ(); [EOL]     double s = q1 * x + q2 * y + q3 * z; [EOL]     return new Vector3D(2 * (q0 * (x * q0 - (q2 * z - q3 * y)) + s * q1) - x, 2 * (q0 * (y * q0 - (q3 * x - q1 * z)) + s * q2) - y, 2 * (q0 * (z * q0 - (q1 * y - q2 * x)) + s * q3) - z); [EOL] } <line_num>: 819,831
public void applyTo(final double[] in, final double[] out) { [EOL]     final double x = in[0]; [EOL]     final double y = in[1]; [EOL]     final double z = in[2]; [EOL]     final double s = q1 * x + q2 * y + q3 * z; [EOL]     out[0] = 2 * (q0 * (x * q0 - (q2 * z - q3 * y)) + s * q1) - x; [EOL]     out[1] = 2 * (q0 * (y * q0 - (q3 * x - q1 * z)) + s * q2) - y; [EOL]     out[2] = 2 * (q0 * (z * q0 - (q1 * y - q2 * x)) + s * q3) - z; [EOL] } <line_num>: 838,850
public Vector3D applyInverseTo(Vector3D u) { [EOL]     double x = u.getX(); [EOL]     double y = u.getY(); [EOL]     double z = u.getZ(); [EOL]     double s = q1 * x + q2 * y + q3 * z; [EOL]     double m0 = -q0; [EOL]     return new Vector3D(2 * (m0 * (x * m0 - (q2 * z - q3 * y)) + s * q1) - x, 2 * (m0 * (y * m0 - (q3 * x - q1 * z)) + s * q2) - y, 2 * (m0 * (z * m0 - (q1 * y - q2 * x)) + s * q3) - z); [EOL] } <line_num>: 856,869
public void applyInverseTo(final double[] in, final double[] out) { [EOL]     final double x = in[0]; [EOL]     final double y = in[1]; [EOL]     final double z = in[2]; [EOL]     final double s = q1 * x + q2 * y + q3 * z; [EOL]     final double m0 = -q0; [EOL]     out[0] = 2 * (m0 * (x * m0 - (q2 * z - q3 * y)) + s * q1) - x; [EOL]     out[1] = 2 * (m0 * (y * m0 - (q3 * x - q1 * z)) + s * q2) - y; [EOL]     out[2] = 2 * (m0 * (z * m0 - (q1 * y - q2 * x)) + s * q3) - z; [EOL] } <line_num>: 876,889
public Rotation applyTo(Rotation r) { [EOL]     return new Rotation(r.q0 * q0 - (r.q1 * q1 + r.q2 * q2 + r.q3 * q3), r.q1 * q0 + r.q0 * q1 + (r.q2 * q3 - r.q3 * q2), r.q2 * q0 + r.q0 * q2 + (r.q3 * q1 - r.q1 * q3), r.q3 * q0 + r.q0 * q3 + (r.q1 * q2 - r.q2 * q1), false); [EOL] } <line_num>: 900,906
public Rotation applyInverseTo(Rotation r) { [EOL]     return new Rotation(-r.q0 * q0 - (r.q1 * q1 + r.q2 * q2 + r.q3 * q3), -r.q1 * q0 + r.q0 * q1 + (r.q2 * q3 - r.q3 * q2), -r.q2 * q0 + r.q0 * q2 + (r.q3 * q1 - r.q1 * q3), -r.q3 * q0 + r.q0 * q3 + (r.q1 * q2 - r.q2 * q1), false); [EOL] } <line_num>: 919,925
private double[][] orthogonalizeMatrix(double[][] m, double threshold) throws NotARotationMatrixException { [EOL]     double[] m0 = m[0]; [EOL]     double[] m1 = m[1]; [EOL]     double[] m2 = m[2]; [EOL]     double x00 = m0[0]; [EOL]     double x01 = m0[1]; [EOL]     double x02 = m0[2]; [EOL]     double x10 = m1[0]; [EOL]     double x11 = m1[1]; [EOL]     double x12 = m1[2]; [EOL]     double x20 = m2[0]; [EOL]     double x21 = m2[1]; [EOL]     double x22 = m2[2]; [EOL]     double fn = 0; [EOL]     double fn1; [EOL]     double[][] o = new double[3][3]; [EOL]     double[] o0 = o[0]; [EOL]     double[] o1 = o[1]; [EOL]     double[] o2 = o[2]; [EOL]     int i = 0; [EOL]     while (++i < 11) { [EOL]         double mx00 = m0[0] * x00 + m1[0] * x10 + m2[0] * x20; [EOL]         double mx10 = m0[1] * x00 + m1[1] * x10 + m2[1] * x20; [EOL]         double mx20 = m0[2] * x00 + m1[2] * x10 + m2[2] * x20; [EOL]         double mx01 = m0[0] * x01 + m1[0] * x11 + m2[0] * x21; [EOL]         double mx11 = m0[1] * x01 + m1[1] * x11 + m2[1] * x21; [EOL]         double mx21 = m0[2] * x01 + m1[2] * x11 + m2[2] * x21; [EOL]         double mx02 = m0[0] * x02 + m1[0] * x12 + m2[0] * x22; [EOL]         double mx12 = m0[1] * x02 + m1[1] * x12 + m2[1] * x22; [EOL]         double mx22 = m0[2] * x02 + m1[2] * x12 + m2[2] * x22; [EOL]         o0[0] = x00 - 0.5 * (x00 * mx00 + x01 * mx10 + x02 * mx20 - m0[0]); [EOL]         o0[1] = x01 - 0.5 * (x00 * mx01 + x01 * mx11 + x02 * mx21 - m0[1]); [EOL]         o0[2] = x02 - 0.5 * (x00 * mx02 + x01 * mx12 + x02 * mx22 - m0[2]); [EOL]         o1[0] = x10 - 0.5 * (x10 * mx00 + x11 * mx10 + x12 * mx20 - m1[0]); [EOL]         o1[1] = x11 - 0.5 * (x10 * mx01 + x11 * mx11 + x12 * mx21 - m1[1]); [EOL]         o1[2] = x12 - 0.5 * (x10 * mx02 + x11 * mx12 + x12 * mx22 - m1[2]); [EOL]         o2[0] = x20 - 0.5 * (x20 * mx00 + x21 * mx10 + x22 * mx20 - m2[0]); [EOL]         o2[1] = x21 - 0.5 * (x20 * mx01 + x21 * mx11 + x22 * mx21 - m2[1]); [EOL]         o2[2] = x22 - 0.5 * (x20 * mx02 + x21 * mx12 + x22 * mx22 - m2[2]); [EOL]         double corr00 = o0[0] - m0[0]; [EOL]         double corr01 = o0[1] - m0[1]; [EOL]         double corr02 = o0[2] - m0[2]; [EOL]         double corr10 = o1[0] - m1[0]; [EOL]         double corr11 = o1[1] - m1[1]; [EOL]         double corr12 = o1[2] - m1[2]; [EOL]         double corr20 = o2[0] - m2[0]; [EOL]         double corr21 = o2[1] - m2[1]; [EOL]         double corr22 = o2[2] - m2[2]; [EOL]         fn1 = corr00 * corr00 + corr01 * corr01 + corr02 * corr02 + corr10 * corr10 + corr11 * corr11 + corr12 * corr12 + corr20 * corr20 + corr21 * corr21 + corr22 * corr22; [EOL]         if (FastMath.abs(fn1 - fn) <= threshold) { [EOL]             return o; [EOL]         } [EOL]         x00 = o0[0]; [EOL]         x01 = o0[1]; [EOL]         x02 = o0[2]; [EOL]         x10 = o1[0]; [EOL]         x11 = o1[1]; [EOL]         x12 = o1[2]; [EOL]         x20 = o2[0]; [EOL]         x21 = o2[1]; [EOL]         x22 = o2[2]; [EOL]         fn = fn1; [EOL]     } [EOL]     throw new NotARotationMatrixException(LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX, i - 1); [EOL] } <line_num>: 937,1024
public static double distance(Rotation r1, Rotation r2) { [EOL]     return r1.applyInverseTo(r2).getAngle(); [EOL] } <line_num>: 1050,1052