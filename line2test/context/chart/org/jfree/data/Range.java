public Range(double lower, double upper)
public double getLowerBound()
public double getUpperBound()
public double getLength()
public double getCentralValue()
public boolean contains(double value)
public boolean intersects(double b0, double b1)
public boolean intersects(Range range)
public double constrain(double value)
public static Range combine(Range range1, Range range2)
public static Range expandToInclude(Range range, double value)
public static Range expand(Range range, double lowerMargin, double upperMargin)
public static Range shift(Range base, double delta)
public static Range shift(Range base, double delta, boolean allowZeroCrossing)
private static double shiftWithNoZeroCrossing(double value, double delta)
public static Range scale(Range base, double factor)
public boolean equals(Object obj)
public int hashCode()
public String toString()
long serialVersionUID=Optional[-906333695431863380L]
double lower
double upper