public MethodProperty(BeanPropertyDefinition propDef, JavaType type, TypeDeserializer typeDeser, Annotations contextAnnotations, AnnotatedMethod method) { [EOL]     super(propDef, type, typeDeser, contextAnnotations); [EOL]     _annotated = method; [EOL]     _setter = method.getAnnotated(); [EOL] } <line_num>: 34,41
protected MethodProperty(MethodProperty src, JsonDeserializer<?> deser) { [EOL]     super(src, deser); [EOL]     _annotated = src._annotated; [EOL]     _setter = src._setter; [EOL] } <line_num>: 43,47
protected MethodProperty(MethodProperty src, String newName) { [EOL]     super(src, newName); [EOL]     _annotated = src._annotated; [EOL]     _setter = src._setter; [EOL] } <line_num>: 49,53
protected MethodProperty(MethodProperty src, Method m) { [EOL]     super(src); [EOL]     _annotated = src._annotated; [EOL]     _setter = m; [EOL] } <line_num>: 58,62
@Override [EOL] public MethodProperty withName(String newName) { [EOL]     return new MethodProperty(this, newName); [EOL] } <line_num>: 64,67
@Override [EOL] public MethodProperty withValueDeserializer(JsonDeserializer<?> deser) { [EOL]     return new MethodProperty(this, deser); [EOL] } <line_num>: 69,72
@Override [EOL] public <A extends Annotation> A getAnnotation(Class<A> acls) { [EOL]     return _annotated.getAnnotation(acls); [EOL] } <line_num>: 80,83
@Override [EOL] public AnnotatedMember getMember() { [EOL]     return _annotated; [EOL] } <line_num>: 85,85
@Override [EOL] public void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException { [EOL]     set(instance, deserialize(jp, ctxt)); [EOL] } <line_num>: 93,99
@Override [EOL] public Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException { [EOL]     return setAndReturn(instance, deserialize(jp, ctxt)); [EOL] } <line_num>: 101,107
@Override [EOL] public final void set(Object instance, Object value) throws IOException { [EOL]     try { [EOL]         _setter.invoke(instance, value); [EOL]     } catch (Exception e) { [EOL]         _throwAsIOE(e, value); [EOL]     } [EOL] } <line_num>: 109,118
@Override [EOL] public Object setAndReturn(Object instance, Object value) throws IOException { [EOL]     try { [EOL]         Object result = _setter.invoke(instance, value); [EOL]         return (result == null) ? instance : result; [EOL]     } catch (Exception e) { [EOL]         _throwAsIOE(e, value); [EOL]         return null; [EOL]     } [EOL] } <line_num>: 120,131
Object readResolve() { [EOL]     return new MethodProperty(this, _annotated.getAnnotated()); [EOL] } <line_num>: 139,141
