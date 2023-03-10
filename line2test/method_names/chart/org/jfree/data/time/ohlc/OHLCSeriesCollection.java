public OHLCSeriesCollection()
public TimePeriodAnchor getXPosition()
public void setXPosition(TimePeriodAnchor anchor)
public void addSeries(OHLCSeries series)
public int getSeriesCount()
public OHLCSeries getSeries(int series)
public Comparable getSeriesKey(int series)
public int getItemCount(int series)
protected synchronized long getX(RegularTimePeriod period)
public double getXValue(int series, int item)
public Number getX(int series, int item)
public Number getY(int series, int item)
public double getOpenValue(int series, int item)
public Number getOpen(int series, int item)
public double getCloseValue(int series, int item)
public Number getClose(int series, int item)
public double getHighValue(int series, int item)
public Number getHigh(int series, int item)
public double getLowValue(int series, int item)
public Number getLow(int series, int item)
public Number getVolume(int series, int item)
public double getVolumeValue(int series, int item)
public void removeSeries(int index)
public boolean removeSeries(OHLCSeries series)
public void removeAllSeries()
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
