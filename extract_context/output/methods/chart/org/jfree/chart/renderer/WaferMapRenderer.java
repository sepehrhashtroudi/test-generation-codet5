public WaferMapRenderer() { [EOL]     this(null, null); [EOL] } <line_num>: 93,95
public WaferMapRenderer(int paintLimit, int paintIndexMethod) { [EOL]     this(new Integer(paintLimit), new Integer(paintIndexMethod)); [EOL] } <line_num>: 103,105
public WaferMapRenderer(Integer paintLimit, Integer paintIndexMethod) { [EOL]     super(); [EOL]     this.paintIndex = new HashMap(); [EOL]     if (paintLimit == null) { [EOL]         this.paintLimit = DEFAULT_PAINT_LIMIT; [EOL]     } else { [EOL]         this.paintLimit = paintLimit.intValue(); [EOL]     } [EOL]     this.paintIndexMethod = VALUE_INDEX; [EOL]     if (paintIndexMethod != null) { [EOL]         if (isMethodValid(paintIndexMethod.intValue())) { [EOL]             this.paintIndexMethod = paintIndexMethod.intValue(); [EOL]         } [EOL]     } [EOL] } <line_num>: 113,131
private boolean isMethodValid(int method) { [EOL]     switch(method) { [EOL]         case POSITION_INDEX: [EOL]             return true; [EOL]         case VALUE_INDEX: [EOL]             return true; [EOL]         default: [EOL]             return false; [EOL]     } [EOL] } <line_num>: 140,146
public DrawingSupplier getDrawingSupplier() { [EOL]     DrawingSupplier result = null; [EOL]     WaferMapPlot p = getPlot(); [EOL]     if (p != null) { [EOL]         result = p.getDrawingSupplier(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 153,160
public WaferMapPlot getPlot() { [EOL]     return this.plot; [EOL] } <line_num>: 167,169
public void setPlot(WaferMapPlot plot) { [EOL]     this.plot = plot; [EOL]     makePaintIndex(); [EOL] } <line_num>: 176,179
public Paint getChipColor(Number value) { [EOL]     return getSeriesPaint(getPaintIndex(value)); [EOL] } <line_num>: 188,190
private int getPaintIndex(Number value) { [EOL]     return ((Integer) this.paintIndex.get(value)).intValue(); [EOL] } <line_num>: 199,201
private void makePaintIndex() { [EOL]     if (this.plot == null) { [EOL]         return; [EOL]     } [EOL]     WaferMapDataset data = this.plot.getDataset(); [EOL]     Number dataMin = data.getMinValue(); [EOL]     Number dataMax = data.getMaxValue(); [EOL]     Set uniqueValues = data.getUniqueValues(); [EOL]     if (uniqueValues.size() <= this.paintLimit) { [EOL]         int count = 0; [EOL]         for (Iterator i = uniqueValues.iterator(); i.hasNext(); ) { [EOL]             this.paintIndex.put(i.next(), new Integer(count++)); [EOL]         } [EOL]     } else { [EOL]         switch(this.paintIndexMethod) { [EOL]             case POSITION_INDEX: [EOL]                 makePositionIndex(uniqueValues); [EOL]                 break; [EOL]             case VALUE_INDEX: [EOL]                 makeValueIndex(dataMax, dataMin, uniqueValues); [EOL]                 break; [EOL]             default: [EOL]                 break; [EOL]         } [EOL]     } [EOL] } <line_num>: 207,235
private void makePositionIndex(Set uniqueValues) { [EOL]     int valuesPerColor = (int) Math.ceil((double) uniqueValues.size() / this.paintLimit); [EOL]     int count = 0; [EOL]     int paint = 0; [EOL]     for (Iterator i = uniqueValues.iterator(); i.hasNext(); ) { [EOL]         this.paintIndex.put(i.next(), new Integer(paint)); [EOL]         if (++count % valuesPerColor == 0) { [EOL]             paint++; [EOL]         } [EOL]         if (paint > this.paintLimit) { [EOL]             paint = this.paintLimit; [EOL]         } [EOL]     } [EOL] } <line_num>: 243,258
private void makeValueIndex(Number max, Number min, Set uniqueValues) { [EOL]     double valueRange = max.doubleValue() - min.doubleValue(); [EOL]     double valueStep = valueRange / this.paintLimit; [EOL]     int paint = 0; [EOL]     double cutPoint = min.doubleValue() + valueStep; [EOL]     for (Iterator i = uniqueValues.iterator(); i.hasNext(); ) { [EOL]         Number value = (Number) i.next(); [EOL]         while (value.doubleValue() > cutPoint) { [EOL]             cutPoint += valueStep; [EOL]             paint++; [EOL]             if (paint > this.paintLimit) { [EOL]                 paint = this.paintLimit; [EOL]             } [EOL]         } [EOL]         this.paintIndex.put(value, new Integer(paint)); [EOL]     } [EOL] } <line_num>: 268,284
public LegendItemCollection getLegendCollection() { [EOL]     LegendItemCollection result = new LegendItemCollection(); [EOL]     if (this.paintIndex != null && this.paintIndex.size() > 0) { [EOL]         if (this.paintIndex.size() <= this.paintLimit) { [EOL]             for (Iterator i = this.paintIndex.entrySet().iterator(); i.hasNext(); ) { [EOL]                 Map.Entry entry = (Map.Entry) i.next(); [EOL]                 String label = entry.getKey().toString(); [EOL]                 String description = label; [EOL]                 Shape shape = new Rectangle2D.Double(1d, 1d, 1d, 1d); [EOL]                 Paint paint = lookupSeriesPaint(((Integer) entry.getValue()).intValue()); [EOL]                 Paint outlinePaint = Color.black; [EOL]                 Stroke outlineStroke = DEFAULT_STROKE; [EOL]                 result.add(new LegendItem(label, description, null, null, shape, paint, outlineStroke, outlinePaint)); [EOL]             } [EOL]         } else { [EOL]             Set unique = new HashSet(); [EOL]             for (Iterator i = this.paintIndex.entrySet().iterator(); i.hasNext(); ) { [EOL]                 Map.Entry entry = (Map.Entry) i.next(); [EOL]                 if (unique.add(entry.getValue())) { [EOL]                     String label = getMinPaintValue((Integer) entry.getValue()).toString() + " - " + getMaxPaintValue((Integer) entry.getValue()).toString(); [EOL]                     String description = label; [EOL]                     Shape shape = new Rectangle2D.Double(1d, 1d, 1d, 1d); [EOL]                     Paint paint = getSeriesPaint(((Integer) entry.getValue()).intValue()); [EOL]                     Paint outlinePaint = Color.black; [EOL]                     Stroke outlineStroke = DEFAULT_STROKE; [EOL]                     result.add(new LegendItem(label, description, null, null, shape, paint, outlineStroke, outlinePaint)); [EOL]                 } [EOL]             } [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 292,340
private Number getMinPaintValue(Integer index) { [EOL]     double minValue = Double.POSITIVE_INFINITY; [EOL]     for (Iterator i = this.paintIndex.entrySet().iterator(); i.hasNext(); ) { [EOL]         Map.Entry entry = (Map.Entry) i.next(); [EOL]         if (((Integer) entry.getValue()).equals(index)) { [EOL]             if (((Number) entry.getKey()).doubleValue() < minValue) { [EOL]                 minValue = ((Number) entry.getKey()).doubleValue(); [EOL]             } [EOL]         } [EOL]     } [EOL]     return new Double(minValue); [EOL] } <line_num>: 350,361
private Number getMaxPaintValue(Integer index) { [EOL]     double maxValue = Double.NEGATIVE_INFINITY; [EOL]     for (Iterator i = this.paintIndex.entrySet().iterator(); i.hasNext(); ) { [EOL]         Map.Entry entry = (Map.Entry) i.next(); [EOL]         if (((Integer) entry.getValue()).equals(index)) { [EOL]             if (((Number) entry.getKey()).doubleValue() > maxValue) { [EOL]                 maxValue = ((Number) entry.getKey()).doubleValue(); [EOL]             } [EOL]         } [EOL]     } [EOL]     return new Double(maxValue); [EOL] } <line_num>: 371,382
