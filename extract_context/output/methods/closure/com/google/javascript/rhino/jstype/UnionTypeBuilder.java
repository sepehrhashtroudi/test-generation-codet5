UnionTypeBuilder(JSTypeRegistry registry) { [EOL]     this(registry, DEFAULT_MAX_UNION_SIZE); [EOL] } <line_num>: 99,101
UnionTypeBuilder(JSTypeRegistry registry, int maxUnionSize) { [EOL]     this.registry = registry; [EOL]     this.maxUnionSize = maxUnionSize; [EOL] } <line_num>: 103,106
Iterable<JSType> getAlternates() { [EOL]     JSType specialCaseType = reduceAlternatesWithoutUnion(); [EOL]     if (specialCaseType != null) { [EOL]         return ImmutableList.of(specialCaseType); [EOL]     } [EOL]     return Collections.unmodifiableList(alternates); [EOL] } <line_num>: 108,114
UnionTypeBuilder addAlternate(JSType alternate) { [EOL]     if (alternate.isNoType()) { [EOL]         return this; [EOL]     } [EOL]     isAllType = isAllType || alternate.isAllType(); [EOL]     boolean isAlternateUnknown = alternate instanceof UnknownType; [EOL]     isNativeUnknownType = isNativeUnknownType || isAlternateUnknown; [EOL]     if (isAlternateUnknown) { [EOL]         areAllUnknownsChecked = areAllUnknownsChecked && alternate.isCheckedUnknownType(); [EOL]     } [EOL]     if (!isAllType && !isNativeUnknownType) { [EOL]         if (alternate.isUnionType()) { [EOL]             UnionType union = alternate.toMaybeUnionType(); [EOL]             for (JSType unionAlt : union.getAlternates()) { [EOL]                 addAlternate(unionAlt); [EOL]             } [EOL]         } else { [EOL]             if (alternates.size() > maxUnionSize) { [EOL]                 return this; [EOL]             } [EOL]             if (alternate.isFunctionType() && functionTypePosition != -1) { [EOL]                 FunctionType other = alternates.get(functionTypePosition).toMaybeFunctionType(); [EOL]                 FunctionType supremum = alternate.toMaybeFunctionType().supAndInfHelper(other, true); [EOL]                 alternates.set(functionTypePosition, supremum); [EOL]                 result = null; [EOL]                 return this; [EOL]             } [EOL]             int currentIndex = 0; [EOL]             Iterator<JSType> it = alternates.iterator(); [EOL]             while (it.hasNext()) { [EOL]                 boolean removeCurrent = false; [EOL]                 JSType current = it.next(); [EOL]                 if (alternate.isUnknownType() || current.isUnknownType() || alternate.isNoResolvedType() || current.isNoResolvedType() || alternate.hasAnyTemplateTypes() || current.hasAnyTemplateTypes()) { [EOL]                     if (alternate.isEquivalentTo(current)) { [EOL]                         return this; [EOL]                     } [EOL]                 } else { [EOL]                     if (alternate.isParameterizedType() || current.isParameterizedType()) { [EOL]                         if (!current.isParameterizedType()) { [EOL]                             if (alternate.isSubtype(current)) { [EOL]                                 return this; [EOL]                             } [EOL]                         } else if (!alternate.isParameterizedType()) { [EOL]                             if (current.isSubtype(alternate)) { [EOL]                                 removeCurrent = true; [EOL]                             } [EOL]                         } else { [EOL]                             Preconditions.checkState(current.isParameterizedType() && alternate.isParameterizedType()); [EOL]                             ParameterizedType parameterizedAlternate = alternate.toMaybeParameterizedType(); [EOL]                             ParameterizedType parameterizedCurrent = current.toMaybeParameterizedType(); [EOL]                             if (parameterizedCurrent.wrapsSameRawType(parameterizedAlternate)) { [EOL]                                 JSType alternateTypeParameter = parameterizedAlternate.getParameterType(); [EOL]                                 JSType currentTypeParameter = parameterizedCurrent.getParameterType(); [EOL]                                 if (currentTypeParameter.isEquivalentTo(parameterizedCurrent)) { [EOL]                                     return this; [EOL]                                 } else { [EOL]                                     JSType merged = parameterizedCurrent.getReferencedObjTypeInternal(); [EOL]                                     return addAlternate(merged); [EOL]                                 } [EOL]                             } [EOL]                         } [EOL]                     } else if (alternate.isSubtype(current)) { [EOL]                         return this; [EOL]                     } else if (current.isSubtype(alternate)) { [EOL]                         removeCurrent = true; [EOL]                     } [EOL]                 } [EOL]                 if (removeCurrent) { [EOL]                     it.remove(); [EOL]                     if (currentIndex == functionTypePosition) { [EOL]                         functionTypePosition = -1; [EOL]                     } else if (currentIndex < functionTypePosition) { [EOL]                         functionTypePosition--; [EOL]                         currentIndex--; [EOL]                     } [EOL]                 } [EOL]                 currentIndex++; [EOL]             } [EOL]             if (alternate.isFunctionType()) { [EOL]                 Preconditions.checkState(functionTypePosition == -1); [EOL]                 functionTypePosition = alternates.size(); [EOL]             } [EOL]             alternates.add(alternate); [EOL]             result = null; [EOL]         } [EOL]     } else { [EOL]         result = null; [EOL]     } [EOL]     return this; [EOL] } <line_num>: 120,281
private JSType reduceAlternatesWithoutUnion() { [EOL]     if (isAllType) { [EOL]         return registry.getNativeType(ALL_TYPE); [EOL]     } else if (isNativeUnknownType) { [EOL]         if (areAllUnknownsChecked) { [EOL]             return registry.getNativeType(CHECKED_UNKNOWN_TYPE); [EOL]         } else { [EOL]             return registry.getNativeType(UNKNOWN_TYPE); [EOL]         } [EOL]     } else { [EOL]         int size = alternates.size(); [EOL]         if (size > maxUnionSize) { [EOL]             return registry.getNativeType(UNKNOWN_TYPE); [EOL]         } else if (size > 1) { [EOL]             return null; [EOL]         } else if (size == 1) { [EOL]             return alternates.iterator().next(); [EOL]         } else { [EOL]             return registry.getNativeType(NO_TYPE); [EOL]         } [EOL]     } [EOL] } <line_num>: 288,309
JSType build() { [EOL]     if (result == null) { [EOL]         result = reduceAlternatesWithoutUnion(); [EOL]         if (result == null) { [EOL]             result = new UnionType(registry, getAlternateListCopy()); [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 316,324
private Collection<JSType> getAlternateListCopy() { [EOL]     return ImmutableList.copyOf(alternates); [EOL] } <line_num>: 326,328