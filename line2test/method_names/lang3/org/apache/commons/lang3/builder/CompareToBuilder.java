public CompareToBuilder()
public static int reflectionCompare(final Object lhs, final Object rhs)
public static int reflectionCompare(final Object lhs, final Object rhs, final boolean compareTransients)
public static int reflectionCompare(final Object lhs, final Object rhs, final Collection<String> excludeFields)
public static int reflectionCompare(final Object lhs, final Object rhs, final String... excludeFields)
public static int reflectionCompare(final Object lhs, final Object rhs, final boolean compareTransients, final Class<?> reflectUpToClass, final String... excludeFields)
private static void reflectionAppend(final Object lhs, final Object rhs, final Class<?> clazz, final CompareToBuilder builder, final boolean useTransients, final String[] excludeFields)
public CompareToBuilder appendSuper(final int superCompareTo)
public CompareToBuilder append(final Object lhs, final Object rhs)
public CompareToBuilder append(final Object lhs, final Object rhs, final Comparator<?> comparator)
public CompareToBuilder append(final long lhs, final long rhs)
public CompareToBuilder append(final int lhs, final int rhs)
public CompareToBuilder append(final short lhs, final short rhs)
public CompareToBuilder append(final char lhs, final char rhs)
public CompareToBuilder append(final byte lhs, final byte rhs)
public CompareToBuilder append(final double lhs, final double rhs)
public CompareToBuilder append(final float lhs, final float rhs)
public CompareToBuilder append(final boolean lhs, final boolean rhs)
public CompareToBuilder append(final Object[] lhs, final Object[] rhs)
public CompareToBuilder append(final Object[] lhs, final Object[] rhs, final Comparator<?> comparator)
public CompareToBuilder append(final long[] lhs, final long[] rhs)
public CompareToBuilder append(final int[] lhs, final int[] rhs)
public CompareToBuilder append(final short[] lhs, final short[] rhs)
public CompareToBuilder append(final char[] lhs, final char[] rhs)
public CompareToBuilder append(final byte[] lhs, final byte[] rhs)
public CompareToBuilder append(final double[] lhs, final double[] rhs)
public CompareToBuilder append(final float[] lhs, final float[] rhs)
public CompareToBuilder append(final boolean[] lhs, final boolean[] rhs)
public int toComparison()
public Integer build()
