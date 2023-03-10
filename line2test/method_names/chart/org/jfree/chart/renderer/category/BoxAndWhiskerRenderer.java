public BoxAndWhiskerRenderer()
public Paint getArtifactPaint()
public void setArtifactPaint(Paint paint)
public boolean getFillBox()
public void setFillBox(boolean flag)
public double getItemMargin()
public void setItemMargin(double margin)
public double getMaximumBarWidth()
public void setMaximumBarWidth(double percent)
public boolean isMeanVisible()
public void setMeanVisible(boolean visible)
public boolean isMedianVisible()
public void setMedianVisible(boolean visible)
public LegendItem getLegendItem(int datasetIndex, int series)
public CategoryItemRendererState initialise(Graphics2D g2, Rectangle2D dataArea, CategoryPlot plot, CategoryDataset dataset, PlotRenderingInfo info)
public void drawItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass)
protected void drawHorizontalItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass)
protected void drawVerticalItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass)
private void drawEllipse(Point2D point, double oRadius, Graphics2D g2)
private void drawMultipleEllipse(Point2D point, double boxWidth, double oRadius, Graphics2D g2)
private void drawHighFarOut(double aRadius, Graphics2D g2, double xx, double m)
private void drawLowFarOut(double aRadius, Graphics2D g2, double xx, double m)
public boolean equals(Object obj)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
