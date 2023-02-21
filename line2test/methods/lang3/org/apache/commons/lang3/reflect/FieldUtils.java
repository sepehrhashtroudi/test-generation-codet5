public FieldUtils() { [EOL]     super(); [EOL] } <line_num>: 43,45
public static Field getField(final Class<?> cls, final String fieldName) { [EOL]     final Field field = getField(cls, fieldName, false); [EOL]     MemberUtils.setAccessibleWorkaround(field); [EOL]     return field; [EOL] } <line_num>: 58,62
public static Field getField(final Class<?> cls, final String fieldName, final boolean forceAccess) { [EOL]     if (cls == null) { [EOL]         throw new IllegalArgumentException("The class must not be null"); [EOL]     } [EOL]     if (fieldName == null) { [EOL]         throw new IllegalArgumentException("The field name must not be null"); [EOL]     } [EOL]     for (Class<?> acls = cls; acls != null; acls = acls.getSuperclass()) { [EOL]         try { [EOL]             final Field field = acls.getDeclaredField(fieldName); [EOL]             if (!Modifier.isPublic(field.getModifiers())) { [EOL]                 if (forceAccess) { [EOL]                     field.setAccessible(true); [EOL]                 } else { [EOL]                     continue; [EOL]                 } [EOL]             } [EOL]             return field; [EOL]         } catch (final NoSuchFieldException ex) { [EOL]         } [EOL]     } [EOL]     Field match = null; [EOL]     for (final Class<?> class1 : ClassUtils.getAllInterfaces(cls)) { [EOL]         try { [EOL]             final Field test = ((Class<?>) class1).getField(fieldName); [EOL]             if (match != null) { [EOL]                 throw new IllegalArgumentException("Reference to field " + fieldName + " is ambiguous relative to " + cls + "; a matching field exists on two or more implemented interfaces."); [EOL]             } [EOL]             match = test; [EOL]         } catch (final NoSuchFieldException ex) { [EOL]         } [EOL]     } [EOL]     return match; [EOL] } <line_num>: 79,134
public static Field getDeclaredField(final Class<?> cls, final String fieldName) { [EOL]     return getDeclaredField(cls, fieldName, false); [EOL] } <line_num>: 147,149
public static Field getDeclaredField(final Class<?> cls, final String fieldName, final boolean forceAccess) { [EOL]     if (cls == null) { [EOL]         throw new IllegalArgumentException("The class must not be null"); [EOL]     } [EOL]     if (fieldName == null) { [EOL]         throw new IllegalArgumentException("The field name must not be null"); [EOL]     } [EOL]     try { [EOL]         final Field field = cls.getDeclaredField(fieldName); [EOL]         if (!MemberUtils.isAccessible(field)) { [EOL]             if (forceAccess) { [EOL]                 field.setAccessible(true); [EOL]             } else { [EOL]                 return null; [EOL]             } [EOL]         } [EOL]         return field; [EOL]     } catch (final NoSuchFieldException e) { [EOL]     } [EOL]     return null; [EOL] } <line_num>: 166,188
public static Field[] getAllFields(Class<?> cls) { [EOL]     final List<Field> allFieldsList = getAllFieldsList(cls); [EOL]     return allFieldsList.toArray(new Field[allFieldsList.size()]); [EOL] } <line_num>: 198,201
public static List<Field> getAllFieldsList(Class<?> cls) { [EOL]     if (cls == null) { [EOL]         throw new IllegalArgumentException("The class must not be null"); [EOL]     } [EOL]     List<Field> allFields = new ArrayList<Field>(); [EOL]     Class<?> currentClass = cls; [EOL]     while (currentClass != null) { [EOL]         final Field[] declaredFields = currentClass.getDeclaredFields(); [EOL]         for (Field field : declaredFields) { [EOL]             allFields.add(field); [EOL]         } [EOL]         currentClass = currentClass.getSuperclass(); [EOL]     } [EOL]     return allFields; [EOL] } <line_num>: 211,225
public static Object readStaticField(final Field field) throws IllegalAccessException { [EOL]     return readStaticField(field, false); [EOL] } <line_num>: 238,240
public static Object readStaticField(final Field field, final boolean forceAccess) throws IllegalAccessException { [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("The field must not be null"); [EOL]     } [EOL]     if (!Modifier.isStatic(field.getModifiers())) { [EOL]         throw new IllegalArgumentException("The field '" + field.getName() + "' is not static"); [EOL]     } [EOL]     return readField(field, (Object) null, forceAccess); [EOL] } <line_num>: 255,263
public static Object readStaticField(final Class<?> cls, final String fieldName) throws IllegalAccessException { [EOL]     return readStaticField(cls, fieldName, false); [EOL] } <line_num>: 278,280
public static Object readStaticField(final Class<?> cls, final String fieldName, final boolean forceAccess) throws IllegalAccessException { [EOL]     final Field field = getField(cls, fieldName, forceAccess); [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("Cannot locate field " + fieldName + " on " + cls); [EOL]     } [EOL]     return readStaticField(field, false); [EOL] } <line_num>: 298,305
public static Object readDeclaredStaticField(final Class<?> cls, final String fieldName) throws IllegalAccessException { [EOL]     return readDeclaredStaticField(cls, fieldName, false); [EOL] } <line_num>: 320,322
public static Object readDeclaredStaticField(final Class<?> cls, final String fieldName, final boolean forceAccess) throws IllegalAccessException { [EOL]     final Field field = getDeclaredField(cls, fieldName, forceAccess); [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + "." + fieldName); [EOL]     } [EOL]     return readStaticField(field, false); [EOL] } <line_num>: 340,347
public static Object readField(final Field field, final Object target) throws IllegalAccessException { [EOL]     return readField(field, target, false); [EOL] } <line_num>: 362,364
public static Object readField(final Field field, final Object target, final boolean forceAccess) throws IllegalAccessException { [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("The field must not be null"); [EOL]     } [EOL]     if (forceAccess && !field.isAccessible()) { [EOL]         field.setAccessible(true); [EOL]     } else { [EOL]         MemberUtils.setAccessibleWorkaround(field); [EOL]     } [EOL]     return field.get(target); [EOL] } <line_num>: 381,391
public static Object readField(final Object target, final String fieldName) throws IllegalAccessException { [EOL]     return readField(target, fieldName, false); [EOL] } <line_num>: 406,408
public static Object readField(final Object target, final String fieldName, final boolean forceAccess) throws IllegalAccessException { [EOL]     if (target == null) { [EOL]         throw new IllegalArgumentException("target object must not be null"); [EOL]     } [EOL]     final Class<?> cls = target.getClass(); [EOL]     final Field field = getField(cls, fieldName, forceAccess); [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("Cannot locate field " + fieldName + " on " + cls); [EOL]     } [EOL]     return readField(field, target); [EOL] } <line_num>: 426,437
public static Object readDeclaredField(final Object target, final String fieldName) throws IllegalAccessException { [EOL]     return readDeclaredField(target, fieldName, false); [EOL] } <line_num>: 452,454
public static Object readDeclaredField(final Object target, final String fieldName, final boolean forceAccess) throws IllegalAccessException { [EOL]     if (target == null) { [EOL]         throw new IllegalArgumentException("target object must not be null"); [EOL]     } [EOL]     final Class<?> cls = target.getClass(); [EOL]     final Field field = getDeclaredField(cls, fieldName, forceAccess); [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + "." + fieldName); [EOL]     } [EOL]     return readField(field, target); [EOL] } <line_num>: 472,483
public static void writeStaticField(final Field field, final Object value) throws IllegalAccessException { [EOL]     writeStaticField(field, value, false); [EOL] } <line_num>: 497,499
public static void writeStaticField(final Field field, final Object value, final boolean forceAccess) throws IllegalAccessException { [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("The field must not be null"); [EOL]     } [EOL]     if (!Modifier.isStatic(field.getModifiers())) { [EOL]         throw new IllegalArgumentException("The field '" + field.getName() + "' is not static"); [EOL]     } [EOL]     writeField(field, (Object) null, value, forceAccess); [EOL] } <line_num>: 516,524
public static void writeStaticField(final Class<?> cls, final String fieldName, final Object value) throws IllegalAccessException { [EOL]     writeStaticField(cls, fieldName, value, false); [EOL] } <line_num>: 540,542
public static void writeStaticField(final Class<?> cls, final String fieldName, final Object value, final boolean forceAccess) throws IllegalAccessException { [EOL]     final Field field = getField(cls, fieldName, forceAccess); [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("Cannot locate field " + fieldName + " on " + cls); [EOL]     } [EOL]     writeStaticField(field, value); [EOL] } <line_num>: 561,569
public static void writeDeclaredStaticField(final Class<?> cls, final String fieldName, final Object value) throws IllegalAccessException { [EOL]     writeDeclaredStaticField(cls, fieldName, value, false); [EOL] } <line_num>: 585,587
public static void writeDeclaredStaticField(final Class<?> cls, final String fieldName, final Object value, final boolean forceAccess) throws IllegalAccessException { [EOL]     final Field field = getDeclaredField(cls, fieldName, forceAccess); [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + "." + fieldName); [EOL]     } [EOL]     writeField(field, (Object) null, value); [EOL] } <line_num>: 606,614
public static void writeField(final Field field, final Object target, final Object value) throws IllegalAccessException { [EOL]     writeField(field, target, value, false); [EOL] } <line_num>: 630,632
public static void writeField(final Field field, final Object target, final Object value, final boolean forceAccess) throws IllegalAccessException { [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("The field must not be null"); [EOL]     } [EOL]     if (forceAccess && !field.isAccessible()) { [EOL]         field.setAccessible(true); [EOL]     } else { [EOL]         MemberUtils.setAccessibleWorkaround(field); [EOL]     } [EOL]     field.set(target, value); [EOL] } <line_num>: 651,662
public static void writeField(final Object target, final String fieldName, final Object value) throws IllegalAccessException { [EOL]     writeField(target, fieldName, value, false); [EOL] } <line_num>: 678,680
public static void writeField(final Object target, final String fieldName, final Object value, final boolean forceAccess) throws IllegalAccessException { [EOL]     if (target == null) { [EOL]         throw new IllegalArgumentException("target object must not be null"); [EOL]     } [EOL]     final Class<?> cls = target.getClass(); [EOL]     final Field field = getField(cls, fieldName, forceAccess); [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + "." + fieldName); [EOL]     } [EOL]     writeField(field, target, value); [EOL] } <line_num>: 699,711
public static void writeDeclaredField(final Object target, final String fieldName, final Object value) throws IllegalAccessException { [EOL]     writeDeclaredField(target, fieldName, value, false); [EOL] } <line_num>: 727,729
public static void writeDeclaredField(final Object target, final String fieldName, final Object value, final boolean forceAccess) throws IllegalAccessException { [EOL]     if (target == null) { [EOL]         throw new IllegalArgumentException("target object must not be null"); [EOL]     } [EOL]     final Class<?> cls = target.getClass(); [EOL]     final Field field = getDeclaredField(cls, fieldName, forceAccess); [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + "." + fieldName); [EOL]     } [EOL]     writeField(field, target, value); [EOL] } <line_num>: 748,760
