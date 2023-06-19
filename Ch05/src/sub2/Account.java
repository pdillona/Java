package sub2;

public class Account {
	
	private	String 	bank;
	private	String 	id;
	private String	name;
	private	int		balance;
	
	//생성자 만들기
	
	//default 생성자
	public Account() {
		
		
	}
	
	//생성자를 통한 초기화
	public Account(String bank, String id, String name, int balance) {
		
		this.balance = balance;
		this.bank	 = bank;
		this.id		 = id;
		this.name	 = name;
	}
	
	
	
	public void deposit(int money) {
		
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("--------------------------");
		System.out.println("은행명: " + this.bank);
		System.out.println("계좌번호: " + this.id);
		System.out.println("입금주: " + this.name);
		System.out.println("현재 잔액: " + this.balance);
		System.out.println("--------------------------");
		
		
	}
	
}
