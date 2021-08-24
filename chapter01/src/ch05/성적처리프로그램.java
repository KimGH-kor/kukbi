package ch05;

import java.util.Scanner;

public class 성적처리프로그램 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] code = new int[100];
		double[] avg = new double[100];
		char[] grade = new char[100];
		int num = 0;
		boolean bo = true;
		double tem;
		char tem2;
		
		while(bo) {
			System.out.println("메뉴");
			System.out.println("1.입력 2.출력 3.종료 : ");
			int x = sc.nextInt();
			switch (x) {
			case 1 : //입력
				int sum = 0;
				System.out.print("학번을 입력해 주세요 : ");
				code[num] = sc.nextInt();
				System.out.print("국어 점수를 입력해 주세요 : ");
				sum += sc.nextInt();
				System.out.print("수학 점수를 입력해 주세요 : ");
				sum += sc.nextInt();
				System.out.print("영어 점수를 입력해 주세요 : ");
				sum += sc.nextInt();
				
				avg[num] = sum/3;
				
				if(avg[num] >= 90) {
					grade[num] = 'A';
				}else if(avg[num] >= 80) {
					grade[num] = 'B';
				}else if(avg[num] >= 70) {
					grade[num] = 'C';
				}else {
					grade[num] = 'F';
				}
				for(int i = 0 ; i < num+1; i++) {
					for(int j = i+1; j < num+1; j++) {
						if(avg[i] > avg[j]) {
							tem = avg[i];
							avg[i] = avg[j];
							avg[j] = tem;
							
							tem2 = grade[i];
							grade[i] = grade[j];
							grade[j] = tem2;
							
							tem = code[i];
							code[i] = code[j];
							code[j] = (int)tem;
						}
					}
				}
				num++;
				break;
			case 2 : //출력
				for(int i = 0; i < num; i++) {
					System.out.println(code[i]+","+avg[i]+","+grade[i]);
				}
				break;
				
			case 3 ://종료
				bo = false;
				break;
			
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		
		
	}
	
}
