public DataFormatReaders(ObjectReader... detectors) { [EOL]     this(detectors, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, DEFAULT_MAX_INPUT_LOOKAHEAD); [EOL] } <line_num>: 64,67
public DataFormatReaders(Collection<ObjectReader> detectors) { [EOL]     this(detectors.toArray(new ObjectReader[detectors.size()])); [EOL] } <line_num>: 69,71
private DataFormatReaders(ObjectReader[] detectors, MatchStrength optMatch, MatchStrength minMatch, int maxInputLookahead) { [EOL]     _readers = detectors; [EOL]     _optimalMatch = optMatch; [EOL]     _minimalMatch = minMatch; [EOL]     _maxInputLookahead = maxInputLookahead; [EOL] } <line_num>: 73,81
public AccessorForReader(InputStream in, byte[] buffer) { [EOL]     super(in, buffer); [EOL] } <line_num>: 253,255
public AccessorForReader(byte[] inputDocument) { [EOL]     super(inputDocument); [EOL] } <line_num>: 256,258
public AccessorForReader(byte[] inputDocument, int start, int len) { [EOL]     super(inputDocument, start, len); [EOL] } <line_num>: 259,261
protected Match(InputStream in, byte[] buffered, int bufferedStart, int bufferedLength, ObjectReader match, MatchStrength strength) { [EOL]     _originalStream = in; [EOL]     _bufferedData = buffered; [EOL]     _bufferedStart = bufferedStart; [EOL]     _bufferedLength = bufferedLength; [EOL]     _match = match; [EOL]     _matchStrength = strength; [EOL] } <line_num>: 302,312
public DataFormatReaders withOptimalMatch(MatchStrength optMatch) { [EOL]     if (optMatch == _optimalMatch) { [EOL]         return this; [EOL]     } [EOL]     return new DataFormatReaders(_readers, optMatch, _minimalMatch, _maxInputLookahead); [EOL] } <line_num>: 89,94
public DataFormatReaders withMinimalMatch(MatchStrength minMatch) { [EOL]     if (minMatch == _minimalMatch) { [EOL]         return this; [EOL]     } [EOL]     return new DataFormatReaders(_readers, _optimalMatch, minMatch, _maxInputLookahead); [EOL] } <line_num>: 96,101
public DataFormatReaders with(ObjectReader[] readers) { [EOL]     return new DataFormatReaders(readers, _optimalMatch, _minimalMatch, _maxInputLookahead); [EOL] } <line_num>: 103,105
public DataFormatReaders withMaxInputLookahead(int lookaheadBytes) { [EOL]     if (lookaheadBytes == _maxInputLookahead) { [EOL]         return this; [EOL]     } [EOL]     return new DataFormatReaders(_readers, _optimalMatch, _minimalMatch, lookaheadBytes); [EOL] } <line_num>: 107,113
public DataFormatReaders with(DeserializationConfig config) { [EOL]     final int len = _readers.length; [EOL]     ObjectReader[] r = new ObjectReader[len]; [EOL]     for (int i = 0; i < len; ++i) { [EOL]         r[i] = _readers[i].with(config); [EOL]     } [EOL]     return new DataFormatReaders(r, _optimalMatch, _minimalMatch, _maxInputLookahead); [EOL] } <line_num>: 121,129
public DataFormatReaders withType(JavaType type) { [EOL]     final int len = _readers.length; [EOL]     ObjectReader[] r = new ObjectReader[len]; [EOL]     for (int i = 0; i < len; ++i) { [EOL]         r[i] = _readers[i].withType(type); [EOL]     } [EOL]     return new DataFormatReaders(r, _optimalMatch, _minimalMatch, _maxInputLookahead); [EOL] } <line_num>: 131,139
public Match findFormat(InputStream in) throws IOException { [EOL]     return _findFormat(new AccessorForReader(in, new byte[_maxInputLookahead])); [EOL] } <line_num>: 155,158
public Match findFormat(byte[] fullInputData) throws IOException { [EOL]     return _findFormat(new AccessorForReader(fullInputData)); [EOL] } <line_num>: 167,170
public Match findFormat(byte[] fullInputData, int offset, int len) throws IOException { [EOL]     return _findFormat(new AccessorForReader(fullInputData, offset, len)); [EOL] } <line_num>: 181,184
@Override [EOL] public String toString() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     sb.append('['); [EOL]     final int len = _readers.length; [EOL]     if (len > 0) { [EOL]         sb.append(_readers[0].getFactory().getFormatName()); [EOL]         for (int i = 1; i < len; ++i) { [EOL]             sb.append(", "); [EOL]             sb.append(_readers[i].getFactory().getFormatName()); [EOL]         } [EOL]     } [EOL]     sb.append(']'); [EOL]     return sb.toString(); [EOL] } <line_num>: 192,207
private Match _findFormat(AccessorForReader acc) throws IOException { [EOL]     ObjectReader bestMatch = null; [EOL]     MatchStrength bestMatchStrength = null; [EOL]     for (ObjectReader f : _readers) { [EOL]         acc.reset(); [EOL]         MatchStrength strength = f.getFactory().hasFormat(acc); [EOL]         if (strength == null || strength.ordinal() < _minimalMatch.ordinal()) { [EOL]             continue; [EOL]         } [EOL]         if (bestMatch != null) { [EOL]             if (bestMatchStrength.ordinal() >= strength.ordinal()) { [EOL]                 continue; [EOL]             } [EOL]         } [EOL]         bestMatch = f; [EOL]         bestMatchStrength = strength; [EOL]         if (strength.ordinal() >= _optimalMatch.ordinal()) { [EOL]             break; [EOL]         } [EOL]     } [EOL]     return acc.createMatcher(bestMatch, bestMatchStrength); [EOL] } <line_num>: 215,240
public Match createMatcher(ObjectReader match, MatchStrength matchStrength) { [EOL]     return new Match(_in, _buffer, _bufferedStart, (_bufferedEnd - _bufferedStart), match, matchStrength); [EOL] } <line_num>: 263,267
public boolean hasMatch() { [EOL]     return _match != null; [EOL] } <line_num>: 324,324
public MatchStrength getMatchStrength() { [EOL]     return (_matchStrength == null) ? MatchStrength.INCONCLUSIVE : _matchStrength; [EOL] } <line_num>: 330,332
public ObjectReader getReader() { [EOL]     return _match; [EOL] } <line_num>: 337,337
public String getMatchedFormatName() { [EOL]     return _match.getFactory().getFormatName(); [EOL] } <line_num>: 346,348
public JsonParser createParserWithMatch() throws IOException { [EOL]     if (_match == null) { [EOL]         return null; [EOL]     } [EOL]     JsonFactory jf = _match.getFactory(); [EOL]     if (_originalStream == null) { [EOL]         return jf.createParser(_bufferedData, _bufferedStart, _bufferedLength); [EOL]     } [EOL]     return jf.createParser(getDataStream()); [EOL] } <line_num>: 361,371
public InputStream getDataStream() { [EOL]     if (_originalStream == null) { [EOL]         return new ByteArrayInputStream(_bufferedData, _bufferedStart, _bufferedLength); [EOL]     } [EOL]     return new MergedStream(null, _originalStream, _bufferedData, _bufferedStart, _bufferedLength); [EOL] } <line_num>: 380,385