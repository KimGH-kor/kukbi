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
			System.out.println("����Ͻ� ���񽺸� ������ �ֽʽÿ�");
			System.out.println("1.ī�� ���� 2.���� ����Ʈ Ȯ�� 3.�α��� 4.����");
			int x = sc.nextInt();
			switch (x) {
			case 1:
				line();
				arr[num] = new Peple();
				System.out.println("���¹�ȣ�� �Է��� �ּ��� ex(1234-1234)");
				scb = sc.next();
				if (scb.length() == 9&&scb.charAt(4) == '-') {
					arr[num].setCard(scb);
					System.out.println("��й�ȣ 4�ڸ��� �Է��� �ּ���");
					scb = sc.next();
					if (scb.length() == 4) {
						arr[num].setPass(scb);
						System.out.println("�̸��� �Է��� �ּ���");
						scb = sc.next();
						arr[num].setName(scb);
						System.out.println("ó�� �Ա��Ͻ� �ݾ��� �־��ּ���");
						arr[num].setMoney(sc.nextInt());
						System.out.println(arr[num].getCard() + "���°� �����Ǿ����ϴ�.");
						num++;
					} else {
						System.out.println("��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
						arr[num].setPass(null);
					}
				} else {
					System.out.println("���Ŀ� �����ʽ��ϴ�.");
					arr[num].setCard(null);
				}
				
				line();
				break;

			case 2:
				try {
					System.out.println("���� ���� ����Ʈ��");
					for (int i = 0; i < num; i++) {
						System.out.println(arr[i].getCard() + "/" + arr[i].getName());
					}
					System.out.println("�Դϴ�");
				} catch (Exception e) {
					System.out.println("���� ������ ���´� 0���Դϴ�.");
				}
				line();
				break;
			case 3:
				try {
					System.out.println("���� ��밡���� ����");
					for (int i = 0; i < num; i++) {
						System.out.println(arr[i].getCard() + "/" + arr[i].getName());
					}
					int count = 0;
					System.out.println("����Ͻ� ���� ��ȣ�� �Է��� �ּ���");
					String st = sc.next();
					// ���� �ִ��� Ȯ�� �ϰ� ������ ���� �ǵ���
					for (int i = 0; i < num; i++) {
						if (arr[i].getCard().equals(st)) {
							bw = true;
							count = i;
							break;
						}
					}
					if (bw == false) {
						System.out.println("�߸��� �����Դϴ�.");
					} else {
						line();
						while (bw) {
							System.out.println("���� �α��� �� ���´� "+arr[count].getCard());
							System.out.println("���ϴ� ���񽺸� �Է��� �ּ���");
							System.out.println("1.�Ա� 2.��� 3.�۱� 4.���� �����ܾ� ��ȸ 5.�α׾ƿ�");
							x = sc.nextInt();
							switch (x) {
							case 1:
								System.out.println("�Ա��Ͻ� �ݾ��� �Է��� �ּ���");
								mone = sc.nextInt();
								arr[count].�Ա�(mone);
								line();
								break;
							case 2:
								System.out.println("����Ͻ� �ݾ��� �Է��� �ּ���");
								mone = sc.nextInt();
								System.out.println("��й�ȣ�� �Է��� �ּ���");
								pass = sc.next();
								arr[count].���(pass, mone);
								line();
								break;
							case 3:
								System.out.println("���� ������� ����");
								for (int i = 0; i < num; i++) {
									System.out.println(arr[i].getCard() + "/" + arr[i].getName());
								}
								System.out.println("�۱��Ͻ� ���� ��ȣ�� �����ּ���");
								card = sc.next();
								System.out.println("���� ������ ��� ��ȣ�� �Է��� �ּ���");
								pass = sc.next();
								System.out.println("�۱��Ͻ� �ݾ��� �Է��� �ּ���");
								mone = sc.nextInt();
								arr[count].�۱�(arr, card, pass, mone);
								line();
								break;
							case 4:
								System.out.println("��й�ȣ�� �Է��� �ּ���");
								pass = sc.next();
								arr[count].��ȸ(pass);
								line();
								break;
							case 5:
								bw = false;
								line();
								break;

							default:
								System.out.println("�߸��� ��ȣ�Դϴ�.");
								line();
								break;
							}
						}
					}
				} catch (Exception e) {
					System.out.println("���� ������ ���´� 0���Դϴ�.");
				}
				break;
			case 4:
				System.out.println("�̿��� �ּż� �����մϴ�.");
				bq = false;
				line();
				break;

			default:
				System.out.println("�߸��� ��ȣ�Դϴ�.");
				line();
				break;
			}
		}
	}

	public static void line() {
		System.out.println("==============================================");
	}
}