/*******************************************************************************
 * Copyright 2018 Francesco Cina'
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

import static org.junit.Assert.*;

import org.junit.Test;

import ufo.hackerrank.BaseTest;

public class CompareTheTripletsTest extends BaseTest {

	@Test
	public void test() {
		int[] result = CompareTheTriplets.solve(0,0,0,0,0,0);
		assertEquals(0, result[0]);
		assertEquals(0, result[1]);

		result = CompareTheTriplets.solve(1,2,3,1,2,3);
		assertEquals(0, result[0]);
		assertEquals(0, result[1]);

		result = CompareTheTriplets.solve(1,2,3,0,0,0);
		assertEquals(3, result[0]);
		assertEquals(0, result[1]);

		result = CompareTheTriplets.solve(0,0,0,1,2,3);
		assertEquals(0, result[0]);
		assertEquals(3, result[1]);

		result = CompareTheTriplets.solve(1,2,3,1,4,1);
		assertEquals(1, result[0]);
		assertEquals(1, result[1]);
	}

}
