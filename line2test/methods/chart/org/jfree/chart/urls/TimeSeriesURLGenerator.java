public TimeSeriesURLGenerator() { [EOL]     super(); [EOL] } <line_num>: 85,87
public TimeSeriesURLGenerator(DateFormat dateFormat, String prefix, String seriesParameterName, String itemParameterName) { [EOL]     if (dateFormat == null) { [EOL]         throw new IllegalArgumentException("Null 'dateFormat' argument."); [EOL]     } [EOL]     if (prefix == null) { [EOL]         throw new IllegalArgumentException("Null 'prefix' argument."); [EOL]     } [EOL]     if (seriesParameterName == null) { [EOL]         throw new IllegalArgumentException("Null 'seriesParameterName' argument."); [EOL]     } [EOL]     if (itemParameterName == null) { [EOL]         throw new IllegalArgumentException("Null 'itemParameterName' argument."); [EOL]     } [EOL]     this.dateFormat = (DateFormat) dateFormat.clone(); [EOL]     this.prefix = prefix; [EOL]     this.seriesParameterName = seriesParameterName; [EOL]     this.itemParameterName = itemParameterName; [EOL] } <line_num>: 100,123
public DateFormat getDateFormat() { [EOL]     return (DateFormat) this.dateFormat.clone(); [EOL] } <line_num>: 132,134
public String getPrefix() { [EOL]     return this.prefix; [EOL] } <line_num>: 143,145
public String getSeriesParameterName() { [EOL]     return this.seriesParameterName; [EOL] } <line_num>: 154,156
public String getItemParameterName() { [EOL]     return this.itemParameterName; [EOL] } <line_num>: 165,167
public String generateURL(XYDataset dataset, int series, int item) { [EOL]     String result = this.prefix; [EOL]     boolean firstParameter = result.indexOf("?") == -1; [EOL]     Comparable seriesKey = dataset.getSeriesKey(series); [EOL]     if (seriesKey != null) { [EOL]         result += firstParameter ? "?" : "&amp;"; [EOL]         String s = null; [EOL]         try { [EOL]             s = URLEncoder.encode(seriesKey.toString(), "UTF-8"); [EOL]         } catch (UnsupportedEncodingException e) { [EOL]             s = seriesKey.toString(); [EOL]         } [EOL]         result += this.seriesParameterName + "=" + s; [EOL]         firstParameter = false; [EOL]     } [EOL]     long x = (long) dataset.getXValue(series, item); [EOL]     String xValue = this.dateFormat.format(new Date(x)); [EOL]     result += firstParameter ? "?" : "&amp;"; [EOL]     String s = null; [EOL]     try { [EOL]         s = URLEncoder.encode(xValue, "UTF-8"); [EOL]     } catch (UnsupportedEncodingException e) { [EOL]         s = xValue; [EOL]     } [EOL]     result += this.itemParameterName + "=" + s; [EOL]     return result; [EOL] } <line_num>: 178,207
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof TimeSeriesURLGenerator)) { [EOL]         return false; [EOL]     } [EOL]     TimeSeriesURLGenerator that = (TimeSeriesURLGenerator) obj; [EOL]     if (!this.dateFormat.equals(that.dateFormat)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.itemParameterName.equals(that.itemParameterName)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.prefix.equals(that.prefix)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.seriesParameterName.equals(that.seriesParameterName)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 216,237