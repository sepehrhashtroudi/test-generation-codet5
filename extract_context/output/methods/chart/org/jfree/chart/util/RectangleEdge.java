private RectangleEdge(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 80,82
public String toString() { [EOL]     return this.name; [EOL] } <line_num>: 89,91
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof RectangleEdge)) { [EOL]         return false; [EOL]     } [EOL]     RectangleEdge order = (RectangleEdge) obj; [EOL]     if (!this.name.equals(order.name)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 101,117
public int hashCode() { [EOL]     return this.name.hashCode(); [EOL] } <line_num>: 124,126
public static boolean isTopOrBottom(RectangleEdge edge) { [EOL]     return (edge == RectangleEdge.TOP || edge == RectangleEdge.BOTTOM); [EOL] } <line_num>: 136,138
public static boolean isLeftOrRight(RectangleEdge edge) { [EOL]     return (edge == RectangleEdge.LEFT || edge == RectangleEdge.RIGHT); [EOL] } <line_num>: 148,150
public static RectangleEdge opposite(RectangleEdge edge) { [EOL]     RectangleEdge result = null; [EOL]     if (edge == RectangleEdge.TOP) { [EOL]         result = RectangleEdge.BOTTOM; [EOL]     } else if (edge == RectangleEdge.BOTTOM) { [EOL]         result = RectangleEdge.TOP; [EOL]     } else if (edge == RectangleEdge.LEFT) { [EOL]         result = RectangleEdge.RIGHT; [EOL]     } else if (edge == RectangleEdge.RIGHT) { [EOL]         result = RectangleEdge.LEFT; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 159,174
public static double coordinate(Rectangle2D rectangle, RectangleEdge edge) { [EOL]     double result = 0.0; [EOL]     if (edge == RectangleEdge.TOP) { [EOL]         result = rectangle.getMinY(); [EOL]     } else if (edge == RectangleEdge.BOTTOM) { [EOL]         result = rectangle.getMaxY(); [EOL]     } else if (edge == RectangleEdge.LEFT) { [EOL]         result = rectangle.getMinX(); [EOL]     } else if (edge == RectangleEdge.RIGHT) { [EOL]         result = rectangle.getMaxX(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 184,200
private Object readResolve() throws ObjectStreamException { [EOL]     RectangleEdge result = null; [EOL]     if (this.equals(RectangleEdge.TOP)) { [EOL]         result = RectangleEdge.TOP; [EOL]     } else if (this.equals(RectangleEdge.BOTTOM)) { [EOL]         result = RectangleEdge.BOTTOM; [EOL]     } else if (this.equals(RectangleEdge.LEFT)) { [EOL]         result = RectangleEdge.LEFT; [EOL]     } else if (this.equals(RectangleEdge.RIGHT)) { [EOL]         result = RectangleEdge.RIGHT; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 209,224