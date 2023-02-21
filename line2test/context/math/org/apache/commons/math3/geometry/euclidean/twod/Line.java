public Line(final Vector2D p1, final Vector2D p2)
public Line(final Vector2D p, final double angle)
private Line(final double angle, final double cos, final double sin, final double originOffset)
public Line(final Line line)
public LineTransform(final AffineTransform transform) throws MathIllegalArgumentException
public Line copySelf()
public void reset(final Vector2D p1, final Vector2D p2)
public void reset(final Vector2D p, final double alpha)
public void revertSelf()
public Line getReverse()
public Vector1D toSubSpace(final Vector<Euclidean2D> point)
public Vector2D toSpace(final Vector<Euclidean1D> point)
public Vector2D intersection(final Line other)
public SubLine wholeHyperplane()
public PolygonsSet wholeSpace()
public double getOffset(final Line line)
public double getOffset(final Vector<Euclidean2D> point)
public boolean sameOrientationAs(final Hyperplane<Euclidean2D> other)
public Vector2D getPointAt(final Vector1D abscissa, final double offset)
public boolean contains(final Vector2D p)
public double distance(final Vector2D p)
public boolean isParallelTo(final Line line)
public void translateToPoint(final Vector2D p)
public double getAngle()
public void setAngle(final double angle)
public double getOriginOffset()
public void setOriginOffset(final double offset)
public static Transform<Euclidean2D, Euclidean1D> getTransform(final AffineTransform transform) throws MathIllegalArgumentException
public Vector2D apply(final Vector<Euclidean2D> point)
public Line apply(final Hyperplane<Euclidean2D> hyperplane)
public SubHyperplane<Euclidean1D> apply(final SubHyperplane<Euclidean1D> sub, final Hyperplane<Euclidean2D> original, final Hyperplane<Euclidean2D> transformed)
double angle
double cos
double sin
double originOffset
