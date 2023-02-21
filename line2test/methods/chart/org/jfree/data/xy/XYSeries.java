public XYSeries(Comparable key) { [EOL]     this(key, true, true); [EOL] } <line_num>: 142,144
public XYSeries(Comparable key, boolean autoSort) { [EOL]     this(key, autoSort, true); [EOL] } <line_num>: 154,156
public XYSeries(Comparable key, boolean autoSort, boolean allowDuplicateXValues) { [EOL]     super(key); [EOL]     this.data = new java.util.ArrayList(); [EOL]     this.autoSort = autoSort; [EOL]     this.allowDuplicateXValues = allowDuplicateXValues; [EOL]     this.minX = Double.NaN; [EOL]     this.maxX = Double.NaN; [EOL]     this.minY = Double.NaN; [EOL]     this.maxY = Double.NaN; [EOL] } <line_num>: 168,178
public double getMinX() { [EOL]     return this.minX; [EOL] } <line_num>: 191,193
public double getMaxX() { [EOL]     return this.maxX; [EOL] } <line_num>: 206,208
public double getMinY() { [EOL]     return this.minY; [EOL] } <line_num>: 221,223
public double getMaxY() { [EOL]     return this.maxY; [EOL] } <line_num>: 236,238
private void updateBoundsForAddedItem(XYDataItem item) { [EOL]     double x = item.getXValue(); [EOL]     this.minX = minIgnoreNaN(this.minX, x); [EOL]     this.maxX = maxIgnoreNaN(this.maxX, x); [EOL]     if (item.getY() != null) { [EOL]         double y = item.getYValue(); [EOL]         this.minY = minIgnoreNaN(this.minY, y); [EOL]         this.maxY = maxIgnoreNaN(this.maxY, y); [EOL]     } [EOL] } <line_num>: 247,256
private void updateBoundsForRemovedItem(XYDataItem item) { [EOL]     boolean itemContributesToXBounds = false; [EOL]     boolean itemContributesToYBounds = false; [EOL]     double x = item.getXValue(); [EOL]     if (!Double.isNaN(x)) { [EOL]         if (x <= this.minX || x >= this.maxX) { [EOL]             itemContributesToXBounds = true; [EOL]         } [EOL]     } [EOL]     if (item.getY() != null) { [EOL]         double y = item.getYValue(); [EOL]         if (!Double.isNaN(y)) { [EOL]             if (y <= this.minY || y >= this.maxY) { [EOL]                 itemContributesToYBounds = true; [EOL]             } [EOL]         } [EOL]     } [EOL]     if (itemContributesToYBounds) { [EOL]         findBoundsByIteration(); [EOL]     } else if (itemContributesToXBounds) { [EOL]         if (getAutoSort()) { [EOL]             this.minX = getX(0).doubleValue(); [EOL]             this.maxX = getX(getItemCount() - 1).doubleValue(); [EOL]         } else { [EOL]             findBoundsByIteration(); [EOL]         } [EOL]     } [EOL] } <line_num>: 266,295
private void findBoundsByIteration() { [EOL]     this.minX = Double.NaN; [EOL]     this.maxX = Double.NaN; [EOL]     this.minY = Double.NaN; [EOL]     this.maxY = Double.NaN; [EOL]     Iterator iterator = this.data.iterator(); [EOL]     while (iterator.hasNext()) { [EOL]         XYDataItem item = (XYDataItem) iterator.next(); [EOL]         updateBoundsForAddedItem(item); [EOL]     } [EOL] } <line_num>: 303,313
public boolean getAutoSort() { [EOL]     return this.autoSort; [EOL] } <line_num>: 322,324
public boolean getAllowDuplicateXValues() { [EOL]     return this.allowDuplicateXValues; [EOL] } <line_num>: 332,334
public int getItemCount() { [EOL]     return this.data.size(); [EOL] } <line_num>: 343,345
public List getItems() { [EOL]     return Collections.unmodifiableList(this.data); [EOL] } <line_num>: 353,355
public int getMaximumItemCount() { [EOL]     return this.maximumItemCount; [EOL] } <line_num>: 365,367
public void setMaximumItemCount(int maximum) { [EOL]     this.maximumItemCount = maximum; [EOL]     int remove = this.data.size() - maximum; [EOL]     if (remove > 0) { [EOL]         this.data.subList(0, remove).clear(); [EOL]         findBoundsByIteration(); [EOL]         fireSeriesChanged(); [EOL]     } [EOL] } <line_num>: 383,391
public void add(XYDataItem item) { [EOL]     add(item, true); [EOL] } <line_num>: 399,402
public void add(double x, double y) { [EOL]     add(new Double(x), new Double(y), true); [EOL] } <line_num>: 411,413
public void add(double x, double y, boolean notify) { [EOL]     add(new Double(x), new Double(y), notify); [EOL] } <line_num>: 425,427
public void add(double x, Number y) { [EOL]     add(new Double(x), y); [EOL] } <line_num>: 437,439
public void add(double x, Number y, boolean notify) { [EOL]     add(new Double(x), y, notify); [EOL] } <line_num>: 452,454
public void add(Number x, Number y) { [EOL]     add(x, y, true); [EOL] } <line_num>: 470,473
public void add(Number x, Number y, boolean notify) { [EOL]     XYDataItem item = new XYDataItem(x, y); [EOL]     add(item, notify); [EOL] } <line_num>: 488,492
public void add(XYDataItem item, boolean notify) { [EOL]     if (item == null) { [EOL]         throw new IllegalArgumentException("Null 'item' argument."); [EOL]     } [EOL]     item = (XYDataItem) item.clone(); [EOL]     if (this.autoSort) { [EOL]         int index = Collections.binarySearch(this.data, item); [EOL]         if (index < 0) { [EOL]             this.data.add(-index - 1, item); [EOL]         } else { [EOL]             if (this.allowDuplicateXValues) { [EOL]                 int size = this.data.size(); [EOL]                 while (index < size && item.compareTo(this.data.get(index)) == 0) { [EOL]                     index++; [EOL]                 } [EOL]                 if (index < this.data.size()) { [EOL]                     this.data.add(index, item); [EOL]                 } else { [EOL]                     this.data.add(item); [EOL]                 } [EOL]             } else { [EOL]                 throw new SeriesException("X-value already exists."); [EOL]             } [EOL]         } [EOL]     } else { [EOL]         if (!this.allowDuplicateXValues) { [EOL]             int index = indexOf(item.getX()); [EOL]             if (index >= 0) { [EOL]                 throw new SeriesException("X-value already exists."); [EOL]             } [EOL]         } [EOL]         this.data.add(item); [EOL]     } [EOL]     updateBoundsForAddedItem(item); [EOL]     if (getItemCount() > this.maximumItemCount) { [EOL]         XYDataItem removed = (XYDataItem) this.data.remove(0); [EOL]         updateBoundsForRemovedItem(removed); [EOL]     } [EOL]     if (notify) { [EOL]         fireSeriesChanged(); [EOL]     } [EOL] } <line_num>: 503,552
public void delete(int start, int end) { [EOL]     this.data.subList(start, end + 1).clear(); [EOL]     findBoundsByIteration(); [EOL]     fireSeriesChanged(); [EOL] } <line_num>: 561,565
public XYDataItem remove(int index) { [EOL]     XYDataItem removed = (XYDataItem) this.data.remove(index); [EOL]     updateBoundsForRemovedItem(removed); [EOL]     fireSeriesChanged(); [EOL]     return removed; [EOL] } <line_num>: 575,580
public XYDataItem remove(Number x) { [EOL]     return remove(indexOf(x)); [EOL] } <line_num>: 592,594
public void clear() { [EOL]     if (this.data.size() > 0) { [EOL]         this.data.clear(); [EOL]         this.minX = Double.NaN; [EOL]         this.maxX = Double.NaN; [EOL]         this.minY = Double.NaN; [EOL]         this.maxY = Double.NaN; [EOL]         fireSeriesChanged(); [EOL]     } [EOL] } <line_num>: 600,609
public XYDataItem getDataItem(int index) { [EOL]     XYDataItem item = (XYDataItem) this.data.get(index); [EOL]     return (XYDataItem) item.clone(); [EOL] } <line_num>: 618,621
XYDataItem getRawDataItem(int index) { [EOL]     return (XYDataItem) this.data.get(index); [EOL] } <line_num>: 632,634
public Number getX(int index) { [EOL]     return getRawDataItem(index).getX(); [EOL] } <line_num>: 643,645
public Number getY(int index) { [EOL]     return getRawDataItem(index).getY(); [EOL] } <line_num>: 654,656
public void updateByIndex(int index, Number y) { [EOL]     XYDataItem item = getRawDataItem(index); [EOL]     boolean iterate = false; [EOL]     double oldY = item.getYValue(); [EOL]     if (!Double.isNaN(oldY)) { [EOL]         iterate = oldY <= this.minY || oldY >= this.maxY; [EOL]     } [EOL]     item.setY(y); [EOL]     if (iterate) { [EOL]         findBoundsByIteration(); [EOL]     } else if (y != null) { [EOL]         double yy = y.doubleValue(); [EOL]         this.minY = minIgnoreNaN(this.minY, yy); [EOL]         this.maxY = maxIgnoreNaN(this.maxY, yy); [EOL]     } [EOL]     fireSeriesChanged(); [EOL] } <line_num>: 667,687
private double minIgnoreNaN(double a, double b) { [EOL]     if (Double.isNaN(a)) { [EOL]         return b; [EOL]     } else { [EOL]         if (Double.isNaN(b)) { [EOL]             return a; [EOL]         } else { [EOL]             return Math.min(a, b); [EOL]         } [EOL]     } [EOL] } <line_num>: 698,710
private double maxIgnoreNaN(double a, double b) { [EOL]     if (Double.isNaN(a)) { [EOL]         return b; [EOL]     } else { [EOL]         if (Double.isNaN(b)) { [EOL]             return a; [EOL]         } else { [EOL]             return Math.max(a, b); [EOL]         } [EOL]     } [EOL] } <line_num>: 721,733
public void update(Number x, Number y) { [EOL]     int index = indexOf(x); [EOL]     if (index < 0) { [EOL]         throw new SeriesException("No observation for x = " + x); [EOL]     } else { [EOL]         updateByIndex(index, y); [EOL]     } [EOL] } <line_num>: 744,752
public XYDataItem addOrUpdate(double x, double y) { [EOL]     return addOrUpdate(new Double(x), new Double(y)); [EOL] } <line_num>: 765,767
public XYDataItem addOrUpdate(Number x, Number y) { [EOL]     return addOrUpdate(new XYDataItem(x, y)); [EOL] } <line_num>: 779,782
public XYDataItem addOrUpdate(XYDataItem item) { [EOL]     if (item == null) { [EOL]         throw new IllegalArgumentException("Null 'item' argument."); [EOL]     } [EOL]     if (this.allowDuplicateXValues) { [EOL]         add(item); [EOL]         return null; [EOL]     } [EOL]     XYDataItem overwritten = null; [EOL]     int index = indexOf(item.getX()); [EOL]     if (index >= 0) { [EOL]         XYDataItem existing = (XYDataItem) this.data.get(index); [EOL]         overwritten = (XYDataItem) existing.clone(); [EOL]         boolean iterate = false; [EOL]         double oldY = existing.getYValue(); [EOL]         if (!Double.isNaN(oldY)) { [EOL]             iterate = oldY <= this.minY || oldY >= this.maxY; [EOL]         } [EOL]         existing.setY(item.getY()); [EOL]         if (iterate) { [EOL]             findBoundsByIteration(); [EOL]         } else if (item.getY() != null) { [EOL]             double yy = item.getY().doubleValue(); [EOL]             this.minY = minIgnoreNaN(this.minY, yy); [EOL]             this.maxY = minIgnoreNaN(this.maxY, yy); [EOL]         } [EOL]     } else { [EOL]         item = (XYDataItem) item.clone(); [EOL]         if (this.autoSort) { [EOL]             this.data.add(-index - 1, item); [EOL]         } else { [EOL]             this.data.add(item); [EOL]         } [EOL]         updateBoundsForAddedItem(item); [EOL]         if (getItemCount() > this.maximumItemCount) { [EOL]             XYDataItem removed = (XYDataItem) this.data.remove(0); [EOL]             updateBoundsForRemovedItem(removed); [EOL]         } [EOL]     } [EOL]     fireSeriesChanged(); [EOL]     return overwritten; [EOL] } <line_num>: 796,850
public int indexOf(Number x) { [EOL]     if (this.autoSort) { [EOL]         return Collections.binarySearch(this.data, new XYDataItem(x, null)); [EOL]     } else { [EOL]         for (int i = 0; i < this.data.size(); i++) { [EOL]             XYDataItem item = (XYDataItem) this.data.get(i); [EOL]             if (item.getX().equals(x)) { [EOL]                 return i; [EOL]             } [EOL]         } [EOL]         return -1; [EOL]     } [EOL] } <line_num>: 862,875
public double[][] toArray() { [EOL]     int itemCount = getItemCount(); [EOL]     double[][] result = new double[2][itemCount]; [EOL]     for (int i = 0; i < itemCount; i++) { [EOL]         result[0][i] = this.getX(i).doubleValue(); [EOL]         Number y = getY(i); [EOL]         if (y != null) { [EOL]             result[1][i] = y.doubleValue(); [EOL]         } else { [EOL]             result[1][i] = Double.NaN; [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 884,898
public Object clone() throws CloneNotSupportedException { [EOL]     XYSeries clone = (XYSeries) super.clone(); [EOL]     clone.data = (List) ObjectUtilities.deepClone(this.data); [EOL]     return clone; [EOL] } <line_num>: 907,911
public XYSeries createCopy(int start, int end) throws CloneNotSupportedException { [EOL]     XYSeries copy = (XYSeries) super.clone(); [EOL]     copy.data = new java.util.ArrayList(); [EOL]     if (this.data.size() > 0) { [EOL]         for (int index = start; index <= end; index++) { [EOL]             XYDataItem item = (XYDataItem) this.data.get(index); [EOL]             XYDataItem clone = (XYDataItem) item.clone(); [EOL]             try { [EOL]                 copy.add(clone); [EOL]             } catch (SeriesException e) { [EOL]                 System.err.println("Unable to add cloned data item."); [EOL]             } [EOL]         } [EOL]     } [EOL]     return copy; [EOL] } <line_num>: 923,942
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof XYSeries)) { [EOL]         return false; [EOL]     } [EOL]     if (!super.equals(obj)) { [EOL]         return false; [EOL]     } [EOL]     XYSeries that = (XYSeries) obj; [EOL]     if (this.maximumItemCount != that.maximumItemCount) { [EOL]         return false; [EOL]     } [EOL]     if (this.autoSort != that.autoSort) { [EOL]         return false; [EOL]     } [EOL]     if (this.allowDuplicateXValues != that.allowDuplicateXValues) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.data, that.data)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 952,976
public int hashCode() { [EOL]     int result = super.hashCode(); [EOL]     int count = getItemCount(); [EOL]     if (count > 0) { [EOL]         XYDataItem item = getRawDataItem(0); [EOL]         result = 29 * result + item.hashCode(); [EOL]     } [EOL]     if (count > 1) { [EOL]         XYDataItem item = getRawDataItem(count - 1); [EOL]         result = 29 * result + item.hashCode(); [EOL]     } [EOL]     if (count > 2) { [EOL]         XYDataItem item = getRawDataItem(count / 2); [EOL]         result = 29 * result + item.hashCode(); [EOL]     } [EOL]     result = 29 * result + this.maximumItemCount; [EOL]     result = 29 * result + (this.autoSort ? 1 : 0); [EOL]     result = 29 * result + (this.allowDuplicateXValues ? 1 : 0); [EOL]     return result; [EOL] } <line_num>: 983,1004