public JsonNodeFactory(boolean bigDecimalExact)
protected JsonNodeFactory()
public static JsonNodeFactory withExactBigDecimals(boolean bigDecimalExact)
public BooleanNode booleanNode(boolean v)
public NullNode nullNode()
public NumericNode numberNode(byte v)
public ValueNode numberNode(Byte value)
public NumericNode numberNode(short v)
public ValueNode numberNode(Short value)
public NumericNode numberNode(int v)
public ValueNode numberNode(Integer value)
public NumericNode numberNode(long v)
public ValueNode numberNode(Long value)
public NumericNode numberNode(BigInteger v)
public NumericNode numberNode(float v)
public ValueNode numberNode(Float value)
public NumericNode numberNode(double v)
public ValueNode numberNode(Double value)
public NumericNode numberNode(BigDecimal v)
public TextNode textNode(String text)
public BinaryNode binaryNode(byte[] data)
public BinaryNode binaryNode(byte[] data, int offset, int length)
public ArrayNode arrayNode()
public ObjectNode objectNode()
public POJONode POJONode(Object pojo)
long serialVersionUID=Optional[2323165117839546871L]
boolean _cfgBigDecimalExact
JsonNodeFactory decimalsNormalized=Optional[new JsonNodeFactory(false)]
JsonNodeFactory decimalsAsIs=Optional[new JsonNodeFactory(true)]
JsonNodeFactory instance=Optional[decimalsNormalized]