 JSType(JSTypeRegistry registry)
 JSType(JSTypeRegistry registry, ImmutableList<String> templateKeys, ImmutableList<JSType> templatizedTypes)
public TypePair(JSType typeA, JSType typeB)
public int compare(JSType t1, JSType t2)
 JSType getNativeType(JSTypeNative typeId)
public JSDocInfo getJSDocInfo()
public String getDisplayName()
public boolean hasDisplayName()
public boolean hasProperty(String pname)
public boolean isNoType()
public boolean isNoResolvedType()
public boolean isNoObjectType()
public final boolean isEmptyType()
public boolean isNumberObjectType()
public boolean isNumberValueType()
public boolean isFunctionPrototypeType()
public boolean isStringObjectType()
 boolean isTheObjectType()
public boolean isStringValueType()
public final boolean isString()
public final boolean isNumber()
public boolean isArrayType()
public boolean isBooleanObjectType()
public boolean isBooleanValueType()
public boolean isRegexpType()
public boolean isDateType()
public boolean isNullType()
public boolean isVoidType()
public boolean isAllType()
public boolean isUnknownType()
public boolean isCheckedUnknownType()
public final boolean isUnionType()
public boolean isStruct()
public boolean isDict()
public UnionType toMaybeUnionType()
public final boolean isGlobalThisType()
public final boolean isFunctionType()
public FunctionType toMaybeFunctionType()
public static FunctionType toMaybeFunctionType(JSType type)
public final boolean isEnumElementType()
public EnumElementType toMaybeEnumElementType()
public boolean isEnumType()
public EnumType toMaybeEnumType()
 boolean isNamedType()
public boolean isRecordType()
 RecordType toMaybeRecordType()
public final boolean isParameterizedType()
public ParameterizedType toMaybeParameterizedType()
public static ParameterizedType toMaybeParameterizedType(JSType type)
public final boolean isTemplateType()
public TemplateType toMaybeTemplateType()
public static TemplateType toMaybeTemplateType(JSType type)
public boolean hasAnyTemplateTypes()
 boolean hasAnyTemplateTypesInternal()
public boolean isTemplatized()
public ImmutableList<String> getTemplateKeys()
public ImmutableList<JSType> getTemplatizedTypes()
public boolean hasTemplatizedType(String key)
public JSType getTemplatizedType(String key)
 static boolean hasEquivalentTemplateTypes(JSType type1, JSType type2, EquivalenceMethod eqMethod)
public boolean isObject()
public boolean isConstructor()
public boolean isNominalType()
public final boolean isNominalConstructor()
public boolean isInstanceType()
public boolean isInterface()
public boolean isOrdinaryFunction()
public final boolean isEquivalentTo(JSType that)
public final boolean isInvariant(JSType that)
public final boolean differsFrom(JSType that)
 boolean checkEquivalenceHelper(JSType that, EquivalenceMethod eqMethod)
public static boolean isEquivalent(JSType typeA, JSType typeB)
public boolean equals(Object jsType)
public int hashCode()
public final boolean matchesInt32Context()
public final boolean matchesUint32Context()
public boolean matchesNumberContext()
public boolean matchesStringContext()
public boolean matchesObjectContext()
public JSType findPropertyType(String propertyName)
public boolean canBeCalled()
public boolean canCastTo(JSType that)
public JSType autoboxesTo()
public JSType unboxesTo()
public ObjectType toObjectType()
public JSType autobox()
public final ObjectType dereference()
public final boolean canTestForEqualityWith(JSType that)
public TernaryValue testForEquality(JSType that)
 TernaryValue testForEqualityHelper(JSType aType, JSType bType)
public final boolean canTestForShallowEqualityWith(JSType that)
public boolean isNullable()
public JSType collapseUnion()
public JSType getLeastSupertype(JSType that)
 static JSType getLeastSupertype(JSType thisType, JSType thatType)
public JSType getGreatestSubtype(JSType that)
 static JSType getGreatestSubtype(JSType thisType, JSType thatType)
 static JSType filterNoResolvedType(JSType type)
public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome)
public abstract BooleanLiteralSet getPossibleToBooleanOutcomes()
public TypePair getTypesUnderEquality(JSType that)
public TypePair getTypesUnderInequality(JSType that)
public TypePair getTypesUnderShallowEquality(JSType that)
public TypePair getTypesUnderShallowInequality(JSType that)
public JSType restrictByNotNullOrUndefined()
public boolean isSubtype(JSType that)
 static boolean isSubtypeHelper(JSType thisType, JSType thatType)
public abstract T visit(Visitor<T> visitor)
 abstract T visit(RelationshipVisitor<T> visitor, JSType that)
public final JSType forceResolve(ErrorReporter t, StaticScope<JSType> scope)
public final JSType resolve(ErrorReporter t, StaticScope<JSType> scope)
 abstract JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope)
 void setResolvedTypeInternal(JSType type)
public final boolean isResolved()
public final void clearResolved()
 static final JSType safeResolve(JSType type, ErrorReporter t, StaticScope<JSType> scope)
public boolean setValidator(Predicate<JSType> validator)
public String toString()
public String toDebugHashCodeString()
public final String toAnnotationString()
 abstract String toStringHelper(boolean forAnnotations)
public void matchConstraint(JSType constraint)
long serialVersionUID=Optional[1L]
boolean resolved=Optional[false]
JSType resolveResult=Optional[null]
ImmutableList<String> templateKeys
ImmutableList<JSType> templatizedTypes
boolean inTemplatedCheckVisit=Optional[false]
CanCastToVisitor CAN_CAST_TO_VISITOR=Optional[new CanCastToVisitor()]
String UNKNOWN_NAME=Optional["Unknown class name"]
String NOT_A_CLASS=Optional["Not declared as a constructor"]
String NOT_A_TYPE=Optional["Not declared as a type name"]
String EMPTY_TYPE_COMPONENT=Optional["Named type with empty name component"]
Comparator<JSType> ALPHA=Optional[new Comparator<JSType>() {

    @Override
    public int compare(JSType t1, JSType t2) {
        return t1.toString().compareTo(t2.toString());
    }
}]
int ENUMDECL=Optional[1]
int NOT_ENUMDECL=Optional[0]
JSTypeRegistry registry
