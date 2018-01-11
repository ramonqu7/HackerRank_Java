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

import java.util.Scanner;

public class CompareTheTriplets {

	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		final int[] result = new int[2];
		compareValues(a0, b0, result);
		compareValues(a1, b1, result);
		compareValues(a2, b2, result);
		return result;
	}

	private static void compareValues(int a, int b, int[] result) {
		if (a>b) {
			result[0] = result[0] + 1;
		}
		if (a<b) {
			result[1] = result[1] + 1;
		}
	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int a0 = in.nextInt();
			final int a1 = in.nextInt();
			final int a2 = in.nextInt();
			final int b0 = in.nextInt();
			final int b1 = in.nextInt();
			final int b2 = in.nextInt();
			final int[] result = solve(a0, a1, a2, b0, b1, b2);
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
			}
			System.out.println("");
		}
	}
}
