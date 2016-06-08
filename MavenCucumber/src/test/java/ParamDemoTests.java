import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamDemoTests {

	int input1, input2, output;
	public ParamDemoTests(int input1, int input2, int output) {
		this.input1 = input1;
		this.input2 = input2;
		this.output = output;
	}
	@Parameters(name="{index} - {0}+{1}={2}")
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][]{
			{10,5,15},
			{20,10,30}
		});
	}
	@Test
	public void testAddition() {
		assertEquals(output, input1+input2);
		assertThat("Hello", Matchers.equalTo("Hello"));
	}
}
