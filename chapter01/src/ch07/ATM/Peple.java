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
	
	public void �Ա�(int money) {
		this.money += money;
	}
	
	public void ���(String pass, int money) {
		if (this.pass.equals(pass)) {
			if (money <= this.money) {
				this.money -= money;
				System.out.println("�ܰ� " + this.money + "���ҽ��ϴ�.");
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
		} else {
			System.out.println("��й�ȣ�� �ٸ��ϴ�.");
		}
	}
	
	public void ��ȸ(String pass) {
		if (this.pass.equals(pass)) {
			System.out.println("���� ������ �ܰ��� " + money+ "�Դϴ�.");
		} else {
			System.out.println("��й�ȣ�� �ٸ��ϴ�.");
		}
	}
	
	public void �۱�(Peple[] pepleArr, String card, String pass, int money) {
		int count2 = -1;
		for (int i = 0; i < pepleArr.length; i++) {
			if (pepleArr[i].getCard().equals(card)) {
				count2 = i;
				break;
			}
		}
		if (count2 == -1) {
			System.out.println("���� �����Դϴ�. �ٽ� �Է��� �ּ���");
		} else {
			if (this.pass.equals(pass)) {
					if (money <= this.money) {
						this.money -= money;
						pepleArr[count2].�Ա�(money);
						System.out.println("�ܰ� " + this.money + "���ҽ��ϴ�.");
						System.out.println("�ش� ���·� "+money+"�� ���½��ϴ�.");
					} else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				} else {
					System.out.println("��й�ȣ�� �ٸ��ϴ�.");
				}	
			}
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