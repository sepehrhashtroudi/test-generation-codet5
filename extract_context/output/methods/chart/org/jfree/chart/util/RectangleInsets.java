public RectangleInsets() { [EOL]     this(1.0, 1.0, 1.0, 1.0); [EOL] } <line_num>: 88,90
public RectangleInsets(double top, double left, double bottom, double right) { [EOL]     this(UnitType.ABSOLUTE, top, left, bottom, right); [EOL] } <line_num>: 100,103
public RectangleInsets(UnitType unitType, double top, double left, double bottom, double right) { [EOL]     if (unitType == null) { [EOL]         throw new IllegalArgumentException("Null 'unitType' argument."); [EOL]     } [EOL]     this.unitType = unitType; [EOL]     this.top = top; [EOL]     this.bottom = bottom; [EOL]     this.left = left; [EOL]     this.right = right; [EOL] } <line_num>: 115,125
public UnitType getUnitType() { [EOL]     return this.unitType; [EOL] } <line_num>: 133,135
public double getTop() { [EOL]     return this.top; [EOL] } <line_num>: 142,144
public double getBottom() { [EOL]     return this.bottom; [EOL] } <line_num>: 151,153
public double getLeft() { [EOL]     return this.left; [EOL] } <line_num>: 160,162
public double getRight() { [EOL]     return this.right; [EOL] } <line_num>: 169,171
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof RectangleInsets)) { [EOL]         return false; [EOL]     } [EOL]     final RectangleInsets that = (RectangleInsets) obj; [EOL]     if (that.unitType != this.unitType) { [EOL]         return false; [EOL]     } [EOL]     if (this.left != that.left) { [EOL]         return false; [EOL]     } [EOL]     if (this.right != that.right) { [EOL]         return false; [EOL]     } [EOL]     if (this.top != that.top) { [EOL]         return false; [EOL]     } [EOL]     if (this.bottom != that.bottom) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 180,204
public int hashCode() { [EOL]     int result; [EOL]     long temp; [EOL]     result = (this.unitType != null ? this.unitType.hashCode() : 0); [EOL]     temp = this.top != +0.0d ? Double.doubleToLongBits(this.top) : 0L; [EOL]     result = 29 * result + (int) (temp ^ (temp >>> 32)); [EOL]     temp = this.bottom != +0.0d ? Double.doubleToLongBits(this.bottom) : 0L; [EOL]     result = 29 * result + (int) (temp ^ (temp >>> 32)); [EOL]     temp = this.left != +0.0d ? Double.doubleToLongBits(this.left) : 0L; [EOL]     result = 29 * result + (int) (temp ^ (temp >>> 32)); [EOL]     temp = this.right != +0.0d ? Double.doubleToLongBits(this.right) : 0L; [EOL]     result = 29 * result + (int) (temp ^ (temp >>> 32)); [EOL]     return result; [EOL] } <line_num>: 211,224
public String toString() { [EOL]     return "RectangleInsets[t=" + this.top + ",l=" + this.left + ",b=" + this.bottom + ",r=" + this.right + "]"; [EOL] } <line_num>: 232,235
public Rectangle2D createAdjustedRectangle(Rectangle2D base, LengthAdjustmentType horizontal, LengthAdjustmentType vertical) { [EOL]     if (base == null) { [EOL]         throw new IllegalArgumentException("Null 'base' argument."); [EOL]     } [EOL]     double x = base.getX(); [EOL]     double y = base.getY(); [EOL]     double w = base.getWidth(); [EOL]     double h = base.getHeight(); [EOL]     if (horizontal == LengthAdjustmentType.EXPAND) { [EOL]         double leftOutset = calculateLeftOutset(w); [EOL]         x = x - leftOutset; [EOL]         w = w + leftOutset + calculateRightOutset(w); [EOL]     } else if (horizontal == LengthAdjustmentType.CONTRACT) { [EOL]         double leftMargin = calculateLeftInset(w); [EOL]         x = x + leftMargin; [EOL]         w = w - leftMargin - calculateRightInset(w); [EOL]     } [EOL]     if (vertical == LengthAdjustmentType.EXPAND) { [EOL]         double topMargin = calculateTopOutset(h); [EOL]         y = y - topMargin; [EOL]         h = h + topMargin + calculateBottomOutset(h); [EOL]     } else if (vertical == LengthAdjustmentType.CONTRACT) { [EOL]         double topMargin = calculateTopInset(h); [EOL]         y = y + topMargin; [EOL]         h = h - topMargin - calculateBottomInset(h); [EOL]     } [EOL]     return new Rectangle2D.Double(x, y, w, h); [EOL] } <line_num>: 250,280
public Rectangle2D createInsetRectangle(Rectangle2D base) { [EOL]     return createInsetRectangle(base, true, true); [EOL] } <line_num>: 289,291
public Rectangle2D createInsetRectangle(Rectangle2D base, boolean horizontal, boolean vertical) { [EOL]     if (base == null) { [EOL]         throw new IllegalArgumentException("Null 'base' argument."); [EOL]     } [EOL]     double topMargin = 0.0; [EOL]     double bottomMargin = 0.0; [EOL]     if (vertical) { [EOL]         topMargin = calculateTopInset(base.getHeight()); [EOL]         bottomMargin = calculateBottomInset(base.getHeight()); [EOL]     } [EOL]     double leftMargin = 0.0; [EOL]     double rightMargin = 0.0; [EOL]     if (horizontal) { [EOL]         leftMargin = calculateLeftInset(base.getWidth()); [EOL]         rightMargin = calculateRightInset(base.getWidth()); [EOL]     } [EOL]     return new Rectangle2D.Double(base.getX() + leftMargin, base.getY() + topMargin, base.getWidth() - leftMargin - rightMargin, base.getHeight() - topMargin - bottomMargin); [EOL] } <line_num>: 302,325
public Rectangle2D createOutsetRectangle(Rectangle2D base) { [EOL]     return createOutsetRectangle(base, true, true); [EOL] } <line_num>: 334,336
public Rectangle2D createOutsetRectangle(Rectangle2D base, boolean horizontal, boolean vertical) { [EOL]     if (base == null) { [EOL]         throw new IllegalArgumentException("Null 'base' argument."); [EOL]     } [EOL]     double topMargin = 0.0; [EOL]     double bottomMargin = 0.0; [EOL]     if (vertical) { [EOL]         topMargin = calculateTopOutset(base.getHeight()); [EOL]         bottomMargin = calculateBottomOutset(base.getHeight()); [EOL]     } [EOL]     double leftMargin = 0.0; [EOL]     double rightMargin = 0.0; [EOL]     if (horizontal) { [EOL]         leftMargin = calculateLeftOutset(base.getWidth()); [EOL]         rightMargin = calculateRightOutset(base.getWidth()); [EOL]     } [EOL]     return new Rectangle2D.Double(base.getX() - leftMargin, base.getY() - topMargin, base.getWidth() + leftMargin + rightMargin, base.getHeight() + topMargin + bottomMargin); [EOL] } <line_num>: 347,371
public double calculateTopInset(double height) { [EOL]     double result = this.top; [EOL]     if (this.unitType == UnitType.RELATIVE) { [EOL]         result = (this.top * height); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 380,386
public double calculateTopOutset(double height) { [EOL]     double result = this.top; [EOL]     if (this.unitType == UnitType.RELATIVE) { [EOL]         result = (height / (1 - this.top - this.bottom)) * this.top; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 395,401
public double calculateBottomInset(double height) { [EOL]     double result = this.bottom; [EOL]     if (this.unitType == UnitType.RELATIVE) { [EOL]         result = (this.bottom * height); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 410,416
public double calculateBottomOutset(double height) { [EOL]     double result = this.bottom; [EOL]     if (this.unitType == UnitType.RELATIVE) { [EOL]         result = (height / (1 - this.top - this.bottom)) * this.bottom; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 425,431
public double calculateLeftInset(double width) { [EOL]     double result = this.left; [EOL]     if (this.unitType == UnitType.RELATIVE) { [EOL]         result = (this.left * width); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 440,446
public double calculateLeftOutset(double width) { [EOL]     double result = this.left; [EOL]     if (this.unitType == UnitType.RELATIVE) { [EOL]         result = (width / (1 - this.left - this.right)) * this.left; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 455,461
public double calculateRightInset(double width) { [EOL]     double result = this.right; [EOL]     if (this.unitType == UnitType.RELATIVE) { [EOL]         result = (this.right * width); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 470,476
public double calculateRightOutset(double width) { [EOL]     double result = this.right; [EOL]     if (this.unitType == UnitType.RELATIVE) { [EOL]         result = (width / (1 - this.left - this.right)) * this.right; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 485,491
public double trimWidth(double width) { [EOL]     return width - calculateLeftInset(width) - calculateRightInset(width); [EOL] } <line_num>: 500,502
public double extendWidth(double width) { [EOL]     return width + calculateLeftOutset(width) + calculateRightOutset(width); [EOL] } <line_num>: 511,513
public double trimHeight(double height) { [EOL]     return height - calculateTopInset(height) - calculateBottomInset(height); [EOL] } <line_num>: 522,525
public double extendHeight(double height) { [EOL]     return height + calculateTopOutset(height) + calculateBottomOutset(height); [EOL] } <line_num>: 534,537
public void trim(Rectangle2D area) { [EOL]     double w = area.getWidth(); [EOL]     double h = area.getHeight(); [EOL]     double l = calculateLeftInset(w); [EOL]     double r = calculateRightInset(w); [EOL]     double t = calculateTopInset(h); [EOL]     double b = calculateBottomInset(h); [EOL]     area.setRect(area.getX() + l, area.getY() + t, w - l - r, h - t - b); [EOL] } <line_num>: 544,552