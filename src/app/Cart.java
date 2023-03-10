package app;

import app.product.Product;
import app.product.subproduct.Chicken;
import app.product.subproduct.Drink;
import app.product.subproduct.Side;

import java.util.Scanner;

public class Cart {
	private Product[] items = new Product[0];
	private Scanner scanner = new Scanner(System.in);

	void printCart(){
		System.out.println("๐งบ ์ฅ๋ฐ๊ตฌ๋");
		System.out.println("-".repeat(60));
		//์ฌ๊ธฐ์ ์ฅ๋ฐ๊ตฌ๋ ์ํ๋ค์ ์ต์ ์ ๋ณด์ ํจ๊ป ์ถ๋ ฅ
		printCartItemDetails();
		System.out.println("-".repeat(60));
		System.out.printf("ํฉ๊ณ : %d์\n", calculateTotalPrice());

		System.out.println("์ด์ ์ผ๋ก ๋์๊ฐ๋ ค๋ฉด ์ํฐ๋ฅผ ๋๋ฅด์ธ์. ");
		scanner.nextLine();
	}
	private void printCartItemDetails(){
		for(Product product : items){
			if(product instanceof Chicken){
				Chicken chicken = (Chicken) product;
				System.out.printf(
						" %s %6d(์) ์์ ์๋ น๋ฐฉ๋ฒ์ ์ ํํ์ธ์.\n",
						product.getName(),
						product.getPrice(),
						chicken.isDelivery()? "๋ฐฐ๋ฌ" : "ํฌ์ฅ"
				);
			}else if(product instanceof Side){
				System.out.printf(
						"%s %6d(์) ์์ค ์ข๋ฅ ์ ํํ์ธ์.\n",
						product.getName(),
						product.getPrice(),
						((Side) product).isSauce() ? "์ ํํจ" : "์ ํ์ํจ"
				);
			}else if(product instanceof Drink){
				System.out.printf(
						"%s %6d(์) ๋นจ๋ ์ ๋ฎค๋ฅผ ์ ํํด์ฃผ์ธ์.\n",
						product.getName(),
						product.getPrice(),
						((Drink) product).isStraw() ? "์์" : "์์"
				);
			}
		}
	}

	private int calculateTotalPrice(){
		int totalPrice = 0;
		for(Product product : items){
			totalPrice += product.getPrice();
		}
		return totalPrice;
	}

	public void addToCart(int productId){

		//Product product = productRepository.findId(productId);
	}
}
