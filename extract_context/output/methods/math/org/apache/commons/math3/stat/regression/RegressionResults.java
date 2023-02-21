@SuppressWarnings("unused") [EOL] private RegressionResults() { [EOL]     this.parameters = null; [EOL]     this.varCovData = null; [EOL]     this.rank = -1; [EOL]     this.nobs = -1; [EOL]     this.containsConstant = false; [EOL]     this.isSymmetricVCD = false; [EOL]     this.globalFitInfo = null; [EOL] } <line_num>: 65,74
public RegressionResults(final double[] parameters, final double[][] varcov, final boolean isSymmetricCompressed, final long nobs, final int rank, final double sumy, final double sumysq, final double sse, final boolean containsConstant, final boolean copyData) { [EOL]     if (copyData) { [EOL]         this.parameters = MathArrays.copyOf(parameters); [EOL]         this.varCovData = new double[varcov.length][]; [EOL]         for (int i = 0; i < varcov.length; i++) { [EOL]             this.varCovData[i] = MathArrays.copyOf(varcov[i]); [EOL]         } [EOL]     } else { [EOL]         this.parameters = parameters; [EOL]         this.varCovData = varcov; [EOL]     } [EOL]     this.isSymmetricVCD = isSymmetricCompressed; [EOL]     this.nobs = nobs; [EOL]     this.rank = rank; [EOL]     this.containsConstant = containsConstant; [EOL]     this.globalFitInfo = new double[5]; [EOL]     Arrays.fill(this.globalFitInfo, Double.NaN); [EOL]     if (rank > 0) { [EOL]         this.globalFitInfo[SST_IDX] = containsConstant ? (sumysq - sumy * sumy / nobs) : sumysq; [EOL]     } [EOL]     this.globalFitInfo[SSE_IDX] = sse; [EOL]     this.globalFitInfo[MSE_IDX] = this.globalFitInfo[SSE_IDX] / (nobs - rank); [EOL]     this.globalFitInfo[RSQ_IDX] = 1.0 - this.globalFitInfo[SSE_IDX] / this.globalFitInfo[SST_IDX]; [EOL]     if (!containsConstant) { [EOL]         this.globalFitInfo[ADJRSQ_IDX] = 1.0 - (1.0 - this.globalFitInfo[RSQ_IDX]) * ((double) nobs / ((double) (nobs - rank))); [EOL]     } else { [EOL]         this.globalFitInfo[ADJRSQ_IDX] = 1.0 - (sse * (nobs - 1.0)) / (globalFitInfo[SST_IDX] * (nobs - rank)); [EOL]     } [EOL] } <line_num>: 93,137
public double getParameterEstimate(int index) throws OutOfRangeException { [EOL]     if (parameters == null) { [EOL]         return Double.NaN; [EOL]     } [EOL]     if (index < 0 || index >= this.parameters.length) { [EOL]         throw new OutOfRangeException(index, 0, this.parameters.length - 1); [EOL]     } [EOL]     return this.parameters[index]; [EOL] } <line_num>: 150,158
public double[] getParameterEstimates() { [EOL]     if (this.parameters == null) { [EOL]         return null; [EOL]     } [EOL]     return MathArrays.copyOf(parameters); [EOL] } <line_num>: 170,175
public double getStdErrorOfEstimate(int index) throws OutOfRangeException { [EOL]     if (parameters == null) { [EOL]         return Double.NaN; [EOL]     } [EOL]     if (index < 0 || index >= this.parameters.length) { [EOL]         throw new OutOfRangeException(index, 0, this.parameters.length - 1); [EOL]     } [EOL]     double var = this.getVcvElement(index, index); [EOL]     if (!Double.isNaN(var) && var > Double.MIN_VALUE) { [EOL]         return FastMath.sqrt(var); [EOL]     } [EOL]     return Double.NaN; [EOL] } <line_num>: 187,199
public double[] getStdErrorOfEstimates() { [EOL]     if (parameters == null) { [EOL]         return null; [EOL]     } [EOL]     double[] se = new double[this.parameters.length]; [EOL]     for (int i = 0; i < this.parameters.length; i++) { [EOL]         double var = this.getVcvElement(i, i); [EOL]         if (!Double.isNaN(var) && var > Double.MIN_VALUE) { [EOL]             se[i] = FastMath.sqrt(var); [EOL]             continue; [EOL]         } [EOL]         se[i] = Double.NaN; [EOL]     } [EOL]     return se; [EOL] } <line_num>: 212,226
public double getCovarianceOfParameters(int i, int j) throws OutOfRangeException { [EOL]     if (parameters == null) { [EOL]         return Double.NaN; [EOL]     } [EOL]     if (i < 0 || i >= this.parameters.length) { [EOL]         throw new OutOfRangeException(i, 0, this.parameters.length - 1); [EOL]     } [EOL]     if (j < 0 || j >= this.parameters.length) { [EOL]         throw new OutOfRangeException(j, 0, this.parameters.length - 1); [EOL]     } [EOL]     return this.getVcvElement(i, j); [EOL] } <line_num>: 240,251
public int getNumberOfParameters() { [EOL]     if (this.parameters == null) { [EOL]         return -1; [EOL]     } [EOL]     return this.parameters.length; [EOL] } <line_num>: 261,266
public long getN() { [EOL]     return this.nobs; [EOL] } <line_num>: 273,275
public double getTotalSumSquares() { [EOL]     return this.globalFitInfo[SST_IDX]; [EOL] } <line_num>: 287,289
public double getRegressionSumSquares() { [EOL]     return this.globalFitInfo[SST_IDX] - this.globalFitInfo[SSE_IDX]; [EOL] } <line_num>: 307,309
public double getErrorSumSquares() { [EOL]     return this.globalFitInfo[SSE_IDX]; [EOL] } <line_num>: 329,331
public double getMeanSquareError() { [EOL]     return this.globalFitInfo[MSE_IDX]; [EOL] } <line_num>: 343,345
public double getRSquared() { [EOL]     return this.globalFitInfo[RSQ_IDX]; [EOL] } <line_num>: 361,363
public double getAdjustedRSquared() { [EOL]     return this.globalFitInfo[ADJRSQ_IDX]; [EOL] } <line_num>: 379,381
public boolean hasIntercept() { [EOL]     return this.containsConstant; [EOL] } <line_num>: 389,391
private double getVcvElement(int i, int j) { [EOL]     if (this.isSymmetricVCD) { [EOL]         if (this.varCovData.length > 1) { [EOL]             if (i == j) { [EOL]                 return varCovData[i][i]; [EOL]             } else if (i >= varCovData[j].length) { [EOL]                 return varCovData[i][j]; [EOL]             } else { [EOL]                 return varCovData[j][i]; [EOL]             } [EOL]         } else { [EOL]             if (i > j) { [EOL]                 return varCovData[0][(i + 1) * i / 2 + j]; [EOL]             } else { [EOL]                 return varCovData[0][(j + 1) * j / 2 + i]; [EOL]             } [EOL]         } [EOL]     } else { [EOL]         return this.varCovData[i][j]; [EOL]     } [EOL] } <line_num>: 400,421
