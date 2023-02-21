@Test [EOL] public void derivativesConsistency() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException { [EOL]     TestProblem3 pb = new TestProblem3(0.9); [EOL]     double minStep = 0; [EOL]     double maxStep = pb.getFinalTime() - pb.getInitialTime(); [EOL]     double absTolerance = 1.0e-8; [EOL]     double relTolerance = 1.0e-8; [EOL]     GraggBulirschStoerIntegrator integ = new GraggBulirschStoerIntegrator(minStep, maxStep, absTolerance, relTolerance); [EOL]     StepInterpolatorTestUtils.checkDerivativesConsistency(integ, pb, 1.0e-8); [EOL] } <line_num>: 43,57
@Test [EOL] public void serialization() throws IOException, ClassNotFoundException, DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException { [EOL]     TestProblem3 pb = new TestProblem3(0.9); [EOL]     double minStep = 0; [EOL]     double maxStep = pb.getFinalTime() - pb.getInitialTime(); [EOL]     double absTolerance = 1.0e-8; [EOL]     double relTolerance = 1.0e-8; [EOL]     GraggBulirschStoerIntegrator integ = new GraggBulirschStoerIntegrator(minStep, maxStep, absTolerance, relTolerance); [EOL]     integ.addStepHandler(new ContinuousOutputModel()); [EOL]     integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(), pb.getFinalTime(), new double[pb.getDimension()]); [EOL]     ByteArrayOutputStream bos = new ByteArrayOutputStream(); [EOL]     ObjectOutputStream oos = new ObjectOutputStream(bos); [EOL]     for (StepHandler handler : integ.getStepHandlers()) { [EOL]         oos.writeObject(handler); [EOL]     } [EOL]     Assert.assertTrue(bos.size() > 35000); [EOL]     Assert.assertTrue(bos.size() < 36000); [EOL]     ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray()); [EOL]     ObjectInputStream ois = new ObjectInputStream(bis); [EOL]     ContinuousOutputModel cm = (ContinuousOutputModel) ois.readObject(); [EOL]     Random random = new Random(347588535632l); [EOL]     double maxError = 0.0; [EOL]     for (int i = 0; i < 1000; ++i) { [EOL]         double r = random.nextDouble(); [EOL]         double time = r * pb.getInitialTime() + (1.0 - r) * pb.getFinalTime(); [EOL]         cm.setInterpolatedTime(time); [EOL]         double[] interpolatedY = cm.getInterpolatedState(); [EOL]         double[] theoreticalY = pb.computeTheoreticalState(time); [EOL]         double dx = interpolatedY[0] - theoreticalY[0]; [EOL]         double dy = interpolatedY[1] - theoreticalY[1]; [EOL]         double error = dx * dx + dy * dy; [EOL]         if (error > maxError) { [EOL]             maxError = error; [EOL]         } [EOL]     } [EOL]     Assert.assertTrue(maxError < 5.0e-10); [EOL] } <line_num>: 59,110
public void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException { [EOL]     StepInterpolator cloned = interpolator.copy(); [EOL]     double tA = cloned.getPreviousTime(); [EOL]     double tB = cloned.getCurrentTime(); [EOL]     double halfStep = FastMath.abs(tB - tA) / 2; [EOL]     Assert.assertEquals(interpolator.getPreviousTime(), tA, 1.0e-12); [EOL]     Assert.assertEquals(interpolator.getCurrentTime(), tB, 1.0e-12); [EOL]     for (int i = 0; i < 10; ++i) { [EOL]         double t = (i * tB + (9 - i) * tA) / 9; [EOL]         interpolator.setInterpolatedTime(t); [EOL]         Assert.assertTrue(FastMath.abs(cloned.getInterpolatedTime() - t) > (halfStep / 10)); [EOL]         cloned.setInterpolatedTime(t); [EOL]         Assert.assertEquals(t, cloned.getInterpolatedTime(), 1.0e-12); [EOL]         double[] referenceState = interpolator.getInterpolatedState(); [EOL]         double[] cloneState = cloned.getInterpolatedState(); [EOL]         for (int j = 0; j < referenceState.length; ++j) { [EOL]             Assert.assertEquals(referenceState[j], cloneState[j], 1.0e-12); [EOL]         } [EOL]     } [EOL] } <line_num>: 125,145
public void init(double t0, double[] y0, double t) { [EOL] } <line_num>: 146,147
@Test [EOL] public void checklone() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException { [EOL]     TestProblem3 pb = new TestProblem3(0.9); [EOL]     double minStep = 0; [EOL]     double maxStep = pb.getFinalTime() - pb.getInitialTime(); [EOL]     double scalAbsoluteTolerance = 1.0e-8; [EOL]     double scalRelativeTolerance = scalAbsoluteTolerance; [EOL]     GraggBulirschStoerIntegrator integ = new GraggBulirschStoerIntegrator(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance); [EOL]     integ.addStepHandler(new StepHandler() { [EOL]  [EOL]         public void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException { [EOL]             StepInterpolator cloned = interpolator.copy(); [EOL]             double tA = cloned.getPreviousTime(); [EOL]             double tB = cloned.getCurrentTime(); [EOL]             double halfStep = FastMath.abs(tB - tA) / 2; [EOL]             Assert.assertEquals(interpolator.getPreviousTime(), tA, 1.0e-12); [EOL]             Assert.assertEquals(interpolator.getCurrentTime(), tB, 1.0e-12); [EOL]             for (int i = 0; i < 10; ++i) { [EOL]                 double t = (i * tB + (9 - i) * tA) / 9; [EOL]                 interpolator.setInterpolatedTime(t); [EOL]                 Assert.assertTrue(FastMath.abs(cloned.getInterpolatedTime() - t) > (halfStep / 10)); [EOL]                 cloned.setInterpolatedTime(t); [EOL]                 Assert.assertEquals(t, cloned.getInterpolatedTime(), 1.0e-12); [EOL]                 double[] referenceState = interpolator.getInterpolatedState(); [EOL]                 double[] cloneState = cloned.getInterpolatedState(); [EOL]                 for (int j = 0; j < referenceState.length; ++j) { [EOL]                     Assert.assertEquals(referenceState[j], cloneState[j], 1.0e-12); [EOL]                 } [EOL]             } [EOL]         } [EOL]  [EOL]         public void init(double t0, double[] y0, double t) { [EOL]         } [EOL]     }); [EOL]     integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(), pb.getFinalTime(), new double[pb.getDimension()]); [EOL] } <line_num>: 112,153
