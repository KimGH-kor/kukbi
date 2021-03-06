package ch02;


public class 퀴즈고급 {
	
	public static void main(String[] args) {
		//<난이도 업! 문제.>
		//1. 배열에서 최대값을 찾아 리턴하는 메소드를 작성하시오.
		int arr[] = {1,5,9,7,4,8,3,6};
		System.out.println(Max(arr));
		//2. 배열의 최대값과 최소값을 제외한 평균을 구하는 메소드를 작성하시오.
		Avg(arr);
		//3. 정수를 전달받아 소수인지 판별하여 참 거짓을 반환하는 메소드를 작성하시오.
		int x = 11;
		System.out.println(Count(x));
		//4. 2~9단을 모두 출력하시오.
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i+"*"+j+"= "+(i*j)+" ");
			}
			System.out.println();
		}
		//5. 시간을 의미하는 4자리 정수 x를 아래와 같이 변환하시오.
		//x = 1630
		//오후 16시 30분
		//x = 1030
		//오전 10시 30분 
		x = 1630;
		if(x > 1200) {
			System.out.println("오후 "+(x/100)+"시 "+(x%100)+"분");
		}else {
			System.out.println("오전 "+(x/100)+"시 "+(x%100)+"분");
		}
		//6. 아래와 같은 규칙으로 지하철 요금을 계산하라!
		//1~5 정거장까지 요금 600원
		//6~10 정거장까지 요금 700원
		//11정거장부터 2정거장당 50원씩 추가요금
		//정거장수 = 13
		//요금은 800원입니다.
		//
		int 정거장 = 13;
		int money = 700;
		if(정거장 < 6) {
			money = 600;
		}else if(정거장 < 11) {
			money = 700;
		}else {
			for(int i = 11; i <= 정거장; i = i+2) {
				money += 50;
			}
		}
		System.out.println("요금은 "+money+"원입니다.");
		
		//아래의 결과가 나올수 있도록 출력해보시오(7~10)
		//7.
		//*****
		//*****
		//*****
		//*****
		//*****
		x=5;
		for(int i = 0 ; i < x; i++) {
			for(int j = 0; j < x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//8. 
		//x=5
		//*****
		//-----
		//*****
		//-----
		//*****
		for(int i = 0 ; i < x; i++) {
			for(int j = 0; j < x; j++) {
				if(i%2 == 1) {
				System.out.print("*");
				}else {
				System.out.print("-");
				}
			}
			System.out.println();
		}
		System.out.println();
		//9.
		//x=5
		//*-*-*
		//-*-*-
		//*-*-*
		//-*-*-
		//*-*-*
		char bool = '*';
		for(int i = 0 ; i < x; i++) {
			for(int j = 0; j < x; j++) {
				System.out.print(bool);
				if(bool == '*') {
					bool = '-';
				}else {
					bool = '*';
				}
			}
			System.out.println();
		}
		
		System.out.println();
		//10.
		//x=5
		//*---*
		//-*-*-
		//--*--
		//-*-*-
		//*---*
		int num = x-1;
		for(int i = 0 ; i < x; i++) {
			for(int j = 0; j < x; j++) {
				if(i == j) {
					System.out.print("*");
				}else if(j == num){
					System.out.print("*");
				}else{
				System.out.print("-");
				}
			}
			num--;
			System.out.println();
		}
	}
	
	//메서드들
	public static int Max(int[] arr) {
		int max = arr[0];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
		
	}
	
	public static int Min(int[] arr) {
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(min > arr[i]) {
				min = arr[i];
			}
			
		}
		return min;
	}
	public static void Avg(int arr[]) {
	int sum = 0;
	int max = Max(arr);
	int min = Min(arr);
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] == max || arr[i] == min) {
			continue;
		}
		sum += arr[i];
	}
	System.out.println((double)sum/(arr.length-2));
}

	
	public static String Count(int x) {
		for(int i = 2; i < x; i++) {
			if(x%i == 0) {
				return "false";
			}
		}
		return "true";
	}
}
