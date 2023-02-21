public StandardCategoryURLGenerator() { [EOL]     super(); [EOL] } <line_num>: 88,90
public StandardCategoryURLGenerator(String prefix) { [EOL]     if (prefix == null) { [EOL]         throw new IllegalArgumentException("Null 'prefix' argument."); [EOL]     } [EOL]     this.prefix = prefix; [EOL] } <line_num>: 97,102
public StandardCategoryURLGenerator(String prefix, String seriesParameterName, String categoryParameterName) { [EOL]     if (prefix == null) { [EOL]         throw new IllegalArgumentException("Null 'prefix' argument."); [EOL]     } [EOL]     if (seriesParameterName == null) { [EOL]         throw new IllegalArgumentException("Null 'seriesParameterName' argument."); [EOL]     } [EOL]     if (categoryParameterName == null) { [EOL]         throw new IllegalArgumentException("Null 'categoryParameterName' argument."); [EOL]     } [EOL]     this.prefix = prefix; [EOL]     this.seriesParameterName = seriesParameterName; [EOL]     this.categoryParameterName = categoryParameterName; [EOL] } <line_num>: 113,132
public String generateURL(CategoryDataset dataset, int series, int category) { [EOL]     String url = this.prefix; [EOL]     Comparable seriesKey = dataset.getRowKey(series); [EOL]     Comparable categoryKey = dataset.getColumnKey(category); [EOL]     boolean firstParameter = url.indexOf("?") == -1; [EOL]     url += firstParameter ? "?" : "&amp;"; [EOL]     url += this.seriesParameterName + "="; [EOL]     String seriesKeyStr = null; [EOL]     try { [EOL]         seriesKeyStr = URLEncoder.encode(seriesKey.toString(), "UTF-8"); [EOL]     } catch (UnsupportedEncodingException e) { [EOL]         seriesKeyStr = seriesKey.toString(); [EOL]     } [EOL]     String categoryKeyStr = null; [EOL]     try { [EOL]         categoryKeyStr = URLEncoder.encode(categoryKey.toString(), "UTF-8"); [EOL]     } catch (UnsupportedEncodingException e) { [EOL]         categoryKeyStr = categoryKey.toString(); [EOL]     } [EOL]     url += seriesKeyStr + "&amp;" + this.categoryParameterName + "=" + categoryKeyStr; [EOL]     return url; [EOL] } <line_num>: 143,168
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof StandardCategoryURLGenerator)) { [EOL]         return false; [EOL]     } [EOL]     StandardCategoryURLGenerator that = (StandardCategoryURLGenerator) obj; [EOL]     if (!ObjectUtilities.equal(this.prefix, that.prefix)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.seriesParameterName, that.seriesParameterName)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.categoryParameterName, that.categoryParameterName)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 177,198
public int hashCode() { [EOL]     int result; [EOL]     result = (this.prefix != null ? this.prefix.hashCode() : 0); [EOL]     result = 29 * result + (this.seriesParameterName != null ? this.seriesParameterName.hashCode() : 0); [EOL]     result = 29 * result + (this.categoryParameterName != null ? this.categoryParameterName.hashCode() : 0); [EOL]     return result; [EOL] } <line_num>: 205,215
