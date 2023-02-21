public LinearObjectiveFunction(double[] coefficients, double constantTerm)
public LinearObjectiveFunction(RealVector coefficients, double constantTerm)
public RealVector getCoefficients()
public double getConstantTerm()
public double getValue(final double[] point)
public double getValue(final RealVector point)
public boolean equals(Object other)
public int hashCode()
private void writeObject(ObjectOutputStream oos) throws IOException
private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException
long serialVersionUID=Optional[-4531815507568396090L]
RealVector coefficients
double constantTerm
