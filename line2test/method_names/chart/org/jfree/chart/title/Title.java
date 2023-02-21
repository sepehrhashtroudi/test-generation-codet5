protected Title()
protected Title(RectangleEdge position, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment)
protected Title(RectangleEdge position, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, RectangleInsets padding)
public boolean isVisible()
public void setVisible(boolean visible)
public RectangleEdge getPosition()
public void setPosition(RectangleEdge position)
public HorizontalAlignment getHorizontalAlignment()
public void setHorizontalAlignment(HorizontalAlignment alignment)
public VerticalAlignment getVerticalAlignment()
public void setVerticalAlignment(VerticalAlignment alignment)
public boolean getNotify()
public void setNotify(boolean flag)
public abstract void draw(Graphics2D g2, Rectangle2D area)
public Object clone() throws CloneNotSupportedException
public void addChangeListener(TitleChangeListener listener)
public void removeChangeListener(TitleChangeListener listener)
protected void notifyListeners(TitleChangeEvent event)
public boolean equals(Object obj)
public int hashCode()
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
