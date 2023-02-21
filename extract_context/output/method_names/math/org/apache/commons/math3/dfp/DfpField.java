public DfpField(final int decimalDigits)
private DfpField(final int decimalDigits, final boolean computeConstants)
public int getRadixDigits()
public void setRoundingMode(final RoundingMode mode)
public RoundingMode getRoundingMode()
public int getIEEEFlags()
public void clearIEEEFlags()
public void setIEEEFlags(final int flags)
public void setIEEEFlagsBits(final int bits)
public Dfp newDfp()
public Dfp newDfp(final byte x)
public Dfp newDfp(final int x)
public Dfp newDfp(final long x)
public Dfp newDfp(final double x)
public Dfp newDfp(Dfp d)
public Dfp newDfp(final String s)
public Dfp newDfp(final byte sign, final byte nans)
public Dfp getZero()
public Dfp getOne()
public Class<? extends FieldElement<Dfp>> getRuntimeClass()
public Dfp getTwo()
public Dfp getSqr2()
public Dfp[] getSqr2Split()
public Dfp getSqr2Reciprocal()
public Dfp getSqr3()
public Dfp getSqr3Reciprocal()
public Dfp getPi()
public Dfp[] getPiSplit()
public Dfp getE()
public Dfp[] getESplit()
public Dfp getLn2()
public Dfp[] getLn2Split()
public Dfp getLn5()
public Dfp[] getLn5Split()
public Dfp getLn10()
private Dfp[] split(final String a)
private static void computeStringConstants(final int highPrecisionDecimalDigits)
private static Dfp computePi(final Dfp one, final Dfp two, final Dfp three)
public static Dfp computeExp(final Dfp a, final Dfp one)
public static Dfp computeLn(final Dfp a, final Dfp one, final Dfp two)
