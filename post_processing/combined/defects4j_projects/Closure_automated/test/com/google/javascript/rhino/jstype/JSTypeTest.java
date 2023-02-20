/*
 *
 * ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is Rhino code, released
 * May 6, 1999.
 *
 * The Initial Developer of the Original Code is
 * Netscape Communications Corporation.
 * Portions created by the Initial Developer are Copyright (C) 1997-1999
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *   Nick Santos
 *
 * Alternatively, the contents of this file may be used under the terms of
 * the GNU General Public License Version 2 or later (the "GPL"), in which
 * case the provisions of the GPL are applicable instead of those above. If
 * you wish to allow use of your version of this file only under the terms of
 * the GPL and not to allow others to use your version of this file under the
 * MPL, indicate your decision by deleting the provisions above and replacing
 * them with the notice and other provisions required by the GPL. If you do
 * not delete the provisions above, a recipient may use your version of this
 * file under either the MPL or the GPL.
 *
 * ***** END LICENSE BLOCK ***** */

package com.google.javascript.rhino.jstype;

import static com.google.javascript.rhino.jstype.TernaryValue.FALSE;
import static com.google.javascript.rhino.jstype.TernaryValue.TRUE;
import static com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.JSType.TypePair;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import com.google.javascript.rhino.testing.Asserts;
import com.google.javascript.rhino.testing.AbstractStaticScope;
import com.google.javascript.rhino.testing.BaseJSTypeTestCase;
import com.google.javascript.rhino.testing.MapBasedScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO(nicksantos): Split some of this up into per-class unit tests.
public class JSTypeTest extends BaseJSTypeTestCase {
  private FunctionType dateMethod;
  private FunctionType functionType;
  private NamedType unresolvedNamedType;
  private FunctionType googBar;
  private FunctionType googSubBar;
  private FunctionType googSubSubBar;
  private ObjectType googBarInst;
  private ObjectType googSubBarInst;
  private ObjectType googSubSubBarInst;
  private NamedType namedGoogBar;
  private ObjectType subclassOfUnresolvedNamedType;
  private FunctionType subclassCtor;
  private FunctionType interfaceType;
  private ObjectType interfaceInstType;
  private FunctionType subInterfaceType;
  private ObjectType subInterfaceInstType;
  private JSType recordType;
  private EnumType enumType;
  private EnumElementType elementsType;
  private NamedType forwardDeclaredNamedType;

  private static final StaticScope<JSType> EMPTY_SCOPE =
      MapBasedScope.emptyScope();

  /**
   * A non exhaustive list of representative types used to test simple
   * properties that should hold for all types (such as the reflexivity
   * of subtyping).
   */
  private List<JSType> types;

