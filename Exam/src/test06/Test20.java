package test06;

import java.util.Scanner;

class BankAccount {

	private String id;
	private String name;
	private int balance;

	public BankAccount(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	@Override
	public String toString() {
		return id + "\t" + name + "\t" + balance;
	}
}



public class Test20 {
	
	
	public static void main(String[] args) {
		// 20번
			
		Scanner sc = new Scanner(System.in);
		
		BankAccount[] accounts = new BankAccount[100];


		while (true) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");

			int answer = sc.nextInt();

			if (answer == 5) {
				break;
			} else if (answer == 1) {

			    System.out.println("------------");
			    System.out.println("계좌생성");
			    System.out.println("------------");

			    System.out.print("계좌번호 : ");
			    String id = sc.next();

			    // 중복된 계좌 번호 체크
			    boolean DuplicateAccount = false;
			    
			    for (BankAccount account : accounts) {
		        if (account != null && account.getId().equals(id)) {
			            DuplicateAccount = true;
			            System.out.println("이미 존재하는 계좌번호입니다. 다른 계좌번호를 입력해주세요.");
			            break;
			        }
			    }

			    if (!DuplicateAccount) {
			        System.out.print("계좌주 : ");
			        String name = sc.next();

			        System.out.print("초기입금액 : ");
			        int balance = sc.nextInt();

			        BankAccount account = new BankAccount(id, name, balance);

			        for (int i = 0; i < accounts.length; i++) {
			            if (accounts[i] == null) {
			                accounts[i] = account;
			                System.out.println("결과 : 계좌가 생성되었습니다.");
			                break;
			            }
			        }
			    }
			} else if (answer == 2) {

				System.out.println("------------");
				System.out.println("ㅣ 계좌목록  ㅣ");
				System.out.println("------------");

				for (BankAccount account : accounts) {

					if (account != null) {
						System.out.println(account);
					}
				}

			} else if (answer == 3) {
				sc.nextLine();

				System.out.println("------------");
				System.out.println("ㅣ   예금   ㅣ");
				System.out.println("------------");

				
				System.out.println("계좌 번호를 입력해주세요:");
				String id = sc.nextLine();

				boolean accountFound = false;
				
				for (int i = 0; i < accounts.length; i++) {

					if (accounts[i] != null &&accounts[i].getId().equals(id)) {
						
						accountFound = true;
						
						System.out.println("계좌에 추가할 금액을 입력해주세요: ");
						String pb = sc.nextLine();

						int bI = Integer.parseInt(pb);

						int balance = bI + accounts[i].getBalance();

						accounts[i].setBalance(balance);

						System.out.println(id + " 계좌의 현재잔액: " + accounts[i].getBalance());

						break;

					}
				}
				
				if(!accountFound) {
					System.out.println("잘못된 계좌 번호 입니다 다시 입력해 주세요");
					
				}

			} else if (answer == 4) {
				sc.nextLine();
				System.out.println("------------");
				System.out.println("출금");
				System.out.println("------------");

				System.out.println("계좌 번호를 입력해주세요:");
				String id = sc.nextLine();
				
				boolean accountFound = false;
				

				for (int i = 0; i < accounts.length; i++) {

					if (accounts[i] != null && accounts[i].getId().equals(id)) {

						accountFound = true;
						
						System.out.println("출금할 금액을 입력해주세요: ");
						String mb = sc.nextLine();

						int bI = Integer.parseInt(mb);
						
						if(accounts[i] == null || accounts[i].getBalance() < bI ) {
							System.out.println("계좌의 잔액이 부족합니다 다시 입력해주세요");
							break;
						}else
						{

						int balance = accounts[i].getBalance() - bI;

						accounts[i].setBalance(balance);

						System.out.println(id + " 계좌의 현재잔액: " + accounts[i].getBalance());

						break;
						}
					}
				}
				if(!accountFound) {
					System.out.println("잘못된 계좌 번호 입니다 다시 입력해 주세요");
					
				}

			}
		}

		System.out.println("프로그램 종료");
	}
}