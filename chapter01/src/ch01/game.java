package ch01;

public class game {
	public static void main(String[] args) {		
		for(int i = 1; i < 101; i++) {
			System.out.print(i +" = ");
			if(i/10 == 3||i/10 ==6||i/10 ==9) {
				System.out.print("짝 ");
			}
			if(i%10 == 3||i%10 ==6||i%10 ==9) {
				System.out.print("짝 ");
			}else if(!(i/10 == 3||i/10 ==6||i/10 ==9)) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}


//1. 3,6,9게임
//2. 3이라는 숫자나 6, 9라는 숫자가 들어가 있다면 박수 아니면 그냥 출력
//3. 33, 66 등 이라면 박수 2번

//일의 자리가 3,6,9
//십의 자리가 3,6,9