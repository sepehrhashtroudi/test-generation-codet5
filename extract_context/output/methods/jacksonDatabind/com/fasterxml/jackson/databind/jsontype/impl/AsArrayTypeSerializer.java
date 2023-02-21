public AsArrayTypeSerializer(TypeIdResolver idRes, BeanProperty property) { [EOL]     super(idRes, property); [EOL] } <line_num>: 20,23
@Override [EOL] public AsArrayTypeSerializer forProperty(BeanProperty prop) { [EOL]     if (_property == prop) [EOL]         return this; [EOL]     return new AsArrayTypeSerializer(this._idResolver, prop); [EOL] } <line_num>: 25,29
@Override [EOL] public As getTypeInclusion() { [EOL]     return As.WRAPPER_ARRAY; [EOL] } <line_num>: 31,32
@Override [EOL] public void writeTypePrefixForObject(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException { [EOL]     jgen.writeStartArray(); [EOL]     jgen.writeString(idFromValue(value)); [EOL]     jgen.writeStartObject(); [EOL] } <line_num>: 40,47
@Override [EOL] public void writeTypePrefixForObject(Object value, JsonGenerator jgen, Class<?> type) throws IOException, JsonProcessingException { [EOL]     jgen.writeStartArray(); [EOL]     jgen.writeString(idFromValueAndType(value, type)); [EOL]     jgen.writeStartObject(); [EOL] } <line_num>: 49,57
@Override [EOL] public void writeTypePrefixForArray(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException { [EOL]     jgen.writeStartArray(); [EOL]     jgen.writeString(idFromValue(value)); [EOL]     jgen.writeStartArray(); [EOL] } <line_num>: 59,66
@Override [EOL] public void writeTypePrefixForArray(Object value, JsonGenerator jgen, Class<?> type) throws IOException, JsonProcessingException { [EOL]     jgen.writeStartArray(); [EOL]     jgen.writeString(idFromValueAndType(value, type)); [EOL]     jgen.writeStartArray(); [EOL] } <line_num>: 68,76
@Override [EOL] public void writeTypePrefixForScalar(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException { [EOL]     jgen.writeStartArray(); [EOL]     jgen.writeString(idFromValue(value)); [EOL] } <line_num>: 78,85
@Override [EOL] public void writeTypePrefixForScalar(Object value, JsonGenerator jgen, Class<?> type) throws IOException, JsonProcessingException { [EOL]     jgen.writeStartArray(); [EOL]     jgen.writeString(idFromValueAndType(value, type)); [EOL] } <line_num>: 87,95
@Override [EOL] public void writeTypeSuffixForObject(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException { [EOL]     jgen.writeEndObject(); [EOL]     jgen.writeEndArray(); [EOL] } <line_num>: 103,109
@Override [EOL] public void writeTypeSuffixForArray(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException { [EOL]     jgen.writeEndArray(); [EOL]     jgen.writeEndArray(); [EOL] } <line_num>: 111,118
@Override [EOL] public void writeTypeSuffixForScalar(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException { [EOL]     jgen.writeEndArray(); [EOL] } <line_num>: 120,126
@Override [EOL] public void writeCustomTypePrefixForObject(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException { [EOL]     jgen.writeStartArray(); [EOL]     jgen.writeString(typeId); [EOL]     jgen.writeStartObject(); [EOL] } <line_num>: 134,140
@Override [EOL] public void writeCustomTypePrefixForArray(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException { [EOL]     jgen.writeStartArray(); [EOL]     jgen.writeString(typeId); [EOL]     jgen.writeStartArray(); [EOL] } <line_num>: 142,149
@Override [EOL] public void writeCustomTypePrefixForScalar(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException { [EOL]     jgen.writeStartArray(); [EOL]     jgen.writeString(typeId); [EOL] } <line_num>: 151,157
@Override [EOL] public void writeCustomTypeSuffixForObject(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException { [EOL]     writeTypeSuffixForObject(value, jgen); [EOL] } <line_num>: 159,163
@Override [EOL] public void writeCustomTypeSuffixForArray(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException { [EOL]     writeTypeSuffixForArray(value, jgen); [EOL] } <line_num>: 165,169
@Override [EOL] public void writeCustomTypeSuffixForScalar(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException { [EOL]     writeTypeSuffixForScalar(value, jgen); [EOL] } <line_num>: 171,175
