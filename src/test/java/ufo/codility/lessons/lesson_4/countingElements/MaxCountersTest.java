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
package ufo.codility.lessons.lesson_4.countingElements;

import static org.junit.Assert.*;

import org.junit.Test;

import ufo.BaseTest;

public class MaxCountersTest extends BaseTest {

	@Test
	public void test() {
		final MaxCounters max = new MaxCounters();

		assertArrayEquals( new int[] {3, 2, 2, 4, 2} , max.solution(5, new int[] {3,4,4,6,1,4,4} ));

	}

}