  @Override
  protected void setUp() throws Exception {
    super.setUp();

    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("a", NUMBER_TYPE, null);
    builder.addProperty("b", STRING_TYPE, null);
    recordType = builder.build();

    enumType = new EnumType(registry, "Enum", null, NUMBER_TYPE);
    elementsType = enumType.getElementsType();
    functionType = new FunctionBuilder(registry)
        .withReturnType(NUMBER_TYPE)
        .build();
    dateMethod = new FunctionBuilder(registry)
        .withParamsNode(new Node(Token.PARAM_LIST))
        .withReturnType(NUMBER_TYPE)
        .withTypeOfThis(DATE_TYPE)
        .build();
    unresolvedNamedType =
        new NamedType(registry, "not.resolved.named.type", null, -1, -1);
    namedGoogBar = new NamedType(registry, "goog.Bar", null, -1, -1);

    subclassCtor =
        new FunctionType(registry, null, null, createArrowType(null),
            null, null, true, false);
    subclassCtor.setPrototypeBasedOn(unresolvedNamedType);
    subclassOfUnresolvedNamedType = subclassCtor.getInstanceType();

    interfaceType = FunctionType.forInterface(registry, "Interface", null);
    interfaceInstType = interfaceType.getInstanceType();

    subInterfaceType = FunctionType.forInterface(
        registry, "SubInterface", null);
    subInterfaceType.setExtendedInterfaces(
        Lists.<ObjectType>newArrayList(interfaceInstType));
    subInterfaceInstType = subInterfaceType.getInstanceType();

    googBar = registry.createConstructorType(
        "goog.Bar", null, null, null, null);
    googBar.getPrototype().defineDeclaredProperty("date", DATE_TYPE,
        null);
    googBar.setImplementedInterfaces(
        Lists.<ObjectType>newArrayList(interfaceInstType));
    googBarInst = googBar.getInstanceType();

    googSubBar = registry.createConstructorType(
        "googSubBar", null, null, null, null);
    googSubBar.setPrototypeBasedOn(googBar.getInstanceType());
    googSubBarInst = googSubBar.getInstanceType();

    googSubSubBar = registry.createConstructorType(
        "googSubSubBar", null, null, null, null);
    googSubSubBar.setPrototypeBasedOn(googSubBar.getInstanceType());
    googSubSubBarInst = googSubSubBar.getInstanceType();

    final ObjectType googObject = registry.createAnonymousObjectType(null);
    googObject.defineDeclaredProperty("Bar", googBar, null);

    namedGoogBar.resolve(null, new AbstractStaticScope<JSType>() {
          @Override
          public StaticSlot<JSType> getSlot(String name) {
            if ("goog".equals(name)) {
              return new SimpleSlot("goog", googObject, false);
            } else {
              return null;
            }
          }
        });
    assertNotNull(namedGoogBar.getImplicitPrototype());

    forwardDeclaredNamedType =
        new NamedType(registry, "forwardDeclared", "source", 1, 0);
    registry.forwardDeclareType("forwardDeclared");
    forwardDeclaredNamedType.resolve(
        new SimpleErrorReporter(), EMPTY_SCOPE);

    types = ImmutableList.of(
        NO_OBJECT_TYPE,
        NO_RESOLVED_TYPE,
        NO_TYPE,
        BOOLEAN_OBJECT_TYPE,
        BOOLEAN_TYPE,
        STRING_OBJECT_TYPE,
        STRING_TYPE,
        VOID_TYPE,
        UNKNOWN_TYPE,
        NULL_TYPE,
        NUMBER_OBJECT_TYPE,
        NUMBER_TYPE,
        DATE_TYPE,
        ERROR_TYPE,
        SYNTAX_ERROR_TYPE,
        dateMethod,
        functionType,
        unresolvedNamedType,
        googBar,
        googSubBar,
        googSubSubBar,
        namedGoogBar,
        googBar.getInstanceType(),
        subclassOfUnresolvedNamedType,
        subclassCtor,
        recordType,
        enumType,
        elementsType,
        googBar,
        googSubBar,
        forwardDeclaredNamedType);
  }

  /**
   * Tests the behavior of the top constructor type.
   */
  

  /**
   * Tests the behavior of the Bottom Object type.
   */
  

  /**
   * Tests the behavior of the Bottom type.
   */
  

  /**
   * Tests the behavior of the unresolved Bottom type.
   */
  

  /**
   * Tests the behavior of the Array type.
   */
  

  /**
   * Tests the behavior of the unknown type.
   */
  

  /**
   * Tests the behavior of the checked unknown type.
   */
  

  /**
   * Tests the behavior of the unknown type.
   */
  

  /**
   * Tests the behavior of the Object type (the object
   * at the top of the JavaScript hierarchy).
   */
  

  /**
   * Tests the behavior of the number value type.
   */
  

  /**
   * Tests the behavior of the number value type.
   */
  

  /**
   * Tests the behavior of the null type.
   */
  

  /**
   * Tests the behavior of the Date type.
   */
  

  /**
   * Tests the behavior of the RegExp type.
   */
  

  /**
   * Tests the behavior of the string object type.
   */
  

  /**
   * Tests the behavior of the string value type.
   */
  

  private void assertPropertyTypeDeclared(ObjectType ownerType, String prop) {
    assertTrue(ownerType.isPropertyTypeDeclared(prop));
    assertFalse(ownerType.isPropertyTypeInferred(prop));
  }

  private void assertPropertyTypeInferred(ObjectType ownerType, String prop) {
    assertFalse(ownerType.isPropertyTypeDeclared(prop));
    assertTrue(ownerType.isPropertyTypeInferred(prop));
  }

