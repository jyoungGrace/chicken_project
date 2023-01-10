package app.product;

import app.product.subproduct.Chicken;
import app.product.subproduct.Drink;
import app.product.subproduct.Side;


public class ProductRepositoy {
	private Product[] products = {
			new Chicken (1, "황금올리브", 400,  12000, false),
			new Chicken (2, "자메이카",   500,  18000, false),
			new Side    (3, "치즈볼",     200,  1000,  false),
			new Side    (4, "감자튀김",   200,  1000,  false),
			new Drink   (5, "펩시제로",  0,     1000,  false),
			new Drink   (6, "맥주",      150,   1000,  false)
	};

	public Product[] getProducts() {
		return products;
	}

	public Product findById(int productId){
		for(Product product : products){
			if(product.getId() == productId) return product;
		}
		return null;
	}
}
