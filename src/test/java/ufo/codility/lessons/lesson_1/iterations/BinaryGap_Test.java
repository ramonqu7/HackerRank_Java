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
package ufo.codility.lessons.lesson_1.iterations;

import static org.junit.Assert.*;

import org.junit.Test;

import ufo.BaseTest;
import ufo.codility.lessons.lesson_1.iterations.BinaryGap;

public class BinaryGap_Test extends BaseTest {

	@Test
	public void test() {
		final BinaryGap sol = new BinaryGap();
		assertEquals( 2 , sol.solution(9) );
		assertEquals( 4 , sol.solution(529) );
		assertEquals( 5 , sol.solution(1041) );
		assertEquals( 0 , sol.solution(15) );
		assertEquals( 0 , sol.solution(1024) );
	}

}
