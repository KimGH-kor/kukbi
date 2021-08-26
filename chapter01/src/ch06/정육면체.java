package ch06;

class 정육면{
	int 길이;
	int 너비;
	int 높이;
	int 부피;
	정육면(int 길이, int 너비, int 높이){
		this.길이 = 길이;
		this.너비 = 너비;
		this.높이 = 높이;
		부피 = 길이*너비*높이;
	}
	정육면(){
		this(1,1,1);
	}
	정육면(int 길이){
		this(길이,1,1);
	}
	정육면(int 길이, int 너비){
		this(길이,너비,1);
	}

	
	void 부피출력() {
		System.out.println(부피);
	}
	
}

public class 정육면체 {
	public static void main(String[] args) {
		정육면 정 = new 정육면(10, 2);
		정.부피출력();
	}
}
