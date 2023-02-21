public LegendTitle(LegendItemSource source) { [EOL]     this(source, new FlowArrangement(), new ColumnArrangement()); [EOL] } <line_num>: 176,178
public LegendTitle(LegendItemSource source, Arrangement hLayout, Arrangement vLayout) { [EOL]     this.sources = new LegendItemSource[] { source }; [EOL]     this.items = new BlockContainer(hLayout); [EOL]     this.hLayout = hLayout; [EOL]     this.vLayout = vLayout; [EOL]     this.backgroundPaint = null; [EOL]     this.legendItemGraphicEdge = RectangleEdge.LEFT; [EOL]     this.legendItemGraphicAnchor = RectangleAnchor.CENTER; [EOL]     this.legendItemGraphicLocation = RectangleAnchor.CENTER; [EOL]     this.legendItemGraphicPadding = new RectangleInsets(2.0, 2.0, 2.0, 2.0); [EOL]     this.itemFont = DEFAULT_ITEM_FONT; [EOL]     this.itemPaint = DEFAULT_ITEM_PAINT; [EOL]     this.itemLabelPadding = new RectangleInsets(2.0, 2.0, 2.0, 2.0); [EOL] } <line_num>: 189,203
public LegendItemSource[] getSources() { [EOL]     return this.sources; [EOL] } <line_num>: 210,212
public void setSources(LegendItemSource[] sources) { [EOL]     if (sources == null) { [EOL]         throw new IllegalArgumentException("Null 'sources' argument."); [EOL]     } [EOL]     this.sources = sources; [EOL]     notifyListeners(new TitleChangeEvent(this)); [EOL] } <line_num>: 220,226
public Paint getBackgroundPaint() { [EOL]     return this.backgroundPaint; [EOL] } <line_num>: 233,235
public void setBackgroundPaint(Paint paint) { [EOL]     this.backgroundPaint = paint; [EOL]     notifyListeners(new TitleChangeEvent(this)); [EOL] } <line_num>: 243,246
public RectangleEdge getLegendItemGraphicEdge() { [EOL]     return this.legendItemGraphicEdge; [EOL] } <line_num>: 253,255
public void setLegendItemGraphicEdge(RectangleEdge edge) { [EOL]     if (edge == null) { [EOL]         throw new IllegalArgumentException("Null 'edge' argument."); [EOL]     } [EOL]     this.legendItemGraphicEdge = edge; [EOL]     notifyListeners(new TitleChangeEvent(this)); [EOL] } <line_num>: 262,268
public RectangleAnchor getLegendItemGraphicAnchor() { [EOL]     return this.legendItemGraphicAnchor; [EOL] } <line_num>: 275,277
public void setLegendItemGraphicAnchor(RectangleAnchor anchor) { [EOL]     if (anchor == null) { [EOL]         throw new IllegalArgumentException("Null 'anchor' point."); [EOL]     } [EOL]     this.legendItemGraphicAnchor = anchor; [EOL] } <line_num>: 284,289
public RectangleAnchor getLegendItemGraphicLocation() { [EOL]     return this.legendItemGraphicLocation; [EOL] } <line_num>: 296,298
public void setLegendItemGraphicLocation(RectangleAnchor anchor) { [EOL]     this.legendItemGraphicLocation = anchor; [EOL] } <line_num>: 305,307
public RectangleInsets getLegendItemGraphicPadding() { [EOL]     return this.legendItemGraphicPadding; [EOL] } <line_num>: 314,316
public void setLegendItemGraphicPadding(RectangleInsets padding) { [EOL]     if (padding == null) { [EOL]         throw new IllegalArgumentException("Null 'padding' argument."); [EOL]     } [EOL]     this.legendItemGraphicPadding = padding; [EOL]     notifyListeners(new TitleChangeEvent(this)); [EOL] } <line_num>: 324,330
public Font getItemFont() { [EOL]     return this.itemFont; [EOL] } <line_num>: 337,339
public void setItemFont(Font font) { [EOL]     if (font == null) { [EOL]         throw new IllegalArgumentException("Null 'font' argument."); [EOL]     } [EOL]     this.itemFont = font; [EOL]     notifyListeners(new TitleChangeEvent(this)); [EOL] } <line_num>: 347,353
public Paint getItemPaint() { [EOL]     return this.itemPaint; [EOL] } <line_num>: 360,362
public void setItemPaint(Paint paint) { [EOL]     if (paint == null) { [EOL]         throw new IllegalArgumentException("Null 'paint' argument."); [EOL]     } [EOL]     this.itemPaint = paint; [EOL]     notifyListeners(new TitleChangeEvent(this)); [EOL] } <line_num>: 369,375
public RectangleInsets getItemLabelPadding() { [EOL]     return this.itemLabelPadding; [EOL] } <line_num>: 382,384
public void setItemLabelPadding(RectangleInsets padding) { [EOL]     if (padding == null) { [EOL]         throw new IllegalArgumentException("Null 'padding' argument."); [EOL]     } [EOL]     this.itemLabelPadding = padding; [EOL]     notifyListeners(new TitleChangeEvent(this)); [EOL] } <line_num>: 391,397
protected void fetchLegendItems() { [EOL]     this.items.clear(); [EOL]     RectangleEdge p = getPosition(); [EOL]     if (RectangleEdge.isTopOrBottom(p)) { [EOL]         this.items.setArrangement(this.hLayout); [EOL]     } else { [EOL]         this.items.setArrangement(this.vLayout); [EOL]     } [EOL]     for (int s = 0; s < this.sources.length; s++) { [EOL]         LegendItemCollection legendItems = this.sources[s].getLegendItems(); [EOL]         if (legendItems != null) { [EOL]             for (int i = 0; i < legendItems.getItemCount(); i++) { [EOL]                 LegendItem item = legendItems.get(i); [EOL]                 Block block = createLegendItemBlock(item); [EOL]                 this.items.add(block); [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 402,421
protected Block createLegendItemBlock(LegendItem item) { [EOL]     BlockContainer result = null; [EOL]     LegendGraphic lg = new LegendGraphic(item.getShape(), item.getFillPaint()); [EOL]     lg.setFillPaintTransformer(item.getFillPaintTransformer()); [EOL]     lg.setShapeFilled(item.isShapeFilled()); [EOL]     lg.setLine(item.getLine()); [EOL]     lg.setLineStroke(item.getLineStroke()); [EOL]     lg.setLinePaint(item.getLinePaint()); [EOL]     lg.setLineVisible(item.isLineVisible()); [EOL]     lg.setShapeVisible(item.isShapeVisible()); [EOL]     lg.setShapeOutlineVisible(item.isShapeOutlineVisible()); [EOL]     lg.setOutlinePaint(item.getOutlinePaint()); [EOL]     lg.setOutlineStroke(item.getOutlineStroke()); [EOL]     lg.setPadding(this.legendItemGraphicPadding); [EOL]     LegendItemBlockContainer legendItem = new LegendItemBlockContainer(new BorderArrangement(), item.getDataset(), item.getSeriesKey()); [EOL]     lg.setShapeAnchor(getLegendItemGraphicAnchor()); [EOL]     lg.setShapeLocation(getLegendItemGraphicLocation()); [EOL]     legendItem.add(lg, this.legendItemGraphicEdge); [EOL]     Font textFont = item.getLabelFont(); [EOL]     if (textFont == null) { [EOL]         textFont = this.itemFont; [EOL]     } [EOL]     Paint textPaint = item.getLabelPaint(); [EOL]     if (textPaint == null) { [EOL]         textPaint = this.itemPaint; [EOL]     } [EOL]     LabelBlock labelBlock = new LabelBlock(item.getLabel(), textFont, textPaint); [EOL]     labelBlock.setPadding(this.itemLabelPadding); [EOL]     legendItem.add(labelBlock); [EOL]     legendItem.setToolTipText(item.getToolTipText()); [EOL]     legendItem.setURLText(item.getURLText()); [EOL]     result = new BlockContainer(new CenterArrangement()); [EOL]     result.add(legendItem); [EOL]     return result; [EOL] } <line_num>: 430,471
public BlockContainer getItemContainer() { [EOL]     return this.items; [EOL] } <line_num>: 478,480
public Size2D arrange(Graphics2D g2, RectangleConstraint constraint) { [EOL]     Size2D result = new Size2D(); [EOL]     fetchLegendItems(); [EOL]     if (this.items.isEmpty()) { [EOL]         return result; [EOL]     } [EOL]     BlockContainer container = this.wrapper; [EOL]     if (container == null) { [EOL]         container = this.items; [EOL]     } [EOL]     RectangleConstraint c = toContentConstraint(constraint); [EOL]     Size2D size = container.arrange(g2, c); [EOL]     result.height = calculateTotalHeight(size.height); [EOL]     result.width = calculateTotalWidth(size.width); [EOL]     return result; [EOL] } <line_num>: 491,506
public void draw(Graphics2D g2, Rectangle2D area) { [EOL]     draw(g2, area, null); [EOL] } <line_num>: 515,517
public Object draw(Graphics2D g2, Rectangle2D area, Object params) { [EOL]     Rectangle2D target = (Rectangle2D) area.clone(); [EOL]     Rectangle2D hotspot = (Rectangle2D) area.clone(); [EOL]     StandardEntityCollection sec = null; [EOL]     if (params instanceof EntityBlockParams && ((EntityBlockParams) params).getGenerateEntities()) { [EOL]         sec = new StandardEntityCollection(); [EOL]         sec.add(new TitleEntity(hotspot, this)); [EOL]     } [EOL]     target = trimMargin(target); [EOL]     if (this.backgroundPaint != null) { [EOL]         g2.setPaint(this.backgroundPaint); [EOL]         g2.fill(target); [EOL]     } [EOL]     BlockFrame border = getFrame(); [EOL]     border.draw(g2, target); [EOL]     border.getInsets().trim(target); [EOL]     BlockContainer container = this.wrapper; [EOL]     if (container == null) { [EOL]         container = this.items; [EOL]     } [EOL]     target = trimPadding(target); [EOL]     Object val = container.draw(g2, target, params); [EOL]     if (val instanceof BlockResult) { [EOL]         EntityCollection ec = ((BlockResult) val).getEntityCollection(); [EOL]         if (ec != null && sec != null) { [EOL]             sec.addAll(ec); [EOL]             ((BlockResult) val).setEntityCollection(sec); [EOL]         } [EOL]     } [EOL]     return val; [EOL] } <line_num>: 529,560
public BlockContainer getWrapper() { [EOL]     return this.wrapper; [EOL] } <line_num>: 569,571
public void setWrapper(BlockContainer wrapper) { [EOL]     this.wrapper = wrapper; [EOL] } <line_num>: 578,580
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof LegendTitle)) { [EOL]         return false; [EOL]     } [EOL]     if (!super.equals(obj)) { [EOL]         return false; [EOL]     } [EOL]     LegendTitle that = (LegendTitle) obj; [EOL]     if (!PaintUtilities.equal(this.backgroundPaint, that.backgroundPaint)) { [EOL]         return false; [EOL]     } [EOL]     if (this.legendItemGraphicEdge != that.legendItemGraphicEdge) { [EOL]         return false; [EOL]     } [EOL]     if (this.legendItemGraphicAnchor != that.legendItemGraphicAnchor) { [EOL]         return false; [EOL]     } [EOL]     if (this.legendItemGraphicLocation != that.legendItemGraphicLocation) { [EOL]         return false; [EOL]     } [EOL]     if (!this.itemFont.equals(that.itemFont)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.itemPaint.equals(that.itemPaint)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.hLayout.equals(that.hLayout)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.vLayout.equals(that.vLayout)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 589,625
private void writeObject(ObjectOutputStream stream) throws IOException { [EOL]     stream.defaultWriteObject(); [EOL]     SerialUtilities.writePaint(this.backgroundPaint, stream); [EOL]     SerialUtilities.writePaint(this.itemPaint, stream); [EOL] } <line_num>: 634,638
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException { [EOL]     stream.defaultReadObject(); [EOL]     this.backgroundPaint = SerialUtilities.readPaint(stream); [EOL]     this.itemPaint = SerialUtilities.readPaint(stream); [EOL] } <line_num>: 648,653
