 abstract RealTransformer createRealTransformer()
 abstract int getInvalidDataSize(int i)
 abstract int getNumberOfInvalidDataSizes()
 abstract int getNumberOfValidDataSizes()
 abstract double getRelativeTolerance(int i)
 abstract int getValidDataSize(int i)
 abstract UnivariateFunction getValidFunction()
 abstract double getValidLowerBound()
 abstract double getValidUpperBound()
 abstract double[] transform(double[] x, TransformType type)
public void testTransformRealInvalidDataSize()
public void testTransformFunctionInvalidDataSize()
public void testTransformFunctionNotStrictlyPositiveNumberOfSamples()
public void testTransformFunctionInvalidBounds()
public void testTransformReal()
public void testTransformFunction()
 double[] createRealData(final int n)
private void doTestTransformReal(final int n, final double tol, final TransformType type)
private void doTestTransformFunction(final int n, final double tol, final TransformType type)
long SEED=Optional[20110119L]
