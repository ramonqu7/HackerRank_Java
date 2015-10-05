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
package ufo.hackerrank.algorithms.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Gemstones {

    public static void main(String[] args) throws Exception {

    	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    	int howMany = Integer.valueOf(read.readLine());

    	Set<Character> chars = new HashSet<>();
    	boolean firstRock = true;
    	for (int i=0; i<howMany; i++) {
    		checkAddOrRemove(firstRock, chars, read.readLine());
    		firstRock = false;
    	}

    	System.out.println(chars.size());

    }

    public static void checkAddOrRemove(boolean firstRock, Set<Character> chars, String rock) {
    	if (firstRock) {
    		char[] charArray = rock.toCharArray();
    		for (char c : charArray) {
    			chars.add(c);
    		}
    	} else {
    		Set<Character> charsToRemove = new HashSet<>();
    		for (Character c : chars) {
    			if (!rock.contains(c.toString())) {
    				charsToRemove.add(c);
    			}
    		}
    		chars.removeAll(charsToRemove);
    	}

    }


}
