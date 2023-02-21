public NumberTick(Number number, String label, TextAnchor textAnchor, TextAnchor rotationAnchor, double angle) { [EOL]     super(number.doubleValue(), label, textAnchor, rotationAnchor, angle); [EOL]     this.number = number; [EOL] } <line_num>: 65,72
public NumberTick(TickType tickType, double value, String label, TextAnchor textAnchor, TextAnchor rotationAnchor, double angle) { [EOL]     super(tickType, value, label, textAnchor, rotationAnchor, angle); [EOL]     this.number = new Double(value); [EOL] } <line_num>: 87,94
public Number getNumber() { [EOL]     return this.number; [EOL] } <line_num>: 101,103
