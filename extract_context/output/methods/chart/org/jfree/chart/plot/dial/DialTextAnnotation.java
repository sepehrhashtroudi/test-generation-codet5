public DialTextAnnotation(String label) { [EOL]     if (label == null) { [EOL]         throw new IllegalArgumentException("Null 'label' argument."); [EOL]     } [EOL]     this.angle = -90.0; [EOL]     this.radius = 0.3; [EOL]     this.font = new Font("Tahoma", Font.BOLD, 14); [EOL]     this.paint = Color.black; [EOL]     this.label = label; [EOL]     this.anchor = TextAnchor.TOP_CENTER; [EOL] } <line_num>: 103,113
public String getLabel() { [EOL]     return this.label; [EOL] } <line_num>: 122,124
public void setLabel(String label) { [EOL]     if (label == null) { [EOL]         throw new IllegalArgumentException("Null 'label' argument."); [EOL]     } [EOL]     this.label = label; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 134,140
public Font getFont() { [EOL]     return this.font; [EOL] } <line_num>: 149,151
public void setFont(Font font) { [EOL]     if (font == null) { [EOL]         throw new IllegalArgumentException("Null 'font' argument."); [EOL]     } [EOL]     this.font = font; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 161,167
public Paint getPaint() { [EOL]     return this.paint; [EOL] } <line_num>: 176,178
public void setPaint(Paint paint) { [EOL]     if (paint == null) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.paint = paint; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 188,194
public double getAngle() { [EOL]     return this.angle; [EOL] } <line_num>: 204,206
public void setAngle(double angle) { [EOL]     this.angle = angle; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 217,220
public double getRadius() { [EOL]     return this.radius; [EOL] } <line_num>: 231,233
public void setRadius(double radius) { [EOL]     if (radius < 0.0) { [EOL]         throw new IllegalArgumentException("The 'radius' cannot be negative."); [EOL]     } [EOL]     this.radius = radius; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 245,252
public TextAnchor getAnchor() { [EOL]     return this.anchor; [EOL] } <line_num>: 262,264
public void setAnchor(TextAnchor anchor) { [EOL]     if (anchor == null) { [EOL]         throw new IllegalArgumentException("Null 'anchor' argument."); [EOL]     } [EOL]     this.anchor = anchor; [EOL]     notifyListeners(new DialLayerChangeEvent(this)); [EOL] } <line_num>: 274,280
public boolean isClippedToWindow() { [EOL]     return true; [EOL] } <line_num>: 288,290
public void draw(Graphics2D g2, DialPlot plot, Rectangle2D frame, Rectangle2D view) { [EOL]     Rectangle2D f = DialPlot.rectangleByRadius(frame, this.radius, this.radius); [EOL]     Arc2D arc = new Arc2D.Double(f, this.angle, 0.0, Arc2D.OPEN); [EOL]     Point2D pt = arc.getStartPoint(); [EOL]     g2.setPaint(this.paint); [EOL]     g2.setFont(this.font); [EOL]     TextUtilities.drawAlignedString(this.label, g2, (float) pt.getX(), (float) pt.getY(), this.anchor); [EOL] } <line_num>: 302,315
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof DialTextAnnotation)) { [EOL]         return false; [EOL]     } [EOL]     DialTextAnnotation that = (DialTextAnnotation) obj; [EOL]     if (!this.label.equals(that.label)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.font.equals(that.font)) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.paint, that.paint)) { [EOL]         return false; [EOL]     } [EOL]     if (this.radius != that.radius) { [EOL]         return false; [EOL]     } [EOL]     if (this.angle != that.angle) { [EOL]         return false; [EOL]     } [EOL]     if (!this.anchor.equals(that.anchor)) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 324,351
public int hashCode() { [EOL]     int result = 193; [EOL]     result = 37 * result + HashUtilities.hashCodeForPaint(this.paint); [EOL]     result = 37 * result + this.font.hashCode(); [EOL]     result = 37 * result + this.label.hashCode(); [EOL]     result = 37 * result + this.anchor.hashCode(); [EOL]     long temp = Double.doubleToLongBits(this.angle); [EOL]     result = 37 * result + (int) (temp ^ (temp >>> 32)); [EOL]     temp = Double.doubleToLongBits(this.radius); [EOL]     result = 37 * result + (int) (temp ^ (temp >>> 32)); [EOL]     return result; [EOL] } <line_num>: 358,369
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 379,381
private void writeObject(ObjectOutputStream stream) throws IOException { [EOL]     stream.defaultWriteObject(); [EOL]     SerialUtilities.writePaint(this.paint, stream); [EOL] } <line_num>: 390,393
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException { [EOL]     stream.defaultReadObject(); [EOL]     this.paint = SerialUtilities.readPaint(stream); [EOL] } <line_num>: 403,407
