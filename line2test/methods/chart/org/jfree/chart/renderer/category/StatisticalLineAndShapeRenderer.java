public StatisticalLineAndShapeRenderer() { [EOL]     this(true, true); [EOL] } <line_num>: 121,123
public StatisticalLineAndShapeRenderer(boolean linesVisible, boolean shapesVisible) { [EOL]     super(linesVisible, shapesVisible); [EOL]     this.errorIndicatorPaint = null; [EOL]     this.errorIndicatorStroke = null; [EOL] } <line_num>: 131,136
public Paint getErrorIndicatorPaint() { [EOL]     return this.errorIndicatorPaint; [EOL] } <line_num>: 146,148
public void setErrorIndicatorPaint(Paint paint) { [EOL]     this.errorIndicatorPaint = paint; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 159,162
public Stroke getErrorIndicatorStroke() { [EOL]     return this.errorIndicatorStroke; [EOL] } <line_num>: 174,176
public void setErrorIndicatorStroke(Stroke stroke) { [EOL]     this.errorIndicatorStroke = stroke; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 189,192
public Range findRangeBounds(CategoryDataset dataset) { [EOL]     return findRangeBounds(dataset, true); [EOL] } <line_num>: 203,205
public void drawItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass) { [EOL]     if (!getItemVisible(row, column)) { [EOL]         return; [EOL]     } [EOL]     if (!(dataset instanceof StatisticalCategoryDataset)) { [EOL]         super.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, row, column, selected, pass); [EOL]         return; [EOL]     } [EOL]     int visibleRow = state.getVisibleSeriesIndex(row); [EOL]     if (visibleRow < 0) { [EOL]         return; [EOL]     } [EOL]     int visibleRowCount = state.getVisibleSeriesCount(); [EOL]     StatisticalCategoryDataset statDataset = (StatisticalCategoryDataset) dataset; [EOL]     Number meanValue = statDataset.getMeanValue(row, column); [EOL]     if (meanValue == null) { [EOL]         return; [EOL]     } [EOL]     PlotOrientation orientation = plot.getOrientation(); [EOL]     double x1; [EOL]     if (getUseSeriesOffset()) { [EOL]         x1 = domainAxis.getCategorySeriesMiddle(column, dataset.getColumnCount(), visibleRow, visibleRowCount, getItemMargin(), dataArea, plot.getDomainAxisEdge()); [EOL]     } else { [EOL]         x1 = domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge()); [EOL]     } [EOL]     double y1 = rangeAxis.valueToJava2D(meanValue.doubleValue(), dataArea, plot.getRangeAxisEdge()); [EOL]     Number sdv = statDataset.getStdDevValue(row, column); [EOL]     if (pass == 1 && sdv != null) { [EOL]         RectangleEdge yAxisLocation = plot.getRangeAxisEdge(); [EOL]         double valueDelta = sdv.doubleValue(); [EOL]         double highVal, lowVal; [EOL]         if ((meanValue.doubleValue() + valueDelta) > rangeAxis.getRange().getUpperBound()) { [EOL]             highVal = rangeAxis.valueToJava2D(rangeAxis.getRange().getUpperBound(), dataArea, yAxisLocation); [EOL]         } else { [EOL]             highVal = rangeAxis.valueToJava2D(meanValue.doubleValue() + valueDelta, dataArea, yAxisLocation); [EOL]         } [EOL]         if ((meanValue.doubleValue() + valueDelta) < rangeAxis.getRange().getLowerBound()) { [EOL]             lowVal = rangeAxis.valueToJava2D(rangeAxis.getRange().getLowerBound(), dataArea, yAxisLocation); [EOL]         } else { [EOL]             lowVal = rangeAxis.valueToJava2D(meanValue.doubleValue() - valueDelta, dataArea, yAxisLocation); [EOL]         } [EOL]         if (this.errorIndicatorPaint != null) { [EOL]             g2.setPaint(this.errorIndicatorPaint); [EOL]         } else { [EOL]             g2.setPaint(getItemPaint(row, column, selected)); [EOL]         } [EOL]         if (this.errorIndicatorStroke != null) { [EOL]             g2.setStroke(this.errorIndicatorStroke); [EOL]         } else { [EOL]             g2.setStroke(getItemOutlineStroke(row, column, selected)); [EOL]         } [EOL]         Line2D line = new Line2D.Double(); [EOL]         if (orientation == PlotOrientation.HORIZONTAL) { [EOL]             line.setLine(lowVal, x1, highVal, x1); [EOL]             g2.draw(line); [EOL]             line.setLine(lowVal, x1 - 5.0d, lowVal, x1 + 5.0d); [EOL]             g2.draw(line); [EOL]             line.setLine(highVal, x1 - 5.0d, highVal, x1 + 5.0d); [EOL]             g2.draw(line); [EOL]         } else { [EOL]             line.setLine(x1, lowVal, x1, highVal); [EOL]             g2.draw(line); [EOL]             line.setLine(x1 - 5.0d, highVal, x1 + 5.0d, highVal); [EOL]             g2.draw(line); [EOL]             line.setLine(x1 - 5.0d, lowVal, x1 + 5.0d, lowVal); [EOL]             g2.draw(line); [EOL]         } [EOL]     } [EOL]     Shape hotspot = null; [EOL]     if (pass == 1 && getItemShapeVisible(row, column)) { [EOL]         Shape shape = getItemShape(row, column, selected); [EOL]         if (orientation == PlotOrientation.HORIZONTAL) { [EOL]             shape = ShapeUtilities.createTranslatedShape(shape, y1, x1); [EOL]         } else if (orientation == PlotOrientation.VERTICAL) { [EOL]             shape = ShapeUtilities.createTranslatedShape(shape, x1, y1); [EOL]         } [EOL]         hotspot = shape; [EOL]         if (getItemShapeFilled(row, column)) { [EOL]             if (getUseFillPaint()) { [EOL]                 g2.setPaint(getItemFillPaint(row, column, selected)); [EOL]             } else { [EOL]                 g2.setPaint(getItemPaint(row, column, selected)); [EOL]             } [EOL]             g2.fill(shape); [EOL]         } [EOL]         if (getDrawOutlines()) { [EOL]             if (getUseOutlinePaint()) { [EOL]                 g2.setPaint(getItemOutlinePaint(row, column, selected)); [EOL]             } else { [EOL]                 g2.setPaint(getItemPaint(row, column, selected)); [EOL]             } [EOL]             g2.setStroke(getItemOutlineStroke(row, column, selected)); [EOL]             g2.draw(shape); [EOL]         } [EOL]         if (isItemLabelVisible(row, column, selected)) { [EOL]             if (orientation == PlotOrientation.HORIZONTAL) { [EOL]                 drawItemLabel(g2, orientation, dataset, row, column, selected, y1, x1, (meanValue.doubleValue() < 0.0)); [EOL]             } else if (orientation == PlotOrientation.VERTICAL) { [EOL]                 drawItemLabel(g2, orientation, dataset, row, column, selected, x1, y1, (meanValue.doubleValue() < 0.0)); [EOL]             } [EOL]         } [EOL]     } [EOL]     if (pass == 0 && getItemLineVisible(row, column)) { [EOL]         if (column != 0) { [EOL]             Number previousValue = statDataset.getValue(row, column - 1); [EOL]             if (previousValue != null) { [EOL]                 double previous = previousValue.doubleValue(); [EOL]                 double x0; [EOL]                 if (getUseSeriesOffset()) { [EOL]                     x0 = domainAxis.getCategorySeriesMiddle(column - 1, dataset.getColumnCount(), visibleRow, visibleRowCount, getItemMargin(), dataArea, plot.getDomainAxisEdge()); [EOL]                 } else { [EOL]                     x0 = domainAxis.getCategoryMiddle(column - 1, getColumnCount(), dataArea, plot.getDomainAxisEdge()); [EOL]                 } [EOL]                 double y0 = rangeAxis.valueToJava2D(previous, dataArea, plot.getRangeAxisEdge()); [EOL]                 Line2D line = null; [EOL]                 if (orientation == PlotOrientation.HORIZONTAL) { [EOL]                     line = new Line2D.Double(y0, x0, y1, x1); [EOL]                 } else if (orientation == PlotOrientation.VERTICAL) { [EOL]                     line = new Line2D.Double(x0, y0, x1, y1); [EOL]                 } [EOL]                 g2.setPaint(getItemPaint(row, column, selected)); [EOL]                 g2.setStroke(getItemStroke(row, column, selected)); [EOL]                 g2.draw(line); [EOL]             } [EOL]         } [EOL]     } [EOL]     if (pass == 1) { [EOL]         EntityCollection entities = state.getEntityCollection(); [EOL]         if (entities != null) { [EOL]             addEntity(entities, hotspot, dataset, row, column, selected, x1, y1); [EOL]         } [EOL]     } [EOL] } <line_num>: 222,422
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof StatisticalLineAndShapeRenderer)) { [EOL]         return false; [EOL]     } [EOL]     StatisticalLineAndShapeRenderer that = (StatisticalLineAndShapeRenderer) obj; [EOL]     if (!PaintUtilities.equal(this.errorIndicatorPaint, that.errorIndicatorPaint)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.errorIndicatorStroke, that.errorIndicatorStroke)) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 431,449
public int hashCode() { [EOL]     int hash = super.hashCode(); [EOL]     hash = HashUtilities.hashCode(hash, this.errorIndicatorPaint); [EOL]     return hash; [EOL] } <line_num>: 456,460
private void writeObject(ObjectOutputStream stream) throws IOException { [EOL]     stream.defaultWriteObject(); [EOL]     SerialUtilities.writePaint(this.errorIndicatorPaint, stream); [EOL]     SerialUtilities.writeStroke(this.errorIndicatorStroke, stream); [EOL] } <line_num>: 469,473
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException { [EOL]     stream.defaultReadObject(); [EOL]     this.errorIndicatorPaint = SerialUtilities.readPaint(stream); [EOL]     this.errorIndicatorStroke = SerialUtilities.readStroke(stream); [EOL] } <line_num>: 483,488