  private void assertPropertyTypeUnknown(ObjectType ownerType, String prop) {
    assertFalse(ownerType.isPropertyTypeDeclared(prop));
    assertFalse(ownerType.isPropertyTypeInferred(prop));
    assertTrue(ownerType.getPropertyType(prop).isUnknownType());
  }

  private void assertReturnTypeEquals(JSType expectedReturnType,
      JSType function) {
    assertTrue(function instanceof FunctionType);
    assertTypeEquals(expectedReturnType,
        ((FunctionType) function).getReturnType());
  }


  /**
   * Tests the behavior of record types.
   */
  

  /**
   * Tests the behavior of the instance of Function.
   */
  

  /**
   * Tests the behavior of functional types.
   */
  

  /**
   * Tests the subtyping relation of record types.
   */
  

  /**
   * Tests the subtyping relation of record types when an object has
   * an inferred property..
   */
  

  /**
   * Tests the getLeastSupertype method for record types.
   */
  

  

  

  

  /**
   * Tests the getGreatestSubtype method for record types.
   */
  

  

  

  

  

  

  
  

  /**
   * Tests the "apply" method on the function type.
   */
  

  /**
   * Tests the "call" method on the function type.
   */
  

  /**
   * Tests the representation of function types.
   */
  

  /**
   * Tests relationships between structural function types.
   */
  

  

  /**
   * Tests relationships between structural function types.
   */
  

  /**
   * Tests that defining a property of a function's {@code prototype} adds the
   * property to it instance type.
   */
  

  /**
   * Tests that replacing a function's {@code prototype} changes the visible
   * properties of its instance type.
   */
  

  /** Tests assigning JsDoc on a prototype property. */
  

  /**
   * Tests the behavior of the void type.
   */
  

  /**
   * Tests the behavior of the boolean type.
   */
  

  /**
   * Tests the behavior of the Boolean type.
   */
  

  /**
   * Tests the behavior of the enum type.
   */
  

  /**
   * Tests the behavior of the enum element type.
   */
  

  

  


  /**
   * Tests object types.
   */
  

  /**
   * Tests the goog.Bar type.
   */
  

  /**
   * Tests how properties are counted for object types.
   */
  

  /**
   * Tests how properties are defined.
   */
  

  /**
   * Tests that properties are correctly counted even when shadowing occurs.
   */
  

  /**
   * Tests the named type goog.Bar.
   */
  

  /**
   * Tests the prototype chaining of native objects.
   */
  

  /**
   * Tests that function instances have their constructor pointer back at the
   * function that created them.
   */
  

  /**
   * Tests that the method {@link JSType#canTestForEqualityWith(JSType)} handles
   * special corner cases.
   */
  

  /**
   * Tests the {@link JSType#testForEquality(JSType)} method.
   */
  

  private void compare(TernaryValue r, JSType t1, JSType t2) {
    assertEquals(r, t1.testForEquality(t2));
    assertEquals(r, t2.testForEquality(t1));
  }

  private void assertCanTestForEqualityWith(JSType t1, JSType t2) {
    assertTrue(t1.canTestForEqualityWith(t2));
    assertTrue(t2.canTestForEqualityWith(t1));
  }

  private void assertCannotTestForEqualityWith(JSType t1, JSType t2) {
    assertFalse(t1.canTestForEqualityWith(t2));
    assertFalse(t2.canTestForEqualityWith(t1));
  }

  /**
   * Tests the subtyping relationships among simple types.
   */
  

  /**
   * Tests that the Object type is the greatest element (top) of the object
   * hierarchy.
   */
  

  

  

  

  

  

  

  

