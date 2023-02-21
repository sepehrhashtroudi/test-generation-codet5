public FieldLUDecomposition(FieldMatrix<T> matrix)
private Solver(final Field<T> field, final T[][] lu, final int[] pivot, final boolean singular)
public FieldMatrix<T> getL()
public FieldMatrix<T> getU()
public FieldMatrix<T> getP()
public int[] getPivot()
public T getDeterminant()
public FieldDecompositionSolver<T> getSolver()
public boolean isNonSingular()
public FieldVector<T> solve(FieldVector<T> b)
public ArrayFieldVector<T> solve(ArrayFieldVector<T> b)
public FieldMatrix<T> solve(FieldMatrix<T> b)
public FieldMatrix<T> getInverse()