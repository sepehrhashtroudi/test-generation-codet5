public CompositeTitle() { [EOL]     this(new BlockContainer(new BorderArrangement())); [EOL] } <line_num>: 88,90
public CompositeTitle(BlockContainer container) { [EOL]     if (container == null) { [EOL]         throw new IllegalArgumentException("Null 'container' argument."); [EOL]     } [EOL]     this.container = container; [EOL]     this.backgroundPaint = null; [EOL] } <line_num>: 97,103
public Paint getBackgroundPaint() { [EOL]     return this.backgroundPaint; [EOL] } <line_num>: 112,114
public void setBackgroundPaint(Paint paint) { [EOL]     this.backgroundPaint = paint; [EOL]     notifyListeners(new TitleChangeEvent(this)); [EOL] } <line_num>: 125,128
public BlockContainer getContainer() { [EOL]     return this.container; [EOL] } <line_num>: 135,137
public void setTitleContainer(BlockContainer container) { [EOL]     if (container == null) { [EOL]         throw new IllegalArgumentException("Null 'container' argument."); [EOL]     } [EOL]     this.container = container; [EOL] } <line_num>: 144,149
public Size2D arrange(Graphics2D g2, RectangleConstraint constraint) { [EOL]     RectangleConstraint contentConstraint = toContentConstraint(constraint); [EOL]     Size2D contentSize = this.container.arrange(g2, contentConstraint); [EOL]     return new Size2D(calculateTotalWidth(contentSize.getWidth()), calculateTotalHeight(contentSize.getHeight())); [EOL] } <line_num>: 160,165
public void draw(Graphics2D g2, Rectangle2D area) { [EOL]     draw(g2, area, null); [EOL] } <line_num>: 174,176
public Object draw(Graphics2D g2, Rectangle2D area, Object params) { [EOL]     area = trimMargin(area); [EOL]     drawBorder(g2, area); [EOL]     area = trimBorder(area); [EOL]     if (this.backgroundPaint != null) { [EOL]         g2.setPaint(this.backgroundPaint); [EOL]         g2.fill(area); [EOL]     } [EOL]     area = trimPadding(area); [EOL]     return this.container.draw(g2, area, params); [EOL] } <line_num>: 187,197
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof CompositeTitle)) { [EOL]         return false; [EOL]     } [EOL]     CompositeTitle that = (CompositeTitle) obj; [EOL]     if (!this.container.equals(that.container)) { [EOL]         return false; [EOL]     } [EOL]     if (!PaintUtilities.equal(this.backgroundPaint, that.backgroundPaint)) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 206,221
private void writeObject(ObjectOutputStream stream) throws IOException { [EOL]     stream.defaultWriteObject(); [EOL]     SerialUtilities.writePaint(this.backgroundPaint, stream); [EOL] } <line_num>: 230,233
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException { [EOL]     stream.defaultReadObject(); [EOL]     this.backgroundPaint = SerialUtilities.readPaint(stream); [EOL] } <line_num>: 243,247
