public RootContext(JXPathContextReferenceImpl jxpathContext, NodePointer pointer)
public JXPathContext getJXPathContext()
public RootContext getRootContext()
public EvalContext getAbsoluteRootContext()
public NodePointer getCurrentNodePointer()
public Object getValue()
public int getCurrentPosition()
public boolean nextNode()
public boolean nextSet()
public boolean setPosition(int position)
public EvalContext getConstantContext(Object constant)
public EvalContext getVariableContext(QName variableName)
public Function getFunction(QName functionName, Object[] parameters)
public Object getRegisteredValue(int id)
public int setRegisteredValue(Object value)
public String toString()
JXPathContextReferenceImpl jxpathContext
NodePointer pointer
Object[] registers
int availableRegister=Optional[0]
Object UNKNOWN_VALUE=Optional[new Object()]
int MAX_REGISTER=Optional[4]
