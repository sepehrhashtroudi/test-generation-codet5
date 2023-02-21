public Crosshair() { [EOL]     this(0.0); [EOL] } <line_num>: 135,137
public Crosshair(double value) { [EOL]     this(value, Color.black, new BasicStroke(1.0f)); [EOL] } <line_num>: 144,146
public Crosshair(double value, Paint paint, Stroke stroke) { [EOL]     if (paint == null) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     if (stroke == null) { [EOL]         throw new IllegalArgumentException("Null 'stroke' argument."); [EOL]     } [EOL]     this.visible = true; [EOL]     this.value = value; [EOL]     this.paint = paint; [EOL]     this.stroke = stroke; [EOL]     this.labelVisible = false; [EOL]     this.labelGenerator = new StandardCrosshairLabelGenerator(); [EOL]     this.labelAnchor = RectangleAnchor.BOTTOM_LEFT; [EOL]     this.labelXOffset = 3.0; [EOL]     this.labelYOffset = 3.0; [EOL]     this.labelFont = new Font("Tahoma", Font.PLAIN, 12); [EOL]     this.labelPaint = Color.black; [EOL]     this.labelBackgroundPaint = new Color(0, 0, 255, 63); [EOL]     this.labelOutlineVisible = true; [EOL]     this.labelOutlinePaint = Color.black; [EOL]     this.labelOutlineStroke = new BasicStroke(0.5f); [EOL]     this.pcs = new PropertyChangeSupport(this); [EOL] } <line_num>: 155,178
public boolean isVisible() { [EOL]     return this.visible; [EOL] } <line_num>: 188,190
public void setVisible(boolean visible) { [EOL]     boolean old = this.visible; [EOL]     this.visible = visible; [EOL]     this.pcs.firePropertyChange("visible", old, visible); [EOL] } <line_num>: 201,205
public double getValue() { [EOL]     return this.value; [EOL] } <line_num>: 214,216
public void setValue(double value) { [EOL]     Double oldValue = new Double(this.value); [EOL]     this.value = value; [EOL]     this.pcs.firePropertyChange("value", oldValue, new Double(value)); [EOL] } <line_num>: 226,230
public Paint getPaint() { [EOL]     return this.paint; [EOL] } <line_num>: 239,241
public void setPaint(Paint paint) { [EOL]     Paint old = this.paint; [EOL]     this.paint = paint; [EOL]     this.pcs.firePropertyChange("paint", old, paint); [EOL] } <line_num>: 251,255
public Stroke getStroke() { [EOL]     return this.stroke; [EOL] } <line_num>: 264,266
public void setStroke(Stroke stroke) { [EOL]     Stroke old = this.stroke; [EOL]     this.stroke = stroke; [EOL]     this.pcs.firePropertyChange("stroke", old, stroke); [EOL] } <line_num>: 276,280
public boolean isLabelVisible() { [EOL]     return this.labelVisible; [EOL] } <line_num>: 290,292
public void setLabelVisible(boolean visible) { [EOL]     boolean old = this.labelVisible; [EOL]     this.labelVisible = visible; [EOL]     this.pcs.firePropertyChange("labelVisible", old, visible); [EOL] } <line_num>: 303,307
public CrosshairLabelGenerator getLabelGenerator() { [EOL]     return this.labelGenerator; [EOL] } <line_num>: 316,318
public void setLabelGenerator(CrosshairLabelGenerator generator) { [EOL]     if (generator == null) { [EOL]         throw new IllegalArgumentException("Null 'generator' argument."); [EOL]     } [EOL]     CrosshairLabelGenerator old = this.labelGenerator; [EOL]     this.labelGenerator = generator; [EOL]     this.pcs.firePropertyChange("labelGenerator", old, generator); [EOL] } <line_num>: 328,335
public RectangleAnchor getLabelAnchor() { [EOL]     return this.labelAnchor; [EOL] } <line_num>: 344,346
public void setLabelAnchor(RectangleAnchor anchor) { [EOL]     RectangleAnchor old = this.labelAnchor; [EOL]     this.labelAnchor = anchor; [EOL]     this.pcs.firePropertyChange("labelAnchor", old, anchor); [EOL] } <line_num>: 356,360
public double getLabelXOffset() { [EOL]     return this.labelXOffset; [EOL] } <line_num>: 369,371
public void setLabelXOffset(double offset) { [EOL]     Double old = new Double(this.labelXOffset); [EOL]     this.labelXOffset = offset; [EOL]     this.pcs.firePropertyChange("labelXOffset", old, new Double(offset)); [EOL] } <line_num>: 381,385
public double getLabelYOffset() { [EOL]     return this.labelYOffset; [EOL] } <line_num>: 394,396
public void setLabelYOffset(double offset) { [EOL]     Double old = new Double(this.labelYOffset); [EOL]     this.labelYOffset = offset; [EOL]     this.pcs.firePropertyChange("labelYOffset", old, new Double(offset)); [EOL] } <line_num>: 406,410
public Font getLabelFont() { [EOL]     return this.labelFont; [EOL] } <line_num>: 419,421
public void setLabelFont(Font font) { [EOL]     if (font == null) { [EOL]         throw new IllegalArgumentException("Null 'font' argument."); [EOL]     } [EOL]     Font old = this.labelFont; [EOL]     this.labelFont = font; [EOL]     this.pcs.firePropertyChange("labelFont", old, font); [EOL] } <line_num>: 431,438
public Paint getLabelPaint() { [EOL]     return this.labelPaint; [EOL] } <line_num>: 447,449
public void setLabelPaint(Paint paint) { [EOL]     if (paint == null) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     Paint old = this.labelPaint; [EOL]     this.labelPaint = paint; [EOL]     this.pcs.firePropertyChange("labelPaint", old, paint); [EOL] } <line_num>: 459,466
public Paint getLabelBackgroundPaint() { [EOL]     return this.labelBackgroundPaint; [EOL] } <line_num>: 475,477
public void setLabelBackgroundPaint(Paint paint) { [EOL]     Paint old = this.labelBackgroundPaint; [EOL]     this.labelBackgroundPaint = paint; [EOL]     this.pcs.firePropertyChange("labelBackgroundPaint", old, paint); [EOL] } <line_num>: 487,491
public boolean isLabelOutlineVisible() { [EOL]     return this.labelOutlineVisible; [EOL] } <line_num>: 500,502
public void setLabelOutlineVisible(boolean visible) { [EOL]     boolean old = this.labelOutlineVisible; [EOL]     this.labelOutlineVisible = visible; [EOL]     this.pcs.firePropertyChange("labelOutlineVisible", old, visible); [EOL] } <line_num>: 513,517
public Paint getLabelOutlinePaint() { [EOL]     return this.labelOutlinePaint; [EOL] } <line_num>: 526,528
public void setLabelOutlinePaint(Paint paint) { [EOL]     if (paint == null) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     Paint old = this.labelOutlinePaint; [EOL]     this.labelOutlinePaint = paint; [EOL]     this.pcs.firePropertyChange("labelOutlinePaint", old, paint); [EOL] } <line_num>: 538,545
public Stroke getLabelOutlineStroke() { [EOL]     return this.labelOutlineStroke; [EOL] } <line_num>: 554,556
public void setLabelOutlineStroke(Stroke stroke) { [EOL]     if (stroke == null) { [EOL]         throw new IllegalArgumentException("Null 'stroke' argument."); [EOL]     } [EOL]     Stroke old = this.labelOutlineStroke; [EOL]     this.labelOutlineStroke = stroke; [EOL]     this.pcs.firePropertyChange("labelOutlineStroke", old, stroke); [EOL] } <line_num>: 566,573
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof Crosshair)) { [EOL]         return false; [EOL]     } [EOL]     Crosshair that = (Crosshair) obj; [EOL]     if (this.visible != that.visible) { [EOL]         return false; [EOL]     } [EOL]     if (this.value != that.value) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.paint, that.paint)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.stroke.equals(that.stroke)) { [EOL]         return false; [EOL]     } [EOL]     if (this.labelVisible != that.labelVisible) { [EOL]         return false; [EOL]     } [EOL]     if (!this.labelGenerator.equals(that.labelGenerator)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.labelAnchor.equals(that.labelAnchor)) { [EOL]         return false; [EOL]     } [EOL]     if (this.labelXOffset != that.labelXOffset) { [EOL]         return false; [EOL]     } [EOL]     if (this.labelYOffset != that.labelYOffset) { [EOL]         return false; [EOL]     } [EOL]     if (!this.labelFont.equals(that.labelFont)) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.labelPaint, that.labelPaint)) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.labelBackgroundPaint, that.labelBackgroundPaint)) { [EOL]         return false; [EOL]     } [EOL]     if (this.labelOutlineVisible != that.labelOutlineVisible) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.labelOutlinePaint, that.labelOutlinePaint)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.labelOutlineStroke.equals(that.labelOutlineStroke)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 582,638
public int hashCode() { [EOL]     int hash = 7; [EOL]     hash = HashUtilities.hashCode(hash, this.visible); [EOL]     hash = HashUtilities.hashCode(hash, this.value); [EOL]     hash = HashUtilities.hashCode(hash, this.paint); [EOL]     hash = HashUtilities.hashCode(hash, this.stroke); [EOL]     hash = HashUtilities.hashCode(hash, this.labelVisible); [EOL]     hash = HashUtilities.hashCode(hash, this.labelAnchor); [EOL]     hash = HashUtilities.hashCode(hash, this.labelGenerator); [EOL]     hash = HashUtilities.hashCode(hash, this.labelXOffset); [EOL]     hash = HashUtilities.hashCode(hash, this.labelYOffset); [EOL]     hash = HashUtilities.hashCode(hash, this.labelFont); [EOL]     hash = HashUtilities.hashCode(hash, this.labelPaint); [EOL]     hash = HashUtilities.hashCode(hash, this.labelBackgroundPaint); [EOL]     hash = HashUtilities.hashCode(hash, this.labelOutlineVisible); [EOL]     hash = HashUtilities.hashCode(hash, this.labelOutlineStroke); [EOL]     hash = HashUtilities.hashCode(hash, this.labelOutlinePaint); [EOL]     return hash; [EOL] } <line_num>: 645,663
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 672,675
public void addPropertyChangeListener(PropertyChangeListener l) { [EOL]     this.pcs.addPropertyChangeListener(l); [EOL] } <line_num>: 684,686
public void removePropertyChangeListener(PropertyChangeListener l) { [EOL]     this.pcs.removePropertyChangeListener(l); [EOL] } <line_num>: 695,697
private void writeObject(ObjectOutputStream stream) throws IOException { [EOL]     stream.defaultWriteObject(); [EOL]     SerialUtilities.writePaint(this.paint, stream); [EOL]     SerialUtilities.writeStroke(this.stroke, stream); [EOL]     SerialUtilities.writePaint(this.labelPaint, stream); [EOL]     SerialUtilities.writePaint(this.labelBackgroundPaint, stream); [EOL]     SerialUtilities.writeStroke(this.labelOutlineStroke, stream); [EOL]     SerialUtilities.writePaint(this.labelOutlinePaint, stream); [EOL] } <line_num>: 706,714
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException { [EOL]     stream.defaultReadObject(); [EOL]     this.paint = SerialUtilities.readPaint(stream); [EOL]     this.stroke = SerialUtilities.readStroke(stream); [EOL]     this.labelPaint = SerialUtilities.readPaint(stream); [EOL]     this.labelBackgroundPaint = SerialUtilities.readPaint(stream); [EOL]     this.labelOutlineStroke = SerialUtilities.readStroke(stream); [EOL]     this.labelOutlinePaint = SerialUtilities.readPaint(stream); [EOL]     this.pcs = new PropertyChangeSupport(this); [EOL] } <line_num>: 724,734
