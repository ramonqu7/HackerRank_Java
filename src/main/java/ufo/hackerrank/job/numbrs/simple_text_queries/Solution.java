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
package ufo.hackerrank.job.numbrs.simple_text_queries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// Simple Text Queries
public class Solution {

    /*
     * Complete the function below.
     */
    static void textQueries(String[] sentences, String[] queries) {
    	final List<List<Integer>> results = new ArrayList<>();

		for (final String querie : queries) {
			final List<Integer> queryResult = new ArrayList<>();
			results.add(queryResult);

			if (!querie.trim().isEmpty()) {
				final String[] queryWords = querie.trim().replaceAll(" +", " ").split(" ");
				for (int j = 0; j < sentences.length; j++) {
					final String[] sentenceWords = sentences[j].trim().replaceAll(" +", " ").split(" ");

					if (sentenceWords.length>0 && containsAll(sentenceWords, queryWords)) {
						queryResult.add(j);
					}
				}
			}
		}

    	for (final List<Integer> queryResult : results) {
    		if (!queryResult.isEmpty()) {
    			final StringBuffer print = new StringBuffer();
    			queryResult.forEach(value -> print.append(value + " "));
    			System.out.println(print.toString().trim());
    		} else {
    			System.out.println(-1);
    		}
    	}

    }

    static boolean containsAll(String[] sentenceWords, String[] queryWords) {
    	   return Arrays.asList(sentenceWords).containsAll(Arrays.asList(queryWords));
    }

    public static void main(String[] args)  {
        final Scanner in = new Scanner(System.in);
        int sentences_size = 0;
        sentences_size = Integer.parseInt(in.nextLine().trim());

        final String[] sentences = new String[sentences_size];
        for(int i = 0; i < sentences_size; i++) {
            String sentences_item;
            try {
                sentences_item = in.nextLine();
            } catch (final Exception e) {
                sentences_item = null;
            }
            sentences[i] = sentences_item;
        }

        int queries_size = 0;
        queries_size = Integer.parseInt(in.nextLine().trim());

        final String[] queries = new String[queries_size];
        for(int i = 0; i < queries_size; i++) {
            String queries_item;
            try {
                queries_item = in.nextLine();
            } catch (final Exception e) {
                queries_item = null;
            }
            queries[i] = queries_item;
        }

        textQueries(sentences, queries);

    }
}
