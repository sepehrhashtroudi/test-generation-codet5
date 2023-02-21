 DiagnosticGroup(String name, DiagnosticType... types)
public DiagnosticGroup(DiagnosticType... types)
private DiagnosticGroup(DiagnosticType type)
public DiagnosticGroup(DiagnosticGroup... groups)
public DiagnosticGroup(String name, DiagnosticGroup... groups)
public static DiagnosticGroup forType(DiagnosticType type)
public boolean matches(JSError error)
public boolean matches(DiagnosticType type)
 boolean isSubGroup(DiagnosticGroup group)
public Iterable<DiagnosticType> getTypes()
public String toString()
long serialVersionUID=Optional[1]
Set<DiagnosticType> types
String name
Map<DiagnosticType, DiagnosticGroup> singletons=Optional[Maps.newHashMap()]
