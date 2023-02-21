JsonDeserializerExceptionWrapper(JsonDeserializer<T> delegate) { [EOL]     Preconditions.checkNotNull(delegate); [EOL]     this.delegate = delegate; [EOL] } <line_num>: 42,45
public T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException { [EOL]     try { [EOL]         return delegate.deserialize(json, typeOfT, context); [EOL]     } catch (JsonParseException e) { [EOL]         throw e; [EOL]     } catch (Exception e) { [EOL]         StringBuilder errorMsg = new StringBuilder().append("The JsonDeserializer ").append(delegate).append(" failed to deserialized json object ").append(json).append(" given the type ").append(typeOfT); [EOL]         throw new JsonParseException(errorMsg.toString(), e); [EOL]     } [EOL] } <line_num>: 47,65
@Override [EOL] public String toString() { [EOL]     return delegate.toString(); [EOL] } <line_num>: 67,70
