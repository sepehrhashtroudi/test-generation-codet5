public ThreeEighthesStepInterpolator() { [EOL] } <line_num>: 75,76
public ThreeEighthesStepInterpolator(final ThreeEighthesStepInterpolator interpolator) { [EOL]     super(interpolator); [EOL] } <line_num>: 83,85
@Override [EOL] protected StepInterpolator doCopy() { [EOL]     return new ThreeEighthesStepInterpolator(this); [EOL] } <line_num>: 88,91
@Override [EOL] protected void computeInterpolatedStateAndDerivatives(final double theta, final double oneMinusThetaH) { [EOL]     final double coeffDot3 = 0.75 * theta; [EOL]     final double coeffDot1 = coeffDot3 * (4 * theta - 5) + 1; [EOL]     final double coeffDot2 = coeffDot3 * (5 - 6 * theta); [EOL]     final double coeffDot4 = coeffDot3 * (2 * theta - 1); [EOL]     if ((previousState != null) && (theta <= 0.5)) { [EOL]         final double s = theta * h / 8.0; [EOL]         final double fourTheta2 = 4 * theta * theta; [EOL]         final double coeff1 = s * (8 - 15 * theta + 2 * fourTheta2); [EOL]         final double coeff2 = 3 * s * (5 * theta - fourTheta2); [EOL]         final double coeff3 = 3 * s * theta; [EOL]         final double coeff4 = s * (-3 * theta + fourTheta2); [EOL]         for (int i = 0; i < interpolatedState.length; ++i) { [EOL]             final double yDot1 = yDotK[0][i]; [EOL]             final double yDot2 = yDotK[1][i]; [EOL]             final double yDot3 = yDotK[2][i]; [EOL]             final double yDot4 = yDotK[3][i]; [EOL]             interpolatedState[i] = previousState[i] + coeff1 * yDot1 + coeff2 * yDot2 + coeff3 * yDot3 + coeff4 * yDot4; [EOL]             interpolatedDerivatives[i] = coeffDot1 * yDot1 + coeffDot2 * yDot2 + coeffDot3 * yDot3 + coeffDot4 * yDot4; [EOL]         } [EOL]     } else { [EOL]         final double s = oneMinusThetaH / 8.0; [EOL]         final double fourTheta2 = 4 * theta * theta; [EOL]         final double coeff1 = s * (1 - 7 * theta + 2 * fourTheta2); [EOL]         final double coeff2 = 3 * s * (1 + theta - fourTheta2); [EOL]         final double coeff3 = 3 * s * (1 + theta); [EOL]         final double coeff4 = s * (1 + theta + fourTheta2); [EOL]         for (int i = 0; i < interpolatedState.length; ++i) { [EOL]             final double yDot1 = yDotK[0][i]; [EOL]             final double yDot2 = yDotK[1][i]; [EOL]             final double yDot3 = yDotK[2][i]; [EOL]             final double yDot4 = yDotK[3][i]; [EOL]             interpolatedState[i] = currentState[i] - coeff1 * yDot1 - coeff2 * yDot2 - coeff3 * yDot3 - coeff4 * yDot4; [EOL]             interpolatedDerivatives[i] = coeffDot1 * yDot1 + coeffDot2 * yDot2 + coeffDot3 * yDot3 + coeffDot4 * yDot4; [EOL]         } [EOL]     } [EOL] } <line_num>: 95,142
