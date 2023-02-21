public IterationManager(final int maxIterations)
public IterationManager(final int maxIterations, final Incrementor.MaxCountExceededCallback callBack)
public void addIterationListener(final IterationListener listener)
public void fireInitializationEvent(final IterationEvent e)
public void fireIterationPerformedEvent(final IterationEvent e)
public void fireIterationStartedEvent(final IterationEvent e)
public void fireTerminationEvent(final IterationEvent e)
public int getIterations()
public int getMaxIterations()
public void incrementIterationCount() throws MaxCountExceededException
public void removeIterationListener(final IterationListener listener)
public void resetIterationCount()
Incrementor iterations
Collection<IterationListener> listeners