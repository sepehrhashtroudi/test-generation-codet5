public StandardXYItemRenderer()
public StandardXYItemRenderer(int type)
public StandardXYItemRenderer(int type, XYToolTipGenerator toolTipGenerator)
public StandardXYItemRenderer(int type, XYToolTipGenerator toolTipGenerator, XYURLGenerator urlGenerator)
public State(PlotRenderingInfo info)
public boolean getBaseShapesVisible()
public void setBaseShapesVisible(boolean flag)
public boolean getItemShapeFilled(int series, int item)
public Boolean getSeriesShapesFilled(int series)
public void setSeriesShapesFilled(int series, Boolean flag)
public boolean getBaseShapesFilled()
public void setBaseShapesFilled(boolean flag)
public boolean getPlotLines()
public void setPlotLines(boolean flag)
public UnitType getGapThresholdType()
public void setGapThresholdType(UnitType thresholdType)
public double getGapThreshold()
public void setGapThreshold(double t)
public boolean getPlotImages()
public void setPlotImages(boolean flag)
public boolean getPlotDiscontinuous()
public void setPlotDiscontinuous(boolean flag)
public boolean getDrawSeriesLineAsPath()
public void setDrawSeriesLineAsPath(boolean flag)
public Shape getLegendLine()
public void setLegendLine(Shape line)
public LegendItem getLegendItem(int datasetIndex, int series)
public boolean isLastPointGood()
public void setLastPointGood(boolean good)
public int getSeriesIndex()
public void setSeriesIndex(int index)
public XYItemRendererState initialise(Graphics2D g2, Rectangle2D dataArea, XYPlot plot, XYDataset data, PlotRenderingInfo info)
public void drawItem(Graphics2D g2, XYItemRendererState state, Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis, ValueAxis rangeAxis, XYDataset dataset, int series, int item, boolean selected, int pass)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
protected Image getImage(Plot plot, int series, int item, double x, double y)
protected Point getImageHotspot(Plot plot, int series, int item, double x, double y, Image image)
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
private void writeObject(ObjectOutputStream stream) throws IOException
long serialVersionUID=Optional[-3271351259436865995L]
int SHAPES=Optional[1]
int LINES=Optional[2]
int SHAPES_AND_LINES=Optional[SHAPES | LINES]
int IMAGES=Optional[4]
int DISCONTINUOUS=Optional[8]
int DISCONTINUOUS_LINES=Optional[LINES | DISCONTINUOUS]
boolean baseShapesVisible
boolean plotLines
boolean plotImages
boolean plotDiscontinuous
UnitType gapThresholdType=Optional[UnitType.RELATIVE]
double gapThreshold=Optional[1.0]
BooleanList seriesShapesFilled
boolean baseShapesFilled
boolean drawSeriesLineAsPath
Shape legendLine
