package ch06;

public class StringBufferExam {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hey, Java");
		sb.deleteCharAt(1);//charAt로 몇번쨰꺼 선택 후 삭제
		sb.deleteCharAt(1);
		sb.insert(1, "i"); // 위치 조정후 어떤걸 삽입할 지 작성
		System.out.println(sb);
	}
}
