protected FromStringDeserializer(Class<?> vc) { [EOL]     super(vc); [EOL] } <line_num>: 18,20
@SuppressWarnings("unchecked") [EOL] @Override [EOL] public final T deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     String text = jp.getValueAsString(); [EOL]     if (text != null) { [EOL]         if (text.length() == 0 || (text = text.trim()).length() == 0) { [EOL]             return null; [EOL]         } [EOL]         try { [EOL]             T result = _deserialize(text, ctxt); [EOL]             if (result != null) { [EOL]                 return result; [EOL]             } [EOL]         } catch (IllegalArgumentException iae) { [EOL]         } [EOL]         throw ctxt.weirdStringException(text, _valueClass, "not a valid textual representation"); [EOL]     } [EOL]     if (jp.getCurrentToken() == JsonToken.VALUE_EMBEDDED_OBJECT) { [EOL]         Object ob = jp.getEmbeddedObject(); [EOL]         if (ob == null) { [EOL]             return null; [EOL]         } [EOL]         if (_valueClass.isAssignableFrom(ob.getClass())) { [EOL]             return (T) ob; [EOL]         } [EOL]         return _deserializeEmbedded(ob, ctxt); [EOL]     } [EOL]     throw ctxt.mappingException(_valueClass); [EOL] } <line_num>: 28,62
protected abstract T _deserialize(String value, DeserializationContext ctxt) throws IOException, JsonProcessingException; <line_num>: 64,65
protected T _deserializeEmbedded(Object ob, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     throw ctxt.mappingException("Don't know how to convert embedded Object of type " + ob.getClass().getName() + " into " + _valueClass.getName()); [EOL] } <line_num>: 67,73