@Test [EOL] public void testAdd1() { [EOL]     final WeightedObservedPoints store = new WeightedObservedPoints(); [EOL]     final double x = 1.2; [EOL]     final double y = 34.56; [EOL]     final double w = 0.789; [EOL]     store.add(w, x, y); [EOL]     Assert.assertTrue(lastElementIsSame(store, new WeightedObservedPoint(w, x, y))); [EOL] } <line_num>: 30,41
@Test [EOL] public void testAdd2() { [EOL]     final WeightedObservedPoints store = new WeightedObservedPoints(); [EOL]     final double x = 1.2; [EOL]     final double y = 34.56; [EOL]     final double w = 0.789; [EOL]     store.add(new WeightedObservedPoint(w, x, y)); [EOL]     Assert.assertTrue(lastElementIsSame(store, new WeightedObservedPoint(w, x, y))); [EOL] } <line_num>: 43,54
@Test [EOL] public void testAdd3() { [EOL]     final WeightedObservedPoints store = new WeightedObservedPoints(); [EOL]     final double x = 1.2; [EOL]     final double y = 34.56; [EOL]     store.add(x, y); [EOL]     Assert.assertTrue(lastElementIsSame(store, new WeightedObservedPoint(1, x, y))); [EOL] } <line_num>: 56,66
@Test [EOL] public void testClear() { [EOL]     final WeightedObservedPoints store = new WeightedObservedPoints(); [EOL]     store.add(new WeightedObservedPoint(1, 2, 3)); [EOL]     store.add(new WeightedObservedPoint(2, -1, -2)); [EOL]     Assert.assertTrue(store.toList().size() == 2); [EOL]     store.clear(); [EOL]     Assert.assertTrue(store.toList().size() == 0); [EOL] } <line_num>: 68,78
@Test [EOL] public void testToListCopy() { [EOL]     final WeightedObservedPoints store = new WeightedObservedPoints(); [EOL]     store.add(new WeightedObservedPoint(1, 2, 3)); [EOL]     store.add(new WeightedObservedPoint(2, -3, -4)); [EOL]     final List<WeightedObservedPoint> list = store.toList(); [EOL]     Assert.assertTrue(list.size() == 2); [EOL]     list.add(new WeightedObservedPoint(1.2, 3.4, 5.6)); [EOL]     Assert.assertFalse(list.size() == store.toList().size()); [EOL]     store.clear(); [EOL]     Assert.assertFalse(list.size() == 0); [EOL] } <line_num>: 82,99
private boolean lastElementIsSame(WeightedObservedPoints store, WeightedObservedPoint point) { [EOL]     final List<WeightedObservedPoint> list = store.toList(); [EOL]     final WeightedObservedPoint lastPoint = list.get(list.size() - 1); [EOL]     if (!Precision.equals(lastPoint.getX(), point.getX())) { [EOL]         return false; [EOL]     } [EOL]     if (!Precision.equals(lastPoint.getY(), point.getY())) { [EOL]         return false; [EOL]     } [EOL]     if (!Precision.equals(lastPoint.getWeight(), point.getWeight())) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 109,125
