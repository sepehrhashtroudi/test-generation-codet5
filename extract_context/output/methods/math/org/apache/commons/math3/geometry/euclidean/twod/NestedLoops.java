public NestedLoops() { [EOL]     surrounded = new ArrayList<NestedLoops>(); [EOL] } <line_num>: 67,69
private NestedLoops(final Vector2D[] loop) throws MathIllegalArgumentException { [EOL]     if (loop[0] == null) { [EOL]         throw new MathIllegalArgumentException(LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN); [EOL]     } [EOL]     this.loop = loop; [EOL]     surrounded = new ArrayList<NestedLoops>(); [EOL]     final ArrayList<SubHyperplane<Euclidean2D>> edges = new ArrayList<SubHyperplane<Euclidean2D>>(); [EOL]     Vector2D current = loop[loop.length - 1]; [EOL]     for (int i = 0; i < loop.length; ++i) { [EOL]         final Vector2D previous = current; [EOL]         current = loop[i]; [EOL]         final Line line = new Line(previous, current); [EOL]         final IntervalsSet region = new IntervalsSet(line.toSubSpace(previous).getX(), line.toSubSpace(current).getX()); [EOL]         edges.add(new SubLine(line, region)); [EOL]     } [EOL]     polygon = new PolygonsSet(edges); [EOL]     if (Double.isInfinite(polygon.getSize())) { [EOL]         polygon = new RegionFactory<Euclidean2D>().getComplement(polygon); [EOL]         originalIsClockwise = false; [EOL]     } else { [EOL]         originalIsClockwise = true; [EOL]     } [EOL] } <line_num>: 76,106
public void add(final Vector2D[] bLoop) throws MathIllegalArgumentException { [EOL]     add(new NestedLoops(bLoop)); [EOL] } <line_num>: 113,115
private void add(final NestedLoops node) throws MathIllegalArgumentException { [EOL]     for (final NestedLoops child : surrounded) { [EOL]         if (child.polygon.contains(node.polygon)) { [EOL]             child.add(node); [EOL]             return; [EOL]         } [EOL]     } [EOL]     for (final Iterator<NestedLoops> iterator = surrounded.iterator(); iterator.hasNext(); ) { [EOL]         final NestedLoops child = iterator.next(); [EOL]         if (node.polygon.contains(child.polygon)) { [EOL]             node.surrounded.add(child); [EOL]             iterator.remove(); [EOL]         } [EOL]     } [EOL]     RegionFactory<Euclidean2D> factory = new RegionFactory<Euclidean2D>(); [EOL]     for (final NestedLoops child : surrounded) { [EOL]         if (!factory.intersection(node.polygon, child.polygon).isEmpty()) { [EOL]             throw new MathIllegalArgumentException(LocalizedFormats.CROSSING_BOUNDARY_LOOPS); [EOL]         } [EOL]     } [EOL]     surrounded.add(node); [EOL] } <line_num>: 122,151
public void correctOrientation() { [EOL]     for (NestedLoops child : surrounded) { [EOL]         child.setClockWise(true); [EOL]     } [EOL] } <line_num>: 158,162
private void setClockWise(final boolean clockwise) { [EOL]     if (originalIsClockwise ^ clockwise) { [EOL]         int min = -1; [EOL]         int max = loop.length; [EOL]         while (++min < --max) { [EOL]             final Vector2D tmp = loop[min]; [EOL]             loop[min] = loop[max]; [EOL]             loop[max] = tmp; [EOL]         } [EOL]     } [EOL]     for (final NestedLoops child : surrounded) { [EOL]         child.setClockWise(!clockwise); [EOL]     } [EOL] } <line_num>: 168,186
