public OHLCPackageTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 73,75
public static Test suite() { [EOL]     TestSuite suite = new TestSuite("org.jfree.data.time.ohlc"); [EOL]     suite.addTestSuite(OHLCItemTests.class); [EOL]     suite.addTestSuite(OHLCSeriesCollectionTests.class); [EOL]     suite.addTestSuite(OHLCSeriesTests.class); [EOL]     suite.addTestSuite(OHLCTests.class); [EOL]     return suite; [EOL] } <line_num>: 59,66
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 82,84
