public DefaultCategoryDataset()
public int getRowCount()
public int getColumnCount()
public Number getValue(int row, int column)
public Comparable getRowKey(int row)
public int getRowIndex(Comparable key)
public List getRowKeys()
public Comparable getColumnKey(int column)
public int getColumnIndex(Comparable key)
public List getColumnKeys()
public Number getValue(Comparable rowKey, Comparable columnKey)
public void addValue(Number value, Comparable rowKey, Comparable columnKey)
public void addValue(double value, Comparable rowKey, Comparable columnKey)
public void setValue(Number value, Comparable rowKey, Comparable columnKey)
public void setValue(double value, Comparable rowKey, Comparable columnKey)
public void incrementValue(double value, Comparable rowKey, Comparable columnKey)
public void removeValue(Comparable rowKey, Comparable columnKey)
public void removeRow(int rowIndex)
public void removeRow(Comparable rowKey)
public void removeColumn(int columnIndex)
public void removeColumn(Comparable columnKey)
public void clear()
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
public boolean isSelected(int row, int column)
public void setSelected(int row, int column, boolean selected)
public void setSelected(int row, int column, boolean selected, boolean notify)
public void clearSelection()
public void fireSelectionEvent()
