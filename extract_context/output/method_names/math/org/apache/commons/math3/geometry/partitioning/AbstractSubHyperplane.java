protected AbstractSubHyperplane(final Hyperplane<S> hyperplane, final Region<T> remainingRegion)
protected abstract AbstractSubHyperplane<S, T> buildNew(final Hyperplane<S> hyper, final Region<T> remaining)
public AbstractSubHyperplane<S, T> copySelf()
public Hyperplane<S> getHyperplane()
public Region<T> getRemainingRegion()
public double getSize()
public AbstractSubHyperplane<S, T> reunite(final SubHyperplane<S> other)
public AbstractSubHyperplane<S, T> applyTransform(final Transform<S, T> transform)
private BSPTree<T> recurseTransform(final BSPTree<T> node, final Hyperplane<S> transformed, final Transform<S, T> transform)
public abstract Side side(Hyperplane<S> hyper)
public abstract SplitSubHyperplane<S> split(Hyperplane<S> hyper)
public boolean isEmpty()
