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
package ufo.hackerrank.java.introduction;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Stdin_And_Stdout_2 {

	public static void main(String[] args) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		int inputInt;
		double inputDouble;
		String inputString;

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		inputInt = Integer.valueOf(read.readLine());
		inputDouble = Double.valueOf(read.readLine());
		inputString = read.readLine();

		System.out.println("String: " + inputString);
		System.out.println("Double: " + inputDouble);
		System.out.println("Int: " + inputInt);
	}

}
