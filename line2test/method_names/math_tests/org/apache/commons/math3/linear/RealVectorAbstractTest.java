public RealVectorAbstractTest()
public RealVectorTestImpl(double[] d)
public abstract RealVector create(double[] data)
public RealVector createAlien(double[] data)
public double getPreferredEntryValue()
public void testGetDimension()
public void testGetEntry()
public void testGetEntryInvalidIndex1()
public void testGetEntryInvalidIndex2()
public void testSetEntry()
public void testSetEntryInvalidIndex1()
public void testSetEntryInvalidIndex2()
public void testAddToEntry()
public void testAddToEntryInvalidIndex1()
public void testAddToEntryInvalidIndex2()
private void doTestAppendVector(final String message, final RealVector v1, final RealVector v2, final double delta)
public void testAppendVector()
private void doTestAppendScalar(final String message, final RealVector v, final double d, final double delta)
public void testAppendScalar()
public void testGetSubVector()
public void testGetSubVectorInvalidIndex1()
public void testGetSubVectorInvalidIndex2()
public void testGetSubVectorInvalidIndex3()
public void testGetSubVectorInvalidIndex4()
public void testSetSubVectorSameType()
public void testSetSubVectorMixedType()
public void testSetSubVectorInvalidIndex1()
public void testSetSubVectorInvalidIndex2()
public void testSetSubVectorInvalidIndex3()
public void testIsNaN()
public void testIsInfinite()
private void doTestEbeBinaryOperation(final BinaryOperation op, final boolean mixed)
private void doTestEbeBinaryOperationDimensionMismatch(final BinaryOperation op)
public void testAddSameType()
public void testAddMixedTypes()
public void testAddDimensionMismatch()
public void testSubtractSameType()
public void testSubtractMixedTypes()
public void testSubtractDimensionMismatch()
public void testEbeMultiplySameType()
public void testEbeMultiplyMixedTypes()
public void testEbeMultiplyDimensionMismatch()
public void testEbeDivideSameType()
public void testEbeDivideMixedTypes()
public void testEbeDivideDimensionMismatch()
private void doTestGetDistance(final boolean mixed)
public void testGetDistanceSameType()
public void testGetDistanceMixedTypes()
public void testGetDistanceDimensionMismatch()
public void testGetNorm()
private void doTestGetL1Distance(final boolean mixed)
public void testGetL1DistanceSameType()
public void testGetL1DistanceMixedTypes()
public void testGetL1DistanceDimensionMismatch()
public void testGetL1Norm()
private void doTestGetLInfDistance(final boolean mixed)
public void testGetLInfDistanceSameType()
public void testGetLInfDistanceMixedTypes()
public void testGetLInfDistanceDimensionMismatch()
public void testGetLInfNorm()
private void doTestMapBinaryOperation(final BinaryOperation op, final boolean inPlace)
public void testMapAdd()
public void testMapAddToSelf()
public void testMapSubtract()
public void testMapSubtractToSelf()
public void testMapMultiply()
public void testMapMultiplyToSelf()
public void testMapDivide()
public void testMapDivideToSelf()
private void doTestMapFunction(final UnivariateFunction f, final boolean inPlace)
private UnivariateFunction[] createFunctions()
public void testMap()
public void testMapToSelf()
private void doTestOuterProduct(final boolean mixed)
public void testOuterProductSameType()
public void testOuterProductMixedTypes()
private void doTestProjection(final boolean mixed)
public void testProjectionSameType()
public void testProjectionMixedTypes()
public void testProjectionNullVector()
public void testProjectionDimensionMismatch()
public void testSet()
public void testToArray()
private void doTestUnitVector(final boolean inPlace)
public void testUnitVector()
public void testUnitize()
private void doTestUnitVectorNullVector(final boolean inPlace)
public void testUnitVectorNullVector()
public void testUnitizeNullVector()
public void testIterator()
private void doTestCombine(final boolean inPlace, final boolean mixed)
private void doTestCombineDimensionMismatch(final boolean inPlace, final boolean mixed)
public void testCombineSameType()
public void testCombineMixedTypes()
public void testCombineDimensionMismatchSameType()
public void testCombineDimensionMismatchMixedTypes()
public void testCombineToSelfSameType()
public void testCombineToSelfMixedTypes()
public void testCombineToSelfDimensionMismatchSameType()
public void testCombineToSelfDimensionMismatchMixedTypes()
public void testCopy()
private void doTestDotProductRegularValues(final boolean mixed)
private void doTestDotProductSpecialValues(final boolean mixed)
private void doTestDotProductDimensionMismatch(final boolean mixed)
public void testDotProductSameType()
public void testDotProductDimensionMismatchSameType()
public void testDotProductMixedTypes()
public void testDotProductDimensionMismatchMixedTypes()
private void doTestCosine(final boolean mixed)
public void testCosineSameType()
public void testCosineMixedTypes()
public void testCosineLeftNullVector()
public void testCosineRightNullVector()
public void testCosineDimensionMismatch()
public void testEquals()
public void testSerial()
public void testMinMax()
public void visit(final int actualIndex, final double actualValue)
public void start(final int actualSize, final int actualStart, final int actualEnd)
public double end()
public void testWalkInDefaultOrderPreservingVisitor1()
public void visit(int index, double value)
public void start(int dimension, int start, int end)
public double end()
public void testWalkInDefaultOrderPreservingVisitor2()
public void visit(final int actualIndex, final double actualValue)
public void start(final int actualSize, final int actualStart, final int actualEnd)
public double end()
public void testWalkInDefaultOrderPreservingVisitor3()
public void visit(final int actualIndex, final double actualValue)
public void start(final int actualSize, final int actualStart, final int actualEnd)
public double end()
public void testWalkInOptimizedOrderPreservingVisitor1()
public void visit(int index, double value)
public void start(int dimension, int start, int end)
public double end()
public void testWalkInOptimizedOrderPreservingVisitor2()
public void visit(final int actualIndex, final double actualValue)
public void start(final int actualSize, final int actualStart, final int actualEnd)
public double end()
public void testWalkInOptimizedOrderPreservingVisitor3()
public double visit(final int actualIndex, final double actualValue)
public void start(final int actualSize, final int actualStart, final int actualEnd)
public double end()
public void testWalkInDefaultOrderChangingVisitor1()
public double visit(int index, double value)
public void start(int dimension, int start, int end)
public double end()
public void testWalkInDefaultOrderChangingVisitor2()
public double visit(final int actualIndex, final double actualValue)
public void start(final int actualSize, final int actualStart, final int actualEnd)
public double end()
public void testWalkInDefaultOrderChangingVisitor3()
public double visit(final int actualIndex, final double actualValue)
public void start(final int actualSize, final int actualStart, final int actualEnd)
public double end()
public void testWalkInOptimizedOrderChangingVisitor1()
public double visit(int index, double value)
public void start(int dimension, int start, int end)
public double end()
public void testWalkInOptimizedOrderChangingVisitor2()
public double visit(final int actualIndex, final double actualValue)
public void start(final int actualSize, final int actualStart, final int actualEnd)
public double end()
public void testWalkInOptimizedOrderChangingVisitor3()
private UnsupportedOperationException unsupported()
public RealVector copy()
public RealVector ebeMultiply(RealVector v)
public RealVector ebeDivide(RealVector v)
public double getEntry(int index)
public int getDimension()
public RealVector append(RealVector v)
public RealVector append(double d)
public RealVector getSubVector(int index, int n)
public void setEntry(int index, double value)
public void setSubVector(int index, RealVector v)
public boolean isNaN()
public boolean isInfinite()
