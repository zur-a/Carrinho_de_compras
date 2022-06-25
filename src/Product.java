
public class Product {
	private String title;
	private double price;
	
	public Product(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
		
	public boolean equals(Object object) {
		if(object instanceof Product) {
			Product product = (Product) object;
			return product.getTitle().equals(title);
		}
		return false;
	}


}
