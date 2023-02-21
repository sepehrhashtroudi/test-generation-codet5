MappingTraversal() { [EOL] } <line_num>: 484,485
LineMapper(Appendable out) { [EOL]     this.out = out; [EOL] } <line_num>: 697,699
@Override [EOL] public void reset() { [EOL]     mappings.clear(); [EOL]     lastMapping = null; [EOL]     sourceFileMap.clear(); [EOL]     originalNameMap.clear(); [EOL]     lastSourceFile = null; [EOL]     lastSourceFileIndex = -1; [EOL]     offsetPosition = new FilePosition(0, 0); [EOL]     prefixPosition = new FilePosition(0, 0); [EOL] } <line_num>: 94,104
@Override [EOL] public void validate(boolean validate) { [EOL] } <line_num>: 110,113
@Override [EOL] public void setWrapperPrefix(String prefix) { [EOL]     int prefixLine = 0; [EOL]     int prefixIndex = 0; [EOL]     for (int i = 0; i < prefix.length(); ++i) { [EOL]         if (prefix.charAt(i) == '\n') { [EOL]             prefixLine++; [EOL]             prefixIndex = 0; [EOL]         } else { [EOL]             prefixIndex++; [EOL]         } [EOL]     } [EOL]     prefixPosition = new FilePosition(prefixLine, prefixIndex); [EOL] } <line_num>: 122,138
@Override [EOL] public void setStartingPosition(int offsetLine, int offsetIndex) { [EOL]     Preconditions.checkState(offsetLine >= 0); [EOL]     Preconditions.checkState(offsetIndex >= 0); [EOL]     offsetPosition = new FilePosition(offsetLine, offsetIndex); [EOL] } <line_num>: 150,155
@Override [EOL] public void addMapping(String sourceName, @Nullable String symbolName, FilePosition sourceStartPosition, FilePosition startPosition, FilePosition endPosition) { [EOL]     if (sourceName == null || sourceStartPosition.getLine() < 0) { [EOL]         return; [EOL]     } [EOL]     FilePosition adjustedStart = startPosition; [EOL]     FilePosition adjustedEnd = endPosition; [EOL]     if (offsetPosition.getLine() != 0 || offsetPosition.getColumn() != 0) { [EOL]         int offsetLine = offsetPosition.getLine(); [EOL]         int startOffsetPosition = offsetPosition.getColumn(); [EOL]         int endOffsetPosition = offsetPosition.getColumn(); [EOL]         if (startPosition.getLine() > 0) { [EOL]             startOffsetPosition = 0; [EOL]         } [EOL]         if (endPosition.getLine() > 0) { [EOL]             endOffsetPosition = 0; [EOL]         } [EOL]         adjustedStart = new FilePosition(startPosition.getLine() + offsetLine, startPosition.getColumn() + startOffsetPosition); [EOL]         adjustedEnd = new FilePosition(endPosition.getLine() + offsetLine, endPosition.getColumn() + endOffsetPosition); [EOL]     } [EOL]     Mapping mapping = new Mapping(); [EOL]     mapping.sourceFile = sourceName; [EOL]     mapping.originalPosition = sourceStartPosition; [EOL]     mapping.originalName = symbolName; [EOL]     mapping.startPosition = adjustedStart; [EOL]     mapping.endPosition = adjustedEnd; [EOL]     if (lastMapping != null) { [EOL]         int lastLine = lastMapping.startPosition.getLine(); [EOL]         int lastColumn = lastMapping.startPosition.getColumn(); [EOL]         int nextLine = mapping.startPosition.getLine(); [EOL]         int nextColumn = mapping.startPosition.getColumn(); [EOL]         Preconditions.checkState(nextLine > lastLine || (nextLine == lastLine && nextColumn >= lastColumn), "Incorrect source mappings order, previous : (%s,%s)\n" + "new : (%s,%s)\nnode : %s", lastLine, lastColumn, nextLine, nextColumn); [EOL]     } [EOL]     lastMapping = mapping; [EOL]     mappings.add(mapping); [EOL] } <line_num>: 162,226
@Override [EOL] public void visit(String sourceName, String symbolName, FilePosition sourceStartPosition, FilePosition startPosition, FilePosition endPosition) { [EOL]     addMapping(sourceName, symbolName, sourceStartPosition, startPosition, endPosition); [EOL] } <line_num>: 230,237
public void mergeMapSection(int line, int column, String mapSectionContents) throws SourceMapParseException { [EOL]     setStartingPosition(line, column); [EOL]     SourceMapConsumerV3 section = new SourceMapConsumerV3(); [EOL]     section.parse(mapSectionContents); [EOL]     section.visitMappings(new ConsumerEntryVisitor()); [EOL] } <line_num>: 240,246
@Override [EOL] public void appendTo(Appendable out, String name) throws IOException { [EOL]     int maxLine = prepMappings(); [EOL]     out.append("{\n"); [EOL]     appendFirstField(out, "version", "3"); [EOL]     appendField(out, "file", escapeString(name)); [EOL]     appendField(out, "lineCount", String.valueOf(maxLine + 1)); [EOL]     appendFieldStart(out, "mappings"); [EOL]     (new LineMapper(out)).appendLineMappings(); [EOL]     appendFieldEnd(out); [EOL]     appendFieldStart(out, "sources"); [EOL]     out.append("["); [EOL]     addSourceNameMap(out); [EOL]     out.append("]"); [EOL]     appendFieldEnd(out); [EOL]     appendFieldStart(out, "names"); [EOL]     out.append("["); [EOL]     addSymbolNameMap(out); [EOL]     out.append("]"); [EOL]     appendFieldEnd(out); [EOL]     out.append("\n}\n"); [EOL] } <line_num>: 274,306
private void addSourceNameMap(Appendable out) throws IOException { [EOL]     addNameMap(out, sourceFileMap); [EOL] } <line_num>: 311,313
private void addSymbolNameMap(Appendable out) throws IOException { [EOL]     addNameMap(out, originalNameMap); [EOL] } <line_num>: 318,320
private void addNameMap(Appendable out, Map<String, Integer> map) throws IOException { [EOL]     int i = 0; [EOL]     for (Entry<String, Integer> entry : map.entrySet()) { [EOL]         String key = entry.getKey(); [EOL]         if (i != 0) { [EOL]             out.append(","); [EOL]         } [EOL]         out.append(escapeString(key)); [EOL]         i++; [EOL]     } [EOL] } <line_num>: 322,333
private static String escapeString(String value) { [EOL]     return Util.escapeString(value); [EOL] } <line_num>: 338,340
private static void appendFirstField(Appendable out, String name, CharSequence value) throws IOException { [EOL]     out.append("\""); [EOL]     out.append(name); [EOL]     out.append("\""); [EOL]     out.append(":"); [EOL]     out.append(value); [EOL] } <line_num>: 344,352
private static void appendField(Appendable out, String name, CharSequence value) throws IOException { [EOL]     out.append(",\n"); [EOL]     out.append("\""); [EOL]     out.append(name); [EOL]     out.append("\""); [EOL]     out.append(":"); [EOL]     out.append(value); [EOL] } <line_num>: 354,363
private static void appendFieldStart(Appendable out, String name) throws IOException { [EOL]     appendField(out, name, ""); [EOL] } <line_num>: 365,368
@SuppressWarnings("unused") [EOL] private static void appendFieldEnd(Appendable out) throws IOException { [EOL] } <line_num>: 370,373
private int prepMappings() throws IOException { [EOL]     (new MappingTraversal()).traverse(new UsedMappingCheck()); [EOL]     int id = 0; [EOL]     int maxLine = 0; [EOL]     int sourceId = 0; [EOL]     int nameId = 0; [EOL]     for (Mapping m : mappings) { [EOL]         if (m.used) { [EOL]             m.id = id++; [EOL]             int endPositionLine = m.endPosition.getLine(); [EOL]             maxLine = Math.max(maxLine, endPositionLine); [EOL]         } [EOL]     } [EOL]     return maxLine + prefixPosition.getLine(); [EOL] } <line_num>: 378,397
@Override [EOL] public void visit(Mapping m, int line, int col, int nextLine, int nextCol) throws IOException { [EOL]     if (m != null) { [EOL]         m.used = true; [EOL]     } [EOL] } <line_num>: 452,458
void visit(Mapping m, int line, int col, int endLine, int endCol) throws IOException; <line_num>: 471,472
void traverse(MappingVisitor v) throws IOException { [EOL]     Deque<Mapping> stack = new ArrayDeque<Mapping>(); [EOL]     for (Mapping m : mappings) { [EOL]         while (!stack.isEmpty() && !isOverlapped(stack.peek(), m)) { [EOL]             Mapping previous = stack.pop(); [EOL]             maybeVisit(v, previous); [EOL]         } [EOL]         Mapping parent = stack.peek(); [EOL]         maybeVisitParent(v, parent, m); [EOL]         stack.push(m); [EOL]     } [EOL]     while (!stack.isEmpty()) { [EOL]         Mapping m = stack.pop(); [EOL]         maybeVisit(v, m); [EOL]     } [EOL] } <line_num>: 488,517
private int getAdjustedLine(FilePosition p) { [EOL]     return p.getLine() + prefixPosition.getLine(); [EOL] } <line_num>: 522,524
private int getAdjustedCol(FilePosition p) { [EOL]     int rawLine = p.getLine(); [EOL]     int rawCol = p.getColumn(); [EOL]     return (rawLine != 0) ? rawCol : rawCol + prefixPosition.getColumn(); [EOL] } <line_num>: 529,535
private boolean isOverlapped(Mapping m1, Mapping m2) { [EOL]     int l1 = m1.endPosition.getLine(); [EOL]     int l2 = m2.startPosition.getLine(); [EOL]     int c1 = m1.endPosition.getColumn(); [EOL]     int c2 = m2.startPosition.getColumn(); [EOL]     return (l1 == l2 && c1 >= c2) || l1 > l2; [EOL] } <line_num>: 540,548
private void maybeVisit(MappingVisitor v, Mapping m) throws IOException { [EOL]     int nextLine = getAdjustedLine(m.endPosition); [EOL]     int nextCol = getAdjustedCol(m.endPosition); [EOL]     if (line < nextLine || (line == nextLine && col < nextCol)) { [EOL]         visit(v, m, nextLine, nextCol); [EOL]     } [EOL] } <line_num>: 554,562
private void maybeVisitParent(MappingVisitor v, Mapping parent, Mapping m) throws IOException { [EOL]     int nextLine = getAdjustedLine(m.startPosition); [EOL]     int nextCol = getAdjustedCol(m.startPosition); [EOL]     Preconditions.checkState(line < nextLine || col <= nextCol); [EOL]     if (line < nextLine || (line == nextLine && col < nextCol)) { [EOL]         visit(v, parent, nextLine, nextCol); [EOL]     } [EOL] } <line_num>: 567,576
private void visit(MappingVisitor v, Mapping m, int nextLine, int nextCol) throws IOException { [EOL]     Preconditions.checkState(line <= nextLine); [EOL]     Preconditions.checkState(line < nextLine || col < nextCol); [EOL]     if (line == nextLine && col == nextCol) { [EOL]         Preconditions.checkState(false); [EOL]         return; [EOL]     } [EOL]     v.visit(m, line, col, nextLine, nextCol); [EOL]     line = nextLine; [EOL]     col = nextCol; [EOL] } <line_num>: 582,598
@Override [EOL] public void appendIndexMapTo(Appendable out, String name, List<SourceMapSection> sections) throws IOException { [EOL]     out.append("{\n"); [EOL]     appendFirstField(out, "version", "3"); [EOL]     appendField(out, "file", escapeString(name)); [EOL]     appendFieldStart(out, "sections"); [EOL]     out.append("[\n"); [EOL]     boolean first = true; [EOL]     int line = 0, column = 0; [EOL]     for (SourceMapSection section : sections) { [EOL]         if (first) { [EOL]             first = false; [EOL]         } else { [EOL]             out.append(",\n"); [EOL]         } [EOL]         out.append("{\n"); [EOL]         appendFirstField(out, "offset", offsetValue(section.getLine(), section.getColumn())); [EOL]         if (section.getSectionType() == SourceMapSection.SectionType.URL) { [EOL]             appendField(out, "url", escapeString(section.getSectionValue())); [EOL]         } else if (section.getSectionType() == SourceMapSection.SectionType.MAP) { [EOL]             appendField(out, "map", section.getSectionValue()); [EOL]         } else { [EOL]             throw new IOException("Unexpected section type"); [EOL]         } [EOL]         out.append("\n}"); [EOL]     } [EOL]     out.append("\n]"); [EOL]     appendFieldEnd(out); [EOL]     out.append("\n}\n"); [EOL] } <line_num>: 610,647
private CharSequence offsetValue(int line, int column) throws IOException { [EOL]     StringBuilder out = new StringBuilder(); [EOL]     out.append("{\n"); [EOL]     appendFirstField(out, "line", String.valueOf(line)); [EOL]     appendField(out, "column", String.valueOf(column)); [EOL]     out.append("\n}"); [EOL]     return out; [EOL] } <line_num>: 649,656
private int getSourceId(String sourceName) { [EOL]     if (sourceName != lastSourceFile) { [EOL]         lastSourceFile = sourceName; [EOL]         Integer index = sourceFileMap.get(sourceName); [EOL]         if (index != null) { [EOL]             lastSourceFileIndex = index; [EOL]         } else { [EOL]             lastSourceFileIndex = sourceFileMap.size(); [EOL]             sourceFileMap.put(sourceName, lastSourceFileIndex); [EOL]         } [EOL]     } [EOL]     return lastSourceFileIndex; [EOL] } <line_num>: 658,670
private int getNameId(String symbolName) { [EOL]     int originalNameIndex; [EOL]     Integer index = originalNameMap.get(symbolName); [EOL]     if (index != null) { [EOL]         originalNameIndex = index; [EOL]     } else { [EOL]         originalNameIndex = originalNameMap.size(); [EOL]         originalNameMap.put(symbolName, originalNameIndex); [EOL]     } [EOL]     return originalNameIndex; [EOL] } <line_num>: 672,682
@Override [EOL] public void visit(Mapping m, int line, int col, int nextLine, int nextCol) throws IOException { [EOL]     int id = (m != null) ? m.id : UNMAPPED; [EOL]     if (previousLine != line) { [EOL]         previousColumn = 0; [EOL]     } [EOL]     if (line != nextLine || col != nextCol) { [EOL]         if (previousLine == line) { [EOL]             out.append(','); [EOL]         } [EOL]         writeEntry(m, col); [EOL]         previousLine = line; [EOL]         previousColumn = col; [EOL]     } [EOL]     for (int i = line; i <= nextLine; i++) { [EOL]         if (i == nextLine) { [EOL]             break; [EOL]         } [EOL]         closeLine(false); [EOL]         openLine(false); [EOL]     } [EOL] } <line_num>: 704,731
void writeEntry(Mapping m, int column) throws IOException { [EOL]     Base64VLQ.encode(out, column - previousColumn); [EOL]     previousColumn = column; [EOL]     if (m != null) { [EOL]         int sourceId = getSourceId(m.sourceFile); [EOL]         Base64VLQ.encode(out, sourceId - previousSourceFileId); [EOL]         previousSourceFileId = sourceId; [EOL]         int srcline = m.originalPosition.getLine(); [EOL]         int srcColumn = m.originalPosition.getColumn(); [EOL]         Base64VLQ.encode(out, srcline - previousSourceLine); [EOL]         previousSourceLine = srcline; [EOL]         Base64VLQ.encode(out, srcColumn - previousSourceColumn); [EOL]         previousSourceColumn = srcColumn; [EOL]         if (m.originalName != null) { [EOL]             int nameId = getNameId(m.originalName); [EOL]             Base64VLQ.encode(out, (nameId - previousNameId)); [EOL]             previousNameId = nameId; [EOL]         } [EOL]     } [EOL] } <line_num>: 739,765
void appendLineMappings() throws IOException { [EOL]     openLine(true); [EOL]     (new MappingTraversal()).traverse(this); [EOL]     closeLine(true); [EOL] } <line_num>: 768,776
private void openLine(boolean firstEntry) throws IOException { [EOL]     if (firstEntry) { [EOL]         out.append('\"'); [EOL]     } [EOL] } <line_num>: 781,785
private void closeLine(boolean finalEntry) throws IOException { [EOL]     out.append(';'); [EOL]     if (finalEntry) { [EOL]         out.append('\"'); [EOL]     } [EOL] } <line_num>: 790,795
