public static void maybeWriteJvmMetrics(PrintStream out, String options) { [EOL]     if (options == null) { [EOL]         return; [EOL]     } [EOL]     boolean verboseMode = false; [EOL]     boolean prettyMode = false; [EOL]     StringTokenizer st = new StringTokenizer(options, ":"); [EOL]     if (st.hasMoreTokens()) { [EOL]         String mode = st.nextToken(); [EOL]         if (mode.equalsIgnoreCase("verbose")) { [EOL]             verboseMode = true; [EOL]         } [EOL]     } [EOL]     if (st.hasMoreTokens()) { [EOL]         String mode = st.nextToken(); [EOL]         if (mode.equalsIgnoreCase("pretty")) { [EOL]             prettyMode = true; [EOL]         } [EOL]     } [EOL]     if (st.hasMoreTokens()) { [EOL]         while (st.hasMoreTokens()) { [EOL]             String types = st.nextToken(); [EOL]             StringTokenizer typeSt = new StringTokenizer(types, ","); [EOL]             while (typeSt.hasMoreElements()) { [EOL]                 String type = typeSt.nextToken(); [EOL]                 writeMetrics(out, type, verboseMode, prettyMode); [EOL]             } [EOL]         } [EOL]     } else { [EOL]         writeMetrics(out, "all", verboseMode, prettyMode); [EOL]     } [EOL] } <line_num>: 41,77
private static void writeMetrics(PrintStream out, String type, boolean verbose, boolean pretty) { [EOL]     if (type.equals("gc") || type.equalsIgnoreCase("all")) { [EOL]         writeGarbageCollectionStats(out, verbose, pretty); [EOL]     } [EOL]     if (type.equals("mem") || type.equalsIgnoreCase("all")) { [EOL]         writeMemoryMetrics(out, verbose, pretty); [EOL]     } [EOL]     if (type.equals("jit") || type.equalsIgnoreCase("all")) { [EOL]         writeJitMetrics(out, verbose, pretty); [EOL]     } [EOL] } <line_num>: 79,91
private static void writeJitMetrics(PrintStream out, boolean verbose, boolean pretty) { [EOL]     CompilationMXBean cBean = ManagementFactory.getCompilationMXBean(); [EOL]     String name; [EOL]     if (verbose) { [EOL]         name = cBean.getName(); [EOL]     } else { [EOL]         name = "total"; [EOL]     } [EOL]     if (pretty) { [EOL]         out.println("\nJIT Stats"); [EOL]         out.println(String.format("\t%s jit time: %d ms", name, cBean.getTotalCompilationTime())); [EOL]     } else { [EOL]         out.println(normalizeTabularColonPos(String.format("%s-jit-time-ms : %d", normalizeName(name), cBean.getTotalCompilationTime()))); [EOL]     } [EOL] } <line_num>: 93,113
private static void writeOverallMemoryUsage(PrintStream out, MemoryUsage usage, String prefix, boolean pretty) { [EOL]     if (pretty) { [EOL]         out.format("\t%s\n", prefix); [EOL]         out.format("\t\tavailable         : %s\n", formatBytes(usage.getMax())); [EOL]         out.format("\t\tcurrent           : %s\n", formatBytes(usage.getUsed())); [EOL]     } else { [EOL]         prefix = normalizeName(prefix); [EOL]         out.println(normalizeTabularColonPos(String.format(prefix + "-available-bytes : %d", usage.getMax()))); [EOL]         out.println(normalizeTabularColonPos(String.format(prefix + "-current-bytes : %d", usage.getUsed()))); [EOL]     } [EOL] } <line_num>: 115,128
private static void writePoolMemoryUsage(PrintStream out, MemoryUsage usage, MemoryUsage peakUsage, String prefix, boolean pretty) { [EOL]     if (pretty) { [EOL]         out.format("\t\tavailable         : %s\n", formatBytes(usage.getMax())); [EOL]         out.format("\t\tpeak              : %s\n", formatBytes(peakUsage.getUsed())); [EOL]         out.format("\t\tcurrent           : %s\n", formatBytes(usage.getUsed())); [EOL]     } else { [EOL]         out.println(normalizeTabularColonPos(String.format(prefix + "-available-bytes : %d", usage.getMax()))); [EOL]         out.println(normalizeTabularColonPos(String.format(prefix + "-peak-bytes : %d", peakUsage.getUsed()))); [EOL]         out.println(normalizeTabularColonPos(String.format(prefix + "-current-bytes : %d", usage.getUsed()))); [EOL]     } [EOL] } <line_num>: 130,147
private static void writeMemoryMetrics(PrintStream out, boolean verbose, boolean pretty) { [EOL]     if (pretty) { [EOL]         out.println("\nMemory usage"); [EOL]     } [EOL]     if (verbose) { [EOL]         MemoryMXBean overallMemBean = ManagementFactory.getMemoryMXBean(); [EOL]         MemoryUsage usage = overallMemBean.getHeapMemoryUsage(); [EOL]         writeOverallMemoryUsage(out, usage, "Heap", pretty); [EOL]         usage = overallMemBean.getNonHeapMemoryUsage(); [EOL]         writeOverallMemoryUsage(out, usage, "Non-heap", pretty); [EOL]     } [EOL]     if (verbose) { [EOL]         List<MemoryPoolMXBean> mpBeans = ManagementFactory.getMemoryPoolMXBeans(); [EOL]         for (MemoryPoolMXBean mpBean : mpBeans) { [EOL]             MemoryUsage currentUsage = mpBean.getUsage(); [EOL]             MemoryUsage peakUsage = mpBean.getPeakUsage(); [EOL]             if (pretty) { [EOL]                 out.println("\tPool " + mpBean.getName()); [EOL]                 writePoolMemoryUsage(out, currentUsage, peakUsage, null, true); [EOL]             } else { [EOL]                 writePoolMemoryUsage(out, currentUsage, peakUsage, "mem-pool-" + normalizeName(mpBean.getName()), false); [EOL]             } [EOL]         } [EOL]     } else { [EOL]         long available = 0; [EOL]         long current = 0; [EOL]         long peak = 0; [EOL]         List<MemoryPoolMXBean> mpBeans = ManagementFactory.getMemoryPoolMXBeans(); [EOL]         for (MemoryPoolMXBean mpBean : mpBeans) { [EOL]             MemoryUsage currentUsage = mpBean.getUsage(); [EOL]             available += currentUsage.getMax(); [EOL]             current += currentUsage.getUsed(); [EOL]             MemoryUsage peakUsage = mpBean.getPeakUsage(); [EOL]             peak += peakUsage.getUsed(); [EOL]         } [EOL]         MemoryUsage summaryUsage = new MemoryUsage(0, current, current, available); [EOL]         MemoryUsage summaryPeakUsage = new MemoryUsage(0, peak, peak, peak); [EOL]         if (pretty) { [EOL]             out.format("\tAggregate of %d memory pools\n", mpBeans.size()); [EOL]             writePoolMemoryUsage(out, summaryUsage, summaryPeakUsage, null, true); [EOL]         } else { [EOL]             writePoolMemoryUsage(out, summaryUsage, summaryPeakUsage, "mem", false); [EOL]         } [EOL]     } [EOL] } <line_num>: 149,200
private static void writeGarbageCollectionStats(PrintStream out, boolean verbose, boolean pretty) { [EOL]     List<GarbageCollectorMXBean> gcBeans = ManagementFactory.getGarbageCollectorMXBeans(); [EOL]     if (verbose) { [EOL]         if (pretty) { [EOL]             out.println("\nGarbage collection stats"); [EOL]             for (GarbageCollectorMXBean gcBean : gcBeans) { [EOL]                 out.println("\tCollector " + gcBean.getName()); [EOL]                 out.format("\t\tcollection count   : %d\n", gcBean.getCollectionCount()); [EOL]                 out.format("\t\tcollection time    : %d ms\n", gcBean.getCollectionTime()); [EOL]             } [EOL]         } else { [EOL]             for (GarbageCollectorMXBean gcBean : gcBeans) { [EOL]                 String name = normalizeName(gcBean.getName()); [EOL]                 out.println(normalizeTabularColonPos(String.format("gc-" + name + "-collection-count : %d", gcBean.getCollectionCount()))); [EOL]                 out.println(normalizeTabularColonPos(String.format("gc-" + name + "-collection-time-ms : %d", gcBean.getCollectionTime()))); [EOL]             } [EOL]         } [EOL]     } else { [EOL]         long collectionCount = 0; [EOL]         long collectionTime = 0; [EOL]         int collectorCount = gcBeans.size(); [EOL]         for (GarbageCollectorMXBean gcBean : gcBeans) { [EOL]             collectionCount += gcBean.getCollectionCount(); [EOL]             collectionTime += gcBean.getCollectionTime(); [EOL]         } [EOL]         if (pretty) { [EOL]             out.println("\nGarbage collection stats"); [EOL]             out.format("\tAggregate of %d collectors\n", collectorCount); [EOL]             out.format("\t\tcollection count   : %d\n", collectionCount); [EOL]             out.format("\t\tcollection time    : %d ms\n", collectionTime); [EOL]         } else { [EOL]             String name = normalizeName("aggregate"); [EOL]             out.println(normalizeTabularColonPos(String.format("gc-" + name + "-collection-count : %d", collectionCount))); [EOL]             out.println(normalizeTabularColonPos(String.format("gc-" + name + "-collection-time-ms : %d", collectionTime))); [EOL]         } [EOL]     } [EOL] } <line_num>: 202,249
private static String normalizeName(String name) { [EOL]     return name.replace(" ", "_").toLowerCase(); [EOL] } <line_num>: 251,253
private static String normalizeTabularColonPos(String string) { [EOL]     StringBuilder sb = new StringBuilder(string); [EOL]     int index = sb.indexOf(":"); [EOL]     for (; index < TABULAR_COLON_POS; ++index) { [EOL]         sb.insert(index, ' '); [EOL]     } [EOL]     return sb.toString(); [EOL] } <line_num>: 255,262
private static String formatBytes(long numBytes) { [EOL]     if (numBytes < ONE_KILO_BYTE) { [EOL]         return String.format("%d B", numBytes); [EOL]     } else if (numBytes < ONE_MEGA_BYTE) { [EOL]         return String.format("%d KB", numBytes / ONE_KILO_BYTE); [EOL]     } else if (numBytes < ONE_GIGA_BYTE) { [EOL]         return String.format("%d MB", numBytes / ONE_MEGA_BYTE); [EOL]     } else { [EOL]         return String.format("%d GB", numBytes / ONE_GIGA_BYTE); [EOL]     } [EOL] } <line_num>: 264,274
