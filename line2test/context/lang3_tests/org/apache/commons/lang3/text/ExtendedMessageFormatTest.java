public OtherExtendedMessageFormat(final String pattern, final Locale locale, final Map<String, ? extends FormatFactory> registry)
public void setUp() throws Exception
public void testExtendedFormats()
public void testEscapedQuote_LANG_477()
public void testExtendedAndBuiltInFormats()
public void testBuiltInChoiceFormat()
public void testBuiltInDateTimeFormat()
public void testOverriddenBuiltinFormat()
public void testBuiltInNumberFormat()
public void testEqualsHashcode()
private void checkBuiltInFormat(final String pattern, final Object[] args, final Locale[] locales)
private void checkBuiltInFormat(final String pattern, final Map<String, ?> registry, final Object[] args, final Locale[] locales)
private void checkBuiltInFormat(final String pattern, final Map<String, ?> registry, final Object[] args, final Locale locale)
private void assertPatternsEqual(final String message, final String expected, final String actual)
private MessageFormat createMessageFormat(final String pattern, final Locale locale)
public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos)
public Object parseObject(final String source, final ParsePosition pos)
public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos)
public Object parseObject(final String source, final ParsePosition pos)
public Format getFormat(final String name, final String arguments, final Locale locale)
public Format getFormat(final String name, final String arguments, final Locale locale)
public Format getFormat(final String name, final String arguments, final Locale locale)
Map<String, FormatFactory> registry=Optional[new HashMap<String, FormatFactory>()]
