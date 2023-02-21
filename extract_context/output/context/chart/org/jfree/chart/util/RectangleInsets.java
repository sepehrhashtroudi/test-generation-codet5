public RectangleInsets()
public RectangleInsets(double top, double left, double bottom, double right)
public RectangleInsets(UnitType unitType, double top, double left, double bottom, double right)
public UnitType getUnitType()
public double getTop()
public double getBottom()
public double getLeft()
public double getRight()
public boolean equals(Object obj)
public int hashCode()
public String toString()
public Rectangle2D createAdjustedRectangle(Rectangle2D base, LengthAdjustmentType horizontal, LengthAdjustmentType vertical)
public Rectangle2D createInsetRectangle(Rectangle2D base)
public Rectangle2D createInsetRectangle(Rectangle2D base, boolean horizontal, boolean vertical)
public Rectangle2D createOutsetRectangle(Rectangle2D base)
public Rectangle2D createOutsetRectangle(Rectangle2D base, boolean horizontal, boolean vertical)
public double calculateTopInset(double height)
public double calculateTopOutset(double height)
public double calculateBottomInset(double height)
public double calculateBottomOutset(double height)
public double calculateLeftInset(double width)
public double calculateLeftOutset(double width)
public double calculateRightInset(double width)
public double calculateRightOutset(double width)
public double trimWidth(double width)
public double extendWidth(double width)
public double trimHeight(double height)
public double extendHeight(double height)
public void trim(Rectangle2D area)
long serialVersionUID=Optional[1902273207559319996L]
RectangleInsets ZERO_INSETS=Optional[new RectangleInsets(UnitType.ABSOLUTE, 0.0, 0.0, 0.0, 0.0)]
UnitType unitType
double top
double left
double bottom
double right
