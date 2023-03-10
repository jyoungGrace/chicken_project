package app.product;

import app.product.subproduct.Chicken;
import app.product.subproduct.Drink;
import app.product.subproduct.Side;

public class Menu {
	private Product[] products;

	public Menu(Product[] products){
		this.products = products;
	}

	public void printMenu(){

		System.out.println("[๐ป] ๋ฉ๋ด");
		System.out.println("-".repeat(60));

		printChickens();
		printSides();
		printDrinks();

		System.out.println();
		System.out.println("๐งบ (0) ์ฅ๋ฐ๊ตฌ๋");
		System.out.println("๐ฆ (+) ์ฃผ๋ฌธํ๊ธฐ");
		System.out.println("-".repeat(60));
		System.out.print("[๐ฃ] ๋ฉ๋ด๋ฅผ ์ ํํด์ฃผ์ธ์ : ");

	}

	private void printDrinks() {
		System.out.println("๐ฅค ์๋ฃ");
		for(Product product : products){
			if(product instanceof Drink){
				printEachMenu("   (%d) %s %5dKcal %5d์\n", product);
			}
		}
		System.out.println();
	}

	private void printSides() {
		System.out.println("๐ ์ฌ์ด๋");
		for(Product product : products){
			if(product instanceof Side){
				printEachMenu("   (%d) %s %5dKcal %5d์\n", product);
			}
		}
		System.out.println();
	}

	private void printChickens() {
		System.out.println("์นํจ");
		//ํ์ : ์๋ ๋จผํธ : ๋ฃจํ๋ฅผ ๋๋ฆด ๊ฐ์ฒด
		for (Product product : products){
			if(product instanceof Chicken){
				printEachMenu("   (%d) %s %5dKcal %5d์\n", product);
			}
		}
		System.out.println();
	}

	private static void printEachMenu(String format, Product product) {
		System.out.printf(
				format,
				product.getId(), product.getName(), product.getKcal(), product.getPrice()
		);
	}
}
