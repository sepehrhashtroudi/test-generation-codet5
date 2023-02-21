public MidpointStepInterpolator() { [EOL] } <line_num>: 65,66
public MidpointStepInterpolator(final MidpointStepInterpolator interpolator) { [EOL]     super(interpolator); [EOL] } <line_num>: 73,75
@Override [EOL] protected StepInterpolator doCopy() { [EOL]     return new MidpointStepInterpolator(this); [EOL] } <line_num>: 78,81
@Override [EOL] protected void computeInterpolatedStateAndDerivatives(final double theta, final double oneMinusThetaH) { [EOL]     final double coeffDot2 = 2 * theta; [EOL]     final double coeffDot1 = 1 - coeffDot2; [EOL]     if ((previousState != null) && (theta <= 0.5)) { [EOL]         final double coeff1 = theta * oneMinusThetaH; [EOL]         final double coeff2 = theta * theta * h; [EOL]         for (int i = 0; i < interpolatedState.length; ++i) { [EOL]             final double yDot1 = yDotK[0][i]; [EOL]             final double yDot2 = yDotK[1][i]; [EOL]             interpolatedState[i] = previousState[i] + coeff1 * yDot1 + coeff2 * yDot2; [EOL]             interpolatedDerivatives[i] = coeffDot1 * yDot1 + coeffDot2 * yDot2; [EOL]         } [EOL]     } else { [EOL]         final double coeff1 = oneMinusThetaH * theta; [EOL]         final double coeff2 = oneMinusThetaH * (1.0 + theta); [EOL]         for (int i = 0; i < interpolatedState.length; ++i) { [EOL]             final double yDot1 = yDotK[0][i]; [EOL]             final double yDot2 = yDotK[1][i]; [EOL]             interpolatedState[i] = currentState[i] + coeff1 * yDot1 - coeff2 * yDot2; [EOL]             interpolatedDerivatives[i] = coeffDot1 * yDot1 + coeffDot2 * yDot2; [EOL]         } [EOL]     } [EOL] } <line_num>: 85,112
