public LevelRenderer()
public double getItemMargin()
public void setItemMargin(double percent)
public double getMaximumItemWidth()
public void setMaximumItemWidth(double percent)
public CategoryItemRendererState initialise(Graphics2D g2, Rectangle2D dataArea, CategoryPlot plot, CategoryDataset dataset, PlotRenderingInfo info)
protected void calculateItemWidth(CategoryPlot plot, Rectangle2D dataArea, CategoryDataset dataset, CategoryItemRendererState state)
protected double calculateBarW0(CategoryPlot plot, PlotOrientation orientation, Rectangle2D dataArea, CategoryAxis domainAxis, CategoryItemRendererState state, int row, int column)
public void drawItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass)
protected double calculateSeriesWidth(double space, CategoryAxis axis, int categories, int series)
public double getItemMiddle(Comparable rowKey, Comparable columnKey, CategoryDataset dataset, CategoryAxis axis, Rectangle2D area, RectangleEdge edge)
public boolean equals(Object obj)
public int hashCode()
long serialVersionUID=Optional[-8204856624355025117L]
double DEFAULT_ITEM_MARGIN=Optional[0.20]
double itemMargin
double maxItemWidth
