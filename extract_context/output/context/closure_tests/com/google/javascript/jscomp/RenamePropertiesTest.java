public RenamePropertiesTest()
protected void tearDown() throws Exception
protected int getNumRepetitions()
public void testPrototypeProperties()
public void testPrototypePropertiesAsObjLitKeys1()
public void testPrototypePropertiesAsObjLitKeys2()
public void testPrototypePropertiesAsObjLitKeys3()
public void testMixedQuotedAndUnquotedObjLitKeys1()
public void testMixedQuotedAndUnquotedObjLitKeys2()
public void testQuotedPrototypeProperty()
public void testOverlappingOriginalAndGeneratedNames()
public void testRenamePropertiesWithLeadingUnderscores()
public void testPropertyAddedToObject()
public void testPropertyAddedToFunction()
public void testPropertyOfObjectOfUnknownType()
public void testSetPropertyOfThis()
public void testReadPropertyOfThis()
public void testObjectLiteralInLocalScope()
public void testIncorrectAttemptToAccessQuotedProperty()
public void testSetQuotedPropertyOfThis()
public void testExternedPropertyName()
public void testExternedPropertyNameDefinedByObjectLiteral()
public void testAvoidingConflictsBetweenQuotedAndUnquotedPropertyNames()
public void testSamePropertyNameQuotedAndUnquoted()
public void testStaticAndInstanceMethodWithSameName()
public void testRenamePropertiesFunctionCall1()
public void testRenamePropertiesFunctionCall2()
public void testRemoveRenameFunctionStubs1()
public void testRemoveRenameFunctionStubs2()
public void testGeneratePseudoNames()
public void testModules()
public void testPropertyAffinity()
public void testPropertyAffinityOff()
public void testPrototypePropertiesStable()
public void testPrototypePropertiesAsObjLitKeysStable()
public void testMixedQuotedAndUnquotedObjLitKeysStable()
public void testOverlappingOriginalAndGeneratedNamesStable()
public void testStableWithTrickyExternsChanges()
public void testRenamePropertiesWithLeadingUnderscoresStable()
public void testPropertyAddedToObjectStable()
public void testAvoidingConflictsBetQuotedAndUnquotedPropertyNamesStable()
public void testRenamePropertiesFunctionCallStable()
private void testStableRenaming(String input1, String expected1, String input2, String expected2)
private Compiler compileModules(String externs, JSModule[] modules)
public CompilerPass getProcessor(Compiler compiler)
String EXTERNS=Optional["var window;" + "prop.toString;" + "var google = { gears: { factory: {}, workerPool: {} } };"]
RenameProperties renameProperties
boolean generatePseudoNames=Optional[false]
boolean useAffinity=Optional[false]
VariableMap prevUsedPropertyMap=Optional[null]
