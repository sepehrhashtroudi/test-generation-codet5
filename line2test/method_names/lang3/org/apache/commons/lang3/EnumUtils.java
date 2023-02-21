public EnumUtils()
public static Map<String, E> getEnumMap(final Class<E> enumClass)
public static List<E> getEnumList(final Class<E> enumClass)
public static boolean isValidEnum(final Class<E> enumClass, final String enumName)
public static E getEnum(final Class<E> enumClass, final String enumName)
public static long generateBitVector(final Class<E> enumClass, final Iterable<E> values)
public static long[] generateBitVectors(final Class<E> enumClass, final Iterable<E> values)
public static long generateBitVector(final Class<E> enumClass, final E... values)
public static long[] generateBitVectors(final Class<E> enumClass, final E... values)
public static EnumSet<E> processBitVector(final Class<E> enumClass, final long value)
public static EnumSet<E> processBitVectors(final Class<E> enumClass, long... values)
private static Class<E> checkBitVectorable(final Class<E> enumClass)
private static Class<E> asEnum(final Class<E> enumClass)