  /**
   * Types to test for symmetrical relationships.
   */
  private List<JSType> getTypesToTestForSymmetry() {
    return Lists.newArrayList(
        UNKNOWN_TYPE,
        NULL_TYPE,
        VOID_TYPE,
        NUMBER_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        OBJECT_TYPE,
        U2U_CONSTRUCTOR_TYPE,
        LEAST_FUNCTION_TYPE,
        GREATEST_FUNCTION_TYPE,
        ALL_TYPE,
        NO_TYPE,
        NO_OBJECT_TYPE,
        NO_RESOLVED_TYPE,
        createUnionType(BOOLEAN_TYPE, STRING_TYPE),
        createUnionType(NUMBER_TYPE, STRING_TYPE),
        createUnionType(NULL_TYPE, dateMethod),
        createUnionType(UNKNOWN_TYPE, dateMethod),
        createUnionType(namedGoogBar, dateMethod),
        createUnionType(NULL_TYPE, unresolvedNamedType),
        enumType,
        elementsType,
        dateMethod,
        functionType,
        unresolvedNamedType,
        googBar,
        namedGoogBar,
        googBar.getInstanceType(),
        namedGoogBar,
        subclassOfUnresolvedNamedType,
        subclassCtor,
        recordType,
        forwardDeclaredNamedType,
        createUnionType(forwardDeclaredNamedType, NULL_TYPE),
        createParameterizedType(OBJECT_TYPE, STRING_TYPE),
        createParameterizedType(OBJECT_TYPE, NUMBER_TYPE),
        createParameterizedType(ARRAY_TYPE, STRING_TYPE),
        createParameterizedType(ARRAY_TYPE, NUMBER_TYPE),
        createUnionType(
            createParameterizedType(ARRAY_TYPE, BOOLEAN_TYPE), NULL_TYPE),
        createUnionType(
            createParameterizedType(OBJECT_TYPE, BOOLEAN_TYPE), NULL_TYPE)
        );
  }

  

  /**
   * Tests that getLeastSupertype is a symmetric relation.
   */
  

  

  /**
   * Tests that getGreatestSubtype is a symmetric relation.
   */
  

  /**
   * Tests that getLeastSupertype is a reflexive relation.
   */
  

  /**
   * Tests that getGreatestSubtype is a reflexive relation.
   */
  

  /**
   * Tests {@link JSType#getLeastSupertype(JSType)} for unresolved named types.
   */
  

  

  

  /** Tests the subclass of an unresolved named type */
  

  /**
   * Tests that Proxied FunctionTypes behave the same over getLeastSupertype and
   * getGreatestSubtype as non proxied FunctionTypes
   */
  

  

  /**
   * Tests the {@link NamedType#equals} function, which had a bug in it.
   */
  

  /**
   * Tests the {@link NamedType#equals} function against other types.
   */
  

  /**
   * Tests the {@link NamedType#equals} function against other types
   * when it's forward-declared.
   */
  

  

  /**
   * Tests {@link JSType#getGreatestSubtype(JSType)} on simple types.
   */
  

  /**
   * Tests that a derived class extending a type via a named type is a subtype
   * of it.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Tests that the given chain of types has a total ordering defined
   * by the subtype relationship, with types at the top of the lattice
   * listed first.
   *
   * Also verifies that the infimum of any two types on the chain
   * is the lower type, and the supremum of any two types on the chain
   * is the higher type.
   */
  public void verifySubtypeChain(List<JSType> typeChain) throws Exception {
    verifySubtypeChain(typeChain, true);
  }

