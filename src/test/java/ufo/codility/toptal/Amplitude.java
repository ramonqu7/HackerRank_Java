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

public class Amplitude {

    public int solution(int[] A) {
        // write your code in Java SE 8

    	int result = 0;

    	if( A.length > 0) {
    		final int value = A[0];
    		result = calculate(0, value, value, A);
    	}
    	return result;
    }

    public int calculate(int index, int min, int max, int[] A) {
    	int count = 0;
    	if (index<A.length) {
    		final int current = A[index];

			if (Math.abs(current-min)<=1 && Math.abs(current-max)<=1 ) {
				for (int j = index+1; j < A.length; j++) {
					count = Math.max(count, calculate(j, Math.min(min, current), Math.max(max, current), A));
				}
				count++;
			} else {
				for (int j = index+1; j < A.length; j++) {
					count = Math.max(count, calculate(j, min, max, A));
				}
			}
    	}
    	return count;
    }

}
