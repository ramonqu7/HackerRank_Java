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
package ufo.codility.lessons.lesson_3.timeComplexity;

import static org.junit.Assert.*;

import org.junit.Test;

import ufo.BaseTest;
import ufo.codility.lessons.lesson_3.timeComplexity.PermMissingElem;

public class PermMissingElemTest extends BaseTest {

	@Test
	public void test() {
		final PermMissingElem perm = new PermMissingElem();

		assertEquals( 4, perm.solution(new int[] {2,3,1,5}) );
		assertEquals( 1, perm.solution(new int[] {2,3,4,5}) );
		assertEquals( 5, perm.solution(new int[] {2,3,1,4}) );

	}

}
