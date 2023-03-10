protected CompilerPass getProcessor(Compiler compiler)
protected int getNumRepetitions()
protected void setUp()
public void testReplaceSimpleMessage()
public void testNameReplacement()
public void testGetPropReplacement()
public void testFunctionCallReplacement()
public void testMethodCallReplacement()
public void testHookReplacement()
public void testAddReplacement()
public void testPlaceholderValueReferencedTwice()
public void testPlaceholderNameInLowerCamelCase()
public void testQualifiedMessageName()
public void testSimpleMessageReplacementMissing()
public void testSimpleMessageReplacementMissingWithNewStyle()
public void testStrictModeAndMessageReplacementAbsentInBundle()
public void testStrictModeAndMessageReplacementAbsentInNonEmptyBundle()
public void testFunctionReplacementMissing()
public void testFunctionWithParamReplacementMissing()
public void testPlaceholderNameInLowerUnderscoreCase()
public void testBadPlaceholderReferenceInReplacement()
public void testLegacyStyleNoPlaceholdersVarSyntax()
public void testLegacyStyleNoPlaceholdersFunctionSyntax()
public void testLegacyStyleOnePlaceholder()
public void testLegacyStyleTwoPlaceholders()
public void testLegacyStylePlaceholderNameInLowerCamelCase()
public void testLegacyStylePlaceholderNameInLowerUnderscoreCase()
public void testLegacyStyleBadPlaceholderReferenceInReplacemen()
public void testTranslatedPlaceHolderMissMatch()
public void testBadFallbackSyntax1()
public void testBadFallbackSyntax2()
public void testBadFallbackSyntax3()
public void testBadFallbackSyntax4()
public void testUseFallback()
public void testFallbackEmptyBundle()
public void testNoUseFallback()
public void testNoUseFallback2()
private void registerMessage(JsMessage message)
public JsMessage getMessage(String id)
public Iterable<JsMessage> getAllMessages()
public JsMessage.IdGenerator idGenerator()
Map<String, JsMessage> messages
Style style=Optional[RELAX]
boolean strictReplacement
