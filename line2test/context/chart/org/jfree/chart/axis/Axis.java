protected Axis(String label)
public boolean isVisible()
public void setVisible(boolean flag)
public String getLabel()
public void setLabel(String label)
public Font getLabelFont()
public void setLabelFont(Font font)
public Paint getLabelPaint()
public void setLabelPaint(Paint paint)
public RectangleInsets getLabelInsets()
public void setLabelInsets(RectangleInsets insets)
public void setLabelInsets(RectangleInsets insets, boolean notify)
public double getLabelAngle()
public void setLabelAngle(double angle)
public String getLabelToolTip()
public void setLabelToolTip(String text)
public String getLabelURL()
public void setLabelURL(String url)
public boolean isAxisLineVisible()
public void setAxisLineVisible(boolean visible)
public Paint getAxisLinePaint()
public void setAxisLinePaint(Paint paint)
public Stroke getAxisLineStroke()
public void setAxisLineStroke(Stroke stroke)
public boolean isTickLabelsVisible()
public void setTickLabelsVisible(boolean flag)
public boolean isMinorTickMarksVisible()
public void setMinorTickMarksVisible(boolean flag)
public Font getTickLabelFont()
public void setTickLabelFont(Font font)
public Paint getTickLabelPaint()
public void setTickLabelPaint(Paint paint)
public RectangleInsets getTickLabelInsets()
public void setTickLabelInsets(RectangleInsets insets)
public boolean isTickMarksVisible()
public void setTickMarksVisible(boolean flag)
public float getTickMarkInsideLength()
public void setTickMarkInsideLength(float length)
public float getTickMarkOutsideLength()
public void setTickMarkOutsideLength(float length)
public Stroke getTickMarkStroke()
public void setTickMarkStroke(Stroke stroke)
public Paint getTickMarkPaint()
public void setTickMarkPaint(Paint paint)
public float getMinorTickMarkInsideLength()
public void setMinorTickMarkInsideLength(float length)
public float getMinorTickMarkOutsideLength()
public void setMinorTickMarkOutsideLength(float length)
public Plot getPlot()
public void setPlot(Plot plot)
public double getFixedDimension()
public void setFixedDimension(double dimension)
public abstract void configure()
public abstract AxisSpace reserveSpace(Graphics2D g2, Plot plot, Rectangle2D plotArea, RectangleEdge edge, AxisSpace space)
public abstract AxisState draw(Graphics2D g2, double cursor, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, PlotRenderingInfo plotState)
public abstract List refreshTicks(Graphics2D g2, AxisState state, Rectangle2D dataArea, RectangleEdge edge)
protected void createAndAddEntity(double cursor, AxisState state, Rectangle2D dataArea, RectangleEdge edge, PlotRenderingInfo plotState)
public void addChangeListener(AxisChangeListener listener)
public void removeChangeListener(AxisChangeListener listener)
public boolean hasListener(EventListener listener)
protected void notifyListeners(AxisChangeEvent event)
protected void fireChangeEvent()
protected Rectangle2D getLabelEnclosure(Graphics2D g2, RectangleEdge edge)
protected AxisState drawLabel(String label, Graphics2D g2, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, AxisState state, PlotRenderingInfo plotState)
protected void drawAxisLine(Graphics2D g2, double cursor, Rectangle2D dataArea, RectangleEdge edge)
public Object clone() throws CloneNotSupportedException
public boolean equals(Object obj)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[7719289504573298271L]
boolean DEFAULT_AXIS_VISIBLE=Optional[true]
Font DEFAULT_AXIS_LABEL_FONT=Optional[new Font("Tahoma", Font.PLAIN, 12)]
Paint DEFAULT_AXIS_LABEL_PAINT=Optional[Color.black]
RectangleInsets DEFAULT_AXIS_LABEL_INSETS=Optional[new RectangleInsets(3.0, 3.0, 3.0, 3.0)]
Paint DEFAULT_AXIS_LINE_PAINT=Optional[Color.gray]
Stroke DEFAULT_AXIS_LINE_STROKE=Optional[new BasicStroke(1.0f)]
boolean DEFAULT_TICK_LABELS_VISIBLE=Optional[true]
Font DEFAULT_TICK_LABEL_FONT=Optional[new Font("Tahoma", Font.PLAIN, 12)]
Paint DEFAULT_TICK_LABEL_PAINT=Optional[Color.black]
RectangleInsets DEFAULT_TICK_LABEL_INSETS=Optional[new RectangleInsets(2.0, 4.0, 2.0, 4.0)]
boolean DEFAULT_TICK_MARKS_VISIBLE=Optional[true]
Stroke DEFAULT_TICK_MARK_STROKE=Optional[new BasicStroke(1)]
Paint DEFAULT_TICK_MARK_PAINT=Optional[Color.gray]
float DEFAULT_TICK_MARK_INSIDE_LENGTH=Optional[0.0f]
float DEFAULT_TICK_MARK_OUTSIDE_LENGTH=Optional[2.0f]
boolean visible
String label
Font labelFont
Paint labelPaint
RectangleInsets labelInsets
double labelAngle
String labelToolTip
String labelURL
boolean axisLineVisible
Stroke axisLineStroke
Paint axisLinePaint
boolean tickLabelsVisible
Font tickLabelFont
Paint tickLabelPaint
RectangleInsets tickLabelInsets
boolean tickMarksVisible
float tickMarkInsideLength
float tickMarkOutsideLength
boolean minorTickMarksVisible
float minorTickMarkInsideLength
float minorTickMarkOutsideLength
Stroke tickMarkStroke
Paint tickMarkPaint
double fixedDimension
Plot plot
EventListenerList listenerList
