import static org.junit.Assert.*;

import org.junit.Test;

public class toIntegerTest {

	@Test
	public void test() {
		assertEquals(-3, Parser.toInteger("-3"));
		assertEquals(500, Parser.toInteger("500"));
		assertEquals(-10, Parser.toInteger("-10"));
	}
	
}
