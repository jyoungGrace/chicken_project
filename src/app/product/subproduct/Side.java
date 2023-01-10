package app.product.subproduct;
import app.product.Product;
import java.util.ArrayList;

public class Side extends Product {
	private boolean sauce;
	public Side(int id, String name, int kcal, int price, boolean sauce) {
		super(id, name, kcal, price);
		this.sauce = sauce;
	}

	public boolean isSauce() {
		return sauce;
	}

	public void setSauce(boolean sauce) {
		this.sauce = sauce;
	}

	//	ArrayList<String> sauce = new ArrayList<>();
//
//
//	public void setSauce(ArrayList<String> sauce) {
//		this.sauce = sauce;
//	}
//
//	public ArrayList<String> getSauce() {
//		return sauce;
//	}
}
