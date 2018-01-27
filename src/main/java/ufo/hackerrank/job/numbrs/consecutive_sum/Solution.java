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
package ufo.hackerrank.job.numbrs.consecutive_sum;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// Consecutive Sum
public class Solution {

    /*
     * Complete the function below.
     */
    static int consecutive(long num) {

    	int solutions = 0;

    	for (long i=1; i<num; i++) {
    		if (isConsecutiveFrom(num, i)) {
    			solutions++;
    		}
    	}

    	return solutions;

    }

    static boolean isConsecutiveFrom(long target, long min) {
    	long accumulator = min;
    	long next = min + 1;
    	while (true) {
    		if (accumulator == target) {
    			return true;
    		}
    		if (accumulator > target) {
    			return false;
    		}
    		accumulator = accumulator + next;
    		next++;
    	}

    }

    public static void main(String[] args) throws IOException {
        final Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        long num;
        num = Long.parseLong(in.nextLine().trim());

        res = consecutive(num);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }

}
