protected abstract String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption); <line_num>: 54,55
public CommandLine parse(Options options, String[] arguments) throws ParseException { [EOL]     return parse(options, arguments, null, false); [EOL] } <line_num>: 67,71
public CommandLine parse(Options options, String[] arguments, Properties properties) throws ParseException { [EOL]     return parse(options, arguments, properties, false); [EOL] } <line_num>: 85,90
public CommandLine parse(Options options, String[] arguments, boolean stopAtNonOption) throws ParseException { [EOL]     return parse(options, arguments, null, stopAtNonOption); [EOL] } <line_num>: 107,112
public CommandLine parse(Options options, String[] arguments, Properties properties, boolean stopAtNonOption) throws ParseException { [EOL]     this.options = options; [EOL]     requiredOptions = options.getRequiredOptions(); [EOL]     cmd = new CommandLine(); [EOL]     boolean eatTheRest = false; [EOL]     if (arguments == null) { [EOL]         arguments = new String[0]; [EOL]     } [EOL]     List tokenList = Arrays.asList(flatten(this.options, arguments, stopAtNonOption)); [EOL]     ListIterator iterator = tokenList.listIterator(); [EOL]     while (iterator.hasNext()) { [EOL]         String t = (String) iterator.next(); [EOL]         if ("--".equals(t)) { [EOL]             eatTheRest = true; [EOL]         } else if ("-".equals(t)) { [EOL]             if (stopAtNonOption) { [EOL]                 eatTheRest = true; [EOL]             } else { [EOL]                 cmd.addArg(t); [EOL]             } [EOL]         } else if (t.startsWith("-")) { [EOL]             if (stopAtNonOption && !options.hasOption(t)) { [EOL]                 eatTheRest = true; [EOL]                 cmd.addArg(t); [EOL]             } else { [EOL]                 processOption(t, iterator); [EOL]             } [EOL]         } else { [EOL]             cmd.addArg(t); [EOL]             if (stopAtNonOption) { [EOL]                 eatTheRest = true; [EOL]             } [EOL]         } [EOL]         if (eatTheRest) { [EOL]             while (iterator.hasNext()) { [EOL]                 String str = (String) iterator.next(); [EOL]                 if (!"--".equals(str)) { [EOL]                     cmd.addArg(str); [EOL]                 } [EOL]             } [EOL]         } [EOL]     } [EOL]     processProperties(properties); [EOL]     checkRequiredOptions(); [EOL]     return cmd; [EOL] } <line_num>: 129,220
private void processProperties(Properties properties) { [EOL]     if (properties == null) { [EOL]         return; [EOL]     } [EOL]     for (Enumeration e = properties.propertyNames(); e.hasMoreElements(); ) { [EOL]         String option = e.nextElement().toString(); [EOL]         if (!cmd.hasOption(option)) { [EOL]             Option opt = options.getOption(option); [EOL]             String value = properties.getProperty(option); [EOL]             if (opt.hasArg()) { [EOL]                 if ((opt.getValues() == null) || (opt.getValues().length == 0)) { [EOL]                     try { [EOL]                         opt.addValue(value); [EOL]                     } catch (RuntimeException exp) { [EOL]                     } [EOL]                 } [EOL]             } else if (!("yes".equalsIgnoreCase(value) || "true".equalsIgnoreCase(value) || "1".equalsIgnoreCase(value))) { [EOL]                 break; [EOL]             } [EOL]             cmd.addOption(opt); [EOL]         } [EOL]     } [EOL] } <line_num>: 228,273
private void checkRequiredOptions() throws MissingOptionException { [EOL]     if (requiredOptions.size() > 0) { [EOL]         Iterator iter = requiredOptions.iterator(); [EOL]         StringBuffer buff = new StringBuffer(); [EOL]         while (iter.hasNext()) { [EOL]             buff.append(iter.next()); [EOL]         } [EOL]         throw new MissingOptionException(buff.toString()); [EOL]     } [EOL] } <line_num>: 282,300
public void processArgs(Option opt, ListIterator iter) throws ParseException { [EOL]     while (iter.hasNext()) { [EOL]         String str = (String) iter.next(); [EOL]         if (options.hasOption(str) && str.startsWith("-")) { [EOL]             iter.previous(); [EOL]             break; [EOL]         } [EOL]         try { [EOL]             opt.addValue(Util.stripLeadingAndTrailingQuotes(str)); [EOL]         } catch (RuntimeException exp) { [EOL]             iter.previous(); [EOL]             break; [EOL]         } [EOL]     } [EOL]     if ((opt.getValues() == null) && !opt.hasOptionalArg()) { [EOL]         throw new MissingArgumentException("Missing argument for option:" + opt.getKey()); [EOL]     } [EOL] } <line_num>: 314,346
private void processOption(String arg, ListIterator iter) throws ParseException { [EOL]     boolean hasOption = options.hasOption(arg); [EOL]     if (!hasOption) { [EOL]         throw new UnrecognizedOptionException("Unrecognized option: " + arg); [EOL]     } [EOL]     final Option opt = options.getOption(arg); [EOL]     if (opt.isRequired()) { [EOL]         requiredOptions.remove(opt.getKey()); [EOL]     } [EOL]     if (options.getOptionGroup(opt) != null) { [EOL]         OptionGroup group = options.getOptionGroup(opt); [EOL]         if (group.isRequired()) { [EOL]             requiredOptions.remove(group); [EOL]         } [EOL]         group.setSelected(opt); [EOL]     } [EOL]     if (opt.hasArg()) { [EOL]         processArgs(opt, iter); [EOL]     } [EOL]     cmd.addOption(opt); [EOL] } <line_num>: 360,405
