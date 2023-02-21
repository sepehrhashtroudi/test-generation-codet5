protected TestProblemAbstract()
protected TestProblemAbstract(TestProblemAbstract problem)
public abstract TestProblemAbstract copy()
protected void setInitialConditions(double t0, double[] y0)
protected void setFinalConditions(double t1)
protected void setErrorScale(double[] errorScale)
public int getDimension()
public double getInitialTime()
public double[] getInitialState()
public double getFinalTime()
public double[] getErrorScale()
public EventHandler[] getEventsHandlers()
public double[] getTheoreticalEventsTimes()
public int getCalls()
public void computeDerivatives(double t, double[] y, double[] yDot)
public abstract void doComputeDerivatives(double t, double[] y, double[] yDot)
public abstract double[] computeTheoreticalState(double t)
int n
int calls
double t0
double[] y0
double t1
double[] errorScale