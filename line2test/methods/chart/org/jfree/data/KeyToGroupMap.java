public KeyToGroupMap() { [EOL]     this("Default Group"); [EOL] } <line_num>: 81,83
public KeyToGroupMap(Comparable defaultGroup) { [EOL]     if (defaultGroup == null) { [EOL]         throw new IllegalArgumentException("Null 'defaultGroup' argument."); [EOL]     } [EOL]     this.defaultGroup = defaultGroup; [EOL]     this.groups = new ArrayList(); [EOL]     this.keyToGroupMap = new HashMap(); [EOL] } <line_num>: 90,97
public int getGroupCount() { [EOL]     return this.groups.size() + 1; [EOL] } <line_num>: 104,106
public List getGroups() { [EOL]     List result = new ArrayList(); [EOL]     result.add(this.defaultGroup); [EOL]     Iterator iterator = this.groups.iterator(); [EOL]     while (iterator.hasNext()) { [EOL]         Comparable group = (Comparable) iterator.next(); [EOL]         if (!result.contains(group)) { [EOL]             result.add(group); [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 115,126
public int getGroupIndex(Comparable group) { [EOL]     int result = this.groups.indexOf(group); [EOL]     if (result < 0) { [EOL]         if (this.defaultGroup.equals(group)) { [EOL]             result = 0; [EOL]         } [EOL]     } else { [EOL]         result = result + 1; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 136,147
public Comparable getGroup(Comparable key) { [EOL]     if (key == null) { [EOL]         throw new IllegalArgumentException("Null 'key' argument."); [EOL]     } [EOL]     Comparable result = this.defaultGroup; [EOL]     Comparable group = (Comparable) this.keyToGroupMap.get(key); [EOL]     if (group != null) { [EOL]         result = group; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 157,167
public void mapKeyToGroup(Comparable key, Comparable group) { [EOL]     if (key == null) { [EOL]         throw new IllegalArgumentException("Null 'key' argument."); [EOL]     } [EOL]     Comparable currentGroup = getGroup(key); [EOL]     if (!currentGroup.equals(this.defaultGroup)) { [EOL]         if (!currentGroup.equals(group)) { [EOL]             int count = getKeyCount(currentGroup); [EOL]             if (count == 1) { [EOL]                 this.groups.remove(currentGroup); [EOL]             } [EOL]         } [EOL]     } [EOL]     if (group == null) { [EOL]         this.keyToGroupMap.remove(key); [EOL]     } else { [EOL]         if (!this.groups.contains(group)) { [EOL]             if (!this.defaultGroup.equals(group)) { [EOL]                 this.groups.add(group); [EOL]             } [EOL]         } [EOL]         this.keyToGroupMap.put(key, group); [EOL]     } [EOL] } <line_num>: 176,200
public int getKeyCount(Comparable group) { [EOL]     if (group == null) { [EOL]         throw new IllegalArgumentException("Null 'group' argument."); [EOL]     } [EOL]     int result = 0; [EOL]     Iterator iterator = this.keyToGroupMap.values().iterator(); [EOL]     while (iterator.hasNext()) { [EOL]         Comparable g = (Comparable) iterator.next(); [EOL]         if (group.equals(g)) { [EOL]             result++; [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 211,224
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof KeyToGroupMap)) { [EOL]         return false; [EOL]     } [EOL]     KeyToGroupMap that = (KeyToGroupMap) obj; [EOL]     if (!ObjectUtilities.equal(this.defaultGroup, that.defaultGroup)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.keyToGroupMap.equals(that.keyToGroupMap)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 233,248
public Object clone() throws CloneNotSupportedException { [EOL]     KeyToGroupMap result = (KeyToGroupMap) super.clone(); [EOL]     result.defaultGroup = (Comparable) KeyToGroupMap.clone(this.defaultGroup); [EOL]     result.groups = (List) KeyToGroupMap.clone(this.groups); [EOL]     result.keyToGroupMap = (Map) KeyToGroupMap.clone(this.keyToGroupMap); [EOL]     return result; [EOL] } <line_num>: 258,265
private static Object clone(Object object) { [EOL]     if (object == null) { [EOL]         return null; [EOL]     } [EOL]     Class c = object.getClass(); [EOL]     Object result = null; [EOL]     try { [EOL]         Method m = c.getMethod("clone", (Class[]) null); [EOL]         if (Modifier.isPublic(m.getModifiers())) { [EOL]             try { [EOL]                 result = m.invoke(object, (Object[]) null); [EOL]             } catch (Exception e) { [EOL]                 e.printStackTrace(); [EOL]             } [EOL]         } [EOL]     } catch (NoSuchMethodException e) { [EOL]         result = object; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 274,295
private static Collection clone(Collection list) throws CloneNotSupportedException { [EOL]     Collection result = null; [EOL]     if (list != null) { [EOL]         try { [EOL]             List clone = (List) list.getClass().newInstance(); [EOL]             Iterator iterator = list.iterator(); [EOL]             while (iterator.hasNext()) { [EOL]                 clone.add(KeyToGroupMap.clone(iterator.next())); [EOL]             } [EOL]             result = clone; [EOL]         } catch (Exception e) { [EOL]             throw new CloneNotSupportedException("Exception."); [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 306,323
