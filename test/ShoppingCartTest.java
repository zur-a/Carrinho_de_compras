import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void carrinhoNovoPossuiZeroItens() {
		ShoppingCart cart = new ShoppingCart();
		assertEquals(0, cart.getItemCount());
	}

}
