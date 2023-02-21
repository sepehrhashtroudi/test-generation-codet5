public StandardXYBarPainter() { [EOL] } <line_num>: 69,70
public void paintBar(Graphics2D g2, XYBarRenderer renderer, int row, int column, boolean selected, RectangularShape bar, RectangleEdge base) { [EOL]     Paint itemPaint = renderer.getItemPaint(row, column, selected); [EOL]     GradientPaintTransformer t = renderer.getGradientPaintTransformer(); [EOL]     if (t != null && itemPaint instanceof GradientPaint) { [EOL]         itemPaint = t.transform((GradientPaint) itemPaint, bar); [EOL]     } [EOL]     g2.setPaint(itemPaint); [EOL]     g2.fill(bar); [EOL]     if (renderer.isDrawBarOutline()) { [EOL]         Stroke stroke = renderer.getItemOutlineStroke(row, column, selected); [EOL]         Paint paint = renderer.getItemOutlinePaint(row, column, selected); [EOL]         if (stroke != null && paint != null) { [EOL]             g2.setStroke(stroke); [EOL]             g2.setPaint(paint); [EOL]             g2.draw(bar); [EOL]         } [EOL]     } [EOL] } <line_num>: 86,111
public void paintBarShadow(Graphics2D g2, XYBarRenderer renderer, int row, int column, boolean selected, RectangularShape bar, RectangleEdge base, boolean pegShadow) { [EOL]     Paint itemPaint = renderer.getItemPaint(row, column, selected); [EOL]     if (itemPaint instanceof Color) { [EOL]         Color c = (Color) itemPaint; [EOL]         if (c.getAlpha() == 0) { [EOL]             return; [EOL]         } [EOL]     } [EOL]     RectangularShape shadow = createShadow(bar, renderer.getShadowXOffset(), renderer.getShadowYOffset(), base, pegShadow); [EOL]     g2.setPaint(Color.gray); [EOL]     g2.fill(shadow); [EOL] } <line_num>: 128,147
private Rectangle2D createShadow(RectangularShape bar, double xOffset, double yOffset, RectangleEdge base, boolean pegShadow) { [EOL]     double x0 = bar.getMinX(); [EOL]     double x1 = bar.getMaxX(); [EOL]     double y0 = bar.getMinY(); [EOL]     double y1 = bar.getMaxY(); [EOL]     if (base == RectangleEdge.TOP) { [EOL]         x0 += xOffset; [EOL]         x1 += xOffset; [EOL]         if (!pegShadow) { [EOL]             y0 += yOffset; [EOL]         } [EOL]         y1 += yOffset; [EOL]     } else if (base == RectangleEdge.BOTTOM) { [EOL]         x0 += xOffset; [EOL]         x1 += xOffset; [EOL]         y0 += yOffset; [EOL]         if (!pegShadow) { [EOL]             y1 += yOffset; [EOL]         } [EOL]     } else if (base == RectangleEdge.LEFT) { [EOL]         if (!pegShadow) { [EOL]             x0 += xOffset; [EOL]         } [EOL]         x1 += xOffset; [EOL]         y0 += yOffset; [EOL]         y1 += yOffset; [EOL]     } else if (base == RectangleEdge.RIGHT) { [EOL]         x0 += xOffset; [EOL]         if (!pegShadow) { [EOL]             x1 += xOffset; [EOL]         } [EOL]         y0 += yOffset; [EOL]         y1 += yOffset; [EOL]     } [EOL]     return new Rectangle2D.Double(x0, y0, (x1 - x0), (y1 - y0)); [EOL] } <line_num>: 160,199
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof StandardXYBarPainter)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 208,216
public int hashCode() { [EOL]     int hash = 37; [EOL]     return hash; [EOL] } <line_num>: 223,227