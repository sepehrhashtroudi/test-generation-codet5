SimplexTableau(final LinearObjectiveFunction f, final Collection<LinearConstraint> constraints, final GoalType goalType, final boolean restrictToNonNegative, final double epsilon) { [EOL]     this(f, constraints, goalType, restrictToNonNegative, epsilon, DEFAULT_ULPS); [EOL] } <line_num>: 119,124
SimplexTableau(final LinearObjectiveFunction f, final Collection<LinearConstraint> constraints, final GoalType goalType, final boolean restrictToNonNegative, final double epsilon, final int maxUlps) { [EOL]     this.f = f; [EOL]     this.constraints = normalizeConstraints(constraints); [EOL]     this.restrictToNonNegative = restrictToNonNegative; [EOL]     this.epsilon = epsilon; [EOL]     this.maxUlps = maxUlps; [EOL]     this.numDecisionVariables = f.getCoefficients().getDimension() + (restrictToNonNegative ? 0 : 1); [EOL]     this.numSlackVariables = getConstraintTypeCounts(Relationship.LEQ) + getConstraintTypeCounts(Relationship.GEQ); [EOL]     this.numArtificialVariables = getConstraintTypeCounts(Relationship.EQ) + getConstraintTypeCounts(Relationship.GEQ); [EOL]     this.tableau = createTableau(goalType == GoalType.MAXIMIZE); [EOL]     initializeColumnLabels(); [EOL] } <line_num>: 135,153
protected void initializeColumnLabels() { [EOL]     if (getNumObjectiveFunctions() == 2) { [EOL]         columnLabels.add("W"); [EOL]     } [EOL]     columnLabels.add("Z"); [EOL]     for (int i = 0; i < getOriginalNumDecisionVariables(); i++) { [EOL]         columnLabels.add("x" + i); [EOL]     } [EOL]     if (!restrictToNonNegative) { [EOL]         columnLabels.add(NEGATIVE_VAR_COLUMN_LABEL); [EOL]     } [EOL]     for (int i = 0; i < getNumSlackVariables(); i++) { [EOL]         columnLabels.add("s" + i); [EOL]     } [EOL]     for (int i = 0; i < getNumArtificialVariables(); i++) { [EOL]         columnLabels.add("a" + i); [EOL]     } [EOL]     columnLabels.add("RHS"); [EOL] } <line_num>: 158,176
protected RealMatrix createTableau(final boolean maximize) { [EOL]     int width = numDecisionVariables + numSlackVariables + numArtificialVariables + getNumObjectiveFunctions() + 1; [EOL]     int height = constraints.size() + getNumObjectiveFunctions(); [EOL]     Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(height, width); [EOL]     if (getNumObjectiveFunctions() == 2) { [EOL]         matrix.setEntry(0, 0, -1); [EOL]     } [EOL]     int zIndex = (getNumObjectiveFunctions() == 1) ? 0 : 1; [EOL]     matrix.setEntry(zIndex, zIndex, maximize ? 1 : -1); [EOL]     RealVector objectiveCoefficients = maximize ? f.getCoefficients().mapMultiply(-1) : f.getCoefficients(); [EOL]     copyArray(objectiveCoefficients.toArray(), matrix.getDataRef()[zIndex]); [EOL]     matrix.setEntry(zIndex, width - 1, maximize ? f.getConstantTerm() : -1 * f.getConstantTerm()); [EOL]     if (!restrictToNonNegative) { [EOL]         matrix.setEntry(zIndex, getSlackVariableOffset() - 1, getInvertedCoefficientSum(objectiveCoefficients)); [EOL]     } [EOL]     int slackVar = 0; [EOL]     int artificialVar = 0; [EOL]     for (int i = 0; i < constraints.size(); i++) { [EOL]         LinearConstraint constraint = constraints.get(i); [EOL]         int row = getNumObjectiveFunctions() + i; [EOL]         copyArray(constraint.getCoefficients().toArray(), matrix.getDataRef()[row]); [EOL]         if (!restrictToNonNegative) { [EOL]             matrix.setEntry(row, getSlackVariableOffset() - 1, getInvertedCoefficientSum(constraint.getCoefficients())); [EOL]         } [EOL]         matrix.setEntry(row, width - 1, constraint.getValue()); [EOL]         if (constraint.getRelationship() == Relationship.LEQ) { [EOL]             matrix.setEntry(row, getSlackVariableOffset() + slackVar++, 1); [EOL]         } else if (constraint.getRelationship() == Relationship.GEQ) { [EOL]             matrix.setEntry(row, getSlackVariableOffset() + slackVar++, -1); [EOL]         } [EOL]         if ((constraint.getRelationship() == Relationship.EQ) || (constraint.getRelationship() == Relationship.GEQ)) { [EOL]             matrix.setEntry(0, getArtificialVariableOffset() + artificialVar, 1); [EOL]             matrix.setEntry(row, getArtificialVariableOffset() + artificialVar++, 1); [EOL]             matrix.setRowVector(0, matrix.getRowVector(0).subtract(matrix.getRowVector(row))); [EOL]         } [EOL]     } [EOL]     return matrix; [EOL] } <line_num>: 183,244
public List<LinearConstraint> normalizeConstraints(Collection<LinearConstraint> originalConstraints) { [EOL]     List<LinearConstraint> normalized = new ArrayList<LinearConstraint>(originalConstraints.size()); [EOL]     for (LinearConstraint constraint : originalConstraints) { [EOL]         normalized.add(normalize(constraint)); [EOL]     } [EOL]     return normalized; [EOL] } <line_num>: 251,257
private LinearConstraint normalize(final LinearConstraint constraint) { [EOL]     if (constraint.getValue() < 0) { [EOL]         return new LinearConstraint(constraint.getCoefficients().mapMultiply(-1), constraint.getRelationship().oppositeRelationship(), -1 * constraint.getValue()); [EOL]     } [EOL]     return new LinearConstraint(constraint.getCoefficients(), constraint.getRelationship(), constraint.getValue()); [EOL] } <line_num>: 264,272
protected final int getNumObjectiveFunctions() { [EOL]     return this.numArtificialVariables > 0 ? 2 : 1; [EOL] } <line_num>: 278,280
private int getConstraintTypeCounts(final Relationship relationship) { [EOL]     int count = 0; [EOL]     for (final LinearConstraint constraint : constraints) { [EOL]         if (constraint.getRelationship() == relationship) { [EOL]             ++count; [EOL]         } [EOL]     } [EOL]     return count; [EOL] } <line_num>: 287,295
protected static double getInvertedCoefficientSum(final RealVector coefficients) { [EOL]     double sum = 0; [EOL]     for (double coefficient : coefficients.toArray()) { [EOL]         sum -= coefficient; [EOL]     } [EOL]     return sum; [EOL] } <line_num>: 302,308
protected Integer getBasicRow(final int col) { [EOL]     Integer row = null; [EOL]     for (int i = 0; i < getHeight(); i++) { [EOL]         final double entry = getEntry(i, col); [EOL]         if (Precision.equals(entry, 1d, maxUlps) && (row == null)) { [EOL]             row = i; [EOL]         } else if (!Precision.equals(entry, 0d, maxUlps)) { [EOL]             return null; [EOL]         } [EOL]     } [EOL]     return row; [EOL] } <line_num>: 315,326
protected void dropPhase1Objective() { [EOL]     if (getNumObjectiveFunctions() == 1) { [EOL]         return; [EOL]     } [EOL]     Set<Integer> columnsToDrop = new TreeSet<Integer>(); [EOL]     columnsToDrop.add(0); [EOL]     for (int i = getNumObjectiveFunctions(); i < getArtificialVariableOffset(); i++) { [EOL]         final double entry = tableau.getEntry(0, i); [EOL]         if (Precision.compareTo(entry, 0d, epsilon) > 0) { [EOL]             columnsToDrop.add(i); [EOL]         } [EOL]     } [EOL]     for (int i = 0; i < getNumArtificialVariables(); i++) { [EOL]         int col = i + getArtificialVariableOffset(); [EOL]         if (getBasicRow(col) == null) { [EOL]             columnsToDrop.add(col); [EOL]         } [EOL]     } [EOL]     double[][] matrix = new double[getHeight() - 1][getWidth() - columnsToDrop.size()]; [EOL]     for (int i = 1; i < getHeight(); i++) { [EOL]         int col = 0; [EOL]         for (int j = 0; j < getWidth(); j++) { [EOL]             if (!columnsToDrop.contains(j)) { [EOL]                 matrix[i - 1][col++] = tableau.getEntry(i, j); [EOL]             } [EOL]         } [EOL]     } [EOL]     Integer[] drop = columnsToDrop.toArray(new Integer[columnsToDrop.size()]); [EOL]     for (int i = drop.length - 1; i >= 0; i--) { [EOL]         columnLabels.remove((int) drop[i]); [EOL]     } [EOL]     this.tableau = new Array2DRowRealMatrix(matrix); [EOL]     this.numArtificialVariables = 0; [EOL] } <line_num>: 332,374
private void copyArray(final double[] src, final double[] dest) { [EOL]     System.arraycopy(src, 0, dest, getNumObjectiveFunctions(), src.length); [EOL] } <line_num>: 380,382
boolean isOptimal() { [EOL]     for (int i = getNumObjectiveFunctions(); i < getWidth() - 1; i++) { [EOL]         final double entry = tableau.getEntry(0, i); [EOL]         if (Precision.compareTo(entry, 0d, epsilon) < 0) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 388,396
protected PointValuePair getSolution() { [EOL]     int negativeVarColumn = columnLabels.indexOf(NEGATIVE_VAR_COLUMN_LABEL); [EOL]     Integer negativeVarBasicRow = negativeVarColumn > 0 ? getBasicRow(negativeVarColumn) : null; [EOL]     double mostNegative = negativeVarBasicRow == null ? 0 : getEntry(negativeVarBasicRow, getRhsOffset()); [EOL]     Set<Integer> basicRows = new HashSet<Integer>(); [EOL]     double[] coefficients = new double[getOriginalNumDecisionVariables()]; [EOL]     for (int i = 0; i < coefficients.length; i++) { [EOL]         int colIndex = columnLabels.indexOf("x" + i); [EOL]         if (colIndex < 0) { [EOL]             coefficients[i] = 0; [EOL]             continue; [EOL]         } [EOL]         Integer basicRow = getBasicRow(colIndex); [EOL]         if (basicRow != null && basicRow == 0) { [EOL]             coefficients[i] = 0; [EOL]         } else if (basicRows.contains(basicRow)) { [EOL]             coefficients[i] = 0 - (restrictToNonNegative ? 0 : mostNegative); [EOL]         } else { [EOL]             basicRows.add(basicRow); [EOL]             coefficients[i] = (basicRow == null ? 0 : getEntry(basicRow, getRhsOffset())) - (restrictToNonNegative ? 0 : mostNegative); [EOL]         } [EOL]     } [EOL]     return new PointValuePair(coefficients, f.getValue(coefficients)); [EOL] } <line_num>: 402,433
protected void divideRow(final int dividendRow, final double divisor) { [EOL]     for (int j = 0; j < getWidth(); j++) { [EOL]         tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor); [EOL]     } [EOL] } <line_num>: 444,448
protected void subtractRow(final int minuendRow, final int subtrahendRow, final double multiple) { [EOL]     for (int i = 0; i < getWidth(); i++) { [EOL]         double result = tableau.getEntry(minuendRow, i) - tableau.getEntry(subtrahendRow, i) * multiple; [EOL]         if (FastMath.abs(result) < CUTOFF_THRESHOLD) { [EOL]             result = 0.0; [EOL]         } [EOL]         tableau.setEntry(minuendRow, i, result); [EOL]     } [EOL] } <line_num>: 460,470
protected final int getWidth() { [EOL]     return tableau.getColumnDimension(); [EOL] } <line_num>: 476,478
protected final int getHeight() { [EOL]     return tableau.getRowDimension(); [EOL] } <line_num>: 484,486
protected final double getEntry(final int row, final int column) { [EOL]     return tableau.getEntry(row, column); [EOL] } <line_num>: 494,496
protected final void setEntry(final int row, final int column, final double value) { [EOL]     tableau.setEntry(row, column, value); [EOL] } <line_num>: 504,507
protected final int getSlackVariableOffset() { [EOL]     return getNumObjectiveFunctions() + numDecisionVariables; [EOL] } <line_num>: 513,515
protected final int getArtificialVariableOffset() { [EOL]     return getNumObjectiveFunctions() + numDecisionVariables + numSlackVariables; [EOL] } <line_num>: 521,523
protected final int getRhsOffset() { [EOL]     return getWidth() - 1; [EOL] } <line_num>: 529,531
protected final int getNumDecisionVariables() { [EOL]     return numDecisionVariables; [EOL] } <line_num>: 542,544
protected final int getOriginalNumDecisionVariables() { [EOL]     return f.getCoefficients().getDimension(); [EOL] } <line_num>: 551,553
protected final int getNumSlackVariables() { [EOL]     return numSlackVariables; [EOL] } <line_num>: 559,561
protected final int getNumArtificialVariables() { [EOL]     return numArtificialVariables; [EOL] } <line_num>: 567,569
protected final double[][] getData() { [EOL]     return tableau.getData(); [EOL] } <line_num>: 575,577
@Override [EOL] public boolean equals(Object other) { [EOL]     if (this == other) { [EOL]         return true; [EOL]     } [EOL]     if (other instanceof SimplexTableau) { [EOL]         SimplexTableau rhs = (SimplexTableau) other; [EOL]         return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 579,599
@Override [EOL] public int hashCode() { [EOL]     return Boolean.valueOf(restrictToNonNegative).hashCode() ^ numDecisionVariables ^ numSlackVariables ^ numArtificialVariables ^ Double.valueOf(epsilon).hashCode() ^ maxUlps ^ f.hashCode() ^ constraints.hashCode() ^ tableau.hashCode(); [EOL] } <line_num>: 601,612
private void writeObject(ObjectOutputStream oos) throws IOException { [EOL]     oos.defaultWriteObject(); [EOL]     MatrixUtils.serializeRealMatrix(tableau, oos); [EOL] } <line_num>: 619,623
private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException { [EOL]     ois.defaultReadObject(); [EOL]     MatrixUtils.deserializeRealMatrix(this, "tableau", ois); [EOL] } <line_num>: 631,635
