// Copyright 2008 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.android.stardroid.test.util;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test suite for all unit tests in the
 * com.google.android.stardroid.util package.
 */
public class AllTests {

  // No instances.
  private AllTests() {}

  public static Test suite() {
    TestSuite suite = new TestSuite("com.google.android.stardroid.util");
    //$JUnit-BEGIN$
    suite.addTestSuite(EqualsTesterTest.class);
    suite.addTestSuite(GeometryTest.class);
    suite.addTestSuite(ImmutableEqualsTesterTest.class);
    suite.addTestSuite(SiderealTimeRegressionTest.class);
    suite.addTestSuite(TimeUtilTest.class);
    suite.addTestSuite(VectorUtilTest.class);
    suite.addTestSuite(WeakHashSetTest.class);
    //$JUnit-END$
    return suite;
  }

}
