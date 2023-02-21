public AggregateSummaryStatistics()
public AggregateSummaryStatistics(SummaryStatistics prototypeStatistics) throws NullArgumentException
public AggregateSummaryStatistics(SummaryStatistics prototypeStatistics, SummaryStatistics initialStatistics)
public AggregatingSummaryStatistics(SummaryStatistics aggregateStatistics)
public double getMax()
public double getMean()
public double getMin()
public long getN()
public double getStandardDeviation()
public double getSum()
public double getVariance()
public double getSumOfLogs()
public double getGeometricMean()
public double getSumsq()
public double getSecondMoment()
public StatisticalSummary getSummary()
public SummaryStatistics createContributingStatistics()
public static StatisticalSummaryValues aggregate(Collection<SummaryStatistics> statistics)
public void addValue(double value)
public boolean equals(Object object)
public int hashCode()
long serialVersionUID=Optional[-8207112444016386906L]
SummaryStatistics statisticsPrototype
SummaryStatistics statistics