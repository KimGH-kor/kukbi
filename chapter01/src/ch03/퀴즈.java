package ch03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class 퀴즈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		//<심화문제.>
		
		line();
		Title("30과 10의 공배수");
		//1. 100보다 작은 a와 b의 공배수를 구하시오.
		//공베수 =  a의 배수 중에 b의 배수가 있는 것
		int a = 30;
		int b = 10;
		int tem = 1;
		
		for(int i = 1; i <100;i++) {
			if(i % a == 0 && i % b == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.print("....");
		System.out.println();
		line();
		Title("30과 10의 공약수");
		//2. a와 b의 공약수를 구하시오.
		//공약수 = 공통으로 나누어 지는수
		for(int i = 1; i <=b;i++) {
			if(a % i == 0 && b % i == 0) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
		line();
		Title("30과 10의 최대 공약수");
		//3. a와 b의 최대 공약수를 구하시오. (유클리드 알고리즘 활용할 것)
		// 나눈 나머지를 작은 수에 나누고 다시 나온 나머지를 처음 나머지를 나누는 패턴
		// 결과값이 0보다 작다면 바로 앞에 값 리턴
		while(b > 0) {
			tem = a;
			a = b;
			b = tem%b;
		}
		System.out.println(a);
		line();
		Title("5263 각자리 합");
		//4. 정수 x의 각자리수의 합을 구하시오.
		//ex)
		//x = 1234
		//실행결과 10
		//x = 12345
		//실행결과 15
		int x = 5263;
		int sum = 0;
		while(x >0) {
			sum += x%10;
			x /= 10;
		}
		System.out.println(sum);
		line();
		Title("1234 뒤집어 출력");
		//5. 정수 x의 자릿수를 뒤집어 정수 y에 저장후 y를 출력하시오.
		//ex)
		//x = 1234
		////코드작성
		//System.out.println(y) //y는 정수타입변수
		//실행결과 : 4321
		x = 1234;
		int y = 0;
		while(x > 0) {
			y = y*10 + x%10;
			x /=10;
		}
		System.out.println(y);
		line();
		Title("십진수 10을 이진수로 변환");
		//6. 십진수 x를 이진수로 변환출력하시오.
		//ex)
		//x = 10
		//출력 : 1010
		x= 10;
		double two =0;
		int count = 1;
		
		while(x > 0) {
			two = (two + x%2)/10;
			x /=2;
			count *= 10;
		}	
		System.out.println((int)(two*count));
		line();
		Title("박수 한번 369게임");
		//7. 100보다 작은 369 게임을 출력하시오.(*은 박수, 박수는 한번만 치는 것으로 가정)
		//ex)
		//1 2 * 4 5 * 7 8 * 10 11 12 * 14 ...
		//28 * * *
			for(int i = 1; i < 101; i++) {
				System.out.print(i +" = ");
				if(i/10 == 3||i/10 ==6||i/10 ==9) {
					System.out.print("* ");
				}else if(i%10 == 3||i%10 ==6||i%10 ==9) {
					System.out.print("* ");
				}else {
					System.out.print(i+" ");
			}
		}
		System.out.println();
		line();
		Title("박수 두번 369게임");
		//8. 7번문제의 박수횟수를 3,6,9 갯수만큼 출력할 수 있도록 수정하시오.
		//ex)
		//28 *(30) *(31) *(32) **(33) *(34) *(35) **(36) ... 
		for(int i = 1; i < 101; i++) {
			System.out.print(i +" = ");
			if(i/10 == 3||i/10 ==6||i/10 ==9) {
				System.out.print("* ");
			}
			if(i%10 == 3||i%10 ==6||i%10 ==9) {
				System.out.print("* ");
			}else if(!(i/10 == 3||i/10 ==6||i/10 ==9)) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		line();
		Title("UP DOWN 게임 시작~~");
		//9. 랜덤수 x를 맞추기 위한 아래와 같은 결과를 출력하는 코드를 작성하시오.
		//*외부기능은 import 해서 사용가능
		//실행결과
		//1~100사이의 랜덤수 맞추기
		//입력 : 10
		//Up!
		//입력 : 15
		//Down!
		//입력 : 13
		//Down!
		//입력 : 11
		//정답입니다.		

		System.out.println("숫자를 입력해서 1~100안의 숫자를 5번 안에 찾으시오");
//		int q = (int)((Math.random()*100)+1);
		int q = rd.nextInt(99)+1;
		int updown = 0;
		while(true) {
			int num = sc.nextInt();
			if(num > q) {
				System.out.println("Down!");
			}else if(num < q) {
				System.out.println("Up!");
			}else {
				System.out.println("정답입니다.");
				break;
			}
			updown++;	
		}
		if(updown < 5) {
			System.out.println("축하합니다!! 5번의 기회 중 총 "+updown+"번의 선택으로 이기셨습니다.");
		}else {
			System.out.println("다음 기회에... 총 횟수 "+updown+"번");
		}
		System.out.println();
		line();
		Title("1등 당첨 로또 샵");
		//10. 아래와 같은 로또생성기를 작성하시오.
		//*각게임의 결과는 정렬되어 출력 있음.
		//게임 횟수 입력 : 3
		//game 1 : 5 7 21 44 45
		//game 2 : 1 4 8 11 25 41
		//game 3 : 3 4 14 16 31 39
		//해쉬셋
		System.out.println("몇개를 구입하시겠습니까 갯수를 입력해 주세요");
		int lott = sc.nextInt();
		int[] arr = new int[6];
		
		int game = 1;
		while(lott > 0) {
			HashSet<Integer> hash = new HashSet<Integer>();;
			while(hash.size()<6) {
				hash.add(rd.nextInt(45)+1);
			}
			int m = 0;
			for(Integer i : hash) {
				arr[m] = i;
				m++;
			}
			
			
			Arrays.sort(arr);
			
			System.out.print("game "+ game +" : ");
			game++;

			for(int i : arr) {
				System.out.print(i+" ");
			}
			lott--;
			System.out.println();
			
			}
		line();
		Title("2등 당첨 로또 샵");
		//해쉬셋 안쓴거
		System.out.println("몇개를 구입하시겠습니까 갯수를 입력해 주세요");
		int lotto = sc.nextInt();
		int arr2[] = new int[6];
		int game2 = 1;
		
		while(lotto > 0) {
	         
			System.out.print("game "+game2+" : ");
	         game2++;
	         
	         for(int j = 0; j < arr2.length; j++) {
	            arr2[j] = 1 + rd.nextInt(45); 
	            //3중포문? 
	            for(int k = 0;k < j;k++) {
	               if(arr2[j] == arr2[k]) {
	                  j--;
	                  break;
	               }
	            }
	         }
	         Arrays.sort(arr2);
	         for(int j=0;j<arr2.length;j++) {
	            System.out.print(arr2[j]+" ");
	         }
	         System.out.println();
	         lotto--;
			}
		System.out.println();
		line();
		System.out.println("끝");
		}
	public static void line() {
		System.out.println("===================================");
	}
	public static void Title(String title) {
		System.out.println(title);
	}
}