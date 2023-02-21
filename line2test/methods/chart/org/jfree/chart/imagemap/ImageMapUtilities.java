public static void writeImageMap(PrintWriter writer, String name, ChartRenderingInfo info) throws IOException { [EOL]     ImageMapUtilities.writeImageMap(writer, name, info, new StandardToolTipTagFragmentGenerator(), new StandardURLTagFragmentGenerator()); [EOL] } <line_num>: 77,85
public static void writeImageMap(PrintWriter writer, String name, ChartRenderingInfo info, boolean useOverLibForToolTips) throws IOException { [EOL]     ToolTipTagFragmentGenerator toolTipTagFragmentGenerator = null; [EOL]     if (useOverLibForToolTips) { [EOL]         toolTipTagFragmentGenerator = new OverLIBToolTipTagFragmentGenerator(); [EOL]     } else { [EOL]         toolTipTagFragmentGenerator = new StandardToolTipTagFragmentGenerator(); [EOL]     } [EOL]     ImageMapUtilities.writeImageMap(writer, name, info, toolTipTagFragmentGenerator, new StandardURLTagFragmentGenerator()); [EOL] } <line_num>: 98,115
public static void writeImageMap(PrintWriter writer, String name, ChartRenderingInfo info, ToolTipTagFragmentGenerator toolTipTagFragmentGenerator, URLTagFragmentGenerator urlTagFragmentGenerator) throws IOException { [EOL]     writer.println(ImageMapUtilities.getImageMap(name, info, toolTipTagFragmentGenerator, urlTagFragmentGenerator)); [EOL] } <line_num>: 132,140
public static String getImageMap(String name, ChartRenderingInfo info) { [EOL]     return ImageMapUtilities.getImageMap(name, info, new StandardToolTipTagFragmentGenerator(), new StandardURLTagFragmentGenerator()); [EOL] } <line_num>: 151,155
public static String getImageMap(String name, ChartRenderingInfo info, ToolTipTagFragmentGenerator toolTipTagFragmentGenerator, URLTagFragmentGenerator urlTagFragmentGenerator) { [EOL]     StringBuffer sb = new StringBuffer(); [EOL]     sb.append("<map id=\"" + htmlEscape(name) + "\" name=\"" + htmlEscape(name) + "\">"); [EOL]     sb.append(StringUtilities.getLineSeparator()); [EOL]     EntityCollection entities = info.getEntityCollection(); [EOL]     if (entities != null) { [EOL]         int count = entities.getEntityCount(); [EOL]         for (int i = count - 1; i >= 0; i--) { [EOL]             ChartEntity entity = entities.getEntity(i); [EOL]             if (entity.getToolTipText() != null || entity.getURLText() != null) { [EOL]                 String area = entity.getImageMapAreaTag(toolTipTagFragmentGenerator, urlTagFragmentGenerator); [EOL]                 if (area.length() > 0) { [EOL]                     sb.append(area); [EOL]                     sb.append(StringUtilities.getLineSeparator()); [EOL]                 } [EOL]             } [EOL]         } [EOL]     } [EOL]     sb.append("</map>"); [EOL]     return sb.toString(); [EOL] } <line_num>: 172,200
public static String htmlEscape(String input) { [EOL]     if (input == null) { [EOL]         throw new IllegalArgumentException("Null 'input' argument."); [EOL]     } [EOL]     StringBuffer result = new StringBuffer(); [EOL]     int length = input.length(); [EOL]     for (int i = 0; i < length; i++) { [EOL]         char c = input.charAt(i); [EOL]         if (c == '&') { [EOL]             result.append("&amp;"); [EOL]         } else if (c == '\"') { [EOL]             result.append("&quot;"); [EOL]         } else if (c == '<') { [EOL]             result.append("&lt;"); [EOL]         } else if (c == '>') { [EOL]             result.append("&gt;"); [EOL]         } else if (c == '\'') { [EOL]             result.append("&#39;"); [EOL]         } else if (c == '\\') { [EOL]             result.append("&#092;"); [EOL]         } else { [EOL]             result.append(c); [EOL]         } [EOL]     } [EOL]     return result.toString(); [EOL] } <line_num>: 212,243
public static String javascriptEscape(String input) { [EOL]     if (input == null) { [EOL]         throw new IllegalArgumentException("Null 'input' argument."); [EOL]     } [EOL]     StringBuffer result = new StringBuffer(); [EOL]     int length = input.length(); [EOL]     for (int i = 0; i < length; i++) { [EOL]         char c = input.charAt(i); [EOL]         if (c == '\"') { [EOL]             result.append("\\\""); [EOL]         } else if (c == '\'') { [EOL]             result.append("\\'"); [EOL]         } else if (c == '\\') { [EOL]             result.append("\\\\"); [EOL]         } else { [EOL]             result.append(c); [EOL]         } [EOL]     } [EOL]     return result.toString(); [EOL] } <line_num>: 255,277