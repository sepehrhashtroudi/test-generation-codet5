public BigFraction(final BigInteger num)
public BigFraction(BigInteger num, BigInteger den)
public BigFraction(final double value) throws MathIllegalArgumentException
public BigFraction(final double value, final double epsilon, final int maxIterations) throws FractionConversionException
private BigFraction(final double value, final double epsilon, final int maxDenominator, int maxIterations) throws FractionConversionException
public BigFraction(final double value, final int maxDenominator) throws FractionConversionException
public BigFraction(final int num)
public BigFraction(final int num, final int den)
public BigFraction(final long num)
public BigFraction(final long num, final long den)
public static BigFraction getReducedFraction(final int numerator, final int denominator)
public BigFraction abs()
public BigFraction add(final BigInteger bg) throws NullArgumentException
public BigFraction add(final int i)
public BigFraction add(final long l)
public BigFraction add(final BigFraction fraction)
public BigDecimal bigDecimalValue()
public BigDecimal bigDecimalValue(final int roundingMode)
public BigDecimal bigDecimalValue(final int scale, final int roundingMode)
public int compareTo(final BigFraction object)
public BigFraction divide(final BigInteger bg)
public BigFraction divide(final int i)
public BigFraction divide(final long l)
public BigFraction divide(final BigFraction fraction)
public double doubleValue()
public boolean equals(final Object other)
public float floatValue()
public BigInteger getDenominator()
public int getDenominatorAsInt()
public long getDenominatorAsLong()
public BigInteger getNumerator()
public int getNumeratorAsInt()
public long getNumeratorAsLong()
public int hashCode()
public int intValue()
public long longValue()
public BigFraction multiply(final BigInteger bg)
public BigFraction multiply(final int i)
public BigFraction multiply(final long l)
public BigFraction multiply(final BigFraction fraction)
public BigFraction negate()
public double percentageValue()
public BigFraction pow(final int exponent)
public BigFraction pow(final long exponent)
public BigFraction pow(final BigInteger exponent)
public double pow(final double exponent)
public BigFraction reciprocal()
public BigFraction reduce()
public BigFraction subtract(final BigInteger bg)
public BigFraction subtract(final int i)
public BigFraction subtract(final long l)
public BigFraction subtract(final BigFraction fraction)
public String toString()
public BigFractionField getField()
