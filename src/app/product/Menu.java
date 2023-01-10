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

		System.out.println("[🔻] 메뉴");
		System.out.println("-".repeat(60));

		printChickens();
		printSides();
		printDrinks();

		System.out.println();
		System.out.println("🧺 (0) 장바구니");
		System.out.println("📦 (+) 주문하기");
		System.out.println("-".repeat(60));
		System.out.print("[📣] 메뉴를 선택해주세요 : ");

	}

	private void printDrinks() {
		System.out.println("🥤 음료");
		for(Product product : products){
			if(product instanceof Drink){
				printEachMenu("   (%d) %s %5dKcal %5d원\n", product);
			}
		}
		System.out.println();
	}

	private void printSides() {
		System.out.println("🍟 사이드");
		for(Product product : products){
			if(product instanceof Side){
				printEachMenu("   (%d) %s %5dKcal %5d원\n", product);
			}
		}
		System.out.println();
	}

	private void printChickens() {
		System.out.println("치킨");
		//타입 : 엘레먼트 : 루프를 돌릴 객체
		for (Product product : products){
			if(product instanceof Chicken){
				printEachMenu("   (%d) %s %5dKcal %5d원\n", product);
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
