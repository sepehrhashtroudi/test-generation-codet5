public StrBuilder()
public StrBuilder(int initialCapacity)
public StrBuilder(final String str)
 StrBuilderTokenizer()
 StrBuilderReader()
 StrBuilderWriter()
public String getNewLineText()
public StrBuilder setNewLineText(final String newLine)
public String getNullText()
public StrBuilder setNullText(String nullText)
public int length()
public StrBuilder setLength(final int length)
public int capacity()
public StrBuilder ensureCapacity(final int capacity)
public StrBuilder minimizeCapacity()
public int size()
public boolean isEmpty()
public StrBuilder clear()
public char charAt(final int index)
public StrBuilder setCharAt(final int index, final char ch)
public StrBuilder deleteCharAt(final int index)
public char[] toCharArray()
public char[] toCharArray(final int startIndex, int endIndex)
public char[] getChars(char[] destination)
public void getChars(final int startIndex, final int endIndex, final char[] destination, final int destinationIndex)
public StrBuilder appendNewLine()
public StrBuilder appendNull()
public StrBuilder append(final Object obj)
public StrBuilder append(final CharSequence seq)
public StrBuilder append(final CharSequence seq, final int startIndex, final int length)
public StrBuilder append(final String str)
public StrBuilder append(final String str, final int startIndex, final int length)
public StrBuilder append(final String format, final Object... objs)
public StrBuilder append(final StringBuffer str)
public StrBuilder append(final StringBuffer str, final int startIndex, final int length)
public StrBuilder append(final StringBuilder str)
public StrBuilder append(final StringBuilder str, final int startIndex, final int length)
public StrBuilder append(final StrBuilder str)
public StrBuilder append(final StrBuilder str, final int startIndex, final int length)
public StrBuilder append(final char[] chars)
public StrBuilder append(final char[] chars, final int startIndex, final int length)
public StrBuilder append(final boolean value)
public StrBuilder append(final char ch)
public StrBuilder append(final int value)
public StrBuilder append(final long value)
public StrBuilder append(final float value)
public StrBuilder append(final double value)
public StrBuilder appendln(final Object obj)
public StrBuilder appendln(final String str)
public StrBuilder appendln(final String str, final int startIndex, final int length)
public StrBuilder appendln(final String format, final Object... objs)
public StrBuilder appendln(final StringBuffer str)
public StrBuilder appendln(final StringBuilder str)
public StrBuilder appendln(final StringBuilder str, final int startIndex, final int length)
public StrBuilder appendln(final StringBuffer str, final int startIndex, final int length)
public StrBuilder appendln(final StrBuilder str)
public StrBuilder appendln(final StrBuilder str, final int startIndex, final int length)
public StrBuilder appendln(final char[] chars)
public StrBuilder appendln(final char[] chars, final int startIndex, final int length)
public StrBuilder appendln(final boolean value)
public StrBuilder appendln(final char ch)
public StrBuilder appendln(final int value)
public StrBuilder appendln(final long value)
public StrBuilder appendln(final float value)
public StrBuilder appendln(final double value)
public StrBuilder appendAll(final T... array)
public StrBuilder appendAll(final Iterable<?> iterable)
public StrBuilder appendAll(final Iterator<?> it)
public StrBuilder appendWithSeparators(final Object[] array, String separator)
public StrBuilder appendWithSeparators(final Iterable<?> iterable, String separator)
public StrBuilder appendWithSeparators(final Iterator<?> it, String separator)
public StrBuilder appendSeparator(final String separator)
public StrBuilder appendSeparator(final String standard, final String defaultIfEmpty)
public StrBuilder appendSeparator(final char separator)
public StrBuilder appendSeparator(final char standard, final char defaultIfEmpty)
public StrBuilder appendSeparator(final String separator, final int loopIndex)
public StrBuilder appendSeparator(final char separator, final int loopIndex)
public StrBuilder appendPadding(final int length, final char padChar)
public StrBuilder appendFixedWidthPadLeft(final Object obj, final int width, final char padChar)
public StrBuilder appendFixedWidthPadLeft(final int value, final int width, final char padChar)
public StrBuilder appendFixedWidthPadRight(final Object obj, final int width, final char padChar)
public StrBuilder appendFixedWidthPadRight(final int value, final int width, final char padChar)
public StrBuilder insert(final int index, final Object obj)
public StrBuilder insert(final int index, String str)
public StrBuilder insert(final int index, final char[] chars)
public StrBuilder insert(final int index, final char[] chars, final int offset, final int length)
public StrBuilder insert(int index, final boolean value)
public StrBuilder insert(final int index, final char value)
public StrBuilder insert(final int index, final int value)
public StrBuilder insert(final int index, final long value)
public StrBuilder insert(final int index, final float value)
public StrBuilder insert(final int index, final double value)
private void deleteImpl(final int startIndex, final int endIndex, final int len)
public StrBuilder delete(final int startIndex, int endIndex)
public StrBuilder deleteAll(final char ch)
public StrBuilder deleteFirst(final char ch)
public StrBuilder deleteAll(final String str)
public StrBuilder deleteFirst(final String str)
public StrBuilder deleteAll(final StrMatcher matcher)
public StrBuilder deleteFirst(final StrMatcher matcher)
private void replaceImpl(final int startIndex, final int endIndex, final int removeLen, final String insertStr, final int insertLen)
public StrBuilder replace(final int startIndex, int endIndex, final String replaceStr)
public StrBuilder replaceAll(final char search, final char replace)
public StrBuilder replaceFirst(final char search, final char replace)
public StrBuilder replaceAll(final String searchStr, final String replaceStr)
public StrBuilder replaceFirst(final String searchStr, final String replaceStr)
public StrBuilder replaceAll(final StrMatcher matcher, final String replaceStr)
public StrBuilder replaceFirst(final StrMatcher matcher, final String replaceStr)
public StrBuilder replace(final StrMatcher matcher, final String replaceStr, final int startIndex, int endIndex, final int replaceCount)
private StrBuilder replaceImpl(final StrMatcher matcher, final String replaceStr, final int from, int to, int replaceCount)
public StrBuilder reverse()
public StrBuilder trim()
public boolean startsWith(final String str)
public boolean endsWith(final String str)
public CharSequence subSequence(final int startIndex, final int endIndex)
public String substring(final int start)
public String substring(final int startIndex, int endIndex)
public String leftString(final int length)
public String rightString(final int length)
public String midString(int index, final int length)
public boolean contains(final char ch)
public boolean contains(final String str)
public boolean contains(final StrMatcher matcher)
public int indexOf(final char ch)
public int indexOf(final char ch, int startIndex)
public int indexOf(final String str)
public int indexOf(final String str, int startIndex)
public int indexOf(final StrMatcher matcher)
public int indexOf(final StrMatcher matcher, int startIndex)
public int lastIndexOf(final char ch)
public int lastIndexOf(final char ch, int startIndex)
public int lastIndexOf(final String str)
public int lastIndexOf(final String str, int startIndex)
public int lastIndexOf(final StrMatcher matcher)
public int lastIndexOf(final StrMatcher matcher, int startIndex)
public StrTokenizer asTokenizer()
public Reader asReader()
public Writer asWriter()
public boolean equalsIgnoreCase(final StrBuilder other)
public boolean equals(final StrBuilder other)
public boolean equals(final Object obj)
public int hashCode()
public String toString()
public StringBuffer toStringBuffer()
public StringBuilder toStringBuilder()
public String build()
protected int validateRange(final int startIndex, int endIndex)
protected void validateIndex(final int index)
protected List<String> tokenize(final char[] chars, final int offset, final int count)
public String getContent()
public void close()
public int read()
public int read(final char[] b, final int off, int len)
public long skip(long n)
public boolean ready()
public boolean markSupported()
public void mark(final int readAheadLimit)
public void reset()
public void close()
public void flush()
public void write(final int c)
public void write(final char[] cbuf)
public void write(final char[] cbuf, final int off, final int len)
public void write(final String str)
public void write(final String str, final int off, final int len)
int CAPACITY=Optional[32]
long serialVersionUID=Optional[7628716375283629643L]
char[] buffer
int size
String newLine
String nullText
