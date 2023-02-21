public IOContext(BufferRecycler br, Object sourceRef, boolean managedResource)
public void setEncoding(JsonEncoding enc)
public Object getSourceReference()
public JsonEncoding getEncoding()
public boolean isResourceManaged()
public TextBuffer constructTextBuffer()
public byte[] allocReadIOBuffer()
public byte[] allocWriteEncodingBuffer()
public byte[] allocBase64Buffer()
public char[] allocTokenBuffer()
public char[] allocConcatBuffer()
public char[] allocNameCopyBuffer(int minSize)
public void releaseReadIOBuffer(byte[] buf)
public void releaseWriteEncodingBuffer(byte[] buf)
public void releaseBase64Buffer(byte[] buf)
public void releaseTokenBuffer(char[] buf)
public void releaseConcatBuffer(char[] buf)
public void releaseNameCopyBuffer(char[] buf)
private final void _verifyAlloc(Object buffer)
private final void _verifyRelease(Object toRelease, Object src)
Object _sourceRef
JsonEncoding _encoding
boolean _managedResource
BufferRecycler _bufferRecycler
byte[] _readIOBuffer=Optional[null]
byte[] _writeEncodingBuffer=Optional[null]
byte[] _base64Buffer=Optional[null]
char[] _tokenCBuffer=Optional[null]
char[] _concatCBuffer=Optional[null]
char[] _nameCopyBuffer=Optional[null]
