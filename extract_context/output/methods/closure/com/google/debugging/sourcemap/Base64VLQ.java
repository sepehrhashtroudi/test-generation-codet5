private Base64VLQ() { [EOL] } <line_num>: 45,45
private static int toVLQSigned(int value) { [EOL]     if (value < 0) { [EOL]         return ((-value) << 1) + 1; [EOL]     } else { [EOL]         return (value << 1) + 0; [EOL]     } [EOL] } <line_num>: 63,69
private static int fromVLQSigned(int value) { [EOL]     boolean negate = (value & 1) == 1; [EOL]     value = value >> 1; [EOL]     return negate ? -value : value; [EOL] } <line_num>: 77,81
public static void encode(Appendable out, int value) throws IOException { [EOL]     value = toVLQSigned(value); [EOL]     do { [EOL]         int digit = value & VLQ_BASE_MASK; [EOL]         value >>>= VLQ_BASE_SHIFT; [EOL]         if (value > 0) { [EOL]             digit |= VLQ_CONTINUATION_BIT; [EOL]         } [EOL]         out.append(Base64.toBase64(digit)); [EOL]     } while (value > 0); [EOL] } <line_num>: 87,98
boolean hasNext(); <line_num>: 105,105
char next(); <line_num>: 106,106
public static int decode(CharIterator in) { [EOL]     int result = 0; [EOL]     boolean continuation; [EOL]     int shift = 0; [EOL]     do { [EOL]         char c = in.next(); [EOL]         int digit = Base64.fromBase64(c); [EOL]         continuation = (digit & VLQ_CONTINUATION_BIT) != 0; [EOL]         digit &= VLQ_BASE_MASK; [EOL]         result = result + (digit << shift); [EOL]         shift = shift + VLQ_BASE_SHIFT; [EOL]     } while (continuation); [EOL]     return fromVLQSigned(result); [EOL] } <line_num>: 112,126
