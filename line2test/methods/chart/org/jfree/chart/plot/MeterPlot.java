public MeterPlot() { [EOL]     this(null); [EOL] } <line_num>: 230,232
public MeterPlot(ValueDataset dataset) { [EOL]     super(); [EOL]     this.shape = DialShape.CIRCLE; [EOL]     this.meterAngle = DEFAULT_METER_ANGLE; [EOL]     this.range = new Range(0.0, 100.0); [EOL]     this.tickSize = 10.0; [EOL]     this.tickPaint = Color.white; [EOL]     this.units = "Units"; [EOL]     this.needlePaint = MeterPlot.DEFAULT_NEEDLE_PAINT; [EOL]     this.tickLabelsVisible = true; [EOL]     this.tickLabelFont = MeterPlot.DEFAULT_LABEL_FONT; [EOL]     this.tickLabelPaint = Color.black; [EOL]     this.tickLabelFormat = NumberFormat.getInstance(); [EOL]     this.valueFont = MeterPlot.DEFAULT_VALUE_FONT; [EOL]     this.valuePaint = MeterPlot.DEFAULT_VALUE_PAINT; [EOL]     this.dialBackgroundPaint = MeterPlot.DEFAULT_DIAL_BACKGROUND_PAINT; [EOL]     this.intervals = new java.util.ArrayList(); [EOL]     setDataset(dataset); [EOL] } <line_num>: 239,257
public DialShape getDialShape() { [EOL]     return this.shape; [EOL] } <line_num>: 266,268
public void setDialShape(DialShape shape) { [EOL]     if (shape == null) { [EOL]         throw new IllegalArgumentException("Null 'shape' argument."); [EOL]     } [EOL]     this.shape = shape; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 278,284
public int getMeterAngle() { [EOL]     return this.meterAngle; [EOL] } <line_num>: 294,296
public void setMeterAngle(int angle) { [EOL]     if (angle < 1 || angle > 360) { [EOL]         throw new IllegalArgumentException("Invalid 'angle' (" + angle + ")"); [EOL]     } [EOL]     this.meterAngle = angle; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 306,313
public Range getRange() { [EOL]     return this.range; [EOL] } <line_num>: 322,324
public void setRange(Range range) { [EOL]     if (range == null) { [EOL]         throw new IllegalArgumentException("Null 'range' argument."); [EOL]     } [EOL]     if (!(range.getLength() > 0.0)) { [EOL]         throw new IllegalArgumentException("Range length must be positive."); [EOL]     } [EOL]     this.range = range; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 335,345
public double getTickSize() { [EOL]     return this.tickSize; [EOL] } <line_num>: 354,356
public void setTickSize(double size) { [EOL]     if (size <= 0) { [EOL]         throw new IllegalArgumentException("Requires 'size' > 0."); [EOL]     } [EOL]     this.tickSize = size; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 366,372
public Paint getTickPaint() { [EOL]     return this.tickPaint; [EOL] } <line_num>: 382,384
public void setTickPaint(Paint paint) { [EOL]     if (paint == null) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.tickPaint = paint; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 394,400
public String getUnits() { [EOL]     return this.units; [EOL] } <line_num>: 409,411
public void setUnits(String units) { [EOL]     this.units = units; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 421,424
public Paint getNeedlePaint() { [EOL]     return this.needlePaint; [EOL] } <line_num>: 433,435
public void setNeedlePaint(Paint paint) { [EOL]     if (paint == null) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.needlePaint = paint; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 445,451
public boolean getTickLabelsVisible() { [EOL]     return this.tickLabelsVisible; [EOL] } <line_num>: 460,462
public void setTickLabelsVisible(boolean visible) { [EOL]     if (this.tickLabelsVisible != visible) { [EOL]         this.tickLabelsVisible = visible; [EOL]         fireChangeEvent(); [EOL]     } [EOL] } <line_num>: 472,477
public Font getTickLabelFont() { [EOL]     return this.tickLabelFont; [EOL] } <line_num>: 486,488
public void setTickLabelFont(Font font) { [EOL]     if (font == null) { [EOL]         throw new IllegalArgumentException("Null 'font' argument."); [EOL]     } [EOL]     if (!this.tickLabelFont.equals(font)) { [EOL]         this.tickLabelFont = font; [EOL]         fireChangeEvent(); [EOL]     } [EOL] } <line_num>: 498,506
public Paint getTickLabelPaint() { [EOL]     return this.tickLabelPaint; [EOL] } <line_num>: 515,517
public void setTickLabelPaint(Paint paint) { [EOL]     if (paint == null) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     if (!this.tickLabelPaint.equals(paint)) { [EOL]         this.tickLabelPaint = paint; [EOL]         fireChangeEvent(); [EOL]     } [EOL] } <line_num>: 527,535
public NumberFormat getTickLabelFormat() { [EOL]     return this.tickLabelFormat; [EOL] } <line_num>: 544,546
public void setTickLabelFormat(NumberFormat format) { [EOL]     if (format == null) { [EOL]         throw new IllegalArgumentException("Null 'format' argument."); [EOL]     } [EOL]     this.tickLabelFormat = format; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 556,562
public Font getValueFont() { [EOL]     return this.valueFont; [EOL] } <line_num>: 571,573
public void setValueFont(Font font) { [EOL]     if (font == null) { [EOL]         throw new IllegalArgumentException("Null 'font' argument."); [EOL]     } [EOL]     this.valueFont = font; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 583,589
public Paint getValuePaint() { [EOL]     return this.valuePaint; [EOL] } <line_num>: 598,600
public void setValuePaint(Paint paint) { [EOL]     if (paint == null) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.valuePaint = paint; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 610,616
public Paint getDialBackgroundPaint() { [EOL]     return this.dialBackgroundPaint; [EOL] } <line_num>: 625,627
public void setDialBackgroundPaint(Paint paint) { [EOL]     this.dialBackgroundPaint = paint; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 637,640
public boolean getDrawBorder() { [EOL]     return this.drawBorder; [EOL] } <line_num>: 650,652
public void setDrawBorder(boolean draw) { [EOL]     this.drawBorder = draw; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 663,667
public Paint getDialOutlinePaint() { [EOL]     return this.dialOutlinePaint; [EOL] } <line_num>: 676,678
public void setDialOutlinePaint(Paint paint) { [EOL]     this.dialOutlinePaint = paint; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 688,691
public ValueDataset getDataset() { [EOL]     return this.dataset; [EOL] } <line_num>: 700,702
public void setDataset(ValueDataset dataset) { [EOL]     ValueDataset existing = this.dataset; [EOL]     if (existing != null) { [EOL]         existing.removeChangeListener(this); [EOL]     } [EOL]     this.dataset = dataset; [EOL]     if (dataset != null) { [EOL]         setDatasetGroup(dataset.getGroup()); [EOL]         dataset.addChangeListener(this); [EOL]     } [EOL]     DatasetChangeEvent event = new DatasetChangeEvent(this, dataset, new DatasetChangeInfo()); [EOL]     datasetChanged(event); [EOL] } <line_num>: 712,734
public List getIntervals() { [EOL]     return Collections.unmodifiableList(this.intervals); [EOL] } <line_num>: 743,745
public void addInterval(MeterInterval interval) { [EOL]     if (interval == null) { [EOL]         throw new IllegalArgumentException("Null 'interval' argument."); [EOL]     } [EOL]     this.intervals.add(interval); [EOL]     fireChangeEvent(); [EOL] } <line_num>: 756,762
public void clearIntervals() { [EOL]     this.intervals.clear(); [EOL]     fireChangeEvent(); [EOL] } <line_num>: 770,773
public LegendItemCollection getLegendItems() { [EOL]     LegendItemCollection result = new LegendItemCollection(); [EOL]     Iterator iterator = this.intervals.iterator(); [EOL]     while (iterator.hasNext()) { [EOL]         MeterInterval mi = (MeterInterval) iterator.next(); [EOL]         Paint color = mi.getBackgroundPaint(); [EOL]         if (color == null) { [EOL]             color = mi.getOutlinePaint(); [EOL]         } [EOL]         LegendItem item = new LegendItem(mi.getLabel(), mi.getLabel(), null, null, new Rectangle2D.Double(-4.0, -4.0, 8.0, 8.0), color); [EOL]         item.setDataset(getDataset()); [EOL]         result.add(item); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 780,796
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info) { [EOL]     if (info != null) { [EOL]         info.setPlotArea(area); [EOL]     } [EOL]     RectangleInsets insets = getInsets(); [EOL]     insets.trim(area); [EOL]     area.setRect(area.getX() + 4, area.getY() + 4, area.getWidth() - 8, area.getHeight() - 8); [EOL]     if (this.drawBorder) { [EOL]         drawBackground(g2, area); [EOL]     } [EOL]     double gapHorizontal = (2 * DEFAULT_BORDER_SIZE); [EOL]     double gapVertical = (2 * DEFAULT_BORDER_SIZE); [EOL]     double meterX = area.getX() + gapHorizontal / 2; [EOL]     double meterY = area.getY() + gapVertical / 2; [EOL]     double meterW = area.getWidth() - gapHorizontal; [EOL]     double meterH = area.getHeight() - gapVertical + ((this.meterAngle <= 180) && (this.shape != DialShape.CIRCLE) ? area.getHeight() / 1.25 : 0); [EOL]     double min = Math.min(meterW, meterH) / 2; [EOL]     meterX = (meterX + meterX + meterW) / 2 - min; [EOL]     meterY = (meterY + meterY + meterH) / 2 - min; [EOL]     meterW = 2 * min; [EOL]     meterH = 2 * min; [EOL]     Rectangle2D meterArea = new Rectangle2D.Double(meterX, meterY, meterW, meterH); [EOL]     Rectangle2D.Double originalArea = new Rectangle2D.Double(meterArea.getX() - 4, meterArea.getY() - 4, meterArea.getWidth() + 8, meterArea.getHeight() + 8); [EOL]     double meterMiddleX = meterArea.getCenterX(); [EOL]     double meterMiddleY = meterArea.getCenterY(); [EOL]     ValueDataset data = getDataset(); [EOL]     if (data != null) { [EOL]         double dataMin = this.range.getLowerBound(); [EOL]         double dataMax = this.range.getUpperBound(); [EOL]         Shape savedClip = g2.getClip(); [EOL]         g2.clip(originalArea); [EOL]         Composite originalComposite = g2.getComposite(); [EOL]         g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, getForegroundAlpha())); [EOL]         if (this.dialBackgroundPaint != null) { [EOL]             fillArc(g2, originalArea, dataMin, dataMax, this.dialBackgroundPaint, true); [EOL]         } [EOL]         drawTicks(g2, meterArea, dataMin, dataMax); [EOL]         drawArcForInterval(g2, meterArea, new MeterInterval("", this.range, this.dialOutlinePaint, new BasicStroke(1.0f), null)); [EOL]         Iterator iterator = this.intervals.iterator(); [EOL]         while (iterator.hasNext()) { [EOL]             MeterInterval interval = (MeterInterval) iterator.next(); [EOL]             drawArcForInterval(g2, meterArea, interval); [EOL]         } [EOL]         Number n = data.getValue(); [EOL]         if (n != null) { [EOL]             double value = n.doubleValue(); [EOL]             drawValueLabel(g2, meterArea); [EOL]             if (this.range.contains(value)) { [EOL]                 g2.setPaint(this.needlePaint); [EOL]                 g2.setStroke(new BasicStroke(2.0f)); [EOL]                 double radius = (meterArea.getWidth() / 2) + DEFAULT_BORDER_SIZE + 15; [EOL]                 double valueAngle = valueToAngle(value); [EOL]                 double valueP1 = meterMiddleX + (radius * Math.cos(Math.PI * (valueAngle / 180))); [EOL]                 double valueP2 = meterMiddleY - (radius * Math.sin(Math.PI * (valueAngle / 180))); [EOL]                 Polygon arrow = new Polygon(); [EOL]                 if ((valueAngle > 135 && valueAngle < 225) || (valueAngle < 45 && valueAngle > -45)) { [EOL]                     double valueP3 = (meterMiddleY - DEFAULT_CIRCLE_SIZE / 4); [EOL]                     double valueP4 = (meterMiddleY + DEFAULT_CIRCLE_SIZE / 4); [EOL]                     arrow.addPoint((int) meterMiddleX, (int) valueP3); [EOL]                     arrow.addPoint((int) meterMiddleX, (int) valueP4); [EOL]                 } else { [EOL]                     arrow.addPoint((int) (meterMiddleX - DEFAULT_CIRCLE_SIZE / 4), (int) meterMiddleY); [EOL]                     arrow.addPoint((int) (meterMiddleX + DEFAULT_CIRCLE_SIZE / 4), (int) meterMiddleY); [EOL]                 } [EOL]                 arrow.addPoint((int) valueP1, (int) valueP2); [EOL]                 g2.fill(arrow); [EOL]                 Ellipse2D circle = new Ellipse2D.Double(meterMiddleX - DEFAULT_CIRCLE_SIZE / 2, meterMiddleY - DEFAULT_CIRCLE_SIZE / 2, DEFAULT_CIRCLE_SIZE, DEFAULT_CIRCLE_SIZE); [EOL]                 g2.fill(circle); [EOL]             } [EOL]         } [EOL]         g2.setClip(savedClip); [EOL]         g2.setComposite(originalComposite); [EOL]     } [EOL]     if (this.drawBorder) { [EOL]         drawOutline(g2, area); [EOL]     } [EOL] } <line_num>: 808,934
protected void drawArcForInterval(Graphics2D g2, Rectangle2D meterArea, MeterInterval interval) { [EOL]     double minValue = interval.getRange().getLowerBound(); [EOL]     double maxValue = interval.getRange().getUpperBound(); [EOL]     Paint outlinePaint = interval.getOutlinePaint(); [EOL]     Stroke outlineStroke = interval.getOutlineStroke(); [EOL]     Paint backgroundPaint = interval.getBackgroundPaint(); [EOL]     if (backgroundPaint != null) { [EOL]         fillArc(g2, meterArea, minValue, maxValue, backgroundPaint, false); [EOL]     } [EOL]     if (outlinePaint != null) { [EOL]         if (outlineStroke != null) { [EOL]             drawArc(g2, meterArea, minValue, maxValue, outlinePaint, outlineStroke); [EOL]         } [EOL]         drawTick(g2, meterArea, minValue, true); [EOL]         drawTick(g2, meterArea, maxValue, true); [EOL]     } [EOL] } <line_num>: 943,963
protected void drawArc(Graphics2D g2, Rectangle2D area, double minValue, double maxValue, Paint paint, Stroke stroke) { [EOL]     double startAngle = valueToAngle(maxValue); [EOL]     double endAngle = valueToAngle(minValue); [EOL]     double extent = endAngle - startAngle; [EOL]     double x = area.getX(); [EOL]     double y = area.getY(); [EOL]     double w = area.getWidth(); [EOL]     double h = area.getHeight(); [EOL]     g2.setPaint(paint); [EOL]     g2.setStroke(stroke); [EOL]     if (paint != null && stroke != null) { [EOL]         Arc2D.Double arc = new Arc2D.Double(x, y, w, h, startAngle, extent, Arc2D.OPEN); [EOL]         g2.setPaint(paint); [EOL]         g2.setStroke(stroke); [EOL]         g2.draw(arc); [EOL]     } [EOL] } <line_num>: 975,997
protected void fillArc(Graphics2D g2, Rectangle2D area, double minValue, double maxValue, Paint paint, boolean dial) { [EOL]     if (paint == null) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument"); [EOL]     } [EOL]     double startAngle = valueToAngle(maxValue); [EOL]     double endAngle = valueToAngle(minValue); [EOL]     double extent = endAngle - startAngle; [EOL]     double x = area.getX(); [EOL]     double y = area.getY(); [EOL]     double w = area.getWidth(); [EOL]     double h = area.getHeight(); [EOL]     int joinType = Arc2D.OPEN; [EOL]     if (this.shape == DialShape.PIE) { [EOL]         joinType = Arc2D.PIE; [EOL]     } else if (this.shape == DialShape.CHORD) { [EOL]         if (dial && this.meterAngle > 180) { [EOL]             joinType = Arc2D.CHORD; [EOL]         } else { [EOL]             joinType = Arc2D.PIE; [EOL]         } [EOL]     } else if (this.shape == DialShape.CIRCLE) { [EOL]         joinType = Arc2D.PIE; [EOL]         if (dial) { [EOL]             extent = 360; [EOL]         } [EOL]     } else { [EOL]         throw new IllegalStateException("DialShape not recognised."); [EOL]     } [EOL]     g2.setPaint(paint); [EOL]     Arc2D.Double arc = new Arc2D.Double(x, y, w, h, startAngle, extent, joinType); [EOL]     g2.fill(arc); [EOL] } <line_num>: 1010,1050
public double valueToAngle(double value) { [EOL]     value = value - this.range.getLowerBound(); [EOL]     double baseAngle = 180 + ((this.meterAngle - 180) / 2); [EOL]     return baseAngle - ((value / this.range.getLength()) * this.meterAngle); [EOL] } <line_num>: 1059,1063
protected void drawTicks(Graphics2D g2, Rectangle2D meterArea, double minValue, double maxValue) { [EOL]     for (double v = minValue; v <= maxValue; v += this.tickSize) { [EOL]         drawTick(g2, meterArea, v); [EOL]     } [EOL] } <line_num>: 1073,1078
protected void drawTick(Graphics2D g2, Rectangle2D meterArea, double value) { [EOL]     drawTick(g2, meterArea, value, false); [EOL] } <line_num>: 1087,1090
protected void drawTick(Graphics2D g2, Rectangle2D meterArea, double value, boolean label) { [EOL]     double valueAngle = valueToAngle(value); [EOL]     double meterMiddleX = meterArea.getCenterX(); [EOL]     double meterMiddleY = meterArea.getCenterY(); [EOL]     g2.setPaint(this.tickPaint); [EOL]     g2.setStroke(new BasicStroke(2.0f)); [EOL]     double valueP2X = 0; [EOL]     double valueP2Y = 0; [EOL]     double radius = (meterArea.getWidth() / 2) + DEFAULT_BORDER_SIZE; [EOL]     double radius1 = radius - 15; [EOL]     double valueP1X = meterMiddleX + (radius * Math.cos(Math.PI * (valueAngle / 180))); [EOL]     double valueP1Y = meterMiddleY - (radius * Math.sin(Math.PI * (valueAngle / 180))); [EOL]     valueP2X = meterMiddleX + (radius1 * Math.cos(Math.PI * (valueAngle / 180))); [EOL]     valueP2Y = meterMiddleY - (radius1 * Math.sin(Math.PI * (valueAngle / 180))); [EOL]     Line2D.Double line = new Line2D.Double(valueP1X, valueP1Y, valueP2X, valueP2Y); [EOL]     g2.draw(line); [EOL]     if (this.tickLabelsVisible && label) { [EOL]         String tickLabel = this.tickLabelFormat.format(value); [EOL]         g2.setFont(this.tickLabelFont); [EOL]         g2.setPaint(this.tickLabelPaint); [EOL]         FontMetrics fm = g2.getFontMetrics(); [EOL]         Rectangle2D tickLabelBounds = TextUtilities.getTextBounds(tickLabel, g2, fm); [EOL]         double x = valueP2X; [EOL]         double y = valueP2Y; [EOL]         if (valueAngle == 90 || valueAngle == 270) { [EOL]             x = x - tickLabelBounds.getWidth() / 2; [EOL]         } else if (valueAngle < 90 || valueAngle > 270) { [EOL]             x = x - tickLabelBounds.getWidth(); [EOL]         } [EOL]         if ((valueAngle > 135 && valueAngle < 225) || valueAngle > 315 || valueAngle < 45) { [EOL]             y = y - tickLabelBounds.getHeight() / 2; [EOL]         } else { [EOL]             y = y + tickLabelBounds.getHeight() / 2; [EOL]         } [EOL]         g2.drawString(tickLabel, (float) x, (float) y); [EOL]     } [EOL] } <line_num>: 1100,1158
protected void drawValueLabel(Graphics2D g2, Rectangle2D area) { [EOL]     g2.setFont(this.valueFont); [EOL]     g2.setPaint(this.valuePaint); [EOL]     String valueStr = "No value"; [EOL]     if (this.dataset != null) { [EOL]         Number n = this.dataset.getValue(); [EOL]         if (n != null) { [EOL]             valueStr = this.tickLabelFormat.format(n.doubleValue()) + " " + this.units; [EOL]         } [EOL]     } [EOL]     float x = (float) area.getCenterX(); [EOL]     float y = (float) area.getCenterY() + DEFAULT_CIRCLE_SIZE; [EOL]     TextUtilities.drawAlignedString(valueStr, g2, x, y, TextAnchor.TOP_CENTER); [EOL] } <line_num>: 1166,1181
public String getPlotType() { [EOL]     return localizationResources.getString("Meter_Plot"); [EOL] } <line_num>: 1188,1190
public void zoom(double percent) { [EOL] } <line_num>: 1199,1201
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof MeterPlot)) { [EOL]         return false; [EOL]     } [EOL]     if (!super.equals(obj)) { [EOL]         return false; [EOL]     } [EOL]     MeterPlot that = (MeterPlot) obj; [EOL]     if (!ObjectUtilities.equal(this.units, that.units)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.range, that.range)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.intervals, that.intervals)) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.dialOutlinePaint, that.dialOutlinePaint)) { [EOL]         return false; [EOL]     } [EOL]     if (this.shape != that.shape) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.dialBackgroundPaint, that.dialBackgroundPaint)) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.needlePaint, that.needlePaint)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.valueFont, that.valueFont)) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.valuePaint, that.valuePaint)) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.tickPaint, that.tickPaint)) { [EOL]         return false; [EOL]     } [EOL]     if (this.tickSize != that.tickSize) { [EOL]         return false; [EOL]     } [EOL]     if (this.tickLabelsVisible != that.tickLabelsVisible) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.tickLabelFont, that.tickLabelFont)) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.tickLabelPaint, that.tickLabelPaint)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.tickLabelFormat, that.tickLabelFormat)) { [EOL]         return false; [EOL]     } [EOL]     if (this.drawBorder != that.drawBorder) { [EOL]         return false; [EOL]     } [EOL]     if (this.meterAngle != that.meterAngle) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 1211,1277
private void writeObject(ObjectOutputStream stream) throws IOException { [EOL]     stream.defaultWriteObject(); [EOL]     SerialUtilities.writePaint(this.dialBackgroundPaint, stream); [EOL]     SerialUtilities.writePaint(this.dialOutlinePaint, stream); [EOL]     SerialUtilities.writePaint(this.needlePaint, stream); [EOL]     SerialUtilities.writePaint(this.valuePaint, stream); [EOL]     SerialUtilities.writePaint(this.tickPaint, stream); [EOL]     SerialUtilities.writePaint(this.tickLabelPaint, stream); [EOL] } <line_num>: 1286,1294
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException { [EOL]     stream.defaultReadObject(); [EOL]     this.dialBackgroundPaint = SerialUtilities.readPaint(stream); [EOL]     this.dialOutlinePaint = SerialUtilities.readPaint(stream); [EOL]     this.needlePaint = SerialUtilities.readPaint(stream); [EOL]     this.valuePaint = SerialUtilities.readPaint(stream); [EOL]     this.tickPaint = SerialUtilities.readPaint(stream); [EOL]     this.tickLabelPaint = SerialUtilities.readPaint(stream); [EOL]     if (this.dataset != null) { [EOL]         this.dataset.addChangeListener(this); [EOL]     } [EOL] } <line_num>: 1304,1316
public Object clone() throws CloneNotSupportedException { [EOL]     MeterPlot clone = (MeterPlot) super.clone(); [EOL]     clone.tickLabelFormat = (NumberFormat) this.tickLabelFormat.clone(); [EOL]     clone.intervals = new java.util.ArrayList(this.intervals); [EOL]     if (clone.dataset != null) { [EOL]         clone.dataset.addChangeListener(clone); [EOL]     } [EOL]     return clone; [EOL] } <line_num>: 1328,1337
