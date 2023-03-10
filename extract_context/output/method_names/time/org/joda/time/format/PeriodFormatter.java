public PeriodFormatter(PeriodPrinter printer, PeriodParser parser)
private PeriodFormatter(PeriodPrinter printer, PeriodParser parser, Locale locale, PeriodType type)
public boolean isPrinter()
public PeriodPrinter getPrinter()
public boolean isParser()
public PeriodParser getParser()
public PeriodFormatter withLocale(Locale locale)
public Locale getLocale()
public PeriodFormatter withParseType(PeriodType type)
public PeriodType getParseType()
public void printTo(StringBuffer buf, ReadablePeriod period)
public void printTo(Writer out, ReadablePeriod period) throws IOException
public String print(ReadablePeriod period)
private void checkPrinter()
private void checkPeriod(ReadablePeriod period)
public int parseInto(ReadWritablePeriod period, String text, int position)
public Period parsePeriod(String text)
public MutablePeriod parseMutablePeriod(String text)
private void checkParser()
