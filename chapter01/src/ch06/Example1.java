package ch06;

public class Example1 {
	public static void main(String[] args) {
		Goods gs = new Goods("51234",200);
		gs.addStock(1000);
		System.out.println(gs.stockNum);
	}
}
