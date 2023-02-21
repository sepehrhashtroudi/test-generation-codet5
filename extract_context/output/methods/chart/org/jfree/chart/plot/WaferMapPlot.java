public WaferMapPlot() { [EOL]     this(null); [EOL] } <line_num>: 126,128
public WaferMapPlot(WaferMapDataset dataset) { [EOL]     this(dataset, null); [EOL] } <line_num>: 135,137
public WaferMapPlot(WaferMapDataset dataset, WaferMapRenderer renderer) { [EOL]     super(); [EOL]     this.orientation = PlotOrientation.VERTICAL; [EOL]     this.dataset = dataset; [EOL]     if (dataset != null) { [EOL]         dataset.addChangeListener(this); [EOL]     } [EOL]     this.renderer = renderer; [EOL]     if (renderer != null) { [EOL]         renderer.setPlot(this); [EOL]         renderer.addChangeListener(this); [EOL]     } [EOL] } <line_num>: 145,162
public String getPlotType() { [EOL]     return ("WMAP_Plot"); [EOL] } <line_num>: 169,171
public WaferMapDataset getDataset() { [EOL]     return this.dataset; [EOL] } <line_num>: 178,180
public void setDataset(WaferMapDataset dataset) { [EOL]     if (this.dataset != null) { [EOL]         this.dataset.removeChangeListener(this); [EOL]     } [EOL]     this.dataset = dataset; [EOL]     if (dataset != null) { [EOL]         setDatasetGroup(dataset.getGroup()); [EOL]         dataset.addChangeListener(this); [EOL]     } [EOL]     datasetChanged(new DatasetChangeEvent(this, dataset, new DatasetChangeInfo())); [EOL] } <line_num>: 188,206
public void setRenderer(WaferMapRenderer renderer) { [EOL]     if (this.renderer != null) { [EOL]         this.renderer.removeChangeListener(this); [EOL]     } [EOL]     this.renderer = renderer; [EOL]     if (renderer != null) { [EOL]         renderer.setPlot(this); [EOL]     } [EOL]     fireChangeEvent(); [EOL] } <line_num>: 215,224
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState state, PlotRenderingInfo info) { [EOL]     boolean b1 = (area.getWidth() <= MINIMUM_WIDTH_TO_DRAW); [EOL]     boolean b2 = (area.getHeight() <= MINIMUM_HEIGHT_TO_DRAW); [EOL]     if (b1 || b2) { [EOL]         return; [EOL]     } [EOL]     if (info != null) { [EOL]         info.setPlotArea(area); [EOL]     } [EOL]     RectangleInsets insets = getInsets(); [EOL]     insets.trim(area); [EOL]     drawChipGrid(g2, area); [EOL]     drawWaferEdge(g2, area); [EOL] } <line_num>: 235,258
protected void drawChipGrid(Graphics2D g2, Rectangle2D plotArea) { [EOL]     Shape savedClip = g2.getClip(); [EOL]     g2.setClip(getWaferEdge(plotArea)); [EOL]     Rectangle2D chip = new Rectangle2D.Double(); [EOL]     int xchips = 35; [EOL]     int ychips = 20; [EOL]     double space = 1d; [EOL]     if (this.dataset != null) { [EOL]         xchips = this.dataset.getMaxChipX() + 2; [EOL]         ychips = this.dataset.getMaxChipY() + 2; [EOL]         space = this.dataset.getChipSpace(); [EOL]     } [EOL]     double startX = plotArea.getX(); [EOL]     double startY = plotArea.getY(); [EOL]     double chipWidth = 1d; [EOL]     double chipHeight = 1d; [EOL]     if (plotArea.getWidth() != plotArea.getHeight()) { [EOL]         double major = 0d; [EOL]         double minor = 0d; [EOL]         if (plotArea.getWidth() > plotArea.getHeight()) { [EOL]             major = plotArea.getWidth(); [EOL]             minor = plotArea.getHeight(); [EOL]         } else { [EOL]             major = plotArea.getHeight(); [EOL]             minor = plotArea.getWidth(); [EOL]         } [EOL]         if (plotArea.getWidth() == minor) { [EOL]             startY += (major - minor) / 2; [EOL]             chipWidth = (plotArea.getWidth() - (space * xchips - 1)) / xchips; [EOL]             chipHeight = (plotArea.getWidth() - (space * ychips - 1)) / ychips; [EOL]         } else { [EOL]             startX += (major - minor) / 2; [EOL]             chipWidth = (plotArea.getHeight() - (space * xchips - 1)) / xchips; [EOL]             chipHeight = (plotArea.getHeight() - (space * ychips - 1)) / ychips; [EOL]         } [EOL]     } [EOL]     for (int x = 1; x <= xchips; x++) { [EOL]         double upperLeftX = (startX - chipWidth) + (chipWidth * x) + (space * (x - 1)); [EOL]         for (int y = 1; y <= ychips; y++) { [EOL]             double upperLeftY = (startY - chipHeight) + (chipHeight * y) + (space * (y - 1)); [EOL]             chip.setFrame(upperLeftX, upperLeftY, chipWidth, chipHeight); [EOL]             g2.setColor(Color.white); [EOL]             if (this.dataset.getChipValue(x - 1, ychips - y - 1) != null) { [EOL]                 g2.setPaint(this.renderer.getChipColor(this.dataset.getChipValue(x - 1, ychips - y - 1))); [EOL]             } [EOL]             g2.fill(chip); [EOL]             g2.setColor(Color.lightGray); [EOL]             g2.draw(chip); [EOL]         } [EOL]     } [EOL]     g2.setClip(savedClip); [EOL] } <line_num>: 266,332
protected Ellipse2D getWaferEdge(Rectangle2D plotArea) { [EOL]     Ellipse2D edge = new Ellipse2D.Double(); [EOL]     double diameter = plotArea.getWidth(); [EOL]     double upperLeftX = plotArea.getX(); [EOL]     double upperLeftY = plotArea.getY(); [EOL]     if (plotArea.getWidth() != plotArea.getHeight()) { [EOL]         double major = 0d; [EOL]         double minor = 0d; [EOL]         if (plotArea.getWidth() > plotArea.getHeight()) { [EOL]             major = plotArea.getWidth(); [EOL]             minor = plotArea.getHeight(); [EOL]         } else { [EOL]             major = plotArea.getHeight(); [EOL]             minor = plotArea.getWidth(); [EOL]         } [EOL]         diameter = minor; [EOL]         if (plotArea.getWidth() == minor) { [EOL]             upperLeftY = plotArea.getY() + (major - minor) / 2; [EOL]         } else { [EOL]             upperLeftX = plotArea.getX() + (major - minor) / 2; [EOL]         } [EOL]     } [EOL]     edge.setFrame(upperLeftX, upperLeftY, diameter, diameter); [EOL]     return edge; [EOL] } <line_num>: 341,370
protected void drawWaferEdge(Graphics2D g2, Rectangle2D plotArea) { [EOL]     Ellipse2D waferEdge = getWaferEdge(plotArea); [EOL]     g2.setColor(Color.black); [EOL]     g2.draw(waferEdge); [EOL]     Arc2D notch = null; [EOL]     Rectangle2D waferFrame = waferEdge.getFrame(); [EOL]     double notchDiameter = waferFrame.getWidth() * 0.04; [EOL]     if (this.orientation == PlotOrientation.HORIZONTAL) { [EOL]         Rectangle2D notchFrame = new Rectangle2D.Double(waferFrame.getX() + waferFrame.getWidth() - (notchDiameter / 2), waferFrame.getY() + (waferFrame.getHeight() / 2) - (notchDiameter / 2), notchDiameter, notchDiameter); [EOL]         notch = new Arc2D.Double(notchFrame, 90d, 180d, Arc2D.OPEN); [EOL]     } else { [EOL]         Rectangle2D notchFrame = new Rectangle2D.Double(waferFrame.getX() + (waferFrame.getWidth() / 2) - (notchDiameter / 2), waferFrame.getY() + waferFrame.getHeight() - (notchDiameter / 2), notchDiameter, notchDiameter); [EOL]         notch = new Arc2D.Double(notchFrame, 0d, 180d, Arc2D.OPEN); [EOL]     } [EOL]     g2.setColor(Color.white); [EOL]     g2.fill(notch); [EOL]     g2.setColor(Color.black); [EOL]     g2.draw(notch); [EOL] } <line_num>: 378,414
public LegendItemCollection getLegendItems() { [EOL]     return this.renderer.getLegendCollection(); [EOL] } <line_num>: 421,423
public void rendererChanged(RendererChangeEvent event) { [EOL]     fireChangeEvent(); [EOL] } <line_num>: 430,432