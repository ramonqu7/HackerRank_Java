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
package ufo.codility.toptal;

import static org.junit.Assert.*;

import org.junit.Test;

public class GiraffesTest {

	@Test
	public void test() {
		final Giraffes g = new Giraffes();

		assertEquals(6, g.solution(new int[] {1,5,4,9,8,7,12,13,14}));
		assertEquals(1, g.solution(new int[] {4,3,2,6,1}));

	}

}
