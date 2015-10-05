package ufo.hackerrank;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */

@RunWith(BlockJUnit4ClassRunner.class)
public abstract class BaseTest {

	@Rule public final TestName name = new TestName();
	private Date startTime;

	private static final InputStream defaultInputStream = System.in;
	private static final PrintStream defaultOutptStream = System.out;

	@Before
	public void setUpBeforeTest() {
		startTime = new Date();
		defaultOutptStream.println("===================================================================");
		defaultOutptStream.println("BEGIN TEST " + name.getMethodName());
		defaultOutptStream.println("===================================================================");
	}


	@After
	public void tearDownAfterTest() {
		final String time = new BigDecimal( new Date().getTime() - startTime.getTime() ).divide(new BigDecimal(1000)).toString();

		System.setIn(defaultInputStream);
		System.setOut(defaultOutptStream);

		defaultOutptStream.println("===================================================================");
		defaultOutptStream.println("END TEST " + name.getMethodName());
		defaultOutptStream.println("Execution time: " + time + " seconds");
		defaultOutptStream.println("===================================================================");
	}

	protected void setInput(String line) {
		setInput(new String[] { line });
	}

	private List<String> output = new ArrayList<>();

	protected void setInput(String[] lines) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < lines.length; i++) {
			buffer.append(lines[i]);
			if (i != (lines.length + 1)) {
				buffer.append("\n");
			}
		}
		InputStream stubInputStream = IOUtils.toInputStream(buffer.toString());
		System.setIn(stubInputStream);

		System.setOut(new PrintStream(System.out) {
			@Override
			public void println(String text) {
				output.add(text);
				super.println(text);
			}
		});
	}

	protected void verifyOutput(String[] expectedOutput) {
		assertEquals(expectedOutput.length, output.size());
		for (int i=0; i<expectedOutput.length; i++) {
			assertEquals(expectedOutput[i], output.get(i));
		}
	}

}
