import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void carrinhoNovoPossuiZeroItens() {
		ShoppingCart cart = new ShoppingCart();
		assertEquals(0, cart.getItemCount());
	}
	
	@Test
	public void carrinhoVazioPossuiZeroItens() {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new Product("Nintendo 3DS", 129.99));
		cart.addItem(new Product("Nintendo 3DSXL", 179.99));
		cart.empty();
		assertEquals(0, cart.getItemCount());
	}

}
