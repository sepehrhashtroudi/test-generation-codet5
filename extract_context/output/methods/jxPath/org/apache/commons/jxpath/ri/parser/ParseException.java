public ParseException(Token currentTokenVal, int[][] expectedTokenSequencesVal, String[] tokenImageVal) { [EOL]     super(""); [EOL]     specialConstructor = true; [EOL]     currentToken = currentTokenVal; [EOL]     expectedTokenSequences = expectedTokenSequencesVal; [EOL]     tokenImage = tokenImageVal; [EOL] } <line_num>: 27,37
public ParseException() { [EOL]     super(); [EOL]     specialConstructor = false; [EOL] } <line_num>: 49,52
public ParseException(String message) { [EOL]     super(message); [EOL]     specialConstructor = false; [EOL] } <line_num>: 54,57
public String getMessage() { [EOL]     if (!specialConstructor) { [EOL]         return super.getMessage(); [EOL]     } [EOL]     String expected = ""; [EOL]     int maxSize = 0; [EOL]     for (int i = 0; i < expectedTokenSequences.length; i++) { [EOL]         if (maxSize < expectedTokenSequences[i].length) { [EOL]             maxSize = expectedTokenSequences[i].length; [EOL]         } [EOL]         for (int j = 0; j < expectedTokenSequences[i].length; j++) { [EOL]             expected += tokenImage[expectedTokenSequences[i][j]] + " "; [EOL]         } [EOL]         if (expectedTokenSequences[i][expectedTokenSequences[i].length - 1] != 0) { [EOL]             expected += "..."; [EOL]         } [EOL]         expected += eol + "    "; [EOL]     } [EOL]     String retval = "Encountered \""; [EOL]     Token tok = currentToken.next; [EOL]     for (int i = 0; i < maxSize; i++) { [EOL]         if (i != 0) [EOL]             retval += " "; [EOL]         if (tok.kind == 0) { [EOL]             retval += tokenImage[0]; [EOL]             break; [EOL]         } [EOL]         retval += add_escapes(tok.image); [EOL]         tok = tok.next; [EOL]     } [EOL]     retval += "\" at line " + currentToken.next.beginLine + ", column " + currentToken.next.beginColumn; [EOL]     retval += "." + eol; [EOL]     if (expectedTokenSequences.length == 1) { [EOL]         retval += "Was expecting:" + eol + "    "; [EOL]     } else { [EOL]         retval += "Was expecting one of:" + eol + "    "; [EOL]     } [EOL]     retval += expected; [EOL]     return retval; [EOL] } <line_num>: 97,135
protected String add_escapes(String str) { [EOL]     StringBuffer retval = new StringBuffer(); [EOL]     char ch; [EOL]     for (int i = 0; i < str.length(); i++) { [EOL]         switch(str.charAt(i)) { [EOL]             case 0: [EOL]                 continue; [EOL]             case '\b': [EOL]                 retval.append("\\b"); [EOL]                 continue; [EOL]             case '\t': [EOL]                 retval.append("\\t"); [EOL]                 continue; [EOL]             case '\n': [EOL]                 retval.append("\\n"); [EOL]                 continue; [EOL]             case '\f': [EOL]                 retval.append("\\f"); [EOL]                 continue; [EOL]             case '\r': [EOL]                 retval.append("\\r"); [EOL]                 continue; [EOL]             case '\"': [EOL]                 retval.append("\\\""); [EOL]                 continue; [EOL]             case '\'': [EOL]                 retval.append("\\\'"); [EOL]                 continue; [EOL]             case '\\': [EOL]                 retval.append("\\\\"); [EOL]                 continue; [EOL]             default: [EOL]                 if ((ch = str.charAt(i)) < 0x20 || ch > 0x7e) { [EOL]                     String s = "0000" + Integer.toString(ch, 16); [EOL]                     retval.append("\\u" + s.substring(s.length() - 4, s.length())); [EOL]                 } else { [EOL]                     retval.append(ch); [EOL]                 } [EOL]                 continue; [EOL]         } [EOL]     } [EOL]     return retval.toString(); [EOL] } <line_num>: 147,190
