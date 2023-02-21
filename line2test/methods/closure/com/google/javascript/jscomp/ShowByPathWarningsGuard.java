public ShowByPathWarningsGuard(String checkWarningsOnlyForPath) { [EOL]     this(checkWarningsOnlyForPath, ShowType.INCLUDE); [EOL] } <line_num>: 44,46
public ShowByPathWarningsGuard(String[] checkWarningsOnlyForPath) { [EOL]     this(checkWarningsOnlyForPath, ShowType.INCLUDE); [EOL] } <line_num>: 48,50
public ShowByPathWarningsGuard(String path, ShowType showType) { [EOL]     this(new String[] { path }, showType); [EOL] } <line_num>: 52,54
public ShowByPathWarningsGuard(String[] paths, ShowType showType) { [EOL]     Preconditions.checkArgument(paths != null); [EOL]     Preconditions.checkArgument(showType != null); [EOL]     List<String> pathList = Lists.newArrayList(paths); [EOL]     if (showType == ShowType.INCLUDE) { [EOL]         warningsGuard = ByPathWarningsGuard.exceptPath(pathList, CheckLevel.OFF); [EOL]     } else { [EOL]         warningsGuard = ByPathWarningsGuard.forPath(pathList, CheckLevel.OFF); [EOL]     } [EOL] } <line_num>: 56,65
@Override [EOL] public CheckLevel level(JSError error) { [EOL]     return warningsGuard.level(error); [EOL] } <line_num>: 67,70
@Override [EOL] protected int getPriority() { [EOL]     return warningsGuard.getPriority(); [EOL] } <line_num>: 72,75