public XYBoxAndWhiskerRenderer()
public XYBoxAndWhiskerRenderer(double boxWidth)
public double getBoxWidth()
public void setBoxWidth(double width)
public Paint getBoxPaint()
public void setBoxPaint(Paint paint)
public boolean getFillBox()
public void setFillBox(boolean flag)
public Paint getArtifactPaint()
public void setArtifactPaint(Paint paint)
public Range findRangeBounds(XYDataset dataset)
protected Paint lookupBoxPaint(int series, int item)
public void drawItem(Graphics2D g2, XYItemRendererState state, Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis, ValueAxis rangeAxis, XYDataset dataset, int series, int item, boolean selected, int pass)
protected void drawHorizontalItem(Graphics2D g2, XYItemRendererState state, Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis, ValueAxis rangeAxis, XYDataset dataset, int series, int item, boolean selected, int pass)
protected void drawVerticalItem(Graphics2D g2, XYItemRendererState state, Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis, ValueAxis rangeAxis, XYDataset dataset, int series, int item, boolean selected, int pass)
protected void drawEllipse(Point2D point, double oRadius, Graphics2D g2)
protected void drawMultipleEllipse(Point2D point, double boxWidth, double oRadius, Graphics2D g2)
protected void drawHighFarOut(double aRadius, Graphics2D g2, double xx, double m)
protected void drawLowFarOut(double aRadius, Graphics2D g2, double xx, double m)
public boolean equals(Object obj)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
public Object clone() throws CloneNotSupportedException
