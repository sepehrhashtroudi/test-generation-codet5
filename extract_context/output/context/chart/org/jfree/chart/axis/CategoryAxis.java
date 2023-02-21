public CategoryAxis()
public CategoryAxis(String label)
public double getLowerMargin()
public void setLowerMargin(double margin)
public double getUpperMargin()
public void setUpperMargin(double margin)
public double getCategoryMargin()
public void setCategoryMargin(double margin)
public int getMaximumCategoryLabelLines()
public void setMaximumCategoryLabelLines(int lines)
public float getMaximumCategoryLabelWidthRatio()
public void setMaximumCategoryLabelWidthRatio(float ratio)
public int getCategoryLabelPositionOffset()
public void setCategoryLabelPositionOffset(int offset)
public CategoryLabelPositions getCategoryLabelPositions()
public void setCategoryLabelPositions(CategoryLabelPositions positions)
public Font getTickLabelFont(Comparable category)
public void setTickLabelFont(Comparable category, Font font)
public Paint getTickLabelPaint(Comparable category)
public void setTickLabelPaint(Comparable category, Paint paint)
public void addCategoryLabelToolTip(Comparable category, String tooltip)
public String getCategoryLabelToolTip(Comparable category)
public void removeCategoryLabelToolTip(Comparable category)
public void clearCategoryLabelToolTips()
public double getCategoryJava2DCoordinate(CategoryAnchor anchor, int category, int categoryCount, Rectangle2D area, RectangleEdge edge)
public double getCategoryStart(int category, int categoryCount, Rectangle2D area, RectangleEdge edge)
public double getCategoryMiddle(int category, int categoryCount, Rectangle2D area, RectangleEdge edge)
public double getCategoryEnd(int category, int categoryCount, Rectangle2D area, RectangleEdge edge)
public double getCategoryMiddle(Comparable category, List categories, Rectangle2D area, RectangleEdge edge)
public double getCategorySeriesMiddle(Comparable category, Comparable seriesKey, CategoryDataset dataset, double itemMargin, Rectangle2D area, RectangleEdge edge)
public double getCategorySeriesMiddle(int categoryIndex, int categoryCount, int seriesIndex, int seriesCount, double itemMargin, Rectangle2D area, RectangleEdge edge)
protected double calculateCategorySize(int categoryCount, Rectangle2D area, RectangleEdge edge)
protected double calculateCategoryGapSize(int categoryCount, Rectangle2D area, RectangleEdge edge)
public AxisSpace reserveSpace(Graphics2D g2, Plot plot, Rectangle2D plotArea, RectangleEdge edge, AxisSpace space)
public void configure()
public AxisState draw(Graphics2D g2, double cursor, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, PlotRenderingInfo plotState)
protected AxisState drawCategoryLabels(Graphics2D g2, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, AxisState state, PlotRenderingInfo plotState)
public List refreshTicks(Graphics2D g2, AxisState state, Rectangle2D dataArea, RectangleEdge edge)
public void drawTickMarks(Graphics2D g2, double cursor, Rectangle2D dataArea, RectangleEdge edge, AxisState state)
protected TextBlock createLabel(Comparable category, float width, RectangleEdge edge, Graphics2D g2)
protected double calculateTextBlockWidth(TextBlock block, CategoryLabelPosition position, Graphics2D g2)
protected double calculateTextBlockHeight(TextBlock block, CategoryLabelPosition position, Graphics2D g2)
public Object clone() throws CloneNotSupportedException
public boolean equals(Object obj)
public int hashCode()
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
private Map readPaintMap(ObjectInputStream in) throws IOException, ClassNotFoundException
private void writePaintMap(Map map, ObjectOutputStream out) throws IOException
private boolean equalPaintMaps(Map map1, Map map2)
long serialVersionUID=Optional[5886554608114265863L]
double DEFAULT_AXIS_MARGIN=Optional[0.05]
double DEFAULT_CATEGORY_MARGIN=Optional[0.20]
double lowerMargin
double upperMargin
double categoryMargin
int maximumCategoryLabelLines
float maximumCategoryLabelWidthRatio
int categoryLabelPositionOffset
CategoryLabelPositions categoryLabelPositions
Map tickLabelFontMap
Map tickLabelPaintMap
Map categoryLabelToolTips
