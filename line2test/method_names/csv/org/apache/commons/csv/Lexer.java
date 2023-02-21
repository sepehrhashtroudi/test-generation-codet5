 Lexer(CSVFormat format, ExtendedBufferedReader in)
 int getLineNumber()
 int readEscape(int c) throws IOException
 void trimTrailingSpaces(StringBuilder buffer)
 boolean isWhitespace(int c)
 boolean isEndOfLine(int c) throws IOException
 boolean isEndOfFile(int c)
 abstract Token nextToken(Token reusableToken) throws IOException
 boolean isDelimiter(int c)
 boolean isEscape(int c)
 boolean isEncapsulator(int c)
 boolean isCommentStart(int c)
