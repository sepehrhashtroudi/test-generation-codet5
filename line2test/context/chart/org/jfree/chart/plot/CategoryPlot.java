public CategoryPlot()
public CategoryPlot(CategoryDataset dataset, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryItemRenderer renderer)
public String getPlotType()
public PlotOrientation getOrientation()
public void setOrientation(PlotOrientation orientation)
public RectangleInsets getAxisOffset()
public void setAxisOffset(RectangleInsets offset)
public CategoryAxis getDomainAxis()
public CategoryAxis getDomainAxis(int index)
public void setDomainAxis(CategoryAxis axis)
public void setDomainAxis(int index, CategoryAxis axis)
public void setDomainAxis(int index, CategoryAxis axis, boolean notify)
public void setDomainAxes(CategoryAxis[] axes)
public int getDomainAxisIndex(CategoryAxis axis)
public AxisLocation getDomainAxisLocation()
public AxisLocation getDomainAxisLocation(int index)
public void setDomainAxisLocation(AxisLocation location)
public void setDomainAxisLocation(AxisLocation location, boolean notify)
public void setDomainAxisLocation(int index, AxisLocation location)
public void setDomainAxisLocation(int index, AxisLocation location, boolean notify)
public RectangleEdge getDomainAxisEdge()
public RectangleEdge getDomainAxisEdge(int index)
public int getDomainAxisCount()
public void clearDomainAxes()
public void configureDomainAxes()
public ValueAxis getRangeAxis()
public ValueAxis getRangeAxis(int index)
public void setRangeAxis(ValueAxis axis)
public void setRangeAxis(int index, ValueAxis axis)
public void setRangeAxis(int index, ValueAxis axis, boolean notify)
public void setRangeAxes(ValueAxis[] axes)
public int getRangeAxisIndex(ValueAxis axis)
public AxisLocation getRangeAxisLocation()
public AxisLocation getRangeAxisLocation(int index)
public void setRangeAxisLocation(AxisLocation location)
public void setRangeAxisLocation(AxisLocation location, boolean notify)
public void setRangeAxisLocation(int index, AxisLocation location)
public void setRangeAxisLocation(int index, AxisLocation location, boolean notify)
public RectangleEdge getRangeAxisEdge()
public RectangleEdge getRangeAxisEdge(int index)
public int getRangeAxisCount()
public void clearRangeAxes()
public void configureRangeAxes()
public CategoryDataset getDataset()
public CategoryDataset getDataset(int index)
public void setDataset(CategoryDataset dataset)
public void setDataset(int index, CategoryDataset dataset)
public int getDatasetCount()
public int indexOf(CategoryDataset dataset)
public void mapDatasetToDomainAxis(int index, int axisIndex)
public void mapDatasetToDomainAxes(int index, List axisIndices)
private void checkAxisIndices(List indices)
public CategoryAxis getDomainAxisForDataset(int index)
public void mapDatasetToRangeAxis(int index, int axisIndex)
public void mapDatasetToRangeAxes(int index, List axisIndices)
public ValueAxis getRangeAxisForDataset(int index)
public int getRendererCount()
public CategoryItemRenderer getRenderer()
public CategoryItemRenderer getRenderer(int index)
public void setRenderer(CategoryItemRenderer renderer)
public void setRenderer(CategoryItemRenderer renderer, boolean notify)
public void setRenderer(int index, CategoryItemRenderer renderer)
public void setRenderer(int index, CategoryItemRenderer renderer, boolean notify)
public void setRenderers(CategoryItemRenderer[] renderers)
public CategoryItemRenderer getRendererForDataset(CategoryDataset dataset)
public int getIndexOf(CategoryItemRenderer renderer)
public DatasetRenderingOrder getDatasetRenderingOrder()
public void setDatasetRenderingOrder(DatasetRenderingOrder order)
public SortOrder getColumnRenderingOrder()
public void setColumnRenderingOrder(SortOrder order)
public SortOrder getRowRenderingOrder()
public void setRowRenderingOrder(SortOrder order)
public boolean isDomainGridlinesVisible()
public void setDomainGridlinesVisible(boolean visible)
public CategoryAnchor getDomainGridlinePosition()
public void setDomainGridlinePosition(CategoryAnchor position)
public Stroke getDomainGridlineStroke()
public void setDomainGridlineStroke(Stroke stroke)
public Paint getDomainGridlinePaint()
public void setDomainGridlinePaint(Paint paint)
public boolean isRangeZeroBaselineVisible()
public void setRangeZeroBaselineVisible(boolean visible)
public Stroke getRangeZeroBaselineStroke()
public void setRangeZeroBaselineStroke(Stroke stroke)
public Paint getRangeZeroBaselinePaint()
public void setRangeZeroBaselinePaint(Paint paint)
public boolean isRangeGridlinesVisible()
public void setRangeGridlinesVisible(boolean visible)
public Stroke getRangeGridlineStroke()
public void setRangeGridlineStroke(Stroke stroke)
public Paint getRangeGridlinePaint()
public void setRangeGridlinePaint(Paint paint)
public boolean isRangeMinorGridlinesVisible()
public void setRangeMinorGridlinesVisible(boolean visible)
public Stroke getRangeMinorGridlineStroke()
public void setRangeMinorGridlineStroke(Stroke stroke)
public Paint getRangeMinorGridlinePaint()
public void setRangeMinorGridlinePaint(Paint paint)
public LegendItemCollection getFixedLegendItems()
public void setFixedLegendItems(LegendItemCollection items)
public LegendItemCollection getLegendItems()
public void handleClick(int x, int y, PlotRenderingInfo info)
public void zoom(double percent)
public void annotationChanged(AnnotationChangeEvent event)
public void datasetChanged(DatasetChangeEvent event)
public void rendererChanged(RendererChangeEvent event)
public void addDomainMarker(CategoryMarker marker)
public void addDomainMarker(CategoryMarker marker, Layer layer)
public void addDomainMarker(int index, CategoryMarker marker, Layer layer)
public void addDomainMarker(int index, CategoryMarker marker, Layer layer, boolean notify)
public void clearDomainMarkers()
public Collection getDomainMarkers(Layer layer)
public Collection getDomainMarkers(int index, Layer layer)
public void clearDomainMarkers(int index)
public boolean removeDomainMarker(Marker marker)
public boolean removeDomainMarker(Marker marker, Layer layer)
public boolean removeDomainMarker(int index, Marker marker, Layer layer)
public boolean removeDomainMarker(int index, Marker marker, Layer layer, boolean notify)
public void addRangeMarker(Marker marker)
public void addRangeMarker(Marker marker, Layer layer)
public void addRangeMarker(int index, Marker marker, Layer layer)
public void addRangeMarker(int index, Marker marker, Layer layer, boolean notify)
public void clearRangeMarkers()
public Collection getRangeMarkers(Layer layer)
public Collection getRangeMarkers(int index, Layer layer)
public void clearRangeMarkers(int index)
public boolean removeRangeMarker(Marker marker)
public boolean removeRangeMarker(Marker marker, Layer layer)
public boolean removeRangeMarker(int index, Marker marker, Layer layer)
public boolean removeRangeMarker(int index, Marker marker, Layer layer, boolean notify)
public boolean isDomainCrosshairVisible()
public void setDomainCrosshairVisible(boolean flag)
public Comparable getDomainCrosshairRowKey()
public void setDomainCrosshairRowKey(Comparable key)
public void setDomainCrosshairRowKey(Comparable key, boolean notify)
public Comparable getDomainCrosshairColumnKey()
public void setDomainCrosshairColumnKey(Comparable key)
public void setDomainCrosshairColumnKey(Comparable key, boolean notify)
public int getCrosshairDatasetIndex()
public void setCrosshairDatasetIndex(int index)
public void setCrosshairDatasetIndex(int index, boolean notify)
public Paint getDomainCrosshairPaint()
public void setDomainCrosshairPaint(Paint paint)
public Stroke getDomainCrosshairStroke()
public void setDomainCrosshairStroke(Stroke stroke)
public boolean isRangeCrosshairVisible()
public void setRangeCrosshairVisible(boolean flag)
public boolean isRangeCrosshairLockedOnData()
public void setRangeCrosshairLockedOnData(boolean flag)
public double getRangeCrosshairValue()
public void setRangeCrosshairValue(double value)
public void setRangeCrosshairValue(double value, boolean notify)
public Stroke getRangeCrosshairStroke()
public void setRangeCrosshairStroke(Stroke stroke)
public Paint getRangeCrosshairPaint()
public void setRangeCrosshairPaint(Paint paint)
public List getAnnotations()
public void addAnnotation(CategoryAnnotation annotation)
public void addAnnotation(CategoryAnnotation annotation, boolean notify)
public boolean removeAnnotation(CategoryAnnotation annotation)
public boolean removeAnnotation(CategoryAnnotation annotation, boolean notify)
public void clearAnnotations()
public ShadowGenerator getShadowGenerator()
public void setShadowGenerator(ShadowGenerator generator)
protected AxisSpace calculateDomainAxisSpace(Graphics2D g2, Rectangle2D plotArea, AxisSpace space)
protected AxisSpace calculateRangeAxisSpace(Graphics2D g2, Rectangle2D plotArea, AxisSpace space)
private Rectangle integerise(Rectangle2D rect)
protected AxisSpace calculateAxisSpace(Graphics2D g2, Rectangle2D plotArea)
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo state)
public void drawBackground(Graphics2D g2, Rectangle2D area)
protected Map drawAxes(Graphics2D g2, Rectangle2D plotArea, Rectangle2D dataArea, PlotRenderingInfo plotState)
public boolean render(Graphics2D g2, Rectangle2D dataArea, int index, PlotRenderingInfo info, CategoryCrosshairState crosshairState)
protected void drawDomainGridlines(Graphics2D g2, Rectangle2D dataArea)
protected void drawRangeGridlines(Graphics2D g2, Rectangle2D dataArea, List ticks)
protected void drawZeroRangeBaseline(Graphics2D g2, Rectangle2D area)
protected void drawAnnotations(Graphics2D g2, Rectangle2D dataArea, PlotRenderingInfo info)
protected void drawDomainMarkers(Graphics2D g2, Rectangle2D dataArea, int index, Layer layer)
protected void drawRangeMarkers(Graphics2D g2, Rectangle2D dataArea, int index, Layer layer)
protected void drawRangeLine(Graphics2D g2, Rectangle2D dataArea, double value, Stroke stroke, Paint paint)
protected void drawDomainCrosshair(Graphics2D g2, Rectangle2D dataArea, PlotOrientation orientation, int datasetIndex, Comparable rowKey, Comparable columnKey, Stroke stroke, Paint paint)
protected void drawRangeCrosshair(Graphics2D g2, Rectangle2D dataArea, PlotOrientation orientation, double value, ValueAxis axis, Stroke stroke, Paint paint)
public Range getDataRange(ValueAxis axis)
private List datasetsMappedToDomainAxis(int axisIndex)
private List datasetsMappedToRangeAxis(int index)
public int getWeight()
public void setWeight(int weight)
public AxisSpace getFixedDomainAxisSpace()
public void setFixedDomainAxisSpace(AxisSpace space)
public void setFixedDomainAxisSpace(AxisSpace space, boolean notify)
public AxisSpace getFixedRangeAxisSpace()
public void setFixedRangeAxisSpace(AxisSpace space)
public void setFixedRangeAxisSpace(AxisSpace space, boolean notify)
public List getCategories()
public List getCategoriesForAxis(CategoryAxis axis)
public boolean getDrawSharedDomainAxis()
public void setDrawSharedDomainAxis(boolean draw)
public boolean isDomainPannable()
public boolean isRangePannable()
public void setRangePannable(boolean pannable)
public void panDomainAxes(double percent, PlotRenderingInfo info, Point2D source)
public void panRangeAxes(double percent, PlotRenderingInfo info, Point2D source)
public boolean isDomainZoomable()
public boolean isRangeZoomable()
public void zoomDomainAxes(double factor, PlotRenderingInfo state, Point2D source)
public void zoomDomainAxes(double lowerPercent, double upperPercent, PlotRenderingInfo state, Point2D source)
public void zoomDomainAxes(double factor, PlotRenderingInfo info, Point2D source, boolean useAnchor)
public void zoomRangeAxes(double factor, PlotRenderingInfo state, Point2D source)
public void zoomRangeAxes(double factor, PlotRenderingInfo info, Point2D source, boolean useAnchor)
public void zoomRangeAxes(double lowerPercent, double upperPercent, PlotRenderingInfo state, Point2D source)
public double getAnchorValue()
public void setAnchorValue(double value)
public void setAnchorValue(double value, boolean notify)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private Map cloneMarkerMap(Map map) throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
public boolean canSelectByPoint()
public boolean canSelectByRegion()
public void select(double x, double y, Rectangle2D dataArea, RenderingSource source)
public void select(GeneralPath region, Rectangle2D dataArea, RenderingSource source)
public void clearSelection()
private CategoryDatasetSelectionState findSelectionStateForDataset(CategoryDataset dataset, Object source)
long serialVersionUID=Optional[-3537691700434728188L]
boolean DEFAULT_DOMAIN_GRIDLINES_VISIBLE=Optional[false]
boolean DEFAULT_RANGE_GRIDLINES_VISIBLE=Optional[true]
Stroke DEFAULT_GRIDLINE_STROKE=Optional[new BasicStroke(0.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0.0f, new float[] { 2.0f, 2.0f }, 0.0f)]
Paint DEFAULT_GRIDLINE_PAINT=Optional[Color.WHITE]
Font DEFAULT_VALUE_LABEL_FONT=Optional[new Font("Tahoma", Font.PLAIN, 10)]
boolean DEFAULT_CROSSHAIR_VISIBLE=Optional[false]
Stroke DEFAULT_CROSSHAIR_STROKE=Optional[DEFAULT_GRIDLINE_STROKE]
Paint DEFAULT_CROSSHAIR_PAINT=Optional[Color.blue]
ResourceBundle localizationResources=Optional[ResourceBundleWrapper.getBundle("org.jfree.chart.plot.LocalizationBundle")]
PlotOrientation orientation
RectangleInsets axisOffset
ObjectList domainAxes
ObjectList domainAxisLocations
boolean drawSharedDomainAxis
ObjectList rangeAxes
ObjectList rangeAxisLocations
ObjectList datasets
TreeMap datasetToDomainAxesMap
TreeMap datasetToRangeAxesMap
ObjectList renderers
DatasetRenderingOrder renderingOrder=Optional[DatasetRenderingOrder.REVERSE]
SortOrder columnRenderingOrder=Optional[SortOrder.ASCENDING]
SortOrder rowRenderingOrder=Optional[SortOrder.ASCENDING]
boolean domainGridlinesVisible
CategoryAnchor domainGridlinePosition
Stroke domainGridlineStroke
Paint domainGridlinePaint
boolean rangeZeroBaselineVisible
Stroke rangeZeroBaselineStroke
Paint rangeZeroBaselinePaint
boolean rangeGridlinesVisible
Stroke rangeGridlineStroke
Paint rangeGridlinePaint
boolean rangeMinorGridlinesVisible
Stroke rangeMinorGridlineStroke
Paint rangeMinorGridlinePaint
double anchorValue
int crosshairDatasetIndex
boolean domainCrosshairVisible
Comparable domainCrosshairRowKey
Comparable domainCrosshairColumnKey
Stroke domainCrosshairStroke
Paint domainCrosshairPaint
boolean rangeCrosshairVisible
double rangeCrosshairValue
Stroke rangeCrosshairStroke
Paint rangeCrosshairPaint
boolean rangeCrosshairLockedOnData=Optional[true]
Map foregroundDomainMarkers
Map backgroundDomainMarkers
Map foregroundRangeMarkers
Map backgroundRangeMarkers
List annotations
int weight
AxisSpace fixedDomainAxisSpace
AxisSpace fixedRangeAxisSpace
LegendItemCollection fixedLegendItems
boolean rangePannable
ShadowGenerator shadowGenerator
