private void init() { [EOL]     tokens.clear(); [EOL] } <line_num>: 37,40
protected String[] flatten(Options options, String[] arguments, boolean stopAtNonOption) { [EOL]     init(); [EOL]     boolean eatTheRest = false; [EOL]     Option currentOption = null; [EOL]     for (int i = 0; i < arguments.length; i++) { [EOL]         if ("--".equals(arguments[i])) { [EOL]             eatTheRest = true; [EOL]             tokens.add("--"); [EOL]         } else if ("-".equals(arguments[i])) { [EOL]             tokens.add("-"); [EOL]         } else if (arguments[i].startsWith("-")) { [EOL]             Option option = options.getOption(arguments[i]); [EOL]             if (option == null) { [EOL]                 Option specialOption = options.getOption(arguments[i].substring(0, 2)); [EOL]                 if (specialOption != null) { [EOL]                     tokens.add(arguments[i].substring(0, 2)); [EOL]                     tokens.add(arguments[i].substring(2)); [EOL]                 } else if (stopAtNonOption) { [EOL]                     eatTheRest = true; [EOL]                     tokens.add(arguments[i]); [EOL]                 } else { [EOL]                     tokens.add(arguments[i]); [EOL]                 } [EOL]             } else { [EOL]                 currentOption = option; [EOL]                 Option specialOption = options.getOption(arguments[i].substring(0, 2)); [EOL]                 if ((specialOption != null) && (option == null)) { [EOL]                     tokens.add(arguments[i].substring(0, 2)); [EOL]                     tokens.add(arguments[i].substring(2)); [EOL]                 } else if ((currentOption != null) && currentOption.hasArg()) { [EOL]                     if (currentOption.hasArg()) { [EOL]                         tokens.add(arguments[i]); [EOL]                         currentOption = null; [EOL]                     } else if (currentOption.hasArgs()) { [EOL]                         tokens.add(arguments[i]); [EOL]                     } else if (stopAtNonOption) { [EOL]                         eatTheRest = true; [EOL]                         tokens.add("--"); [EOL]                         tokens.add(arguments[i]); [EOL]                     } else { [EOL]                         tokens.add(arguments[i]); [EOL]                     } [EOL]                 } else if (currentOption != null) { [EOL]                     tokens.add(arguments[i]); [EOL]                 } else if (stopAtNonOption) { [EOL]                     eatTheRest = true; [EOL]                     tokens.add("--"); [EOL]                     tokens.add(arguments[i]); [EOL]                 } else { [EOL]                     tokens.add(arguments[i]); [EOL]                 } [EOL]             } [EOL]         } else { [EOL]             tokens.add(arguments[i]); [EOL]         } [EOL]         if (eatTheRest) { [EOL]             for (i++; i < arguments.length; i++) { [EOL]                 tokens.add(arguments[i]); [EOL]             } [EOL]         } [EOL]     } [EOL]     return (String[]) tokens.toArray(new String[] {}); [EOL] } <line_num>: 61,172