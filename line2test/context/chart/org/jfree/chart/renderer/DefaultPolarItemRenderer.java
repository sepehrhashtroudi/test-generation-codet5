public DefaultPolarItemRenderer()
public void setPlot(PolarPlot plot)
public PolarPlot getPlot()
public DrawingSupplier getDrawingSupplier()
public boolean isSeriesFilled(int series)
public void setSeriesFilled(int series, boolean filled)
public void drawSeries(Graphics2D g2, Rectangle2D dataArea, PlotRenderingInfo info, PolarPlot plot, XYDataset dataset, int seriesIndex)
public void drawAngularGridLines(Graphics2D g2, PolarPlot plot, List ticks, Rectangle2D dataArea)
public void drawRadialGridLines(Graphics2D g2, PolarPlot plot, ValueAxis radialAxis, List ticks, Rectangle2D dataArea)
public LegendItem getLegendItem(int series)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
PolarPlot plot
BooleanList seriesFilled
