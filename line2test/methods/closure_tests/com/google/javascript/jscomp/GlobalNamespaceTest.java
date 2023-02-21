public void testRemoveDeclaration1() { [EOL]     Name n = new Name("a", null, false); [EOL]     Ref set1 = createNodelessRef(Ref.Type.SET_FROM_GLOBAL); [EOL]     Ref set2 = createNodelessRef(Ref.Type.SET_FROM_GLOBAL); [EOL]     n.addRef(set1); [EOL]     n.addRef(set2); [EOL]     assertEquals(set1, n.getDeclaration()); [EOL]     assertEquals(2, n.globalSets); [EOL]     assertEquals(2, n.getRefs().size()); [EOL]     n.removeRef(set1); [EOL]     assertEquals(set2, n.getDeclaration()); [EOL]     assertEquals(1, n.globalSets); [EOL]     assertEquals(1, n.getRefs().size()); [EOL] } <line_num>: 31,48
public void testRemoveDeclaration2() { [EOL]     Name n = new Name("a", null, false); [EOL]     Ref set1 = createNodelessRef(Ref.Type.SET_FROM_GLOBAL); [EOL]     Ref set2 = createNodelessRef(Ref.Type.SET_FROM_LOCAL); [EOL]     n.addRef(set1); [EOL]     n.addRef(set2); [EOL]     assertEquals(set1, n.getDeclaration()); [EOL]     assertEquals(1, n.globalSets); [EOL]     assertEquals(1, n.localSets); [EOL]     assertEquals(2, n.getRefs().size()); [EOL]     n.removeRef(set1); [EOL]     assertEquals(null, n.getDeclaration()); [EOL]     assertEquals(0, n.globalSets); [EOL] } <line_num>: 50,67
private Ref createNodelessRef(Ref.Type type) { [EOL]     return Ref.createRefForTesting(type); [EOL] } <line_num>: 69,71
