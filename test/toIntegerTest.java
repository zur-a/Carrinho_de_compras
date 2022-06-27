import static org.junit.Assert.*;

import org.junit.Test;

public class toIntegerTest {

	@Test
	public void test() {
		assertEquals(-3, Parser.toInteger("-3"));
		assertEquals(500, Parser.toInteger("500"));
		assertEquals(-10, Parser.toInteger("-10"));
		assertEquals(32767, Parser.toInteger("32767"));
	}
	
	@Test(expected=NumberFormatException.class)
	public void argumentosInvalidos() {
		assertEquals(23, Parser.toInteger("2 3"));
		assertEquals(3, Parser.toInteger("A3"));
		assertEquals(2.3, Parser.toInteger("2.3"), 0.000000001d);
		assertEquals(32768, Parser.toInteger("32768"));
	}
	
}
