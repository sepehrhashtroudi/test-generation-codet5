public CategoryMarker(Comparable key) { [EOL]     this(key, Color.gray, new BasicStroke(1.0f)); [EOL] } <line_num>: 79,81
public CategoryMarker(Comparable key, Paint paint, Stroke stroke) { [EOL]     this(key, paint, stroke, paint, stroke, 1.0f); [EOL] } <line_num>: 90,92
public CategoryMarker(Comparable key, Paint paint, Stroke stroke, Paint outlinePaint, Stroke outlineStroke, float alpha) { [EOL]     super(paint, stroke, outlinePaint, outlineStroke, alpha); [EOL]     this.key = key; [EOL]     setLabelOffsetType(LengthAdjustmentType.EXPAND); [EOL] } <line_num>: 104,110
public Comparable getKey() { [EOL]     return this.key; [EOL] } <line_num>: 117,119
public void setKey(Comparable key) { [EOL]     if (key == null) { [EOL]         throw new IllegalArgumentException("Null 'key' argument."); [EOL]     } [EOL]     this.key = key; [EOL]     notifyListeners(new MarkerChangeEvent(this)); [EOL] } <line_num>: 129,135
public boolean getDrawAsLine() { [EOL]     return this.drawAsLine; [EOL] } <line_num>: 143,145
public void setDrawAsLine(boolean drawAsLine) { [EOL]     this.drawAsLine = drawAsLine; [EOL]     notifyListeners(new MarkerChangeEvent(this)); [EOL] } <line_num>: 154,157
public boolean equals(Object obj) { [EOL]     if (obj == null) { [EOL]         return false; [EOL]     } [EOL]     if (!(obj instanceof CategoryMarker)) { [EOL]         return false; [EOL]     } [EOL]     if (!super.equals(obj)) { [EOL]         return false; [EOL]     } [EOL]     CategoryMarker that = (CategoryMarker) obj; [EOL]     if (!this.key.equals(that.key)) { [EOL]         return false; [EOL]     } [EOL]     if (this.drawAsLine != that.drawAsLine) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 166,184