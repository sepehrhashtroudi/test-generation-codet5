protected abstract UnivariateSolver getSolver(); <line_num>: 39,39
protected abstract int[] getQuinticEvalCounts(); <line_num>: 47,47
@Test [EOL] public void testSinZero() { [EOL]     UnivariateFunction f = new Sin(); [EOL]     double result; [EOL]     UnivariateSolver solver = getSolver(); [EOL]     result = solver.solve(100, f, 3, 4); [EOL]     Assert.assertEquals(result, FastMath.PI, solver.getAbsoluteAccuracy()); [EOL]     Assert.assertTrue(solver.getEvaluations() <= 6); [EOL]     result = solver.solve(100, f, 1, 4); [EOL]     Assert.assertEquals(result, FastMath.PI, solver.getAbsoluteAccuracy()); [EOL]     Assert.assertTrue(solver.getEvaluations() <= 7); [EOL] } <line_num>: 49,68
@Test [EOL] public void testQuinticZero() { [EOL]     UnivariateFunction f = new QuinticFunction(); [EOL]     double result; [EOL]     UnivariateSolver solver = getSolver(); [EOL]     double atol = solver.getAbsoluteAccuracy(); [EOL]     int[] counts = getQuinticEvalCounts(); [EOL]     double[][] testsData = { { -0.2, 0.2, 0.0 }, { -0.1, 0.3, 0.0 }, { -0.3, 0.45, 0.0 }, { 0.3, 0.7, 0.5 }, { 0.2, 0.6, 0.5 }, { 0.05, 0.95, 0.5 }, { 0.85, 1.25, 1.0 }, { 0.8, 1.2, 1.0 }, { 0.85, 1.75, 1.0 }, { 0.55, 1.45, 1.0 }, { 0.85, 5.0, 1.0 } }; [EOL]     int maxIter = 500; [EOL]     for (int i = 0; i < testsData.length; i++) { [EOL]         if (counts[i] == -1) [EOL]             continue; [EOL]         double[] testData = testsData[i]; [EOL]         result = solver.solve(maxIter, f, testData[0], testData[1]); [EOL]         Assert.assertEquals(result, testData[2], atol); [EOL]         Assert.assertTrue(solver.getEvaluations() <= counts[i] + 1); [EOL]     } [EOL] } <line_num>: 70,115
@Test [EOL] public void testRootEndpoints() { [EOL]     UnivariateFunction f = new XMinus5Function(); [EOL]     UnivariateSolver solver = getSolver(); [EOL]     double result = solver.solve(100, f, 5.0, 6.0); [EOL]     Assert.assertEquals(5.0, result, 0.0); [EOL]     result = solver.solve(100, f, 4.0, 5.0); [EOL]     Assert.assertEquals(5.0, result, 0.0); [EOL]     result = solver.solve(100, f, 5.0, 6.0, 5.5); [EOL]     Assert.assertEquals(5.0, result, 0.0); [EOL]     result = solver.solve(100, f, 4.0, 5.0, 4.5); [EOL]     Assert.assertEquals(5.0, result, 0.0); [EOL] } <line_num>: 117,135
@Test [EOL] public void testBadEndpoints() { [EOL]     UnivariateFunction f = new Sin(); [EOL]     UnivariateSolver solver = getSolver(); [EOL]     try { [EOL]         solver.solve(100, f, 1, -1); [EOL]         Assert.fail("Expecting NumberIsTooLargeException - bad interval"); [EOL]     } catch (NumberIsTooLargeException ex) { [EOL]     } [EOL]     try { [EOL]         solver.solve(100, f, 1, 1.5); [EOL]         Assert.fail("Expecting NoBracketingException - non-bracketing"); [EOL]     } catch (NoBracketingException ex) { [EOL]     } [EOL]     try { [EOL]         solver.solve(100, f, 1, 1.5, 1.2); [EOL]         Assert.fail("Expecting NoBracketingException - non-bracketing"); [EOL]     } catch (NoBracketingException ex) { [EOL]     } [EOL] } <line_num>: 137,159
@Test [EOL] public void testSolutionLeftSide() { [EOL]     UnivariateFunction f = new Sin(); [EOL]     UnivariateSolver solver = getSolver(); [EOL]     double left = -1.5; [EOL]     double right = 0.05; [EOL]     for (int i = 0; i < 10; i++) { [EOL]         double solution = getSolution(solver, 100, f, left, right, AllowedSolution.LEFT_SIDE); [EOL]         if (!Double.isNaN(solution)) { [EOL]             Assert.assertTrue(solution <= 0.0); [EOL]         } [EOL]         left -= 0.1; [EOL]         right += 0.3; [EOL]     } [EOL] } <line_num>: 161,178
@Test [EOL] public void testSolutionRightSide() { [EOL]     UnivariateFunction f = new Sin(); [EOL]     UnivariateSolver solver = getSolver(); [EOL]     double left = -1.5; [EOL]     double right = 0.05; [EOL]     for (int i = 0; i < 10; i++) { [EOL]         double solution = getSolution(solver, 100, f, left, right, AllowedSolution.RIGHT_SIDE); [EOL]         if (!Double.isNaN(solution)) { [EOL]             Assert.assertTrue(solution >= 0.0); [EOL]         } [EOL]         left -= 0.1; [EOL]         right += 0.3; [EOL]     } [EOL] } <line_num>: 180,197
@Test [EOL] public void testSolutionBelowSide() { [EOL]     UnivariateFunction f = new Sin(); [EOL]     UnivariateSolver solver = getSolver(); [EOL]     double left = -1.5; [EOL]     double right = 0.05; [EOL]     for (int i = 0; i < 10; i++) { [EOL]         double solution = getSolution(solver, 100, f, left, right, AllowedSolution.BELOW_SIDE); [EOL]         if (!Double.isNaN(solution)) { [EOL]             Assert.assertTrue(f.value(solution) <= 0.0); [EOL]         } [EOL]         left -= 0.1; [EOL]         right += 0.3; [EOL]     } [EOL] } <line_num>: 198,215
@Test [EOL] public void testSolutionAboveSide() { [EOL]     UnivariateFunction f = new Sin(); [EOL]     UnivariateSolver solver = getSolver(); [EOL]     double left = -1.5; [EOL]     double right = 0.05; [EOL]     for (int i = 0; i < 10; i++) { [EOL]         double solution = getSolution(solver, 100, f, left, right, AllowedSolution.ABOVE_SIDE); [EOL]         if (!Double.isNaN(solution)) { [EOL]             Assert.assertTrue(f.value(solution) >= 0.0); [EOL]         } [EOL]         left -= 0.1; [EOL]         right += 0.3; [EOL]     } [EOL] } <line_num>: 217,234
private double getSolution(UnivariateSolver solver, int maxEval, UnivariateFunction f, double left, double right, AllowedSolution allowedSolution) { [EOL]     try { [EOL]         @SuppressWarnings("unchecked") [EOL]         BracketedUnivariateSolver<UnivariateFunction> bracketing = (BracketedUnivariateSolver<UnivariateFunction>) solver; [EOL]         return bracketing.solve(100, f, left, right, allowedSolution); [EOL]     } catch (ClassCastException cce) { [EOL]         double baseRoot = solver.solve(maxEval, f, left, right); [EOL]         if ((baseRoot <= left) || (baseRoot >= right)) { [EOL]             return Double.NaN; [EOL]         } [EOL]         PegasusSolver bracketing = new PegasusSolver(solver.getRelativeAccuracy(), solver.getAbsoluteAccuracy(), solver.getFunctionValueAccuracy()); [EOL]         return UnivariateSolverUtils.forceSide(maxEval - solver.getEvaluations(), f, bracketing, baseRoot, left, right, allowedSolution); [EOL]     } [EOL] } <line_num>: 236,256
