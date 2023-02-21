protected AbstractCategoryItemLabelGenerator(String labelFormat, NumberFormat formatter) { [EOL]     this(labelFormat, formatter, NumberFormat.getPercentInstance()); [EOL] } <line_num>: 106,109
protected AbstractCategoryItemLabelGenerator(String labelFormat, NumberFormat formatter, NumberFormat percentFormatter) { [EOL]     if (labelFormat == null) { [EOL]         throw new IllegalArgumentException("Null 'labelFormat' argument."); [EOL]     } [EOL]     if (formatter == null) { [EOL]         throw new IllegalArgumentException("Null 'formatter' argument."); [EOL]     } [EOL]     if (percentFormatter == null) { [EOL]         throw new IllegalArgumentException("Null 'percentFormatter' argument."); [EOL]     } [EOL]     this.labelFormat = labelFormat; [EOL]     this.numberFormat = formatter; [EOL]     this.percentFormat = percentFormatter; [EOL]     this.dateFormat = null; [EOL]     this.nullValueString = "-"; [EOL] } <line_num>: 122,139
protected AbstractCategoryItemLabelGenerator(String labelFormat, DateFormat formatter) { [EOL]     if (labelFormat == null) { [EOL]         throw new IllegalArgumentException("Null 'labelFormat' argument."); [EOL]     } [EOL]     if (formatter == null) { [EOL]         throw new IllegalArgumentException("Null 'formatter' argument."); [EOL]     } [EOL]     this.labelFormat = labelFormat; [EOL]     this.numberFormat = null; [EOL]     this.percentFormat = NumberFormat.getPercentInstance(); [EOL]     this.dateFormat = formatter; [EOL]     this.nullValueString = "-"; [EOL] } <line_num>: 148,161
public String generateRowLabel(CategoryDataset dataset, int row) { [EOL]     return dataset.getRowKey(row).toString(); [EOL] } <line_num>: 171,173
public String generateColumnLabel(CategoryDataset dataset, int column) { [EOL]     return dataset.getColumnKey(column).toString(); [EOL] } <line_num>: 183,185
public String getLabelFormat() { [EOL]     return this.labelFormat; [EOL] } <line_num>: 192,194
public NumberFormat getNumberFormat() { [EOL]     return this.numberFormat; [EOL] } <line_num>: 201,203
public DateFormat getDateFormat() { [EOL]     return this.dateFormat; [EOL] } <line_num>: 210,212
protected String generateLabelString(CategoryDataset dataset, int row, int column) { [EOL]     if (dataset == null) { [EOL]         throw new IllegalArgumentException("Null 'dataset' argument."); [EOL]     } [EOL]     String result = null; [EOL]     Object[] items = createItemArray(dataset, row, column); [EOL]     result = MessageFormat.format(this.labelFormat, items); [EOL]     return result; [EOL] } <line_num>: 223,233
protected Object[] createItemArray(CategoryDataset dataset, int row, int column) { [EOL]     Object[] result = new Object[4]; [EOL]     result[0] = dataset.getRowKey(row).toString(); [EOL]     result[1] = dataset.getColumnKey(column).toString(); [EOL]     Number value = dataset.getValue(row, column); [EOL]     if (value != null) { [EOL]         if (this.numberFormat != null) { [EOL]             result[2] = this.numberFormat.format(value); [EOL]         } else if (this.dateFormat != null) { [EOL]             result[2] = this.dateFormat.format(value); [EOL]         } [EOL]     } else { [EOL]         result[2] = this.nullValueString; [EOL]     } [EOL]     if (value != null) { [EOL]         double total = DataUtilities.calculateColumnTotal(dataset, column); [EOL]         double percent = value.doubleValue() / total; [EOL]         result[3] = this.percentFormat.format(percent); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 245,269
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof AbstractCategoryItemLabelGenerator)) { [EOL]         return false; [EOL]     } [EOL]     AbstractCategoryItemLabelGenerator that = (AbstractCategoryItemLabelGenerator) obj; [EOL]     if (!this.labelFormat.equals(that.labelFormat)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.dateFormat, that.dateFormat)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.numberFormat, that.numberFormat)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 278,298
public int hashCode() { [EOL]     int result = 127; [EOL]     result = HashUtilities.hashCode(result, this.labelFormat); [EOL]     result = HashUtilities.hashCode(result, this.nullValueString); [EOL]     result = HashUtilities.hashCode(result, this.dateFormat); [EOL]     result = HashUtilities.hashCode(result, this.numberFormat); [EOL]     result = HashUtilities.hashCode(result, this.percentFormat); [EOL]     return result; [EOL] } <line_num>: 305,313
public Object clone() throws CloneNotSupportedException { [EOL]     AbstractCategoryItemLabelGenerator clone = (AbstractCategoryItemLabelGenerator) super.clone(); [EOL]     if (this.numberFormat != null) { [EOL]         clone.numberFormat = (NumberFormat) this.numberFormat.clone(); [EOL]     } [EOL]     if (this.dateFormat != null) { [EOL]         clone.dateFormat = (DateFormat) this.dateFormat.clone(); [EOL]     } [EOL]     return clone; [EOL] } <line_num>: 322,332