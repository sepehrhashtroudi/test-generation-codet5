public XYStepAreaRenderer() { [EOL]     this(AREA); [EOL] } <line_num>: 129,131
public XYStepAreaRenderer(int type) { [EOL]     this(type, null, null); [EOL] } <line_num>: 138,140
public XYStepAreaRenderer(int type, XYToolTipGenerator toolTipGenerator, XYURLGenerator urlGenerator) { [EOL]     super(); [EOL]     setBaseToolTipGenerator(toolTipGenerator); [EOL]     setBaseURLGenerator(urlGenerator); [EOL]     if (type == AREA) { [EOL]         this.plotArea = true; [EOL]     } else if (type == SHAPES) { [EOL]         this.shapesVisible = true; [EOL]     } else if (type == AREA_AND_SHAPES) { [EOL]         this.plotArea = true; [EOL]         this.shapesVisible = true; [EOL]     } [EOL]     this.showOutline = false; [EOL] } <line_num>: 153,172
public boolean isOutline() { [EOL]     return this.showOutline; [EOL] } <line_num>: 182,184
public void setOutline(boolean show) { [EOL]     this.showOutline = show; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 195,198
public boolean getShapesVisible() { [EOL]     return this.shapesVisible; [EOL] } <line_num>: 207,209
public void setShapesVisible(boolean flag) { [EOL]     this.shapesVisible = flag; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 220,223
public boolean isShapesFilled() { [EOL]     return this.shapesFilled; [EOL] } <line_num>: 232,234
public void setShapesFilled(boolean filled) { [EOL]     this.shapesFilled = filled; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 244,247
public boolean getPlotArea() { [EOL]     return this.plotArea; [EOL] } <line_num>: 256,258
public void setPlotArea(boolean flag) { [EOL]     this.plotArea = flag; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 269,272
public double getRangeBase() { [EOL]     return this.rangeBase; [EOL] } <line_num>: 283,285
public void setRangeBase(double val) { [EOL]     this.rangeBase = val; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 298,301
public XYItemRendererState initialise(Graphics2D g2, Rectangle2D dataArea, XYPlot plot, XYDataset data, PlotRenderingInfo info) { [EOL]     XYItemRendererState state = super.initialise(g2, dataArea, plot, data, info); [EOL]     state.setProcessVisibleItemsOnly(false); [EOL]     return state; [EOL] } <line_num>: 316,330
public void drawItem(Graphics2D g2, XYItemRendererState state, Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis, ValueAxis rangeAxis, XYDataset dataset, int series, int item, boolean selected, int pass) { [EOL]     PlotOrientation orientation = plot.getOrientation(); [EOL]     int itemCount = dataset.getItemCount(series); [EOL]     Paint paint = getItemPaint(series, item, selected); [EOL]     Stroke seriesStroke = getItemStroke(series, item, selected); [EOL]     g2.setPaint(paint); [EOL]     g2.setStroke(seriesStroke); [EOL]     double x1 = dataset.getXValue(series, item); [EOL]     double y1 = dataset.getYValue(series, item); [EOL]     double x = x1; [EOL]     double y = Double.isNaN(y1) ? getRangeBase() : y1; [EOL]     double transX1 = domainAxis.valueToJava2D(x, dataArea, plot.getDomainAxisEdge()); [EOL]     double transY1 = rangeAxis.valueToJava2D(y, dataArea, plot.getRangeAxisEdge()); [EOL]     transY1 = restrictValueToDataArea(transY1, plot, dataArea); [EOL]     if (this.pArea == null && !Double.isNaN(y1)) { [EOL]         this.pArea = new Polygon(); [EOL]         double transY2 = rangeAxis.valueToJava2D(getRangeBase(), dataArea, plot.getRangeAxisEdge()); [EOL]         transY2 = restrictValueToDataArea(transY2, plot, dataArea); [EOL]         if (orientation == PlotOrientation.VERTICAL) { [EOL]             this.pArea.addPoint((int) transX1, (int) transY2); [EOL]         } else if (orientation == PlotOrientation.HORIZONTAL) { [EOL]             this.pArea.addPoint((int) transY2, (int) transX1); [EOL]         } [EOL]     } [EOL]     double transX0 = 0; [EOL]     double transY0 = restrictValueToDataArea(getRangeBase(), plot, dataArea); [EOL]     double x0; [EOL]     double y0; [EOL]     if (item > 0) { [EOL]         x0 = dataset.getXValue(series, item - 1); [EOL]         y0 = Double.isNaN(y1) ? y1 : dataset.getYValue(series, item - 1); [EOL]         x = x0; [EOL]         y = Double.isNaN(y0) ? getRangeBase() : y0; [EOL]         transX0 = domainAxis.valueToJava2D(x, dataArea, plot.getDomainAxisEdge()); [EOL]         transY0 = rangeAxis.valueToJava2D(y, dataArea, plot.getRangeAxisEdge()); [EOL]         transY0 = restrictValueToDataArea(transY0, plot, dataArea); [EOL]         if (Double.isNaN(y1)) { [EOL]             transX1 = transX0; [EOL]             transY0 = transY1; [EOL]         } [EOL]         if (transY0 != transY1) { [EOL]             if (orientation == PlotOrientation.VERTICAL) { [EOL]                 this.pArea.addPoint((int) transX1, (int) transY0); [EOL]             } else if (orientation == PlotOrientation.HORIZONTAL) { [EOL]                 this.pArea.addPoint((int) transY0, (int) transX1); [EOL]             } [EOL]         } [EOL]     } [EOL]     Shape shape = null; [EOL]     if (!Double.isNaN(y1)) { [EOL]         if (orientation == PlotOrientation.VERTICAL) { [EOL]             this.pArea.addPoint((int) transX1, (int) transY1); [EOL]         } else if (orientation == PlotOrientation.HORIZONTAL) { [EOL]             this.pArea.addPoint((int) transY1, (int) transX1); [EOL]         } [EOL]         if (getShapesVisible()) { [EOL]             shape = getItemShape(series, item, selected); [EOL]             if (orientation == PlotOrientation.VERTICAL) { [EOL]                 shape = ShapeUtilities.createTranslatedShape(shape, transX1, transY1); [EOL]             } else if (orientation == PlotOrientation.HORIZONTAL) { [EOL]                 shape = ShapeUtilities.createTranslatedShape(shape, transY1, transX1); [EOL]             } [EOL]             if (isShapesFilled()) { [EOL]                 g2.fill(shape); [EOL]             } else { [EOL]                 g2.draw(shape); [EOL]             } [EOL]         } else { [EOL]             if (orientation == PlotOrientation.VERTICAL) { [EOL]                 shape = new Rectangle2D.Double(transX1 - 2, transY1 - 2, 4.0, 4.0); [EOL]             } else if (orientation == PlotOrientation.HORIZONTAL) { [EOL]                 shape = new Rectangle2D.Double(transY1 - 2, transX1 - 2, 4.0, 4.0); [EOL]             } [EOL]         } [EOL]     } [EOL]     if (getPlotArea() && item > 0 && this.pArea != null && (item == (itemCount - 1) || Double.isNaN(y1))) { [EOL]         double transY2 = rangeAxis.valueToJava2D(getRangeBase(), dataArea, plot.getRangeAxisEdge()); [EOL]         transY2 = restrictValueToDataArea(transY2, plot, dataArea); [EOL]         if (orientation == PlotOrientation.VERTICAL) { [EOL]             this.pArea.addPoint((int) transX1, (int) transY2); [EOL]         } else if (orientation == PlotOrientation.HORIZONTAL) { [EOL]             this.pArea.addPoint((int) transY2, (int) transX1); [EOL]         } [EOL]         g2.fill(this.pArea); [EOL]         if (isOutline()) { [EOL]             g2.setStroke(plot.getOutlineStroke()); [EOL]             g2.setPaint(plot.getOutlinePaint()); [EOL]             g2.draw(this.pArea); [EOL]         } [EOL]         this.pArea = null; [EOL]     } [EOL]     if (!Double.isNaN(y1)) { [EOL]         int domainAxisIndex = plot.getDomainAxisIndex(domainAxis); [EOL]         int rangeAxisIndex = plot.getRangeAxisIndex(rangeAxis); [EOL]         XYCrosshairState crosshairState = state.getCrosshairState(); [EOL]         updateCrosshairValues(crosshairState, x1, y1, domainAxisIndex, rangeAxisIndex, transX1, transY1, orientation); [EOL]     } [EOL]     EntityCollection entities = state.getEntityCollection(); [EOL]     if (entities != null) { [EOL]         addEntity(entities, shape, dataset, series, item, selected, transX1, transY1); [EOL]     } [EOL] } <line_num>: 348,525
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof XYStepAreaRenderer)) { [EOL]         return false; [EOL]     } [EOL]     XYStepAreaRenderer that = (XYStepAreaRenderer) obj; [EOL]     if (this.showOutline != that.showOutline) { [EOL]         return false; [EOL]     } [EOL]     if (this.shapesVisible != that.shapesVisible) { [EOL]         return false; [EOL]     } [EOL]     if (this.shapesFilled != that.shapesFilled) { [EOL]         return false; [EOL]     } [EOL]     if (this.plotArea != that.plotArea) { [EOL]         return false; [EOL]     } [EOL]     if (this.rangeBase != that.rangeBase) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 534,558
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 567,569
protected static double restrictValueToDataArea(double value, XYPlot plot, Rectangle2D dataArea) { [EOL]     double min = 0; [EOL]     double max = 0; [EOL]     if (plot.getOrientation() == PlotOrientation.VERTICAL) { [EOL]         min = dataArea.getMinY(); [EOL]         max = dataArea.getMaxY(); [EOL]     } else if (plot.getOrientation() == PlotOrientation.HORIZONTAL) { [EOL]         min = dataArea.getMinX(); [EOL]         max = dataArea.getMaxX(); [EOL]     } [EOL]     if (value < min) { [EOL]         value = min; [EOL]     } else if (value > max) { [EOL]         value = max; [EOL]     } [EOL]     return value; [EOL] } <line_num>: 586,606