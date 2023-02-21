public KeyedObjects2D()
public int getRowCount()
public int getColumnCount()
public Object getObject(int row, int column)
public Comparable getRowKey(int row)
public int getRowIndex(Comparable key)
public List getRowKeys()
public Comparable getColumnKey(int column)
public int getColumnIndex(Comparable key)
public List getColumnKeys()
public Object getObject(Comparable rowKey, Comparable columnKey)
public void addObject(Object object, Comparable rowKey, Comparable columnKey)
public void setObject(Object object, Comparable rowKey, Comparable columnKey)
public void removeObject(Comparable rowKey, Comparable columnKey)
public void removeRow(int rowIndex)
public void removeRow(Comparable rowKey)
public void removeColumn(int columnIndex)
public void removeColumn(Comparable columnKey)
public void clear()
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
long serialVersionUID=Optional[-1015873563138522374L]
List rowKeys
List columnKeys
List rows