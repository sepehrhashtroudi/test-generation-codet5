public BinaryChromosome(List<Integer> representation) throws InvalidRepresentationException { [EOL]     super(representation); [EOL] } <line_num>: 37,39
public BinaryChromosome(Integer[] representation) throws InvalidRepresentationException { [EOL]     super(representation); [EOL] } <line_num>: 46,48
@Override [EOL] protected void checkValidity(List<Integer> chromosomeRepresentation) throws InvalidRepresentationException { [EOL]     for (int i : chromosomeRepresentation) { [EOL]         if (i < 0 || i > 1) { [EOL]             throw new InvalidRepresentationException(LocalizedFormats.INVALID_BINARY_DIGIT, i); [EOL]         } [EOL]     } [EOL] } <line_num>: 53,61
public static List<Integer> randomBinaryRepresentation(int length) { [EOL]     List<Integer> rList = new ArrayList<Integer>(length); [EOL]     for (int j = 0; j < length; j++) { [EOL]         rList.add(GeneticAlgorithm.getRandomGenerator().nextInt(2)); [EOL]     } [EOL]     return rList; [EOL] } <line_num>: 68,75
@Override [EOL] protected boolean isSame(Chromosome another) { [EOL]     if (!(another instanceof BinaryChromosome)) { [EOL]         return false; [EOL]     } [EOL]     BinaryChromosome anotherBc = (BinaryChromosome) another; [EOL]     if (getLength() != anotherBc.getLength()) { [EOL]         return false; [EOL]     } [EOL]     for (int i = 0; i < getRepresentation().size(); i++) { [EOL]         if (!(getRepresentation().get(i).equals(anotherBc.getRepresentation().get(i)))) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 77,96
