import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void carrinhoVazioQuandoCriado() {
		ShoppingCart cart = new ShoppingCart();
		assertEquals(0, cart.getItemCount(), 0.000000001d);
	}

}
