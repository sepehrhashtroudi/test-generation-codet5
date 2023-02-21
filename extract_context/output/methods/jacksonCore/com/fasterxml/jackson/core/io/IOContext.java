public IOContext(BufferRecycler br, Object sourceRef, boolean managedResource) { [EOL]     _bufferRecycler = br; [EOL]     _sourceRef = sourceRef; [EOL]     _managedResource = managedResource; [EOL] } <line_num>: 99,104
public void setEncoding(JsonEncoding enc) { [EOL]     _encoding = enc; [EOL] } <line_num>: 106,108
public Object getSourceReference() { [EOL]     return _sourceRef; [EOL] } <line_num>: 116,116
public JsonEncoding getEncoding() { [EOL]     return _encoding; [EOL] } <line_num>: 117,117
public boolean isResourceManaged() { [EOL]     return _managedResource; [EOL] } <line_num>: 118,118
public TextBuffer constructTextBuffer() { [EOL]     return new TextBuffer(_bufferRecycler); [EOL] } <line_num>: 126,128
public byte[] allocReadIOBuffer() { [EOL]     _verifyAlloc(_readIOBuffer); [EOL]     return (_readIOBuffer = _bufferRecycler.allocByteBuffer(BufferRecycler.ByteBufferType.READ_IO_BUFFER)); [EOL] } <line_num>: 135,139
public byte[] allocWriteEncodingBuffer() { [EOL]     _verifyAlloc(_writeEncodingBuffer); [EOL]     return (_writeEncodingBuffer = _bufferRecycler.allocByteBuffer(BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER)); [EOL] } <line_num>: 141,145
public byte[] allocBase64Buffer() { [EOL]     _verifyAlloc(_base64Buffer); [EOL]     return (_base64Buffer = _bufferRecycler.allocByteBuffer(BufferRecycler.ByteBufferType.BASE64_CODEC_BUFFER)); [EOL] } <line_num>: 150,154
public char[] allocTokenBuffer() { [EOL]     _verifyAlloc(_tokenCBuffer); [EOL]     return (_tokenCBuffer = _bufferRecycler.allocCharBuffer(BufferRecycler.CharBufferType.TOKEN_BUFFER)); [EOL] } <line_num>: 156,160
public char[] allocConcatBuffer() { [EOL]     _verifyAlloc(_concatCBuffer); [EOL]     return (_concatCBuffer = _bufferRecycler.allocCharBuffer(BufferRecycler.CharBufferType.CONCAT_BUFFER)); [EOL] } <line_num>: 162,166
public char[] allocNameCopyBuffer(int minSize) { [EOL]     _verifyAlloc(_nameCopyBuffer); [EOL]     return (_nameCopyBuffer = _bufferRecycler.allocCharBuffer(BufferRecycler.CharBufferType.NAME_COPY_BUFFER, minSize)); [EOL] } <line_num>: 168,172
public void releaseReadIOBuffer(byte[] buf) { [EOL]     if (buf != null) { [EOL]         _verifyRelease(buf, _readIOBuffer); [EOL]         _readIOBuffer = null; [EOL]         _bufferRecycler.releaseByteBuffer(BufferRecycler.ByteBufferType.READ_IO_BUFFER, buf); [EOL]     } [EOL] } <line_num>: 178,188
public void releaseWriteEncodingBuffer(byte[] buf) { [EOL]     if (buf != null) { [EOL]         _verifyRelease(buf, _writeEncodingBuffer); [EOL]         _writeEncodingBuffer = null; [EOL]         _bufferRecycler.releaseByteBuffer(BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER, buf); [EOL]     } [EOL] } <line_num>: 190,200
public void releaseBase64Buffer(byte[] buf) { [EOL]     if (buf != null) { [EOL]         _verifyRelease(buf, _base64Buffer); [EOL]         _base64Buffer = null; [EOL]         _bufferRecycler.releaseByteBuffer(BufferRecycler.ByteBufferType.BASE64_CODEC_BUFFER, buf); [EOL]     } [EOL] } <line_num>: 202,209
public void releaseTokenBuffer(char[] buf) { [EOL]     if (buf != null) { [EOL]         _verifyRelease(buf, _tokenCBuffer); [EOL]         _tokenCBuffer = null; [EOL]         _bufferRecycler.releaseCharBuffer(BufferRecycler.CharBufferType.TOKEN_BUFFER, buf); [EOL]     } [EOL] } <line_num>: 211,218
public void releaseConcatBuffer(char[] buf) { [EOL]     if (buf != null) { [EOL]         _verifyRelease(buf, _concatCBuffer); [EOL]         _concatCBuffer = null; [EOL]         _bufferRecycler.releaseCharBuffer(BufferRecycler.CharBufferType.CONCAT_BUFFER, buf); [EOL]     } [EOL] } <line_num>: 220,227
public void releaseNameCopyBuffer(char[] buf) { [EOL]     if (buf != null) { [EOL]         _verifyRelease(buf, _nameCopyBuffer); [EOL]         _nameCopyBuffer = null; [EOL]         _bufferRecycler.releaseCharBuffer(BufferRecycler.CharBufferType.NAME_COPY_BUFFER, buf); [EOL]     } [EOL] } <line_num>: 229,236
private final void _verifyAlloc(Object buffer) { [EOL]     if (buffer != null) { [EOL]         throw new IllegalStateException("Trying to call same allocXxx() method second time"); [EOL]     } [EOL] } <line_num>: 244,249
private final void _verifyRelease(Object toRelease, Object src) { [EOL]     if (toRelease != src) { [EOL]         throw new IllegalArgumentException("Trying to release buffer not owned by the context"); [EOL]     } [EOL] } <line_num>: 251,256