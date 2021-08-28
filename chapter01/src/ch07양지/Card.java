package ch07양지;

public class Card {
	String account = "", name = "", pw = "";
	int nowMoney = 0, money = 0;
	String inputPw = "";
	
	
	public Card(String account, String name, String pw, int nowMoney) {
		this.account = account;
		this.name = name;
		this.pw = pw;
		this.nowMoney = nowMoney;
	}
	public Card(String account, String name, String pw) {
		this(account, name, pw, 0);
	}
	
	public void deposit(int money) {
		nowMoney+=money;
		System.out.println(money+"원이 입급되었습니다.");
		System.out.println("잔고 : "+nowMoney);
	}
	
	public void withdraw(int money , String inputPw) {
		if(pw.equals(inputPw)) {
			if((nowMoney-money)>=0&&money>0) {
				nowMoney-=money;
				System.out.println(money+"원 출급되었습니다.");
				System.out.println("잔고 : "+nowMoney);
			}else {
				System.out.println("잔고가 부족합니다.");
			}
		}else {
			System.out.println("비밀번호가 잘못 입력되었습니다.");
		}
	}
	
	public void transfer(String sendAcc, int money, String inputPw) {
		if(pw.equals(inputPw)) {
			if((nowMoney-money)>=0&&money>0) {
				nowMoney-=money;
				System.out.println(money+"원 송금되었습니다.");
				System.out.println("잔고 : "+nowMoney);
			}else {
				System.out.println("잔고가 부족합니다.");
			}
		}else {
			System.out.println("비밀번호가 잘못 입력되었습니다.");
		}
	}
	
	public void chechNowMoney(String inputPw) {
		if(pw.equals(inputPw)) {
			System.out.println(name+"님의 계좌");
			System.out.println("잔고 : "+nowMoney);
		}else {
			System.out.println("비밀번호가 잘못 입력되었습니다.");
		}
	}
}
