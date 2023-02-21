public DefaultTableXYDataset()
public DefaultTableXYDataset(boolean autoPrune)
public boolean isAutoPrune()
public void addSeries(XYSeries series)
private void updateXPoints(XYSeries series)
public void updateXPoints()
public int getSeriesCount()
public int getItemCount()
public XYSeries getSeries(int series)
public Comparable getSeriesKey(int series)
public int getItemCount(int series)
public Number getX(int series, int item)
public Number getStartX(int series, int item)
public Number getEndX(int series, int item)
public Number getY(int series, int index)
public Number getStartY(int series, int item)
public Number getEndY(int series, int item)
public void removeAllSeries()
public void removeSeries(XYSeries series)
public void removeSeries(int series)
public void removeAllValuesForX(Number x)
protected boolean canPrune(Number x)
public void prune()
public void seriesChanged(SeriesChangeEvent event)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
public double getDomainLowerBound(boolean includeInterval)
public double getDomainUpperBound(boolean includeInterval)
public Range getDomainBounds(boolean includeInterval)
public double getIntervalPositionFactor()
public void setIntervalPositionFactor(double d)
public double getIntervalWidth()
public void setIntervalWidth(double d)
public boolean isAutoWidth()
public void setAutoWidth(boolean b)
