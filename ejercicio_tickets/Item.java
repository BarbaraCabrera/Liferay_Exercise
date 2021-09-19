package ejercicio_tickets;

public class Item {
	
	private String product;
	private int cuantity;
	private double price;
	private String category;
	private Boolean importation;
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getCuantity() {
		return cuantity;
	}
	public void setCuantity(int cuantity) {
		this.cuantity = cuantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Boolean getImportation() {
		return importation;
	}
	public void setImportation(Boolean importation) {
		this.importation = importation;
	}
	
}
