/*******************************************************************************
 * Copyright 2015 Francesco Cina'
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package ufo.hackerrank.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;

import ufo.BaseTest;

public class SimpleArraySum_Test extends BaseTest {

	@Test
	public void test_empty() {
		int n = 0;
		int[] array = new int[]{};
		Assert.assertEquals(0, SimpleArraySum.simpleArraySum(n, array));
	}

	@Test
	public void test_1() {
		int n = 0;
		int[] array = new int[]{10,20,30};
		Assert.assertEquals(60, SimpleArraySum.simpleArraySum(n, array));
	}

}
