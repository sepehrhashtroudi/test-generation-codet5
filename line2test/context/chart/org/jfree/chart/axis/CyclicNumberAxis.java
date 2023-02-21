public CyclicNumberAxis(double period)
public CyclicNumberAxis(double period, double offset)
public CyclicNumberAxis(double period, String label)
public CyclicNumberAxis(double period, double offset, String label)
public CycleBoundTick(boolean mapToLastCycle, Number number, String label, TextAnchor textAnchor, TextAnchor rotationAnchor, double angle)
public boolean isAdvanceLineVisible()
public void setAdvanceLineVisible(boolean visible)
public Paint getAdvanceLinePaint()
public void setAdvanceLinePaint(Paint paint)
public Stroke getAdvanceLineStroke()
public void setAdvanceLineStroke(Stroke stroke)
public boolean isBoundMappedToLastCycle()
public void setBoundMappedToLastCycle(boolean boundMappedToLastCycle)
protected void selectHorizontalAutoTickUnit(Graphics2D g2, Rectangle2D drawArea, Rectangle2D dataArea, RectangleEdge edge)
protected void selectVerticalAutoTickUnit(Graphics2D g2, Rectangle2D drawArea, Rectangle2D dataArea, RectangleEdge edge)
protected float[] calculateAnchorPoint(ValueTick tick, double cursor, Rectangle2D dataArea, RectangleEdge edge)
protected List refreshTicksHorizontal(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge)
protected List refreshVerticalTicks(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge)
public double java2DToValue(double java2DValue, Rectangle2D dataArea, RectangleEdge edge)
public double valueToJava2D(double value, Rectangle2D dataArea, RectangleEdge edge)
public void centerRange(double value)
public void setAutoRangeMinimumSize(double size, boolean notify)
public void setFixedAutoRange(double length)
public void setRange(Range range, boolean turnOffAutoRange, boolean notify)
public double getCycleBound()
public double getOffset()
public void setOffset(double offset)
public double getPeriod()
public void setPeriod(double period)
protected AxisState drawTickMarksAndLabels(Graphics2D g2, double cursor, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, PlotRenderingInfo info)
public AxisState draw(Graphics2D g2, double cursor, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, PlotRenderingInfo plotState)
public AxisSpace reserveSpace(Graphics2D g2, Plot plot, Rectangle2D plotArea, RectangleEdge edge, AxisSpace space)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
public boolean equals(Object obj)
long serialVersionUID=Optional[-7514160997164582554L]
Stroke DEFAULT_ADVANCE_LINE_STROKE=Optional[new BasicStroke(1.0f)]
Paint DEFAULT_ADVANCE_LINE_PAINT=Optional[Color.gray]
double offset
double period
boolean boundMappedToLastCycle
boolean advanceLineVisible
Stroke advanceLineStroke=Optional[DEFAULT_ADVANCE_LINE_STROKE]
Paint advanceLinePaint
boolean internalMarkerWhenTicksOverlap
Tick internalMarkerCycleBoundTick
