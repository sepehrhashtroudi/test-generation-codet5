public JsonSerializerMap(Map<TypeKey, JsonSerializer<Object>> serializers) { [EOL]     int size = findSize(serializers.size()); [EOL]     _size = size; [EOL]     int hashMask = (size - 1); [EOL]     Bucket[] buckets = new Bucket[size]; [EOL]     for (Map.Entry<TypeKey, JsonSerializer<Object>> entry : serializers.entrySet()) { [EOL]         TypeKey key = entry.getKey(); [EOL]         int index = key.hashCode() & hashMask; [EOL]         buckets[index] = new Bucket(buckets[index], key, entry.getValue()); [EOL]     } [EOL]     _buckets = buckets; [EOL] } <line_num>: 17,29
public Bucket(Bucket next, TypeKey key, JsonSerializer<Object> value) { [EOL]     this.next = next; [EOL]     this.key = key; [EOL]     this.value = value; [EOL] } <line_num>: 84,89
private final static int findSize(int size) { [EOL]     int needed = (size <= 64) ? (size + size) : (size + (size >> 2)); [EOL]     int result = 8; [EOL]     while (result < needed) { [EOL]         result += result; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 31,40
public int size() { [EOL]     return _size; [EOL] } <line_num>: 48,48
public JsonSerializer<Object> find(TypeKey key) { [EOL]     int index = key.hashCode() & (_buckets.length - 1); [EOL]     Bucket bucket = _buckets[index]; [EOL]     if (bucket == null) { [EOL]         return null; [EOL]     } [EOL]     if (key.equals(bucket.key)) { [EOL]         return bucket.value; [EOL]     } [EOL]     while ((bucket = bucket.next) != null) { [EOL]         if (key.equals(bucket.key)) { [EOL]             return bucket.value; [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 50,70
