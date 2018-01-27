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

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import ufo.BaseTest;

public class SimpleTextQueries_SolutionTest extends BaseTest {

	@Test
	public void test1() throws IOException {
		setInput("3",
				"it go will away",
				"go do art",
				"what to will east",
				"3",
				"it will",
				"go east will",
				"will");

		Solution.main(new String[]{});

		verifyOutput("0",
				"-1",
				"0 2");
	}

	@Test
	public void test2() throws IOException {
		setInput("3",
				"it go will away",
				"go do art",
				"what to will east",
				"1",
				"will");

		Solution.main(new String[]{});

		verifyOutput(
				"0 2");
	}

	@Test
	public void test3() throws IOException {
		setInput("3",
				"it go will away",
				"go do art",
				"what to will east",
				"2",
				"willt",
				"willp");

		Solution.main(new String[]{});

		verifyOutput(
				"-1","-1");
	}

	@Test
	public void test4() throws IOException {
		setInput("3",
				" it go        will away ",
				"go do art",
				"what to will east",
				"2",
				" it go  will away ",
				"");

		Solution.main(new String[]{});

		verifyOutput(
				"0","-1");
	}

	@Test
	public void test5() throws IOException {
		setInput("3",
				" it go        will away ",
				"go do art",
				"what to will east",
				"2",
				" it go  will away ",
				"");

		Solution.main(new String[]{});

		verifyOutput(
				"0","-1");
	}

	@Test
	public void test6() throws IOException {
		setInput("3",
				" ",
				"go do art",
				"",
				"2",
				" it go  will away ",
				" ");

		Solution.main(new String[]{});

		verifyOutput(
				"-1","-1");
	}

	@Test
	public void testSplit() {
		System.out.println(Arrays.asList(" it go        will away ".trim().replaceAll(" +", " ").split(" ")));
		System.out.println(Arrays.asList("".trim().replaceAll(" +", " ").split(" ")));
	}
}
