public DefaultPrettyPrinter() { [EOL]     this(DEFAULT_ROOT_VALUE_SEPARATOR); [EOL] } <line_num>: 92,94
public DefaultPrettyPrinter(String rootSeparator) { [EOL]     this((rootSeparator == null) ? null : new SerializedString(rootSeparator)); [EOL] } <line_num>: 107,109
public DefaultPrettyPrinter(SerializableString rootSeparator) { [EOL]     _rootSeparator = rootSeparator; [EOL] } <line_num>: 119,121
public DefaultPrettyPrinter(DefaultPrettyPrinter base) { [EOL]     this(base, base._rootSeparator); [EOL] } <line_num>: 123,125
public DefaultPrettyPrinter(DefaultPrettyPrinter base, SerializableString rootSeparator) { [EOL]     _arrayIndenter = base._arrayIndenter; [EOL]     _objectIndenter = base._objectIndenter; [EOL]     _spacesInObjectEntries = base._spacesInObjectEntries; [EOL]     _nesting = base._nesting; [EOL]     _rootSeparator = rootSeparator; [EOL] } <line_num>: 127,136
public Lf2SpacesIndenter() { [EOL]     this(SYS_LF); [EOL] } <line_num>: 442,442
public Lf2SpacesIndenter(String lf) { [EOL]     _lf = lf; [EOL] } <line_num>: 447,449
void writeIndentation(JsonGenerator jg, int level) throws IOException, JsonGenerationException; <line_num>: 39,40
boolean isInline(); <line_num>: 46,46
public DefaultPrettyPrinter withRootSeparator(SerializableString rootSeparator) { [EOL]     if (_rootSeparator == rootSeparator || (rootSeparator != null && rootSeparator.equals(_rootSeparator))) { [EOL]         return this; [EOL]     } [EOL]     return new DefaultPrettyPrinter(this, rootSeparator); [EOL] } <line_num>: 138,145
public void indentArraysWith(Indenter i) { [EOL]     _arrayIndenter = (i == null) ? NopIndenter.instance : i; [EOL] } <line_num>: 147,149
public void indentObjectsWith(Indenter i) { [EOL]     _objectIndenter = (i == null) ? NopIndenter.instance : i; [EOL] } <line_num>: 151,153
@Deprecated [EOL] public void spacesInObjectEntries(boolean b) { [EOL]     _spacesInObjectEntries = b; [EOL] } <line_num>: 158,159
public DefaultPrettyPrinter withArrayIndenter(Indenter i) { [EOL]     if (i == null) { [EOL]         i = NopIndenter.instance; [EOL]     } [EOL]     if (_arrayIndenter == i) { [EOL]         return this; [EOL]     } [EOL]     DefaultPrettyPrinter pp = new DefaultPrettyPrinter(this); [EOL]     pp._arrayIndenter = i; [EOL]     return pp; [EOL] } <line_num>: 164,174
public DefaultPrettyPrinter withObjectIndenter(Indenter i) { [EOL]     if (i == null) { [EOL]         i = NopIndenter.instance; [EOL]     } [EOL]     if (_objectIndenter == i) { [EOL]         return this; [EOL]     } [EOL]     DefaultPrettyPrinter pp = new DefaultPrettyPrinter(this); [EOL]     pp._objectIndenter = i; [EOL]     return pp; [EOL] } <line_num>: 179,189
public DefaultPrettyPrinter withSpacesInObjectEntries() { [EOL]     return _withSpaces(true); [EOL] } <line_num>: 199,201
public DefaultPrettyPrinter withoutSpacesInObjectEntries() { [EOL]     return _withSpaces(false); [EOL] } <line_num>: 211,213
protected DefaultPrettyPrinter _withSpaces(boolean state) { [EOL]     if (_spacesInObjectEntries == state) { [EOL]         return this; [EOL]     } [EOL]     DefaultPrettyPrinter pp = new DefaultPrettyPrinter(this); [EOL]     pp._spacesInObjectEntries = state; [EOL]     return pp; [EOL] } <line_num>: 215,223
@Override [EOL] public DefaultPrettyPrinter createInstance() { [EOL]     return new DefaultPrettyPrinter(this); [EOL] } <line_num>: 231,234
@Override [EOL] public void writeRootValueSeparator(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     if (_rootSeparator != null) { [EOL]         jg.writeRaw(_rootSeparator); [EOL]     } [EOL] } <line_num>: 242,249
@Override [EOL] public void writeStartObject(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     jg.writeRaw('{'); [EOL]     if (!_objectIndenter.isInline()) { [EOL]         ++_nesting; [EOL]     } [EOL] } <line_num>: 251,259
@Override [EOL] public void beforeObjectEntries(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     _objectIndenter.writeIndentation(jg, _nesting); [EOL] } <line_num>: 261,266
@Override [EOL] public void writeObjectFieldValueSeparator(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     if (_spacesInObjectEntries) { [EOL]         jg.writeRaw(" : "); [EOL]     } else { [EOL]         jg.writeRaw(':'); [EOL]     } [EOL] } <line_num>: 277,286
@Override [EOL] public void writeObjectEntrySeparator(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     jg.writeRaw(','); [EOL]     _objectIndenter.writeIndentation(jg, _nesting); [EOL] } <line_num>: 297,303
@Override [EOL] public void writeEndObject(JsonGenerator jg, int nrOfEntries) throws IOException, JsonGenerationException { [EOL]     if (!_objectIndenter.isInline()) { [EOL]         --_nesting; [EOL]     } [EOL]     if (nrOfEntries > 0) { [EOL]         _objectIndenter.writeIndentation(jg, _nesting); [EOL]     } else { [EOL]         jg.writeRaw(' '); [EOL]     } [EOL]     jg.writeRaw('}'); [EOL] } <line_num>: 305,318
@Override [EOL] public void writeStartArray(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     if (!_arrayIndenter.isInline()) { [EOL]         ++_nesting; [EOL]     } [EOL]     jg.writeRaw('['); [EOL] } <line_num>: 320,328
@Override [EOL] public void beforeArrayValues(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     _arrayIndenter.writeIndentation(jg, _nesting); [EOL] } <line_num>: 330,335
@Override [EOL] public void writeArrayValueSeparator(JsonGenerator jg) throws IOException, JsonGenerationException { [EOL]     jg.writeRaw(','); [EOL]     _arrayIndenter.writeIndentation(jg, _nesting); [EOL] } <line_num>: 346,352
@Override [EOL] public void writeEndArray(JsonGenerator jg, int nrOfValues) throws IOException, JsonGenerationException { [EOL]     if (!_arrayIndenter.isInline()) { [EOL]         --_nesting; [EOL]     } [EOL]     if (nrOfValues > 0) { [EOL]         _arrayIndenter.writeIndentation(jg, _nesting); [EOL]     } else { [EOL]         jg.writeRaw(' '); [EOL]     } [EOL]     jg.writeRaw(']'); [EOL] } <line_num>: 354,367
@Override [EOL] public void writeIndentation(JsonGenerator jg, int level) throws IOException, JsonGenerationException { [EOL] } <line_num>: 383,386
@Override [EOL] public boolean isInline() { [EOL]     return true; [EOL] } <line_num>: 388,389
@Override [EOL] public void writeIndentation(JsonGenerator jg, int level) throws IOException, JsonGenerationException { [EOL]     jg.writeRaw(' '); [EOL] } <line_num>: 402,407
@Override [EOL] public boolean isInline() { [EOL]     return true; [EOL] } <line_num>: 409,410
public Lf2SpacesIndenter withLinefeed(String lf) { [EOL]     if (lf.equals(_lf)) { [EOL]         return this; [EOL]     } [EOL]     return new Lf2SpacesIndenter(lf); [EOL] } <line_num>: 457,463
@Override [EOL] public boolean isInline() { [EOL]     return false; [EOL] } <line_num>: 465,466
@Override [EOL] public void writeIndentation(JsonGenerator jg, int level) throws IOException, JsonGenerationException { [EOL]     jg.writeRaw(_lf); [EOL]     if (level > 0) { [EOL]         level += level; [EOL]         while (level > SPACE_COUNT) { [EOL]             jg.writeRaw(SPACES, 0, SPACE_COUNT); [EOL]             level -= SPACES.length; [EOL]         } [EOL]         jg.writeRaw(SPACES, 0, level); [EOL]     } [EOL] } <line_num>: 468,481