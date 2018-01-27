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
package ufo.hackerrank.job.numbrs.consecutive_sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConsecutiveSum_SolutionTest {

	@Test
	public void test1() {
		assertEquals(3, Solution.consecutive(15));
		assertEquals(1, Solution.consecutive(10));
		assertEquals(3, Solution.consecutive(250));
	}

}
