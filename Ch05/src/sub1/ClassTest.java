package sub1;
/*
 * 날짜 : 2023/06/19
 * 이름 : 정영재
 * 내용 : 자바 클래스 실습하기
 * 
 * 클래스와 객체
 * 	- 클래스는 객체를 생성하는 구조체 이고 속성(필드, 멤버변수)과 기능(멤버 메서드)으로 설계한다.
 * 	- 객체(Object)는 클래스의 실제 인스턴스(Instance)(heap에 생성되는 클래스의 실체가 인스턴스이다.), new연산으로 생성
 * 
 */
public class ClassTest {

	public static void main(String[] args) {
		
		// 객체(= Object or Instance)생성
	
		Car sonata = new Car(); // 같은 패키지의 Car클래스 생성   // 같은 패키지에 존재 하기 때문에 import 필요 없음.
		// Car타입으로 sonata생성.
		// 대입 연산자의 왼쪽은 항상 변수이다. 
		// 이렇게 생성된 sonata를 참조 변수라고 한다.
		
		
		// 객체 초기화
		sonata.name  = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0; 
		
		// 객체 활용
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		
		// 객체 선언, 생성, 초기화  // 선언과 생성을 분리해봤다.
		Car avante; // 선언
		avante = new Car();// 생성
		avante.name ="아반테";
		avante.color = "검은색";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(40);
		avante.show();
		
		
		
		// Account 객체 생성과 초기화, 활용
		
		Account kb = new Account();
		kb.bank ="국민은행";
		kb.id = "101-21-0101";
		kb.name = "김유신";
		kb.balance = 10000;
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		
		
		
		// Account 객체 생성과 초기화, 활용
		
		Account wr = new Account();
		wr.bank = "우리은행";
		wr.id   = "101-22-0202";
		wr.name = "김춘추";
		wr.balance = 10000;
		
		
		wr.deposit(39000);
		wr.withdraw(7000);
		wr.show();
		

	}

}
