@Override [EOL] public final L apply(List<L> values) { [EOL]     Preconditions.checkArgument(!values.isEmpty()); [EOL]     int size = values.size(); [EOL]     if (size == 1) { [EOL]         return values.get(0); [EOL]     } else if (size == 2) { [EOL]         return apply(values.get(0), values.get(1)); [EOL]     } else { [EOL]         int mid = computeMidPoint(size); [EOL]         return apply(apply(values.subList(0, mid)), apply(values.subList(mid, size))); [EOL]     } [EOL] } <line_num>: 36,50
abstract L apply(L latticeA, L latticeB); <line_num>: 57,57
static int computeMidPoint(int size) { [EOL]     int midpoint = size >>> 1; [EOL]     if (size > 4) { [EOL]         midpoint &= -2; [EOL]     } [EOL]     return midpoint; [EOL] } <line_num>: 66,74