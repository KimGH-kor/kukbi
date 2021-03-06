package ch02;

public class 퀴즈 {
	public static void main(String[] args) {
//		<기본문제.>
		//1. 정수 x가 짝수인지 홀수인지 판별하시오.
		int x = 312;
		if(x % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		//2. 정수 x가 음수인지 양수인지 0인지 판별하시오.
		if(x > 0) {
			System.out.println("양수 입니다.");
		}else {
			System.out.println("음수 입니다.");
		}
		//3. 국어, 영어, 수학 점수를 kor, eng, math에 저장후 평균을 구하시오
		int kor = 90;
		int eng = 88;
		int math = 100;
		int aver = (kor+eng+math)/3;
		System.out.println(aver);
	//   그리고 평균점수에 따른 평점을 출력하시오 (if문 사용)
	//   90이상 A, 80이상 B ... 60미만 F
		if(aver > 90) {
			System.out.println("학점 A");
		}else if(aver >80) {
			System.out.println("학점 B");
		}else if(aver > 70) {
			System.out.println("학점 C");
		}else if(aver > 60) {
			System.out.println("학점 D");
		}else {
			System.out.println("fail");
		}
		//4. 3번문제를 switch case 문으로 해결하시오.
		switch(aver/10) {
		case 9: case 10:
			System.out.println("학점 A");
			break;
		case 8 :
			System.out.println("학점 B");
			break;
		case 7 :
			System.out.println("학점 C");
		break;
		case 6 :
			System.out.println("학점 D");
		break;
		default :
			System.out.println("fail");
		}
		//5. 정수 x부터 시작해 0까지 차례로 감소하며 출력하시오. (while문 사용)
			x = 10;
			while(x>=0) {
				System.out.print(x+" ");
				x--;
			}
		System.out.println();
		//6. 5번 문제를 for문으로 해결하시오.
		for(int i = 10; i >= 0; i--) {
			System.out.print(i+ " ");
		}
		System.out.println();
		//7. 정수를 저장할 배열 10개를 생성후
		// 1부터 10까지 정수를 차례대로 저장하시오.
		int[] arr = new int[10];
		
		for(int i = 1; i <= arr.length; i++) {
			arr[i-1] = i;
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		//8. 정수를 저장할 배열 10개를 생성후
		// 10부터 100까지 10씩 증가하는 값을 차례대로 저장하시오.
		int[] arr1 = new int[10];
		int num = 10;
		for(int i = 0; i < 10; i++) {
			arr1[i] = num;
			num += 10;
		}
		//9. x단을 출력하시오.
		x = 3;
			for(int i = 1; i<10; i++) {
				System.out.println(x+"*"+i+" = "+(x*i));
			}
		//10. 배열을 전달받아 배열의 합을 리턴하는 메소드(함수) getSum(int arr[])를 작성하시오
		System.out.println(getSum(arr));
	}
	public static int getSum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
}
