public void setUp()
public void testOneRun()
public void testLoop1()
public void testLoop2()
public void testLoop3()
public void testNotInfiniteLoop()
public void testInfiniteLoop()
public void testCombined()
public void testSanityCheck()
public void testConsumption1()
public void testConsumption2()
public void testConsumption3()
public void testDuplicateLoop()
public void testPassOrdering()
 void setProgress(double p, String name)
public void testProgress()
public void assertPasses(String... names)
private void addOneTimePass(String name)
private void addLoopedPass(Loop loop, String name, int numChanges)
private PassFactory createPassFactory(String name, int numChanges, boolean isOneTime)
protected CompilerPass create(AbstractCompiler compiler)
private PassFactory createPassFactory(String name, final CompilerPass pass, boolean isOneTime)
public void process(Node externs, Node root)
private CompilerPass createPass(final String name, int numChanges)
List<String> passesRun=Optional[Lists.newArrayList()]
PhaseOptimizer optimizer
Compiler compiler
PerformanceTracker tracker
