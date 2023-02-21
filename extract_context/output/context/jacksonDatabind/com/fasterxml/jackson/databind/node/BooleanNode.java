private BooleanNode(boolean v)
public static BooleanNode getTrue()
public static BooleanNode getFalse()
public static BooleanNode valueOf(boolean b)
public JsonNodeType getNodeType()
public JsonToken asToken()
public boolean booleanValue()
public String asText()
public boolean asBoolean()
public boolean asBoolean(boolean defaultValue)
public int asInt(int defaultValue)
public long asLong(long defaultValue)
public double asDouble(double defaultValue)
public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException
public boolean equals(Object o)
BooleanNode TRUE=Optional[new BooleanNode(true)]
BooleanNode FALSE=Optional[new BooleanNode(false)]
boolean _value
