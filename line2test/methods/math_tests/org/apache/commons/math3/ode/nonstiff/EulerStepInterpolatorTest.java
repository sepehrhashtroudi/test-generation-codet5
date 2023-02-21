protected DummyIntegrator(RungeKuttaStepInterpolator prototype) { [EOL]     super("dummy", new double[0], new double[0][0], new double[0], prototype, Double.NaN); [EOL] } <line_num>: 188,190
@Test [EOL] public void noReset() throws MaxCountExceededException { [EOL]     double[] y = { 0.0, 1.0, -2.0 }; [EOL]     double[][] yDot = { { 1.0, 2.0, -2.0 } }; [EOL]     EulerStepInterpolator interpolator = new EulerStepInterpolator(); [EOL]     interpolator.reinitialize(new DummyIntegrator(interpolator), y, yDot, true, new EquationsMapper(0, y.length), new EquationsMapper[0]); [EOL]     interpolator.storeTime(0); [EOL]     interpolator.shift(); [EOL]     interpolator.storeTime(1); [EOL]     double[] result = interpolator.getInterpolatedState(); [EOL]     for (int i = 0; i < result.length; ++i) { [EOL]         Assert.assertTrue(FastMath.abs(result[i] - y[i]) < 1.0e-10); [EOL]     } [EOL] } <line_num>: 44,62
@Test [EOL] public void interpolationAtBounds() throws MaxCountExceededException { [EOL]     double t0 = 0; [EOL]     double[] y0 = { 0.0, 1.0, -2.0 }; [EOL]     double[] y = y0.clone(); [EOL]     double[][] yDot = { new double[y0.length] }; [EOL]     EulerStepInterpolator interpolator = new EulerStepInterpolator(); [EOL]     interpolator.reinitialize(new DummyIntegrator(interpolator), y, yDot, true, new EquationsMapper(0, y.length), new EquationsMapper[0]); [EOL]     interpolator.storeTime(t0); [EOL]     double dt = 1.0; [EOL]     interpolator.shift(); [EOL]     y[0] = 1.0; [EOL]     y[1] = 3.0; [EOL]     y[2] = -4.0; [EOL]     yDot[0][0] = (y[0] - y0[0]) / dt; [EOL]     yDot[0][1] = (y[1] - y0[1]) / dt; [EOL]     yDot[0][2] = (y[2] - y0[2]) / dt; [EOL]     interpolator.storeTime(t0 + dt); [EOL]     interpolator.setInterpolatedTime(interpolator.getPreviousTime()); [EOL]     double[] result = interpolator.getInterpolatedState(); [EOL]     for (int i = 0; i < result.length; ++i) { [EOL]         Assert.assertTrue(FastMath.abs(result[i] - y0[i]) < 1.0e-10); [EOL]     } [EOL]     interpolator.setInterpolatedTime(interpolator.getCurrentTime()); [EOL]     result = interpolator.getInterpolatedState(); [EOL]     for (int i = 0; i < result.length; ++i) { [EOL]         Assert.assertTrue(FastMath.abs(result[i] - y[i]) < 1.0e-10); [EOL]     } [EOL] } <line_num>: 64,100
@Test [EOL] public void interpolationInside() throws MaxCountExceededException { [EOL]     double[] y = { 0.0, 1.0, -2.0 }; [EOL]     double[][] yDot = { { 1.0, 2.0, -2.0 } }; [EOL]     EulerStepInterpolator interpolator = new EulerStepInterpolator(); [EOL]     interpolator.reinitialize(new DummyIntegrator(interpolator), y, yDot, true, new EquationsMapper(0, y.length), new EquationsMapper[0]); [EOL]     interpolator.storeTime(0); [EOL]     interpolator.shift(); [EOL]     y[0] = 1.0; [EOL]     y[1] = 3.0; [EOL]     y[2] = -4.0; [EOL]     interpolator.storeTime(1); [EOL]     interpolator.setInterpolatedTime(0.1); [EOL]     double[] result = interpolator.getInterpolatedState(); [EOL]     Assert.assertTrue(FastMath.abs(result[0] - 0.1) < 1.0e-10); [EOL]     Assert.assertTrue(FastMath.abs(result[1] - 1.2) < 1.0e-10); [EOL]     Assert.assertTrue(FastMath.abs(result[2] + 2.2) < 1.0e-10); [EOL]     interpolator.setInterpolatedTime(0.5); [EOL]     result = interpolator.getInterpolatedState(); [EOL]     Assert.assertTrue(FastMath.abs(result[0] - 0.5) < 1.0e-10); [EOL]     Assert.assertTrue(FastMath.abs(result[1] - 2.0) < 1.0e-10); [EOL]     Assert.assertTrue(FastMath.abs(result[2] + 3.0) < 1.0e-10); [EOL] } <line_num>: 102,130
@Test [EOL] public void derivativesConsistency() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException { [EOL]     TestProblem3 pb = new TestProblem3(); [EOL]     double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.001; [EOL]     EulerIntegrator integ = new EulerIntegrator(step); [EOL]     StepInterpolatorTestUtils.checkDerivativesConsistency(integ, pb, 1.0e-10); [EOL] } <line_num>: 132,140
@Test [EOL] public void serialization() throws IOException, ClassNotFoundException, DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException { [EOL]     TestProblem1 pb = new TestProblem1(); [EOL]     double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.001; [EOL]     EulerIntegrator integ = new EulerIntegrator(step); [EOL]     integ.addStepHandler(new ContinuousOutputModel()); [EOL]     integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(), pb.getFinalTime(), new double[pb.getDimension()]); [EOL]     ByteArrayOutputStream bos = new ByteArrayOutputStream(); [EOL]     ObjectOutputStream oos = new ObjectOutputStream(bos); [EOL]     for (StepHandler handler : integ.getStepHandlers()) { [EOL]         oos.writeObject(handler); [EOL]     } [EOL]     ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray()); [EOL]     ObjectInputStream ois = new ObjectInputStream(bis); [EOL]     ContinuousOutputModel cm = (ContinuousOutputModel) ois.readObject(); [EOL]     Random random = new Random(347588535632l); [EOL]     double maxError = 0.0; [EOL]     for (int i = 0; i < 1000; ++i) { [EOL]         double r = random.nextDouble(); [EOL]         double time = r * pb.getInitialTime() + (1.0 - r) * pb.getFinalTime(); [EOL]         cm.setInterpolatedTime(time); [EOL]         double[] interpolatedY = cm.getInterpolatedState(); [EOL]         double[] theoreticalY = pb.computeTheoreticalState(time); [EOL]         double dx = interpolatedY[0] - theoreticalY[0]; [EOL]         double dy = interpolatedY[1] - theoreticalY[1]; [EOL]         double error = dx * dx + dy * dy; [EOL]         if (error > maxError) { [EOL]             maxError = error; [EOL]         } [EOL]     } [EOL]     Assert.assertTrue(maxError < 0.001); [EOL] } <line_num>: 142,183
