private FastMathCalc()
private static void buildSinCosTables(double[] SINE_TABLE_A, double[] SINE_TABLE_B, double[] COSINE_TABLE_A, double[] COSINE_TABLE_B, int SINE_TABLE_LEN, double[] TANGENT_TABLE_A, double[] TANGENT_TABLE_B)
 static double slowCos(final double x, final double[] result)
 static double slowSin(final double x, final double[] result)
 static double slowexp(final double x, final double[] result)
private static void split(final double d, final double[] split)
private static void resplit(final double[] a)
private static void splitMult(double[] a, double[] b, double[] ans)
private static void splitAdd(final double[] a, final double[] b, final double[] ans)
 static void splitReciprocal(final double[] in, final double[] result)
private static void quadMult(final double[] a, final double[] b, final double[] result)
 static double expint(int p, final double[] result)
 static double[] slowLog(double xi)
 static void printarray(PrintStream out, String name, int expectedLen, double[][] array2d)
 static void printarray(PrintStream out, String name, int expectedLen, double[] array)
 static String format(double d)
private static void checkLen(int expectedLen, int actual) throws DimensionMismatchException