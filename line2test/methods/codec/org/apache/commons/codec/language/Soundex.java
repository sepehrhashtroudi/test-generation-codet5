public Soundex() { [EOL]     this(US_ENGLISH_MAPPING); [EOL] } <line_num>: 102,104
public Soundex(char[] mapping) { [EOL]     this.setSoundexMapping(mapping); [EOL] } <line_num>: 116,118
public int difference(String s1, String s2) throws EncoderException { [EOL]     return SoundexUtils.difference(this, s1, s2); [EOL] } <line_num>: 79,81
public Object encode(Object pObject) throws EncoderException { [EOL]     if (!(pObject instanceof String)) { [EOL]         throw new EncoderException("Parameter supplied to Soundex encode is not of type java.lang.String"); [EOL]     } [EOL]     return soundex((String) pObject); [EOL] } <line_num>: 133,138
public String encode(String pString) { [EOL]     return soundex(pString); [EOL] } <line_num>: 149,151
private char getMappingCode(String str, int index) { [EOL]     char mappedChar = this.map(str.charAt(index)); [EOL]     if (index > 1 && mappedChar != '0') { [EOL]         char hwChar = str.charAt(index - 1); [EOL]         if ('H' == hwChar || 'W' == hwChar) { [EOL]             char preHWChar = str.charAt(index - 2); [EOL]             char firstCode = this.map(preHWChar); [EOL]             if (firstCode == mappedChar || 'H' == preHWChar || 'W' == preHWChar) { [EOL]                 return 0; [EOL]             } [EOL]         } [EOL]     } [EOL]     return mappedChar; [EOL] } <line_num>: 166,181
public int getMaxLength() { [EOL]     return this.maxLength; [EOL] } <line_num>: 189,191
private char[] getSoundexMapping() { [EOL]     return this.soundexMapping; [EOL] } <line_num>: 198,200
private char map(char ch) { [EOL]     int index = ch - 'A'; [EOL]     if (index < 0 || index >= this.getSoundexMapping().length) { [EOL]         throw new IllegalArgumentException("The character is not mapped: " + ch); [EOL]     } [EOL]     return this.getSoundexMapping()[index]; [EOL] } <line_num>: 211,217
public void setMaxLength(int maxLength) { [EOL]     this.maxLength = maxLength; [EOL] } <line_num>: 226,228
private void setSoundexMapping(char[] soundexMapping) { [EOL]     this.soundexMapping = soundexMapping; [EOL] } <line_num>: 236,238
public String soundex(String str) { [EOL]     if (str == null) { [EOL]         return null; [EOL]     } [EOL]     str = SoundexUtils.clean(str); [EOL]     if (str.length() == 0) { [EOL]         return str; [EOL]     } [EOL]     char[] out = { '0', '0', '0', '0' }; [EOL]     char last, mapped; [EOL]     int incount = 1, count = 1; [EOL]     out[0] = str.charAt(0); [EOL]     last = getMappingCode(str, 0); [EOL]     while ((incount < str.length()) && (count < out.length)) { [EOL]         mapped = getMappingCode(str, incount++); [EOL]         if (mapped != 0) { [EOL]             if ((mapped != '0') && (mapped != last)) { [EOL]                 out[count++] = mapped; [EOL]             } [EOL]             last = mapped; [EOL]         } [EOL]     } [EOL]     return new String(out); [EOL] } <line_num>: 249,273