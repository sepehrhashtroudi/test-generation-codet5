public BaseMultiStartMultivariateOptimizer(final BaseMultivariateOptimizer<PAIR> optimizer, final int starts, final RandomVectorGenerator generator)
public int getEvaluations()
public abstract PAIR[] getOptima()
public PAIR optimize(OptimizationData... optData)
protected PAIR doOptimize()
protected abstract void store(PAIR optimum)
protected abstract void clear()
