import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {
	
	ShoppingCart cart = null;
	Product product1 = null;
	Product product2 = null;
	Product product3 = null;
	Product product4 = null;
	
	@Before
	public void setup() {
		cart = new ShoppingCart();
		product1 = new Product("Nintendo 3DS", 129.99);
		product2 = new Product("Nintendo Wii", 149.99);
		product3 = new Product("Nintendo Switch", 179.99);
		product4 = new Product("The Legend of Zelda", 60.00);
	}

	@Test
	public void carrinhoNovoPossuiZeroItens() {
		setup();
		assertEquals(0, cart.getItemCount());
	}
	
	@Test
	public void carrinhoVazioPossuiZeroItens() {
		setup();
		cart.addItem(product1);
		cart.addItem(product2);
		cart.empty();
		assertEquals(0, cart.getItemCount());
	}		
	
	@Test
	public void totalDeDoisItensNoCarrinho() {
		setup();
		cart.addItem(product1);
		cart.addItem(product3);
		assertEquals(2, cart.getItemCount());
	}
	
	@Test
	public void produtoAdicionadoAoCarrinhoAtualizaSaldo() {
		setup();
		cart.addItem(product1);
		cart.addItem(product3);
		cart.addItem(product4);
		assertEquals(369.98, cart.getBalance(), 0.000000001d);
	}
	
	@Test
	public void itemRemovidoDoCarrinhoDecresceOContadorDeItens() throws ProductNotFoundException {
		setup();
		cart.addItem(product1);
		cart.addItem(product3);
		cart.removeItem(product3);
		assertEquals(1, cart.getItemCount());
	}
	
	@Test(expected=ProductNotFoundException.class)
	public void remocaoDeProdutoInexistenteNoCarrinho() throws ProductNotFoundException {
		setup();
		cart.addItem(product1);
		cart.removeItem(product2);
	}

}
