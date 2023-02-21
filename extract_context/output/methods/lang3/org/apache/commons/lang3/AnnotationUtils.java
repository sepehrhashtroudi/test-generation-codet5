public AnnotationUtils() { [EOL] } <line_num>: 107,108
@Override [EOL] protected String getShortClassName(final java.lang.Class<?> cls) { [EOL]     Class<? extends Annotation> annotationType = null; [EOL]     for (final Class<?> iface : ClassUtils.getAllInterfaces(cls)) { [EOL]         if (Annotation.class.isAssignableFrom(iface)) { [EOL]             @SuppressWarnings("unchecked") [EOL]             final Class<? extends Annotation> found = (Class<? extends Annotation>) iface; [EOL]             annotationType = found; [EOL]             break; [EOL]         } [EOL]     } [EOL]     return new StringBuilder(annotationType == null ? "" : annotationType.getName()).insert(0, '@').toString(); [EOL] } <line_num>: 71,85
@Override [EOL] protected void appendDetail(final StringBuffer buffer, final String fieldName, Object value) { [EOL]     if (value instanceof Annotation) { [EOL]         value = AnnotationUtils.toString((Annotation) value); [EOL]     } [EOL]     super.appendDetail(buffer, fieldName, value); [EOL] } <line_num>: 90,96
public static boolean equals(final Annotation a1, final Annotation a2) { [EOL]     if (a1 == a2) { [EOL]         return true; [EOL]     } [EOL]     if (a1 == null || a2 == null) { [EOL]         return false; [EOL]     } [EOL]     final Class<? extends Annotation> type = a1.annotationType(); [EOL]     final Class<? extends Annotation> type2 = a2.annotationType(); [EOL]     Validate.notNull(type, "Annotation %s with null annotationType()", a1); [EOL]     Validate.notNull(type2, "Annotation %s with null annotationType()", a2); [EOL]     if (!type.equals(type2)) { [EOL]         return false; [EOL]     } [EOL]     try { [EOL]         for (final Method m : type.getDeclaredMethods()) { [EOL]             if (m.getParameterTypes().length == 0 && isValidAnnotationMemberType(m.getReturnType())) { [EOL]                 final Object v1 = m.invoke(a1); [EOL]                 final Object v2 = m.invoke(a2); [EOL]                 if (!memberEquals(m.getReturnType(), v1, v2)) { [EOL]                     return false; [EOL]                 } [EOL]             } [EOL]         } [EOL]     } catch (final IllegalAccessException ex) { [EOL]         return false; [EOL]     } catch (final InvocationTargetException ex) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 122,153
public static int hashCode(final Annotation a) { [EOL]     int result = 0; [EOL]     final Class<? extends Annotation> type = a.annotationType(); [EOL]     for (final Method m : type.getDeclaredMethods()) { [EOL]         try { [EOL]             final Object value = m.invoke(a); [EOL]             if (value == null) { [EOL]                 throw new IllegalStateException(String.format("Annotation method %s returned null", m)); [EOL]             } [EOL]             result += hashMember(m.getName(), value); [EOL]         } catch (final RuntimeException ex) { [EOL]             throw ex; [EOL]         } catch (final Exception ex) { [EOL]             throw new RuntimeException(ex); [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 167,185
public static String toString(final Annotation a) { [EOL]     final ToStringBuilder builder = new ToStringBuilder(a, TO_STRING_STYLE); [EOL]     for (final Method m : a.annotationType().getDeclaredMethods()) { [EOL]         if (m.getParameterTypes().length > 0) { [EOL]             continue; [EOL]         } [EOL]         try { [EOL]             builder.append(m.getName(), m.invoke(a)); [EOL]         } catch (final RuntimeException ex) { [EOL]             throw ex; [EOL]         } catch (final Exception ex) { [EOL]             throw new RuntimeException(ex); [EOL]         } [EOL]     } [EOL]     return builder.build(); [EOL] } <line_num>: 195,210
public static boolean isValidAnnotationMemberType(Class<?> type) { [EOL]     if (type == null) { [EOL]         return false; [EOL]     } [EOL]     if (type.isArray()) { [EOL]         type = type.getComponentType(); [EOL]     } [EOL]     return type.isPrimitive() || type.isEnum() || type.isAnnotation() || String.class.equals(type) || Class.class.equals(type); [EOL] } <line_num>: 223,232
private static int hashMember(final String name, final Object value) { [EOL]     final int part1 = name.hashCode() * 127; [EOL]     if (value.getClass().isArray()) { [EOL]         return part1 ^ arrayMemberHash(value.getClass().getComponentType(), value); [EOL]     } [EOL]     if (value instanceof Annotation) { [EOL]         return part1 ^ hashCode((Annotation) value); [EOL]     } [EOL]     return part1 ^ value.hashCode(); [EOL] } <line_num>: 242,251
private static boolean memberEquals(final Class<?> type, final Object o1, final Object o2) { [EOL]     if (o1 == o2) { [EOL]         return true; [EOL]     } [EOL]     if (o1 == null || o2 == null) { [EOL]         return false; [EOL]     } [EOL]     if (type.isArray()) { [EOL]         return arrayMemberEquals(type.getComponentType(), o1, o2); [EOL]     } [EOL]     if (type.isAnnotation()) { [EOL]         return equals((Annotation) o1, (Annotation) o2); [EOL]     } [EOL]     return o1.equals(o2); [EOL] } <line_num>: 263,277
private static boolean arrayMemberEquals(final Class<?> componentType, final Object o1, final Object o2) { [EOL]     if (componentType.isAnnotation()) { [EOL]         return annotationArrayMemberEquals((Annotation[]) o1, (Annotation[]) o2); [EOL]     } [EOL]     if (componentType.equals(Byte.TYPE)) { [EOL]         return Arrays.equals((byte[]) o1, (byte[]) o2); [EOL]     } [EOL]     if (componentType.equals(Short.TYPE)) { [EOL]         return Arrays.equals((short[]) o1, (short[]) o2); [EOL]     } [EOL]     if (componentType.equals(Integer.TYPE)) { [EOL]         return Arrays.equals((int[]) o1, (int[]) o2); [EOL]     } [EOL]     if (componentType.equals(Character.TYPE)) { [EOL]         return Arrays.equals((char[]) o1, (char[]) o2); [EOL]     } [EOL]     if (componentType.equals(Long.TYPE)) { [EOL]         return Arrays.equals((long[]) o1, (long[]) o2); [EOL]     } [EOL]     if (componentType.equals(Float.TYPE)) { [EOL]         return Arrays.equals((float[]) o1, (float[]) o2); [EOL]     } [EOL]     if (componentType.equals(Double.TYPE)) { [EOL]         return Arrays.equals((double[]) o1, (double[]) o2); [EOL]     } [EOL]     if (componentType.equals(Boolean.TYPE)) { [EOL]         return Arrays.equals((boolean[]) o1, (boolean[]) o2); [EOL]     } [EOL]     return Arrays.equals((Object[]) o1, (Object[]) o2); [EOL] } <line_num>: 287,316
private static boolean annotationArrayMemberEquals(final Annotation[] a1, final Annotation[] a2) { [EOL]     if (a1.length != a2.length) { [EOL]         return false; [EOL]     } [EOL]     for (int i = 0; i < a1.length; i++) { [EOL]         if (!equals(a1[i], a2[i])) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 325,335
private static int arrayMemberHash(final Class<?> componentType, final Object o) { [EOL]     if (componentType.equals(Byte.TYPE)) { [EOL]         return Arrays.hashCode((byte[]) o); [EOL]     } [EOL]     if (componentType.equals(Short.TYPE)) { [EOL]         return Arrays.hashCode((short[]) o); [EOL]     } [EOL]     if (componentType.equals(Integer.TYPE)) { [EOL]         return Arrays.hashCode((int[]) o); [EOL]     } [EOL]     if (componentType.equals(Character.TYPE)) { [EOL]         return Arrays.hashCode((char[]) o); [EOL]     } [EOL]     if (componentType.equals(Long.TYPE)) { [EOL]         return Arrays.hashCode((long[]) o); [EOL]     } [EOL]     if (componentType.equals(Float.TYPE)) { [EOL]         return Arrays.hashCode((float[]) o); [EOL]     } [EOL]     if (componentType.equals(Double.TYPE)) { [EOL]         return Arrays.hashCode((double[]) o); [EOL]     } [EOL]     if (componentType.equals(Boolean.TYPE)) { [EOL]         return Arrays.hashCode((boolean[]) o); [EOL]     } [EOL]     return Arrays.hashCode((Object[]) o); [EOL] } <line_num>: 344,370
