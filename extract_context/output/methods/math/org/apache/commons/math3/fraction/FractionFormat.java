public FractionFormat() { [EOL] } <line_num>: 46,47
public FractionFormat(final NumberFormat format) { [EOL]     super(format); [EOL] } <line_num>: 54,56
public FractionFormat(final NumberFormat numeratorFormat, final NumberFormat denominatorFormat) { [EOL]     super(numeratorFormat, denominatorFormat); [EOL] } <line_num>: 64,67
public static Locale[] getAvailableLocales() { [EOL]     return NumberFormat.getAvailableLocales(); [EOL] } <line_num>: 74,76
public static String formatFraction(Fraction f) { [EOL]     return getImproperInstance().format(f); [EOL] } <line_num>: 85,87
public static FractionFormat getImproperInstance() { [EOL]     return getImproperInstance(Locale.getDefault()); [EOL] } <line_num>: 93,95
public static FractionFormat getImproperInstance(final Locale locale) { [EOL]     return new FractionFormat(getDefaultNumberFormat(locale)); [EOL] } <line_num>: 102,104
public static FractionFormat getProperInstance() { [EOL]     return getProperInstance(Locale.getDefault()); [EOL] } <line_num>: 110,112
public static FractionFormat getProperInstance(final Locale locale) { [EOL]     return new ProperFractionFormat(getDefaultNumberFormat(locale)); [EOL] } <line_num>: 119,121
protected static NumberFormat getDefaultNumberFormat() { [EOL]     return getDefaultNumberFormat(Locale.getDefault()); [EOL] } <line_num>: 129,131
public StringBuffer format(final Fraction fraction, final StringBuffer toAppendTo, final FieldPosition pos) { [EOL]     pos.setBeginIndex(0); [EOL]     pos.setEndIndex(0); [EOL]     getNumeratorFormat().format(fraction.getNumerator(), toAppendTo, pos); [EOL]     toAppendTo.append(" / "); [EOL]     getDenominatorFormat().format(fraction.getDenominator(), toAppendTo, pos); [EOL]     return toAppendTo; [EOL] } <line_num>: 143,155
@Override [EOL] public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) throws FractionConversionException, MathIllegalArgumentException { [EOL]     StringBuffer ret = null; [EOL]     if (obj instanceof Fraction) { [EOL]         ret = format((Fraction) obj, toAppendTo, pos); [EOL]     } else if (obj instanceof Number) { [EOL]         ret = format(new Fraction(((Number) obj).doubleValue()), toAppendTo, pos); [EOL]     } else { [EOL]         throw new MathIllegalArgumentException(LocalizedFormats.CANNOT_FORMAT_OBJECT_TO_FRACTION); [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 171,186
@Override [EOL] public Fraction parse(final String source) throws MathParseException { [EOL]     final ParsePosition parsePosition = new ParsePosition(0); [EOL]     final Fraction result = parse(source, parsePosition); [EOL]     if (parsePosition.getIndex() == 0) { [EOL]         throw new MathParseException(source, parsePosition.getErrorIndex(), Fraction.class); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 195,203
@Override [EOL] public Fraction parse(final String source, final ParsePosition pos) { [EOL]     final int initialIndex = pos.getIndex(); [EOL]     parseAndIgnoreWhitespace(source, pos); [EOL]     final Number num = getNumeratorFormat().parse(source, pos); [EOL]     if (num == null) { [EOL]         pos.setIndex(initialIndex); [EOL]         return null; [EOL]     } [EOL]     final int startIndex = pos.getIndex(); [EOL]     final char c = parseNextCharacter(source, pos); [EOL]     switch(c) { [EOL]         case 0: [EOL]             return new Fraction(num.intValue(), 1); [EOL]         case '/': [EOL]             break; [EOL]         default: [EOL]             pos.setIndex(initialIndex); [EOL]             pos.setErrorIndex(startIndex); [EOL]             return null; [EOL]     } [EOL]     parseAndIgnoreWhitespace(source, pos); [EOL]     final Number den = getDenominatorFormat().parse(source, pos); [EOL]     if (den == null) { [EOL]         pos.setIndex(initialIndex); [EOL]         return null; [EOL]     } [EOL]     return new Fraction(num.intValue(), den.intValue()); [EOL] } <line_num>: 212,263
