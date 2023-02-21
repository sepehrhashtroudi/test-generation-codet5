public Day() { [EOL]     this(new Date()); [EOL] } <line_num>: 112,114
public Day(int day, int month, int year) { [EOL]     this.serialDate = SerialDate.createInstance(day, month, year); [EOL]     peg(Calendar.getInstance()); [EOL] } <line_num>: 123,126
public Day(SerialDate serialDate) { [EOL]     if (serialDate == null) { [EOL]         throw new IllegalArgumentException("Null 'serialDate' argument."); [EOL]     } [EOL]     this.serialDate = serialDate; [EOL]     peg(Calendar.getInstance()); [EOL] } <line_num>: 133,139
public Day(Date time) { [EOL]     this(time, TimeZone.getDefault()); [EOL] } <line_num>: 149,152
public Day(Date time, TimeZone zone) { [EOL]     if (time == null) { [EOL]         throw new IllegalArgumentException("Null 'time' argument."); [EOL]     } [EOL]     if (zone == null) { [EOL]         throw new IllegalArgumentException("Null 'zone' argument."); [EOL]     } [EOL]     Calendar calendar = Calendar.getInstance(zone); [EOL]     calendar.setTime(time); [EOL]     int d = calendar.get(Calendar.DAY_OF_MONTH); [EOL]     int m = calendar.get(Calendar.MONTH) + 1; [EOL]     int y = calendar.get(Calendar.YEAR); [EOL]     this.serialDate = SerialDate.createInstance(d, m, y); [EOL]     peg(calendar); [EOL] } <line_num>: 160,175
public SerialDate getSerialDate() { [EOL]     return this.serialDate; [EOL] } <line_num>: 186,188
public int getYear() { [EOL]     return this.serialDate.getYYYY(); [EOL] } <line_num>: 195,197
public int getMonth() { [EOL]     return this.serialDate.getMonth(); [EOL] } <line_num>: 204,206
public int getDayOfMonth() { [EOL]     return this.serialDate.getDayOfMonth(); [EOL] } <line_num>: 213,215
public long getFirstMillisecond() { [EOL]     return this.firstMillisecond; [EOL] } <line_num>: 227,229
public long getLastMillisecond() { [EOL]     return this.lastMillisecond; [EOL] } <line_num>: 241,243
public void peg(Calendar calendar) { [EOL]     this.firstMillisecond = getFirstMillisecond(calendar); [EOL]     this.lastMillisecond = getLastMillisecond(calendar); [EOL] } <line_num>: 253,256
public RegularTimePeriod previous() { [EOL]     Day result; [EOL]     int serial = this.serialDate.toSerial(); [EOL]     if (serial > SerialDate.SERIAL_LOWER_BOUND) { [EOL]         SerialDate yesterday = SerialDate.createInstance(serial - 1); [EOL]         return new Day(yesterday); [EOL]     } else { [EOL]         result = null; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 263,276
public RegularTimePeriod next() { [EOL]     Day result; [EOL]     int serial = this.serialDate.toSerial(); [EOL]     if (serial < SerialDate.SERIAL_UPPER_BOUND) { [EOL]         SerialDate tomorrow = SerialDate.createInstance(serial + 1); [EOL]         return new Day(tomorrow); [EOL]     } else { [EOL]         result = null; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 285,298
public long getSerialIndex() { [EOL]     return this.serialDate.toSerial(); [EOL] } <line_num>: 305,307
public long getFirstMillisecond(Calendar calendar) { [EOL]     int year = this.serialDate.getYYYY(); [EOL]     int month = this.serialDate.getMonth(); [EOL]     int day = this.serialDate.getDayOfMonth(); [EOL]     calendar.clear(); [EOL]     calendar.set(year, month - 1, day, 0, 0, 0); [EOL]     calendar.set(Calendar.MILLISECOND, 0); [EOL]     return calendar.getTime().getTime(); [EOL] } <line_num>: 320,329
public long getLastMillisecond(Calendar calendar) { [EOL]     int year = this.serialDate.getYYYY(); [EOL]     int month = this.serialDate.getMonth(); [EOL]     int day = this.serialDate.getDayOfMonth(); [EOL]     calendar.clear(); [EOL]     calendar.set(year, month - 1, day, 23, 59, 59); [EOL]     calendar.set(Calendar.MILLISECOND, 999); [EOL]     return calendar.getTime().getTime(); [EOL] } <line_num>: 342,351
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof Day)) { [EOL]         return false; [EOL]     } [EOL]     Day that = (Day) obj; [EOL]     if (!this.serialDate.equals(that.getSerialDate())) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 363,377
public int hashCode() { [EOL]     return this.serialDate.hashCode(); [EOL] } <line_num>: 388,390
public int compareTo(Object o1) { [EOL]     int result; [EOL]     if (o1 instanceof Day) { [EOL]         Day d = (Day) o1; [EOL]         result = -d.getSerialDate().compare(this.serialDate); [EOL]     } else if (o1 instanceof RegularTimePeriod) { [EOL]         result = 0; [EOL]     } else { [EOL]         result = 1; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 402,429
public String toString() { [EOL]     return this.serialDate.toString(); [EOL] } <line_num>: 436,438
public static Day parseDay(String s) { [EOL]     try { [EOL]         return new Day(Day.DATE_FORMAT.parse(s)); [EOL]     } catch (ParseException e1) { [EOL]         try { [EOL]             return new Day(Day.DATE_FORMAT_SHORT.parse(s)); [EOL]         } catch (ParseException e2) { [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 451,466