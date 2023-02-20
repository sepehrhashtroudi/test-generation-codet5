package com.google.gson.functional;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.common.TestTypes.BagOfPrimitives;

/**
 * Functional tests for {@link Gson#toJsonTree(Object)} and 
 * {@link Gson#toJsonTree(Object, java.lang.reflect.Type)}
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class JsonTreeTest extends TestCase {
  private Gson gson;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new Gson();
  }

  

  

  

  private void assertContains(JsonObject json, JsonPrimitive child) {
    for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
      JsonElement node = entry.getValue();
      if (node.isJsonPrimitive()) {
        if (node.getAsJsonPrimitive().equals(child)) {
          return;
        }
      }
    }
    fail();
  }
  
  private static class SubTypeOfBagOfPrimitives extends BagOfPrimitives {
    @SuppressWarnings("unused")
    float f = 1.2F;
    public SubTypeOfBagOfPrimitives(long l, int i, boolean b, String string, float f) {
      super(l, i, b, string);
      this.f = f;
    }
  }
}
