package ch06;

public class Goods {
	String goodsCode;
	int stockNum;
	
	Goods(String code, int num){
		goodsCode = code;
		stockNum = num;
	}
	
	void addStock(int amount) {
		stockNum += amount;
	}
	
	int subtractStock(int amount) {
		if(stockNum < amount) {
			return 0;
		}
		stockNum -= amount;
		return amount;
	}
	
}
