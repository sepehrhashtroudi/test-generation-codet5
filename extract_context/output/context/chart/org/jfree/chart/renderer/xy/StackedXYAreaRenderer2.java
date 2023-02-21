public StackedXYAreaRenderer2()
public StackedXYAreaRenderer2(XYToolTipGenerator labelGenerator, XYURLGenerator urlGenerator)
public boolean getRoundXCoordinates()
public void setRoundXCoordinates(boolean round)
public Range findRangeBounds(XYDataset dataset)
public int getPassCount()
public void drawItem(Graphics2D g2, XYItemRendererState state, Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis, ValueAxis rangeAxis, XYDataset dataset, int series, int item, boolean selected, int pass)
private double[] getStackValues(TableXYDataset dataset, int series, int index)
private double[] averageStackValues(double[] stack1, double[] stack2)
private double[] adjustedStackValues(double[] stack1, double[] stack2)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
long serialVersionUID=Optional[7752676509764539182L]
boolean roundXCoordinates
