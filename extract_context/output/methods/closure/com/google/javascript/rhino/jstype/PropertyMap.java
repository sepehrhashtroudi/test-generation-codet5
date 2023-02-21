PropertyMap() { [EOL]     this(Maps.<String, Property>newTreeMap()); [EOL] } <line_num>: 79,81
private PropertyMap(Map<String, Property> underlyingMap) { [EOL]     this.properties = underlyingMap; [EOL] } <line_num>: 83,85
@Override [EOL] public PropertyMap apply(ObjectType t) { [EOL]     return t.getPropertyMap(); [EOL] } <line_num>: 65,67
static PropertyMap immutableEmptyMap() { [EOL]     return EMPTY_MAP; [EOL] } <line_num>: 87,89
void setParentSource(ObjectType ownerType) { [EOL]     if (this != EMPTY_MAP) { [EOL]         this.parentSource = ownerType; [EOL]     } [EOL] } <line_num>: 91,95
PropertyMap getPrimaryParent() { [EOL]     if (parentSource == null) { [EOL]         return null; [EOL]     } [EOL]     ObjectType iProto = parentSource.getImplicitPrototype(); [EOL]     return iProto == null ? null : iProto.getPropertyMap(); [EOL] } <line_num>: 98,104
Iterable<PropertyMap> getSecondaryParents() { [EOL]     if (parentSource == null) { [EOL]         return ImmutableList.of(); [EOL]     } [EOL]     Iterable<ObjectType> extendedInterfaces = parentSource.getCtorExtendedInterfaces(); [EOL]     if (Iterables.isEmpty(extendedInterfaces)) { [EOL]         return ImmutableList.of(); [EOL]     } [EOL]     return Iterables.transform(extendedInterfaces, PROP_MAP_FROM_TYPE); [EOL] } <line_num>: 110,123
Property getSlot(String name) { [EOL]     if (properties.containsKey(name)) { [EOL]         return properties.get(name); [EOL]     } [EOL]     PropertyMap primaryParent = getPrimaryParent(); [EOL]     if (primaryParent != null) { [EOL]         Property prop = primaryParent.getSlot(name); [EOL]         if (prop != null) { [EOL]             return prop; [EOL]         } [EOL]     } [EOL]     for (PropertyMap p : getSecondaryParents()) { [EOL]         if (p != null) { [EOL]             Property prop = p.getSlot(name); [EOL]             if (prop != null) { [EOL]                 return prop; [EOL]             } [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 125,145
Property getOwnProperty(String propertyName) { [EOL]     return properties.get(propertyName); [EOL] } <line_num>: 147,149
int getPropertiesCount() { [EOL]     PropertyMap primaryParent = getPrimaryParent(); [EOL]     if (primaryParent == null) { [EOL]         return this.properties.size(); [EOL]     } [EOL]     Set<String> props = Sets.newHashSet(); [EOL]     collectPropertyNames(props); [EOL]     return props.size(); [EOL] } <line_num>: 151,159
boolean hasOwnProperty(String propertyName) { [EOL]     return properties.get(propertyName) != null; [EOL] } <line_num>: 161,163
boolean hasProperty(String propertyName) { [EOL]     return getSlot(propertyName) != null; [EOL] } <line_num>: 165,167
Set<String> getOwnPropertyNames() { [EOL]     return properties.keySet(); [EOL] } <line_num>: 169,171
void collectPropertyNames(Set<String> props) { [EOL]     for (String prop : properties.keySet()) { [EOL]         props.add(prop); [EOL]     } [EOL]     PropertyMap primaryParent = getPrimaryParent(); [EOL]     if (primaryParent != null) { [EOL]         primaryParent.collectPropertyNames(props); [EOL]     } [EOL]     for (PropertyMap p : getSecondaryParents()) { [EOL]         if (p != null) { [EOL]             p.collectPropertyNames(props); [EOL]         } [EOL]     } [EOL] } <line_num>: 173,186
boolean removeProperty(String name) { [EOL]     return properties.remove(name) != null; [EOL] } <line_num>: 188,190
void putProperty(String name, Property newProp) { [EOL]     Property oldProp = properties.get(name); [EOL]     if (oldProp != null) { [EOL]         newProp.setJSDocInfo(oldProp.getJSDocInfo()); [EOL]     } [EOL]     properties.put(name, newProp); [EOL] } <line_num>: 192,200
Iterable<Property> values() { [EOL]     return properties.values(); [EOL] } <line_num>: 202,204
