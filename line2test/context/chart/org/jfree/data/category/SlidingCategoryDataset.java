public SlidingCategoryDataset(CategoryDataset underlying, int firstColumn, int maxColumns)
public CategoryDataset getUnderlyingDataset()
public int getFirstCategoryIndex()
public void setFirstCategoryIndex(int first)
public int getMaximumCategoryCount()
public void setMaximumCategoryCount(int max)
private int lastCategoryIndex()
public int getColumnIndex(Comparable key)
public Comparable getColumnKey(int column)
public List getColumnKeys()
public int getRowIndex(Comparable key)
public Comparable getRowKey(int row)
public List getRowKeys()
public Number getValue(Comparable rowKey, Comparable columnKey)
public int getColumnCount()
public int getRowCount()
public Number getValue(int row, int column)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
CategoryDataset underlying
int firstCategoryIndex
int maximumCategoryCount
