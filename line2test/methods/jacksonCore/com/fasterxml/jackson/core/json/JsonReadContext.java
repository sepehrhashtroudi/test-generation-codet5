public JsonReadContext(JsonReadContext parent, int type, int lineNr, int colNr) { [EOL]     super(); [EOL]     _type = type; [EOL]     _parent = parent; [EOL]     _lineNr = lineNr; [EOL]     _columnNr = colNr; [EOL]     _index = -1; [EOL] } <line_num>: 42,50
protected void reset(int type, int lineNr, int colNr) { [EOL]     _type = type; [EOL]     _index = -1; [EOL]     _lineNr = lineNr; [EOL]     _columnNr = colNr; [EOL]     _currentName = null; [EOL] } <line_num>: 52,59
public static JsonReadContext createRootContext(int lineNr, int colNr) { [EOL]     return new JsonReadContext(null, TYPE_ROOT, lineNr, colNr); [EOL] } <line_num>: 63,66
public static JsonReadContext createRootContext() { [EOL]     return new JsonReadContext(null, TYPE_ROOT, 1, 0); [EOL] } <line_num>: 68,71
public JsonReadContext createChildArrayContext(int lineNr, int colNr) { [EOL]     JsonReadContext ctxt = _child; [EOL]     if (ctxt == null) { [EOL]         _child = ctxt = new JsonReadContext(this, TYPE_ARRAY, lineNr, colNr); [EOL]         return ctxt; [EOL]     } [EOL]     ctxt.reset(TYPE_ARRAY, lineNr, colNr); [EOL]     return ctxt; [EOL] } <line_num>: 73,82
public JsonReadContext createChildObjectContext(int lineNr, int colNr) { [EOL]     JsonReadContext ctxt = _child; [EOL]     if (ctxt == null) { [EOL]         _child = ctxt = new JsonReadContext(this, TYPE_OBJECT, lineNr, colNr); [EOL]         return ctxt; [EOL]     } [EOL]     ctxt.reset(TYPE_OBJECT, lineNr, colNr); [EOL]     return ctxt; [EOL] } <line_num>: 84,93
@Override [EOL] public String getCurrentName() { [EOL]     return _currentName; [EOL] } <line_num>: 101,102
@Override [EOL] public JsonReadContext getParent() { [EOL]     return _parent; [EOL] } <line_num>: 104,105
public JsonLocation getStartLocation(Object srcRef) { [EOL]     long totalChars = -1L; [EOL]     return new JsonLocation(srcRef, totalChars, _lineNr, _columnNr); [EOL] } <line_num>: 117,125
public boolean expectComma() { [EOL]     int ix = ++_index; [EOL]     return (_type != TYPE_ROOT && ix > 0); [EOL] } <line_num>: 133,141
public void setCurrentName(String name) { [EOL]     _currentName = name; [EOL] } <line_num>: 143,146
@Override [EOL] public String toString() { [EOL]     StringBuilder sb = new StringBuilder(64); [EOL]     switch(_type) { [EOL]         case TYPE_ROOT: [EOL]             sb.append("/"); [EOL]             break; [EOL]         case TYPE_ARRAY: [EOL]             sb.append('['); [EOL]             sb.append(getCurrentIndex()); [EOL]             sb.append(']'); [EOL]             break; [EOL]         case TYPE_OBJECT: [EOL]             sb.append('{'); [EOL]             if (_currentName != null) { [EOL]                 sb.append('"'); [EOL]                 CharTypes.appendQuoted(sb, _currentName); [EOL]                 sb.append('"'); [EOL]             } else { [EOL]                 sb.append('?'); [EOL]             } [EOL]             sb.append('}'); [EOL]             break; [EOL]     } [EOL]     return sb.toString(); [EOL] } <line_num>: 158,184