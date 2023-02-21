@Test [EOL] public void testInitialization() { [EOL]     LinearObjectiveFunction f = createFunction(); [EOL]     Collection<LinearConstraint> constraints = createConstraints(); [EOL]     SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0e-6); [EOL]     double[][] expectedInitialTableau = { { -1, 0, -1, -1, 2, 0, 0, 0, -4 }, { 0, 1, -15, -10, 25, 0, 0, 0, 0 }, { 0, 0, 1, 0, -1, 1, 0, 0, 2 }, { 0, 0, 0, 1, -1, 0, 1, 0, 3 }, { 0, 0, 1, 1, -2, 0, 0, 1, 4 } }; [EOL]     assertMatrixEquals(expectedInitialTableau, tableau.getData()); [EOL] } <line_num>: 30,44
@Test [EOL] public void testDropPhase1Objective() { [EOL]     LinearObjectiveFunction f = createFunction(); [EOL]     Collection<LinearConstraint> constraints = createConstraints(); [EOL]     SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0e-6); [EOL]     double[][] expectedTableau = { { 1, -15, -10, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0, 0, 2 }, { 0, 0, 1, 0, 1, 0, 3 }, { 0, 1, 1, 0, 0, 1, 4 } }; [EOL]     tableau.dropPhase1Objective(); [EOL]     assertMatrixEquals(expectedTableau, tableau.getData()); [EOL] } <line_num>: 46,60
@Test [EOL] public void testTableauWithNoArtificialVars() { [EOL]     LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 15, 10 }, 0); [EOL]     Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>(); [EOL]     constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2)); [EOL]     constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 3)); [EOL]     constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 4)); [EOL]     SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0e-6); [EOL]     double[][] initialTableau = { { 1, -15, -10, 25, 0, 0, 0, 0 }, { 0, 1, 0, -1, 1, 0, 0, 2 }, { 0, 0, 1, -1, 0, 1, 0, 3 }, { 0, 1, 1, -2, 0, 0, 1, 4 } }; [EOL]     assertMatrixEquals(initialTableau, tableau.getData()); [EOL] } <line_num>: 62,78
@Test [EOL] public void testSerial() { [EOL]     LinearObjectiveFunction f = createFunction(); [EOL]     Collection<LinearConstraint> constraints = createConstraints(); [EOL]     SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0e-6); [EOL]     Assert.assertEquals(tableau, TestUtils.serializeAndRecover(tableau)); [EOL] } <line_num>: 80,87
private LinearObjectiveFunction createFunction() { [EOL]     return new LinearObjectiveFunction(new double[] { 15, 10 }, 0); [EOL] } <line_num>: 89,91
private Collection<LinearConstraint> createConstraints() { [EOL]     Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>(); [EOL]     constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2)); [EOL]     constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 3)); [EOL]     constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 4)); [EOL]     return constraints; [EOL] } <line_num>: 93,99
private void assertMatrixEquals(double[][] expected, double[][] result) { [EOL]     Assert.assertEquals("Wrong number of rows.", expected.length, result.length); [EOL]     for (int i = 0; i < expected.length; i++) { [EOL]         Assert.assertEquals("Wrong number of columns.", expected[i].length, result[i].length); [EOL]         for (int j = 0; j < expected[i].length; j++) { [EOL]             Assert.assertEquals("Wrong value at position [" + i + "," + j + "]", expected[i][j], result[i][j], 1.0e-15); [EOL]         } [EOL]     } [EOL] } <line_num>: 101,109