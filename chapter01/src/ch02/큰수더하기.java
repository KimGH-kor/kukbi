package ch02;

import java.util.Scanner;

public class 큰수더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		String y = sc.next();
		String swap;
		
		if(x.length() < y.length()) {
			swap = x;
			x = y;
			y = swap;
		}
		
		int x1[] = new int[x.length()];
		int y1[] = new int[y.length()];
		int arr[] = new int[x.length()];

		//각 수를 반대로 배열에 넣는다
		for(int i = x.length()-1, j = 0; i >= 0; i--, j++) {
			x1[i] = ((int)x.charAt(j)-48);

		}
		for(int i = y.length()-1, j = 0; i >= 0; i--, j++) {
			y1[i] = ((int)y.charAt(j)-48);
		}
	
		//각자리 더하고 10이 넘으면 i+1값에 +1 해준다.	
		for(int i = 0; i < y1.length; i++) {
			if(i == x1.length-1) {
				arr[i] += x1[i]+y1[i];
			}else if(x1[i]+y1[i] >= 10) {
				arr[i+1] += 1;
				arr[i] += (x1[i]+y1[i])%10;
			}else {
				arr[i] += x1[i]+y1[i];
			}
		}
		//짧은거 기준이라 긴쪽의 남은 값을 대입
		for(int j = y1.length, k = x1.length; k > j ; j++) {
			if(j == x1.length-1) {
				arr[j] += x1[j];
			}else if(arr[j]+x1[j] >= 10) {
				arr[j+1] += 1;
				arr[j] = (arr[j]+x1[j])%10;
			}else {
				arr[j] += x1[j];
			}
		}
		
		for(int i = arr.length-1; i >= 0; i--) {
				System.out.print(arr[i]);
		}	
	}
}
//테스트 케이스
// 큰수 : 11111111111111111111111111111 333333333333333333333333333 =11444444444444444444444444444
// 길이가 같은 수 5555 5555 = 11110
// y가 큰수 54321 123455 = 177776
// x가 큰수 351231 425692 = 776923
// 교수님 테스트 케이스 9999999999999999 1 = 