  public void verifySubtypeChain(List<JSType> typeChain,
                                 boolean checkSubtyping) throws Exception {
    // Ugh. This wouldn't require so much copy-and-paste if we had a functional
    // programming language.
    for (int i = 0; i < typeChain.size(); i++) {
      for (int j = 0; j < typeChain.size(); j++) {
        JSType typeI = typeChain.get(i);
        JSType typeJ = typeChain.get(j);

        JSType namedTypeI = getNamedWrapper("TypeI", typeI);
        JSType namedTypeJ = getNamedWrapper("TypeJ", typeJ);
        JSType proxyTypeI = new ProxyObjectType(registry, typeI);
        JSType proxyTypeJ = new ProxyObjectType(registry, typeJ);

        if (i == j) {
          assertTrue(typeI + " should equal itself",
                  typeI.isEquivalentTo(typeI));
          assertTrue("Named " + typeI + " should equal itself",
                  namedTypeI.isEquivalentTo(namedTypeI));
          assertTrue("Proxy " + typeI + " should equal itself",
                  proxyTypeI.isEquivalentTo(proxyTypeI));
        } else {
          assertFalse(typeI + " should not equal " + typeJ,
                  typeI.isEquivalentTo(typeJ));
          assertFalse("Named " + typeI + " should not equal " + typeJ,
                  namedTypeI.isEquivalentTo(namedTypeJ));
          assertFalse("Proxy " + typeI + " should not equal " + typeJ,
                  proxyTypeI.isEquivalentTo(proxyTypeJ));
        }

        assertTrue(typeJ + " should be castable to " + typeI,
                typeJ.canCastTo(typeI));
        assertTrue(typeJ + " should be castable to Named " + namedTypeI,
                typeJ.canCastTo(namedTypeI));
        assertTrue(typeJ + " should be castable to Proxy " + proxyTypeI,
                typeJ.canCastTo(proxyTypeI));

        assertTrue(
                "Named " + typeJ + " should be castable to " + typeI,
                namedTypeJ.canCastTo(typeI));
        assertTrue(
                "Named " + typeJ + " should be castable to Named " + typeI,
                namedTypeJ.canCastTo(namedTypeI));
        assertTrue(
                "Named " + typeJ + " should be castable to Proxy " + typeI,
                namedTypeJ.canCastTo(proxyTypeI));

        assertTrue(
                "Proxy " + typeJ + " should be castable to " + typeI,
                proxyTypeJ.canCastTo(typeI));
        assertTrue(
                "Proxy " + typeJ + " should be castable to Named " + typeI,
                proxyTypeJ.canCastTo(namedTypeI));
        assertTrue(
                "Proxy " + typeJ + " should be castable to Proxy " + typeI,
                proxyTypeJ.canCastTo(proxyTypeI));

        if (checkSubtyping) {
          if (i <= j) {
            assertTrue(typeJ + " should be a subtype of " + typeI,
                    typeJ.isSubtype(typeI));
            assertTrue(
                    "Named " + typeJ + " should be a subtype of Named " + typeI,
                    namedTypeJ.isSubtype(namedTypeI));
            assertTrue(
                    "Proxy " + typeJ + " should be a subtype of Proxy " + typeI,
                    proxyTypeJ.isSubtype(proxyTypeI));
          } else {
            assertFalse(typeJ + " should not be a subtype of " + typeI,
                    typeJ.isSubtype(typeI));
            assertFalse(
                    "Named " + typeJ + " should not be a subtype of Named " + typeI,
                    namedTypeJ.isSubtype(namedTypeI));
            assertFalse(
                    "Named " + typeJ + " should not be a subtype of Named " + typeI,
                    proxyTypeJ.isSubtype(proxyTypeI));
          }

          JSType expectedSupremum = i < j ? typeI : typeJ;
          JSType expectedInfimum = i > j ? typeI : typeJ;

          assertTypeEquals(
                  expectedSupremum + " should be the least supertype of " + typeI +
                          " and " + typeJ,
                  expectedSupremum, typeI.getLeastSupertype(typeJ));

          // TODO(nicksantos): Should these tests pass?
          //assertTypeEquals(
          //    expectedSupremum + " should be the least supertype of Named " +
          //    typeI + " and Named " + typeJ,
          //    expectedSupremum, namedTypeI.getLeastSupertype(namedTypeJ));
          //assertTypeEquals(
          //    expectedSupremum + " should be the least supertype of Proxy " +
          //    typeI + " and Proxy " + typeJ,
          //    expectedSupremum, proxyTypeI.getLeastSupertype(proxyTypeJ));

          assertTypeEquals(
                  expectedInfimum + " should be the greatest subtype of " + typeI +
                          " and " + typeJ,
                  expectedInfimum, typeI.getGreatestSubtype(typeJ));

          // TODO(nicksantos): Should these tests pass?
          //assertTypeEquals(
          //    expectedInfimum + " should be the greatest subtype of Named " +
          //    typeI + " and Named " + typeJ,
          //    expectedInfimum, namedTypeI.getGreatestSubtype(namedTypeJ));
          //assertTypeEquals(
          //    expectedInfimum + " should be the greatest subtype of Proxy " +
          //    typeI + " and Proxy " + typeJ,
          //    expectedInfimum, proxyTypeI.getGreatestSubtype(proxyTypeJ));
        }
      }
    }
  }

