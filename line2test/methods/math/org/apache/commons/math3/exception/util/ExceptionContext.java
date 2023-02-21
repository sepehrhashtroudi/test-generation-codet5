public ExceptionContext(final Throwable throwable) { [EOL]     this.throwable = throwable; [EOL]     msgPatterns = new ArrayList<Localizable>(); [EOL]     msgArguments = new ArrayList<Object[]>(); [EOL]     context = new HashMap<String, Object>(); [EOL] } <line_num>: 64,69
public Throwable getThrowable() { [EOL]     return throwable; [EOL] } <line_num>: 74,76
public void addMessage(Localizable pattern, Object... arguments) { [EOL]     msgPatterns.add(pattern); [EOL]     msgArguments.add(ArgUtils.flatten(arguments)); [EOL] } <line_num>: 85,89
public void setValue(String key, Object value) { [EOL]     context.put(key, value); [EOL] } <line_num>: 99,101
public Object getValue(String key) { [EOL]     return context.get(key); [EOL] } <line_num>: 109,111
public Set<String> getKeys() { [EOL]     return context.keySet(); [EOL] } <line_num>: 118,120
public String getMessage() { [EOL]     return getMessage(Locale.US); [EOL] } <line_num>: 127,129
public String getLocalizedMessage() { [EOL]     return getMessage(Locale.getDefault()); [EOL] } <line_num>: 136,138
public String getMessage(final Locale locale) { [EOL]     return buildMessage(locale, ": "); [EOL] } <line_num>: 146,148
public String getMessage(final Locale locale, final String separator) { [EOL]     return buildMessage(locale, separator); [EOL] } <line_num>: 157,160
private String buildMessage(Locale locale, String separator) { [EOL]     final StringBuilder sb = new StringBuilder(); [EOL]     int count = 0; [EOL]     final int len = msgPatterns.size(); [EOL]     for (int i = 0; i < len; i++) { [EOL]         final Localizable pat = msgPatterns.get(i); [EOL]         final Object[] args = msgArguments.get(i); [EOL]         final MessageFormat fmt = new MessageFormat(pat.getLocalizedString(locale), locale); [EOL]         sb.append(fmt.format(args)); [EOL]         if (++count < len) { [EOL]             sb.append(separator); [EOL]         } [EOL]     } [EOL]     return sb.toString(); [EOL] } <line_num>: 169,187
private void writeObject(ObjectOutputStream out) throws IOException { [EOL]     out.writeObject(throwable); [EOL]     serializeMessages(out); [EOL]     serializeContext(out); [EOL] } <line_num>: 195,200
private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException { [EOL]     throwable = (Throwable) in.readObject(); [EOL]     deSerializeMessages(in); [EOL]     deSerializeContext(in); [EOL] } <line_num>: 208,214
private void serializeMessages(ObjectOutputStream out) throws IOException { [EOL]     final int len = msgPatterns.size(); [EOL]     out.writeInt(len); [EOL]     for (int i = 0; i < len; i++) { [EOL]         final Localizable pat = msgPatterns.get(i); [EOL]         out.writeObject(pat); [EOL]         final Object[] args = msgArguments.get(i); [EOL]         final int aLen = args.length; [EOL]         out.writeInt(aLen); [EOL]         for (int j = 0; j < aLen; j++) { [EOL]             if (args[j] instanceof Serializable) { [EOL]                 out.writeObject(args[j]); [EOL]             } else { [EOL]                 out.writeObject(nonSerializableReplacement(args[j])); [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 222,246
private void deSerializeMessages(ObjectInputStream in) throws IOException, ClassNotFoundException { [EOL]     final int len = in.readInt(); [EOL]     msgPatterns = new ArrayList<Localizable>(len); [EOL]     msgArguments = new ArrayList<Object[]>(len); [EOL]     for (int i = 0; i < len; i++) { [EOL]         final Localizable pat = (Localizable) in.readObject(); [EOL]         msgPatterns.add(pat); [EOL]         final int aLen = in.readInt(); [EOL]         final Object[] args = new Object[aLen]; [EOL]         for (int j = 0; j < aLen; j++) { [EOL]             args[j] = in.readObject(); [EOL]         } [EOL]         msgArguments.add(args); [EOL]     } [EOL] } <line_num>: 255,276
private void serializeContext(ObjectOutputStream out) throws IOException { [EOL]     final int len = context.keySet().size(); [EOL]     out.writeInt(len); [EOL]     for (String key : context.keySet()) { [EOL]         out.writeObject(key); [EOL]         final Object value = context.get(key); [EOL]         if (value instanceof Serializable) { [EOL]             out.writeObject(value); [EOL]         } else { [EOL]             out.writeObject(nonSerializableReplacement(value)); [EOL]         } [EOL]     } [EOL] } <line_num>: 284,301
private void deSerializeContext(ObjectInputStream in) throws IOException, ClassNotFoundException { [EOL]     final int len = in.readInt(); [EOL]     context = new HashMap<String, Object>(); [EOL]     for (int i = 0; i < len; i++) { [EOL]         final String key = (String) in.readObject(); [EOL]         final Object value = in.readObject(); [EOL]         context.put(key, value); [EOL]     } [EOL] } <line_num>: 310,323
private String nonSerializableReplacement(Object obj) { [EOL]     return "[Object could not be serialized: " + obj.getClass().getName() + "]"; [EOL] } <line_num>: 332,334
