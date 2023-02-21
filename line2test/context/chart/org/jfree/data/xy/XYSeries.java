public XYSeries(Comparable key)
public XYSeries(Comparable key, boolean autoSort)
public XYSeries(Comparable key, boolean autoSort, boolean allowDuplicateXValues)
public double getMinX()
public double getMaxX()
public double getMinY()
public double getMaxY()
private void updateBoundsForAddedItem(XYDataItem item)
private void updateBoundsForRemovedItem(XYDataItem item)
private void findBoundsByIteration()
public boolean getAutoSort()
public boolean getAllowDuplicateXValues()
public int getItemCount()
public List getItems()
public int getMaximumItemCount()
public void setMaximumItemCount(int maximum)
public void add(XYDataItem item)
public void add(double x, double y)
public void add(double x, double y, boolean notify)
public void add(double x, Number y)
public void add(double x, Number y, boolean notify)
public void add(Number x, Number y)
public void add(Number x, Number y, boolean notify)
public void add(XYDataItem item, boolean notify)
public void delete(int start, int end)
public XYDataItem remove(int index)
public XYDataItem remove(Number x)
public void clear()
public XYDataItem getDataItem(int index)
 XYDataItem getRawDataItem(int index)
public Number getX(int index)
public Number getY(int index)
public void updateByIndex(int index, Number y)
private double minIgnoreNaN(double a, double b)
private double maxIgnoreNaN(double a, double b)
public void update(Number x, Number y)
public XYDataItem addOrUpdate(double x, double y)
public XYDataItem addOrUpdate(Number x, Number y)
public XYDataItem addOrUpdate(XYDataItem item)
public int indexOf(Number x)
public double[][] toArray()
public Object clone() throws CloneNotSupportedException
public XYSeries createCopy(int start, int end) throws CloneNotSupportedException
public boolean equals(Object obj)
public int hashCode()
long serialVersionUID=Optional[-5908509288197150436L]
List data
int maximumItemCount=Optional[Integer.MAX_VALUE]
boolean autoSort
boolean allowDuplicateXValues
double minX
double maxX
double minY
double maxY
