EventBindingInvocationHandler(final Object target, final String methodName, final String[] eventTypes) { [EOL]     this.target = target; [EOL]     this.methodName = methodName; [EOL]     this.eventTypes = new HashSet<String>(Arrays.asList(eventTypes)); [EOL] } <line_num>: 94,98
public static <L> void addEventListener(final Object eventSource, final Class<L> listenerType, final L listener) { [EOL]     try { [EOL]         MethodUtils.invokeMethod(eventSource, "add" + listenerType.getSimpleName(), listener); [EOL]     } catch (final NoSuchMethodException e) { [EOL]         throw new IllegalArgumentException("Class " + eventSource.getClass().getName() + " does not have a public add" + listenerType.getSimpleName() + " method which takes a parameter of type " + listenerType.getName() + "."); [EOL]     } catch (final IllegalAccessException e) { [EOL]         throw new IllegalArgumentException("Class " + eventSource.getClass().getName() + " does not have an accessible add" + listenerType.getSimpleName() + " method which takes a parameter of type " + listenerType.getName() + "."); [EOL]     } catch (final InvocationTargetException e) { [EOL]         throw new RuntimeException("Unable to add listener.", e.getCause()); [EOL]     } [EOL] } <line_num>: 48,62
public static <L> void bindEventsToMethod(final Object target, final String methodName, final Object eventSource, final Class<L> listenerType, final String... eventTypes) { [EOL]     final L listener = listenerType.cast(Proxy.newProxyInstance(target.getClass().getClassLoader(), new Class[] { listenerType }, new EventBindingInvocationHandler(target, methodName, eventTypes))); [EOL]     addEventListener(eventSource, listenerType, listener); [EOL] } <line_num>: 75,80
@Override [EOL] public Object invoke(final Object proxy, final Method method, final Object[] parameters) throws Throwable { [EOL]     if (eventTypes.isEmpty() || eventTypes.contains(method.getName())) { [EOL]         if (hasMatchingParametersMethod(method)) { [EOL]             return MethodUtils.invokeMethod(target, methodName, parameters); [EOL]         } else { [EOL]             return MethodUtils.invokeMethod(target, methodName); [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 109,119
private boolean hasMatchingParametersMethod(final Method method) { [EOL]     return MethodUtils.getAccessibleMethod(target.getClass(), methodName, method.getParameterTypes()) != null; [EOL] } <line_num>: 127,129