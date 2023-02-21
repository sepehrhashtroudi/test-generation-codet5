public StackedBarRenderer3D()
public StackedBarRenderer3D(double xOffset, double yOffset)
public StackedBarRenderer3D(boolean renderAsPercentages)
public StackedBarRenderer3D(double xOffset, double yOffset, boolean renderAsPercentages)
public boolean getRenderAsPercentages()
public void setRenderAsPercentages(boolean asPercentages)
public boolean getIgnoreZeroValues()
public void setIgnoreZeroValues(boolean ignore)
public Range findRangeBounds(CategoryDataset dataset)
protected void calculateBarWidth(CategoryPlot plot, Rectangle2D dataArea, CategoryDataset dataset, CategoryItemRendererState state)
protected List createStackedValueList(CategoryDataset dataset, Comparable category, int[] includedRows, double base, boolean asPercentages)
public void drawItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass)
protected void drawStackHorizontal(List values, Comparable category, Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset)
private Shape[] createHorizontalBlock(double x0, double width, double y0, double y1, boolean inverted)
protected void drawStackVertical(List values, Comparable category, Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset)
private Shape[] createVerticalBlock(double x0, double width, double y0, double y1, boolean inverted)
public boolean equals(Object obj)
public int hashCode()
