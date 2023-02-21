 SimplexTableau(final LinearObjectiveFunction f, final Collection<LinearConstraint> constraints, final GoalType goalType, final boolean restrictToNonNegative, final double epsilon)
 SimplexTableau(final LinearObjectiveFunction f, final Collection<LinearConstraint> constraints, final GoalType goalType, final boolean restrictToNonNegative, final double epsilon, final int maxUlps)
protected void initializeColumnLabels()
protected RealMatrix createTableau(final boolean maximize)
public List<LinearConstraint> normalizeConstraints(Collection<LinearConstraint> originalConstraints)
private LinearConstraint normalize(final LinearConstraint constraint)
protected final int getNumObjectiveFunctions()
private int getConstraintTypeCounts(final Relationship relationship)
protected static double getInvertedCoefficientSum(final RealVector coefficients)
protected Integer getBasicRow(final int col)
protected void dropPhase1Objective()
private void copyArray(final double[] src, final double[] dest)
 boolean isOptimal()
protected PointValuePair getSolution()
protected void divideRow(final int dividendRow, final double divisor)
protected void subtractRow(final int minuendRow, final int subtrahendRow, final double multiple)
protected final int getWidth()
protected final int getHeight()
protected final double getEntry(final int row, final int column)
protected final void setEntry(final int row, final int column, final double value)
protected final int getSlackVariableOffset()
protected final int getArtificialVariableOffset()
protected final int getRhsOffset()
protected final int getNumDecisionVariables()
protected final int getOriginalNumDecisionVariables()
protected final int getNumSlackVariables()
protected final int getNumArtificialVariables()
protected final double[][] getData()
public boolean equals(Object other)
public int hashCode()
private void writeObject(ObjectOutputStream oos) throws IOException
private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException
String NEGATIVE_VAR_COLUMN_LABEL=Optional["x-"]
int DEFAULT_ULPS=Optional[10]
double CUTOFF_THRESHOLD=Optional[1e-12]
long serialVersionUID=Optional[-1369660067587938365L]
LinearObjectiveFunction f
List<LinearConstraint> constraints
boolean restrictToNonNegative
List<String> columnLabels=Optional[new ArrayList<String>()]
RealMatrix tableau
int numDecisionVariables
int numSlackVariables
int numArtificialVariables
double epsilon
int maxUlps
