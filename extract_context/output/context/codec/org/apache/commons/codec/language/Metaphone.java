public Metaphone()
public String metaphone(String txt)
private boolean isVowel(StringBuffer string, int index)
private boolean isPreviousChar(StringBuffer string, int index, char c)
private boolean isNextChar(StringBuffer string, int index, char c)
private boolean regionMatch(StringBuffer string, int index, String test)
private boolean isLastChar(int wdsz, int n)
public Object encode(Object pObject) throws EncoderException
public String encode(String pString)
public boolean isMetaphoneEqual(String str1, String str2)
public int getMaxCodeLen()
public void setMaxCodeLen(int maxCodeLen)
String VOWELS=Optional["AEIOU"]
String FRONTV=Optional["EIY"]
String VARSON=Optional["CSPTG"]
int maxCodeLen=Optional[4]