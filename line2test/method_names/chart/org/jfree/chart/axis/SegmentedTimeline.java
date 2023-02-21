public SegmentedTimeline(long segmentSize, int segmentsIncluded, int segmentsExcluded)
protected Segment()
protected Segment(long millisecond)
public SegmentRange(long fromMillisecond, long toMillisecond)
public BaseTimelineSegmentRange(long fromDomainValue, long toDomainValue)
public static long firstMondayAfter1900()
public static SegmentedTimeline newMondayThroughFridayTimeline()
public static SegmentedTimeline newFifteenMinuteTimeline()
public boolean getAdjustForDaylightSaving()
public void setAdjustForDaylightSaving(boolean adjust)
public void setStartTime(long millisecond)
public long getStartTime()
public int getSegmentsExcluded()
public long getSegmentsExcludedSize()
public int getGroupSegmentCount()
public long getSegmentsGroupSize()
public int getSegmentsIncluded()
public long getSegmentsIncludedSize()
public long getSegmentSize()
public List getExceptionSegments()
public void setExceptionSegments(List exceptionSegments)
public SegmentedTimeline getBaseTimeline()
public void setBaseTimeline(SegmentedTimeline baseTimeline)
public long toTimelineValue(long millisecond)
public long toTimelineValue(Date date)
public long toMillisecond(long timelineValue)
public long getTimeFromLong(long date)
public boolean containsDomainValue(long millisecond)
public boolean containsDomainValue(Date date)
public boolean containsDomainRange(long domainValueStart, long domainValueEnd)
public boolean containsDomainRange(Date dateDomainValueStart, Date dateDomainValueEnd)
public void addException(long millisecond)
public void addException(long fromDomainValue, long toDomainValue)
public void addException(Date exceptionDate)
public void addExceptions(List exceptionList)
private void addException(Segment segment)
public void addBaseTimelineException(long domainValue)
public void addBaseTimelineException(Date date)
public void addBaseTimelineExclusions(long fromBaseDomainValue, long toBaseDomainValue)
public long getExceptionSegmentCount(long fromMillisecond, long toMillisecond)
public Segment getSegment(long millisecond)
public Segment getSegment(Date date)
private boolean equals(Object o, Object p)
public boolean equals(Object o)
public int hashCode()
private int binarySearchExceptionSegments(Segment segment)
public long getTime(Date date)
public Date getDate(long value)
public Object clone() throws CloneNotSupportedException
public long calculateSegmentNumber(long millis)
public long getSegmentNumber()
public long getSegmentCount()
public long getSegmentStart()
public long getSegmentEnd()
public long getMillisecond()
public Date getDate()
public boolean contains(long millis)
public boolean contains(long from, long to)
public boolean contains(Segment segment)
public boolean contained(long from, long to)
public Segment intersect(long from, long to)
public boolean before(Segment other)
public boolean after(Segment other)
public boolean equals(Object object)
public Segment copy()
public int compareTo(Object object)
public boolean inIncludeSegments()
public boolean inExcludeSegments()
private long getSegmentNumberRelativeToGroup()
public boolean inExceptionSegments()
public void inc(long n)
public void inc()
public void dec(long n)
public void dec()
public void moveIndexToStart()
public void moveIndexToEnd()
public long getSegmentCount()
public Segment intersect(long from, long to)
public boolean inIncludeSegments()
public boolean inExcludeSegments()
public void inc(long n)
