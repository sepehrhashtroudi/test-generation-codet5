public CombinedRangeXYPlot()
public CombinedRangeXYPlot(ValueAxis rangeAxis)
public String getPlotType()
public double getGap()
public void setGap(double gap)
public void add(XYPlot subplot)
public void add(XYPlot subplot, int weight)
public void remove(XYPlot subplot)
public List getSubplots()
protected AxisSpace calculateAxisSpace(Graphics2D g2, Rectangle2D plotArea)
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info)
public LegendItemCollection getLegendItems()
public void zoomDomainAxes(double factor, PlotRenderingInfo info, Point2D source)
public void zoomDomainAxes(double factor, PlotRenderingInfo info, Point2D source, boolean useAnchor)
public void zoomDomainAxes(double lowerPercent, double upperPercent, PlotRenderingInfo info, Point2D source)
public XYPlot findSubplot(PlotRenderingInfo info, Point2D source)
public void setRenderer(XYItemRenderer renderer)
public void setOrientation(PlotOrientation orientation)
public Range getDataRange(ValueAxis axis)
protected void setFixedDomainAxisSpaceForSubplots(AxisSpace space)
public void handleClick(int x, int y, PlotRenderingInfo info)
public void plotChanged(PlotChangeEvent event)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
