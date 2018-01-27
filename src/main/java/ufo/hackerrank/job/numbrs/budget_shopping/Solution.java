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
package ufo.hackerrank.job.numbrs.budget_shopping;

public class Solution {

    	static int budgetShopping(int n, int[] bundleQuantities, int[] bundleCosts) {

    		if (    n <= 0
    				|| bundleCosts == null || bundleQuantities == null
    				|| bundleCosts.length == 0 || bundleQuantities.length == 0
    				|| bundleCosts.length != bundleQuantities.length
    				) {
	        	return 0;
	        }

	        final int[] max = {0};

	        calculateRecursive(n, bundleCosts, bundleQuantities, max, 0, 0);

	        return max[0];
	    }

    	static void calculateRecursive(int n, int[] cost, int[] quantity, int[] max, int position, int count) {
	        if (n == 0 || position == cost.length) {
                if (count>max[0]) {
                    max[0] = count;
                }
	            return;
	        }
	        for (int i = 0; i <= n/cost[position]; i++) {
	            calculateRecursive(n - i * cost[position], cost, quantity, max, position + 1, count + i * quantity[position]);
	        }
	    }

}
