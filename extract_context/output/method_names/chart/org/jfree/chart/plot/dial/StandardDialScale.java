public StandardDialScale()
public StandardDialScale(double lowerBound, double upperBound, double startAngle, double extent, double majorTickIncrement, int minorTickCount)
public double getLowerBound()
public void setLowerBound(double lower)
public double getUpperBound()
public void setUpperBound(double upper)
public double getStartAngle()
public void setStartAngle(double angle)
public double getExtent()
public void setExtent(double extent)
public double getTickRadius()
public void setTickRadius(double radius)
public double getMajorTickIncrement()
public void setMajorTickIncrement(double increment)
public double getMajorTickLength()
public void setMajorTickLength(double length)
public Paint getMajorTickPaint()
public void setMajorTickPaint(Paint paint)
public Stroke getMajorTickStroke()
public void setMajorTickStroke(Stroke stroke)
public int getMinorTickCount()
public void setMinorTickCount(int count)
public double getMinorTickLength()
public void setMinorTickLength(double length)
public Paint getMinorTickPaint()
public void setMinorTickPaint(Paint paint)
public Stroke getMinorTickStroke()
public void setMinorTickStroke(Stroke stroke)
public double getTickLabelOffset()
public void setTickLabelOffset(double offset)
public Font getTickLabelFont()
public void setTickLabelFont(Font font)
public Paint getTickLabelPaint()
public void setTickLabelPaint(Paint paint)
public boolean getTickLabelsVisible()
public void setTickLabelsVisible(boolean visible)
public NumberFormat getTickLabelFormatter()
public void setTickLabelFormatter(NumberFormat formatter)
public boolean getFirstTickLabelVisible()
public void setFirstTickLabelVisible(boolean visible)
public boolean isClippedToWindow()
public void draw(Graphics2D g2, DialPlot plot, Rectangle2D frame, Rectangle2D view)
public double valueToAngle(double value)
public double angleToValue(double angle)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
