public CombinedRangeCategoryPlot() { [EOL]     this(new NumberAxis()); [EOL] } <line_num>: 107,109
public CombinedRangeCategoryPlot(ValueAxis rangeAxis) { [EOL]     super(null, null, rangeAxis, null); [EOL]     this.subplots = new java.util.ArrayList(); [EOL]     this.gap = 5.0; [EOL] } <line_num>: 116,120
public double getGap() { [EOL]     return this.gap; [EOL] } <line_num>: 127,129
public void setGap(double gap) { [EOL]     this.gap = gap; [EOL]     fireChangeEvent(); [EOL] } <line_num>: 137,140
public void add(CategoryPlot subplot) { [EOL]     add(subplot, 1); [EOL] } <line_num>: 151,154
public void add(CategoryPlot subplot, int weight) { [EOL]     if (subplot == null) { [EOL]         throw new IllegalArgumentException("Null 'subplot' argument."); [EOL]     } [EOL]     if (weight <= 0) { [EOL]         throw new IllegalArgumentException("Require weight >= 1."); [EOL]     } [EOL]     subplot.setParent(this); [EOL]     subplot.setWeight(weight); [EOL]     subplot.setInsets(new RectangleInsets(0.0, 0.0, 0.0, 0.0)); [EOL]     subplot.setRangeAxis(null); [EOL]     subplot.setOrientation(getOrientation()); [EOL]     subplot.addChangeListener(this); [EOL]     this.subplots.add(subplot); [EOL]     ValueAxis axis = getRangeAxis(); [EOL]     if (axis != null) { [EOL]         axis.configure(); [EOL]     } [EOL]     fireChangeEvent(); [EOL] } <line_num>: 166,187
public void remove(CategoryPlot subplot) { [EOL]     if (subplot == null) { [EOL]         throw new IllegalArgumentException(" Null 'subplot' argument."); [EOL]     } [EOL]     int position = -1; [EOL]     int size = this.subplots.size(); [EOL]     int i = 0; [EOL]     while (position == -1 && i < size) { [EOL]         if (this.subplots.get(i) == subplot) { [EOL]             position = i; [EOL]         } [EOL]         i++; [EOL]     } [EOL]     if (position != -1) { [EOL]         this.subplots.remove(position); [EOL]         subplot.setParent(null); [EOL]         subplot.removeChangeListener(this); [EOL]         ValueAxis range = getRangeAxis(); [EOL]         if (range != null) { [EOL]             range.configure(); [EOL]         } [EOL]         ValueAxis range2 = getRangeAxis(1); [EOL]         if (range2 != null) { [EOL]             range2.configure(); [EOL]         } [EOL]         fireChangeEvent(); [EOL]     } [EOL] } <line_num>: 194,223
public List getSubplots() { [EOL]     if (this.subplots != null) { [EOL]         return Collections.unmodifiableList(this.subplots); [EOL]     } else { [EOL]         return Collections.EMPTY_LIST; [EOL]     } [EOL] } <line_num>: 231,238
protected AxisSpace calculateAxisSpace(Graphics2D g2, Rectangle2D plotArea) { [EOL]     AxisSpace space = new AxisSpace(); [EOL]     PlotOrientation orientation = getOrientation(); [EOL]     AxisSpace fixed = getFixedRangeAxisSpace(); [EOL]     if (fixed != null) { [EOL]         if (orientation == PlotOrientation.VERTICAL) { [EOL]             space.setLeft(fixed.getLeft()); [EOL]             space.setRight(fixed.getRight()); [EOL]         } else if (orientation == PlotOrientation.HORIZONTAL) { [EOL]             space.setTop(fixed.getTop()); [EOL]             space.setBottom(fixed.getBottom()); [EOL]         } [EOL]     } else { [EOL]         ValueAxis valueAxis = getRangeAxis(); [EOL]         RectangleEdge valueEdge = Plot.resolveRangeAxisLocation(getRangeAxisLocation(), orientation); [EOL]         if (valueAxis != null) { [EOL]             space = valueAxis.reserveSpace(g2, this, plotArea, valueEdge, space); [EOL]         } [EOL]     } [EOL]     Rectangle2D adjustedPlotArea = space.shrink(plotArea, null); [EOL]     int n = this.subplots.size(); [EOL]     int totalWeight = 0; [EOL]     for (int i = 0; i < n; i++) { [EOL]         CategoryPlot sub = (CategoryPlot) this.subplots.get(i); [EOL]         totalWeight += sub.getWeight(); [EOL]     } [EOL]     this.subplotArea = new Rectangle2D[n]; [EOL]     double x = adjustedPlotArea.getX(); [EOL]     double y = adjustedPlotArea.getY(); [EOL]     double usableSize = 0.0; [EOL]     if (orientation == PlotOrientation.VERTICAL) { [EOL]         usableSize = adjustedPlotArea.getWidth() - this.gap * (n - 1); [EOL]     } else if (orientation == PlotOrientation.HORIZONTAL) { [EOL]         usableSize = adjustedPlotArea.getHeight() - this.gap * (n - 1); [EOL]     } [EOL]     for (int i = 0; i < n; i++) { [EOL]         CategoryPlot plot = (CategoryPlot) this.subplots.get(i); [EOL]         if (orientation == PlotOrientation.VERTICAL) { [EOL]             double w = usableSize * plot.getWeight() / totalWeight; [EOL]             this.subplotArea[i] = new Rectangle2D.Double(x, y, w, adjustedPlotArea.getHeight()); [EOL]             x = x + w + this.gap; [EOL]         } else if (orientation == PlotOrientation.HORIZONTAL) { [EOL]             double h = usableSize * plot.getWeight() / totalWeight; [EOL]             this.subplotArea[i] = new Rectangle2D.Double(x, y, adjustedPlotArea.getWidth(), h); [EOL]             y = y + h + this.gap; [EOL]         } [EOL]         AxisSpace subSpace = plot.calculateDomainAxisSpace(g2, this.subplotArea[i], null); [EOL]         space.ensureAtLeast(subSpace); [EOL]     } [EOL]     return space; [EOL] } <line_num>: 248,321
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info) { [EOL]     if (info != null) { [EOL]         info.setPlotArea(area); [EOL]     } [EOL]     RectangleInsets insets = getInsets(); [EOL]     insets.trim(area); [EOL]     AxisSpace space = calculateAxisSpace(g2, area); [EOL]     Rectangle2D dataArea = space.shrink(area, null); [EOL]     setFixedDomainAxisSpaceForSubplots(space); [EOL]     ValueAxis axis = getRangeAxis(); [EOL]     RectangleEdge rangeEdge = getRangeAxisEdge(); [EOL]     double cursor = RectangleEdge.coordinate(dataArea, rangeEdge); [EOL]     AxisState state = axis.draw(g2, cursor, area, dataArea, rangeEdge, info); [EOL]     if (parentState == null) { [EOL]         parentState = new PlotState(); [EOL]     } [EOL]     parentState.getSharedAxisStates().put(axis, state); [EOL]     for (int i = 0; i < this.subplots.size(); i++) { [EOL]         CategoryPlot plot = (CategoryPlot) this.subplots.get(i); [EOL]         PlotRenderingInfo subplotInfo = null; [EOL]         if (info != null) { [EOL]             subplotInfo = new PlotRenderingInfo(info.getOwner()); [EOL]             info.addSubplotInfo(subplotInfo); [EOL]         } [EOL]         Point2D subAnchor = null; [EOL]         if (anchor != null && this.subplotArea[i].contains(anchor)) { [EOL]             subAnchor = anchor; [EOL]         } [EOL]         plot.draw(g2, this.subplotArea[i], subAnchor, parentState, subplotInfo); [EOL]     } [EOL]     if (info != null) { [EOL]         info.setDataArea(dataArea); [EOL]     } [EOL] } <line_num>: 336,387
public void setOrientation(PlotOrientation orientation) { [EOL]     super.setOrientation(orientation); [EOL]     Iterator iterator = this.subplots.iterator(); [EOL]     while (iterator.hasNext()) { [EOL]         CategoryPlot plot = (CategoryPlot) iterator.next(); [EOL]         plot.setOrientation(orientation); [EOL]     } [EOL] } <line_num>: 394,404
public Range getDataRange(ValueAxis axis) { [EOL]     Range result = null; [EOL]     if (this.subplots != null) { [EOL]         Iterator iterator = this.subplots.iterator(); [EOL]         while (iterator.hasNext()) { [EOL]             CategoryPlot subplot = (CategoryPlot) iterator.next(); [EOL]             result = Range.combine(result, subplot.getDataRange(axis)); [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 419,429
public LegendItemCollection getLegendItems() { [EOL]     LegendItemCollection result = getFixedLegendItems(); [EOL]     if (result == null) { [EOL]         result = new LegendItemCollection(); [EOL]         if (this.subplots != null) { [EOL]             Iterator iterator = this.subplots.iterator(); [EOL]             while (iterator.hasNext()) { [EOL]                 CategoryPlot plot = (CategoryPlot) iterator.next(); [EOL]                 LegendItemCollection more = plot.getLegendItems(); [EOL]                 result.addAll(more); [EOL]             } [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 436,450
protected void setFixedDomainAxisSpaceForSubplots(AxisSpace space) { [EOL]     Iterator iterator = this.subplots.iterator(); [EOL]     while (iterator.hasNext()) { [EOL]         CategoryPlot plot = (CategoryPlot) iterator.next(); [EOL]         plot.setFixedDomainAxisSpace(space, false); [EOL]     } [EOL] } <line_num>: 458,464
public void handleClick(int x, int y, PlotRenderingInfo info) { [EOL]     Rectangle2D dataArea = info.getDataArea(); [EOL]     if (dataArea.contains(x, y)) { [EOL]         for (int i = 0; i < this.subplots.size(); i++) { [EOL]             CategoryPlot subplot = (CategoryPlot) this.subplots.get(i); [EOL]             PlotRenderingInfo subplotInfo = info.getSubplotInfo(i); [EOL]             subplot.handleClick(x, y, subplotInfo); [EOL]         } [EOL]     } [EOL] } <line_num>: 474,485
public void plotChanged(PlotChangeEvent event) { [EOL]     notifyListeners(event); [EOL] } <line_num>: 493,495
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof CombinedRangeCategoryPlot)) { [EOL]         return false; [EOL]     } [EOL]     CombinedRangeCategoryPlot that = (CombinedRangeCategoryPlot) obj; [EOL]     if (this.gap != that.gap) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.subplots, that.subplots)) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 504,519
public Object clone() throws CloneNotSupportedException { [EOL]     CombinedRangeCategoryPlot result = (CombinedRangeCategoryPlot) super.clone(); [EOL]     result.subplots = (List) ObjectUtilities.deepClone(this.subplots); [EOL]     for (Iterator it = result.subplots.iterator(); it.hasNext(); ) { [EOL]         Plot child = (Plot) it.next(); [EOL]         child.setParent(result); [EOL]     } [EOL]     ValueAxis rangeAxis = result.getRangeAxis(); [EOL]     if (rangeAxis != null) { [EOL]         rangeAxis.configure(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 529,546
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException { [EOL]     stream.defaultReadObject(); [EOL]     ValueAxis rangeAxis = getRangeAxis(); [EOL]     if (rangeAxis != null) { [EOL]         rangeAxis.configure(); [EOL]     } [EOL] } <line_num>: 556,568
