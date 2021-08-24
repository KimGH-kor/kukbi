package ch04;

import java.util.Scanner;

public class 지뢰찾기 {
	public static void main(String[] args) {
		String line;
		char map[][] = new char[5][5];
		Scanner in = new Scanner(System.in);
		//문자열을 문자배열로 변환
		for(int i=0; i<5; i++)
		{
			line = in.nextLine();
			for(int j=0; j<5; j++)
			{
				map[i][j] = line.charAt(j);
			}
		}
		//지뢰만 찾기
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(map[i][j]=='*') {
					System.out.print('*');
				}else {
					//주위 8칸 숫자 올리기
					int count = 0;
					for(int i2 = i>0?i-1:0;i2 <=(i+1 >=5?4:i+1);i2++) {
						for(int j2 = j>0?j-1:0; j2 <= (j+1 >=5?4:j+1); j2++) {
							if(map[i2][j2] == '*') {
								count++;	
							}
						}
					}
					System.out.print(count);
						
					}
				}
			System.out.println();
			}
	}
}
//1. 배열에 넣기
//2. 가로 세로 -1 +1에 * 이있다면 +1
//3. 만약 0,0.0이거나 5이면 -1이나 +1안함
//1. 아래와 같이 지뢰(*)를 입력하여 지뢰찾기 맵을 완성하시오.
//입력
//00000
//00*00
//0*0*0
//00*00
//0000*
//출력
//0 1 1 1 0 
//1 2 * 2 1 
//1 * 4 * 1 
//1 2 * 3 2 
//0 1 1 2 *
//
//힌트 : 아스키코드표와 아래의 코드를 활용하여 해결하시오.

