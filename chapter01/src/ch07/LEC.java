package ch07;

public class LEC {
	public static void main(String[] args) {
		Point obj1 = new Point(10, 20);
		
		System.out.printf("obj1 = (%d, %d) %n", obj1.a, obj1.b);
		rearrange(obj1);
		System.out.printf("obj1 = (%d, %d) %n", obj1.a, obj1.b);
		
		int a = 10, b = 20;
		swap(a,b);
		System.out.println("a = "+a +", b = "+b);
		int arr[] = new int[2];
		arr[0] = 10; arr[1] = 20;
		swapArr(arr);
		System.out.println(arr[0]+" "+arr[1]);
		
		
	}
	static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}
	
	static void swapArr(int a[]) {
		int t = a[0];
		a[0] = a[1];
		a[1] = t;
	}
	
	public static void rearrange(Point point) {
		point.a = 30;
		point.b = 40;
	}
}
class Point{
	int a;
	int b;
	public Point(int a, int b) {
		this.a = a;
		this.b = b;
	}
}