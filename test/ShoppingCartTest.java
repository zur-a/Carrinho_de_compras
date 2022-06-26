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
	
	@Test
	public void totalDeDoisItensNoCarrinho() {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new Product("Nintendo 3DS", 129.99));
		cart.addItem(new Product("Nintendo Switch", 179.99));
		assertEquals(2, cart.getItemCount());
	}
	
	@Test
	public void produtoAdicionadoAoCarrinhoAtualizaSaldo() {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new Product("Nintendo 3DS", 129.99));
		cart.addItem(new Product("Nintendo Wii", 179.99));
		cart.addItem(new Product("The Legend of Zelda", 60.00));
		assertEquals(369.98, cart.getBalance(), 0.000000001d);
	}

}
