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

import java.util.Scanner;

public class SimpleArraySum {

    static int simpleArraySum(int n, int[] ar) {
		int sum = 0;
        for (final int element : ar) {
			sum = sum + element;
		}
		return sum;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in);) {
	        final int n = in.nextInt();
	        final int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        final int result = simpleArraySum(n, ar);
	        System.out.println(result);
        }
    }

}
