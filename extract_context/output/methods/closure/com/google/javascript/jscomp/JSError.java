private JSError(String sourceName, @Nullable Node node, int lineno, int charno, DiagnosticType type, CheckLevel level, String... arguments) { [EOL]     this.type = type; [EOL]     this.node = node; [EOL]     this.description = type.format.format(arguments); [EOL]     this.lineNumber = lineno; [EOL]     this.charno = charno; [EOL]     this.sourceName = sourceName; [EOL]     this.defaultLevel = level == null ? type.level : level; [EOL]     this.level = level == null ? type.level : level; [EOL] } <line_num>: 152,163
private JSError(String sourceName, @Nullable Node node, DiagnosticType type, String... arguments) { [EOL]     this(sourceName, node, (node != null) ? node.getLineno() : -1, (node != null) ? node.getCharno() : -1, type, null, arguments); [EOL] } <line_num>: 169,176
public static JSError make(DiagnosticType type, String... arguments) { [EOL]     return new JSError(null, null, -1, -1, type, null, arguments); [EOL] } <line_num>: 72,74
public static JSError make(String sourceName, int lineno, int charno, DiagnosticType type, String... arguments) { [EOL]     return new JSError(sourceName, null, lineno, charno, type, null, arguments); [EOL] } <line_num>: 85,88
public static JSError make(String sourceName, int lineno, int charno, CheckLevel level, DiagnosticType type, String... arguments) { [EOL]     return new JSError(sourceName, null, lineno, charno, type, level, arguments); [EOL] } <line_num>: 99,103
public static JSError make(String sourceName, Node n, DiagnosticType type, String... arguments) { [EOL]     return new JSError(sourceName, n, type, arguments); [EOL] } <line_num>: 113,116
public static JSError make(Node n, DiagnosticType type, String... arguments) { [EOL]     return new JSError(n.getSourceFileName(), n, type, arguments); [EOL] } <line_num>: 125,127
public static JSError make(String sourceName, Node n, CheckLevel level, DiagnosticType type, String... arguments) { [EOL]     return new JSError(sourceName, n, n.getLineno(), n.getCharno(), type, level, arguments); [EOL] } <line_num>: 137,142
public DiagnosticType getType() { [EOL]     return type; [EOL] } <line_num>: 178,180
public String format(CheckLevel level, MessageFormatter formatter) { [EOL]     switch(level) { [EOL]         case ERROR: [EOL]             return formatter.formatError(this); [EOL]         case WARNING: [EOL]             return formatter.formatWarning(this); [EOL]         default: [EOL]             return null; [EOL]     } [EOL] } <line_num>: 187,198
@Override [EOL] public String toString() { [EOL]     return type.key + ". " + description + " at " + (sourceName != null && sourceName.length() > 0 ? sourceName : "(unknown source)") + " line " + (lineNumber != -1 ? String.valueOf(lineNumber) : "(unknown line)") + " : " + (charno != -1 ? String.valueOf(charno) : "(unknown column)"); [EOL] } <line_num>: 200,208
public int getCharno() { [EOL]     return charno; [EOL] } <line_num>: 213,215
public int getLineNumber() { [EOL]     return lineNumber; [EOL] } <line_num>: 220,222
public int getNodeSourceOffset() { [EOL]     return node != null ? node.getSourceOffset() : -1; [EOL] } <line_num>: 228,230
public int getNodeLength() { [EOL]     return node != null ? node.getLength() : 0; [EOL] } <line_num>: 236,238
public CheckLevel getDefaultLevel() { [EOL]     return defaultLevel; [EOL] } <line_num>: 241,243
@Override [EOL] public boolean equals(Object o) { [EOL]     if (this == o) { [EOL]         return true; [EOL]     } [EOL]     if (o == null || getClass() != o.getClass()) { [EOL]         return false; [EOL]     } [EOL]     JSError jsError = (JSError) o; [EOL]     if (charno != jsError.charno) { [EOL]         return false; [EOL]     } [EOL]     if (lineNumber != jsError.lineNumber) { [EOL]         return false; [EOL]     } [EOL]     if (!description.equals(jsError.description)) { [EOL]         return false; [EOL]     } [EOL]     if (defaultLevel != jsError.defaultLevel) { [EOL]         return false; [EOL]     } [EOL]     if (sourceName != null ? !sourceName.equals(jsError.sourceName) : jsError.sourceName != null) { [EOL]         return false; [EOL]     } [EOL]     if (!type.equals(jsError.type)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 245,278
@Override [EOL] public int hashCode() { [EOL]     int result = type.hashCode(); [EOL]     result = 31 * result + description.hashCode(); [EOL]     result = 31 * result + (sourceName != null ? sourceName.hashCode() : 0); [EOL]     result = 31 * result + lineNumber; [EOL]     result = 31 * result + defaultLevel.hashCode(); [EOL]     result = 31 * result + charno; [EOL]     return result; [EOL] } <line_num>: 280,290