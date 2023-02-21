@Test [EOL] public void testParametersErrorMonteCarloObservations() { [EOL]     final double yError = 15; [EOL]     final double slope = 123.456; [EOL]     final double offset = -98.765; [EOL]     final RandomStraightLinePointGenerator lineGenerator = new RandomStraightLinePointGenerator(slope, offset, yError, -1e3, 1e4, 138577L); [EOL]     final int numObs = 100; [EOL]     final int numParams = 2; [EOL]     final SummaryStatistics[] paramsFoundByDirectSolution = new SummaryStatistics[numParams]; [EOL]     final SummaryStatistics[] sigmaEstimate = new SummaryStatistics[numParams]; [EOL]     for (int i = 0; i < numParams; i++) { [EOL]         paramsFoundByDirectSolution[i] = new SummaryStatistics(); [EOL]         sigmaEstimate[i] = new SummaryStatistics(); [EOL]     } [EOL]     final double[] init = { slope, offset }; [EOL]     final int mcRepeat = MONTE_CARLO_RUNS; [EOL]     int mcCount = 0; [EOL]     while (mcCount < mcRepeat) { [EOL]         final Point2D.Double[] obs = lineGenerator.generate(numObs); [EOL]         final StraightLineProblem problem = new StraightLineProblem(yError); [EOL]         for (int i = 0; i < numObs; i++) { [EOL]             final Point2D.Double p = obs[i]; [EOL]             problem.addPoint(p.x, p.y); [EOL]         } [EOL]         final double[] regress = problem.solve(); [EOL]         final AbstractLeastSquaresOptimizer optim = LevenbergMarquardtOptimizer.create().withModelAndJacobian(problem.getModelFunction(), problem.getModelFunctionJacobian()).withTarget(problem.target()).withWeight(new DiagonalMatrix(problem.weight())); [EOL]         final double[] sigma = optim.computeSigma(init, 1e-14); [EOL]         for (int i = 0; i < numParams; i++) { [EOL]             paramsFoundByDirectSolution[i].addValue(regress[i]); [EOL]             sigmaEstimate[i].addValue(sigma[i]); [EOL]         } [EOL]         ++mcCount; [EOL]     } [EOL]     final String line = "--------------------------------------------------------------"; [EOL]     System.out.println("                 True value       Mean        Std deviation"); [EOL]     for (int i = 0; i < numParams; i++) { [EOL]         System.out.println(line); [EOL]         System.out.println("Parameter #" + i); [EOL]         StatisticalSummary s = paramsFoundByDirectSolution[i].getSummary(); [EOL]         System.out.printf("              %+.6e   %+.6e   %+.6e\n", init[i], s.getMean(), s.getStandardDeviation()); [EOL]         s = sigmaEstimate[i].getSummary(); [EOL]         System.out.printf("sigma: %+.6e (%+.6e)\n", s.getMean(), s.getStandardDeviation()); [EOL]     } [EOL]     System.out.println(line); [EOL]     for (int i = 0; i < numParams; i++) { [EOL]         Assert.assertEquals(paramsFoundByDirectSolution[i].getSummary().getStandardDeviation(), sigmaEstimate[i].getSummary().getMean(), 8e-2); [EOL]     } [EOL] } <line_num>: 65,163
@Test [EOL] public void testParametersErrorMonteCarloParameters() { [EOL]     final double yError = 15; [EOL]     final double slope = 123.456; [EOL]     final double offset = -98.765; [EOL]     final RandomStraightLinePointGenerator lineGenerator = new RandomStraightLinePointGenerator(slope, offset, yError, -1e3, 1e4, 13839013L); [EOL]     final int numObs = 10; [EOL]     final int numParams = 2; [EOL]     final Point2D.Double[] obs = lineGenerator.generate(numObs); [EOL]     final StraightLineProblem problem = new StraightLineProblem(yError); [EOL]     for (int i = 0; i < numObs; i++) { [EOL]         final Point2D.Double p = obs[i]; [EOL]         problem.addPoint(p.x, p.y); [EOL]     } [EOL]     final double[] regress = problem.solve(); [EOL]     final AbstractLeastSquaresOptimizer optim = LevenbergMarquardtOptimizer.create().withModelAndJacobian(problem.getModelFunction(), problem.getModelFunctionJacobian()).withTarget(problem.target()).withWeight(new DiagonalMatrix(problem.weight())); [EOL]     final double[] init = { slope, offset }; [EOL]     final double bestChi2N = getChi2N(optim, problem, regress); [EOL]     final double[] sigma = optim.computeSigma(regress, 1e-14); [EOL]     final int mcRepeat = MONTE_CARLO_RUNS; [EOL]     final int gridSize = (int) FastMath.sqrt(mcRepeat); [EOL]     final List<double[]> paramsAndChi2 = new ArrayList<double[]>(gridSize * gridSize); [EOL]     final double slopeRange = 10 * sigma[0]; [EOL]     final double offsetRange = 10 * sigma[1]; [EOL]     final double minSlope = slope - 0.5 * slopeRange; [EOL]     final double minOffset = offset - 0.5 * offsetRange; [EOL]     final double deltaSlope = slopeRange / gridSize; [EOL]     final double deltaOffset = offsetRange / gridSize; [EOL]     for (int i = 0; i < gridSize; i++) { [EOL]         final double s = minSlope + i * deltaSlope; [EOL]         for (int j = 0; j < gridSize; j++) { [EOL]             final double o = minOffset + j * deltaOffset; [EOL]             final double chi2N = getChi2N(optim, problem, new double[] { s, o }); [EOL]             paramsAndChi2.add(new double[] { s, o, chi2N }); [EOL]         } [EOL]     } [EOL]     final double chi2NPlusOne = bestChi2N + 1; [EOL]     int numLarger = 0; [EOL]     final String lineFmt = "%+.10e %+.10e   %.8e\n"; [EOL]     System.out.printf(lineFmt, regress[0], regress[1], bestChi2N); [EOL]     System.out.println(); [EOL]     for (double[] d : paramsAndChi2) { [EOL]         if (d[2] <= chi2NPlusOne) { [EOL]             System.out.printf(lineFmt, d[0], d[1], d[2]); [EOL]         } [EOL]     } [EOL]     System.out.println(); [EOL]     for (double[] d : paramsAndChi2) { [EOL]         if (d[2] > chi2NPlusOne) { [EOL]             ++numLarger; [EOL]             System.out.printf(lineFmt, d[0], d[1], d[2]); [EOL]         } [EOL]     } [EOL]     System.out.println(); [EOL]     System.out.println("# sigma=" + Arrays.toString(sigma)); [EOL]     System.out.println("# " + numLarger + " sets filtered out"); [EOL] } <line_num>: 189,294
private double getChi2N(AbstractLeastSquaresOptimizer optim, StraightLineProblem problem, double[] params) { [EOL]     final double[] t = problem.target(); [EOL]     final double[] w = problem.weight(); [EOL]     final double cost = optim.computeCost(optim.computeResiduals(optim.getModel().value(params))); [EOL]     return cost * cost / (t.length - params.length); [EOL] } <line_num>: 299,306