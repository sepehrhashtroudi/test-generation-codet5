public Percentile() { [EOL]     this(50.0); [EOL] } <line_num>: 106,109
public Percentile(final double p) throws MathIllegalArgumentException { [EOL]     setQuantile(p); [EOL]     cachedPivots = null; [EOL] } <line_num>: 117,120
public Percentile(Percentile original) throws NullArgumentException { [EOL]     copy(original, this); [EOL] } <line_num>: 129,131
@Override [EOL] public void setData(final double[] values) { [EOL]     if (values == null) { [EOL]         cachedPivots = null; [EOL]     } else { [EOL]         cachedPivots = new int[(0x1 << MAX_CACHED_LEVELS) - 1]; [EOL]         Arrays.fill(cachedPivots, -1); [EOL]     } [EOL]     super.setData(values); [EOL] } <line_num>: 134,143
@Override [EOL] public void setData(final double[] values, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     if (values == null) { [EOL]         cachedPivots = null; [EOL]     } else { [EOL]         cachedPivots = new int[(0x1 << MAX_CACHED_LEVELS) - 1]; [EOL]         Arrays.fill(cachedPivots, -1); [EOL]     } [EOL]     super.setData(values, begin, length); [EOL] } <line_num>: 146,156
public double evaluate(final double p) throws MathIllegalArgumentException { [EOL]     return evaluate(getDataRef(), p); [EOL] } <line_num>: 169,171
public double evaluate(final double[] values, final double p) throws MathIllegalArgumentException { [EOL]     test(values, 0, 0); [EOL]     return evaluate(values, 0, values.length, p); [EOL] } <line_num>: 199,203
@Override [EOL] public double evaluate(final double[] values, final int start, final int length) throws MathIllegalArgumentException { [EOL]     return evaluate(values, start, length, quantile); [EOL] } <line_num>: 228,232
public double evaluate(final double[] values, final int begin, final int length, final double p) throws MathIllegalArgumentException { [EOL]     test(values, begin, length); [EOL]     if ((p > 100) || (p <= 0)) { [EOL]         throw new OutOfRangeException(LocalizedFormats.OUT_OF_BOUNDS_QUANTILE_VALUE, p, 0, 100); [EOL]     } [EOL]     if (length == 0) { [EOL]         return Double.NaN; [EOL]     } [EOL]     if (length == 1) { [EOL]         return values[begin]; [EOL]     } [EOL]     double n = length; [EOL]     double pos = p * (n + 1) / 100; [EOL]     double fpos = FastMath.floor(pos); [EOL]     int intPos = (int) fpos; [EOL]     double dif = pos - fpos; [EOL]     double[] work; [EOL]     int[] pivotsHeap; [EOL]     if (values == getDataRef()) { [EOL]         work = getDataRef(); [EOL]         pivotsHeap = cachedPivots; [EOL]     } else { [EOL]         work = new double[length]; [EOL]         System.arraycopy(values, begin, work, 0, length); [EOL]         pivotsHeap = new int[(0x1 << MAX_CACHED_LEVELS) - 1]; [EOL]         Arrays.fill(pivotsHeap, -1); [EOL]     } [EOL]     if (pos < 1) { [EOL]         return select(work, pivotsHeap, 0); [EOL]     } [EOL]     if (pos >= n) { [EOL]         return select(work, pivotsHeap, length - 1); [EOL]     } [EOL]     double lower = select(work, pivotsHeap, intPos - 1); [EOL]     double upper = select(work, pivotsHeap, intPos); [EOL]     return lower + dif * (upper - lower); [EOL] } <line_num>: 264,305
private double select(final double[] work, final int[] pivotsHeap, final int k) { [EOL]     int begin = 0; [EOL]     int end = work.length; [EOL]     int node = 0; [EOL]     while (end - begin > MIN_SELECT_SIZE) { [EOL]         final int pivot; [EOL]         if ((node < pivotsHeap.length) && (pivotsHeap[node] >= 0)) { [EOL]             pivot = pivotsHeap[node]; [EOL]         } else { [EOL]             pivot = partition(work, begin, end, medianOf3(work, begin, end)); [EOL]             if (node < pivotsHeap.length) { [EOL]                 pivotsHeap[node] = pivot; [EOL]             } [EOL]         } [EOL]         if (k == pivot) { [EOL]             return work[k]; [EOL]         } else if (k < pivot) { [EOL]             end = pivot; [EOL]             node = FastMath.min(2 * node + 1, pivotsHeap.length); [EOL]         } else { [EOL]             begin = pivot + 1; [EOL]             node = FastMath.min(2 * node + 2, pivotsHeap.length); [EOL]         } [EOL]     } [EOL]     insertionSort(work, begin, end); [EOL]     return work[k]; [EOL] } <line_num>: 318,359
int medianOf3(final double[] work, final int begin, final int end) { [EOL]     final int inclusiveEnd = end - 1; [EOL]     final int middle = begin + (inclusiveEnd - begin) / 2; [EOL]     final double wBegin = work[begin]; [EOL]     final double wMiddle = work[middle]; [EOL]     final double wEnd = work[inclusiveEnd]; [EOL]     if (wBegin < wMiddle) { [EOL]         if (wMiddle < wEnd) { [EOL]             return middle; [EOL]         } else { [EOL]             return (wBegin < wEnd) ? inclusiveEnd : begin; [EOL]         } [EOL]     } else { [EOL]         if (wBegin < wEnd) { [EOL]             return begin; [EOL]         } else { [EOL]             return (wMiddle < wEnd) ? inclusiveEnd : middle; [EOL]         } [EOL]     } [EOL] } <line_num>: 368,390
private int partition(final double[] work, final int begin, final int end, final int pivot) { [EOL]     final double value = work[pivot]; [EOL]     work[pivot] = work[begin]; [EOL]     int i = begin + 1; [EOL]     int j = end - 1; [EOL]     while (i < j) { [EOL]         while ((i < j) && (work[j] > value)) { [EOL]             --j; [EOL]         } [EOL]         while ((i < j) && (work[i] < value)) { [EOL]             ++i; [EOL]         } [EOL]         if (i < j) { [EOL]             final double tmp = work[i]; [EOL]             work[i++] = work[j]; [EOL]             work[j--] = tmp; [EOL]         } [EOL]     } [EOL]     if ((i >= end) || (work[i] > value)) { [EOL]         --i; [EOL]     } [EOL]     work[begin] = work[i]; [EOL]     work[i] = value; [EOL]     return i; [EOL] } <line_num>: 405,434
private void insertionSort(final double[] work, final int begin, final int end) { [EOL]     for (int j = begin + 1; j < end; j++) { [EOL]         final double saved = work[j]; [EOL]         int i = j - 1; [EOL]         while ((i >= begin) && (saved < work[i])) { [EOL]             work[i + 1] = work[i]; [EOL]             i--; [EOL]         } [EOL]         work[i + 1] = saved; [EOL]     } [EOL] } <line_num>: 442,452
public double getQuantile() { [EOL]     return quantile; [EOL] } <line_num>: 460,462
public void setQuantile(final double p) throws MathIllegalArgumentException { [EOL]     if (p <= 0 || p > 100) { [EOL]         throw new OutOfRangeException(LocalizedFormats.OUT_OF_BOUNDS_QUANTILE_VALUE, p, 0, 100); [EOL]     } [EOL]     quantile = p; [EOL] } <line_num>: 472,478
@Override [EOL] public Percentile copy() { [EOL]     Percentile result = new Percentile(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 483,489
public static void copy(Percentile source, Percentile dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     dest.setData(source.getDataRef()); [EOL]     if (source.cachedPivots != null) { [EOL]         System.arraycopy(source.cachedPivots, 0, dest.cachedPivots, 0, source.cachedPivots.length); [EOL]     } [EOL]     dest.quantile = source.quantile; [EOL] } <line_num>: 499,508