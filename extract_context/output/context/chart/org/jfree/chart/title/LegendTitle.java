public LegendTitle(LegendItemSource source)
public LegendTitle(LegendItemSource source, Arrangement hLayout, Arrangement vLayout)
public LegendItemSource[] getSources()
public void setSources(LegendItemSource[] sources)
public Paint getBackgroundPaint()
public void setBackgroundPaint(Paint paint)
public RectangleEdge getLegendItemGraphicEdge()
public void setLegendItemGraphicEdge(RectangleEdge edge)
public RectangleAnchor getLegendItemGraphicAnchor()
public void setLegendItemGraphicAnchor(RectangleAnchor anchor)
public RectangleAnchor getLegendItemGraphicLocation()
public void setLegendItemGraphicLocation(RectangleAnchor anchor)
public RectangleInsets getLegendItemGraphicPadding()
public void setLegendItemGraphicPadding(RectangleInsets padding)
public Font getItemFont()
public void setItemFont(Font font)
public Paint getItemPaint()
public void setItemPaint(Paint paint)
public RectangleInsets getItemLabelPadding()
public void setItemLabelPadding(RectangleInsets padding)
protected void fetchLegendItems()
protected Block createLegendItemBlock(LegendItem item)
public BlockContainer getItemContainer()
public Size2D arrange(Graphics2D g2, RectangleConstraint constraint)
public void draw(Graphics2D g2, Rectangle2D area)
public Object draw(Graphics2D g2, Rectangle2D area, Object params)
public BlockContainer getWrapper()
public void setWrapper(BlockContainer wrapper)
public boolean equals(Object obj)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[2644010518533854633L]
Font DEFAULT_ITEM_FONT=Optional[new Font("Tahoma", Font.PLAIN, 12)]
Paint DEFAULT_ITEM_PAINT=Optional[Color.black]
LegendItemSource[] sources
Paint backgroundPaint
RectangleEdge legendItemGraphicEdge
RectangleAnchor legendItemGraphicAnchor
RectangleAnchor legendItemGraphicLocation
RectangleInsets legendItemGraphicPadding
Font itemFont
Paint itemPaint
RectangleInsets itemLabelPadding
BlockContainer items
Arrangement hLayout
Arrangement vLayout
BlockContainer wrapper
