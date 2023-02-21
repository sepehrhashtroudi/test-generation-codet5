public SegmentedTimeline(long segmentSize, int segmentsIncluded, int segmentsExcluded) { [EOL]     this.segmentSize = segmentSize; [EOL]     this.segmentsIncluded = segmentsIncluded; [EOL]     this.segmentsExcluded = segmentsExcluded; [EOL]     this.groupSegmentCount = this.segmentsIncluded + this.segmentsExcluded; [EOL]     this.segmentsIncludedSize = this.segmentsIncluded * this.segmentSize; [EOL]     this.segmentsExcludedSize = this.segmentsExcluded * this.segmentSize; [EOL]     this.segmentsGroupSize = this.segmentsIncludedSize + this.segmentsExcludedSize; [EOL]     int offset = TimeZone.getDefault().getRawOffset(); [EOL]     TimeZone z = new SimpleTimeZone(offset, "UTC-" + offset); [EOL]     this.workingCalendarNoDST = new GregorianCalendar(z, Locale.getDefault()); [EOL] } <line_num>: 326,343
protected Segment() { [EOL] } <line_num>: 1248,1250
protected Segment(long millisecond) { [EOL]     this.segmentNumber = calculateSegmentNumber(millisecond); [EOL]     this.segmentStart = SegmentedTimeline.this.startTime + this.segmentNumber * SegmentedTimeline.this.segmentSize; [EOL]     this.segmentEnd = this.segmentStart + SegmentedTimeline.this.segmentSize - 1; [EOL]     this.millisecond = millisecond; [EOL] } <line_num>: 1257,1264
public SegmentRange(long fromMillisecond, long toMillisecond) { [EOL]     Segment start = getSegment(fromMillisecond); [EOL]     Segment end = getSegment(toMillisecond); [EOL]     this.millisecond = fromMillisecond; [EOL]     this.segmentNumber = calculateSegmentNumber(fromMillisecond); [EOL]     this.segmentStart = start.segmentStart; [EOL]     this.segmentEnd = end.segmentEnd; [EOL]     this.segmentCount = (end.getSegmentNumber() - start.getSegmentNumber() + 1); [EOL] } <line_num>: 1630,1646
public BaseTimelineSegmentRange(long fromDomainValue, long toDomainValue) { [EOL]     super(fromDomainValue, toDomainValue); [EOL] } <line_num>: 1743,1746
public static long firstMondayAfter1900() { [EOL]     int offset = TimeZone.getDefault().getRawOffset(); [EOL]     TimeZone z = new SimpleTimeZone(offset, "UTC-" + offset); [EOL]     Calendar cal = new GregorianCalendar(z); [EOL]     cal.set(1900, 0, 1, 0, 0, 0); [EOL]     cal.set(Calendar.MILLISECOND, 0); [EOL]     while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) { [EOL]         cal.add(Calendar.DATE, 1); [EOL]     } [EOL]     return cal.getTime().getTime(); [EOL] } <line_num>: 353,368
public static SegmentedTimeline newMondayThroughFridayTimeline() { [EOL]     SegmentedTimeline timeline = new SegmentedTimeline(DAY_SEGMENT_SIZE, 5, 2); [EOL]     timeline.setStartTime(firstMondayAfter1900()); [EOL]     return timeline; [EOL] } <line_num>: 378,383
public static SegmentedTimeline newFifteenMinuteTimeline() { [EOL]     SegmentedTimeline timeline = new SegmentedTimeline(FIFTEEN_MINUTE_SEGMENT_SIZE, 28, 68); [EOL]     timeline.setStartTime(firstMondayAfter1900() + 36 * timeline.getSegmentSize()); [EOL]     timeline.setBaseTimeline(newMondayThroughFridayTimeline()); [EOL]     return timeline; [EOL] } <line_num>: 402,409
public boolean getAdjustForDaylightSaving() { [EOL]     return this.adjustForDaylightSaving; [EOL] } <line_num>: 417,419
public void setAdjustForDaylightSaving(boolean adjust) { [EOL]     this.adjustForDaylightSaving = adjust; [EOL] } <line_num>: 427,429
public void setStartTime(long millisecond) { [EOL]     this.startTime = millisecond; [EOL] } <line_num>: 441,443
public long getStartTime() { [EOL]     return this.startTime; [EOL] } <line_num>: 451,453
public int getSegmentsExcluded() { [EOL]     return this.segmentsExcluded; [EOL] } <line_num>: 460,462
public long getSegmentsExcludedSize() { [EOL]     return this.segmentsExcludedSize; [EOL] } <line_num>: 470,472
public int getGroupSegmentCount() { [EOL]     return this.groupSegmentCount; [EOL] } <line_num>: 480,482
public long getSegmentsGroupSize() { [EOL]     return this.segmentsGroupSize; [EOL] } <line_num>: 490,492
public int getSegmentsIncluded() { [EOL]     return this.segmentsIncluded; [EOL] } <line_num>: 499,501
public long getSegmentsIncludedSize() { [EOL]     return this.segmentsIncludedSize; [EOL] } <line_num>: 508,510
public long getSegmentSize() { [EOL]     return this.segmentSize; [EOL] } <line_num>: 517,519
public List getExceptionSegments() { [EOL]     return Collections.unmodifiableList(this.exceptionSegments); [EOL] } <line_num>: 527,529
public void setExceptionSegments(List exceptionSegments) { [EOL]     this.exceptionSegments = exceptionSegments; [EOL] } <line_num>: 536,538
public SegmentedTimeline getBaseTimeline() { [EOL]     return this.baseTimeline; [EOL] } <line_num>: 545,547
public void setBaseTimeline(SegmentedTimeline baseTimeline) { [EOL]     if (baseTimeline != null) { [EOL]         if (baseTimeline.getSegmentSize() < this.segmentSize) { [EOL]             throw new IllegalArgumentException("baseTimeline.getSegmentSize() " + "is smaller than segmentSize"); [EOL]         } else if (baseTimeline.getStartTime() > this.startTime) { [EOL]             throw new IllegalArgumentException("baseTimeline.getStartTime() is after startTime"); [EOL]         } else if ((baseTimeline.getSegmentSize() % this.segmentSize) != 0) { [EOL]             throw new IllegalArgumentException("baseTimeline.getSegmentSize() is not multiple of " + "segmentSize"); [EOL]         } else if (((this.startTime - baseTimeline.getStartTime()) % this.segmentSize) != 0) { [EOL]             throw new IllegalArgumentException("baseTimeline is not aligned"); [EOL]         } [EOL]     } [EOL]     this.baseTimeline = baseTimeline; [EOL] } <line_num>: 554,580
public long toTimelineValue(long millisecond) { [EOL]     long result; [EOL]     long rawMilliseconds = millisecond - this.startTime; [EOL]     long groupMilliseconds = rawMilliseconds % this.segmentsGroupSize; [EOL]     long groupIndex = rawMilliseconds / this.segmentsGroupSize; [EOL]     if (groupMilliseconds >= this.segmentsIncludedSize) { [EOL]         result = toTimelineValue(this.startTime + this.segmentsGroupSize * (groupIndex + 1)); [EOL]     } else { [EOL]         Segment segment = getSegment(millisecond); [EOL]         if (segment.inExceptionSegments()) { [EOL]             int p; [EOL]             while ((p = binarySearchExceptionSegments(segment)) >= 0) { [EOL]                 segment = getSegment(millisecond = ((Segment) this.exceptionSegments.get(p)).getSegmentEnd() + 1); [EOL]             } [EOL]             result = toTimelineValue(millisecond); [EOL]         } else { [EOL]             long shiftedSegmentedValue = millisecond - this.startTime; [EOL]             long x = shiftedSegmentedValue % this.segmentsGroupSize; [EOL]             long y = shiftedSegmentedValue / this.segmentsGroupSize; [EOL]             long wholeExceptionsBeforeDomainValue = getExceptionSegmentCount(this.startTime, millisecond - 1); [EOL]             if (x < this.segmentsIncludedSize) { [EOL]                 result = this.segmentsIncludedSize * y + x - wholeExceptionsBeforeDomainValue * this.segmentSize; [EOL]             } else { [EOL]                 result = this.segmentsIncludedSize * (y + 1) - wholeExceptionsBeforeDomainValue * this.segmentSize; [EOL]             } [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 591,643
public long toTimelineValue(Date date) { [EOL]     return toTimelineValue(getTime(date)); [EOL] } <line_num>: 654,657
public long toMillisecond(long timelineValue) { [EOL]     Segment result = new Segment(this.startTime + timelineValue + (timelineValue / this.segmentsIncludedSize) * this.segmentsExcludedSize); [EOL]     long lastIndex = this.startTime; [EOL]     while (lastIndex <= result.segmentStart) { [EOL]         long exceptionSegmentCount; [EOL]         while ((exceptionSegmentCount = getExceptionSegmentCount(lastIndex, (result.millisecond / this.segmentSize) * this.segmentSize - 1)) > 0) { [EOL]             lastIndex = result.segmentStart; [EOL]             for (int i = 0; i < exceptionSegmentCount; i++) { [EOL]                 do { [EOL]                     result.inc(); [EOL]                 } while (result.inExcludeSegments()); [EOL]             } [EOL]         } [EOL]         lastIndex = result.segmentStart; [EOL]         while (result.inExceptionSegments() || result.inExcludeSegments()) { [EOL]             result.inc(); [EOL]             lastIndex += this.segmentSize; [EOL]         } [EOL]         lastIndex++; [EOL]     } [EOL]     return getTimeFromLong(result.millisecond); [EOL] } <line_num>: 666,706
public long getTimeFromLong(long date) { [EOL]     long result = date; [EOL]     if (this.adjustForDaylightSaving) { [EOL]         this.workingCalendarNoDST.setTime(new Date(date)); [EOL]         this.workingCalendar.set(this.workingCalendarNoDST.get(Calendar.YEAR), this.workingCalendarNoDST.get(Calendar.MONTH), this.workingCalendarNoDST.get(Calendar.DATE), this.workingCalendarNoDST.get(Calendar.HOUR_OF_DAY), this.workingCalendarNoDST.get(Calendar.MINUTE), this.workingCalendarNoDST.get(Calendar.SECOND)); [EOL]         this.workingCalendar.set(Calendar.MILLISECOND, this.workingCalendarNoDST.get(Calendar.MILLISECOND)); [EOL]         result = this.workingCalendar.getTime().getTime(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 715,734
public boolean containsDomainValue(long millisecond) { [EOL]     Segment segment = getSegment(millisecond); [EOL]     return segment.inIncludeSegments(); [EOL] } <line_num>: 743,746
public boolean containsDomainValue(Date date) { [EOL]     return containsDomainValue(getTime(date)); [EOL] } <line_num>: 755,757
public boolean containsDomainRange(long domainValueStart, long domainValueEnd) { [EOL]     if (domainValueEnd < domainValueStart) { [EOL]         throw new IllegalArgumentException("domainValueEnd (" + domainValueEnd + ") < domainValueStart (" + domainValueStart + ")"); [EOL]     } [EOL]     Segment segment = getSegment(domainValueStart); [EOL]     boolean contains = true; [EOL]     do { [EOL]         contains = (segment.inIncludeSegments()); [EOL]         if (segment.contains(domainValueEnd)) { [EOL]             break; [EOL]         } else { [EOL]             segment.inc(); [EOL]         } [EOL]     } while (contains); [EOL]     return (contains); [EOL] } <line_num>: 769,789
public boolean containsDomainRange(Date dateDomainValueStart, Date dateDomainValueEnd) { [EOL]     return containsDomainRange(getTime(dateDomainValueStart), getTime(dateDomainValueEnd)); [EOL] } <line_num>: 801,805
public void addException(long millisecond) { [EOL]     addException(new Segment(millisecond)); [EOL] } <line_num>: 819,821
public void addException(long fromDomainValue, long toDomainValue) { [EOL]     addException(new SegmentRange(fromDomainValue, toDomainValue)); [EOL] } <line_num>: 838,840
public void addException(Date exceptionDate) { [EOL]     addException(getTime(exceptionDate)); [EOL] } <line_num>: 853,856
public void addExceptions(List exceptionList) { [EOL]     for (Iterator iter = exceptionList.iterator(); iter.hasNext(); ) { [EOL]         addException((Date) iter.next()); [EOL]     } [EOL] } <line_num>: 870,874
private void addException(Segment segment) { [EOL]     if (segment.inIncludeSegments()) { [EOL]         int p = binarySearchExceptionSegments(segment); [EOL]         this.exceptionSegments.add(-(p + 1), segment); [EOL]     } [EOL] } <line_num>: 886,891
public void addBaseTimelineException(long domainValue) { [EOL]     Segment baseSegment = this.baseTimeline.getSegment(domainValue); [EOL]     if (baseSegment.inIncludeSegments()) { [EOL]         Segment segment = getSegment(baseSegment.getSegmentStart()); [EOL]         while (segment.getSegmentStart() <= baseSegment.getSegmentEnd()) { [EOL]             if (segment.inIncludeSegments()) { [EOL]                 long fromDomainValue = segment.getSegmentStart(); [EOL]                 long toDomainValue; [EOL]                 do { [EOL]                     toDomainValue = segment.getSegmentEnd(); [EOL]                     segment.inc(); [EOL]                 } while (segment.inIncludeSegments()); [EOL]                 addException(fromDomainValue, toDomainValue); [EOL]             } else { [EOL]                 segment.inc(); [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 909,939
public void addBaseTimelineException(Date date) { [EOL]     addBaseTimelineException(getTime(date)); [EOL] } <line_num>: 953,955
public void addBaseTimelineExclusions(long fromBaseDomainValue, long toBaseDomainValue) { [EOL]     Segment baseSegment = this.baseTimeline.getSegment(fromBaseDomainValue); [EOL]     while (baseSegment.getSegmentStart() <= toBaseDomainValue && !baseSegment.inExcludeSegments()) { [EOL]         baseSegment.inc(); [EOL]     } [EOL]     while (baseSegment.getSegmentStart() <= toBaseDomainValue) { [EOL]         long baseExclusionRangeEnd = baseSegment.getSegmentStart() + this.baseTimeline.getSegmentsExcluded() * this.baseTimeline.getSegmentSize() - 1; [EOL]         Segment segment = getSegment(baseSegment.getSegmentStart()); [EOL]         while (segment.getSegmentStart() <= baseExclusionRangeEnd) { [EOL]             if (segment.inIncludeSegments()) { [EOL]                 long fromDomainValue = segment.getSegmentStart(); [EOL]                 long toDomainValue; [EOL]                 do { [EOL]                     toDomainValue = segment.getSegmentEnd(); [EOL]                     segment.inc(); [EOL]                 } while (segment.inIncludeSegments()); [EOL]                 addException(new BaseTimelineSegmentRange(fromDomainValue, toDomainValue)); [EOL]             } else { [EOL]                 segment.inc(); [EOL]             } [EOL]         } [EOL]         baseSegment.inc(this.baseTimeline.getGroupSegmentCount()); [EOL]     } [EOL] } <line_num>: 966,1013
public long getExceptionSegmentCount(long fromMillisecond, long toMillisecond) { [EOL]     if (toMillisecond < fromMillisecond) { [EOL]         return (0); [EOL]     } [EOL]     int n = 0; [EOL]     for (Iterator iter = this.exceptionSegments.iterator(); iter.hasNext(); ) { [EOL]         Segment segment = (Segment) iter.next(); [EOL]         Segment intersection = segment.intersect(fromMillisecond, toMillisecond); [EOL]         if (intersection != null) { [EOL]             n += intersection.getSegmentCount(); [EOL]         } [EOL]     } [EOL]     return (n); [EOL] } <line_num>: 1024,1042
public Segment getSegment(long millisecond) { [EOL]     return new Segment(millisecond); [EOL] } <line_num>: 1055,1057
public Segment getSegment(Date date) { [EOL]     return (getSegment(getTime(date))); [EOL] } <line_num>: 1073,1075
private boolean equals(Object o, Object p) { [EOL]     return (o == p || ((o != null) && o.equals(p))); [EOL] } <line_num>: 1087,1089
public boolean equals(Object o) { [EOL]     if (o instanceof SegmentedTimeline) { [EOL]         SegmentedTimeline other = (SegmentedTimeline) o; [EOL]         boolean b0 = (this.segmentSize == other.getSegmentSize()); [EOL]         boolean b1 = (this.segmentsIncluded == other.getSegmentsIncluded()); [EOL]         boolean b2 = (this.segmentsExcluded == other.getSegmentsExcluded()); [EOL]         boolean b3 = (this.startTime == other.getStartTime()); [EOL]         boolean b4 = equals(this.exceptionSegments, other.getExceptionSegments()); [EOL]         return b0 && b1 && b2 && b3 && b4; [EOL]     } else { [EOL]         return (false); [EOL]     } [EOL] } <line_num>: 1098,1113
public int hashCode() { [EOL]     int result = 19; [EOL]     result = 37 * result + (int) (this.segmentSize ^ (this.segmentSize >>> 32)); [EOL]     result = 37 * result + (int) (this.startTime ^ (this.startTime >>> 32)); [EOL]     return result; [EOL] } <line_num>: 1120,1126
private int binarySearchExceptionSegments(Segment segment) { [EOL]     int low = 0; [EOL]     int high = this.exceptionSegments.size() - 1; [EOL]     while (low <= high) { [EOL]         int mid = (low + high) / 2; [EOL]         Segment midSegment = (Segment) this.exceptionSegments.get(mid); [EOL]         if (segment.contains(midSegment) || midSegment.contains(segment)) { [EOL]             return mid; [EOL]         } [EOL]         if (midSegment.before(segment)) { [EOL]             low = mid + 1; [EOL]         } else if (midSegment.after(segment)) { [EOL]             high = mid - 1; [EOL]         } else { [EOL]             throw new IllegalStateException("Invalid condition."); [EOL]         } [EOL]     } [EOL]     return -(low + 1); [EOL] } <line_num>: 1143,1167
public long getTime(Date date) { [EOL]     long result = date.getTime(); [EOL]     if (this.adjustForDaylightSaving) { [EOL]         this.workingCalendar.setTime(date); [EOL]         this.workingCalendarNoDST.set(this.workingCalendar.get(Calendar.YEAR), this.workingCalendar.get(Calendar.MONTH), this.workingCalendar.get(Calendar.DATE), this.workingCalendar.get(Calendar.HOUR_OF_DAY), this.workingCalendar.get(Calendar.MINUTE), this.workingCalendar.get(Calendar.SECOND)); [EOL]         this.workingCalendarNoDST.set(Calendar.MILLISECOND, this.workingCalendar.get(Calendar.MILLISECOND)); [EOL]         Date revisedDate = this.workingCalendarNoDST.getTime(); [EOL]         result = revisedDate.getTime(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 1179,1197
public Date getDate(long value) { [EOL]     this.workingCalendarNoDST.setTime(new Date(value)); [EOL]     return (this.workingCalendarNoDST.getTime()); [EOL] } <line_num>: 1206,1209
public Object clone() throws CloneNotSupportedException { [EOL]     SegmentedTimeline clone = (SegmentedTimeline) super.clone(); [EOL]     return clone; [EOL] } <line_num>: 1218,1221
public long calculateSegmentNumber(long millis) { [EOL]     if (millis >= SegmentedTimeline.this.startTime) { [EOL]         return (millis - SegmentedTimeline.this.startTime) / SegmentedTimeline.this.segmentSize; [EOL]     } else { [EOL]         return ((millis - SegmentedTimeline.this.startTime) / SegmentedTimeline.this.segmentSize) - 1; [EOL]     } [EOL] } <line_num>: 1273,1282
public long getSegmentNumber() { [EOL]     return this.segmentNumber; [EOL] } <line_num>: 1289,1291
public long getSegmentCount() { [EOL]     return 1; [EOL] } <line_num>: 1299,1301
public long getSegmentStart() { [EOL]     return this.segmentStart; [EOL] } <line_num>: 1308,1310
public long getSegmentEnd() { [EOL]     return this.segmentEnd; [EOL] } <line_num>: 1317,1319
public long getMillisecond() { [EOL]     return this.millisecond; [EOL] } <line_num>: 1327,1329
public Date getDate() { [EOL]     return SegmentedTimeline.this.getDate(this.millisecond); [EOL] } <line_num>: 1337,1339
public boolean contains(long millis) { [EOL]     return (this.segmentStart <= millis && millis <= this.segmentEnd); [EOL] } <line_num>: 1350,1352
public boolean contains(long from, long to) { [EOL]     return (this.segmentStart <= from && to <= this.segmentEnd); [EOL] } <line_num>: 1364,1366
public boolean contains(Segment segment) { [EOL]     return contains(segment.getSegmentStart(), segment.getSegmentEnd()); [EOL] } <line_num>: 1376,1378
public boolean contained(long from, long to) { [EOL]     return (from <= this.segmentStart && this.segmentEnd <= to); [EOL] } <line_num>: 1390,1392
public Segment intersect(long from, long to) { [EOL]     if (from <= this.segmentStart && this.segmentEnd <= to) { [EOL]         return this; [EOL]     } else { [EOL]         return null; [EOL]     } [EOL] } <line_num>: 1403,1410
public boolean before(Segment other) { [EOL]     return (this.segmentEnd < other.getSegmentStart()); [EOL] } <line_num>: 1420,1422
public boolean after(Segment other) { [EOL]     return (this.segmentStart > other.getSegmentEnd()); [EOL] } <line_num>: 1432,1434
public boolean equals(Object object) { [EOL]     if (object instanceof Segment) { [EOL]         Segment other = (Segment) object; [EOL]         return (this.segmentNumber == other.getSegmentNumber() && this.segmentStart == other.getSegmentStart() && this.segmentEnd == other.getSegmentEnd() && this.millisecond == other.getMillisecond()); [EOL]     } else { [EOL]         return false; [EOL]     } [EOL] } <line_num>: 1444,1455
public Segment copy() { [EOL]     try { [EOL]         return (Segment) this.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         return null; [EOL]     } [EOL] } <line_num>: 1463,1470
public int compareTo(Object object) { [EOL]     Segment other = (Segment) object; [EOL]     if (this.before(other)) { [EOL]         return -1; [EOL]     } else if (this.after(other)) { [EOL]         return +1; [EOL]     } else { [EOL]         return 0; [EOL]     } [EOL] } <line_num>: 1481,1492
public boolean inIncludeSegments() { [EOL]     if (getSegmentNumberRelativeToGroup() < SegmentedTimeline.this.segmentsIncluded) { [EOL]         return !inExceptionSegments(); [EOL]     } else { [EOL]         return false; [EOL]     } [EOL] } <line_num>: 1500,1508
public boolean inExcludeSegments() { [EOL]     return getSegmentNumberRelativeToGroup() >= SegmentedTimeline.this.segmentsIncluded; [EOL] } <line_num>: 1515,1518
private long getSegmentNumberRelativeToGroup() { [EOL]     long p = (this.segmentNumber % SegmentedTimeline.this.groupSegmentCount); [EOL]     if (p < 0) { [EOL]         p += SegmentedTimeline.this.groupSegmentCount; [EOL]     } [EOL]     return p; [EOL] } <line_num>: 1528,1535
public boolean inExceptionSegments() { [EOL]     return binarySearchExceptionSegments(this) >= 0; [EOL] } <line_num>: 1548,1550
public void inc(long n) { [EOL]     this.segmentNumber += n; [EOL]     long m = n * SegmentedTimeline.this.segmentSize; [EOL]     this.segmentStart += m; [EOL]     this.segmentEnd += m; [EOL]     this.millisecond += m; [EOL] } <line_num>: 1558,1564
public void inc() { [EOL]     inc(1); [EOL] } <line_num>: 1570,1572
public void dec(long n) { [EOL]     this.segmentNumber -= n; [EOL]     long m = n * SegmentedTimeline.this.segmentSize; [EOL]     this.segmentStart -= m; [EOL]     this.segmentEnd -= m; [EOL]     this.millisecond -= m; [EOL] } <line_num>: 1580,1586
public void dec() { [EOL]     dec(1); [EOL] } <line_num>: 1592,1594
public void moveIndexToStart() { [EOL]     this.millisecond = this.segmentStart; [EOL] } <line_num>: 1599,1601
public void moveIndexToEnd() { [EOL]     this.millisecond = this.segmentEnd; [EOL] } <line_num>: 1606,1608
public long getSegmentCount() { [EOL]     return this.segmentCount; [EOL] } <line_num>: 1653,1655
public Segment intersect(long from, long to) { [EOL]     long start = Math.max(from, this.segmentStart); [EOL]     long end = Math.min(to, this.segmentEnd); [EOL]     if (start <= end) { [EOL]         return new SegmentRange(start, end); [EOL]     } else { [EOL]         return null; [EOL]     } [EOL] } <line_num>: 1666,1684
public boolean inIncludeSegments() { [EOL]     for (Segment segment = getSegment(this.segmentStart); segment.getSegmentStart() < this.segmentEnd; segment.inc()) { [EOL]         if (!segment.inIncludeSegments()) { [EOL]             return (false); [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 1692,1701
public boolean inExcludeSegments() { [EOL]     for (Segment segment = getSegment(this.segmentStart); segment.getSegmentStart() < this.segmentEnd; segment.inc()) { [EOL]         if (!segment.inExceptionSegments()) { [EOL]             return (false); [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 1708,1717
public void inc(long n) { [EOL]     throw new IllegalArgumentException("Not implemented in SegmentRange"); [EOL] } <line_num>: 1725,1728
