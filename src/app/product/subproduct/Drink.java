package app.product.subproduct;

import app.product.Product;

public class Drink extends Product {
	boolean straw;  //음료의 옵션 : 빨대 유무

	public Drink(int id, String name, int kcal, int price, boolean straw) {
		super(id, name, kcal, price);
		this.straw = straw;
	}

	public boolean isStraw() {
		return straw;
	}
}
