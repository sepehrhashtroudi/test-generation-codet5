public CharSetUtils() { [EOL]     super(); [EOL] } <line_num>: 40,42
public static String squeeze(final String str, final String... set) { [EOL]     if (StringUtils.isEmpty(str) || deepEmpty(set)) { [EOL]         return str; [EOL]     } [EOL]     final CharSet chars = CharSet.getInstance(set); [EOL]     final StringBuilder buffer = new StringBuilder(str.length()); [EOL]     final char[] chrs = str.toCharArray(); [EOL]     final int sz = chrs.length; [EOL]     char lastChar = ' '; [EOL]     char ch = ' '; [EOL]     for (int i = 0; i < sz; i++) { [EOL]         ch = chrs[i]; [EOL]         if (ch == lastChar && i != 0 && chars.contains(ch)) { [EOL]             continue; [EOL]         } [EOL]         buffer.append(ch); [EOL]         lastChar = ch; [EOL]     } [EOL]     return buffer.toString(); [EOL] } <line_num>: 64,84
public static boolean containsAny(final String str, final String... set) { [EOL]     if (StringUtils.isEmpty(str) || deepEmpty(set)) { [EOL]         return false; [EOL]     } [EOL]     final CharSet chars = CharSet.getInstance(set); [EOL]     for (final char c : str.toCharArray()) { [EOL]         if (chars.contains(c)) { [EOL]             return true; [EOL]         } [EOL]     } [EOL]     return false; [EOL] } <line_num>: 106,117
public static int count(final String str, final String... set) { [EOL]     if (StringUtils.isEmpty(str) || deepEmpty(set)) { [EOL]         return 0; [EOL]     } [EOL]     final CharSet chars = CharSet.getInstance(set); [EOL]     int count = 0; [EOL]     for (final char c : str.toCharArray()) { [EOL]         if (chars.contains(c)) { [EOL]             count++; [EOL]         } [EOL]     } [EOL]     return count; [EOL] } <line_num>: 139,151
public static String keep(final String str, final String... set) { [EOL]     if (str == null) { [EOL]         return null; [EOL]     } [EOL]     if (str.isEmpty() || deepEmpty(set)) { [EOL]         return StringUtils.EMPTY; [EOL]     } [EOL]     return modify(str, set, true); [EOL] } <line_num>: 174,182
public static String delete(final String str, final String... set) { [EOL]     if (StringUtils.isEmpty(str) || deepEmpty(set)) { [EOL]         return str; [EOL]     } [EOL]     return modify(str, set, false); [EOL] } <line_num>: 204,209
private static String modify(final String str, final String[] set, final boolean expect) { [EOL]     final CharSet chars = CharSet.getInstance(set); [EOL]     final StringBuilder buffer = new StringBuilder(str.length()); [EOL]     final char[] chrs = str.toCharArray(); [EOL]     final int sz = chrs.length; [EOL]     for (int i = 0; i < sz; i++) { [EOL]         if (chars.contains(chrs[i]) == expect) { [EOL]             buffer.append(chrs[i]); [EOL]         } [EOL]     } [EOL]     return buffer.toString(); [EOL] } <line_num>: 220,231
private static boolean deepEmpty(final String[] strings) { [EOL]     if (strings != null) { [EOL]         for (final String s : strings) { [EOL]             if (StringUtils.isNotEmpty(s)) { [EOL]                 return false; [EOL]             } [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 240,249
