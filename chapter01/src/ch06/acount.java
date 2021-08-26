package ch06;

class Account{//계좌 생성(클래스 생성)
	//속성
	String accno;
	String name;
	int balance;
	
	Account(String accno, String name, int balance){
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	void withdraw(int amount) {
		balance -= amount;
	}
}

public class acount {
	public static void main(String[] args) {
		//객체 생성
		Account[] arr = new Account[2];
		arr[0] = new Account("1234-1234","김경환",10000);
		arr[1] = new Account("4321-4321","양지현",20000);

		arr[0].deposit(20000);//입금
		arr[1].withdraw(10000);//출금
		
		System.out.println(arr[0].balance);
		System.out.println(arr[1].balance);
		
		
		
	}

}
