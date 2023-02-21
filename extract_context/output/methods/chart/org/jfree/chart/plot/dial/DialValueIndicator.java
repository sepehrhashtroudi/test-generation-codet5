public DialValueIndicator() { [EOL]     this(0); [EOL] } <line_num>: 141,143
public DialValueIndicator(int datasetIndex) { [EOL]     this.datasetIndex = datasetIndex; [EOL]     this.angle = -90.0; [EOL]     this.radius = 0.3; [EOL]     this.frameAnchor = RectangleAnchor.CENTER; [EOL]     this.templateValue = new Double(100.0); [EOL]     this.maxTemplateValue = null; [EOL]     this.formatter = new DecimalFormat("0.0"); [EOL]     this.font = new Font("Tahoma", Font.BOLD, 14); [EOL]     this.paint = Color.black; [EOL]     this.backgroundPaint = Color.white; [EOL]     this.outlineStroke = new BasicStroke(1.0f); [EOL]     this.outlinePaint = Color.blue; [EOL]     this.insets = new RectangleInsets(4, 4, 4, 4); [EOL]     this.valueAnchor = RectangleAnchor.RIGHT; [EOL]     this.textAnchor = TextAnchor.CENTER_RIGHT; [EOL] } <line_num>: 150,166
public int getDatasetIndex() { [EOL]     return this.datasetIndex; [EOL] } <line_num>: 176,178
public void setDatasetIndex(int index) { [EOL]     this.datasetIndex = index; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 188,191
public double getAngle() { [EOL]     return this.angle; [EOL] } <line_num>: 201,203
public void setAngle(double angle) { [EOL]     this.angle = angle; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 213,216
public double getRadius() { [EOL]     return this.radius; [EOL] } <line_num>: 225,227
public void setRadius(double radius) { [EOL]     this.radius = radius; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 237,240
public RectangleAnchor getFrameAnchor() { [EOL]     return this.frameAnchor; [EOL] } <line_num>: 249,251
public void setFrameAnchor(RectangleAnchor anchor) { [EOL]     if (anchor == null) { [EOL]         throw new IllegalArgumentException("Null 'anchor' argument."); [EOL]     } [EOL]     this.frameAnchor = anchor; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 261,267
public Number getTemplateValue() { [EOL]     return this.templateValue; [EOL] } <line_num>: 276,278
public void setTemplateValue(Number value) { [EOL]     if (value == null) { [EOL]         throw new IllegalArgumentException("Null 'value' argument."); [EOL]     } [EOL]     this.templateValue = value; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 288,294
public Number getMaxTemplateValue() { [EOL]     return this.maxTemplateValue; [EOL] } <line_num>: 306,308
public void setMaxTemplateValue(Number value) { [EOL]     this.maxTemplateValue = value; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 320,323
public NumberFormat getNumberFormat() { [EOL]     return this.formatter; [EOL] } <line_num>: 332,334
public void setNumberFormat(NumberFormat formatter) { [EOL]     if (formatter == null) { [EOL]         throw new IllegalArgumentException("Null 'formatter' argument."); [EOL]     } [EOL]     this.formatter = formatter; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 344,350
public Font getFont() { [EOL]     return this.font; [EOL] } <line_num>: 359,361
public void setFont(Font font) { [EOL]     if (font == null) { [EOL]         throw new IllegalArgumentException("Null 'font' argument."); [EOL]     } [EOL]     this.font = font; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 369,375
public Paint getPaint() { [EOL]     return this.paint; [EOL] } <line_num>: 384,386
public void setPaint(Paint paint) { [EOL]     if (paint == null) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.paint = paint; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 396,402
public Paint getBackgroundPaint() { [EOL]     return this.backgroundPaint; [EOL] } <line_num>: 411,413
public void setBackgroundPaint(Paint paint) { [EOL]     if (paint == null) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.backgroundPaint = paint; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 423,429
public Stroke getOutlineStroke() { [EOL]     return this.outlineStroke; [EOL] } <line_num>: 438,440
public void setOutlineStroke(Stroke stroke) { [EOL]     if (stroke == null) { [EOL]         throw new IllegalArgumentException("Null 'stroke' argument."); [EOL]     } [EOL]     this.outlineStroke = stroke; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 450,456
public Paint getOutlinePaint() { [EOL]     return this.outlinePaint; [EOL] } <line_num>: 465,467
public void setOutlinePaint(Paint paint) { [EOL]     if (paint == null) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.outlinePaint = paint; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 477,483
public RectangleInsets getInsets() { [EOL]     return this.insets; [EOL] } <line_num>: 492,494
public void setInsets(RectangleInsets insets) { [EOL]     if (insets == null) { [EOL]         throw new IllegalArgumentException("Null 'insets' argument."); [EOL]     } [EOL]     this.insets = insets; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 504,510
public RectangleAnchor getValueAnchor() { [EOL]     return this.valueAnchor; [EOL] } <line_num>: 519,521
public void setValueAnchor(RectangleAnchor anchor) { [EOL]     if (anchor == null) { [EOL]         throw new IllegalArgumentException("Null 'anchor' argument."); [EOL]     } [EOL]     this.valueAnchor = anchor; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 531,537
public TextAnchor getTextAnchor() { [EOL]     return this.textAnchor; [EOL] } <line_num>: 546,548
public void setTextAnchor(TextAnchor anchor) { [EOL]     if (anchor == null) { [EOL]         throw new IllegalArgumentException("Null 'anchor' argument."); [EOL]     } [EOL]     this.textAnchor = anchor; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 558,564
public boolean isClippedToWindow() { [EOL]     return true; [EOL] } <line_num>: 572,574
public void draw(Graphics2D g2, DialPlot plot, Rectangle2D frame, Rectangle2D view) { [EOL]     Rectangle2D f = DialPlot.rectangleByRadius(frame, this.radius, this.radius); [EOL]     Arc2D arc = new Arc2D.Double(f, this.angle, 0.0, Arc2D.OPEN); [EOL]     Point2D pt = arc.getStartPoint(); [EOL]     FontMetrics fm = g2.getFontMetrics(this.font); [EOL]     double value = plot.getValue(this.datasetIndex); [EOL]     String valueStr = this.formatter.format(value); [EOL]     Rectangle2D valueBounds = TextUtilities.getTextBounds(valueStr, g2, fm); [EOL]     String s = this.formatter.format(this.templateValue); [EOL]     Rectangle2D tb = TextUtilities.getTextBounds(s, g2, fm); [EOL]     double minW = tb.getWidth(); [EOL]     double minH = tb.getHeight(); [EOL]     double maxW = Double.MAX_VALUE; [EOL]     double maxH = Double.MAX_VALUE; [EOL]     if (this.maxTemplateValue != null) { [EOL]         s = this.formatter.format(this.maxTemplateValue); [EOL]         tb = TextUtilities.getTextBounds(s, g2, fm); [EOL]         maxW = Math.max(tb.getWidth(), minW); [EOL]         maxH = Math.max(tb.getHeight(), minH); [EOL]     } [EOL]     double w = fixToRange(valueBounds.getWidth(), minW, maxW); [EOL]     double h = fixToRange(valueBounds.getHeight(), minH, maxH); [EOL]     Rectangle2D bounds = RectangleAnchor.createRectangle(new Size2D(w, h), pt.getX(), pt.getY(), this.frameAnchor); [EOL]     Rectangle2D fb = this.insets.createOutsetRectangle(bounds); [EOL]     g2.setPaint(this.backgroundPaint); [EOL]     g2.fill(fb); [EOL]     g2.setStroke(this.outlineStroke); [EOL]     g2.setPaint(this.outlinePaint); [EOL]     g2.draw(fb); [EOL]     Shape savedClip = g2.getClip(); [EOL]     g2.clip(fb); [EOL]     Point2D pt2 = RectangleAnchor.coordinates(bounds, this.valueAnchor); [EOL]     g2.setPaint(this.paint); [EOL]     g2.setFont(this.font); [EOL]     TextUtilities.drawAlignedString(valueStr, g2, (float) pt2.getX(), (float) pt2.getY(), this.textAnchor); [EOL]     g2.setClip(savedClip); [EOL] } <line_num>: 586,647
private double fixToRange(double x, double minX, double maxX) { [EOL]     if (minX > maxX) { [EOL]         throw new IllegalArgumentException("Requires 'minX' <= 'maxX'."); [EOL]     } [EOL]     if (x < minX) { [EOL]         return minX; [EOL]     } else if (x > maxX) { [EOL]         return maxX; [EOL]     } else { [EOL]         return x; [EOL]     } [EOL] } <line_num>: 659,672
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof DialValueIndicator)) { [EOL]         return false; [EOL]     } [EOL]     DialValueIndicator that = (DialValueIndicator) obj; [EOL]     if (this.datasetIndex != that.datasetIndex) { [EOL]         return false; [EOL]     } [EOL]     if (this.angle != that.angle) { [EOL]         return false; [EOL]     } [EOL]     if (this.radius != that.radius) { [EOL]         return false; [EOL]     } [EOL]     if (!this.frameAnchor.equals(that.frameAnchor)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.templateValue.equals(that.templateValue)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.maxTemplateValue, that.maxTemplateValue)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.font.equals(that.font)) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.paint, that.paint)) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.backgroundPaint, that.backgroundPaint)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.outlineStroke.equals(that.outlineStroke)) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.outlinePaint, that.outlinePaint)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.insets.equals(that.insets)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.valueAnchor.equals(that.valueAnchor)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.textAnchor.equals(that.textAnchor)) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 681,733
public int hashCode() { [EOL]     int result = 193; [EOL]     result = 37 * result + HashUtilities.hashCodeForPaint(this.paint); [EOL]     result = 37 * result + HashUtilities.hashCodeForPaint(this.backgroundPaint); [EOL]     result = 37 * result + HashUtilities.hashCodeForPaint(this.outlinePaint); [EOL]     result = 37 * result + this.outlineStroke.hashCode(); [EOL]     return result; [EOL] } <line_num>: 740,749
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 759,761
private void writeObject(ObjectOutputStream stream) throws IOException { [EOL]     stream.defaultWriteObject(); [EOL]     SerialUtilities.writePaint(this.paint, stream); [EOL]     SerialUtilities.writePaint(this.backgroundPaint, stream); [EOL]     SerialUtilities.writePaint(this.outlinePaint, stream); [EOL]     SerialUtilities.writeStroke(this.outlineStroke, stream); [EOL] } <line_num>: 770,776
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException { [EOL]     stream.defaultReadObject(); [EOL]     this.paint = SerialUtilities.readPaint(stream); [EOL]     this.backgroundPaint = SerialUtilities.readPaint(stream); [EOL]     this.outlinePaint = SerialUtilities.readPaint(stream); [EOL]     this.outlineStroke = SerialUtilities.readStroke(stream); [EOL] } <line_num>: 786,793