/*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson;

import java.util.LinkedList;
import java.util.List;

import junit.framework.TestCase;

/**
 * Unit tests for the {@link DisjunctionExclusionStrategy} class.
 *
 * @author Joel Leitch
 */
public class DisjunctionExclusionStrategyTest extends TestCase {

  private static final ExclusionStrategy FALSE_STRATEGY = new MockExclusionStrategy(false, false);
  private static final ExclusionStrategy TRUE_STRATEGY = new MockExclusionStrategy(true, true);
  private static final Class<?> CLAZZ = String.class;
  private static final FieldAttributes FIELD = new FieldAttributes(CLAZZ, CLAZZ.getFields()[0]);

  

  

  
}
