private JsonMLError(DiagnosticType type, String sourceName, JsonML element, int lineNumber, ErrorLevel level, String... arguments) { [EOL]     this.description = type.format.format(arguments); [EOL]     this.sourceName = sourceName; [EOL]     this.element = element; [EOL]     this.lineNumber = lineNumber; [EOL]     this.level = level; [EOL] } <line_num>: 45,52
private JsonMLError(String description, DiagnosticType type, String sourceName, JsonML element, int lineNumber, ErrorLevel level) { [EOL]     this.description = description; [EOL]     this.sourceName = sourceName; [EOL]     this.element = element; [EOL]     this.lineNumber = lineNumber; [EOL]     this.level = level; [EOL] } <line_num>: 54,61
public static JsonMLError make(DiagnosticType type, String sourceName, JsonML element, int lineNumber, ErrorLevel level, String... arguments) { [EOL]     return new JsonMLError(type, sourceName, element, lineNumber, level, arguments); [EOL] } <line_num>: 63,67
public static JsonMLError make(JSError error, JsonMLAst ast) { [EOL]     int n = error.lineNumber; [EOL]     JsonML element = ast.getElementPreOrder(n); [EOL]     ErrorLevel level = error.getDefaultLevel() == CheckLevel.ERROR ? ErrorLevel.COMPILATION_ERROR : ErrorLevel.COMPILATION_WARNING; [EOL]     return new JsonMLError(error.getType(), error.sourceName, element, 0, level, error.description); [EOL] } <line_num>: 69,81
