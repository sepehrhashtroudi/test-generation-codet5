public Metaphone() { [EOL]     super(); [EOL] } <line_num>: 67,69
public String metaphone(String txt) { [EOL]     boolean hard = false; [EOL]     if ((txt == null) || (txt.length() == 0)) { [EOL]         return ""; [EOL]     } [EOL]     if (txt.length() == 1) { [EOL]         return txt.toUpperCase(java.util.Locale.ENGLISH); [EOL]     } [EOL]     char[] inwd = txt.toUpperCase(java.util.Locale.ENGLISH).toCharArray(); [EOL]     StringBuffer local = new StringBuffer(40); [EOL]     StringBuffer code = new StringBuffer(10); [EOL]     switch(inwd[0]) { [EOL]         case 'K': [EOL]         case 'G': [EOL]         case 'P': [EOL]             if (inwd[1] == 'N') { [EOL]                 local.append(inwd, 1, inwd.length - 1); [EOL]             } else { [EOL]                 local.append(inwd); [EOL]             } [EOL]             break; [EOL]         case 'A': [EOL]             if (inwd[1] == 'E') { [EOL]                 local.append(inwd, 1, inwd.length - 1); [EOL]             } else { [EOL]                 local.append(inwd); [EOL]             } [EOL]             break; [EOL]         case 'W': [EOL]             if (inwd[1] == 'R') { [EOL]                 local.append(inwd, 1, inwd.length - 1); [EOL]                 break; [EOL]             } [EOL]             if (inwd[1] == 'H') { [EOL]                 local.append(inwd, 1, inwd.length - 1); [EOL]                 local.setCharAt(0, 'W'); [EOL]             } else { [EOL]                 local.append(inwd); [EOL]             } [EOL]             break; [EOL]         case 'X': [EOL]             inwd[0] = 'S'; [EOL]             local.append(inwd); [EOL]             break; [EOL]         default: [EOL]             local.append(inwd); [EOL]     } [EOL]     int wdsz = local.length(); [EOL]     int n = 0; [EOL]     while ((code.length() < this.getMaxCodeLen()) && (n < wdsz)) { [EOL]         char symb = local.charAt(n); [EOL]         if ((symb != 'C') && (isPreviousChar(local, n, symb))) { [EOL]             n++; [EOL]         } else { [EOL]             switch(symb) { [EOL]                 case 'A': [EOL]                 case 'E': [EOL]                 case 'I': [EOL]                 case 'O': [EOL]                 case 'U': [EOL]                     if (n == 0) { [EOL]                         code.append(symb); [EOL]                     } [EOL]                     break; [EOL]                 case 'B': [EOL]                     if (isPreviousChar(local, n, 'M') && isLastChar(wdsz, n)) { [EOL]                         break; [EOL]                     } [EOL]                     code.append(symb); [EOL]                     break; [EOL]                 case 'C': [EOL]                     if (isPreviousChar(local, n, 'S') && !isLastChar(wdsz, n) && (FRONTV.indexOf(local.charAt(n + 1)) >= 0)) { [EOL]                         break; [EOL]                     } [EOL]                     if (regionMatch(local, n, "CIA")) { [EOL]                         code.append('X'); [EOL]                         break; [EOL]                     } [EOL]                     if (!isLastChar(wdsz, n) && (FRONTV.indexOf(local.charAt(n + 1)) >= 0)) { [EOL]                         code.append('S'); [EOL]                         break; [EOL]                     } [EOL]                     if (isPreviousChar(local, n, 'S') && isNextChar(local, n, 'H')) { [EOL]                         code.append('K'); [EOL]                         break; [EOL]                     } [EOL]                     if (isNextChar(local, n, 'H')) { [EOL]                         if ((n == 0) && (wdsz >= 3) && isVowel(local, 2)) { [EOL]                             code.append('K'); [EOL]                         } else { [EOL]                             code.append('X'); [EOL]                         } [EOL]                     } else { [EOL]                         code.append('K'); [EOL]                     } [EOL]                     break; [EOL]                 case 'D': [EOL]                     if (!isLastChar(wdsz, n + 1) && isNextChar(local, n, 'G') && (FRONTV.indexOf(local.charAt(n + 2)) >= 0)) { [EOL]                         code.append('J'); [EOL]                         n += 2; [EOL]                     } else { [EOL]                         code.append('T'); [EOL]                     } [EOL]                     break; [EOL]                 case 'G': [EOL]                     if (isLastChar(wdsz, n + 1) && isNextChar(local, n, 'H')) { [EOL]                         break; [EOL]                     } [EOL]                     if (!isLastChar(wdsz, n + 1) && isNextChar(local, n, 'H') && !isVowel(local, n + 2)) { [EOL]                         break; [EOL]                     } [EOL]                     if ((n > 0) && (regionMatch(local, n, "GN") || regionMatch(local, n, "GNED"))) { [EOL]                         break; [EOL]                     } [EOL]                     if (isPreviousChar(local, n, 'G')) { [EOL]                         hard = true; [EOL]                     } else { [EOL]                         hard = false; [EOL]                     } [EOL]                     if (!isLastChar(wdsz, n) && (FRONTV.indexOf(local.charAt(n + 1)) >= 0) && (!hard)) { [EOL]                         code.append('J'); [EOL]                     } else { [EOL]                         code.append('K'); [EOL]                     } [EOL]                     break; [EOL]                 case 'H': [EOL]                     if (isLastChar(wdsz, n)) { [EOL]                         break; [EOL]                     } [EOL]                     if ((n > 0) && (VARSON.indexOf(local.charAt(n - 1)) >= 0)) { [EOL]                         break; [EOL]                     } [EOL]                     if (isVowel(local, n + 1)) { [EOL]                         code.append('H'); [EOL]                     } [EOL]                     break; [EOL]                 case 'F': [EOL]                 case 'J': [EOL]                 case 'L': [EOL]                 case 'M': [EOL]                 case 'N': [EOL]                 case 'R': [EOL]                     code.append(symb); [EOL]                     break; [EOL]                 case 'K': [EOL]                     if (n > 0) { [EOL]                         if (!isPreviousChar(local, n, 'C')) { [EOL]                             code.append(symb); [EOL]                         } [EOL]                     } else { [EOL]                         code.append(symb); [EOL]                     } [EOL]                     break; [EOL]                 case 'P': [EOL]                     if (isNextChar(local, n, 'H')) { [EOL]                         code.append('F'); [EOL]                     } else { [EOL]                         code.append(symb); [EOL]                     } [EOL]                     break; [EOL]                 case 'Q': [EOL]                     code.append('K'); [EOL]                     break; [EOL]                 case 'S': [EOL]                     if (regionMatch(local, n, "SH") || regionMatch(local, n, "SIO") || regionMatch(local, n, "SIA")) { [EOL]                         code.append('X'); [EOL]                     } else { [EOL]                         code.append('S'); [EOL]                     } [EOL]                     break; [EOL]                 case 'T': [EOL]                     if (regionMatch(local, n, "TIA") || regionMatch(local, n, "TIO")) { [EOL]                         code.append('X'); [EOL]                         break; [EOL]                     } [EOL]                     if (regionMatch(local, n, "TCH")) { [EOL]                         break; [EOL]                     } [EOL]                     if (regionMatch(local, n, "TH")) { [EOL]                         code.append('0'); [EOL]                     } else { [EOL]                         code.append('T'); [EOL]                     } [EOL]                     break; [EOL]                 case 'V': [EOL]                     code.append('F'); [EOL]                     break; [EOL]                 case 'W': [EOL]                 case 'Y': [EOL]                     if (!isLastChar(wdsz, n) && isVowel(local, n + 1)) { [EOL]                         code.append(symb); [EOL]                     } [EOL]                     break; [EOL]                 case 'X': [EOL]                     code.append('K'); [EOL]                     code.append('S'); [EOL]                     break; [EOL]                 case 'Z': [EOL]                     code.append('S'); [EOL]                     break; [EOL]             } [EOL]             n++; [EOL]         } [EOL]         if (code.length() > this.getMaxCodeLen()) { [EOL]             code.setLength(this.getMaxCodeLen()); [EOL]         } [EOL]     } [EOL]     return code.toString(); [EOL] } <line_num>: 81,313
private boolean isVowel(StringBuffer string, int index) { [EOL]     return VOWELS.indexOf(string.charAt(index)) >= 0; [EOL] } <line_num>: 315,317
private boolean isPreviousChar(StringBuffer string, int index, char c) { [EOL]     boolean matches = false; [EOL]     if (index > 0 && index < string.length()) { [EOL]         matches = string.charAt(index - 1) == c; [EOL]     } [EOL]     return matches; [EOL] } <line_num>: 319,326
private boolean isNextChar(StringBuffer string, int index, char c) { [EOL]     boolean matches = false; [EOL]     if (index >= 0 && index < string.length() - 1) { [EOL]         matches = string.charAt(index + 1) == c; [EOL]     } [EOL]     return matches; [EOL] } <line_num>: 328,335
private boolean regionMatch(StringBuffer string, int index, String test) { [EOL]     boolean matches = false; [EOL]     if (index >= 0 && (index + test.length() - 1) < string.length()) { [EOL]         String substring = string.substring(index, index + test.length()); [EOL]         matches = substring.equals(test); [EOL]     } [EOL]     return matches; [EOL] } <line_num>: 337,345
private boolean isLastChar(int wdsz, int n) { [EOL]     return n + 1 == wdsz; [EOL] } <line_num>: 347,349
public Object encode(Object pObject) throws EncoderException { [EOL]     if (!(pObject instanceof java.lang.String)) { [EOL]         throw new EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String"); [EOL]     } [EOL]     return metaphone((String) pObject); [EOL] } <line_num>: 364,369
public String encode(String pString) { [EOL]     return metaphone(pString); [EOL] } <line_num>: 377,379
public boolean isMetaphoneEqual(String str1, String str2) { [EOL]     return metaphone(str1).equals(metaphone(str2)); [EOL] } <line_num>: 389,391
public int getMaxCodeLen() { [EOL]     return this.maxCodeLen; [EOL] } <line_num>: 397,397
public void setMaxCodeLen(int maxCodeLen) { [EOL]     this.maxCodeLen = maxCodeLen; [EOL] } <line_num>: 403,403