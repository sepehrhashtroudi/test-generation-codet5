private MapType(Class<?> mapType, JavaType keyT, JavaType valueT, Object valueHandler, Object typeHandler, boolean asStatic) { [EOL]     super(mapType, keyT, valueT, valueHandler, typeHandler, asStatic); [EOL] } <line_num>: 18,21
public static MapType construct(Class<?> rawType, JavaType keyT, JavaType valueT) { [EOL]     return new MapType(rawType, keyT, valueT, null, null, false); [EOL] } <line_num>: 23,26
@Override [EOL] protected JavaType _narrow(Class<?> subclass) { [EOL]     return new MapType(subclass, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic); [EOL] } <line_num>: 28,32
@Override [EOL] public JavaType narrowContentsBy(Class<?> contentClass) { [EOL]     if (contentClass == _valueType.getRawClass()) { [EOL]         return this; [EOL]     } [EOL]     return new MapType(_class, _keyType, _valueType.narrowBy(contentClass), _valueHandler, _typeHandler, _asStatic); [EOL] } <line_num>: 34,43
@Override [EOL] public JavaType widenContentsBy(Class<?> contentClass) { [EOL]     if (contentClass == _valueType.getRawClass()) { [EOL]         return this; [EOL]     } [EOL]     return new MapType(_class, _keyType, _valueType.widenBy(contentClass), _valueHandler, _typeHandler, _asStatic); [EOL] } <line_num>: 45,53
@Override [EOL] public JavaType narrowKey(Class<?> keySubclass) { [EOL]     if (keySubclass == _keyType.getRawClass()) { [EOL]         return this; [EOL]     } [EOL]     return new MapType(_class, _keyType.narrowBy(keySubclass), _valueType, _valueHandler, _typeHandler, _asStatic); [EOL] } <line_num>: 55,64
@Override [EOL] public JavaType widenKey(Class<?> keySubclass) { [EOL]     if (keySubclass == _keyType.getRawClass()) { [EOL]         return this; [EOL]     } [EOL]     return new MapType(_class, _keyType.widenBy(keySubclass), _valueType, _valueHandler, _typeHandler, _asStatic); [EOL] } <line_num>: 66,75
@Override [EOL] public MapType withTypeHandler(Object h) { [EOL]     return new MapType(_class, _keyType, _valueType, _valueHandler, h, _asStatic); [EOL] } <line_num>: 77,80
@Override [EOL] public MapType withContentTypeHandler(Object h) { [EOL]     return new MapType(_class, _keyType, _valueType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic); [EOL] } <line_num>: 82,87
@Override [EOL] public MapType withValueHandler(Object h) { [EOL]     return new MapType(_class, _keyType, _valueType, h, _typeHandler, _asStatic); [EOL] } <line_num>: 89,92
@Override [EOL] public MapType withContentValueHandler(Object h) { [EOL]     return new MapType(_class, _keyType, _valueType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic); [EOL] } <line_num>: 94,98
@Override [EOL] public MapType withStaticTyping() { [EOL]     if (_asStatic) { [EOL]         return this; [EOL]     } [EOL]     return new MapType(_class, _keyType.withStaticTyping(), _valueType.withStaticTyping(), _valueHandler, _typeHandler, true); [EOL] } <line_num>: 100,107
@Override [EOL] public MapType withKeyTypeHandler(Object h) { [EOL]     return new MapType(_class, _keyType.withTypeHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic); [EOL] } <line_num>: 115,120
@Override [EOL] public MapType withKeyValueHandler(Object h) { [EOL]     return new MapType(_class, _keyType.withValueHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic); [EOL] } <line_num>: 122,126
@Override [EOL] public String toString() { [EOL]     return "[map type; class " + _class.getName() + ", " + _keyType + " -> " + _valueType + "]"; [EOL] } <line_num>: 134,138