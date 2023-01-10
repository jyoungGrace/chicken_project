package app.product;

public class Product {
	private int id;
	private String name;
	private int kcal;
	private int price;

	public Product(int id, String name, int kcal, int price) {
		this.id = id;
		this.name = name;
		this.kcal = kcal;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
