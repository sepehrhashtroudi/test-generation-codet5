Escaper(boolean escapeHtmlCharacters) { [EOL]     this.escapeHtmlCharacters = escapeHtmlCharacters; [EOL] } <line_num>: 64,66
public String escapeJsonString(CharSequence plainText) { [EOL]     StringBuffer escapedString = new StringBuffer(plainText.length() + 20); [EOL]     try { [EOL]         escapeJsonString(plainText, escapedString); [EOL]     } catch (IOException e) { [EOL]         throw new RuntimeException(e); [EOL]     } [EOL]     return escapedString.toString(); [EOL] } <line_num>: 68,76
private void escapeJsonString(CharSequence plainText, StringBuffer out) throws IOException { [EOL]     int pos = 0; [EOL]     int len = plainText.length(); [EOL]     for (int charCount, i = 0; i < len; i += charCount) { [EOL]         int codePoint = Character.codePointAt(plainText, i); [EOL]         charCount = Character.charCount(codePoint); [EOL]         if (!isControlCharacter(codePoint) && !mustEscapeCharInJsString(codePoint)) { [EOL]             continue; [EOL]         } [EOL]         out.append(plainText, pos, i); [EOL]         pos = i + charCount; [EOL]         switch(codePoint) { [EOL]             case '\b': [EOL]                 out.append("\\b"); [EOL]                 break; [EOL]             case '\t': [EOL]                 out.append("\\t"); [EOL]                 break; [EOL]             case '\n': [EOL]                 out.append("\\n"); [EOL]                 break; [EOL]             case '\f': [EOL]                 out.append("\\f"); [EOL]                 break; [EOL]             case '\r': [EOL]                 out.append("\\r"); [EOL]                 break; [EOL]             case '\\': [EOL]                 out.append("\\\\"); [EOL]                 break; [EOL]             case '/': [EOL]                 out.append("\\/"); [EOL]                 break; [EOL]             case '"': [EOL]                 out.append("\\\""); [EOL]                 break; [EOL]             default: [EOL]                 appendHexJavaScriptRepresentation(codePoint, out); [EOL]                 break; [EOL]         } [EOL]     } [EOL]     out.append(plainText, pos, len); [EOL] } <line_num>: 78,123
private boolean mustEscapeCharInJsString(int codepoint) { [EOL]     if (!Character.isSupplementaryCodePoint(codepoint)) { [EOL]         char c = (char) codepoint; [EOL]         return JS_ESCAPE_CHARS.contains(c) || (escapeHtmlCharacters && HTML_ESCAPE_CHARS.contains(c)); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 125,132
private static boolean isControlCharacter(int codePoint) { [EOL]     return codePoint < 0x20 || codePoint == 0x2028 || codePoint == 0x2029 || (codePoint >= 0x7f && codePoint <= 0x9f); [EOL] } <line_num>: 134,140
private static void appendHexJavaScriptRepresentation(int codePoint, Appendable out) throws IOException { [EOL]     if (Character.isSupplementaryCodePoint(codePoint)) { [EOL]         char[] surrogates = Character.toChars(codePoint); [EOL]         appendHexJavaScriptRepresentation(surrogates[0], out); [EOL]         appendHexJavaScriptRepresentation(surrogates[1], out); [EOL]         return; [EOL]     } [EOL]     out.append("\\u").append(HEX_CHARS[(codePoint >>> 12) & 0xf]).append(HEX_CHARS[(codePoint >>> 8) & 0xf]).append(HEX_CHARS[(codePoint >>> 4) & 0xf]).append(HEX_CHARS[codePoint & 0xf]); [EOL] } <line_num>: 142,159
