public Base64Variant(String name, String base64Alphabet, boolean usesPadding, char paddingChar, int maxLineLength)
public Base64Variant(Base64Variant base, String name, int maxLineLength)
public Base64Variant(Base64Variant base, String name, boolean usesPadding, char paddingChar, int maxLineLength)
protected Object readResolve()
public String getName()
public boolean usesPadding()
public boolean usesPaddingChar(char c)
public boolean usesPaddingChar(int ch)
public char getPaddingChar()
public byte getPaddingByte()
public int getMaxLineLength()
public int decodeBase64Char(char c)
public int decodeBase64Char(int ch)
public int decodeBase64Byte(byte b)
public char encodeBase64BitsAsChar(int value)
public int encodeBase64Chunk(int b24, char[] buffer, int ptr)
public void encodeBase64Chunk(StringBuilder sb, int b24)
public int encodeBase64Partial(int bits, int outputBytes, char[] buffer, int outPtr)
public void encodeBase64Partial(StringBuilder sb, int bits, int outputBytes)
public byte encodeBase64BitsAsByte(int value)
public int encodeBase64Chunk(int b24, byte[] buffer, int ptr)
public int encodeBase64Partial(int bits, int outputBytes, byte[] buffer, int outPtr)
public String encode(byte[] input)
public String encode(byte[] input, boolean addQuotes)
public byte[] decode(String input) throws IllegalArgumentException
public void decode(String str, ByteArrayBuilder builder) throws IllegalArgumentException
public String toString()
public boolean equals(Object o)
public int hashCode()
protected void _reportInvalidBase64(char ch, int bindex, String msg) throws IllegalArgumentException
protected void _reportBase64EOF() throws IllegalArgumentException
