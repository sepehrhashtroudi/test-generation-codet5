public LevelRenderer() { [EOL]     super(); [EOL]     this.itemMargin = DEFAULT_ITEM_MARGIN; [EOL]     this.maxItemWidth = 1.0; [EOL]     setBaseLegendShape(new Rectangle2D.Float(-5.0f, -1.0f, 10.0f, 2.0f)); [EOL]     setBaseOutlinePaint(new Color(0, 0, 0, 0)); [EOL] } <line_num>: 105,114
public double getItemMargin() { [EOL]     return this.itemMargin; [EOL] } <line_num>: 123,125
public void setItemMargin(double percent) { [EOL]     this.itemMargin = percent; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 137,140
public double getMaximumItemWidth() { [EOL]     return this.maxItemWidth; [EOL] } <line_num>: 150,152
public void setMaximumItemWidth(double percent) { [EOL]     this.maxItemWidth = percent; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 163,166
public CategoryItemRendererState initialise(Graphics2D g2, Rectangle2D dataArea, CategoryPlot plot, CategoryDataset dataset, PlotRenderingInfo info) { [EOL]     CategoryItemRendererState state = super.initialise(g2, dataArea, plot, dataset, info); [EOL]     calculateItemWidth(plot, dataArea, dataset, state); [EOL]     return state; [EOL] } <line_num>: 183,192
protected void calculateItemWidth(CategoryPlot plot, Rectangle2D dataArea, CategoryDataset dataset, CategoryItemRendererState state) { [EOL]     CategoryAxis domainAxis = getDomainAxis(plot, dataset); [EOL]     if (dataset != null) { [EOL]         int columns = dataset.getColumnCount(); [EOL]         int rows = state.getVisibleSeriesCount() >= 0 ? state.getVisibleSeriesCount() : dataset.getRowCount(); [EOL]         double space = 0.0; [EOL]         PlotOrientation orientation = plot.getOrientation(); [EOL]         if (orientation == PlotOrientation.HORIZONTAL) { [EOL]             space = dataArea.getHeight(); [EOL]         } else if (orientation == PlotOrientation.VERTICAL) { [EOL]             space = dataArea.getWidth(); [EOL]         } [EOL]         double maxWidth = space * getMaximumItemWidth(); [EOL]         double categoryMargin = 0.0; [EOL]         double currentItemMargin = 0.0; [EOL]         if (columns > 1) { [EOL]             categoryMargin = domainAxis.getCategoryMargin(); [EOL]         } [EOL]         if (rows > 1) { [EOL]             currentItemMargin = getItemMargin(); [EOL]         } [EOL]         double used = space * (1 - domainAxis.getLowerMargin() - domainAxis.getUpperMargin() - categoryMargin - currentItemMargin); [EOL]         if ((rows * columns) > 0) { [EOL]             state.setBarWidth(Math.min(used / (rows * columns), maxWidth)); [EOL]         } else { [EOL]             state.setBarWidth(Math.min(used, maxWidth)); [EOL]         } [EOL]     } [EOL] } <line_num>: 202,238
protected double calculateBarW0(CategoryPlot plot, PlotOrientation orientation, Rectangle2D dataArea, CategoryAxis domainAxis, CategoryItemRendererState state, int row, int column) { [EOL]     double space = 0.0; [EOL]     if (orientation == PlotOrientation.HORIZONTAL) { [EOL]         space = dataArea.getHeight(); [EOL]     } else { [EOL]         space = dataArea.getWidth(); [EOL]     } [EOL]     double barW0 = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, plot.getDomainAxisEdge()); [EOL]     int seriesCount = state.getVisibleSeriesCount(); [EOL]     if (seriesCount < 0) { [EOL]         seriesCount = getRowCount(); [EOL]     } [EOL]     int categoryCount = getColumnCount(); [EOL]     if (seriesCount > 1) { [EOL]         double seriesGap = space * getItemMargin() / (categoryCount * (seriesCount - 1)); [EOL]         double seriesW = calculateSeriesWidth(space, domainAxis, categoryCount, seriesCount); [EOL]         barW0 = barW0 + row * (seriesW + seriesGap) + (seriesW / 2.0) - (state.getBarWidth() / 2.0); [EOL]     } else { [EOL]         barW0 = domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge()) - state.getBarWidth() / 2.0; [EOL]     } [EOL]     return barW0; [EOL] } <line_num>: 255,291
public void drawItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass) { [EOL]     int visibleRow = state.getVisibleSeriesIndex(row); [EOL]     if (visibleRow < 0) { [EOL]         return; [EOL]     } [EOL]     Number dataValue = dataset.getValue(row, column); [EOL]     if (dataValue == null) { [EOL]         return; [EOL]     } [EOL]     double value = dataValue.doubleValue(); [EOL]     PlotOrientation orientation = plot.getOrientation(); [EOL]     double barW0 = calculateBarW0(plot, orientation, dataArea, domainAxis, state, visibleRow, column); [EOL]     RectangleEdge edge = plot.getRangeAxisEdge(); [EOL]     double barL = rangeAxis.valueToJava2D(value, dataArea, edge); [EOL]     Line2D line = null; [EOL]     double x = 0.0; [EOL]     double y = 0.0; [EOL]     if (orientation == PlotOrientation.HORIZONTAL) { [EOL]         x = barL; [EOL]         y = barW0 + state.getBarWidth() / 2.0; [EOL]         line = new Line2D.Double(barL, barW0, barL, barW0 + state.getBarWidth()); [EOL]     } else { [EOL]         x = barW0 + state.getBarWidth() / 2.0; [EOL]         y = barL; [EOL]         line = new Line2D.Double(barW0, barL, barW0 + state.getBarWidth(), barL); [EOL]     } [EOL]     Stroke itemStroke = getItemStroke(row, column, selected); [EOL]     Paint itemPaint = getItemPaint(row, column, selected); [EOL]     g2.setStroke(itemStroke); [EOL]     g2.setPaint(itemPaint); [EOL]     g2.draw(line); [EOL]     CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column, selected); [EOL]     if (generator != null && isItemLabelVisible(row, column, selected)) { [EOL]         drawItemLabel(g2, orientation, dataset, row, column, selected, x, y, (value < 0.0)); [EOL]     } [EOL]     int datasetIndex = plot.indexOf(dataset); [EOL]     updateCrosshairValues(state.getCrosshairState(), dataset.getRowKey(row), dataset.getColumnKey(column), value, datasetIndex, barW0, barL, orientation); [EOL]     EntityCollection entities = state.getEntityCollection(); [EOL]     if (entities != null) { [EOL]         addEntity(entities, line.getBounds(), dataset, row, column, selected); [EOL]     } [EOL] } <line_num>: 308,376
protected double calculateSeriesWidth(double space, CategoryAxis axis, int categories, int series) { [EOL]     double factor = 1.0 - getItemMargin() - axis.getLowerMargin() - axis.getUpperMargin(); [EOL]     if (categories > 1) { [EOL]         factor = factor - axis.getCategoryMargin(); [EOL]     } [EOL]     return (space * factor) / (categories * series); [EOL] } <line_num>: 388,396
public double getItemMiddle(Comparable rowKey, Comparable columnKey, CategoryDataset dataset, CategoryAxis axis, Rectangle2D area, RectangleEdge edge) { [EOL]     return axis.getCategorySeriesMiddle(columnKey, rowKey, dataset, this.itemMargin, area, edge); [EOL] } <line_num>: 412,417
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof LevelRenderer)) { [EOL]         return false; [EOL]     } [EOL]     LevelRenderer that = (LevelRenderer) obj; [EOL]     if (this.itemMargin != that.itemMargin) { [EOL]         return false; [EOL]     } [EOL]     if (this.maxItemWidth != that.maxItemWidth) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 426,441
public int hashCode() { [EOL]     int hash = super.hashCode(); [EOL]     hash = HashUtilities.hashCode(hash, this.itemMargin); [EOL]     hash = HashUtilities.hashCode(hash, this.maxItemWidth); [EOL]     return hash; [EOL] } <line_num>: 448,453
