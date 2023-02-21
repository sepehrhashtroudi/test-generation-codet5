 Anchor(char type)
 WordBoundary(char type)
 BackReference(int groupIndex)
 Text(String text)
 Repetition(RegExpTree body, int min, int max, boolean greedy)
 Alternation(List<? extends RegExpTree> alternatives)
 LookaheadAssertion(RegExpTree body, boolean positive)
 CapturingGroup(RegExpTree body)
 Charset(CharRanges ranges, CharRanges ieExplicits)
 DecomposedCharset(boolean inverted, CharRanges ranges, String namedGroups)
 Concatenation(RegExpTree a, RegExpTree b)
 Concatenation(List<? extends RegExpTree> elements)
public abstract RegExpTree simplify(String flags)
public abstract boolean isCaseSensitive()
public abstract boolean containsAnchor()
public final boolean hasCapturingGroup()
public abstract int numCapturingGroups()
public abstract List<? extends RegExpTree> children()
protected abstract void appendSourceCode(StringBuilder sb)
protected abstract void appendDebugInfo(StringBuilder sb)
public final String toString()
public final String toDebugString()
private void appendDebugString(StringBuilder sb)
public abstract boolean equals(Object o)
public abstract int hashCode()
 RegExpTree parseTopLevel()
 RegExpTree parse()
private RegExpTree parseParenthetical()
private RegExpTree parseCharset()
private char parseEscapeChar()
private RegExpTree parseEscape()
private char parseHex(int n)
private boolean isRepetitionStart(char ch)
private RegExpTree parseRepetition(RegExpTree body)
public static RegExpTree parseRegExp(final String pattern, final String flags)
public static boolean matchesWholeInput(RegExpTree t, String flags)
public boolean isCaseSensitive()
public boolean containsAnchor()
public final int numCapturingGroups()
public final List<? extends RegExpTree> children()
public RegExpTree simplify(String flags)
protected void appendSourceCode(StringBuilder sb)
protected void appendDebugInfo(StringBuilder sb)
public boolean equals(Object o)
public int hashCode()
public RegExpTree simplify(String flags)
public boolean containsAnchor()
protected void appendSourceCode(StringBuilder sb)
protected void appendDebugInfo(StringBuilder sb)
public boolean equals(Object o)
public int hashCode()
public RegExpTree simplify(String flags)
protected void appendSourceCode(StringBuilder sb)
protected void appendDebugInfo(StringBuilder sb)
public boolean equals(Object o)
public int hashCode()
public RegExpTree simplify(String flags)
protected void appendSourceCode(StringBuilder sb)
protected void appendDebugInfo(StringBuilder sb)
public boolean equals(Object o)
public int hashCode()
private static void escapeRegularCharOnto(char ch, int next, StringBuilder sb)
public RegExpTree simplify(String flags)
public boolean isCaseSensitive()
protected void appendSourceCode(StringBuilder sb)
protected void appendDebugInfo(StringBuilder sb)
public boolean equals(Object o)
public int hashCode()
public RegExpTree simplify(String flags)
public boolean isCaseSensitive()
public boolean containsAnchor()
public int numCapturingGroups()
public List<? extends RegExpTree> children()
private void appendBodySourceCode(StringBuilder sb)
private static int suffixLen(int min, int max)
private static int numDecimalDigits(int n)
protected void appendSourceCode(StringBuilder sb)
protected void appendDebugInfo(StringBuilder sb)
public boolean equals(Object o)
public int hashCode()
public RegExpTree simplify(String flags)
public boolean isCaseSensitive()
public boolean containsAnchor()
public int numCapturingGroups()
public List<? extends RegExpTree> children()
protected void appendSourceCode(StringBuilder sb)
protected void appendDebugInfo(StringBuilder sb)
public boolean equals(Object o)
public int hashCode()
public RegExpTree simplify(String flags)
public boolean isCaseSensitive()
public boolean containsAnchor()
public int numCapturingGroups()
public List<? extends RegExpTree> children()
protected void appendSourceCode(StringBuilder sb)
protected void appendDebugInfo(StringBuilder sb)
public boolean equals(Object o)
public int hashCode()
public RegExpTree simplify(String flags)
public boolean isCaseSensitive()
public boolean containsAnchor()
public int numCapturingGroups()
public List<? extends RegExpTree> children()
protected void appendSourceCode(StringBuilder sb)
protected void appendDebugInfo(StringBuilder sb)
public boolean equals(Object o)
public int hashCode()
private static int complexityWordFolded(CharRanges ranges)
private static int complexityWordFoldedHelper(CharRanges ranges)
public RegExpTree simplify(String flags)
public boolean isCaseSensitive()
private DecomposedCharset decompose(CharRanges ranges, boolean inverted)
protected void appendSourceCode(StringBuilder sb)
 DecomposedCharset decompose()
