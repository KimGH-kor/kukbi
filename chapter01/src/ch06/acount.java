package ch06;

class Account{//���� ����(Ŭ���� ����)
	//�Ӽ�
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
		//��ü ����
		Account[] arr = new Account[2];
		arr[0] = new Account("1234-1234","���ȯ",10000);
		arr[1] = new Account("4321-4321","������",20000);

		arr[0].deposit(20000);//�Ա�
		arr[1].withdraw(10000);//���
		
		System.out.println(arr[0].balance);
		System.out.println(arr[1].balance);
		
		
		
	}

}