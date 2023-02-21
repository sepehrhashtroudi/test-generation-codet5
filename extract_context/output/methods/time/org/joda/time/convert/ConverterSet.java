ConverterSet(Converter[] converters) { [EOL]     iConverters = converters; [EOL]     iSelectEntries = new Entry[1 << 4]; [EOL] } <line_num>: 32,37
Entry(Class<?> type, Converter converter) { [EOL]     iType = type; [EOL]     iConverter = converter; [EOL] } <line_num>: 322,325
Converter select(Class<?> type) throws IllegalStateException { [EOL]     Entry[] entries = iSelectEntries; [EOL]     int length = entries.length; [EOL]     int index = type == null ? 0 : type.hashCode() & (length - 1); [EOL]     Entry e; [EOL]     while ((e = entries[index]) != null) { [EOL]         if (e.iType == type) { [EOL]             return e.iConverter; [EOL]         } [EOL]         if (++index >= length) { [EOL]             index = 0; [EOL]         } [EOL]     } [EOL]     Converter converter = selectSlow(this, type); [EOL]     e = new Entry(type, converter); [EOL]     entries = (Entry[]) entries.clone(); [EOL]     entries[index] = e; [EOL]     for (int i = 0; i < length; i++) { [EOL]         if (entries[i] == null) { [EOL]             iSelectEntries = entries; [EOL]             return converter; [EOL]         } [EOL]     } [EOL]     int newLength = length << 1; [EOL]     Entry[] newEntries = new Entry[newLength]; [EOL]     for (int i = 0; i < length; i++) { [EOL]         e = entries[i]; [EOL]         type = e.iType; [EOL]         index = type == null ? 0 : type.hashCode() & (newLength - 1); [EOL]         while (newEntries[index] != null) { [EOL]             if (++index >= newLength) { [EOL]                 index = 0; [EOL]             } [EOL]         } [EOL]         newEntries[index] = e; [EOL]     } [EOL]     iSelectEntries = newEntries; [EOL]     return converter; [EOL] } <line_num>: 47,112
int size() { [EOL]     return iConverters.length; [EOL] } <line_num>: 117,119
void copyInto(Converter[] converters) { [EOL]     System.arraycopy(iConverters, 0, converters, 0, iConverters.length); [EOL] } <line_num>: 124,126
ConverterSet add(Converter converter, Converter[] removed) { [EOL]     Converter[] converters = iConverters; [EOL]     int length = converters.length; [EOL]     for (int i = 0; i < length; i++) { [EOL]         Converter existing = converters[i]; [EOL]         if (converter.equals(existing)) { [EOL]             if (removed != null) { [EOL]                 removed[0] = null; [EOL]             } [EOL]             return this; [EOL]         } [EOL]         if (converter.getSupportedType() == existing.getSupportedType()) { [EOL]             Converter[] copy = new Converter[length]; [EOL]             for (int j = 0; j < length; j++) { [EOL]                 if (j != i) { [EOL]                     copy[j] = converters[j]; [EOL]                 } else { [EOL]                     copy[j] = converter; [EOL]                 } [EOL]             } [EOL]             if (removed != null) { [EOL]                 removed[0] = existing; [EOL]             } [EOL]             return new ConverterSet(copy); [EOL]         } [EOL]     } [EOL]     Converter[] copy = new Converter[length + 1]; [EOL]     System.arraycopy(converters, 0, copy, 0, length); [EOL]     copy[length] = converter; [EOL]     if (removed != null) { [EOL]         removed[0] = null; [EOL]     } [EOL]     return new ConverterSet(copy); [EOL] } <line_num>: 138,180
ConverterSet remove(Converter converter, Converter[] removed) { [EOL]     Converter[] converters = iConverters; [EOL]     int length = converters.length; [EOL]     for (int i = 0; i < length; i++) { [EOL]         if (converter.equals(converters[i])) { [EOL]             return remove(i, removed); [EOL]         } [EOL]     } [EOL]     if (removed != null) { [EOL]         removed[0] = null; [EOL]     } [EOL]     return this; [EOL] } <line_num>: 190,205
ConverterSet remove(final int index, Converter[] removed) { [EOL]     Converter[] converters = iConverters; [EOL]     int length = converters.length; [EOL]     if (index >= length) { [EOL]         throw new IndexOutOfBoundsException(); [EOL]     } [EOL]     if (removed != null) { [EOL]         removed[0] = converters[index]; [EOL]     } [EOL]     Converter[] copy = new Converter[length - 1]; [EOL]     int j = 0; [EOL]     for (int i = 0; i < length; i++) { [EOL]         if (i != index) { [EOL]             copy[j++] = converters[i]; [EOL]         } [EOL]     } [EOL]     return new ConverterSet(copy); [EOL] } <line_num>: 215,236
private static Converter selectSlow(ConverterSet set, Class<?> type) { [EOL]     Converter[] converters = set.iConverters; [EOL]     int length = converters.length; [EOL]     Converter converter; [EOL]     for (int i = length; --i >= 0; ) { [EOL]         converter = converters[i]; [EOL]         Class<?> supportedType = converter.getSupportedType(); [EOL]         if (supportedType == type) { [EOL]             return converter; [EOL]         } [EOL]         if (supportedType == null || (type != null && !supportedType.isAssignableFrom(type))) { [EOL]             set = set.remove(i, null); [EOL]             converters = set.iConverters; [EOL]             length = converters.length; [EOL]         } [EOL]     } [EOL]     if (type == null || length == 0) { [EOL]         return null; [EOL]     } [EOL]     if (length == 1) { [EOL]         return converters[0]; [EOL]     } [EOL]     for (int i = length; --i >= 0; ) { [EOL]         converter = converters[i]; [EOL]         Class<?> supportedType = converter.getSupportedType(); [EOL]         for (int j = length; --j >= 0; ) { [EOL]             if (j != i && converters[j].getSupportedType().isAssignableFrom(supportedType)) { [EOL]                 set = set.remove(j, null); [EOL]                 converters = set.iConverters; [EOL]                 length = converters.length; [EOL]                 i = length - 1; [EOL]             } [EOL]         } [EOL]     } [EOL]     if (length == 1) { [EOL]         return converters[0]; [EOL]     } [EOL]     StringBuilder msg = new StringBuilder(); [EOL]     msg.append("Unable to find best converter for type \""); [EOL]     msg.append(type.getName()); [EOL]     msg.append("\" from remaining set: "); [EOL]     for (int i = 0; i < length; i++) { [EOL]         converter = converters[i]; [EOL]         Class<?> supportedType = converter.getSupportedType(); [EOL]         msg.append(converter.getClass().getName()); [EOL]         msg.append('['); [EOL]         msg.append(supportedType == null ? null : supportedType.getName()); [EOL]         msg.append("], "); [EOL]     } [EOL]     throw new IllegalStateException(msg.toString()); [EOL] } <line_num>: 242,316
