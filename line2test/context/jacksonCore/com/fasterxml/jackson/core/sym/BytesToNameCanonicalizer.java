private BytesToNameCanonicalizer(int hashSize, boolean intern, int seed)
private BytesToNameCanonicalizer(BytesToNameCanonicalizer parent, boolean intern, int seed, TableInfo state)
public TableInfo(int count, int mainHashMask, int[] mainHash, Name[] mainNames, Bucket[] collList, int collCount, int collEnd, int longestCollisionList)
public TableInfo(BytesToNameCanonicalizer src)
 Bucket(Name name, Bucket next)
private TableInfo initTableInfo(int hashSize)
public static BytesToNameCanonicalizer createRoot()
protected static BytesToNameCanonicalizer createRoot(int hashSeed)
public BytesToNameCanonicalizer makeChild(boolean canonicalize, boolean intern)
public void release()
private void mergeChild(TableInfo childState)
public int size()
public int bucketCount()
public boolean maybeDirty()
public int hashSeed()
public int collisionCount()
public int maxCollisionLength()
public static Name getEmptyName()
public Name findName(int firstQuad)
public Name findName(int firstQuad, int secondQuad)
public Name findName(int[] quads, int qlen)
public Name addName(String symbolStr, int q1, int q2)
public Name addName(String symbolStr, int[] quads, int qlen)
public int calcHash(int firstQuad)
public int calcHash(int firstQuad, int secondQuad)
public int calcHash(int[] quads, int qlen)
protected static int[] calcQuads(byte[] wordBytes)
private void _addSymbol(int hash, Name symbol)
private void rehash()
private void nukeSymbols()
private int findBestBucket()
private void unshareMain()
private void unshareCollision()
private void unshareNames()
private void expandCollision()
private static Name constructName(int hash, String name, int q1, int q2)
private static Name constructName(int hash, String name, int[] quads, int qlen)
protected void reportTooManyCollisions(int maxLen)
public int length()
public Name find(int hash, int firstQuad, int secondQuad)
public Name find(int hash, int[] quads, int qlen)
int DEFAULT_TABLE_SIZE=Optional[64]
int MAX_TABLE_SIZE=Optional[0x10000]
int MAX_ENTRIES_FOR_REUSE=Optional[6000]
int MAX_COLL_CHAIN_LENGTH=Optional[255]
int MAX_COLL_CHAIN_FOR_REUSE=Optional[63]
int MIN_HASH_SIZE=Optional[16]
int INITIAL_COLLISION_LEN=Optional[32]
int LAST_VALID_BUCKET=Optional[0xFE]
BytesToNameCanonicalizer _parent
AtomicReference<TableInfo> _tableInfo
int _hashSeed
boolean _intern
int _count
int _longestCollisionList
int _mainHashMask
int[] _mainHash
Name[] _mainNames
Bucket[] _collList
int _collCount
int _collEnd
boolean _needRehash
boolean _mainHashShared
boolean _mainNamesShared
boolean _collListShared
int MULT=Optional[33]
int MULT2=Optional[65599]
int MULT3=Optional[31]
