protected BaseMultivariateMultiStartOptimizer(final BaseMultivariateOptimizer<FUNC> optimizer, final int starts, final RandomVectorGenerator generator) { [EOL]     if (optimizer == null || generator == null) { [EOL]         throw new NullArgumentException(); [EOL]     } [EOL]     if (starts < 1) { [EOL]         throw new NotStrictlyPositiveException(starts); [EOL]     } [EOL]     this.optimizer = optimizer; [EOL]     this.starts = starts; [EOL]     this.generator = generator; [EOL] } <line_num>: 72,86
public PointValuePair[] getOptima() { [EOL]     if (optima == null) { [EOL]         throw new MathIllegalStateException(LocalizedFormats.NO_OPTIMUM_COMPUTED_YET); [EOL]     } [EOL]     return optima.clone(); [EOL] } <line_num>: 114,119
public int getMaxEvaluations() { [EOL]     return maxEvaluations; [EOL] } <line_num>: 122,124
public int getEvaluations() { [EOL]     return totalEvaluations; [EOL] } <line_num>: 127,129
public ConvergenceChecker<PointValuePair> getConvergenceChecker() { [EOL]     return optimizer.getConvergenceChecker(); [EOL] } <line_num>: 132,134
public PointValuePair optimize(int maxEval, final FUNC f, final GoalType goal, double[] startPoint) { [EOL]     maxEvaluations = maxEval; [EOL]     RuntimeException lastException = null; [EOL]     optima = new PointValuePair[starts]; [EOL]     totalEvaluations = 0; [EOL]     for (int i = 0; i < starts; ++i) { [EOL]         try { [EOL]             optima[i] = optimizer.optimize(maxEval - totalEvaluations, f, goal, i == 0 ? startPoint : generator.nextVector()); [EOL]         } catch (RuntimeException mue) { [EOL]             lastException = mue; [EOL]             optima[i] = null; [EOL]         } [EOL]         totalEvaluations += optimizer.getEvaluations(); [EOL]     } [EOL]     sortPairs(goal); [EOL]     if (optima[0] == null) { [EOL]         throw lastException; [EOL]     } [EOL]     return optima[0]; [EOL] } <line_num>: 139,170
public int compare(final PointValuePair o1, final PointValuePair o2) { [EOL]     if (o1 == null) { [EOL]         return (o2 == null) ? 0 : 1; [EOL]     } else if (o2 == null) { [EOL]         return -1; [EOL]     } [EOL]     final double v1 = o1.getValue(); [EOL]     final double v2 = o2.getValue(); [EOL]     return (goal == GoalType.MINIMIZE) ? Double.compare(v1, v2) : Double.compare(v2, v1); [EOL] } <line_num>: 179,190
private void sortPairs(final GoalType goal) { [EOL]     Arrays.sort(optima, new Comparator<PointValuePair>() { [EOL]  [EOL]         public int compare(final PointValuePair o1, final PointValuePair o2) { [EOL]             if (o1 == null) { [EOL]                 return (o2 == null) ? 0 : 1; [EOL]             } else if (o2 == null) { [EOL]                 return -1; [EOL]             } [EOL]             final double v1 = o1.getValue(); [EOL]             final double v2 = o2.getValue(); [EOL]             return (goal == GoalType.MINIMIZE) ? Double.compare(v1, v2) : Double.compare(v2, v1); [EOL]         } [EOL]     }); [EOL] } <line_num>: 177,192
