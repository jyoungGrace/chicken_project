package app.product.subproduct;

import app.product.Product;

public class Chicken extends Product {
	private boolean delivery;

	public Chicken(int id, String name, int kcal, int price, boolean delivery) {
		super(id, name, kcal, price);
		this.delivery = delivery;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}
}
