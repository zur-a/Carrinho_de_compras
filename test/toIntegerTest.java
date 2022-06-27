import static org.junit.Assert.*;

import org.junit.Test;

public class toIntegerTest {

	@Test
	public void numeroInteiroPositivo() {
		assertEquals(500, Parser.toInteger("500"));
	}
	
	@Test
	public void numeroInteiroNegativo() {
		assertEquals(-3, Parser.toInteger("-3"));
	}
	
	@Test
	public void maiorNumeroInteiroPositivoPermitido() {
		assertEquals(32767, Parser.toInteger("32767"));
	}
	
	@Test
	public void menorNumeroInteiroNegativoPermitido() {
		assertEquals(-32768, Parser.toInteger("-32768"));
	}
	
	
	@Test(expected=NumberFormatException.class)
	public void naoDeveAceitarEspacosEmBranco() {
		assertEquals(23, Parser.toInteger("2 3"));
		
	}
	
	@Test(expected=NumberFormatException.class)
	public void naoDeveAceitarCaractere() {
		assertEquals(3, Parser.toInteger("A3"));
	}
	
	@Test(expected=NumberFormatException.class)
	public void naoDeveAceitarNumeroDecimal() {
		assertEquals(2.3, Parser.toInteger("2.3"), 0.000000001d);
	}
	
	@Test(expected=NumberFormatException.class)
	public void naoDeveAceitarNumeroAcimaDoLimiteDeShort() {
		assertEquals(32768, Parser.toInteger("32768"));
	}
	
	@Test(expected=NumberFormatException.class)
	public void naoDeveAceitarNumeroAbaixoDoLimiteDeShort() {
		assertEquals(-32769, Parser.toInteger("-32769"));
	}
	
	
}
