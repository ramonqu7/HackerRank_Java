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


public class MaxCounters {

    public int[] solution(int N, int[] A) {
    	int base = 0;
        int max = 0;
        int[] result = new int[N];

        for (int op : A) {
        	op = op - 1;
        	if (op<N) {
        		final int newValue = result[op]+1;
        		result[op] = newValue;
        		max = Math.max(max, newValue);
        	} else {
        		result = new int[N];
        		base = max + base;
        		max = 0;
        	}
		}

        for (int i = 0; i < result.length; i++) {
			result[i] = result[i] + base;
		}
        return result;
    }

}
