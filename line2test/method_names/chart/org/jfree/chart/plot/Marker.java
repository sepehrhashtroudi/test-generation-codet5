protected Marker()
protected Marker(Paint paint)
protected Marker(Paint paint, Stroke stroke, Paint outlinePaint, Stroke outlineStroke, float alpha)
public Paint getPaint()
public void setPaint(Paint paint)
public Stroke getStroke()
public void setStroke(Stroke stroke)
public Paint getOutlinePaint()
public void setOutlinePaint(Paint paint)
public Stroke getOutlineStroke()
public void setOutlineStroke(Stroke stroke)
public float getAlpha()
public void setAlpha(float alpha)
public String getLabel()
public void setLabel(String label)
public Font getLabelFont()
public void setLabelFont(Font font)
public Paint getLabelPaint()
public void setLabelPaint(Paint paint)
public RectangleAnchor getLabelAnchor()
public void setLabelAnchor(RectangleAnchor anchor)
public RectangleInsets getLabelOffset()
public void setLabelOffset(RectangleInsets offset)
public LengthAdjustmentType getLabelOffsetType()
public void setLabelOffsetType(LengthAdjustmentType adj)
public TextAnchor getLabelTextAnchor()
public void setLabelTextAnchor(TextAnchor anchor)
public void addChangeListener(MarkerChangeListener listener)
public void removeChangeListener(MarkerChangeListener listener)
public void notifyListeners(MarkerChangeEvent event)
public EventListener[] getListeners(Class listenerType)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
