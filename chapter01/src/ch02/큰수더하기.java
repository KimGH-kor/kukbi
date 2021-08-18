package ch02;

import java.util.Scanner;

public class 큰수더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int x1[] = new int[x.length()];
		String y = sc.next();
		int y1[] = new int[y.length()];
	
		int arr[] = new int[(x.length()>y.length()?x.length():y.length())+1];

		//각 수를 반대로 배열에 넣는다
		for(int i = x.length()-1, j = 0; i >= 0; i--, j++) {
			x1[i] = ((int)x.charAt(j)-48);

		}
		for(int i = y.length()-1, j = 0; i >= 0; i--, j++) {
			y1[i] = ((int)y.charAt(j)-48);
		}
		
		//경우의 수 3가지 1.y가 크거나 2.x가 크거나 3.같거나
		//각자리 더하고 10이 넘으면 i+1값에 +1 해준다.
		
		//y가 큰 1번째 경우의 수
		if(x1.length < y1.length) {
			for(int i = 0; i < x1.length; i++) {
				if(x1[i]+y1[i] >= 10) {
					arr[i+1] += 1;
					arr[i] += (x1[i]+y1[i])%10;
				}else {
					arr[i] += x1[i]+y1[i];
				}
			}
			//짧은거 기준이라 긴쪽의 남은 값을 대입
			for(int j = y1.length-1, k = 0; k < y1.length - x1.length; k++,j--) {
				arr[j] += y1[j];
			}
			//x가 큰 2번째 경우의수
		}else if(x1.length > y1.length){
			for(int i = 0; i < y1.length; i++) {
				if(x1[i]+y1[i] >= 10) {
					arr[i+1] += 1;
					arr[i] += (x1[i]+y1[i])%10;
				}else {
					arr[i] += x1[i]+y1[i];
				}
			}
			for(int j = x1.length-1, k = 0; k < x1.length - y1.length; k++,j--) {
				arr[j] += x1[j];
			}
			//x=y의 길이가 같은 수
		}else {
			for(int i = 0; i < x1.length; i++) {
				if(x1[i]+y1[i] >= 10) {
					arr[i+1] += 1;
					arr[i] += (x1[i]+y1[i])%10;
				}else {
					arr[i] += x1[i]+y1[i];
				}
			}
		}
		//젤 앞이 0이라면 없애주기 위해 count를 한칸 올린다.
		int count = 0;
		if(arr[arr.length-1] == 0) {
			count++;
		}

		//만약 0이라면 -2부터 시작 아니라면 -1부터 시작
		if(count == 0) {
			for(int i = arr.length-1; i >= 0; i--) {
				System.out.print(arr[i]);
			}
		}else {
			for(int i = arr.length-2; i >= 0; i--) {
				System.out.print(arr[i]);
		}	
	}
}
}
//테스트 케이스
// 큰수 : 11111111111111111111111111111 333333333333333333333333333 =11444444444444444444444444444
// 길이가 같은 수 5555 5555 = 11110
// y가 큰수 54321 123455 = 177776
// x가 큰수 351231 425692 = 776923