public ByteSourceJsonBootstrapper(IOContext ctxt, InputStream in) { [EOL]     _context = ctxt; [EOL]     _in = in; [EOL]     _inputBuffer = ctxt.allocReadIOBuffer(); [EOL]     _inputEnd = _inputPtr = 0; [EOL]     _inputProcessed = 0; [EOL]     _bufferRecyclable = true; [EOL] } <line_num>: 84,92
public ByteSourceJsonBootstrapper(IOContext ctxt, byte[] inputBuffer, int inputStart, int inputLen) { [EOL]     _context = ctxt; [EOL]     _in = null; [EOL]     _inputBuffer = inputBuffer; [EOL]     _inputPtr = inputStart; [EOL]     _inputEnd = (inputStart + inputLen); [EOL]     _inputProcessed = -inputStart; [EOL]     _bufferRecyclable = false; [EOL] } <line_num>: 94,104
public JsonEncoding detectEncoding() throws IOException, JsonParseException { [EOL]     boolean foundEncoding = false; [EOL]     if (ensureLoaded(4)) { [EOL]         int quad = (_inputBuffer[_inputPtr] << 24) | ((_inputBuffer[_inputPtr + 1] & 0xFF) << 16) | ((_inputBuffer[_inputPtr + 2] & 0xFF) << 8) | (_inputBuffer[_inputPtr + 3] & 0xFF); [EOL]         if (handleBOM(quad)) { [EOL]             foundEncoding = true; [EOL]         } else { [EOL]             if (checkUTF32(quad)) { [EOL]                 foundEncoding = true; [EOL]             } else if (checkUTF16(quad >>> 16)) { [EOL]                 foundEncoding = true; [EOL]             } [EOL]         } [EOL]     } else if (ensureLoaded(2)) { [EOL]         int i16 = ((_inputBuffer[_inputPtr] & 0xFF) << 8) | (_inputBuffer[_inputPtr + 1] & 0xFF); [EOL]         if (checkUTF16(i16)) { [EOL]             foundEncoding = true; [EOL]         } [EOL]     } [EOL]     JsonEncoding enc; [EOL]     if (!foundEncoding) { [EOL]         enc = JsonEncoding.UTF8; [EOL]     } else { [EOL]         switch(_bytesPerChar) { [EOL]             case 1: [EOL]                 enc = JsonEncoding.UTF8; [EOL]                 break; [EOL]             case 2: [EOL]                 enc = _bigEndian ? JsonEncoding.UTF16_BE : JsonEncoding.UTF16_LE; [EOL]                 break; [EOL]             case 4: [EOL]                 enc = _bigEndian ? JsonEncoding.UTF32_BE : JsonEncoding.UTF32_LE; [EOL]                 break; [EOL]             default: [EOL]                 throw new RuntimeException("Internal error"); [EOL]         } [EOL]     } [EOL]     _context.setEncoding(enc); [EOL]     return enc; [EOL] } <line_num>: 117,180
@SuppressWarnings("resource") [EOL] public Reader constructReader() throws IOException { [EOL]     JsonEncoding enc = _context.getEncoding(); [EOL]     switch(enc) { [EOL]         case UTF32_BE: [EOL]         case UTF32_LE: [EOL]             return new UTF32Reader(_context, _in, _inputBuffer, _inputPtr, _inputEnd, _context.getEncoding().isBigEndian()); [EOL]         case UTF16_BE: [EOL]         case UTF16_LE: [EOL]         case UTF8: [EOL]             { [EOL]                 InputStream in = _in; [EOL]                 if (in == null) { [EOL]                     in = new ByteArrayInputStream(_inputBuffer, _inputPtr, _inputEnd); [EOL]                 } else { [EOL]                     if (_inputPtr < _inputEnd) { [EOL]                         in = new MergedStream(_context, in, _inputBuffer, _inputPtr, _inputEnd); [EOL]                     } [EOL]                 } [EOL]                 return new InputStreamReader(in, enc.getJavaName()); [EOL]             } [EOL]     } [EOL]     throw new RuntimeException("Internal error"); [EOL] } <line_num>: 188,220
public JsonParser constructParser(int parserFeatures, ObjectCodec codec, BytesToNameCanonicalizer rootByteSymbols, CharsToNameCanonicalizer rootCharSymbols, boolean canonicalize, boolean intern) throws IOException, JsonParseException { [EOL]     JsonEncoding enc = detectEncoding(); [EOL]     if (enc == JsonEncoding.UTF8) { [EOL]         if (canonicalize) { [EOL]             BytesToNameCanonicalizer can = rootByteSymbols.makeChild(canonicalize, intern); [EOL]             return new UTF8StreamJsonParser(_context, parserFeatures, _in, codec, can, _inputBuffer, _inputPtr, _inputEnd, _bufferRecyclable); [EOL]         } [EOL]     } [EOL]     return new ReaderBasedJsonParser(_context, parserFeatures, constructReader(), codec, rootCharSymbols.makeChild(canonicalize, intern)); [EOL] } <line_num>: 222,240
public static MatchStrength hasJSONFormat(InputAccessor acc) throws IOException { [EOL]     if (!acc.hasMoreBytes()) { [EOL]         return MatchStrength.INCONCLUSIVE; [EOL]     } [EOL]     byte b = acc.nextByte(); [EOL]     if (b == UTF8_BOM_1) { [EOL]         if (!acc.hasMoreBytes()) { [EOL]             return MatchStrength.INCONCLUSIVE; [EOL]         } [EOL]         if (acc.nextByte() != UTF8_BOM_2) { [EOL]             return MatchStrength.NO_MATCH; [EOL]         } [EOL]         if (!acc.hasMoreBytes()) { [EOL]             return MatchStrength.INCONCLUSIVE; [EOL]         } [EOL]         if (acc.nextByte() != UTF8_BOM_3) { [EOL]             return MatchStrength.NO_MATCH; [EOL]         } [EOL]         if (!acc.hasMoreBytes()) { [EOL]             return MatchStrength.INCONCLUSIVE; [EOL]         } [EOL]         b = acc.nextByte(); [EOL]     } [EOL]     int ch = skipSpace(acc, b); [EOL]     if (ch < 0) { [EOL]         return MatchStrength.INCONCLUSIVE; [EOL]     } [EOL]     if (ch == '{') { [EOL]         ch = skipSpace(acc); [EOL]         if (ch < 0) { [EOL]             return MatchStrength.INCONCLUSIVE; [EOL]         } [EOL]         if (ch == '"' || ch == '}') { [EOL]             return MatchStrength.SOLID_MATCH; [EOL]         } [EOL]         return MatchStrength.NO_MATCH; [EOL]     } [EOL]     MatchStrength strength; [EOL]     if (ch == '[') { [EOL]         ch = skipSpace(acc); [EOL]         if (ch < 0) { [EOL]             return MatchStrength.INCONCLUSIVE; [EOL]         } [EOL]         if (ch == ']' || ch == '[') { [EOL]             return MatchStrength.SOLID_MATCH; [EOL]         } [EOL]         return MatchStrength.SOLID_MATCH; [EOL]     } else { [EOL]         strength = MatchStrength.WEAK_MATCH; [EOL]     } [EOL]     if (ch == '"') { [EOL]         return strength; [EOL]     } [EOL]     if (ch <= '9' && ch >= '0') { [EOL]         return strength; [EOL]     } [EOL]     if (ch == '-') { [EOL]         ch = skipSpace(acc); [EOL]         if (ch < 0) { [EOL]             return MatchStrength.INCONCLUSIVE; [EOL]         } [EOL]         return (ch <= '9' && ch >= '0') ? strength : MatchStrength.NO_MATCH; [EOL]     } [EOL]     if (ch == 'n') { [EOL]         return tryMatch(acc, "ull", strength); [EOL]     } [EOL]     if (ch == 't') { [EOL]         return tryMatch(acc, "rue", strength); [EOL]     } [EOL]     if (ch == 'f') { [EOL]         return tryMatch(acc, "alse", strength); [EOL]     } [EOL]     return MatchStrength.NO_MATCH; [EOL] } <line_num>: 254,341
private static MatchStrength tryMatch(InputAccessor acc, String matchStr, MatchStrength fullMatchStrength) throws IOException { [EOL]     for (int i = 0, len = matchStr.length(); i < len; ++i) { [EOL]         if (!acc.hasMoreBytes()) { [EOL]             return MatchStrength.INCONCLUSIVE; [EOL]         } [EOL]         if (acc.nextByte() != matchStr.charAt(i)) { [EOL]             return MatchStrength.NO_MATCH; [EOL]         } [EOL]     } [EOL]     return fullMatchStrength; [EOL] } <line_num>: 343,355
private static int skipSpace(InputAccessor acc) throws IOException { [EOL]     if (!acc.hasMoreBytes()) { [EOL]         return -1; [EOL]     } [EOL]     return skipSpace(acc, acc.nextByte()); [EOL] } <line_num>: 357,363
private static int skipSpace(InputAccessor acc, byte b) throws IOException { [EOL]     while (true) { [EOL]         int ch = (int) b & 0xFF; [EOL]         if (!(ch == ' ' || ch == '\r' || ch == '\n' || ch == '\t')) { [EOL]             return ch; [EOL]         } [EOL]         if (!acc.hasMoreBytes()) { [EOL]             return -1; [EOL]         } [EOL]         b = acc.nextByte(); [EOL]         ch = (int) b & 0xFF; [EOL]     } [EOL] } <line_num>: 365,378
private boolean handleBOM(int quad) throws IOException { [EOL]     switch(quad) { [EOL]         case 0x0000FEFF: [EOL]             _bigEndian = true; [EOL]             _inputPtr += 4; [EOL]             _bytesPerChar = 4; [EOL]             return true; [EOL]         case 0xFFFE0000: [EOL]             _inputPtr += 4; [EOL]             _bytesPerChar = 4; [EOL]             _bigEndian = false; [EOL]             return true; [EOL]         case 0x0000FFFE: [EOL]             reportWeirdUCS4("2143"); [EOL]         case 0xFEFF0000: [EOL]             reportWeirdUCS4("3412"); [EOL]     } [EOL]     int msw = quad >>> 16; [EOL]     if (msw == 0xFEFF) { [EOL]         _inputPtr += 2; [EOL]         _bytesPerChar = 2; [EOL]         _bigEndian = true; [EOL]         return true; [EOL]     } [EOL]     if (msw == 0xFFFE) { [EOL]         _inputPtr += 2; [EOL]         _bytesPerChar = 2; [EOL]         _bigEndian = false; [EOL]         return true; [EOL]     } [EOL]     if ((quad >>> 8) == 0xEFBBBF) { [EOL]         _inputPtr += 3; [EOL]         _bytesPerChar = 1; [EOL]         _bigEndian = true; [EOL]         return true; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 390,434
private boolean checkUTF32(int quad) throws IOException { [EOL]     if ((quad >> 8) == 0) { [EOL]         _bigEndian = true; [EOL]     } else if ((quad & 0x00FFFFFF) == 0) { [EOL]         _bigEndian = false; [EOL]     } else if ((quad & ~0x00FF0000) == 0) { [EOL]         reportWeirdUCS4("3412"); [EOL]     } else if ((quad & ~0x0000FF00) == 0) { [EOL]         reportWeirdUCS4("2143"); [EOL]     } else { [EOL]         return false; [EOL]     } [EOL]     _bytesPerChar = 4; [EOL]     return true; [EOL] } <line_num>: 436,458
private boolean checkUTF16(int i16) { [EOL]     if ((i16 & 0xFF00) == 0) { [EOL]         _bigEndian = true; [EOL]     } else if ((i16 & 0x00FF) == 0) { [EOL]         _bigEndian = false; [EOL]     } else { [EOL]         return false; [EOL]     } [EOL]     _bytesPerChar = 2; [EOL]     return true; [EOL] } <line_num>: 460,473
private void reportWeirdUCS4(String type) throws IOException { [EOL]     throw new CharConversionException("Unsupported UCS-4 endianness (" + type + ") detected"); [EOL] } <line_num>: 481,485
protected boolean ensureLoaded(int minimum) throws IOException { [EOL]     int gotten = (_inputEnd - _inputPtr); [EOL]     while (gotten < minimum) { [EOL]         int count; [EOL]         if (_in == null) { [EOL]             count = -1; [EOL]         } else { [EOL]             count = _in.read(_inputBuffer, _inputEnd, _inputBuffer.length - _inputEnd); [EOL]         } [EOL]         if (count < 1) { [EOL]             return false; [EOL]         } [EOL]         _inputEnd += count; [EOL]         gotten += count; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 493,515
