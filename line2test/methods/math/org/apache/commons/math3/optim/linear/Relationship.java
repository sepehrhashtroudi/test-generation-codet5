private Relationship(String stringValue) { [EOL]     this.stringValue = stringValue; [EOL] } <line_num>: 41,43
@Override [EOL] public String toString() { [EOL]     return stringValue; [EOL] } <line_num>: 45,48
public Relationship oppositeRelationship() { [EOL]     switch(this) { [EOL]         case LEQ: [EOL]             return GEQ; [EOL]         case GEQ: [EOL]             return LEQ; [EOL]         default: [EOL]             return EQ; [EOL]     } [EOL] } <line_num>: 55,64
