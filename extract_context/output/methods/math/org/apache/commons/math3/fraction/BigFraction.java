public BigFraction(final BigInteger num) { [EOL]     this(num, BigInteger.ONE); [EOL] } <line_num>: 107,109
public BigFraction(BigInteger num, BigInteger den) { [EOL]     MathUtils.checkNotNull(num, LocalizedFormats.NUMERATOR); [EOL]     MathUtils.checkNotNull(den, LocalizedFormats.DENOMINATOR); [EOL]     if (BigInteger.ZERO.equals(den)) { [EOL]         throw new ZeroException(LocalizedFormats.ZERO_DENOMINATOR); [EOL]     } [EOL]     if (BigInteger.ZERO.equals(num)) { [EOL]         numerator = BigInteger.ZERO; [EOL]         denominator = BigInteger.ONE; [EOL]     } else { [EOL]         final BigInteger gcd = num.gcd(den); [EOL]         if (BigInteger.ONE.compareTo(gcd) < 0) { [EOL]             num = num.divide(gcd); [EOL]             den = den.divide(gcd); [EOL]         } [EOL]         if (BigInteger.ZERO.compareTo(den) > 0) { [EOL]             num = num.negate(); [EOL]             den = den.negate(); [EOL]         } [EOL]         numerator = num; [EOL]         denominator = den; [EOL]     } [EOL] } <line_num>: 120,149
public BigFraction(final double value) throws MathIllegalArgumentException { [EOL]     if (Double.isNaN(value)) { [EOL]         throw new MathIllegalArgumentException(LocalizedFormats.NAN_VALUE_CONVERSION); [EOL]     } [EOL]     if (Double.isInfinite(value)) { [EOL]         throw new MathIllegalArgumentException(LocalizedFormats.INFINITE_VALUE_CONVERSION); [EOL]     } [EOL]     final long bits = Double.doubleToLongBits(value); [EOL]     final long sign = bits & 0x8000000000000000L; [EOL]     final long exponent = bits & 0x7ff0000000000000L; [EOL]     long m = bits & 0x000fffffffffffffL; [EOL]     if (exponent != 0) { [EOL]         m |= 0x0010000000000000L; [EOL]     } [EOL]     if (sign != 0) { [EOL]         m = -m; [EOL]     } [EOL]     int k = ((int) (exponent >> 52)) - 1075; [EOL]     while (((m & 0x001ffffffffffffeL) != 0) && ((m & 0x1) == 0)) { [EOL]         m = m >> 1; [EOL]         ++k; [EOL]     } [EOL]     if (k < 0) { [EOL]         numerator = BigInteger.valueOf(m); [EOL]         denominator = BigInteger.ZERO.flipBit(-k); [EOL]     } else { [EOL]         numerator = BigInteger.valueOf(m).multiply(BigInteger.ZERO.flipBit(k)); [EOL]         denominator = BigInteger.ONE; [EOL]     } [EOL] } <line_num>: 172,206
public BigFraction(final double value, final double epsilon, final int maxIterations) throws FractionConversionException { [EOL]     this(value, epsilon, Integer.MAX_VALUE, maxIterations); [EOL] } <line_num>: 229,233
private BigFraction(final double value, final double epsilon, final int maxDenominator, int maxIterations) throws FractionConversionException { [EOL]     long overflow = Integer.MAX_VALUE; [EOL]     double r0 = value; [EOL]     long a0 = (long) FastMath.floor(r0); [EOL]     if (a0 > overflow) { [EOL]         throw new FractionConversionException(value, a0, 1l); [EOL]     } [EOL]     if (FastMath.abs(a0 - value) < epsilon) { [EOL]         numerator = BigInteger.valueOf(a0); [EOL]         denominator = BigInteger.ONE; [EOL]         return; [EOL]     } [EOL]     long p0 = 1; [EOL]     long q0 = 0; [EOL]     long p1 = a0; [EOL]     long q1 = 1; [EOL]     long p2 = 0; [EOL]     long q2 = 1; [EOL]     int n = 0; [EOL]     boolean stop = false; [EOL]     do { [EOL]         ++n; [EOL]         final double r1 = 1.0 / (r0 - a0); [EOL]         final long a1 = (long) FastMath.floor(r1); [EOL]         p2 = (a1 * p1) + p0; [EOL]         q2 = (a1 * q1) + q0; [EOL]         if ((p2 > overflow) || (q2 > overflow)) { [EOL]             if (epsilon == 0.0 && FastMath.abs(q1) < maxDenominator) { [EOL]                 break; [EOL]             } [EOL]             throw new FractionConversionException(value, p2, q2); [EOL]         } [EOL]         final double convergent = (double) p2 / (double) q2; [EOL]         if ((n < maxIterations) && (FastMath.abs(convergent - value) > epsilon) && (q2 < maxDenominator)) { [EOL]             p0 = p1; [EOL]             p1 = p2; [EOL]             q0 = q1; [EOL]             q1 = q2; [EOL]             a0 = a1; [EOL]             r0 = r1; [EOL]         } else { [EOL]             stop = true; [EOL]         } [EOL]     } while (!stop); [EOL]     if (n >= maxIterations) { [EOL]         throw new FractionConversionException(value, maxIterations); [EOL]     } [EOL]     if (q2 < maxDenominator) { [EOL]         numerator = BigInteger.valueOf(p2); [EOL]         denominator = BigInteger.valueOf(q2); [EOL]     } else { [EOL]         numerator = BigInteger.valueOf(p1); [EOL]         denominator = BigInteger.valueOf(q1); [EOL]     } [EOL] } <line_num>: 269,338
public BigFraction(final double value, final int maxDenominator) throws FractionConversionException { [EOL]     this(value, 0, maxDenominator, 100); [EOL] } <line_num>: 357,360
public BigFraction(final int num) { [EOL]     this(BigInteger.valueOf(num), BigInteger.ONE); [EOL] } <line_num>: 371,373
public BigFraction(final int num, final int den) { [EOL]     this(BigInteger.valueOf(num), BigInteger.valueOf(den)); [EOL] } <line_num>: 386,388
public BigFraction(final long num) { [EOL]     this(BigInteger.valueOf(num), BigInteger.ONE); [EOL] } <line_num>: 398,400
public BigFraction(final long num, final long den) { [EOL]     this(BigInteger.valueOf(num), BigInteger.valueOf(den)); [EOL] } <line_num>: 413,415
public static BigFraction getReducedFraction(final int numerator, final int denominator) { [EOL]     if (numerator == 0) { [EOL]         return ZERO; [EOL]     } [EOL]     return new BigFraction(numerator, denominator); [EOL] } <line_num>: 436,443
public BigFraction abs() { [EOL]     return (BigInteger.ZERO.compareTo(numerator) <= 0) ? this : negate(); [EOL] } <line_num>: 452,454
public BigFraction add(final BigInteger bg) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(bg); [EOL]     return new BigFraction(numerator.add(denominator.multiply(bg)), denominator); [EOL] } <line_num>: 468,471
public BigFraction add(final int i) { [EOL]     return add(BigInteger.valueOf(i)); [EOL] } <line_num>: 483,485
public BigFraction add(final long l) { [EOL]     return add(BigInteger.valueOf(l)); [EOL] } <line_num>: 497,499
public BigFraction add(final BigFraction fraction) { [EOL]     if (fraction == null) { [EOL]         throw new NullArgumentException(LocalizedFormats.FRACTION); [EOL]     } [EOL]     if (ZERO.equals(fraction)) { [EOL]         return this; [EOL]     } [EOL]     BigInteger num = null; [EOL]     BigInteger den = null; [EOL]     if (denominator.equals(fraction.denominator)) { [EOL]         num = numerator.add(fraction.numerator); [EOL]         den = denominator; [EOL]     } else { [EOL]         num = (numerator.multiply(fraction.denominator)).add((fraction.numerator).multiply(denominator)); [EOL]         den = denominator.multiply(fraction.denominator); [EOL]     } [EOL]     return new BigFraction(num, den); [EOL] } <line_num>: 512,532
public BigDecimal bigDecimalValue() { [EOL]     return new BigDecimal(numerator).divide(new BigDecimal(denominator)); [EOL] } <line_num>: 546,548
public BigDecimal bigDecimalValue(final int roundingMode) { [EOL]     return new BigDecimal(numerator).divide(new BigDecimal(denominator), roundingMode); [EOL] } <line_num>: 565,567
public BigDecimal bigDecimalValue(final int scale, final int roundingMode) { [EOL]     return new BigDecimal(numerator).divide(new BigDecimal(denominator), scale, roundingMode); [EOL] } <line_num>: 584,586
public int compareTo(final BigFraction object) { [EOL]     BigInteger nOd = numerator.multiply(object.denominator); [EOL]     BigInteger dOn = denominator.multiply(object.numerator); [EOL]     return nOd.compareTo(dOn); [EOL] } <line_num>: 599,603
public BigFraction divide(final BigInteger bg) { [EOL]     if (bg == null) { [EOL]         throw new NullArgumentException(LocalizedFormats.FRACTION); [EOL]     } [EOL]     if (BigInteger.ZERO.equals(bg)) { [EOL]         throw new MathArithmeticException(LocalizedFormats.ZERO_DENOMINATOR); [EOL]     } [EOL]     return new BigFraction(numerator, denominator.multiply(bg)); [EOL] } <line_num>: 616,624
public BigFraction divide(final int i) { [EOL]     return divide(BigInteger.valueOf(i)); [EOL] } <line_num>: 636,638
public BigFraction divide(final long l) { [EOL]     return divide(BigInteger.valueOf(l)); [EOL] } <line_num>: 650,652
public BigFraction divide(final BigFraction fraction) { [EOL]     if (fraction == null) { [EOL]         throw new NullArgumentException(LocalizedFormats.FRACTION); [EOL]     } [EOL]     if (BigInteger.ZERO.equals(fraction.numerator)) { [EOL]         throw new MathArithmeticException(LocalizedFormats.ZERO_DENOMINATOR); [EOL]     } [EOL]     return multiply(fraction.reciprocal()); [EOL] } <line_num>: 665,674
@Override [EOL] public double doubleValue() { [EOL]     double result = numerator.doubleValue() / denominator.doubleValue(); [EOL]     if (Double.isNaN(result)) { [EOL]         int shift = Math.max(numerator.bitLength(), denominator.bitLength()) - FastMath.getExponent(Double.MAX_VALUE); [EOL]         result = numerator.shiftRight(shift).doubleValue() / denominator.shiftRight(shift).doubleValue(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 685,697
@Override [EOL] public boolean equals(final Object other) { [EOL]     boolean ret = false; [EOL]     if (this == other) { [EOL]         ret = true; [EOL]     } else if (other instanceof BigFraction) { [EOL]         BigFraction rhs = ((BigFraction) other).reduce(); [EOL]         BigFraction thisOne = this.reduce(); [EOL]         ret = thisOne.numerator.equals(rhs.numerator) && thisOne.denominator.equals(rhs.denominator); [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 714,727
@Override [EOL] public float floatValue() { [EOL]     float result = numerator.floatValue() / denominator.floatValue(); [EOL]     if (Double.isNaN(result)) { [EOL]         int shift = Math.max(numerator.bitLength(), denominator.bitLength()) - FastMath.getExponent(Float.MAX_VALUE); [EOL]         result = numerator.shiftRight(shift).floatValue() / denominator.shiftRight(shift).floatValue(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 738,750
public BigInteger getDenominator() { [EOL]     return denominator; [EOL] } <line_num>: 759,761
public int getDenominatorAsInt() { [EOL]     return denominator.intValue(); [EOL] } <line_num>: 770,772
public long getDenominatorAsLong() { [EOL]     return denominator.longValue(); [EOL] } <line_num>: 781,783
public BigInteger getNumerator() { [EOL]     return numerator; [EOL] } <line_num>: 792,794
public int getNumeratorAsInt() { [EOL]     return numerator.intValue(); [EOL] } <line_num>: 803,805
public long getNumeratorAsLong() { [EOL]     return numerator.longValue(); [EOL] } <line_num>: 814,816
@Override [EOL] public int hashCode() { [EOL]     return 37 * (37 * 17 + numerator.hashCode()) + denominator.hashCode(); [EOL] } <line_num>: 826,829
@Override [EOL] public int intValue() { [EOL]     return numerator.divide(denominator).intValue(); [EOL] } <line_num>: 840,843
@Override [EOL] public long longValue() { [EOL]     return numerator.divide(denominator).longValue(); [EOL] } <line_num>: 854,857
public BigFraction multiply(final BigInteger bg) { [EOL]     if (bg == null) { [EOL]         throw new NullArgumentException(); [EOL]     } [EOL]     return new BigFraction(bg.multiply(numerator), denominator); [EOL] } <line_num>: 869,874
public BigFraction multiply(final int i) { [EOL]     return multiply(BigInteger.valueOf(i)); [EOL] } <line_num>: 886,888
public BigFraction multiply(final long l) { [EOL]     return multiply(BigInteger.valueOf(l)); [EOL] } <line_num>: 900,902
public BigFraction multiply(final BigFraction fraction) { [EOL]     if (fraction == null) { [EOL]         throw new NullArgumentException(LocalizedFormats.FRACTION); [EOL]     } [EOL]     if (numerator.equals(BigInteger.ZERO) || fraction.numerator.equals(BigInteger.ZERO)) { [EOL]         return ZERO; [EOL]     } [EOL]     return new BigFraction(numerator.multiply(fraction.numerator), denominator.multiply(fraction.denominator)); [EOL] } <line_num>: 914,924
public BigFraction negate() { [EOL]     return new BigFraction(numerator.negate(), denominator); [EOL] } <line_num>: 934,936
public double percentageValue() { [EOL]     return multiply(ONE_HUNDRED).doubleValue(); [EOL] } <line_num>: 946,948
public BigFraction pow(final int exponent) { [EOL]     if (exponent < 0) { [EOL]         return new BigFraction(denominator.pow(-exponent), numerator.pow(-exponent)); [EOL]     } [EOL]     return new BigFraction(numerator.pow(exponent), denominator.pow(exponent)); [EOL] } <line_num>: 961,966
public BigFraction pow(final long exponent) { [EOL]     if (exponent < 0) { [EOL]         return new BigFraction(ArithmeticUtils.pow(denominator, -exponent), ArithmeticUtils.pow(numerator, -exponent)); [EOL]     } [EOL]     return new BigFraction(ArithmeticUtils.pow(numerator, exponent), ArithmeticUtils.pow(denominator, exponent)); [EOL] } <line_num>: 978,985
public BigFraction pow(final BigInteger exponent) { [EOL]     if (exponent.compareTo(BigInteger.ZERO) < 0) { [EOL]         final BigInteger eNeg = exponent.negate(); [EOL]         return new BigFraction(ArithmeticUtils.pow(denominator, eNeg), ArithmeticUtils.pow(numerator, eNeg)); [EOL]     } [EOL]     return new BigFraction(ArithmeticUtils.pow(numerator, exponent), ArithmeticUtils.pow(denominator, exponent)); [EOL] } <line_num>: 997,1005
public double pow(final double exponent) { [EOL]     return FastMath.pow(numerator.doubleValue(), exponent) / FastMath.pow(denominator.doubleValue(), exponent); [EOL] } <line_num>: 1017,1020
public BigFraction reciprocal() { [EOL]     return new BigFraction(denominator, numerator); [EOL] } <line_num>: 1029,1031
public BigFraction reduce() { [EOL]     final BigInteger gcd = numerator.gcd(denominator); [EOL]     return new BigFraction(numerator.divide(gcd), denominator.divide(gcd)); [EOL] } <line_num>: 1041,1044
public BigFraction subtract(final BigInteger bg) { [EOL]     if (bg == null) { [EOL]         throw new NullArgumentException(); [EOL]     } [EOL]     return new BigFraction(numerator.subtract(denominator.multiply(bg)), denominator); [EOL] } <line_num>: 1056,1061
public BigFraction subtract(final int i) { [EOL]     return subtract(BigInteger.valueOf(i)); [EOL] } <line_num>: 1072,1074
public BigFraction subtract(final long l) { [EOL]     return subtract(BigInteger.valueOf(l)); [EOL] } <line_num>: 1085,1087
public BigFraction subtract(final BigFraction fraction) { [EOL]     if (fraction == null) { [EOL]         throw new NullArgumentException(LocalizedFormats.FRACTION); [EOL]     } [EOL]     if (ZERO.equals(fraction)) { [EOL]         return this; [EOL]     } [EOL]     BigInteger num = null; [EOL]     BigInteger den = null; [EOL]     if (denominator.equals(fraction.denominator)) { [EOL]         num = numerator.subtract(fraction.numerator); [EOL]         den = denominator; [EOL]     } else { [EOL]         num = (numerator.multiply(fraction.denominator)).subtract((fraction.numerator).multiply(denominator)); [EOL]         den = denominator.multiply(fraction.denominator); [EOL]     } [EOL]     return new BigFraction(num, den); [EOL] } <line_num>: 1099,1118
@Override [EOL] public String toString() { [EOL]     String str = null; [EOL]     if (BigInteger.ONE.equals(denominator)) { [EOL]         str = numerator.toString(); [EOL]     } else if (BigInteger.ZERO.equals(numerator)) { [EOL]         str = "0"; [EOL]     } else { [EOL]         str = numerator + " / " + denominator; [EOL]     } [EOL]     return str; [EOL] } <line_num>: 1129,1140
public BigFractionField getField() { [EOL]     return BigFractionField.getInstance(); [EOL] } <line_num>: 1143,1145
