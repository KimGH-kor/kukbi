package ch07;

public class RationalNumber {
	int molecular,denominator;
	int gcd = 0;
	
	//생성자
	public RationalNumber() {
		this(1,1);
	}
	public RationalNumber(int denominator) {
		this(1,denominator);
	}
	public RationalNumber(int molecular, int denominator){
		//기약분수
		this.molecular = molecular;
		this.denominator = denominator;
		int gcd = GCD(molecular, denominator);
		this.molecular /= gcd;
		this.denominator /= gcd;
	}
	
	//최대 공약수 
	public int GCD(int a, int b) {
		int gcd = 0;
			while(b!=0) {
				int t = a%b;
				a = b;
				b = t;
			}
			gcd = a;
		return gcd;
	}
	
	public static RationalNumber add(RationalNumber a, RationalNumber b){
		int i = a.denominator;
		a.denominator *= b.denominator;
		a.molecular *= b.denominator;
		b.denominator *= i;
		b.molecular *= i;
		RationalNumber temp = new RationalNumber((a.molecular+b.molecular),a.denominator);
		temp.GCD(temp.molecular,temp.denominator);
		
		return temp;
	}
	public static RationalNumber minus(RationalNumber a, RationalNumber b){
		int i = a.denominator;
		a.denominator *= b.denominator;
		a.molecular *= b.denominator;
		b.denominator *= i;
		b.molecular *= i;
		RationalNumber temp = new RationalNumber((a.molecular>b.molecular?a.molecular-b.molecular:b.molecular-a.molecular),a.denominator);
		temp.GCD(temp.molecular,temp.denominator);
		
		return temp;
	}
	public static RationalNumber mul(RationalNumber a, RationalNumber b){
		a.denominator *= b.denominator;
		a.molecular *= b.molecular;
		RationalNumber temp = new RationalNumber(a.molecular,a.denominator);
		temp.GCD(temp.molecular,temp.denominator);
		
		return temp;
	}
	public static RationalNumber div(RationalNumber a, RationalNumber b){
		a.denominator *= b.molecular;
		a.molecular *= b.denominator;
		RationalNumber temp = new RationalNumber(a.molecular,a.denominator);
		temp.GCD(temp.molecular,temp.denominator);
		
		return temp;
	}
	
	//출력
	public void showInfo() {
		if(this.denominator >1) {
			System.out.println(molecular+"/"+denominator);
		}else {
			System.out.println(molecular);
		}
	}
	
	public static void main(String[] args) {
		RationalNumber yu0 = new RationalNumber(5,25);
		RationalNumber yu1 = new RationalNumber(4,5);
		
		yu0.showInfo();
		yu1.showInfo();
		
		RationalNumber yu3 = RationalNumber.add(yu0, yu1);
		yu3.showInfo();
		RationalNumber yu4 = RationalNumber.minus(yu0, yu1);
		yu4.showInfo();
		RationalNumber yu5 = RationalNumber.mul(yu0, yu1);
		yu5.showInfo();
		RationalNumber yu6 = RationalNumber.div(yu0, yu1);
		yu6.showInfo();




		
	}
}

