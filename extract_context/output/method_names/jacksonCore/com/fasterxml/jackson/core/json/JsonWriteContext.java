protected JsonWriteContext(int type, JsonWriteContext parent)
public static JsonWriteContext createRootContext()
private JsonWriteContext reset(int type)
public final JsonWriteContext createChildArrayContext()
public final JsonWriteContext createChildObjectContext()
public final JsonWriteContext getParent()
public final String getCurrentName()
public final int writeFieldName(String name)
public final int writeValue()
protected final void appendDesc(StringBuilder sb)
public final String toString()
