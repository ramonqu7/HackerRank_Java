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

public class BobTheAdventurerTest {

	@Test
	public void test() {
		final BobTheAdventurer.Point2D[] points = new BobTheAdventurer.Point2D[] {
				new BobTheAdventurer.Point2D(-1,-2),
				new BobTheAdventurer.Point2D(1,2),
				new BobTheAdventurer.Point2D(2,4),
				new BobTheAdventurer.Point2D(-3,2),
				new BobTheAdventurer.Point2D(2,-2),
				new BobTheAdventurer.Point2D(8,-8)
		};

		assertEquals(4, new BobTheAdventurer().solution(points));

	}

	@Test
	public void testZero() {
		final BobTheAdventurer.Point2D[] points = new BobTheAdventurer.Point2D[] {
		};

		assertEquals(0, new BobTheAdventurer().solution(points));

	}

	@Test
	public void testOne() {
		final BobTheAdventurer.Point2D[] points = new BobTheAdventurer.Point2D[] {
			new BobTheAdventurer.Point2D(8,-8)
		};

		assertEquals(1, new BobTheAdventurer().solution(points));

	}

}
