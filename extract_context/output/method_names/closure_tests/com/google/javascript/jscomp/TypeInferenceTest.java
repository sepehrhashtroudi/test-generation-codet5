public void setUp()
private void assumingThisType(JSType type)
private void assuming(String name, JSType type)
private void assuming(String name, JSTypeNative type)
private void inFunction(String js)
private JSType getType(String name)
private void verify(String name, JSType type)
private void verify(String name, JSTypeNative type)
private void verifySubtypeOf(String name, JSType type)
private void verifySubtypeOf(String name, JSTypeNative type)
private EnumType createEnumType(String name, JSTypeNative elemType)
private EnumType createEnumType(String name, JSType elemType)
private JSType createUndefinableType(JSTypeNative type)
private JSType createNullableType(JSTypeNative type)
private JSType createNullableType(JSType type)
private JSType createUnionType(JSTypeNative type1, JSTypeNative type2)
public void testAssumption()
public void testVar()
public void testEmptyVar()
public void testAssignment()
public void testExprWithinCast()
public void testGetProp()
public void testGetElemDereference()
public void testIf1()
public void testIf1a()
public void testIf2()
public void testIf3()
public void testPropertyInference1()
public void testPropertyInference2()
public void testPropertyInference3()
public void testAssert1()
public void testAssert1a()
public void testAssert2()
public void testAssert3()
public void testAssert4()
public void testAssert5()
public void testAssert6()
public void testAssert7()
public void testAssert8()
public void testAssert9()
public void testAssert10()
public void testAssertNumber()
public void testAssertNumber2()
public void testAssertNumber3()
public void testAssertString()
public void testAssertFunction()
public void testAssertObject()
public void testAssertObject2()
public void testAssertObject3()
public void testAssertObject4()
public void testAssertObject5()
public void testAssertArray()
public void testAssertInstanceof1()
public void testAssertInstanceof2()
public void testAssertInstanceof3()
public void testAssertInstanceof4()
public void testAssertInstanceof5()
public void testAssertWithIsDefAndNotNull()
public void testIsDefAndNoResolvedType()
public void testAssertWithNotIsNull()
public void testReturn1()
public void testReturn2()
public void testWhile1()
public void testWhile2()
public void testDo()
public void testFor1()
public void testFor2()
public void testFor3()
public void testFor4()
public void testFor5()
public void testFor6()
public void testSwitch1()
public void testSwitch2()
public void testSwitch3()
public void testSwitch4()
public void testCall1()
public void testNew1()
public void testInnerFunction1()
public void testInnerFunction2()
public void testHook()
public void testThrow()
public void testTry1()
public void testTry2()
public void testTry3()
public void testCatch1()
public void testCatch2()
public void testUnknownType1()
public void testUnknownType2()
public void testInfiniteLoop1()
public void testInfiniteLoop2()
public void testJoin1()
public void testJoin2()
public void testArrayLit()
public void testGetElem()
public void testEnumRAI1()
public void testEnumRAI2()
public void testEnumRAI3()
public void testEnumRAI4()
public void testShortCircuitingAnd()
public void testShortCircuitingAnd2()
public void testShortCircuitingOr()
public void testShortCircuitingOr2()
public void testAssignInCondition()
public void testInstanceOf1()
public void testInstanceOf2()
public void testInstanceOf3()
public void testInstanceOf4()
public void testInstanceOf5()
public void testInstanceOf6()
public void testFlattening()
public void testUnary()
public void testAdd1()
public void testAdd2()
public void testAdd3()
public void testAssignAdd()
public void testComparison()
public void testThrownExpression()
public void testObjectLit()
public void testCast1()
public void testCast2()
public void testBackwardsInferenceCall()
public void testBackwardsInferenceNew()
public void testNoThisInference()
public void testRecordInference()
public void testIssue785()
public void testAssertTypeofProp()
private ObjectType getNativeObjectType(JSTypeNative t)
private JSType getNativeType(JSTypeNative t)
private JSType parameterize(ObjectType objType, JSType t)
