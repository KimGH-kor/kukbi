package ch02;

public class toto {
	public static void main(String[] args) {
		String a = "1111";
		int b[] = new int[4];
		
		for(int i = 0; i < b.length; i++) {
			b[i] = (int)a.charAt(i)-48;
		}
		
		System.out.println(b[0]);
	}
}
