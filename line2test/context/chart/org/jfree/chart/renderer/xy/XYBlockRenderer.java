public XYBlockRenderer()
public double getBlockWidth()
public void setBlockWidth(double width)
public double getBlockHeight()
public void setBlockHeight(double height)
public RectangleAnchor getBlockAnchor()
public void setBlockAnchor(RectangleAnchor anchor)
public PaintScale getPaintScale()
public void setPaintScale(PaintScale scale)
private void updateOffsets()
public Range findDomainBounds(XYDataset dataset)
public Range findRangeBounds(XYDataset dataset)
public void drawItem(Graphics2D g2, XYItemRendererState state, Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis, ValueAxis rangeAxis, XYDataset dataset, int series, int item, boolean selected, int pass)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
double blockWidth=Optional[1.0]
double blockHeight=Optional[1.0]
RectangleAnchor blockAnchor=Optional[RectangleAnchor.CENTER]
double xOffset
double yOffset
PaintScale paintScale
