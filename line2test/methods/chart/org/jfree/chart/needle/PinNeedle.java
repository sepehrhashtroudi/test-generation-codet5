protected void drawNeedle(Graphics2D g2, Rectangle2D plotArea, Point2D rotate, double angle) { [EOL]     Area shape; [EOL]     GeneralPath pointer = new GeneralPath(); [EOL]     int minY = (int) (plotArea.getMinY()); [EOL]     int maxY = (int) (plotArea.getMaxY()); [EOL]     int midX = (int) (plotArea.getMinX() + (plotArea.getWidth() / 2)); [EOL]     int lenX = (int) (plotArea.getWidth() / 10); [EOL]     if (lenX < 2) { [EOL]         lenX = 2; [EOL]     } [EOL]     pointer.moveTo(midX - lenX, maxY - lenX); [EOL]     pointer.lineTo(midX + lenX, maxY - lenX); [EOL]     pointer.lineTo(midX, minY + lenX); [EOL]     pointer.closePath(); [EOL]     lenX = 4 * lenX; [EOL]     Ellipse2D circle = new Ellipse2D.Double(midX - lenX / 2, plotArea.getMaxY() - lenX, lenX, lenX); [EOL]     shape = new Area(circle); [EOL]     shape.add(new Area(pointer)); [EOL]     if ((rotate != null) && (angle != 0)) { [EOL]         getTransform().setToRotation(angle, rotate.getX(), rotate.getY()); [EOL]         shape.transform(getTransform()); [EOL]     } [EOL]     defaultDisplay(g2, shape); [EOL] } <line_num>: 73,108
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof PinNeedle)) { [EOL]         return false; [EOL]     } [EOL]     if (!super.equals(obj)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 117,128
public int hashCode() { [EOL]     return super.hashCode(); [EOL] } <line_num>: 135,137
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 147,149