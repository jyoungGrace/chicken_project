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
		System.out.println("🧺 장바구니");
		System.out.println("-".repeat(60));
		//여기에 장바구니 상품들을 옵션 정보와 함께 출력
		printCartItemDetails();
		System.out.println("-".repeat(60));
		System.out.printf("합계 : %d원\n", calculateTotalPrice());

		System.out.println("이전으로 돌아가려면 엔터를 누르세요. ");
		scanner.nextLine();
	}
	private void printCartItemDetails(){
		for(Product product : items){
			if(product instanceof Chicken){
				Chicken chicken = (Chicken) product;
				System.out.printf(
						" %s %6d(원) 음식 수령방법을 선택하세요.\n",
						product.getName(),
						product.getPrice(),
						chicken.isDelivery()? "배달" : "포장"
				);
			}else if(product instanceof Side){
				System.out.printf(
						"%s %6d(원) 소스 종류 선택하세요.\n",
						product.getName(),
						product.getPrice(),
						((Side) product).isSauce() ? "선택함" : "선택안함"
				);
			}else if(product instanceof Drink){
				System.out.printf(
						"%s %6d(원) 빨대 유뮤를 선택해주세요.\n",
						product.getName(),
						product.getPrice(),
						((Drink) product).isStraw() ? "있음" : "없음"
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
