package ch06;

public class Car {	
	public static void main(String[] args) {
		Cars[] cars = new Cars[3];
		cars[0] = new Cars("1000","LG");
		cars[1] = new Cars("1001","���");
		cars[2] = new Cars("1002","�Ｚ");
		
		for(int i = 0; i<cars.length;i++) {
			System.out.println(cars[i].name+"�� �ӵ���"+cars[i].up(5));
		}
		for(int i = 0; i<cars.length;i++) {
			System.out.println(cars[i].name+"�� �ӵ���"+cars[i].down(5));
		}
		
	}
}

class Cars {
	String number;
	String name;
	double speed;
	
	public Cars(String number, String name) {
		this.number = number;
		this.name = name;
	}
	
	double up(int speed) {
		this.speed += speed;
		return this.speed;
	}
	
	double down(int speed) {
		if(this.speed-speed <= 0) {
			return 0;
		}
		this.speed -= speed;
		return this.speed;
	}
}