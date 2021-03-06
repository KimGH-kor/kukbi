package ch07.ATM;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int sca;
		String scb;
		Peple[] arr = new Peple[100];
		boolean bq = true;
		boolean bw = false;
		int mone;
		String pass;
		String card;
		line();
		while (bq) {
			System.out.println("사용하실 서비스를 선택해 주십시오");
			System.out.println("1.카드 생성 2.계좌 리스트 확인 3.로그인 4.종료");
			int x = sc.nextInt();
			switch (x) {
			case 1:
				line();
				arr[num] = new Peple();
				System.out.println("계좌번호를 입력해 주세요 ex(1234-1234)");
				scb = sc.next();
				if (scb.length() == 9&&scb.charAt(4) == '-') {
					arr[num].setCard(scb);
					System.out.println("비밀번호 4자리를 입력해 주세요");
					scb = sc.next();
					if (scb.length() == 4) {
						arr[num].setPass(scb);
						System.out.println("이름을 입력해 주세요");
						scb = sc.next();
						arr[num].setName(scb);
						System.out.println("처음 입금하실 금액을 넣어주세요");
						arr[num].setMoney(sc.nextInt());
						System.out.println(arr[num].getCard() + "계좌가 생성되었습니다.");
						num++;
					} else {
						System.out.println("비밀번호를 잘못 입력하셨습니다.");
						arr[num].setPass(null);
					}
				} else {
					System.out.println("형식에 맞지않습니다.");
					arr[num].setCard(null);
				}
				
				line();
				break;

			case 2:
				try {
					System.out.println("현재 계좌 리스트는");
					for (int i = 0; i < num; i++) {
						System.out.println(arr[i].getCard() + "/" + arr[i].getName());
					}
					System.out.println("입니다");
				} catch (Exception e) {
					System.out.println("현재 생성된 계좌는 0개입니다.");
				}
				line();
				break;
			case 3:
				try {
					System.out.println("현재 사용가능한 계좌");
					for (int i = 0; i < num; i++) {
						System.out.println(arr[i].getCard() + "/" + arr[i].getName());
					}
					int count = 0;
					System.out.println("사용하실 계좌 번호를 입력해 주세요");
					String st = sc.next();
					// 계좌 있는지 확인 하고 있으면 실행 되도록
					for (int i = 0; i < num; i++) {
						if (arr[i].getCard().equals(st)) {
							bw = true;
							count = i;
							break;
						}
					}
					if (bw == false) {
						System.out.println("잘못된 계좌입니다.");
					} else {
						line();
						while (bw) {
							System.out.println("현재 로그인 된 계좌는 "+arr[count].getCard());
							System.out.println("원하는 서비스를 입력해 주세요");
							System.out.println("1.입금 2.출금 3.송금 4.현재 계좌잔액 조회 5.로그아웃");
							x = sc.nextInt();
							switch (x) {
							case 1:
								System.out.println("입금하실 금액을 입력해 주세요");
								mone = sc.nextInt();
								arr[count].입금(mone);
								line();
								break;
							case 2:
								System.out.println("출금하실 금액을 입력해 주세요");
								mone = sc.nextInt();
								System.out.println("비밀번호를 입력해 주세요");
								pass = sc.next();
								arr[count].출금(pass, mone);
								line();
								break;
							case 3:
								System.out.println("현재 만들어진 계좌");
								for (int i = 0; i < num; i++) {
									System.out.println(arr[i].getCard() + "/" + arr[i].getName());
								}
								
								System.out.println("송금하실 계좌 번호를 눌러주세요");
								card = sc.next();
								System.out.println("지금 계좌의 비밀 번호를 입력해 주세요");
								pass = sc.next();
								System.out.println("송금하실 금액을 입력해 주세요");
								mone = sc.nextInt();
								
								arr[count].송금(card, pass, mone);
								line();
								break;
							case 4:
								System.out.println("비밀번호를 입력해 주세요");
								pass = sc.next();
								arr[count].조회(pass);
								line();
								break;
							case 5:
								bw = false;
								line();
								break;

							default:
								System.out.println("잘못된 번호입니다.");
								line();
								break;
							}
						}
					}
				} catch (Exception e) {
					System.out.println("현재 생성된 계좌는 0개입니다.");
				}
				break;
			case 4:
				System.out.println("이용해 주셔서 감사합니다.");
				bq = false;
				line();
				break;

			default:
				System.out.println("잘못된 번호입니다.");
				line();
				break;
			}
		}
	}

	public static void line() {
		System.out.println("==============================================");
	}
}
