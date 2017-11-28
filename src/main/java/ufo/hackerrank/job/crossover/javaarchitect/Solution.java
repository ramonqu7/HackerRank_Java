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
package ufo.hackerrank.job.crossover.javaarchitect;

import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class Solution {

	static int lonelyInteger(int[] arr) {
		Map<Integer, Integer> occurrences = new HashMap<>();
		for (int value : arr) {
			boolean alreadyExist = occurrences.containsKey(value);
			if (!alreadyExist) {
				occurrences.put(value, 0);
			}
			occurrences.put(value, occurrences.get(value)+1);
		}

		int result = 0;

		for (java.util.Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
			if (entry.getValue().equals(1)) {
				result = entry.getKey();
			}
		}

		return result;
	}


	public static void main(String[] args) throws IOException{
        try (Scanner in = new Scanner(System.in);) {
	        //final String fileName = System.getenv("OUTPUT_PATH");
	        //BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        int res;
	
	        int _arr_size = Integer.parseInt(in.nextLine());
	        int[] _arr = new int[_arr_size];
	        int _arr_item;
	        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
	            _arr_item = Integer.parseInt(in.nextLine());
	            _arr[_arr_i] = _arr_item;
	        }
	
	        res = lonelyInteger(_arr);
	        System.out.println(res);
	        //bw.write(String.valueOf(res));
	        //bw.newLine();
	
	        //bw.close();
        }
    }

}
