public QRDecomposition(RealMatrix matrix) { [EOL]     this(matrix, 0d); [EOL] } <line_num>: 80,82
public QRDecomposition(RealMatrix matrix, double threshold) { [EOL]     this.threshold = threshold; [EOL]     final int m = matrix.getRowDimension(); [EOL]     final int n = matrix.getColumnDimension(); [EOL]     qrt = matrix.transpose().getData(); [EOL]     rDiag = new double[FastMath.min(m, n)]; [EOL]     cachedQ = null; [EOL]     cachedQT = null; [EOL]     cachedR = null; [EOL]     cachedH = null; [EOL]     decompose(qrt); [EOL] } <line_num>: 90,105
private Solver(final double[][] qrt, final double[] rDiag, final double threshold) { [EOL]     this.qrt = qrt; [EOL]     this.rDiag = rDiag; [EOL]     this.threshold = threshold; [EOL] } <line_num>: 321,327
protected void decompose(double[][] matrix) { [EOL]     for (int minor = 0; minor < FastMath.min(qrt.length, qrt[0].length); minor++) { [EOL]         performHouseholderReflection(minor, qrt); [EOL]     } [EOL] } <line_num>: 111,115
protected void performHouseholderReflection(int minor, double[][] matrix) { [EOL]     final double[] qrtMinor = qrt[minor]; [EOL]     double xNormSqr = 0; [EOL]     for (int row = minor; row < qrtMinor.length; row++) { [EOL]         final double c = qrtMinor[row]; [EOL]         xNormSqr += c * c; [EOL]     } [EOL]     final double a = (qrtMinor[minor] > 0) ? -FastMath.sqrt(xNormSqr) : FastMath.sqrt(xNormSqr); [EOL]     rDiag[minor] = a; [EOL]     if (a != 0.0) { [EOL]         qrtMinor[minor] -= a; [EOL]         for (int col = minor + 1; col < qrt.length; col++) { [EOL]             final double[] qrtCol = qrt[col]; [EOL]             double alpha = 0; [EOL]             for (int row = minor; row < qrtCol.length; row++) { [EOL]                 alpha -= qrtCol[row] * qrtMinor[row]; [EOL]             } [EOL]             alpha /= a * qrtMinor[minor]; [EOL]             for (int row = minor; row < qrtCol.length; row++) { [EOL]                 qrtCol[row] -= alpha * qrtMinor[row]; [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 122,179
public RealMatrix getR() { [EOL]     if (cachedR == null) { [EOL]         final int n = qrt.length; [EOL]         final int m = qrt[0].length; [EOL]         double[][] ra = new double[m][n]; [EOL]         for (int row = FastMath.min(m, n) - 1; row >= 0; row--) { [EOL]             ra[row][row] = rDiag[row]; [EOL]             for (int col = row + 1; col < n; col++) { [EOL]                 ra[row][col] = qrt[col][row]; [EOL]             } [EOL]         } [EOL]         cachedR = MatrixUtils.createRealMatrix(ra); [EOL]     } [EOL]     return cachedR; [EOL] } <line_num>: 187,207
public RealMatrix getQ() { [EOL]     if (cachedQ == null) { [EOL]         cachedQ = getQT().transpose(); [EOL]     } [EOL]     return cachedQ; [EOL] } <line_num>: 214,219
public RealMatrix getQT() { [EOL]     if (cachedQT == null) { [EOL]         final int n = qrt.length; [EOL]         final int m = qrt[0].length; [EOL]         double[][] qta = new double[m][m]; [EOL]         for (int minor = m - 1; minor >= FastMath.min(m, n); minor--) { [EOL]             qta[minor][minor] = 1.0d; [EOL]         } [EOL]         for (int minor = FastMath.min(m, n) - 1; minor >= 0; minor--) { [EOL]             final double[] qrtMinor = qrt[minor]; [EOL]             qta[minor][minor] = 1.0d; [EOL]             if (qrtMinor[minor] != 0.0) { [EOL]                 for (int col = minor; col < m; col++) { [EOL]                     double alpha = 0; [EOL]                     for (int row = minor; row < m; row++) { [EOL]                         alpha -= qta[col][row] * qrtMinor[row]; [EOL]                     } [EOL]                     alpha /= rDiag[minor] * qrtMinor[minor]; [EOL]                     for (int row = minor; row < m; row++) { [EOL]                         qta[col][row] += -alpha * qrtMinor[row]; [EOL]                     } [EOL]                 } [EOL]             } [EOL]         } [EOL]         cachedQT = MatrixUtils.createRealMatrix(qta); [EOL]     } [EOL]     return cachedQT; [EOL] } <line_num>: 226,265
public RealMatrix getH() { [EOL]     if (cachedH == null) { [EOL]         final int n = qrt.length; [EOL]         final int m = qrt[0].length; [EOL]         double[][] ha = new double[m][n]; [EOL]         for (int i = 0; i < m; ++i) { [EOL]             for (int j = 0; j < FastMath.min(i + 1, n); ++j) { [EOL]                 ha[i][j] = qrt[j][i] / -rDiag[j]; [EOL]             } [EOL]         } [EOL]         cachedH = MatrixUtils.createRealMatrix(ha); [EOL]     } [EOL]     return cachedH; [EOL] } <line_num>: 274,290
public DecompositionSolver getSolver() { [EOL]     return new Solver(qrt, rDiag, threshold); [EOL] } <line_num>: 296,298
public boolean isNonSingular() { [EOL]     for (double diag : rDiag) { [EOL]         if (FastMath.abs(diag) <= threshold) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 330,337
public RealVector solve(RealVector b) { [EOL]     final int n = qrt.length; [EOL]     final int m = qrt[0].length; [EOL]     if (b.getDimension() != m) { [EOL]         throw new DimensionMismatchException(b.getDimension(), m); [EOL]     } [EOL]     if (!isNonSingular()) { [EOL]         throw new SingularMatrixException(); [EOL]     } [EOL]     final double[] x = new double[n]; [EOL]     final double[] y = b.toArray(); [EOL]     for (int minor = 0; minor < FastMath.min(m, n); minor++) { [EOL]         final double[] qrtMinor = qrt[minor]; [EOL]         double dotProduct = 0; [EOL]         for (int row = minor; row < m; row++) { [EOL]             dotProduct += y[row] * qrtMinor[row]; [EOL]         } [EOL]         dotProduct /= rDiag[minor] * qrtMinor[minor]; [EOL]         for (int row = minor; row < m; row++) { [EOL]             y[row] += dotProduct * qrtMinor[row]; [EOL]         } [EOL]     } [EOL]     for (int row = rDiag.length - 1; row >= 0; --row) { [EOL]         y[row] /= rDiag[row]; [EOL]         final double yRow = y[row]; [EOL]         final double[] qrtRow = qrt[row]; [EOL]         x[row] = yRow; [EOL]         for (int i = 0; i < row; i++) { [EOL]             y[i] -= yRow * qrtRow[i]; [EOL]         } [EOL]     } [EOL]     return new ArrayRealVector(x, false); [EOL] } <line_num>: 340,380
public RealMatrix solve(RealMatrix b) { [EOL]     final int n = qrt.length; [EOL]     final int m = qrt[0].length; [EOL]     if (b.getRowDimension() != m) { [EOL]         throw new DimensionMismatchException(b.getRowDimension(), m); [EOL]     } [EOL]     if (!isNonSingular()) { [EOL]         throw new SingularMatrixException(); [EOL]     } [EOL]     final int columns = b.getColumnDimension(); [EOL]     final int blockSize = BlockRealMatrix.BLOCK_SIZE; [EOL]     final int cBlocks = (columns + blockSize - 1) / blockSize; [EOL]     final double[][] xBlocks = BlockRealMatrix.createBlocksLayout(n, columns); [EOL]     final double[][] y = new double[b.getRowDimension()][blockSize]; [EOL]     final double[] alpha = new double[blockSize]; [EOL]     for (int kBlock = 0; kBlock < cBlocks; ++kBlock) { [EOL]         final int kStart = kBlock * blockSize; [EOL]         final int kEnd = FastMath.min(kStart + blockSize, columns); [EOL]         final int kWidth = kEnd - kStart; [EOL]         b.copySubMatrix(0, m - 1, kStart, kEnd - 1, y); [EOL]         for (int minor = 0; minor < FastMath.min(m, n); minor++) { [EOL]             final double[] qrtMinor = qrt[minor]; [EOL]             final double factor = 1.0 / (rDiag[minor] * qrtMinor[minor]); [EOL]             Arrays.fill(alpha, 0, kWidth, 0.0); [EOL]             for (int row = minor; row < m; ++row) { [EOL]                 final double d = qrtMinor[row]; [EOL]                 final double[] yRow = y[row]; [EOL]                 for (int k = 0; k < kWidth; ++k) { [EOL]                     alpha[k] += d * yRow[k]; [EOL]                 } [EOL]             } [EOL]             for (int k = 0; k < kWidth; ++k) { [EOL]                 alpha[k] *= factor; [EOL]             } [EOL]             for (int row = minor; row < m; ++row) { [EOL]                 final double d = qrtMinor[row]; [EOL]                 final double[] yRow = y[row]; [EOL]                 for (int k = 0; k < kWidth; ++k) { [EOL]                     yRow[k] += alpha[k] * d; [EOL]                 } [EOL]             } [EOL]         } [EOL]         for (int j = rDiag.length - 1; j >= 0; --j) { [EOL]             final int jBlock = j / blockSize; [EOL]             final int jStart = jBlock * blockSize; [EOL]             final double factor = 1.0 / rDiag[j]; [EOL]             final double[] yJ = y[j]; [EOL]             final double[] xBlock = xBlocks[jBlock * cBlocks + kBlock]; [EOL]             int index = (j - jStart) * kWidth; [EOL]             for (int k = 0; k < kWidth; ++k) { [EOL]                 yJ[k] *= factor; [EOL]                 xBlock[index++] = yJ[k]; [EOL]             } [EOL]             final double[] qrtJ = qrt[j]; [EOL]             for (int i = 0; i < j; ++i) { [EOL]                 final double rIJ = qrtJ[i]; [EOL]                 final double[] yI = y[i]; [EOL]                 for (int k = 0; k < kWidth; ++k) { [EOL]                     yI[k] -= yJ[k] * rIJ; [EOL]                 } [EOL]             } [EOL]         } [EOL]     } [EOL]     return new BlockRealMatrix(n, columns, xBlocks, false); [EOL] } <line_num>: 383,459
public RealMatrix getInverse() { [EOL]     return solve(MatrixUtils.createRealIdentityMatrix(rDiag.length)); [EOL] } <line_num>: 462,464