protected void appendDebugInfo(StringBuilder sb)
public boolean equals(Object o)
public int hashCode()
 int complexity()
 void appendSourceCode(StringBuilder sb)
 static void escapeRangeCharOnto(char ch, boolean startIsFlush, boolean atStart, boolean atEnd, StringBuilder sb)
 static int complexity(CharRanges ranges)
public boolean equals(Object o)
public int hashCode()
 void simplify(RegExpTree t)
 RegExpTree simplifyPairwise(RegExpTree before, RegExpTree after)
public RegExpTree simplify(final String flags)
public boolean isCaseSensitive()
public boolean containsAnchor()
public int numCapturingGroups()
public List<? extends RegExpTree> children()
protected void appendSourceCode(StringBuilder sb)
protected void appendDebugInfo(StringBuilder sb)
public boolean equals(Object o)
public int hashCode()
 static void escapeCharOnto(char ch, StringBuilder sb)
RegExpTree NEVER_MATCHES=Optional[new LookaheadAssertion(Empty.INSTANCE, false)]
CharRanges DIGITS=Optional[CharRanges.inclusive('0', '9')]
CharRanges UCASE_LETTERS=Optional[CharRanges.inclusive('A', 'Z')]
CharRanges LCASE_LETTERS=Optional[CharRanges.inclusive('a', 'z')]
CharRanges LETTERS=Optional[UCASE_LETTERS.union(LCASE_LETTERS)]
CharRanges WORD_CHARS=Optional[DIGITS.union(LETTERS).union(CharRanges.withMembers('_'))]
CharRanges INVERSE_WORD_CHARS=Optional[CharRanges.ALL_CODE_UNITS.difference(WORD_CHARS)]
CharRanges SPACE_CHARS=Optional[CharRanges.withMembers('\t', '\n', '\u000b', '\u000c', '\r', ' ', '\u00a0', // Unicode 3.0 Zs
'\u1680', '\u180e', '\u2000', '\u2001', '\u2002', '\u2003', '\u2004', '\u2005', '\u2006', '\u2007', '\u2008', '\u2009', '\u200a', // Line terminator chars
'\u2028', '\u2029', // Unicode 3.0 Zs
'\u202f', '\u205f', '\u3000', // Byte order marker is a space character in ES5 but not ES3.
'\ufeff')]
CharRanges IE_SPACE_CHARS=Optional[CharRanges.withMembers('\t', '\n', '\u000b', '\u000c', '\r', ' ')]
CharRanges IE_SPEC_ERRORS=Optional[SPACE_CHARS.difference(IE_SPACE_CHARS)]
ImmutableMap<Character, CharRanges> NAMED_CHAR_GROUPS=Optional[ImmutableMap.<Character, CharRanges>builder().put('d', DIGITS).put('D', CharRanges.ALL_CODE_UNITS.difference(DIGITS)).put('s', SPACE_CHARS).put('S', CharRanges.ALL_CODE_UNITS.difference(SPACE_CHARS)).put('w', WORD_CHARS).put('W', INVERSE_WORD_CHARS).build()]
Charset DOT_CHARSET=Optional[new Charset(CharRanges.ALL_CODE_UNITS.difference(CharRanges.withMembers('\n', '\r', '\u2028', '\u2029')), CharRanges.EMPTY)]