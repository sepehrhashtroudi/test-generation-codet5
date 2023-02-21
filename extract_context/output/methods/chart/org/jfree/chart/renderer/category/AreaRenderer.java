public AreaRenderer() { [EOL]     super(); [EOL]     this.endType = AreaRendererEndType.TAPER; [EOL]     setBaseLegendShape(new Rectangle2D.Double(-4.0, -4.0, 8.0, 8.0)); [EOL] } <line_num>: 116,120
public AreaRendererEndType getEndType() { [EOL]     return this.endType; [EOL] } <line_num>: 130,132
public void setEndType(AreaRendererEndType type) { [EOL]     if (type == null) { [EOL]         throw new IllegalArgumentException("Null 'type' argument."); [EOL]     } [EOL]     this.endType = type; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 142,148
public LegendItem getLegendItem(int datasetIndex, int series) { [EOL]     CategoryPlot cp = getPlot(); [EOL]     if (cp == null) { [EOL]         return null; [EOL]     } [EOL]     if (!isSeriesVisible(series) || !isSeriesVisibleInLegend(series)) { [EOL]         return null; [EOL]     } [EOL]     CategoryDataset dataset = cp.getDataset(datasetIndex); [EOL]     String label = getLegendItemLabelGenerator().generateLabel(dataset, series); [EOL]     String description = label; [EOL]     String toolTipText = null; [EOL]     if (getLegendItemToolTipGenerator() != null) { [EOL]         toolTipText = getLegendItemToolTipGenerator().generateLabel(dataset, series); [EOL]     } [EOL]     String urlText = null; [EOL]     if (getLegendItemURLGenerator() != null) { [EOL]         urlText = getLegendItemURLGenerator().generateLabel(dataset, series); [EOL]     } [EOL]     Shape shape = lookupLegendShape(series); [EOL]     Paint paint = lookupSeriesPaint(series); [EOL]     Paint outlinePaint = lookupSeriesOutlinePaint(series); [EOL]     Stroke outlineStroke = lookupSeriesOutlineStroke(series); [EOL]     LegendItem result = new LegendItem(label, description, toolTipText, urlText, shape, paint, outlineStroke, outlinePaint); [EOL]     result.setLabelFont(lookupLegendTextFont(series)); [EOL]     Paint labelPaint = lookupLegendTextPaint(series); [EOL]     if (labelPaint != null) { [EOL]         result.setLabelPaint(labelPaint); [EOL]     } [EOL]     result.setDataset(dataset); [EOL]     result.setDatasetIndex(datasetIndex); [EOL]     result.setSeriesKey(dataset.getRowKey(series)); [EOL]     result.setSeriesIndex(series); [EOL]     return result; [EOL] } <line_num>: 158,203
public void drawItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass) { [EOL]     if (!getItemVisible(row, column)) { [EOL]         return; [EOL]     } [EOL]     Number value = dataset.getValue(row, column); [EOL]     if (value == null) { [EOL]         return; [EOL]     } [EOL]     PlotOrientation orientation = plot.getOrientation(); [EOL]     RectangleEdge axisEdge = plot.getDomainAxisEdge(); [EOL]     int count = dataset.getColumnCount(); [EOL]     float x0 = (float) domainAxis.getCategoryStart(column, count, dataArea, axisEdge); [EOL]     float x1 = (float) domainAxis.getCategoryMiddle(column, count, dataArea, axisEdge); [EOL]     float x2 = (float) domainAxis.getCategoryEnd(column, count, dataArea, axisEdge); [EOL]     x0 = Math.round(x0); [EOL]     x1 = Math.round(x1); [EOL]     x2 = Math.round(x2); [EOL]     if (this.endType == AreaRendererEndType.TRUNCATE) { [EOL]         if (column == 0) { [EOL]             x0 = x1; [EOL]         } else if (column == getColumnCount() - 1) { [EOL]             x2 = x1; [EOL]         } [EOL]     } [EOL]     double yy1 = value.doubleValue(); [EOL]     double yy0 = 0.0; [EOL]     if (this.endType == AreaRendererEndType.LEVEL) { [EOL]         yy0 = yy1; [EOL]     } [EOL]     if (column > 0) { [EOL]         Number n0 = dataset.getValue(row, column - 1); [EOL]         if (n0 != null) { [EOL]             yy0 = (n0.doubleValue() + yy1) / 2.0; [EOL]         } [EOL]     } [EOL]     double yy2 = 0.0; [EOL]     if (column < dataset.getColumnCount() - 1) { [EOL]         Number n2 = dataset.getValue(row, column + 1); [EOL]         if (n2 != null) { [EOL]             yy2 = (n2.doubleValue() + yy1) / 2.0; [EOL]         } [EOL]     } else if (this.endType == AreaRendererEndType.LEVEL) { [EOL]         yy2 = yy1; [EOL]     } [EOL]     RectangleEdge edge = plot.getRangeAxisEdge(); [EOL]     float y0 = (float) rangeAxis.valueToJava2D(yy0, dataArea, edge); [EOL]     float y1 = (float) rangeAxis.valueToJava2D(yy1, dataArea, edge); [EOL]     float y2 = (float) rangeAxis.valueToJava2D(yy2, dataArea, edge); [EOL]     float yz = (float) rangeAxis.valueToJava2D(0.0, dataArea, edge); [EOL]     double labelXX = x1; [EOL]     double labelYY = y1; [EOL]     g2.setPaint(getItemPaint(row, column, selected)); [EOL]     g2.setStroke(getItemStroke(row, column, selected)); [EOL]     GeneralPath area = new GeneralPath(); [EOL]     if (orientation == PlotOrientation.VERTICAL) { [EOL]         area.moveTo(x0, yz); [EOL]         area.lineTo(x0, y0); [EOL]         area.lineTo(x1, y1); [EOL]         area.lineTo(x2, y2); [EOL]         area.lineTo(x2, yz); [EOL]     } else if (orientation == PlotOrientation.HORIZONTAL) { [EOL]         area.moveTo(yz, x0); [EOL]         area.lineTo(y0, x0); [EOL]         area.lineTo(y1, x1); [EOL]         area.lineTo(y2, x2); [EOL]         area.lineTo(yz, x2); [EOL]         double temp = labelXX; [EOL]         labelXX = labelYY; [EOL]         labelYY = temp; [EOL]     } [EOL]     area.closePath(); [EOL]     g2.setPaint(getItemPaint(row, column, selected)); [EOL]     g2.fill(area); [EOL]     if (isItemLabelVisible(row, column, selected)) { [EOL]         drawItemLabel(g2, orientation, dataset, row, column, selected, labelXX, labelYY, (value.doubleValue() < 0.0)); [EOL]     } [EOL]     int datasetIndex = plot.indexOf(dataset); [EOL]     updateCrosshairValues(state.getCrosshairState(), dataset.getRowKey(row), dataset.getColumnKey(column), yy1, datasetIndex, x1, y1, orientation); [EOL]     EntityCollection entities = state.getEntityCollection(); [EOL]     if (entities != null) { [EOL]         addEntity(entities, area, dataset, row, column, selected); [EOL]     } [EOL] } <line_num>: 222,334
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof AreaRenderer)) { [EOL]         return false; [EOL]     } [EOL]     AreaRenderer that = (AreaRenderer) obj; [EOL]     if (!this.endType.equals(that.endType)) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 343,355
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 364,366