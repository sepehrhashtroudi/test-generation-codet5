private TimePeriodAnchor(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 76,78
public String toString() { [EOL]     return this.name; [EOL] } <line_num>: 85,87
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof TimePeriodAnchor)) { [EOL]         return false; [EOL]     } [EOL]     TimePeriodAnchor position = (TimePeriodAnchor) obj; [EOL]     if (!this.name.equals(position.name)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 97,112
public int hashCode() { [EOL]     return this.name.hashCode(); [EOL] } <line_num>: 119,121
private Object readResolve() throws ObjectStreamException { [EOL]     if (this.equals(TimePeriodAnchor.START)) { [EOL]         return TimePeriodAnchor.START; [EOL]     } else if (this.equals(TimePeriodAnchor.MIDDLE)) { [EOL]         return TimePeriodAnchor.MIDDLE; [EOL]     } else if (this.equals(TimePeriodAnchor.END)) { [EOL]         return TimePeriodAnchor.END; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 130,141