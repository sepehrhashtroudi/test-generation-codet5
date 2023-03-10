public StrTokenizer()
public StrTokenizer(final String input)
public StrTokenizer(final String input, final char delim)
public StrTokenizer(final String input, final String delim)
public StrTokenizer(final String input, final StrMatcher delim)
public StrTokenizer(final String input, final char delim, final char quote)
public StrTokenizer(final String input, final StrMatcher delim, final StrMatcher quote)
public StrTokenizer(final char[] input)
public StrTokenizer(final char[] input, final char delim)
public StrTokenizer(final char[] input, final String delim)
public StrTokenizer(final char[] input, final StrMatcher delim)
public StrTokenizer(final char[] input, final char delim, final char quote)
public StrTokenizer(final char[] input, final StrMatcher delim, final StrMatcher quote)
private static StrTokenizer getCSVClone()
public static StrTokenizer getCSVInstance()
public static StrTokenizer getCSVInstance(final String input)
public static StrTokenizer getCSVInstance(final char[] input)
private static StrTokenizer getTSVClone()
public static StrTokenizer getTSVInstance()
public static StrTokenizer getTSVInstance(final String input)
public static StrTokenizer getTSVInstance(final char[] input)
public int size()
public String nextToken()
public String previousToken()
public String[] getTokenArray()
public List<String> getTokenList()
public StrTokenizer reset()
public StrTokenizer reset(final String input)
public StrTokenizer reset(final char[] input)
public boolean hasNext()
public String next()
public int nextIndex()
public boolean hasPrevious()
public String previous()
public int previousIndex()
public void remove()
public void set(final String obj)
public void add(final String obj)
private void checkTokenized()
protected List<String> tokenize(final char[] chars, final int offset, final int count)
private void addToken(final List<String> list, String tok)
private int readNextToken(final char[] chars, int start, final int len, final StrBuilder workArea, final List<String> tokens)
private int readWithQuotes(final char[] chars, final int start, final int len, final StrBuilder workArea, final List<String> tokens, final int quoteStart, final int quoteLen)
private boolean isQuote(final char[] chars, final int pos, final int len, final int quoteStart, final int quoteLen)
public StrMatcher getDelimiterMatcher()
public StrTokenizer setDelimiterMatcher(final StrMatcher delim)
public StrTokenizer setDelimiterChar(final char delim)
public StrTokenizer setDelimiterString(final String delim)
public StrMatcher getQuoteMatcher()
public StrTokenizer setQuoteMatcher(final StrMatcher quote)
public StrTokenizer setQuoteChar(final char quote)
public StrMatcher getIgnoredMatcher()
public StrTokenizer setIgnoredMatcher(final StrMatcher ignored)
public StrTokenizer setIgnoredChar(final char ignored)
public StrMatcher getTrimmerMatcher()
public StrTokenizer setTrimmerMatcher(final StrMatcher trimmer)
public boolean isEmptyTokenAsNull()
public StrTokenizer setEmptyTokenAsNull(final boolean emptyAsNull)
public boolean isIgnoreEmptyTokens()
public StrTokenizer setIgnoreEmptyTokens(final boolean ignoreEmptyTokens)
public String getContent()
public Object clone()
 Object cloneReset() throws CloneNotSupportedException
public String toString()
StrTokenizer CSV_TOKENIZER_PROTOTYPE
StrTokenizer TSV_TOKENIZER_PROTOTYPE
char[] chars
String[] tokens
int tokenPos
StrMatcher delimMatcher=Optional[StrMatcher.splitMatcher()]
StrMatcher quoteMatcher=Optional[StrMatcher.noneMatcher()]
StrMatcher ignoredMatcher=Optional[StrMatcher.noneMatcher()]
StrMatcher trimmerMatcher=Optional[StrMatcher.noneMatcher()]
boolean emptyAsNull=Optional[false]
boolean ignoreEmptyTokens=Optional[true]
