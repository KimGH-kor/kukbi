package ch06;

public class StringBufferExam {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hey, Java");
		sb.deleteCharAt(1);//charAt�� ������� ���� �� ����
		sb.deleteCharAt(1);
		sb.insert(1, "i"); // ��ġ ������ ��� ������ �� �ۼ�
		System.out.println(sb);
	}
}
