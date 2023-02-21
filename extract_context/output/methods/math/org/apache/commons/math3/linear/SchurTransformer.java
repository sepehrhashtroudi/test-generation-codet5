public SchurTransformer(final RealMatrix matrix) { [EOL]     if (!matrix.isSquare()) { [EOL]         throw new NonSquareMatrixException(matrix.getRowDimension(), matrix.getColumnDimension()); [EOL]     } [EOL]     HessenbergTransformer transformer = new HessenbergTransformer(matrix); [EOL]     matrixT = transformer.getH().getData(); [EOL]     matrixP = transformer.getP().getData(); [EOL]     cachedT = null; [EOL]     cachedP = null; [EOL]     cachedPt = null; [EOL]     transform(); [EOL] } <line_num>: 69,84
public RealMatrix getP() { [EOL]     if (cachedP == null) { [EOL]         cachedP = MatrixUtils.createRealMatrix(matrixP); [EOL]     } [EOL]     return cachedP; [EOL] } <line_num>: 92,97
public RealMatrix getPT() { [EOL]     if (cachedPt == null) { [EOL]         cachedPt = getP().transpose(); [EOL]     } [EOL]     return cachedPt; [EOL] } <line_num>: 105,112
public RealMatrix getT() { [EOL]     if (cachedT == null) { [EOL]         cachedT = MatrixUtils.createRealMatrix(matrixT); [EOL]     } [EOL]     return cachedT; [EOL] } <line_num>: 119,126
private void transform() { [EOL]     final int n = matrixT.length; [EOL]     final double norm = getNorm(); [EOL]     final ShiftInfo shift = new ShiftInfo(); [EOL]     int iteration = 0; [EOL]     int iu = n - 1; [EOL]     while (iu >= 0) { [EOL]         final int il = findSmallSubDiagonalElement(iu, norm); [EOL]         if (il == iu) { [EOL]             matrixT[iu][iu] = matrixT[iu][iu] + shift.exShift; [EOL]             iu--; [EOL]             iteration = 0; [EOL]         } else if (il == iu - 1) { [EOL]             double p = (matrixT[iu - 1][iu - 1] - matrixT[iu][iu]) / 2.0; [EOL]             double q = p * p + matrixT[iu][iu - 1] * matrixT[iu - 1][iu]; [EOL]             matrixT[iu][iu] += shift.exShift; [EOL]             matrixT[iu - 1][iu - 1] += shift.exShift; [EOL]             if (q >= 0) { [EOL]                 double z = FastMath.sqrt(FastMath.abs(q)); [EOL]                 if (p >= 0) { [EOL]                     z = p + z; [EOL]                 } else { [EOL]                     z = p - z; [EOL]                 } [EOL]                 final double x = matrixT[iu][iu - 1]; [EOL]                 final double s = FastMath.abs(x) + FastMath.abs(z); [EOL]                 p = x / s; [EOL]                 q = z / s; [EOL]                 final double r = FastMath.sqrt(p * p + q * q); [EOL]                 p = p / r; [EOL]                 q = q / r; [EOL]                 for (int j = iu - 1; j < n; j++) { [EOL]                     z = matrixT[iu - 1][j]; [EOL]                     matrixT[iu - 1][j] = q * z + p * matrixT[iu][j]; [EOL]                     matrixT[iu][j] = q * matrixT[iu][j] - p * z; [EOL]                 } [EOL]                 for (int i = 0; i <= iu; i++) { [EOL]                     z = matrixT[i][iu - 1]; [EOL]                     matrixT[i][iu - 1] = q * z + p * matrixT[i][iu]; [EOL]                     matrixT[i][iu] = q * matrixT[i][iu] - p * z; [EOL]                 } [EOL]                 for (int i = 0; i <= n - 1; i++) { [EOL]                     z = matrixP[i][iu - 1]; [EOL]                     matrixP[i][iu - 1] = q * z + p * matrixP[i][iu]; [EOL]                     matrixP[i][iu] = q * matrixP[i][iu] - p * z; [EOL]                 } [EOL]             } [EOL]             iu -= 2; [EOL]             iteration = 0; [EOL]         } else { [EOL]             computeShift(il, iu, iteration, shift); [EOL]             if (++iteration > MAX_ITERATIONS) { [EOL]                 throw new MaxCountExceededException(LocalizedFormats.CONVERGENCE_FAILED, MAX_ITERATIONS); [EOL]             } [EOL]             final double[] hVec = new double[3]; [EOL]             final int im = initQRStep(il, iu, shift, hVec); [EOL]             performDoubleQRStep(il, im, iu, shift, hVec); [EOL]         } [EOL]     } [EOL] } <line_num>: 132,217
private double getNorm() { [EOL]     double norm = 0.0; [EOL]     for (int i = 0; i < matrixT.length; i++) { [EOL]         for (int j = FastMath.max(i - 1, 0); j < matrixT.length; j++) { [EOL]             norm += FastMath.abs(matrixT[i][j]); [EOL]         } [EOL]     } [EOL]     return norm; [EOL] } <line_num>: 224,233
private int findSmallSubDiagonalElement(final int startIdx, final double norm) { [EOL]     int l = startIdx; [EOL]     while (l > 0) { [EOL]         double s = FastMath.abs(matrixT[l - 1][l - 1]) + FastMath.abs(matrixT[l][l]); [EOL]         if (s == 0.0) { [EOL]             s = norm; [EOL]         } [EOL]         if (FastMath.abs(matrixT[l][l - 1]) < epsilon * s) { [EOL]             break; [EOL]         } [EOL]         l--; [EOL]     } [EOL]     return l; [EOL] } <line_num>: 242,255
private void computeShift(final int l, final int idx, final int iteration, final ShiftInfo shift) { [EOL]     shift.x = matrixT[idx][idx]; [EOL]     shift.y = shift.w = 0.0; [EOL]     if (l < idx) { [EOL]         shift.y = matrixT[idx - 1][idx - 1]; [EOL]         shift.w = matrixT[idx][idx - 1] * matrixT[idx - 1][idx]; [EOL]     } [EOL]     if (iteration == 10) { [EOL]         shift.exShift += shift.x; [EOL]         for (int i = 0; i <= idx; i++) { [EOL]             matrixT[i][i] -= shift.x; [EOL]         } [EOL]         final double s = FastMath.abs(matrixT[idx][idx - 1]) + FastMath.abs(matrixT[idx - 1][idx - 2]); [EOL]         shift.x = 0.75 * s; [EOL]         shift.y = 0.75 * s; [EOL]         shift.w = -0.4375 * s * s; [EOL]     } [EOL]     if (iteration == 30) { [EOL]         double s = (shift.y - shift.x) / 2.0; [EOL]         s = s * s + shift.w; [EOL]         if (s > 0.0) { [EOL]             s = FastMath.sqrt(s); [EOL]             if (shift.y < shift.x) { [EOL]                 s = -s; [EOL]             } [EOL]             s = shift.x - shift.w / ((shift.y - shift.x) / 2.0 + s); [EOL]             for (int i = 0; i <= idx; i++) { [EOL]                 matrixT[i][i] -= s; [EOL]             } [EOL]             shift.exShift += s; [EOL]             shift.x = shift.y = shift.w = 0.964; [EOL]         } [EOL]     } [EOL] } <line_num>: 265,303
private int initQRStep(int il, final int iu, final ShiftInfo shift, double[] hVec) { [EOL]     int im = iu - 2; [EOL]     while (im >= il) { [EOL]         final double z = matrixT[im][im]; [EOL]         final double r = shift.x - z; [EOL]         double s = shift.y - z; [EOL]         hVec[0] = (r * s - shift.w) / matrixT[im + 1][im] + matrixT[im][im + 1]; [EOL]         hVec[1] = matrixT[im + 1][im + 1] - z - r - s; [EOL]         hVec[2] = matrixT[im + 2][im + 1]; [EOL]         if (im == il) { [EOL]             break; [EOL]         } [EOL]         final double lhs = FastMath.abs(matrixT[im][im - 1]) * (FastMath.abs(hVec[1]) + FastMath.abs(hVec[2])); [EOL]         final double rhs = FastMath.abs(hVec[0]) * (FastMath.abs(matrixT[im - 1][im - 1]) + FastMath.abs(z) + FastMath.abs(matrixT[im + 1][im + 1])); [EOL]         if (lhs < epsilon * rhs) { [EOL]             break; [EOL]         } [EOL]         im--; [EOL]     } [EOL]     return im; [EOL] } <line_num>: 314,341
private void performDoubleQRStep(final int il, final int im, final int iu, final ShiftInfo shift, final double[] hVec) { [EOL]     final int n = matrixT.length; [EOL]     double p = hVec[0]; [EOL]     double q = hVec[1]; [EOL]     double r = hVec[2]; [EOL]     for (int k = im; k <= iu - 1; k++) { [EOL]         boolean notlast = k != (iu - 1); [EOL]         if (k != im) { [EOL]             p = matrixT[k][k - 1]; [EOL]             q = matrixT[k + 1][k - 1]; [EOL]             r = notlast ? matrixT[k + 2][k - 1] : 0.0; [EOL]             shift.x = FastMath.abs(p) + FastMath.abs(q) + FastMath.abs(r); [EOL]             if (!Precision.equals(shift.x, 0.0, epsilon)) { [EOL]                 p = p / shift.x; [EOL]                 q = q / shift.x; [EOL]                 r = r / shift.x; [EOL]             } [EOL]         } [EOL]         if (shift.x == 0.0) { [EOL]             break; [EOL]         } [EOL]         double s = FastMath.sqrt(p * p + q * q + r * r); [EOL]         if (p < 0.0) { [EOL]             s = -s; [EOL]         } [EOL]         if (s != 0.0) { [EOL]             if (k != im) { [EOL]                 matrixT[k][k - 1] = -s * shift.x; [EOL]             } else if (il != im) { [EOL]                 matrixT[k][k - 1] = -matrixT[k][k - 1]; [EOL]             } [EOL]             p = p + s; [EOL]             shift.x = p / s; [EOL]             shift.y = q / s; [EOL]             double z = r / s; [EOL]             q = q / p; [EOL]             r = r / p; [EOL]             for (int j = k; j < n; j++) { [EOL]                 p = matrixT[k][j] + q * matrixT[k + 1][j]; [EOL]                 if (notlast) { [EOL]                     p = p + r * matrixT[k + 2][j]; [EOL]                     matrixT[k + 2][j] = matrixT[k + 2][j] - p * z; [EOL]                 } [EOL]                 matrixT[k][j] = matrixT[k][j] - p * shift.x; [EOL]                 matrixT[k + 1][j] = matrixT[k + 1][j] - p * shift.y; [EOL]             } [EOL]             for (int i = 0; i <= FastMath.min(iu, k + 3); i++) { [EOL]                 p = shift.x * matrixT[i][k] + shift.y * matrixT[i][k + 1]; [EOL]                 if (notlast) { [EOL]                     p = p + z * matrixT[i][k + 2]; [EOL]                     matrixT[i][k + 2] = matrixT[i][k + 2] - p * r; [EOL]                 } [EOL]                 matrixT[i][k] = matrixT[i][k] - p; [EOL]                 matrixT[i][k + 1] = matrixT[i][k + 1] - p * q; [EOL]             } [EOL]             final int high = matrixT.length - 1; [EOL]             for (int i = 0; i <= high; i++) { [EOL]                 p = shift.x * matrixP[i][k] + shift.y * matrixP[i][k + 1]; [EOL]                 if (notlast) { [EOL]                     p = p + z * matrixP[i][k + 2]; [EOL]                     matrixP[i][k + 2] = matrixP[i][k + 2] - p * r; [EOL]                 } [EOL]                 matrixP[i][k] = matrixP[i][k] - p; [EOL]                 matrixP[i][k + 1] = matrixP[i][k + 1] - p * q; [EOL]             } [EOL]         } [EOL]     } [EOL]     for (int i = im + 2; i <= iu; i++) { [EOL]         matrixT[i][i - 2] = 0.0; [EOL]         if (i > im + 2) { [EOL]             matrixT[i][i - 3] = 0.0; [EOL]         } [EOL]     } [EOL] } <line_num>: 352,436