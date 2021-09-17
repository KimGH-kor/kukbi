package ch07.ATM;

public class Peple {
	private String card;
	private String pass;
	private String name;
	private int money;
	
	public Peple() {
		
	}
	public Peple(String card, String pass, String name, int money) {
		this.card = card;
		this.pass = pass;
		this.name = name;
		this.money = money;
	}
	
	public void 입금(int money) {
		this.money += money;
	}
	
	public void 출금(String pass, int money) {
		if (this.pass.equals(pass)) {
			if (money <= this.money) {
				this.money -= money;
				System.out.println("잔고 " + this.money + "남았습니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else {
			System.out.println("비밀번호가 다릅니다.");
		}
	}
	
	public void 조회(String pass) {
		if (this.pass.equals(pass)) {
			System.out.println("현재 계좌의 잔고는 " + money+ "입니다.");
		} else {
			System.out.println("비밀번호가 다릅니다.");
		}
	}
	//고쳐야함
	//매게변수 3개만 받고 FIND 메서드를 구현해서 사용
	public void 송금(String card, String pass, int money) {
		int count2 = -1;
		for (int i = 0; i < pepleArr.length; i++) {
			if (pepleArr[i].getCard().equals(card)) {
				count2 = i;
				break;
			}
		}
		if (count2 == -1) {
			System.out.println("없는 계좌입니다. 다시 입력해 주세요");
		} else {
			if (this.pass.equals(pass)) {
					if (money <= this.money) {
						this.money -= money;
						pepleArr[count2].입금(money);
						System.out.println("잔고 " + this.money + "남았습니다.");
						System.out.println("해당 계좌로 "+money+"를 보냈습니다.");
					} else {
						System.out.println("잔액이 부족합니다.");
					}
				} else {
					System.out.println("비밀번호가 다릅니다.");
				}	
			}
		}
	
	public String find(Peple[] pepleArr, String card) {
		int count2 = -1;
		for (int i = 0; i < pepleArr.length; i++) {
			if (pepleArr[i].getCard().equals(card)) {
				count2 = i;
				break;
			}
		}
		return "aa";
	}
	
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
