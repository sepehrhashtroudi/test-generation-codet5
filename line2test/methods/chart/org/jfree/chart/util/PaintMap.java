public PaintMap() { [EOL]     this.store = new HashMap(); [EOL] } <line_num>: 78,80
public Paint getPaint(Comparable key) { [EOL]     if (key == null) { [EOL]         throw new IllegalArgumentException("Null 'key' argument."); [EOL]     } [EOL]     return (Paint) this.store.get(key); [EOL] } <line_num>: 93,98
public boolean containsKey(Comparable key) { [EOL]     return this.store.containsKey(key); [EOL] } <line_num>: 109,111
public void put(Comparable key, Paint paint) { [EOL]     if (key == null) { [EOL]         throw new IllegalArgumentException("Null 'key' argument."); [EOL]     } [EOL]     this.store.put(key, paint); [EOL] } <line_num>: 123,128
public void clear() { [EOL]     this.store.clear(); [EOL] } <line_num>: 133,135
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof PaintMap)) { [EOL]         return false; [EOL]     } [EOL]     PaintMap that = (PaintMap) obj; [EOL]     if (this.store.size() != that.store.size()) { [EOL]         return false; [EOL]     } [EOL]     Set keys = this.store.keySet(); [EOL]     Iterator iterator = keys.iterator(); [EOL]     while (iterator.hasNext()) { [EOL]         Comparable key = (Comparable) iterator.next(); [EOL]         Paint p1 = getPaint(key); [EOL]         Paint p2 = that.getPaint(key); [EOL]         if (!PaintUtilities.equal(p1, p2)) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 144,166
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 175,179
private void writeObject(ObjectOutputStream stream) throws IOException { [EOL]     stream.defaultWriteObject(); [EOL]     stream.writeInt(this.store.size()); [EOL]     Set keys = this.store.keySet(); [EOL]     Iterator iterator = keys.iterator(); [EOL]     while (iterator.hasNext()) { [EOL]         Comparable key = (Comparable) iterator.next(); [EOL]         stream.writeObject(key); [EOL]         Paint paint = getPaint(key); [EOL]         SerialUtilities.writePaint(paint, stream); [EOL]     } [EOL] } <line_num>: 188,199
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException { [EOL]     stream.defaultReadObject(); [EOL]     this.store = new HashMap(); [EOL]     int keyCount = stream.readInt(); [EOL]     for (int i = 0; i < keyCount; i++) { [EOL]         Comparable key = (Comparable) stream.readObject(); [EOL]         Paint paint = SerialUtilities.readPaint(stream); [EOL]         this.store.put(key, paint); [EOL]     } [EOL] } <line_num>: 209,219