  JSType getNamedWrapper(String name, JSType jstype) {
    // Normally, there is no way to create a Named NoType alias so
    // avoid confusing things by doing it here..
    if (!jstype.isNoType()) {
      NamedType namedWrapper = new NamedType(
          registry, name, "[testcode]", -1, -1);
      namedWrapper.setReferencedType(jstype);
      return namedWrapper;
    } else {
      return jstype;
    }
  }

  /**
   * Tests the behavior of
   * {@link JSType#getRestrictedTypeGivenToBooleanOutcome(boolean)}.
   */
  

  

  

  /**
   * Tests
   * {@link JSTypeRegistry#getGreatestSubtypeWithProperty(JSType, String)}.
   */
  

  

  

  

  

  

  

  

  

  private void testGetTypeUnderEquality(
      JSType t1, JSType t2, JSType t1Eq, JSType t2Eq) {
    // creating the pairs
    TypePair p12 = t1.getTypesUnderEquality(t2);
    TypePair p21 = t2.getTypesUnderEquality(t1);

    // t1Eq
    assertTypeEquals(t1Eq, p12.typeA);
    assertTypeEquals(t1Eq, p21.typeB);

    // t2Eq
    assertTypeEquals(t2Eq, p12.typeB);
    assertTypeEquals(t2Eq, p21.typeA);
  }

  

  

  

  

  private void testGetTypesUnderInequality(
      JSType t1, JSType t2, JSType t1Eq, JSType t2Eq) {
    // creating the pairs
    TypePair p12 = t1.getTypesUnderInequality(t2);
    TypePair p21 = t2.getTypesUnderInequality(t1);

    // t1Eq
    assertTypeEquals(t1Eq, p12.typeA);
    assertTypeEquals(t1Eq, p21.typeB);

    // t2Eq
    assertTypeEquals(t2Eq, p12.typeB);
    assertTypeEquals(t2Eq, p21.typeA);
  }


  /**
   * Tests the factory method
   * {@link JSTypeRegistry#createRecordType}.
   */
  

  /**
   * Tests the factory method {@link JSTypeRegistry#createOptionalType(JSType)}.
   */
  

  public void assertUnionContains(UnionType union, JSType type) {
    assertTrue(union + " should contain " + type, union.contains(type));
  }

  /**
   * Tests the factory method
   * {@link JSTypeRegistry#createAnonymousObjectType}}.
   */
  

  /**
   * Tests the factory method
   * {@link JSTypeRegistry#createAnonymousObjectType}} and adds
   * some properties to it.
   */
  

  /**
   * Tests the factory methods
   * {@link JSTypeRegistry#createObjectType(ObjectType)}} and
   * {@link JSTypeRegistry#createObjectType(String, Node, ObjectType)}}.
   */
  

  /**
   * Tests {@code (U2U_CONSTRUCTOR,undefined) <: (U2U_CONSTRUCTOR,undefined)}.
   */
  

  /**
   * Tests {@code U2U_FUNCTION_TYPE <: U2U_CONSTRUCTOR} and
   * {@code U2U_FUNCTION_TYPE <: (U2U_CONSTRUCTOR,undefined)}.
   */
  

  /**
   * Assert that a type can assign to itself.
   */
  private void assertTypeCanAssignToItself(JSType type) {
    assertTrue(type.isSubtype(type));
  }

  /**
   * Tests that hasOwnProperty returns true when a property is defined directly
   * on a class and false if the property is defined on the supertype or not at
   * all.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static boolean containsType(
      Iterable<? extends JSType> types, JSType type) {
    for (JSType alt : types) {
      if (alt.isEquivalentTo(type)) {
        return true;
      }
    }
    return false;
  }

  private static boolean assertTypeListEquals(
      Iterable<? extends JSType> typeListA,
      Iterable<? extends JSType> typeListB) {
    for (JSType alt : typeListA) {
      assertTrue(
          "List : " + typeListA + "\n" +
          "does not contain: " + alt,
          containsType(typeListA, alt));
    }
    for (JSType alt : typeListB) {
      assertTrue(
          "List : " + typeListB + "\n" +
          "does not contain: " + alt,
          containsType(typeListB, alt));
    }
    return false;
  }

  private ArrowType createArrowType(Node params) {
    return registry.createArrowType(params);
  }
}
