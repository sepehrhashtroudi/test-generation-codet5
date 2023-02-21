public BooleanOptionHandler(CmdLineParser parser, OptionDef option, Setter<? super Boolean> setter) { [EOL]     super(parser, option, setter); [EOL] } <line_num>: 454,458
public WarningGuardErrorOptionHandler(CmdLineParser parser, OptionDef option, Setter<? super String> setter) { [EOL]     super(parser, option, new WarningGuardSetter(setter, CheckLevel.ERROR)); [EOL] } <line_num>: 494,498
public WarningGuardWarningOptionHandler(CmdLineParser parser, OptionDef option, Setter<? super String> setter) { [EOL]     super(parser, option, new WarningGuardSetter(setter, CheckLevel.WARNING)); [EOL] } <line_num>: 503,508
public WarningGuardOffOptionHandler(CmdLineParser parser, OptionDef option, Setter<? super String> setter) { [EOL]     super(parser, option, new WarningGuardSetter(setter, CheckLevel.OFF)); [EOL] } <line_num>: 513,517
private WarningGuardSetter(Setter<? super String> proxy, CheckLevel level) { [EOL]     this.proxy = proxy; [EOL]     this.level = level; [EOL] } <line_num>: 524,528
protected CommandLineRunner(String[] args) { [EOL]     super(); [EOL]     initConfigFromFlags(args, System.err); [EOL] } <line_num>: 580,583
protected CommandLineRunner(String[] args, PrintStream out, PrintStream err) { [EOL]     super(out, err); [EOL]     initConfigFromFlags(args, err); [EOL] } <line_num>: 585,588
List<String> getJsFiles() { [EOL]     List<String> allJsInputs = Lists.newArrayListWithCapacity(js.size() + arguments.size()); [EOL]     allJsInputs.addAll(js); [EOL]     allJsInputs.addAll(arguments); [EOL]     return allJsInputs; [EOL] } <line_num>: 438,444
@Override [EOL] public int parseArguments(Parameters params) throws CmdLineException { [EOL]     String param = null; [EOL]     try { [EOL]         param = params.getParameter(0); [EOL]     } catch (CmdLineException e) { [EOL]     } [EOL]     if (param == null) { [EOL]         setter.addValue(true); [EOL]         return 0; [EOL]     } else { [EOL]         String lowerParam = param.toLowerCase(); [EOL]         if (TRUES.contains(lowerParam)) { [EOL]             setter.addValue(true); [EOL]         } else if (FALSES.contains(lowerParam)) { [EOL]             setter.addValue(false); [EOL]         } else { [EOL]             setter.addValue(true); [EOL]             return 0; [EOL]         } [EOL]         return 1; [EOL]     } [EOL] } <line_num>: 460,482
@Override [EOL] public String getDefaultMetaVariable() { [EOL]     return null; [EOL] } <line_num>: 484,487
@Override [EOL] public boolean isMultiValued() { [EOL]     return proxy.isMultiValued(); [EOL] } <line_num>: 530,532
@Override [EOL] public Class<String> getType() { [EOL]     return (Class<String>) proxy.getType(); [EOL] } <line_num>: 534,536
@Override [EOL] public void addValue(String value) throws CmdLineException { [EOL]     proxy.addValue(value); [EOL]     warningGuardSpec.add(level, value); [EOL] } <line_num>: 538,541
private void applyToOptions(CompilerOptions options) { [EOL]     switch(this) { [EOL]         case PRETTY_PRINT: [EOL]             options.prettyPrint = true; [EOL]             break; [EOL]         case PRINT_INPUT_DELIMITER: [EOL]             options.printInputDelimiter = true; [EOL]             break; [EOL]         case SINGLE_QUOTES: [EOL]             options.setPreferSingleQuotes(true); [EOL]             break; [EOL]         default: [EOL]             throw new RuntimeException("Unknown formatting option: " + this); [EOL]     } [EOL] } <line_num>: 554,568
private List<String> tokenizeKeepingQuotedStrings(List<String> lines) { [EOL]     List<String> tokens = Lists.newArrayList(); [EOL]     Pattern tokenPattern = Pattern.compile("(?:[^ \t\f\\x0B'\"]|(?:'[^']*'|\"[^\"]*\"))+"); [EOL]     for (String line : lines) { [EOL]         Matcher matcher = tokenPattern.matcher(line); [EOL]         while (matcher.find()) { [EOL]             tokens.add(matcher.group(0)); [EOL]         } [EOL]     } [EOL]     return tokens; [EOL] } <line_num>: 600,612
private List<String> processArgs(String[] args) { [EOL]     Pattern argPattern = Pattern.compile("(--[a-zA-Z_]+)=(.*)"); [EOL]     Pattern quotesPattern = Pattern.compile("^['\"](.*)['\"]$"); [EOL]     List<String> processedArgs = Lists.newArrayList(); [EOL]     for (String arg : args) { [EOL]         Matcher matcher = argPattern.matcher(arg); [EOL]         if (matcher.matches()) { [EOL]             processedArgs.add(matcher.group(1)); [EOL]             String value = matcher.group(2); [EOL]             Matcher quotesMatcher = quotesPattern.matcher(value); [EOL]             if (quotesMatcher.matches()) { [EOL]                 processedArgs.add(quotesMatcher.group(1)); [EOL]             } else { [EOL]                 processedArgs.add(value); [EOL]             } [EOL]         } else { [EOL]             processedArgs.add(arg); [EOL]         } [EOL]     } [EOL]     return processedArgs; [EOL] } <line_num>: 614,640
private void processFlagFile(PrintStream err) throws CmdLineException, IOException { [EOL]     File flagFileInput = new File(flags.flag_file); [EOL]     List<String> argsInFile = tokenizeKeepingQuotedStrings(Files.readLines(flagFileInput, Charset.defaultCharset())); [EOL]     flags.flag_file = ""; [EOL]     List<String> processedFileArgs = processArgs(argsInFile.toArray(new String[] {})); [EOL]     CmdLineParser parserFileArgs = new CmdLineParser(flags); [EOL]     Flags.warningGuardSpec.clear(); [EOL]     parserFileArgs.parseArgument(processedFileArgs.toArray(new String[] {})); [EOL]     if (!flags.flag_file.equals("")) { [EOL]         err.println("ERROR - Arguments in the file cannot contain " + "--flagfile option."); [EOL]         isConfigValid = false; [EOL]     } [EOL] } <line_num>: 642,661
private void initConfigFromFlags(String[] args, PrintStream err) { [EOL]     List<String> processedArgs = processArgs(args); [EOL]     CmdLineParser parser = new CmdLineParser(flags); [EOL]     Flags.warningGuardSpec.clear(); [EOL]     isConfigValid = true; [EOL]     try { [EOL]         parser.parseArgument(processedArgs.toArray(new String[] {})); [EOL]         if (!flags.flag_file.equals("")) { [EOL]             processFlagFile(err); [EOL]         } [EOL]     } catch (CmdLineException e) { [EOL]         err.println(e.getMessage()); [EOL]         isConfigValid = false; [EOL]     } catch (IOException ioErr) { [EOL]         err.println("ERROR - " + flags.flag_file + " read error."); [EOL]         isConfigValid = false; [EOL]     } [EOL]     if (flags.version) { [EOL]         err.println("Closure Compiler (http://code.google.com/closure/compiler)\n" + "Version: " + Compiler.getReleaseVersion() + "\n" + "Built on: " + Compiler.getReleaseDate()); [EOL]         err.flush(); [EOL]     } [EOL]     if (flags.process_common_js_modules) { [EOL]         flags.process_closure_primitives = true; [EOL]         flags.manage_closure_dependencies = true; [EOL]         if (flags.common_js_entry_module == null) { [EOL]             err.println("Please specify --common_js_entry_module."); [EOL]             err.flush(); [EOL]             isConfigValid = false; [EOL]         } [EOL]         flags.closure_entry_point = Lists.newArrayList(ProcessCommonJSModules.toModuleName(flags.common_js_entry_module)); [EOL]     } [EOL]     if (!isConfigValid || flags.display_help) { [EOL]         isConfigValid = false; [EOL]         parser.printUsage(err); [EOL]     } else { [EOL]         CodingConvention conv; [EOL]         if (flags.third_party) { [EOL]             conv = CodingConventions.getDefault(); [EOL]         } else if (flags.process_jquery_primitives) { [EOL]             conv = new JqueryCodingConvention(); [EOL]         } else { [EOL]             conv = new ClosureCodingConvention(); [EOL]         } [EOL]         getCommandLineConfig().setPrintTree(flags.print_tree).setPrintAst(flags.print_ast).setPrintPassGraph(flags.print_pass_graph).setJscompDevMode(flags.jscomp_dev_mode).setLoggingLevel(flags.logging_level).setExterns(flags.externs).setJs(flags.getJsFiles()).setJsOutputFile(flags.js_output_file).setModule(flags.module).setVariableMapInputFile(flags.variable_map_input_file).setPropertyMapInputFile(flags.property_map_input_file).setVariableMapOutputFile(flags.variable_map_output_file).setCreateNameMapFiles(flags.create_name_map_files).setPropertyMapOutputFile(flags.property_map_output_file).setCodingConvention(conv).setSummaryDetailLevel(flags.summary_detail_level).setOutputWrapper(flags.output_wrapper).setModuleWrapper(flags.module_wrapper).setModuleOutputPathPrefix(flags.module_output_path_prefix).setCreateSourceMap(flags.create_source_map).setSourceMapFormat(flags.source_map_format).setWarningGuardSpec(Flags.warningGuardSpec).setDefine(flags.define).setCharset(flags.charset).setManageClosureDependencies(flags.manage_closure_dependencies).setOnlyClosureDependencies(flags.only_closure_dependencies).setClosureEntryPoints(flags.closure_entry_point).setOutputManifest(ImmutableList.of(flags.output_manifest)).setOutputModuleDependencies(flags.output_module_dependencies).setAcceptConstKeyword(flags.accept_const_keyword).setLanguageIn(flags.language_in).setProcessCommonJSModules(flags.process_common_js_modules).setCommonJSModulePathPrefix(flags.common_js_path_prefix).setTransformAMDToCJSModules(flags.transform_amd_modules).setWarningsWhitelistFile(flags.warnings_whitelist_file); [EOL]     } [EOL] } <line_num>: 663,754
@Override [EOL] protected CompilerOptions createOptions() { [EOL]     CompilerOptions options = new CompilerOptions(); [EOL]     if (flags.process_jquery_primitives) { [EOL]         options.setCodingConvention(new JqueryCodingConvention()); [EOL]     } else { [EOL]         options.setCodingConvention(new ClosureCodingConvention()); [EOL]     } [EOL]     CompilationLevel level = flags.compilation_level; [EOL]     level.setOptionsForCompilationLevel(options); [EOL]     if (flags.debug) { [EOL]         level.setDebugOptionsForCompilationLevel(options); [EOL]     } [EOL]     if (flags.use_types_for_optimization) { [EOL]         level.setTypeBasedOptimizationOptions(options); [EOL]     } [EOL]     if (flags.generate_exports) { [EOL]         options.setGenerateExports(flags.generate_exports); [EOL]     } [EOL]     WarningLevel wLevel = flags.warning_level; [EOL]     wLevel.setOptionsForWarningLevel(options); [EOL]     for (FormattingOption formattingOption : flags.formatting) { [EOL]         formattingOption.applyToOptions(options); [EOL]     } [EOL]     options.closurePass = flags.process_closure_primitives; [EOL]     options.jqueryPass = flags.process_jquery_primitives && CompilationLevel.ADVANCED_OPTIMIZATIONS == level; [EOL]     if (!flags.translationsFile.isEmpty()) { [EOL]         try { [EOL]             options.messageBundle = new XtbMessageBundle(new FileInputStream(flags.translationsFile), flags.translationsProject); [EOL]         } catch (IOException e) { [EOL]             throw new RuntimeException("Reading XTB file", e); [EOL]         } [EOL]     } else if (CompilationLevel.ADVANCED_OPTIMIZATIONS == level) { [EOL]         options.messageBundle = new EmptyMessageBundle(); [EOL]     } [EOL]     return options; [EOL] } <line_num>: 756,811
@Override [EOL] protected Compiler createCompiler() { [EOL]     return new Compiler(getErrorPrintStream()); [EOL] } <line_num>: 813,816
@Override [EOL] protected List<SourceFile> createExterns() throws FlagUsageException, IOException { [EOL]     List<SourceFile> externs = super.createExterns(); [EOL]     if (flags.use_only_custom_externs || isInTestMode()) { [EOL]         return externs; [EOL]     } else { [EOL]         List<SourceFile> defaultExterns = getDefaultExterns(); [EOL]         defaultExterns.addAll(externs); [EOL]         return defaultExterns; [EOL]     } [EOL] } <line_num>: 818,829
public static List<SourceFile> getDefaultExterns() throws IOException { [EOL]     InputStream input = CommandLineRunner.class.getResourceAsStream("/externs.zip"); [EOL]     if (input == null) { [EOL]         input = CommandLineRunner.class.getResourceAsStream("externs.zip"); [EOL]     } [EOL]     Preconditions.checkNotNull(input); [EOL]     ZipInputStream zip = new ZipInputStream(input); [EOL]     Map<String, SourceFile> externsMap = Maps.newHashMap(); [EOL]     for (ZipEntry entry = null; (entry = zip.getNextEntry()) != null; ) { [EOL]         BufferedInputStream entryStream = new BufferedInputStream(new LimitInputStream(zip, entry.getSize())); [EOL]         externsMap.put(entry.getName(), SourceFile.fromInputStream("externs.zip//" + entry.getName(), entryStream)); [EOL]     } [EOL]     Preconditions.checkState(externsMap.keySet().equals(Sets.newHashSet(DEFAULT_EXTERNS_NAMES)), "Externs zip must match our hard-coded list of externs."); [EOL]     List<SourceFile> externs = Lists.newArrayList(); [EOL]     for (String key : DEFAULT_EXTERNS_NAMES) { [EOL]         externs.add(externsMap.get(key)); [EOL]     } [EOL]     return externs; [EOL] } <line_num>: 888,922
public boolean shouldRunCompiler() { [EOL]     return this.isConfigValid; [EOL] } <line_num>: 927,929
public static void main(String[] args) { [EOL]     CommandLineRunner runner = new CommandLineRunner(args); [EOL]     if (runner.shouldRunCompiler()) { [EOL]         runner.run(); [EOL]     } else { [EOL]         System.exit(-1); [EOL]     } [EOL] } <line_num>: 934,941
