public Frequency()
public Frequency(Comparator<?> comparator)
public String toString()
public void addValue(Comparable<?> v) throws MathIllegalArgumentException
public void incrementValue(Comparable<?> v, long increment)
public void addValue(int v) throws MathIllegalArgumentException
public void addValue(long v) throws MathIllegalArgumentException
public void addValue(char v) throws MathIllegalArgumentException
public void clear()
public Iterator<Comparable<?>> valuesIterator()
public Iterator<Map.Entry<Comparable<?>, Long>> entrySetIterator()
public long getSumFreq()
public long getCount(Comparable<?> v)
public long getCount(int v)
public long getCount(long v)
public long getCount(char v)
public int getUniqueCount()
public double getPct(Comparable<?> v)
public double getPct(int v)
public double getPct(long v)
public double getPct(char v)
public long getCumFreq(Comparable<?> v)
public long getCumFreq(int v)
public long getCumFreq(long v)
public long getCumFreq(char v)
public double getCumPct(Comparable<?> v)
public double getCumPct(int v)
public double getCumPct(long v)
public double getCumPct(char v)
public List<Comparable<?>> getMode()
public void merge(final Frequency other) throws NullArgumentException
public void merge(final Collection<Frequency> others) throws NullArgumentException
public int compare(Comparable<T> o1, Comparable<T> o2)
public int hashCode()
public boolean equals(Object obj)
long serialVersionUID=Optional[-3845586908418844111L]
TreeMap<Comparable<?>, Long> freqTable
