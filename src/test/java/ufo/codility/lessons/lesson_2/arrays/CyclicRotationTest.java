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
package ufo.codility.lessons.lesson_2.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

import ufo.BaseTest;

public class CyclicRotationTest extends BaseTest {

	@Test
	public void test() {

		final CyclicRotation rot = new CyclicRotation();

		assertArrayEquals( new int[] {} , rot.solution(new int[] {}, 3)  );
		assertArrayEquals( new int[] {3, 8, 9, 7, 6} , rot.solution(new int[] {3, 8, 9, 7, 6}, 10)  );
		assertArrayEquals( new int[] {3, 8, 9, 7, 6} , rot.solution(new int[] {3, 8, 9, 7, 6}, 0)  );
		assertArrayEquals( new int[] {9, 7, 6, 3, 8} , rot.solution(new int[] {3, 8, 9, 7, 6}, 3)  );

	}

}
