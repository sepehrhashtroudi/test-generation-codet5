protected PrimitiveArrayDeserializers(Class<T> cls) { [EOL]     super(cls); [EOL] } <line_num>: 18,20
public CharDeser() { [EOL]     super(char[].class); [EOL] } <line_num>: 76,76
public BooleanDeser() { [EOL]     super(boolean[].class); [EOL] } <line_num>: 144,144
public ByteDeser() { [EOL]     super(byte[].class); [EOL] } <line_num>: 196,196
public ShortDeser() { [EOL]     super(short[].class); [EOL] } <line_num>: 280,280
public IntDeser() { [EOL]     super(int[].class); [EOL] } <line_num>: 329,329
public LongDeser() { [EOL]     super(long[].class); [EOL] } <line_num>: 379,379
public FloatDeser() { [EOL]     super(float[].class); [EOL] } <line_num>: 426,426
public DoubleDeser() { [EOL]     super(double[].class); [EOL] } <line_num>: 474,474
public static JsonDeserializer<?> forType(Class<?> rawType) { [EOL]     if (rawType == Integer.TYPE) { [EOL]         return IntDeser.instance; [EOL]     } [EOL]     if (rawType == Long.TYPE) { [EOL]         return LongDeser.instance; [EOL]     } [EOL]     if (rawType == Byte.TYPE) { [EOL]         return new ByteDeser(); [EOL]     } [EOL]     if (rawType == Short.TYPE) { [EOL]         return new ShortDeser(); [EOL]     } [EOL]     if (rawType == Float.TYPE) { [EOL]         return new FloatDeser(); [EOL]     } [EOL]     if (rawType == Double.TYPE) { [EOL]         return new DoubleDeser(); [EOL]     } [EOL]     if (rawType == Boolean.TYPE) { [EOL]         return new BooleanDeser(); [EOL]     } [EOL]     if (rawType == Character.TYPE) { [EOL]         return new CharDeser(); [EOL]     } [EOL]     throw new IllegalStateException(); [EOL] } <line_num>: 22,51
@Override [EOL] public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException { [EOL]     return typeDeserializer.deserializeTypedFromArray(jp, ctxt); [EOL] } <line_num>: 53,62
@Override [EOL] public char[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     JsonToken t = jp.getCurrentToken(); [EOL]     if (t == JsonToken.VALUE_STRING) { [EOL]         char[] buffer = jp.getTextCharacters(); [EOL]         int offset = jp.getTextOffset(); [EOL]         int len = jp.getTextLength(); [EOL]         char[] result = new char[len]; [EOL]         System.arraycopy(buffer, offset, result, 0, len); [EOL]         return result; [EOL]     } [EOL]     if (jp.isExpectedStartArrayToken()) { [EOL]         StringBuilder sb = new StringBuilder(64); [EOL]         while ((t = jp.nextToken()) != JsonToken.END_ARRAY) { [EOL]             if (t != JsonToken.VALUE_STRING) { [EOL]                 throw ctxt.mappingException(Character.TYPE); [EOL]             } [EOL]             String str = jp.getText(); [EOL]             if (str.length() != 1) { [EOL]                 throw JsonMappingException.from(jp, "Can not convert a JSON String of length " + str.length() + " into a char element of char array"); [EOL]             } [EOL]             sb.append(str.charAt(0)); [EOL]         } [EOL]         return sb.toString().toCharArray(); [EOL]     } [EOL]     if (t == JsonToken.VALUE_EMBEDDED_OBJECT) { [EOL]         Object ob = jp.getEmbeddedObject(); [EOL]         if (ob == null) [EOL]             return null; [EOL]         if (ob instanceof char[]) { [EOL]             return (char[]) ob; [EOL]         } [EOL]         if (ob instanceof String) { [EOL]             return ((String) ob).toCharArray(); [EOL]         } [EOL]         if (ob instanceof byte[]) { [EOL]             return Base64Variants.getDefaultVariant().encode((byte[]) ob, false).toCharArray(); [EOL]         } [EOL]     } [EOL]     throw ctxt.mappingException(_valueClass); [EOL] } <line_num>: 78,129
@Override [EOL] public boolean[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if (!jp.isExpectedStartArrayToken()) { [EOL]         return handleNonArray(jp, ctxt); [EOL]     } [EOL]     ArrayBuilders.BooleanBuilder builder = ctxt.getArrayBuilders().getBooleanBuilder(); [EOL]     boolean[] chunk = builder.resetAndStart(); [EOL]     int ix = 0; [EOL]     while (jp.nextToken() != JsonToken.END_ARRAY) { [EOL]         boolean value = _parseBooleanPrimitive(jp, ctxt); [EOL]         if (ix >= chunk.length) { [EOL]             chunk = builder.appendCompletedChunk(chunk, ix); [EOL]             ix = 0; [EOL]         } [EOL]         chunk[ix++] = value; [EOL]     } [EOL]     return builder.completeAndClearBuffer(chunk, ix); [EOL] } <line_num>: 146,167
private final boolean[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if ((jp.getCurrentToken() == JsonToken.VALUE_STRING) && ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) { [EOL]         if (jp.getText().length() == 0) { [EOL]             return null; [EOL]         } [EOL]     } [EOL]     if (!ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) { [EOL]         throw ctxt.mappingException(_valueClass); [EOL]     } [EOL]     return new boolean[] { _parseBooleanPrimitive(jp, ctxt) }; [EOL] } <line_num>: 169,183
@Override [EOL] public byte[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     JsonToken t = jp.getCurrentToken(); [EOL]     if (t == JsonToken.VALUE_STRING) { [EOL]         return jp.getBinaryValue(ctxt.getBase64Variant()); [EOL]     } [EOL]     if (t == JsonToken.VALUE_EMBEDDED_OBJECT) { [EOL]         Object ob = jp.getEmbeddedObject(); [EOL]         if (ob == null) [EOL]             return null; [EOL]         if (ob instanceof byte[]) { [EOL]             return (byte[]) ob; [EOL]         } [EOL]     } [EOL]     if (!jp.isExpectedStartArrayToken()) { [EOL]         return handleNonArray(jp, ctxt); [EOL]     } [EOL]     ArrayBuilders.ByteBuilder builder = ctxt.getArrayBuilders().getByteBuilder(); [EOL]     byte[] chunk = builder.resetAndStart(); [EOL]     int ix = 0; [EOL]     while ((t = jp.nextToken()) != JsonToken.END_ARRAY) { [EOL]         byte value; [EOL]         if (t == JsonToken.VALUE_NUMBER_INT || t == JsonToken.VALUE_NUMBER_FLOAT) { [EOL]             value = jp.getByteValue(); [EOL]         } else { [EOL]             if (t != JsonToken.VALUE_NULL) { [EOL]                 throw ctxt.mappingException(_valueClass.getComponentType()); [EOL]             } [EOL]             value = (byte) 0; [EOL]         } [EOL]         if (ix >= chunk.length) { [EOL]             chunk = builder.appendCompletedChunk(chunk, ix); [EOL]             ix = 0; [EOL]         } [EOL]         chunk[ix++] = value; [EOL]     } [EOL]     return builder.completeAndClearBuffer(chunk, ix); [EOL] } <line_num>: 198,243
private final byte[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if ((jp.getCurrentToken() == JsonToken.VALUE_STRING) && ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) { [EOL]         if (jp.getText().length() == 0) { [EOL]             return null; [EOL]         } [EOL]     } [EOL]     if (!ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) { [EOL]         throw ctxt.mappingException(_valueClass); [EOL]     } [EOL]     byte value; [EOL]     JsonToken t = jp.getCurrentToken(); [EOL]     if (t == JsonToken.VALUE_NUMBER_INT || t == JsonToken.VALUE_NUMBER_FLOAT) { [EOL]         value = jp.getByteValue(); [EOL]     } else { [EOL]         if (t != JsonToken.VALUE_NULL) { [EOL]             throw ctxt.mappingException(_valueClass.getComponentType()); [EOL]         } [EOL]         value = (byte) 0; [EOL]     } [EOL]     return new byte[] { value }; [EOL] } <line_num>: 245,271
@Override [EOL] public short[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if (!jp.isExpectedStartArrayToken()) { [EOL]         return handleNonArray(jp, ctxt); [EOL]     } [EOL]     ArrayBuilders.ShortBuilder builder = ctxt.getArrayBuilders().getShortBuilder(); [EOL]     short[] chunk = builder.resetAndStart(); [EOL]     int ix = 0; [EOL]     while (jp.nextToken() != JsonToken.END_ARRAY) { [EOL]         short value = _parseShortPrimitive(jp, ctxt); [EOL]         if (ix >= chunk.length) { [EOL]             chunk = builder.appendCompletedChunk(chunk, ix); [EOL]             ix = 0; [EOL]         } [EOL]         chunk[ix++] = value; [EOL]     } [EOL]     return builder.completeAndClearBuffer(chunk, ix); [EOL] } <line_num>: 282,302
private final short[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if ((jp.getCurrentToken() == JsonToken.VALUE_STRING) && ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) { [EOL]         if (jp.getText().length() == 0) { [EOL]             return null; [EOL]         } [EOL]     } [EOL]     if (!ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) { [EOL]         throw ctxt.mappingException(_valueClass); [EOL]     } [EOL]     return new short[] { _parseShortPrimitive(jp, ctxt) }; [EOL] } <line_num>: 304,318
@Override [EOL] public int[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if (!jp.isExpectedStartArrayToken()) { [EOL]         return handleNonArray(jp, ctxt); [EOL]     } [EOL]     ArrayBuilders.IntBuilder builder = ctxt.getArrayBuilders().getIntBuilder(); [EOL]     int[] chunk = builder.resetAndStart(); [EOL]     int ix = 0; [EOL]     while (jp.nextToken() != JsonToken.END_ARRAY) { [EOL]         int value = _parseIntPrimitive(jp, ctxt); [EOL]         if (ix >= chunk.length) { [EOL]             chunk = builder.appendCompletedChunk(chunk, ix); [EOL]             ix = 0; [EOL]         } [EOL]         chunk[ix++] = value; [EOL]     } [EOL]     return builder.completeAndClearBuffer(chunk, ix); [EOL] } <line_num>: 331,352
private final int[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if ((jp.getCurrentToken() == JsonToken.VALUE_STRING) && ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) { [EOL]         if (jp.getText().length() == 0) { [EOL]             return null; [EOL]         } [EOL]     } [EOL]     if (!ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) { [EOL]         throw ctxt.mappingException(_valueClass); [EOL]     } [EOL]     return new int[] { _parseIntPrimitive(jp, ctxt) }; [EOL] } <line_num>: 354,368
@Override [EOL] public long[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if (!jp.isExpectedStartArrayToken()) { [EOL]         return handleNonArray(jp, ctxt); [EOL]     } [EOL]     ArrayBuilders.LongBuilder builder = ctxt.getArrayBuilders().getLongBuilder(); [EOL]     long[] chunk = builder.resetAndStart(); [EOL]     int ix = 0; [EOL]     while (jp.nextToken() != JsonToken.END_ARRAY) { [EOL]         long value = _parseLongPrimitive(jp, ctxt); [EOL]         if (ix >= chunk.length) { [EOL]             chunk = builder.appendCompletedChunk(chunk, ix); [EOL]             ix = 0; [EOL]         } [EOL]         chunk[ix++] = value; [EOL]     } [EOL]     return builder.completeAndClearBuffer(chunk, ix); [EOL] } <line_num>: 381,401
private final long[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if ((jp.getCurrentToken() == JsonToken.VALUE_STRING) && ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) { [EOL]         if (jp.getText().length() == 0) { [EOL]             return null; [EOL]         } [EOL]     } [EOL]     if (!ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) { [EOL]         throw ctxt.mappingException(_valueClass); [EOL]     } [EOL]     return new long[] { _parseLongPrimitive(jp, ctxt) }; [EOL] } <line_num>: 403,417
@Override [EOL] public float[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if (!jp.isExpectedStartArrayToken()) { [EOL]         return handleNonArray(jp, ctxt); [EOL]     } [EOL]     ArrayBuilders.FloatBuilder builder = ctxt.getArrayBuilders().getFloatBuilder(); [EOL]     float[] chunk = builder.resetAndStart(); [EOL]     int ix = 0; [EOL]     while (jp.nextToken() != JsonToken.END_ARRAY) { [EOL]         float value = _parseFloatPrimitive(jp, ctxt); [EOL]         if (ix >= chunk.length) { [EOL]             chunk = builder.appendCompletedChunk(chunk, ix); [EOL]             ix = 0; [EOL]         } [EOL]         chunk[ix++] = value; [EOL]     } [EOL]     return builder.completeAndClearBuffer(chunk, ix); [EOL] } <line_num>: 428,449
private final float[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if ((jp.getCurrentToken() == JsonToken.VALUE_STRING) && ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) { [EOL]         if (jp.getText().length() == 0) { [EOL]             return null; [EOL]         } [EOL]     } [EOL]     if (!ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) { [EOL]         throw ctxt.mappingException(_valueClass); [EOL]     } [EOL]     return new float[] { _parseFloatPrimitive(jp, ctxt) }; [EOL] } <line_num>: 451,465
@Override [EOL] public double[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if (!jp.isExpectedStartArrayToken()) { [EOL]         return handleNonArray(jp, ctxt); [EOL]     } [EOL]     ArrayBuilders.DoubleBuilder builder = ctxt.getArrayBuilders().getDoubleBuilder(); [EOL]     double[] chunk = builder.resetAndStart(); [EOL]     int ix = 0; [EOL]     while (jp.nextToken() != JsonToken.END_ARRAY) { [EOL]         double value = _parseDoublePrimitive(jp, ctxt); [EOL]         if (ix >= chunk.length) { [EOL]             chunk = builder.appendCompletedChunk(chunk, ix); [EOL]             ix = 0; [EOL]         } [EOL]         chunk[ix++] = value; [EOL]     } [EOL]     return builder.completeAndClearBuffer(chunk, ix); [EOL] } <line_num>: 476,496
private final double[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if ((jp.getCurrentToken() == JsonToken.VALUE_STRING) && ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) { [EOL]         if (jp.getText().length() == 0) { [EOL]             return null; [EOL]         } [EOL]     } [EOL]     if (!ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) { [EOL]         throw ctxt.mappingException(_valueClass); [EOL]     } [EOL]     return new double[] { _parseDoublePrimitive(jp, ctxt) }; [EOL] } <line_num>: 498,512
