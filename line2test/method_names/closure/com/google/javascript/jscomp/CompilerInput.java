public CompilerInput(SourceAst ast)
public CompilerInput(SourceAst ast, boolean isExtern)
public CompilerInput(SourceAst ast, String inputId, boolean isExtern)
public CompilerInput(SourceAst ast, InputId inputId, boolean isExtern)
public CompilerInput(SourceFile file)
public CompilerInput(SourceFile file, boolean isExtern)
public InputId getInputId()
public String getName()
public SourceAst getAst()
public String getPathRelativeToClosureBase()
public Node getAstRoot(AbstractCompiler compiler)
public void clearAst()
public SourceFile getSourceFile()
public void setSourceFile(SourceFile file)
public SourceAst getSourceAst()
public void setCompiler(AbstractCompiler compiler)
private void checkErrorManager()
public Collection<String> getRequires()
public Collection<String> getProvides()
 void addProvide(String provide)
 void addRequire(String require)
public void removeRequire(String require)
private void regenerateDependencyInfoIfNecessary() throws IOException
 void visitTree(Node n)
 void visitSubtree(Node n, Node parent)
public String getLine(int lineNumber)
public Region getRegion(int lineNumber)
public String getCode() throws IOException
public JSModule getModule()
public void setModule(JSModule module)
 void overrideModule(JSModule module)
public boolean isExtern()
 void setIsExtern(boolean isExtern)
public int getLineOffset(int lineno)
public int getNumLines()
public String toString()
