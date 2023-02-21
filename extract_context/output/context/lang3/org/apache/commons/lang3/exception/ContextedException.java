public ContextedException()
public ContextedException(final String message)
public ContextedException(final Throwable cause)
public ContextedException(final String message, final Throwable cause)
public ContextedException(final String message, final Throwable cause, ExceptionContext context)
public ContextedException addContextValue(final String label, final Object value)
public ContextedException setContextValue(final String label, final Object value)
public List<Object> getContextValues(final String label)
public Object getFirstContextValue(final String label)
public List<Pair<String, Object>> getContextEntries()
public Set<String> getContextLabels()
public String getMessage()
public String getRawMessage()
public String getFormattedExceptionMessage(final String baseMessage)
long serialVersionUID=Optional[20110706L]
ExceptionContext exceptionContext
