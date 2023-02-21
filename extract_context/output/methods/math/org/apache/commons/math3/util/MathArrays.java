private MathArrays() { [EOL] } <line_num>: 55,55
double evaluate(double[] array); <line_num>: 68,68
double evaluate(double[] array, int startIndex, int numElements); <line_num>: 75,77
public static double[] scale(double val, final double[] arr) { [EOL]     double[] newArr = new double[arr.length]; [EOL]     for (int i = 0; i < arr.length; i++) { [EOL]         newArr[i] = arr[i] * val; [EOL]     } [EOL]     return newArr; [EOL] } <line_num>: 88,94
public static void scaleInPlace(double val, final double[] arr) { [EOL]     for (int i = 0; i < arr.length; i++) { [EOL]         arr[i] *= val; [EOL]     } [EOL] } <line_num>: 105,109
public static double[] ebeAdd(double[] a, double[] b) throws DimensionMismatchException { [EOL]     if (a.length != b.length) { [EOL]         throw new DimensionMismatchException(a.length, b.length); [EOL]     } [EOL]     final double[] result = a.clone(); [EOL]     for (int i = 0; i < a.length; i++) { [EOL]         result[i] += b[i]; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 121,132
public static double[] ebeSubtract(double[] a, double[] b) throws DimensionMismatchException { [EOL]     if (a.length != b.length) { [EOL]         throw new DimensionMismatchException(a.length, b.length); [EOL]     } [EOL]     final double[] result = a.clone(); [EOL]     for (int i = 0; i < a.length; i++) { [EOL]         result[i] -= b[i]; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 143,154
public static double[] ebeMultiply(double[] a, double[] b) throws DimensionMismatchException { [EOL]     if (a.length != b.length) { [EOL]         throw new DimensionMismatchException(a.length, b.length); [EOL]     } [EOL]     final double[] result = a.clone(); [EOL]     for (int i = 0; i < a.length; i++) { [EOL]         result[i] *= b[i]; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 165,176
public static double[] ebeDivide(double[] a, double[] b) throws DimensionMismatchException { [EOL]     if (a.length != b.length) { [EOL]         throw new DimensionMismatchException(a.length, b.length); [EOL]     } [EOL]     final double[] result = a.clone(); [EOL]     for (int i = 0; i < a.length; i++) { [EOL]         result[i] /= b[i]; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 187,198
public static double distance1(double[] p1, double[] p2) { [EOL]     double sum = 0; [EOL]     for (int i = 0; i < p1.length; i++) { [EOL]         sum += FastMath.abs(p1[i] - p2[i]); [EOL]     } [EOL]     return sum; [EOL] } <line_num>: 207,213
public static int distance1(int[] p1, int[] p2) { [EOL]     int sum = 0; [EOL]     for (int i = 0; i < p1.length; i++) { [EOL]         sum += FastMath.abs(p1[i] - p2[i]); [EOL]     } [EOL]     return sum; [EOL] } <line_num>: 222,228
public static double distance(double[] p1, double[] p2) { [EOL]     double sum = 0; [EOL]     for (int i = 0; i < p1.length; i++) { [EOL]         final double dp = p1[i] - p2[i]; [EOL]         sum += dp * dp; [EOL]     } [EOL]     return FastMath.sqrt(sum); [EOL] } <line_num>: 237,244
public static double distance(int[] p1, int[] p2) { [EOL]     double sum = 0; [EOL]     for (int i = 0; i < p1.length; i++) { [EOL]         final double dp = p1[i] - p2[i]; [EOL]         sum += dp * dp; [EOL]     } [EOL]     return FastMath.sqrt(sum); [EOL] } <line_num>: 253,260
public static double distanceInf(double[] p1, double[] p2) { [EOL]     double max = 0; [EOL]     for (int i = 0; i < p1.length; i++) { [EOL]         max = FastMath.max(max, FastMath.abs(p1[i] - p2[i])); [EOL]     } [EOL]     return max; [EOL] } <line_num>: 269,275
public static int distanceInf(int[] p1, int[] p2) { [EOL]     int max = 0; [EOL]     for (int i = 0; i < p1.length; i++) { [EOL]         max = FastMath.max(max, FastMath.abs(p1[i] - p2[i])); [EOL]     } [EOL]     return max; [EOL] } <line_num>: 284,290
public static <T extends Comparable<? super T>> boolean isMonotonic(T[] val, OrderDirection dir, boolean strict) { [EOL]     T previous = val[0]; [EOL]     final int max = val.length; [EOL]     for (int i = 1; i < max; i++) { [EOL]         final int comp; [EOL]         switch(dir) { [EOL]             case INCREASING: [EOL]                 comp = previous.compareTo(val[i]); [EOL]                 if (strict) { [EOL]                     if (comp >= 0) { [EOL]                         return false; [EOL]                     } [EOL]                 } else { [EOL]                     if (comp > 0) { [EOL]                         return false; [EOL]                     } [EOL]                 } [EOL]                 break; [EOL]             case DECREASING: [EOL]                 comp = val[i].compareTo(previous); [EOL]                 if (strict) { [EOL]                     if (comp >= 0) { [EOL]                         return false; [EOL]                     } [EOL]                 } else { [EOL]                     if (comp > 0) { [EOL]                         return false; [EOL]                     } [EOL]                 } [EOL]                 break; [EOL]             default: [EOL]                 throw new MathInternalError(); [EOL]         } [EOL]         previous = val[i]; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 311,351
public static boolean isMonotonic(double[] val, OrderDirection dir, boolean strict) { [EOL]     return checkOrder(val, dir, strict, false); [EOL] } <line_num>: 361,363
public static boolean checkOrder(double[] val, OrderDirection dir, boolean strict, boolean abort) throws NonMonotonicSequenceException { [EOL]     double previous = val[0]; [EOL]     final int max = val.length; [EOL]     int index; [EOL]     ITEM: for (index = 1; index < max; index++) { [EOL]         switch(dir) { [EOL]             case INCREASING: [EOL]                 if (strict) { [EOL]                     if (val[index] <= previous) { [EOL]                         break ITEM; [EOL]                     } [EOL]                 } else { [EOL]                     if (val[index] < previous) { [EOL]                         break ITEM; [EOL]                     } [EOL]                 } [EOL]                 break; [EOL]             case DECREASING: [EOL]                 if (strict) { [EOL]                     if (val[index] >= previous) { [EOL]                         break ITEM; [EOL]                     } [EOL]                 } else { [EOL]                     if (val[index] > previous) { [EOL]                         break ITEM; [EOL]                     } [EOL]                 } [EOL]                 break; [EOL]             default: [EOL]                 throw new MathInternalError(); [EOL]         } [EOL]         previous = val[index]; [EOL]     } [EOL]     if (index == max) { [EOL]         return true; [EOL]     } [EOL]     if (abort) { [EOL]         throw new NonMonotonicSequenceException(val[index], previous, index, dir, strict); [EOL]     } else { [EOL]         return false; [EOL]     } [EOL] } <line_num>: 376,427
public static void checkOrder(double[] val, OrderDirection dir, boolean strict) throws NonMonotonicSequenceException { [EOL]     checkOrder(val, dir, strict, true); [EOL] } <line_num>: 438,441
public static void checkOrder(double[] val) throws NonMonotonicSequenceException { [EOL]     checkOrder(val, OrderDirection.INCREASING, true); [EOL] } <line_num>: 450,452
public static void checkRectangular(final long[][] in) throws NullArgumentException, DimensionMismatchException { [EOL]     MathUtils.checkNotNull(in); [EOL]     for (int i = 1; i < in.length; i++) { [EOL]         if (in[i].length != in[0].length) { [EOL]             throw new DimensionMismatchException(LocalizedFormats.DIFFERENT_ROWS_LENGTHS, in[i].length, in[0].length); [EOL]         } [EOL]     } [EOL] } <line_num>: 462,472
public static void checkPositive(final double[] in) throws NotStrictlyPositiveException { [EOL]     for (int i = 0; i < in.length; i++) { [EOL]         if (in[i] <= 0) { [EOL]             throw new NotStrictlyPositiveException(in[i]); [EOL]         } [EOL]     } [EOL] } <line_num>: 482,489
public static void checkNonNegative(final long[] in) throws NotPositiveException { [EOL]     for (int i = 0; i < in.length; i++) { [EOL]         if (in[i] < 0) { [EOL]             throw new NotPositiveException(in[i]); [EOL]         } [EOL]     } [EOL] } <line_num>: 498,505
public static void checkNonNegative(final long[][] in) throws NotPositiveException { [EOL]     for (int i = 0; i < in.length; i++) { [EOL]         for (int j = 0; j < in[i].length; j++) { [EOL]             if (in[i][j] < 0) { [EOL]                 throw new NotPositiveException(in[i][j]); [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 514,523
public static double safeNorm(double[] v) { [EOL]     double rdwarf = 3.834e-20; [EOL]     double rgiant = 1.304e+19; [EOL]     double s1 = 0; [EOL]     double s2 = 0; [EOL]     double s3 = 0; [EOL]     double x1max = 0; [EOL]     double x3max = 0; [EOL]     double floatn = v.length; [EOL]     double agiant = rgiant / floatn; [EOL]     for (int i = 0; i < v.length; i++) { [EOL]         double xabs = Math.abs(v[i]); [EOL]         if (xabs < rdwarf || xabs > agiant) { [EOL]             if (xabs > rdwarf) { [EOL]                 if (xabs > x1max) { [EOL]                     double r = x1max / xabs; [EOL]                     s1 = 1 + s1 * r * r; [EOL]                     x1max = xabs; [EOL]                 } else { [EOL]                     double r = xabs / x1max; [EOL]                     s1 += r * r; [EOL]                 } [EOL]             } else { [EOL]                 if (xabs > x3max) { [EOL]                     double r = x3max / xabs; [EOL]                     s3 = 1 + s3 * r * r; [EOL]                     x3max = xabs; [EOL]                 } else { [EOL]                     if (xabs != 0) { [EOL]                         double r = xabs / x3max; [EOL]                         s3 += r * r; [EOL]                     } [EOL]                 } [EOL]             } [EOL]         } else { [EOL]             s2 += xabs * xabs; [EOL]         } [EOL]     } [EOL]     double norm; [EOL]     if (s1 != 0) { [EOL]         norm = x1max * Math.sqrt(s1 + (s2 / x1max) / x1max); [EOL]     } else { [EOL]         if (s2 == 0) { [EOL]             norm = x3max * Math.sqrt(s3); [EOL]         } else { [EOL]             if (s2 >= x3max) { [EOL]                 norm = Math.sqrt(s2 * (1 + (x3max / s2) * (x3max * s3))); [EOL]             } else { [EOL]                 norm = Math.sqrt(x3max * ((s2 / x3max) + (x3max * s3))); [EOL]             } [EOL]         } [EOL]     } [EOL]     return norm; [EOL] } <line_num>: 585,638
public static void sortInPlace(double[] x, double[]... yList) throws DimensionMismatchException, NullArgumentException { [EOL]     sortInPlace(x, OrderDirection.INCREASING, yList); [EOL] } <line_num>: 656,659
public int compare(Pair<Double, Integer> o1, Pair<Double, Integer> o2) { [EOL]     return o2.getKey().compareTo(o1.getKey()); [EOL] } <line_num>: 718,721
public int compare(Pair<Double, Integer> o1, Pair<Double, Integer> o2) { [EOL]     return o1.getKey().compareTo(o2.getKey()); [EOL] } <line_num>: 713,716
public static void sortInPlace(double[] x, final OrderDirection dir, double[]... yList) throws NullArgumentException, DimensionMismatchException { [EOL]     if (x == null) { [EOL]         throw new NullArgumentException(); [EOL]     } [EOL]     final int yListLen = yList.length; [EOL]     final int len = x.length; [EOL]     for (int j = 0; j < yListLen; j++) { [EOL]         final double[] y = yList[j]; [EOL]         if (y == null) { [EOL]             throw new NullArgumentException(); [EOL]         } [EOL]         if (y.length != len) { [EOL]             throw new DimensionMismatchException(y.length, len); [EOL]         } [EOL]     } [EOL]     final List<Pair<Double, Integer>> list = new ArrayList<Pair<Double, Integer>>(len); [EOL]     for (int i = 0; i < len; i++) { [EOL]         list.add(new Pair<Double, Integer>(x[i], i)); [EOL]     } [EOL]     final Comparator<Pair<Double, Integer>> comp = dir == MathArrays.OrderDirection.INCREASING ? new Comparator<Pair<Double, Integer>>() { [EOL]  [EOL]         public int compare(Pair<Double, Integer> o1, Pair<Double, Integer> o2) { [EOL]             return o1.getKey().compareTo(o2.getKey()); [EOL]         } [EOL]     } : new Comparator<Pair<Double, Integer>>() { [EOL]  [EOL]         public int compare(Pair<Double, Integer> o1, Pair<Double, Integer> o2) { [EOL]             return o2.getKey().compareTo(o1.getKey()); [EOL]         } [EOL]     }; [EOL]     Collections.sort(list, comp); [EOL]     final int[] indices = new int[len]; [EOL]     for (int i = 0; i < len; i++) { [EOL]         final Pair<Double, Integer> e = list.get(i); [EOL]         x[i] = e.getKey(); [EOL]         indices[i] = e.getValue(); [EOL]     } [EOL]     for (int j = 0; j < yListLen; j++) { [EOL]         final double[] yInPlace = yList[j]; [EOL]         final double[] yOrig = yInPlace.clone(); [EOL]         for (int i = 0; i < len; i++) { [EOL]             yInPlace[i] = yOrig[indices[i]]; [EOL]         } [EOL]     } [EOL] } <line_num>: 678,748
public static int[] copyOf(int[] source) { [EOL]     return copyOf(source, source.length); [EOL] } <line_num>: 756,758
public static double[] copyOf(double[] source) { [EOL]     return copyOf(source, source.length); [EOL] } <line_num>: 766,768
public static int[] copyOf(int[] source, int len) { [EOL]     final int[] output = new int[len]; [EOL]     System.arraycopy(source, 0, output, 0, FastMath.min(len, source.length)); [EOL]     return output; [EOL] } <line_num>: 779,783
public static double[] copyOf(double[] source, int len) { [EOL]     final double[] output = new double[len]; [EOL]     System.arraycopy(source, 0, output, 0, FastMath.min(len, source.length)); [EOL]     return output; [EOL] } <line_num>: 794,798
public static double linearCombination(final double[] a, final double[] b) throws DimensionMismatchException { [EOL]     final int len = a.length; [EOL]     if (len != b.length) { [EOL]         throw new DimensionMismatchException(len, b.length); [EOL]     } [EOL]     if (len == 1) { [EOL]         return a[0] * b[0]; [EOL]     } [EOL]     final double[] prodHigh = new double[len]; [EOL]     double prodLowSum = 0; [EOL]     for (int i = 0; i < len; i++) { [EOL]         final double ai = a[i]; [EOL]         final double ca = SPLIT_FACTOR * ai; [EOL]         final double aHigh = ca - (ca - ai); [EOL]         final double aLow = ai - aHigh; [EOL]         final double bi = b[i]; [EOL]         final double cb = SPLIT_FACTOR * bi; [EOL]         final double bHigh = cb - (cb - bi); [EOL]         final double bLow = bi - bHigh; [EOL]         prodHigh[i] = ai * bi; [EOL]         final double prodLow = aLow * bLow - (((prodHigh[i] - aHigh * bHigh) - aLow * bHigh) - aHigh * bLow); [EOL]         prodLowSum += prodLow; [EOL]     } [EOL]     final double prodHighCur = prodHigh[0]; [EOL]     double prodHighNext = prodHigh[1]; [EOL]     double sHighPrev = prodHighCur + prodHighNext; [EOL]     double sPrime = sHighPrev - prodHighNext; [EOL]     double sLowSum = (prodHighNext - (sHighPrev - sPrime)) + (prodHighCur - sPrime); [EOL]     final int lenMinusOne = len - 1; [EOL]     for (int i = 1; i < lenMinusOne; i++) { [EOL]         prodHighNext = prodHigh[i + 1]; [EOL]         final double sHighCur = sHighPrev + prodHighNext; [EOL]         sPrime = sHighCur - prodHighNext; [EOL]         sLowSum += (prodHighNext - (sHighCur - sPrime)) + (sHighPrev - sPrime); [EOL]         sHighPrev = sHighCur; [EOL]     } [EOL]     double result = sHighPrev + (prodLowSum + sLowSum); [EOL]     if (Double.isNaN(result)) { [EOL]         result = 0; [EOL]         for (int i = 0; i < len; ++i) { [EOL]             result += a[i] * b[i]; [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 817,878
public static double linearCombination(final double a1, final double b1, final double a2, final double b2) { [EOL]     final double ca1 = SPLIT_FACTOR * a1; [EOL]     final double a1High = ca1 - (ca1 - a1); [EOL]     final double a1Low = a1 - a1High; [EOL]     final double cb1 = SPLIT_FACTOR * b1; [EOL]     final double b1High = cb1 - (cb1 - b1); [EOL]     final double b1Low = b1 - b1High; [EOL]     final double prod1High = a1 * b1; [EOL]     final double prod1Low = a1Low * b1Low - (((prod1High - a1High * b1High) - a1Low * b1High) - a1High * b1Low); [EOL]     final double ca2 = SPLIT_FACTOR * a2; [EOL]     final double a2High = ca2 - (ca2 - a2); [EOL]     final double a2Low = a2 - a2High; [EOL]     final double cb2 = SPLIT_FACTOR * b2; [EOL]     final double b2High = cb2 - (cb2 - b2); [EOL]     final double b2Low = b2 - b2High; [EOL]     final double prod2High = a2 * b2; [EOL]     final double prod2Low = a2Low * b2Low - (((prod2High - a2High * b2High) - a2Low * b2High) - a2High * b2Low); [EOL]     final double s12High = prod1High + prod2High; [EOL]     final double s12Prime = s12High - prod2High; [EOL]     final double s12Low = (prod2High - (s12High - s12Prime)) + (prod1High - s12Prime); [EOL]     double result = s12High + (prod1Low + prod2Low + s12Low); [EOL]     if (Double.isNaN(result)) { [EOL]         result = a1 * b1 + a2 * b2; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 901,955
public static double linearCombination(final double a1, final double b1, final double a2, final double b2, final double a3, final double b3) { [EOL]     final double ca1 = SPLIT_FACTOR * a1; [EOL]     final double a1High = ca1 - (ca1 - a1); [EOL]     final double a1Low = a1 - a1High; [EOL]     final double cb1 = SPLIT_FACTOR * b1; [EOL]     final double b1High = cb1 - (cb1 - b1); [EOL]     final double b1Low = b1 - b1High; [EOL]     final double prod1High = a1 * b1; [EOL]     final double prod1Low = a1Low * b1Low - (((prod1High - a1High * b1High) - a1Low * b1High) - a1High * b1Low); [EOL]     final double ca2 = SPLIT_FACTOR * a2; [EOL]     final double a2High = ca2 - (ca2 - a2); [EOL]     final double a2Low = a2 - a2High; [EOL]     final double cb2 = SPLIT_FACTOR * b2; [EOL]     final double b2High = cb2 - (cb2 - b2); [EOL]     final double b2Low = b2 - b2High; [EOL]     final double prod2High = a2 * b2; [EOL]     final double prod2Low = a2Low * b2Low - (((prod2High - a2High * b2High) - a2Low * b2High) - a2High * b2Low); [EOL]     final double ca3 = SPLIT_FACTOR * a3; [EOL]     final double a3High = ca3 - (ca3 - a3); [EOL]     final double a3Low = a3 - a3High; [EOL]     final double cb3 = SPLIT_FACTOR * b3; [EOL]     final double b3High = cb3 - (cb3 - b3); [EOL]     final double b3Low = b3 - b3High; [EOL]     final double prod3High = a3 * b3; [EOL]     final double prod3Low = a3Low * b3Low - (((prod3High - a3High * b3High) - a3Low * b3High) - a3High * b3Low); [EOL]     final double s12High = prod1High + prod2High; [EOL]     final double s12Prime = s12High - prod2High; [EOL]     final double s12Low = (prod2High - (s12High - s12Prime)) + (prod1High - s12Prime); [EOL]     final double s123High = s12High + prod3High; [EOL]     final double s123Prime = s123High - prod3High; [EOL]     final double s123Low = (prod3High - (s123High - s123Prime)) + (s12High - s123Prime); [EOL]     double result = s123High + (prod1Low + prod2Low + prod3Low + s12Low + s123Low); [EOL]     if (Double.isNaN(result)) { [EOL]         result = a1 * b1 + a2 * b2 + a3 * b3; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 980,1052
public static double linearCombination(final double a1, final double b1, final double a2, final double b2, final double a3, final double b3, final double a4, final double b4) { [EOL]     final double ca1 = SPLIT_FACTOR * a1; [EOL]     final double a1High = ca1 - (ca1 - a1); [EOL]     final double a1Low = a1 - a1High; [EOL]     final double cb1 = SPLIT_FACTOR * b1; [EOL]     final double b1High = cb1 - (cb1 - b1); [EOL]     final double b1Low = b1 - b1High; [EOL]     final double prod1High = a1 * b1; [EOL]     final double prod1Low = a1Low * b1Low - (((prod1High - a1High * b1High) - a1Low * b1High) - a1High * b1Low); [EOL]     final double ca2 = SPLIT_FACTOR * a2; [EOL]     final double a2High = ca2 - (ca2 - a2); [EOL]     final double a2Low = a2 - a2High; [EOL]     final double cb2 = SPLIT_FACTOR * b2; [EOL]     final double b2High = cb2 - (cb2 - b2); [EOL]     final double b2Low = b2 - b2High; [EOL]     final double prod2High = a2 * b2; [EOL]     final double prod2Low = a2Low * b2Low - (((prod2High - a2High * b2High) - a2Low * b2High) - a2High * b2Low); [EOL]     final double ca3 = SPLIT_FACTOR * a3; [EOL]     final double a3High = ca3 - (ca3 - a3); [EOL]     final double a3Low = a3 - a3High; [EOL]     final double cb3 = SPLIT_FACTOR * b3; [EOL]     final double b3High = cb3 - (cb3 - b3); [EOL]     final double b3Low = b3 - b3High; [EOL]     final double prod3High = a3 * b3; [EOL]     final double prod3Low = a3Low * b3Low - (((prod3High - a3High * b3High) - a3Low * b3High) - a3High * b3Low); [EOL]     final double ca4 = SPLIT_FACTOR * a4; [EOL]     final double a4High = ca4 - (ca4 - a4); [EOL]     final double a4Low = a4 - a4High; [EOL]     final double cb4 = SPLIT_FACTOR * b4; [EOL]     final double b4High = cb4 - (cb4 - b4); [EOL]     final double b4Low = b4 - b4High; [EOL]     final double prod4High = a4 * b4; [EOL]     final double prod4Low = a4Low * b4Low - (((prod4High - a4High * b4High) - a4Low * b4High) - a4High * b4Low); [EOL]     final double s12High = prod1High + prod2High; [EOL]     final double s12Prime = s12High - prod2High; [EOL]     final double s12Low = (prod2High - (s12High - s12Prime)) + (prod1High - s12Prime); [EOL]     final double s123High = s12High + prod3High; [EOL]     final double s123Prime = s123High - prod3High; [EOL]     final double s123Low = (prod3High - (s123High - s123Prime)) + (s12High - s123Prime); [EOL]     final double s1234High = s123High + prod4High; [EOL]     final double s1234Prime = s1234High - prod4High; [EOL]     final double s1234Low = (prod4High - (s1234High - s1234Prime)) + (s123High - s1234Prime); [EOL]     double result = s1234High + (prod1Low + prod2Low + prod3Low + prod4Low + s12Low + s123Low + s1234Low); [EOL]     if (Double.isNaN(result)) { [EOL]         result = a1 * b1 + a2 * b2 + a3 * b3 + a4 * b4; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 1081,1171
public static boolean equals(float[] x, float[] y) { [EOL]     if ((x == null) || (y == null)) { [EOL]         return !((x == null) ^ (y == null)); [EOL]     } [EOL]     if (x.length != y.length) { [EOL]         return false; [EOL]     } [EOL]     for (int i = 0; i < x.length; ++i) { [EOL]         if (!Precision.equals(x[i], y[i])) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 1183,1196
public static boolean equalsIncludingNaN(float[] x, float[] y) { [EOL]     if ((x == null) || (y == null)) { [EOL]         return !((x == null) ^ (y == null)); [EOL]     } [EOL]     if (x.length != y.length) { [EOL]         return false; [EOL]     } [EOL]     for (int i = 0; i < x.length; ++i) { [EOL]         if (!Precision.equalsIncludingNaN(x[i], y[i])) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 1209,1222
public static boolean equals(double[] x, double[] y) { [EOL]     if ((x == null) || (y == null)) { [EOL]         return !((x == null) ^ (y == null)); [EOL]     } [EOL]     if (x.length != y.length) { [EOL]         return false; [EOL]     } [EOL]     for (int i = 0; i < x.length; ++i) { [EOL]         if (!Precision.equals(x[i], y[i])) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 1234,1247
public static boolean equalsIncludingNaN(double[] x, double[] y) { [EOL]     if ((x == null) || (y == null)) { [EOL]         return !((x == null) ^ (y == null)); [EOL]     } [EOL]     if (x.length != y.length) { [EOL]         return false; [EOL]     } [EOL]     for (int i = 0; i < x.length; ++i) { [EOL]         if (!Precision.equalsIncludingNaN(x[i], y[i])) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 1260,1273
public static double[] normalizeArray(double[] values, double normalizedSum) throws MathIllegalArgumentException, MathArithmeticException { [EOL]     if (Double.isInfinite(normalizedSum)) { [EOL]         throw new MathIllegalArgumentException(LocalizedFormats.NORMALIZE_INFINITE); [EOL]     } [EOL]     if (Double.isNaN(normalizedSum)) { [EOL]         throw new MathIllegalArgumentException(LocalizedFormats.NORMALIZE_NAN); [EOL]     } [EOL]     double sum = 0d; [EOL]     final int len = values.length; [EOL]     double[] out = new double[len]; [EOL]     for (int i = 0; i < len; i++) { [EOL]         if (Double.isInfinite(values[i])) { [EOL]             throw new MathIllegalArgumentException(LocalizedFormats.INFINITE_ARRAY_ELEMENT, values[i], i); [EOL]         } [EOL]         if (!Double.isNaN(values[i])) { [EOL]             sum += values[i]; [EOL]         } [EOL]     } [EOL]     if (sum == 0) { [EOL]         throw new MathArithmeticException(LocalizedFormats.ARRAY_SUMS_TO_ZERO); [EOL]     } [EOL]     for (int i = 0; i < len; i++) { [EOL]         if (Double.isNaN(values[i])) { [EOL]             out[i] = Double.NaN; [EOL]         } else { [EOL]             out[i] = values[i] * normalizedSum / sum; [EOL]         } [EOL]     } [EOL]     return out; [EOL] } <line_num>: 1297,1327
public static <T> T[] buildArray(final Field<T> field, final int length) { [EOL]     @SuppressWarnings("unchecked") [EOL]     T[] array = (T[]) Array.newInstance(field.getRuntimeClass(), length); [EOL]     Arrays.fill(array, field.getZero()); [EOL]     return array; [EOL] } <line_num>: 1339,1344
@SuppressWarnings("unchecked") [EOL] public static <T> T[][] buildArray(final Field<T> field, final int rows, final int columns) { [EOL]     final T[][] array; [EOL]     if (columns < 0) { [EOL]         T[] dummyRow = buildArray(field, 0); [EOL]         array = (T[][]) Array.newInstance(dummyRow.getClass(), rows); [EOL]     } else { [EOL]         array = (T[][]) Array.newInstance(field.getRuntimeClass(), new int[] { rows, columns }); [EOL]         for (int i = 0; i < rows; ++i) { [EOL]             Arrays.fill(array[i], field.getZero()); [EOL]         } [EOL]     } [EOL]     return array; [EOL] } <line_num>: 1358,1374
public static double[] convolve(double[] x, double[] h) throws NullArgumentException, NoDataException { [EOL]     MathUtils.checkNotNull(x); [EOL]     MathUtils.checkNotNull(h); [EOL]     final int xLen = x.length; [EOL]     final int hLen = h.length; [EOL]     if (xLen == 0 || hLen == 0) { [EOL]         throw new NoDataException(); [EOL]     } [EOL]     final int totalLength = xLen + hLen - 1; [EOL]     final double[] y = new double[totalLength]; [EOL]     for (int n = 0; n < totalLength; n++) { [EOL]         double yn = 0; [EOL]         int k = FastMath.max(0, n + 1 - xLen); [EOL]         int j = n - k; [EOL]         while (k < hLen && j >= 0) { [EOL]             yn += x[j--] * h[k++]; [EOL]         } [EOL]         y[n] = yn; [EOL]     } [EOL]     return y; [EOL] } <line_num>: 1398,1427
public static void shuffle(int[] list, int start, Position pos) { [EOL]     shuffle(list, start, pos, new Well19937c()); [EOL] } <line_num>: 1453,1457
public static void shuffle(int[] list, int start, Position pos, RandomGenerator rng) { [EOL]     switch(pos) { [EOL]         case TAIL: [EOL]             { [EOL]                 for (int i = list.length - 1; i >= start; i--) { [EOL]                     final int target; [EOL]                     if (i == start) { [EOL]                         target = start; [EOL]                     } else { [EOL]                         target = new UniformIntegerDistribution(rng, start, i).sample(); [EOL]                     } [EOL]                     final int temp = list[target]; [EOL]                     list[target] = list[i]; [EOL]                     list[i] = temp; [EOL]                 } [EOL]             } [EOL]             break; [EOL]         case HEAD: [EOL]             { [EOL]                 for (int i = 0; i <= start; i++) { [EOL]                     final int target; [EOL]                     if (i == start) { [EOL]                         target = start; [EOL]                     } else { [EOL]                         target = new UniformIntegerDistribution(rng, i, start).sample(); [EOL]                     } [EOL]                     final int temp = list[target]; [EOL]                     list[target] = list[i]; [EOL]                     list[i] = temp; [EOL]                 } [EOL]             } [EOL]             break; [EOL]         default: [EOL]             throw new MathInternalError(); [EOL]     } [EOL] } <line_num>: 1473,1511
public static void shuffle(int[] list, RandomGenerator rng) { [EOL]     shuffle(list, 0, Position.TAIL, rng); [EOL] } <line_num>: 1521,1524
public static void shuffle(int[] list) { [EOL]     shuffle(list, new Well19937c()); [EOL] } <line_num>: 1533,1535