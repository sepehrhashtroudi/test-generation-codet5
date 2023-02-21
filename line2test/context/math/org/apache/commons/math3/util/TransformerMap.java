public TransformerMap()
public boolean containsClass(Class<?> key)
public boolean containsTransformer(NumberTransformer value)
public NumberTransformer getTransformer(Class<?> key)
public NumberTransformer putTransformer(Class<?> key, NumberTransformer transformer)
public NumberTransformer removeTransformer(Class<?> key)
public void clear()
public Set<Class<?>> classes()
public Collection<NumberTransformer> transformers()
public double transform(Object o) throws MathIllegalArgumentException
public boolean equals(Object other)
public int hashCode()
long serialVersionUID=Optional[4605318041528645258L]
NumberTransformer defaultTransformer=Optional[null]
Map<Class<?>, NumberTransformer> map=Optional[null]
