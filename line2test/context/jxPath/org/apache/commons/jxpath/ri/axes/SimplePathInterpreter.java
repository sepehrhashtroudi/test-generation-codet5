public static NodePointer interpretSimpleLocationPath(EvalContext context, NodePointer root, Step[] steps)
public static NodePointer interpretSimpleExpressionPath(EvalContext context, NodePointer root, Expression[] predicates, Step[] steps)
private static NodePointer doStep(EvalContext context, NodePointer parent, Step[] steps, int currentStep)
private static NodePointer doStepNoPredicatesPropertyOwner(EvalContext context, PropertyOwnerPointer parentPointer, Step[] steps, int currentStep)
private static NodePointer doStepNoPredicatesStandard(EvalContext context, NodePointer parentPointer, Step[] steps, int currentStep)
private static NodePointer doStepPredicatesPropertyOwner(EvalContext context, PropertyOwnerPointer parentPointer, Step[] steps, int currentStep)
private static NodePointer createChildPointerForStep(PropertyOwnerPointer parentPointer, Step step)
private static NodePointer doStepPredicatesStandard(EvalContext context, NodePointer parent, Step[] steps, int currentStep)
private static NodePointer doPredicate(EvalContext context, NodePointer parent, Step[] steps, int currentStep, Expression[] predicates, int currentPredicate)
private static NodePointer doPredicateName(EvalContext context, NodePointer parent, Step[] steps, int currentStep, Expression[] predicates, int currentPredicate)
private static NodePointer doPredicatesStandard(EvalContext context, List parents, Step[] steps, int currentStep, Expression[] predicates, int currentPredicate)
private static NodePointer doPredicateIndex(EvalContext context, NodePointer parent, Step[] steps, int currentStep, Expression[] predicates, int currentPredicate)
private static int indexFromPredicate(EvalContext context, Expression predicate)
private static String keyFromPredicate(EvalContext context, Expression predicate)
private static int computeQuality(NodePointer pointer)
private static boolean isNameAttributeEqual(NodePointer pointer, String name)
private static boolean isCollectionElement(NodePointer pointer, int index)
private static NodePointer valuePointer(NodePointer pointer)
public static NodePointer createNullPointer(EvalContext context, NodePointer parent, Step[] steps, int currentStep)
private static NodePointer createNullPointerForPredicates(EvalContext context, NodePointer parent, Step[] steps, int currentStep, Expression[] predicates, int currentPredicate)
private static NodeIterator getNodeIterator(EvalContext context, NodePointer pointer, Step step)
private static boolean isLangAttribute(QName name)
QName QNAME_NAME=Optional[new QName(null, "name")]
int PERFECT_MATCH=Optional[1000]