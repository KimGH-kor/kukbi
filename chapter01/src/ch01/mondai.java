package ch01;

public class mondai {
	public static void main(String[] args) {
		int a, b, x;
		//0. 반지름이 x인 피자(원)을 정확히 8등분 했을때 1조각의 넓이
		x = 4;
		System.out.println((x*x*Math.PI)/8);
		//1. 정수 x의 절대값을 구하시오
		x = -1;
		System.out.println(Math.abs(x));
		//2. 정수 a와 b의 차이를 절대값으로 나타내시오
		a = 5;
		b = 10;
		System.out.println(Math.abs(a-b));
		//3. 3자리 정수 x의 각자리의 수의 합
		x = 321;
		int sum = 0;
		int tem;
		while(x > 0) {
			tem = x%10;
			sum += tem;
			x /= 10;
		}
		System.out.println(sum);
		//4. 1부터 10까지 홀수를 출력하시오.
		for(int i = 1; i < 11; i++) {
			if(i%2 ==1) {
				System.out.println(i);
			}
		}
		//5. 1부터 10까지 3의 배수를 출력
		for(int i = 1; i < 11; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		//6. 1부터 x까지 정수들의 합을 구하시오.
		x = 20;
		sum = 0;
		for(int i = 1; i < x; i++) {
			sum += i;
		}
		System.out.println(sum);
		//7. 1부터 x까지 짝수들의 합을 구하시오.
		sum = 0;
		for(int i = 0; i < x; i++) {
			if(i%2 == 0) {
			sum +=i;
			}
		}
		System.out.println(sum);
		
		//8. x의 약수를 출력하시오.
		for(int i = 1; i < x; i++) {
			if(x%i == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//9. x가 소수(primenumber)인지 판별하시오.
		int count = 0;
		for(int i = 2; i < x; i++) {
			if(x%i ==0) {
				count++;
			}
		}
		if(count != 0 || x == 1) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		
		//10. x개의 피보나치수열을 출력해보시오
		//x=10 인경우
		//0 1 1 2 3 5 8 13 21 34를 출력
		x = 8;
		for(int i = 0; i <= x; i++) {
		System.out.print(pibo(i)+" ");
		}
	}
	public static int pibo(int i) {
		if(i < 2) {
			return i;
		}
		if(i == 2) {
			return 1;
		}
		return pibo(i-1)+pibo(i-2);
	}
}

 
