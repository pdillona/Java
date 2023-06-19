package sub2;
/*
 * 날짜 : 2023/06/19
 * 이름 : 정영재
 * 내용 : 자바 캡슐화 실습하기
 * 
 * 캡슐화(Encapsulation)
 * 	- 캡슐화는 객체의 속성을 외부에 참조하지 못하게 객체의 정보(속성)를 은닉하는 특성.
 * 	- 클래스의 속성(필드)은 반드시 private 선언을 통해 캡슐화 하자.
 * 	- private 속성의 초기화를 위해 생성자(Constructor)를 정의 한다.
 * 	- 은닉된 정보의 안전한 사용을 위해서 Getter, Setter를 제공한다.
 * 
 */
public class EncapsuleTest {

	public static void main(String[] args) {
		
		//Car 객체 생성 초기화
		Car sonata = new Car("소나타", "흰색", 10);
		
		/* 생성자를 만들기 전의 초기화 
		 * sonata.name = "소나타"; 
		 * sonata.color = "흰색"; 
		 * sonata.speed = 10;
		 */
		sonata.setName("그랜져");
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		System.out.println("=====================================");
		Car avante = new Car("아반테","검은색", 10);
		
		
		avante.setColor("남색");
		avante.speedUp(60);
		avante.speedDown(20);
		avante.show();
		
		
		Account wr = new Account("우리","101-123-1010","강감찬",10000);
		
		wr.deposit(50000);
		wr.withdraw(20000);
		wr.show();
		
		Account kb = new Account("국민","202-456-2020","이순신",10000);
		
		kb.deposit(35400);
		kb.withdraw(11200);
		kb.show();
		

	}

}
