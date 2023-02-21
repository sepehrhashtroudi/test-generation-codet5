public DataGanttPackageTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 78,80
public static Test suite() { [EOL]     TestSuite suite = new TestSuite("org.jfree.data.gantt"); [EOL]     suite.addTestSuite(SlidingGanttCategoryDatasetTests.class); [EOL]     suite.addTestSuite(TaskTests.class); [EOL]     suite.addTestSuite(TaskSeriesTests.class); [EOL]     suite.addTestSuite(TaskSeriesCollectionTests.class); [EOL]     suite.addTestSuite(XYTaskDatasetTests.class); [EOL]     return suite; [EOL] } <line_num>: 63,71
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 87,89
