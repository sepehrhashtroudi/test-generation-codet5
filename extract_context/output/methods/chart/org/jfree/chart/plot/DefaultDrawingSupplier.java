public DefaultDrawingSupplier() { [EOL]     this(DEFAULT_PAINT_SEQUENCE, DEFAULT_FILL_PAINT_SEQUENCE, DEFAULT_OUTLINE_PAINT_SEQUENCE, DEFAULT_STROKE_SEQUENCE, DEFAULT_OUTLINE_STROKE_SEQUENCE, DEFAULT_SHAPE_SEQUENCE); [EOL] } <line_num>: 148,156
public DefaultDrawingSupplier(Paint[] paintSequence, Paint[] outlinePaintSequence, Stroke[] strokeSequence, Stroke[] outlineStrokeSequence, Shape[] shapeSequence) { [EOL]     this.paintSequence = paintSequence; [EOL]     this.fillPaintSequence = DEFAULT_FILL_PAINT_SEQUENCE; [EOL]     this.outlinePaintSequence = outlinePaintSequence; [EOL]     this.strokeSequence = strokeSequence; [EOL]     this.outlineStrokeSequence = outlineStrokeSequence; [EOL]     this.shapeSequence = shapeSequence; [EOL] } <line_num>: 167,180
public DefaultDrawingSupplier(Paint[] paintSequence, Paint[] fillPaintSequence, Paint[] outlinePaintSequence, Stroke[] strokeSequence, Stroke[] outlineStrokeSequence, Shape[] shapeSequence) { [EOL]     this.paintSequence = paintSequence; [EOL]     this.fillPaintSequence = fillPaintSequence; [EOL]     this.outlinePaintSequence = outlinePaintSequence; [EOL]     this.strokeSequence = strokeSequence; [EOL]     this.outlineStrokeSequence = outlineStrokeSequence; [EOL]     this.shapeSequence = shapeSequence; [EOL] } <line_num>: 194,205
public Paint getNextPaint() { [EOL]     Paint result = this.paintSequence[this.paintIndex % this.paintSequence.length]; [EOL]     this.paintIndex++; [EOL]     return result; [EOL] } <line_num>: 212,217
public Paint getNextOutlinePaint() { [EOL]     Paint result = this.outlinePaintSequence[this.outlinePaintIndex % this.outlinePaintSequence.length]; [EOL]     this.outlinePaintIndex++; [EOL]     return result; [EOL] } <line_num>: 224,229
public Paint getNextFillPaint() { [EOL]     Paint result = this.fillPaintSequence[this.fillPaintIndex % this.fillPaintSequence.length]; [EOL]     this.fillPaintIndex++; [EOL]     return result; [EOL] } <line_num>: 238,243
public Stroke getNextStroke() { [EOL]     Stroke result = this.strokeSequence[this.strokeIndex % this.strokeSequence.length]; [EOL]     this.strokeIndex++; [EOL]     return result; [EOL] } <line_num>: 250,255
public Stroke getNextOutlineStroke() { [EOL]     Stroke result = this.outlineStrokeSequence[this.outlineStrokeIndex % this.outlineStrokeSequence.length]; [EOL]     this.outlineStrokeIndex++; [EOL]     return result; [EOL] } <line_num>: 262,267
public Shape getNextShape() { [EOL]     Shape result = this.shapeSequence[this.shapeIndex % this.shapeSequence.length]; [EOL]     this.shapeIndex++; [EOL]     return result; [EOL] } <line_num>: 274,279
public static Shape[] createStandardSeriesShapes() { [EOL]     Shape[] result = new Shape[10]; [EOL]     double size = 6.0; [EOL]     double delta = size / 2.0; [EOL]     int[] xpoints = null; [EOL]     int[] ypoints = null; [EOL]     result[0] = new Rectangle2D.Double(-delta, -delta, size, size); [EOL]     result[1] = new Ellipse2D.Double(-delta, -delta, size, size); [EOL]     xpoints = intArray(0.0, delta, -delta); [EOL]     ypoints = intArray(-delta, delta, delta); [EOL]     result[2] = new Polygon(xpoints, ypoints, 3); [EOL]     xpoints = intArray(0.0, delta, 0.0, -delta); [EOL]     ypoints = intArray(-delta, 0.0, delta, 0.0); [EOL]     result[3] = new Polygon(xpoints, ypoints, 4); [EOL]     result[4] = new Rectangle2D.Double(-delta, -delta / 2, size, size / 2); [EOL]     xpoints = intArray(-delta, +delta, 0.0); [EOL]     ypoints = intArray(-delta, -delta, delta); [EOL]     result[5] = new Polygon(xpoints, ypoints, 3); [EOL]     result[6] = new Ellipse2D.Double(-delta, -delta / 2, size, size / 2); [EOL]     xpoints = intArray(-delta, delta, -delta); [EOL]     ypoints = intArray(-delta, 0.0, delta); [EOL]     result[7] = new Polygon(xpoints, ypoints, 3); [EOL]     result[8] = new Rectangle2D.Double(-delta / 2, -delta, size / 2, size); [EOL]     xpoints = intArray(-delta, delta, delta); [EOL]     ypoints = intArray(0.0, -delta, +delta); [EOL]     result[9] = new Polygon(xpoints, ypoints, 3); [EOL]     return result; [EOL] } <line_num>: 287,337
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof DefaultDrawingSupplier)) { [EOL]         return false; [EOL]     } [EOL]     DefaultDrawingSupplier that = (DefaultDrawingSupplier) obj; [EOL]     if (!Arrays.equals(this.paintSequence, that.paintSequence)) { [EOL]         return false; [EOL]     } [EOL]     if (this.paintIndex != that.paintIndex) { [EOL]         return false; [EOL]     } [EOL]     if (!Arrays.equals(this.outlinePaintSequence, that.outlinePaintSequence)) { [EOL]         return false; [EOL]     } [EOL]     if (this.outlinePaintIndex != that.outlinePaintIndex) { [EOL]         return false; [EOL]     } [EOL]     if (!Arrays.equals(this.strokeSequence, that.strokeSequence)) { [EOL]         return false; [EOL]     } [EOL]     if (this.strokeIndex != that.strokeIndex) { [EOL]         return false; [EOL]     } [EOL]     if (!Arrays.equals(this.outlineStrokeSequence, that.outlineStrokeSequence)) { [EOL]         return false; [EOL]     } [EOL]     if (this.outlineStrokeIndex != that.outlineStrokeIndex) { [EOL]         return false; [EOL]     } [EOL]     if (!equalShapes(this.shapeSequence, that.shapeSequence)) { [EOL]         return false; [EOL]     } [EOL]     if (this.shapeIndex != that.shapeIndex) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 346,392
private boolean equalShapes(Shape[] s1, Shape[] s2) { [EOL]     if (s1 == null) { [EOL]         return s2 == null; [EOL]     } [EOL]     if (s2 == null) { [EOL]         return false; [EOL]     } [EOL]     if (s1.length != s2.length) { [EOL]         return false; [EOL]     } [EOL]     for (int i = 0; i < s1.length; i++) { [EOL]         if (!ShapeUtilities.equal(s1[i], s2[i])) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 402,418
private void writeObject(ObjectOutputStream stream) throws IOException { [EOL]     stream.defaultWriteObject(); [EOL]     int paintCount = this.paintSequence.length; [EOL]     stream.writeInt(paintCount); [EOL]     for (int i = 0; i < paintCount; i++) { [EOL]         SerialUtilities.writePaint(this.paintSequence[i], stream); [EOL]     } [EOL]     int outlinePaintCount = this.outlinePaintSequence.length; [EOL]     stream.writeInt(outlinePaintCount); [EOL]     for (int i = 0; i < outlinePaintCount; i++) { [EOL]         SerialUtilities.writePaint(this.outlinePaintSequence[i], stream); [EOL]     } [EOL]     int strokeCount = this.strokeSequence.length; [EOL]     stream.writeInt(strokeCount); [EOL]     for (int i = 0; i < strokeCount; i++) { [EOL]         SerialUtilities.writeStroke(this.strokeSequence[i], stream); [EOL]     } [EOL]     int outlineStrokeCount = this.outlineStrokeSequence.length; [EOL]     stream.writeInt(outlineStrokeCount); [EOL]     for (int i = 0; i < outlineStrokeCount; i++) { [EOL]         SerialUtilities.writeStroke(this.outlineStrokeSequence[i], stream); [EOL]     } [EOL]     int shapeCount = this.shapeSequence.length; [EOL]     stream.writeInt(shapeCount); [EOL]     for (int i = 0; i < shapeCount; i++) { [EOL]         SerialUtilities.writeShape(this.shapeSequence[i], stream); [EOL]     } [EOL] } <line_num>: 427,460
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException { [EOL]     stream.defaultReadObject(); [EOL]     int paintCount = stream.readInt(); [EOL]     this.paintSequence = new Paint[paintCount]; [EOL]     for (int i = 0; i < paintCount; i++) { [EOL]         this.paintSequence[i] = SerialUtilities.readPaint(stream); [EOL]     } [EOL]     int outlinePaintCount = stream.readInt(); [EOL]     this.outlinePaintSequence = new Paint[outlinePaintCount]; [EOL]     for (int i = 0; i < outlinePaintCount; i++) { [EOL]         this.outlinePaintSequence[i] = SerialUtilities.readPaint(stream); [EOL]     } [EOL]     int strokeCount = stream.readInt(); [EOL]     this.strokeSequence = new Stroke[strokeCount]; [EOL]     for (int i = 0; i < strokeCount; i++) { [EOL]         this.strokeSequence[i] = SerialUtilities.readStroke(stream); [EOL]     } [EOL]     int outlineStrokeCount = stream.readInt(); [EOL]     this.outlineStrokeSequence = new Stroke[outlineStrokeCount]; [EOL]     for (int i = 0; i < outlineStrokeCount; i++) { [EOL]         this.outlineStrokeSequence[i] = SerialUtilities.readStroke(stream); [EOL]     } [EOL]     int shapeCount = stream.readInt(); [EOL]     this.shapeSequence = new Shape[shapeCount]; [EOL]     for (int i = 0; i < shapeCount; i++) { [EOL]         this.shapeSequence[i] = SerialUtilities.readShape(stream); [EOL]     } [EOL] } <line_num>: 470,504
private static int[] intArray(double a, double b, double c) { [EOL]     return new int[] { (int) a, (int) b, (int) c }; [EOL] } <line_num>: 516,518
private static int[] intArray(double a, double b, double c, double d) { [EOL]     return new int[] { (int) a, (int) b, (int) c, (int) d }; [EOL] } <line_num>: 531,533
public Object clone() throws CloneNotSupportedException { [EOL]     DefaultDrawingSupplier clone = (DefaultDrawingSupplier) super.clone(); [EOL]     return clone; [EOL] } <line_num>: 543,546