public StandardChartTheme(String name)
public static ChartTheme createJFreeTheme()
public static ChartTheme createDarknessTheme()
public void apply(JFreeChart chart)
public static ChartTheme createLegacyTheme()
public Font getExtraLargeFont()
public void setExtraLargeFont(Font font)
public Font getLargeFont()
public void setLargeFont(Font font)
public Font getRegularFont()
public void setRegularFont(Font font)
public Font getSmallFont()
public void setSmallFont(Font font)
public Paint getTitlePaint()
public void setTitlePaint(Paint paint)
public Paint getSubtitlePaint()
public void setSubtitlePaint(Paint paint)
public Paint getChartBackgroundPaint()
public void setChartBackgroundPaint(Paint paint)
public Paint getLegendBackgroundPaint()
public void setLegendBackgroundPaint(Paint paint)
public Paint getLegendItemPaint()
public void setLegendItemPaint(Paint paint)
public Paint getPlotBackgroundPaint()
public void setPlotBackgroundPaint(Paint paint)
public Paint getPlotOutlinePaint()
public void setPlotOutlinePaint(Paint paint)
public PieLabelLinkStyle getLabelLinkStyle()
public void setLabelLinkStyle(PieLabelLinkStyle style)
public Paint getLabelLinkPaint()
public void setLabelLinkPaint(Paint paint)
public Paint getDomainGridlinePaint()
public void setDomainGridlinePaint(Paint paint)
public Paint getRangeGridlinePaint()
public void setRangeGridlinePaint(Paint paint)
public Paint getBaselinePaint()
public void setBaselinePaint(Paint paint)
public Paint getCrosshairPaint()
public void setCrosshairPaint(Paint paint)
public RectangleInsets getAxisOffset()
public void setAxisOffset(RectangleInsets offset)
public Paint getAxisLabelPaint()
public void setAxisLabelPaint(Paint paint)
public Paint getTickLabelPaint()
public void setTickLabelPaint(Paint paint)
public Paint getItemLabelPaint()
public void setItemLabelPaint(Paint paint)
public boolean isShadowVisible()
public void setShadowVisible(boolean visible)
public Paint getShadowPaint()
public void setShadowPaint(Paint paint)
public BarPainter getBarPainter()
public void setBarPainter(BarPainter painter)
public XYBarPainter getXYBarPainter()
public void setXYBarPainter(XYBarPainter painter)
public Paint getThermometerPaint()
public void setThermometerPaint(Paint paint)
public Paint getWallPaint()
public void setWallPaint(Paint paint)
public Paint getErrorIndicatorPaint()
public void setErrorIndicatorPaint(Paint paint)
public Paint getGridBandPaint()
public void setGridBandPaint(Paint paint)
public Paint getGridBandAlternatePaint()
public void setGridBandAlternatePaint(Paint paint)
public String getName()
public DrawingSupplier getDrawingSupplier()
public void setDrawingSupplier(DrawingSupplier supplier)
public void apply(JFreeChart chart)
protected void applyToTitle(Title title)
protected void applyToBlockContainer(BlockContainer bc)
protected void applyToBlock(Block b)
protected void applyToPlot(Plot plot)
protected void applyToPiePlot(PiePlot plot)
protected void applyToMultiplePiePlot(MultiplePiePlot plot)
protected void applyToCategoryPlot(CategoryPlot plot)
protected void applyToXYPlot(XYPlot plot)
protected void applyToFastScatterPlot(FastScatterPlot plot)
protected void applyToPolarPlot(PolarPlot plot)
protected void applyToSpiderWebPlot(SpiderWebPlot plot)
protected void applyToMeterPlot(MeterPlot plot)
protected void applyToThermometerPlot(ThermometerPlot plot)
protected void applyToCategoryAxis(CategoryAxis axis)
protected void applyToValueAxis(ValueAxis axis)
protected void applyToSymbolAxis(SymbolAxis axis)
protected void applyToPeriodAxis(PeriodAxis axis)
protected void applyToAbstractRenderer(AbstractRenderer renderer)
protected void applyToCategoryItemRenderer(CategoryItemRenderer renderer)
protected void applyToXYItemRenderer(XYItemRenderer renderer)
protected void applyToXYAnnotation(XYAnnotation annotation)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
String name
Font extraLargeFont
Font largeFont
Font regularFont
Font smallFont
Paint titlePaint
Paint subtitlePaint
Paint chartBackgroundPaint
Paint legendBackgroundPaint
Paint legendItemPaint
DrawingSupplier drawingSupplier
Paint plotBackgroundPaint
Paint plotOutlinePaint
PieLabelLinkStyle labelLinkStyle
Paint labelLinkPaint
Paint domainGridlinePaint
Paint rangeGridlinePaint
Paint baselinePaint
Paint crosshairPaint
RectangleInsets axisOffset
Paint axisLabelPaint
Paint tickLabelPaint
Paint itemLabelPaint
boolean shadowVisible
Paint shadowPaint
BarPainter barPainter
XYBarPainter xyBarPainter
Paint thermometerPaint
Paint wallPaint
Paint errorIndicatorPaint
Paint gridBandPaint=Optional[SymbolAxis.DEFAULT_GRID_BAND_PAINT]
Paint gridBandAlternatePaint=Optional[SymbolAxis.DEFAULT_GRID_BAND_ALTERNATE_PAINT]
