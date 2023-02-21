public StackedXYAreaRenderer2() { [EOL]     this(null, null); [EOL] } <line_num>: 111,113
public StackedXYAreaRenderer2(XYToolTipGenerator labelGenerator, XYURLGenerator urlGenerator) { [EOL]     super(labelGenerator, urlGenerator); [EOL]     this.roundXCoordinates = true; [EOL] } <line_num>: 122,126
public boolean getRoundXCoordinates() { [EOL]     return this.roundXCoordinates; [EOL] } <line_num>: 138,140
public void setRoundXCoordinates(boolean round) { [EOL]     this.roundXCoordinates = round; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 153,156
public Range findRangeBounds(XYDataset dataset) { [EOL]     if (dataset == null) { [EOL]         return null; [EOL]     } [EOL]     double min = Double.POSITIVE_INFINITY; [EOL]     double max = Double.NEGATIVE_INFINITY; [EOL]     TableXYDataset d = (TableXYDataset) dataset; [EOL]     int itemCount = d.getItemCount(); [EOL]     for (int i = 0; i < itemCount; i++) { [EOL]         double[] stackValues = getStackValues((TableXYDataset) dataset, d.getSeriesCount(), i); [EOL]         min = Math.min(min, stackValues[0]); [EOL]         max = Math.max(max, stackValues[1]); [EOL]     } [EOL]     if (min == Double.POSITIVE_INFINITY) { [EOL]         return null; [EOL]     } [EOL]     return new Range(min, max); [EOL] } <line_num>: 167,185
public int getPassCount() { [EOL]     return 1; [EOL] } <line_num>: 192,194
public void drawItem(Graphics2D g2, XYItemRendererState state, Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis, ValueAxis rangeAxis, XYDataset dataset, int series, int item, boolean selected, int pass) { [EOL]     Shape entityArea = null; [EOL]     EntityCollection entities = null; [EOL]     if (state.getInfo() != null) { [EOL]         entities = state.getInfo().getOwner().getEntityCollection(); [EOL]     } [EOL]     TableXYDataset tdataset = (TableXYDataset) dataset; [EOL]     PlotOrientation orientation = plot.getOrientation(); [EOL]     double x1 = dataset.getXValue(series, item); [EOL]     double y1 = dataset.getYValue(series, item); [EOL]     if (Double.isNaN(y1)) { [EOL]         y1 = 0.0; [EOL]     } [EOL]     double[] stack1 = getStackValues(tdataset, series, item); [EOL]     double x0 = dataset.getXValue(series, Math.max(item - 1, 0)); [EOL]     double y0 = dataset.getYValue(series, Math.max(item - 1, 0)); [EOL]     if (Double.isNaN(y0)) { [EOL]         y0 = 0.0; [EOL]     } [EOL]     double[] stack0 = getStackValues(tdataset, series, Math.max(item - 1, 0)); [EOL]     int itemCount = dataset.getItemCount(series); [EOL]     double x2 = dataset.getXValue(series, Math.min(item + 1, itemCount - 1)); [EOL]     double y2 = dataset.getYValue(series, Math.min(item + 1, itemCount - 1)); [EOL]     if (Double.isNaN(y2)) { [EOL]         y2 = 0.0; [EOL]     } [EOL]     double[] stack2 = getStackValues(tdataset, series, Math.min(item + 1, itemCount - 1)); [EOL]     double xleft = (x0 + x1) / 2.0; [EOL]     double xright = (x1 + x2) / 2.0; [EOL]     double[] stackLeft = averageStackValues(stack0, stack1); [EOL]     double[] stackRight = averageStackValues(stack1, stack2); [EOL]     double[] adjStackLeft = adjustedStackValues(stack0, stack1); [EOL]     double[] adjStackRight = adjustedStackValues(stack1, stack2); [EOL]     RectangleEdge edge0 = plot.getDomainAxisEdge(); [EOL]     float transX1 = (float) domainAxis.valueToJava2D(x1, dataArea, edge0); [EOL]     float transXLeft = (float) domainAxis.valueToJava2D(xleft, dataArea, edge0); [EOL]     float transXRight = (float) domainAxis.valueToJava2D(xright, dataArea, edge0); [EOL]     if (this.roundXCoordinates) { [EOL]         transX1 = Math.round(transX1); [EOL]         transXLeft = Math.round(transXLeft); [EOL]         transXRight = Math.round(transXRight); [EOL]     } [EOL]     float transY1; [EOL]     RectangleEdge edge1 = plot.getRangeAxisEdge(); [EOL]     GeneralPath left = new GeneralPath(); [EOL]     GeneralPath right = new GeneralPath(); [EOL]     if (y1 >= 0.0) { [EOL]         transY1 = (float) rangeAxis.valueToJava2D(y1 + stack1[1], dataArea, edge1); [EOL]         float transStack1 = (float) rangeAxis.valueToJava2D(stack1[1], dataArea, edge1); [EOL]         float transStackLeft = (float) rangeAxis.valueToJava2D(adjStackLeft[1], dataArea, edge1); [EOL]         if (y0 >= 0.0) { [EOL]             double yleft = (y0 + y1) / 2.0 + stackLeft[1]; [EOL]             float transYLeft = (float) rangeAxis.valueToJava2D(yleft, dataArea, edge1); [EOL]             if (orientation == PlotOrientation.VERTICAL) { [EOL]                 left.moveTo(transX1, transY1); [EOL]                 left.lineTo(transX1, transStack1); [EOL]                 left.lineTo(transXLeft, transStackLeft); [EOL]                 left.lineTo(transXLeft, transYLeft); [EOL]             } else { [EOL]                 left.moveTo(transY1, transX1); [EOL]                 left.lineTo(transStack1, transX1); [EOL]                 left.lineTo(transStackLeft, transXLeft); [EOL]                 left.lineTo(transYLeft, transXLeft); [EOL]             } [EOL]             left.closePath(); [EOL]         } else { [EOL]             if (orientation == PlotOrientation.VERTICAL) { [EOL]                 left.moveTo(transX1, transStack1); [EOL]                 left.lineTo(transX1, transY1); [EOL]                 left.lineTo(transXLeft, transStackLeft); [EOL]             } else { [EOL]                 left.moveTo(transStack1, transX1); [EOL]                 left.lineTo(transY1, transX1); [EOL]                 left.lineTo(transStackLeft, transXLeft); [EOL]             } [EOL]             left.closePath(); [EOL]         } [EOL]         float transStackRight = (float) rangeAxis.valueToJava2D(adjStackRight[1], dataArea, edge1); [EOL]         if (y2 >= 0.0) { [EOL]             double yright = (y1 + y2) / 2.0 + stackRight[1]; [EOL]             float transYRight = (float) rangeAxis.valueToJava2D(yright, dataArea, edge1); [EOL]             if (orientation == PlotOrientation.VERTICAL) { [EOL]                 right.moveTo(transX1, transStack1); [EOL]                 right.lineTo(transX1, transY1); [EOL]                 right.lineTo(transXRight, transYRight); [EOL]                 right.lineTo(transXRight, transStackRight); [EOL]             } else { [EOL]                 right.moveTo(transStack1, transX1); [EOL]                 right.lineTo(transY1, transX1); [EOL]                 right.lineTo(transYRight, transXRight); [EOL]                 right.lineTo(transStackRight, transXRight); [EOL]             } [EOL]             right.closePath(); [EOL]         } else { [EOL]             if (orientation == PlotOrientation.VERTICAL) { [EOL]                 right.moveTo(transX1, transStack1); [EOL]                 right.lineTo(transX1, transY1); [EOL]                 right.lineTo(transXRight, transStackRight); [EOL]             } else { [EOL]                 right.moveTo(transStack1, transX1); [EOL]                 right.lineTo(transY1, transX1); [EOL]                 right.lineTo(transStackRight, transXRight); [EOL]             } [EOL]             right.closePath(); [EOL]         } [EOL]     } else { [EOL]         transY1 = (float) rangeAxis.valueToJava2D(y1 + stack1[0], dataArea, edge1); [EOL]         float transStack1 = (float) rangeAxis.valueToJava2D(stack1[0], dataArea, edge1); [EOL]         float transStackLeft = (float) rangeAxis.valueToJava2D(adjStackLeft[0], dataArea, edge1); [EOL]         if (y0 >= 0.0) { [EOL]             if (orientation == PlotOrientation.VERTICAL) { [EOL]                 left.moveTo(transX1, transStack1); [EOL]                 left.lineTo(transX1, transY1); [EOL]                 left.lineTo(transXLeft, transStackLeft); [EOL]             } else { [EOL]                 left.moveTo(transStack1, transX1); [EOL]                 left.lineTo(transY1, transX1); [EOL]                 left.lineTo(transStackLeft, transXLeft); [EOL]             } [EOL]             left.clone(); [EOL]         } else { [EOL]             double yleft = (y0 + y1) / 2.0 + stackLeft[0]; [EOL]             float transYLeft = (float) rangeAxis.valueToJava2D(yleft, dataArea, edge1); [EOL]             if (orientation == PlotOrientation.VERTICAL) { [EOL]                 left.moveTo(transX1, transY1); [EOL]                 left.lineTo(transX1, transStack1); [EOL]                 left.lineTo(transXLeft, transStackLeft); [EOL]                 left.lineTo(transXLeft, transYLeft); [EOL]             } else { [EOL]                 left.moveTo(transY1, transX1); [EOL]                 left.lineTo(transStack1, transX1); [EOL]                 left.lineTo(transStackLeft, transXLeft); [EOL]                 left.lineTo(transYLeft, transXLeft); [EOL]             } [EOL]             left.closePath(); [EOL]         } [EOL]         float transStackRight = (float) rangeAxis.valueToJava2D(adjStackRight[0], dataArea, edge1); [EOL]         if (y2 >= 0.0) { [EOL]             if (orientation == PlotOrientation.VERTICAL) { [EOL]                 right.moveTo(transX1, transStack1); [EOL]                 right.lineTo(transX1, transY1); [EOL]                 right.lineTo(transXRight, transStackRight); [EOL]             } else { [EOL]                 right.moveTo(transStack1, transX1); [EOL]                 right.lineTo(transY1, transX1); [EOL]                 right.lineTo(transStackRight, transXRight); [EOL]             } [EOL]             right.closePath(); [EOL]         } else { [EOL]             double yright = (y1 + y2) / 2.0 + stackRight[0]; [EOL]             float transYRight = (float) rangeAxis.valueToJava2D(yright, dataArea, edge1); [EOL]             if (orientation == PlotOrientation.VERTICAL) { [EOL]                 right.moveTo(transX1, transStack1); [EOL]                 right.lineTo(transX1, transY1); [EOL]                 right.lineTo(transXRight, transYRight); [EOL]                 right.lineTo(transXRight, transStackRight); [EOL]             } else { [EOL]                 right.moveTo(transStack1, transX1); [EOL]                 right.lineTo(transY1, transX1); [EOL]                 right.lineTo(transYRight, transXRight); [EOL]                 right.lineTo(transStackRight, transXRight); [EOL]             } [EOL]             right.closePath(); [EOL]         } [EOL]     } [EOL]     Paint itemPaint = getItemPaint(series, item, selected); [EOL]     if (pass == 0) { [EOL]         g2.setPaint(itemPaint); [EOL]         g2.fill(left); [EOL]         g2.fill(right); [EOL]     } [EOL]     if (entities != null) { [EOL]         GeneralPath gp = new GeneralPath(left); [EOL]         gp.append(right, false); [EOL]         entityArea = gp; [EOL]         addEntity(entities, entityArea, dataset, series, item, selected, transX1, transY1); [EOL]     } [EOL] } <line_num>: 211,451
private double[] getStackValues(TableXYDataset dataset, int series, int index) { [EOL]     double[] result = new double[2]; [EOL]     for (int i = 0; i < series; i++) { [EOL]         double v = dataset.getYValue(i, index); [EOL]         if (!Double.isNaN(v)) { [EOL]             if (v >= 0.0) { [EOL]                 result[1] += v; [EOL]             } else { [EOL]                 result[0] += v; [EOL]             } [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 466,481
private double[] averageStackValues(double[] stack1, double[] stack2) { [EOL]     double[] result = new double[2]; [EOL]     result[0] = (stack1[0] + stack2[0]) / 2.0; [EOL]     result[1] = (stack1[1] + stack2[1]) / 2.0; [EOL]     return result; [EOL] } <line_num>: 492,497
private double[] adjustedStackValues(double[] stack1, double[] stack2) { [EOL]     double[] result = new double[2]; [EOL]     if (stack1[0] == 0.0 || stack2[0] == 0.0) { [EOL]         result[0] = 0.0; [EOL]     } else { [EOL]         result[0] = (stack1[0] + stack2[0]) / 2.0; [EOL]     } [EOL]     if (stack1[1] == 0.0 || stack2[1] == 0.0) { [EOL]         result[1] = 0.0; [EOL]     } else { [EOL]         result[1] = (stack1[1] + stack2[1]) / 2.0; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 509,524
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof StackedXYAreaRenderer2)) { [EOL]         return false; [EOL]     } [EOL]     StackedXYAreaRenderer2 that = (StackedXYAreaRenderer2) obj; [EOL]     if (this.roundXCoordinates != that.roundXCoordinates) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 533,545
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 554,556