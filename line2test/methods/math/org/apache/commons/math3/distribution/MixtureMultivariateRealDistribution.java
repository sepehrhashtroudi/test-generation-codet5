public MixtureMultivariateRealDistribution(List<Pair<Double, T>> components) { [EOL]     this(new Well19937c(), components); [EOL] } <line_num>: 51,53
public MixtureMultivariateRealDistribution(RandomGenerator rng, List<Pair<Double, T>> components) { [EOL]     super(rng, components.get(0).getSecond().getDimension()); [EOL]     final int numComp = components.size(); [EOL]     final int dim = getDimension(); [EOL]     double weightSum = 0; [EOL]     for (int i = 0; i < numComp; i++) { [EOL]         final Pair<Double, T> comp = components.get(i); [EOL]         if (comp.getSecond().getDimension() != dim) { [EOL]             throw new DimensionMismatchException(comp.getSecond().getDimension(), dim); [EOL]         } [EOL]         if (comp.getFirst() < 0) { [EOL]             throw new NotPositiveException(comp.getFirst()); [EOL]         } [EOL]         weightSum += comp.getFirst(); [EOL]     } [EOL]     if (Double.isInfinite(weightSum)) { [EOL]         throw new MathArithmeticException(LocalizedFormats.OVERFLOW); [EOL]     } [EOL]     distribution = new ArrayList<T>(); [EOL]     weight = new double[numComp]; [EOL]     for (int i = 0; i < numComp; i++) { [EOL]         final Pair<Double, T> comp = components.get(i); [EOL]         weight[i] = comp.getFirst() / weightSum; [EOL]         distribution.add(comp.getSecond()); [EOL]     } [EOL] } <line_num>: 65,96
public double density(final double[] values) { [EOL]     double p = 0; [EOL]     for (int i = 0; i < weight.length; i++) { [EOL]         p += weight[i] * distribution.get(i).density(values); [EOL]     } [EOL]     return p; [EOL] } <line_num>: 99,105
@Override [EOL] public double[] sample() { [EOL]     double[] vals = null; [EOL]     final double randomValue = random.nextDouble(); [EOL]     double sum = 0; [EOL]     for (int i = 0; i < weight.length; i++) { [EOL]         sum += weight[i]; [EOL]         if (randomValue <= sum) { [EOL]             vals = distribution.get(i).sample(); [EOL]             break; [EOL]         } [EOL]     } [EOL]     if (vals == null) { [EOL]         vals = distribution.get(weight.length - 1).sample(); [EOL]     } [EOL]     return vals; [EOL] } <line_num>: 108,134
@Override [EOL] public void reseedRandomGenerator(long seed) { [EOL]     super.reseedRandomGenerator(seed); [EOL]     for (int i = 0; i < distribution.size(); i++) { [EOL]         distribution.get(i).reseedRandomGenerator(i + 1 + seed); [EOL]     } [EOL] } <line_num>: 137,148
public List<Pair<Double, T>> getComponents() { [EOL]     final List<Pair<Double, T>> list = new ArrayList<Pair<Double, T>>(weight.length); [EOL]     for (int i = 0; i < weight.length; i++) { [EOL]         list.add(new Pair<Double, T>(weight[i], distribution.get(i))); [EOL]     } [EOL]     return list; [EOL] } <line_num>: 155,163