package ch07양지;

import java.util.*;

public class AtmTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dis1=0;
		
		int cnt = 0;
		Card[] user = new Card[100];
		
		System.out.println("버튼을 입력해주십시오.");
		
		
		while(dis1!=4){
			String account = "", name = "", pw = "";
			int nowMoney = 0, money = 0;
			
			
			System.out.println("1.카드 만들기  2.계좌 리스트 보기  3.카드 넣기  4. 종료");
			dis1 = sc.nextInt();
			
			switch(dis1) {
			case 1: 
				System.out.println("계좌번호를 입력해주세요."); account = sc.next();
				System.out.println("이름을 입력해주세요."); name = sc.next();
				System.out.println("비밀번호를 입력해주세요."); pw = sc.next();
				System.out.println("금액을 입력해주세요."); nowMoney = sc.nextInt();
				user[cnt] = new Card(account, name, pw, nowMoney);
				cnt++;
				System.out.println("계좌가 계설되었습니다.");
				break;
			case 2:
				System.out.println("계좌번호 / 예금주");
				for(int i=0;i<user.length;i++) {
					if(user[i]!=null) {
						System.out.println(user[i].account+" / "+user[i].name);
					}
				}
				break;
			case 3: 
				System.out.println("계좌번호를 입력해주세요."); account = sc.next();
				int dis2=0;
				for(int i=0;i<user.length;i++) {
					if(user[i]!=null) {
						if(user[i].account.equals(account)) {
							System.out.println("반갑습니다."+user[i].name+" 님");
							System.out.println("다음 화면으로 이동합니다.");
							
							while(dis2!=5) {
								System.out.println("1.입급 2.출금 3.송금 4.조회 5.카드빼기");
								dis2=sc.nextInt();
								String inputPw="";
								String sendAcc = "";
							
								switch(dis2) {
								case 1: 
									System.out.println("입금할 급액을 입력해주세요"); money = sc.nextInt();
									user[i].deposit(money);
									break;
								case 2:
									System.out.println("출금할 금액을 입력해주세요"); money = sc.nextInt();
									System.out.println("비밀번호를 입력해주세요."); inputPw = sc.next();
									user[i].withdraw(money, inputPw);
									break;
								case 3:
									System.out.println("송급할 계좌번호를 입력해주세요.");sendAcc = sc.next();
									System.out.println("송금할 금액을 입력해주세요."); money = sc.nextInt();
									System.out.println("비밀번호를 입력해주세요."); inputPw = sc.next();
									user[i].transfer(sendAcc, money, inputPw);
									for(int j=0;j<user.length;j++) {
										if(user[j]!=null) {
											if(user[j].account.equals(sendAcc)) {
												user[j].nowMoney+=money;
											}
										}
									}
									break;
								case 4:
									System.out.println("비밀번호를 입력해주세요."); inputPw = sc.next();
									user[i].chechNowMoney(inputPw);
									break;
								case 5:
									System.out.println("처음 화면으로 돌아갑니다.");
									break;
								}
							}
						}
					}
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

}
