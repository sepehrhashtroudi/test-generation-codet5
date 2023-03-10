public TimeSeriesCollection()
public TimeSeriesCollection(TimeZone zone)
public TimeSeriesCollection(TimeSeries series)
public TimeSeriesCollection(TimeSeries series, TimeZone zone)
public DomainOrder getDomainOrder()
public TimePeriodAnchor getXPosition()
public void setXPosition(TimePeriodAnchor anchor)
public List getSeries()
public int getSeriesCount()
public int indexOf(TimeSeries series)
public TimeSeries getSeries(int series)
public TimeSeries getSeries(Comparable key)
public Comparable getSeriesKey(int series)
public void addSeries(TimeSeries series)
public void removeSeries(TimeSeries series)
public void removeSeries(int index)
public void removeAllSeries()
public int getItemCount(int series)
public double getXValue(int series, int item)
public Number getX(int series, int item)
protected synchronized long getX(RegularTimePeriod period)
public synchronized Number getStartX(int series, int item)
public synchronized Number getEndX(int series, int item)
public Number getY(int series, int item)
public Number getStartY(int series, int item)
public Number getEndY(int series, int item)
public boolean isSelected(int series, int item)
public void setSelected(int series, int item, boolean selected)
public void setSelected(int series, int item, boolean selected, boolean notify)
public void clearSelection()
public void fireSelectionEvent()
public int[] getSurroundingItems(int series, long milliseconds)
public double getDomainLowerBound(boolean includeInterval)
public double getDomainUpperBound(boolean includeInterval)
public Range getDomainBounds(boolean includeInterval)
public Range getDomainBounds(List visibleSeriesKeys, boolean includeInterval)
public Range getRangeBounds(List visibleSeriesKeys, Range xRange, boolean includeInterval)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
long serialVersionUID=Optional[834149929022371137L]
List data
Calendar workingCalendar
TimePeriodAnchor xPosition
