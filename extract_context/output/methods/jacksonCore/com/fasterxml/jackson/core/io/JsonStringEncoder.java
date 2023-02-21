public JsonStringEncoder() { [EOL]     _quoteBuffer = new char[6]; [EOL]     _quoteBuffer[0] = '\\'; [EOL]     _quoteBuffer[2] = '0'; [EOL]     _quoteBuffer[3] = '0'; [EOL] } <line_num>: 63,69
public static JsonStringEncoder getInstance() { [EOL]     SoftReference<JsonStringEncoder> ref = _threadEncoder.get(); [EOL]     JsonStringEncoder enc = (ref == null) ? null : ref.get(); [EOL]     if (enc == null) { [EOL]         enc = new JsonStringEncoder(); [EOL]         _threadEncoder.set(new SoftReference<JsonStringEncoder>(enc)); [EOL]     } [EOL]     return enc; [EOL] } <line_num>: 75,85
public char[] quoteAsString(String input) { [EOL]     TextBuffer textBuffer = _textBuffer; [EOL]     if (textBuffer == null) { [EOL]         _textBuffer = textBuffer = new TextBuffer(null); [EOL]     } [EOL]     char[] outputBuffer = textBuffer.emptyAndGetCurrentSegment(); [EOL]     final int[] escCodes = CharTypes.get7BitOutputEscapes(); [EOL]     final int escCodeCount = escCodes.length; [EOL]     int inPtr = 0; [EOL]     final int inputLen = input.length(); [EOL]     int outPtr = 0; [EOL]     outer_loop: while (inPtr < inputLen) { [EOL]         tight_loop: while (true) { [EOL]             char c = input.charAt(inPtr); [EOL]             if (c < escCodeCount && escCodes[c] != 0) { [EOL]                 break tight_loop; [EOL]             } [EOL]             if (outPtr >= outputBuffer.length) { [EOL]                 outputBuffer = textBuffer.finishCurrentSegment(); [EOL]                 outPtr = 0; [EOL]             } [EOL]             outputBuffer[outPtr++] = c; [EOL]             if (++inPtr >= inputLen) { [EOL]                 break outer_loop; [EOL]             } [EOL]         } [EOL]         char d = input.charAt(inPtr++); [EOL]         int escCode = escCodes[d]; [EOL]         int length = (escCode < 0) ? _appendNumericEscape(d, _quoteBuffer) : _appendNamedEscape(escCode, _quoteBuffer); [EOL]         ; [EOL]         if ((outPtr + length) > outputBuffer.length) { [EOL]             int first = outputBuffer.length - outPtr; [EOL]             if (first > 0) { [EOL]                 System.arraycopy(_quoteBuffer, 0, outputBuffer, outPtr, first); [EOL]             } [EOL]             outputBuffer = textBuffer.finishCurrentSegment(); [EOL]             int second = length - first; [EOL]             System.arraycopy(_quoteBuffer, first, outputBuffer, 0, second); [EOL]             outPtr = second; [EOL]         } else { [EOL]             System.arraycopy(_quoteBuffer, 0, outputBuffer, outPtr, length); [EOL]             outPtr += length; [EOL]         } [EOL]     } [EOL]     textBuffer.setCurrentLength(outPtr); [EOL]     return textBuffer.contentsAsArray(); [EOL] } <line_num>: 97,151
@SuppressWarnings("resource") [EOL] public byte[] quoteAsUTF8(String text) { [EOL]     ByteArrayBuilder byteBuilder = _byteBuilder; [EOL]     if (byteBuilder == null) { [EOL]         _byteBuilder = byteBuilder = new ByteArrayBuilder(null); [EOL]     } [EOL]     int inputPtr = 0; [EOL]     int inputEnd = text.length(); [EOL]     int outputPtr = 0; [EOL]     byte[] outputBuffer = byteBuilder.resetAndGetFirstSegment(); [EOL]     main_loop: while (inputPtr < inputEnd) { [EOL]         final int[] escCodes = CharTypes.get7BitOutputEscapes(); [EOL]         inner_loop: while (true) { [EOL]             int ch = text.charAt(inputPtr); [EOL]             if (ch > 0x7F || escCodes[ch] != 0) { [EOL]                 break inner_loop; [EOL]             } [EOL]             if (outputPtr >= outputBuffer.length) { [EOL]                 outputBuffer = byteBuilder.finishCurrentSegment(); [EOL]                 outputPtr = 0; [EOL]             } [EOL]             outputBuffer[outputPtr++] = (byte) ch; [EOL]             if (++inputPtr >= inputEnd) { [EOL]                 break main_loop; [EOL]             } [EOL]         } [EOL]         if (outputPtr >= outputBuffer.length) { [EOL]             outputBuffer = byteBuilder.finishCurrentSegment(); [EOL]             outputPtr = 0; [EOL]         } [EOL]         int ch = (int) text.charAt(inputPtr++); [EOL]         if (ch <= 0x7F) { [EOL]             int escape = escCodes[ch]; [EOL]             outputPtr = _appendByteEscape(ch, escape, byteBuilder, outputPtr); [EOL]             outputBuffer = byteBuilder.getCurrentSegment(); [EOL]             continue main_loop; [EOL]         } else if (ch <= 0x7FF) { [EOL]             outputBuffer[outputPtr++] = (byte) (0xc0 | (ch >> 6)); [EOL]             ch = (0x80 | (ch & 0x3f)); [EOL]         } else { [EOL]             if (ch < SURR1_FIRST || ch > SURR2_LAST) { [EOL]                 outputBuffer[outputPtr++] = (byte) (0xe0 | (ch >> 12)); [EOL]                 if (outputPtr >= outputBuffer.length) { [EOL]                     outputBuffer = byteBuilder.finishCurrentSegment(); [EOL]                     outputPtr = 0; [EOL]                 } [EOL]                 outputBuffer[outputPtr++] = (byte) (0x80 | ((ch >> 6) & 0x3f)); [EOL]                 ch = (0x80 | (ch & 0x3f)); [EOL]             } else { [EOL]                 if (ch > SURR1_LAST) { [EOL]                     _illegalSurrogate(ch); [EOL]                 } [EOL]                 if (inputPtr >= inputEnd) { [EOL]                     _illegalSurrogate(ch); [EOL]                 } [EOL]                 ch = _convertSurrogate(ch, text.charAt(inputPtr++)); [EOL]                 if (ch > 0x10FFFF) { [EOL]                     _illegalSurrogate(ch); [EOL]                 } [EOL]                 outputBuffer[outputPtr++] = (byte) (0xf0 | (ch >> 18)); [EOL]                 if (outputPtr >= outputBuffer.length) { [EOL]                     outputBuffer = byteBuilder.finishCurrentSegment(); [EOL]                     outputPtr = 0; [EOL]                 } [EOL]                 outputBuffer[outputPtr++] = (byte) (0x80 | ((ch >> 12) & 0x3f)); [EOL]                 if (outputPtr >= outputBuffer.length) { [EOL]                     outputBuffer = byteBuilder.finishCurrentSegment(); [EOL]                     outputPtr = 0; [EOL]                 } [EOL]                 outputBuffer[outputPtr++] = (byte) (0x80 | ((ch >> 6) & 0x3f)); [EOL]                 ch = (0x80 | (ch & 0x3f)); [EOL]             } [EOL]         } [EOL]         if (outputPtr >= outputBuffer.length) { [EOL]             outputBuffer = byteBuilder.finishCurrentSegment(); [EOL]             outputPtr = 0; [EOL]         } [EOL]         outputBuffer[outputPtr++] = (byte) ch; [EOL]     } [EOL]     return _byteBuilder.completeAndCoalesce(outputPtr); [EOL] } <line_num>: 157,247
@SuppressWarnings("resource") [EOL] public byte[] encodeAsUTF8(String text) { [EOL]     ByteArrayBuilder byteBuilder = _byteBuilder; [EOL]     if (byteBuilder == null) { [EOL]         _byteBuilder = byteBuilder = new ByteArrayBuilder(null); [EOL]     } [EOL]     int inputPtr = 0; [EOL]     int inputEnd = text.length(); [EOL]     int outputPtr = 0; [EOL]     byte[] outputBuffer = byteBuilder.resetAndGetFirstSegment(); [EOL]     int outputEnd = outputBuffer.length; [EOL]     main_loop: while (inputPtr < inputEnd) { [EOL]         int c = text.charAt(inputPtr++); [EOL]         while (c <= 0x7F) { [EOL]             if (outputPtr >= outputEnd) { [EOL]                 outputBuffer = byteBuilder.finishCurrentSegment(); [EOL]                 outputEnd = outputBuffer.length; [EOL]                 outputPtr = 0; [EOL]             } [EOL]             outputBuffer[outputPtr++] = (byte) c; [EOL]             if (inputPtr >= inputEnd) { [EOL]                 break main_loop; [EOL]             } [EOL]             c = text.charAt(inputPtr++); [EOL]         } [EOL]         if (outputPtr >= outputEnd) { [EOL]             outputBuffer = byteBuilder.finishCurrentSegment(); [EOL]             outputEnd = outputBuffer.length; [EOL]             outputPtr = 0; [EOL]         } [EOL]         if (c < 0x800) { [EOL]             outputBuffer[outputPtr++] = (byte) (0xc0 | (c >> 6)); [EOL]         } else { [EOL]             if (c < SURR1_FIRST || c > SURR2_LAST) { [EOL]                 outputBuffer[outputPtr++] = (byte) (0xe0 | (c >> 12)); [EOL]                 if (outputPtr >= outputEnd) { [EOL]                     outputBuffer = byteBuilder.finishCurrentSegment(); [EOL]                     outputEnd = outputBuffer.length; [EOL]                     outputPtr = 0; [EOL]                 } [EOL]                 outputBuffer[outputPtr++] = (byte) (0x80 | ((c >> 6) & 0x3f)); [EOL]             } else { [EOL]                 if (c > SURR1_LAST) { [EOL]                     _illegalSurrogate(c); [EOL]                 } [EOL]                 if (inputPtr >= inputEnd) { [EOL]                     _illegalSurrogate(c); [EOL]                 } [EOL]                 c = _convertSurrogate(c, text.charAt(inputPtr++)); [EOL]                 if (c > 0x10FFFF) { [EOL]                     _illegalSurrogate(c); [EOL]                 } [EOL]                 outputBuffer[outputPtr++] = (byte) (0xf0 | (c >> 18)); [EOL]                 if (outputPtr >= outputEnd) { [EOL]                     outputBuffer = byteBuilder.finishCurrentSegment(); [EOL]                     outputEnd = outputBuffer.length; [EOL]                     outputPtr = 0; [EOL]                 } [EOL]                 outputBuffer[outputPtr++] = (byte) (0x80 | ((c >> 12) & 0x3f)); [EOL]                 if (outputPtr >= outputEnd) { [EOL]                     outputBuffer = byteBuilder.finishCurrentSegment(); [EOL]                     outputEnd = outputBuffer.length; [EOL]                     outputPtr = 0; [EOL]                 } [EOL]                 outputBuffer[outputPtr++] = (byte) (0x80 | ((c >> 6) & 0x3f)); [EOL]             } [EOL]         } [EOL]         if (outputPtr >= outputEnd) { [EOL]             outputBuffer = byteBuilder.finishCurrentSegment(); [EOL]             outputEnd = outputBuffer.length; [EOL]             outputPtr = 0; [EOL]         } [EOL]         outputBuffer[outputPtr++] = (byte) (0x80 | (c & 0x3f)); [EOL]     } [EOL]     return _byteBuilder.completeAndCoalesce(outputPtr); [EOL] } <line_num>: 253,338
private int _appendNumericEscape(int value, char[] quoteBuffer) { [EOL]     quoteBuffer[1] = 'u'; [EOL]     quoteBuffer[4] = HEX_CHARS[value >> 4]; [EOL]     quoteBuffer[5] = HEX_CHARS[value & 0xF]; [EOL]     return 6; [EOL] } <line_num>: 346,353
private int _appendNamedEscape(int escCode, char[] quoteBuffer) { [EOL]     quoteBuffer[1] = (char) escCode; [EOL]     return 2; [EOL] } <line_num>: 355,359
private int _appendByteEscape(int ch, int escCode, ByteArrayBuilder byteBuilder, int ptr) { [EOL]     byteBuilder.setCurrentSegmentLength(ptr); [EOL]     byteBuilder.append(INT_BACKSLASH); [EOL]     if (escCode < 0) { [EOL]         byteBuilder.append(INT_U); [EOL]         if (ch > 0xFF) { [EOL]             int hi = (ch >> 8); [EOL]             byteBuilder.append(HEX_BYTES[hi >> 4]); [EOL]             byteBuilder.append(HEX_BYTES[hi & 0xF]); [EOL]             ch &= 0xFF; [EOL]         } else { [EOL]             byteBuilder.append(INT_0); [EOL]             byteBuilder.append(INT_0); [EOL]         } [EOL]         byteBuilder.append(HEX_BYTES[ch >> 4]); [EOL]         byteBuilder.append(HEX_BYTES[ch & 0xF]); [EOL]     } else { [EOL]         byteBuilder.append((byte) escCode); [EOL]     } [EOL]     return byteBuilder.getCurrentSegmentLength(); [EOL] } <line_num>: 361,382
protected static int _convertSurrogate(int firstPart, int secondPart) { [EOL]     if (secondPart < SURR2_FIRST || secondPart > SURR2_LAST) { [EOL]         throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(firstPart) + ", second 0x" + Integer.toHexString(secondPart) + "; illegal combination"); [EOL]     } [EOL]     return 0x10000 + ((firstPart - SURR1_FIRST) << 10) + (secondPart - SURR2_FIRST); [EOL] } <line_num>: 384,391
protected static void _illegalSurrogate(int code) { [EOL]     throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(code)); [EOL] } <line_num>: 393,395
