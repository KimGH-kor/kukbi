package 링크드;

import java.util.HashMap;
import java.util.Scanner;

//학생 정보 처리
public class HashExample {
	public static void main(String[] args) {
		HashMap<String, Student> smap = new HashMap<String, Student>();
		Scanner sc =new Scanner(System.in);
		int select = 0;
		String name, code;
		double score;
		Student s;
		
		while(select != 3) {
			System.out.println("1. 입력 2.출력 3.종료");
			select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("code : ");
				code = sc.next();
				System.out.println("name : ");
				name = sc.next();
				System.out.println("score : ");
				score = sc.nextDouble();

				s = smap.get(code);//해시의 코드가 있는지 검사
				if(s == null) {//처음 사용된 코드 서랍장 안에는 아무것도 없다!
					smap.put(code, new Student(code, name,score));
					System.out.println("등록 되었습니다.");
				}else {
					System.out.println("중복");
				}
				
				break;
			case 2:
				for(String a : smap.keySet()) {
					Student t = smap.get(a);
					System.out.println(t.code+" : "+t.name+" "+t.score);
				}
				break;
			case 3:
				System.out.println("종료합니다.");
				break;

			default:
				break;
			}
		}
		
		
	}
}
class Student{
	String code, name;
	double score;
	Student(String c, String n, double s){
		code = c; name=n;score=s;
	}
}