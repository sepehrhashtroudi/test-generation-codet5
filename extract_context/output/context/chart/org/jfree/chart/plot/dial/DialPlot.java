public DialPlot()
public DialPlot(ValueDataset dataset)
public DialLayer getBackground()
public void setBackground(DialLayer background)
public DialLayer getCap()
public void setCap(DialLayer cap)
public DialFrame getDialFrame()
public void setDialFrame(DialFrame frame)
public double getViewX()
public double getViewY()
public double getViewWidth()
public double getViewHeight()
public void setView(double x, double y, double w, double h)
public void addLayer(DialLayer layer)
public int getLayerIndex(DialLayer layer)
public void removeLayer(int index)
public void removeLayer(DialLayer layer)
public void addPointer(DialPointer pointer)
public int getPointerIndex(DialPointer pointer)
public void removePointer(int index)
public void removePointer(DialPointer pointer)
public DialPointer getPointerForDataset(int datasetIndex)
public ValueDataset getDataset()
public ValueDataset getDataset(int index)
public void setDataset(ValueDataset dataset)
public void setDataset(int index, ValueDataset dataset)
public int getDatasetCount()
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info)
private Rectangle2D viewToFrame(Rectangle2D view)
public double getValue(int datasetIndex)
public void addScale(int index, DialScale scale)
public DialScale getScale(int index)
public void mapDatasetToScale(int index, int scaleIndex)
public DialScale getScaleForDataset(int datasetIndex)
public static Rectangle2D rectangleByRadius(Rectangle2D rect, double radiusW, double radiusH)
public void dialLayerChanged(DialLayerChangeEvent event)
public boolean equals(Object obj)
public int hashCode()
public String getPlotType()
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
DialLayer background
DialLayer cap
DialFrame dialFrame
ObjectList datasets
ObjectList scales
ObjectList datasetToScaleMap
List layers
List pointers
double viewX
double viewY
double viewW
double viewH
