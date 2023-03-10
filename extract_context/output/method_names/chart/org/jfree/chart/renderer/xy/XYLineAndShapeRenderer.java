public XYLineAndShapeRenderer()
public XYLineAndShapeRenderer(boolean lines, boolean shapes)
public State(PlotRenderingInfo info)
public boolean getDrawSeriesLineAsPath()
public void setDrawSeriesLineAsPath(boolean flag)
public int getPassCount()
public boolean getItemLineVisible(int series, int item)
public Boolean getSeriesLinesVisible(int series)
public void setSeriesLinesVisible(int series, Boolean flag)
public void setSeriesLinesVisible(int series, boolean visible)
public boolean getBaseLinesVisible()
public void setBaseLinesVisible(boolean flag)
public Shape getLegendLine()
public void setLegendLine(Shape line)
public boolean getItemShapeVisible(int series, int item)
public Boolean getSeriesShapesVisible(int series)
public void setSeriesShapesVisible(int series, boolean visible)
public void setSeriesShapesVisible(int series, Boolean flag)
public boolean getBaseShapesVisible()
public void setBaseShapesVisible(boolean flag)
public boolean getItemShapeFilled(int series, int item)
public Boolean getSeriesShapesFilled(int series)
public void setSeriesShapesFilled(int series, boolean flag)
public void setSeriesShapesFilled(int series, Boolean flag)
public boolean getBaseShapesFilled()
public void setBaseShapesFilled(boolean flag)
public boolean getDrawOutlines()
public void setDrawOutlines(boolean flag)
public boolean getUseFillPaint()
public void setUseFillPaint(boolean flag)
public boolean getUseOutlinePaint()
public void setUseOutlinePaint(boolean flag)
public boolean isLastPointGood()
public void setLastPointGood(boolean good)
public void startSeriesPass(XYDataset dataset, int series, int firstItem, int lastItem, int pass, int passCount)
public XYItemRendererState initialise(Graphics2D g2, Rectangle2D dataArea, XYPlot plot, XYDataset dataset, PlotRenderingInfo info)
public void drawItem(Graphics2D g2, XYItemRendererState state, Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis, ValueAxis rangeAxis, XYDataset dataset, int series, int item, boolean selected, int pass)
protected boolean isLinePass(int pass)
protected boolean isItemPass(int pass)
protected void drawPrimaryLine(XYItemRendererState state, Graphics2D g2, XYPlot plot, XYDataset dataset, int pass, int series, int item, boolean selected, ValueAxis domainAxis, ValueAxis rangeAxis, Rectangle2D dataArea)
protected void drawShape1(Graphics2D g2, int pass, int series, int item, boolean selected, Shape shape)
protected void drawPrimaryLineAsPath(XYItemRendererState state, Graphics2D g2, XYPlot plot, XYDataset dataset, int pass, int series, int item, boolean selected, ValueAxis domainAxis, ValueAxis rangeAxis, Rectangle2D dataArea)
protected void drawShape2(Graphics2D g2, Rectangle2D dataArea, XYPlot plot, XYDataset dataset, int pass, int series, int item, boolean selected, ValueAxis domainAxis, ValueAxis rangeAxis, CrosshairState crosshairState, EntityCollection entities)
public LegendItem getLegendItem(int datasetIndex, int series)
public Object clone() throws CloneNotSupportedException
public boolean equals(Object obj)
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
private void writeObject(ObjectOutputStream stream) throws IOException
