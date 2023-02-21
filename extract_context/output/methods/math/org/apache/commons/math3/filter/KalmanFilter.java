public KalmanFilter(final ProcessModel process, final MeasurementModel measurement) throws NullArgumentException, NonSquareMatrixException, DimensionMismatchException, MatrixDimensionMismatchException { [EOL]     MathUtils.checkNotNull(process); [EOL]     MathUtils.checkNotNull(measurement); [EOL]     this.processModel = process; [EOL]     this.measurementModel = measurement; [EOL]     transitionMatrix = processModel.getStateTransitionMatrix(); [EOL]     MathUtils.checkNotNull(transitionMatrix); [EOL]     transitionMatrixT = transitionMatrix.transpose(); [EOL]     if (processModel.getControlMatrix() == null) { [EOL]         controlMatrix = new Array2DRowRealMatrix(); [EOL]     } else { [EOL]         controlMatrix = processModel.getControlMatrix(); [EOL]     } [EOL]     measurementMatrix = measurementModel.getMeasurementMatrix(); [EOL]     MathUtils.checkNotNull(measurementMatrix); [EOL]     measurementMatrixT = measurementMatrix.transpose(); [EOL]     RealMatrix processNoise = processModel.getProcessNoise(); [EOL]     MathUtils.checkNotNull(processNoise); [EOL]     RealMatrix measNoise = measurementModel.getMeasurementNoise(); [EOL]     MathUtils.checkNotNull(measNoise); [EOL]     if (processModel.getInitialStateEstimate() == null) { [EOL]         stateEstimation = new ArrayRealVector(transitionMatrix.getColumnDimension()); [EOL]     } else { [EOL]         stateEstimation = processModel.getInitialStateEstimate(); [EOL]     } [EOL]     if (transitionMatrix.getColumnDimension() != stateEstimation.getDimension()) { [EOL]         throw new DimensionMismatchException(transitionMatrix.getColumnDimension(), stateEstimation.getDimension()); [EOL]     } [EOL]     if (processModel.getInitialErrorCovariance() == null) { [EOL]         errorCovariance = processNoise.copy(); [EOL]     } else { [EOL]         errorCovariance = processModel.getInitialErrorCovariance(); [EOL]     } [EOL]     if (!transitionMatrix.isSquare()) { [EOL]         throw new NonSquareMatrixException(transitionMatrix.getRowDimension(), transitionMatrix.getColumnDimension()); [EOL]     } [EOL]     if (controlMatrix != null && controlMatrix.getRowDimension() > 0 && controlMatrix.getColumnDimension() > 0 && (controlMatrix.getRowDimension() != transitionMatrix.getRowDimension() || controlMatrix.getColumnDimension() != 1)) { [EOL]         throw new MatrixDimensionMismatchException(controlMatrix.getRowDimension(), controlMatrix.getColumnDimension(), transitionMatrix.getRowDimension(), 1); [EOL]     } [EOL]     MatrixUtils.checkAdditionCompatible(transitionMatrix, processNoise); [EOL]     if (measurementMatrix.getColumnDimension() != transitionMatrix.getRowDimension()) { [EOL]         throw new MatrixDimensionMismatchException(measurementMatrix.getRowDimension(), measurementMatrix.getColumnDimension(), measurementMatrix.getRowDimension(), transitionMatrix.getRowDimension()); [EOL]     } [EOL]     if (measNoise.getRowDimension() != measurementMatrix.getRowDimension() || measNoise.getColumnDimension() != 1) { [EOL]         throw new MatrixDimensionMismatchException(measNoise.getRowDimension(), measNoise.getColumnDimension(), measurementMatrix.getRowDimension(), 1); [EOL]     } [EOL] } <line_num>: 121,213
public int getStateDimension() { [EOL]     return stateEstimation.getDimension(); [EOL] } <line_num>: 220,222
public int getMeasurementDimension() { [EOL]     return measurementMatrix.getRowDimension(); [EOL] } <line_num>: 229,231
public double[] getStateEstimation() { [EOL]     return stateEstimation.toArray(); [EOL] } <line_num>: 238,240
public RealVector getStateEstimationVector() { [EOL]     return stateEstimation.copy(); [EOL] } <line_num>: 247,249
public double[][] getErrorCovariance() { [EOL]     return errorCovariance.getData(); [EOL] } <line_num>: 256,258
public RealMatrix getErrorCovarianceMatrix() { [EOL]     return errorCovariance.copy(); [EOL] } <line_num>: 265,267
public void predict() { [EOL]     predict((RealVector) null); [EOL] } <line_num>: 272,274
public void predict(final double[] u) throws DimensionMismatchException { [EOL]     predict(new ArrayRealVector(u)); [EOL] } <line_num>: 284,286
public void predict(final RealVector u) throws DimensionMismatchException { [EOL]     if (u != null && u.getDimension() != controlMatrix.getColumnDimension()) { [EOL]         throw new DimensionMismatchException(u.getDimension(), controlMatrix.getColumnDimension()); [EOL]     } [EOL]     stateEstimation = transitionMatrix.operate(stateEstimation); [EOL]     if (u != null) { [EOL]         stateEstimation = stateEstimation.add(controlMatrix.operate(u)); [EOL]     } [EOL]     errorCovariance = transitionMatrix.multiply(errorCovariance).multiply(transitionMatrixT).add(processModel.getProcessNoise()); [EOL] } <line_num>: 296,318
public void correct(final double[] z) throws NullArgumentException, DimensionMismatchException, SingularMatrixException { [EOL]     correct(new ArrayRealVector(z)); [EOL] } <line_num>: 332,335
public void correct(final RealVector z) throws NullArgumentException, DimensionMismatchException, SingularMatrixException { [EOL]     MathUtils.checkNotNull(z); [EOL]     if (z.getDimension() != measurementMatrix.getRowDimension()) { [EOL]         throw new DimensionMismatchException(z.getDimension(), measurementMatrix.getRowDimension()); [EOL]     } [EOL]     RealMatrix s = measurementMatrix.multiply(errorCovariance).multiply(measurementMatrixT).add(measurementModel.getMeasurementNoise()); [EOL]     DecompositionSolver solver = new CholeskyDecomposition(s).getSolver(); [EOL]     RealMatrix invertedS = solver.getInverse(); [EOL]     RealVector innovation = z.subtract(measurementMatrix.operate(stateEstimation)); [EOL]     RealMatrix kalmanGain = errorCovariance.multiply(measurementMatrixT).multiply(invertedS); [EOL]     stateEstimation = stateEstimation.add(kalmanGain.operate(innovation)); [EOL]     RealMatrix identity = MatrixUtils.createRealIdentityMatrix(kalmanGain.getRowDimension()); [EOL]     errorCovariance = identity.subtract(kalmanGain.multiply(measurementMatrix)).multiply(errorCovariance); [EOL] } <line_num>: 349,386
