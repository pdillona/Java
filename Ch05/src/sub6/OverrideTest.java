package sub6;
/*
 * 날짜 : 2023/06/21
 * 이름 : 정영재
 * 내용 : 자바 오버라이드 실습
 * 
 * 오버라이드(메서드 재정의)
 *  - 부모 클래스의 메서드를 자식클래스에서 재정의 하는 문법
 *  - 오버라이드 기능을 통해 객체지향 프로그래밍의 다형성을 구현한다.
 *  
 */ 

class AAA{
	
	public void method1() {
		
		System.out.println("AAA: method1...");
		
	}
	
	public void method2() {
		
		System.out.println("AAA: method2...");
		
	}
	//overload
	public void method3() {
		
		System.out.println("AAA: method3...");
		
	}
	
}

class BBB extends AAA{
	

	@Override
	public void method2() {
		
		System.out.println("BBB: method2...");
		
	}
	//overload
	public void method3(int a) {
		
		System.out.println("BBB: method3...");
		
	
	}
}

class CCC extends BBB{
	
	@Override     // 안해도 되지만 가독성을 위해서 어노테이션을 붙여서 오버라이드 된 것 임을 알려준다.
	public void method1() {
		
		System.out.println("CCC: method1...");
		
	}
	@Override
	public void method2() {
		
		System.out.println("CCC: method2...");
		
	}
	//overload
	public void method3(int a, int b) {
		
		System.out.println("CCC: method3...");
		
	
	
	}
}

public class OverrideTest {
	
	public static void main(String[] args) {
		
		CCC c = new CCC();
		c.method1();
		c.method2();
		//메서드3는 오버로드이다. 재정의가 아닌 매개변수의 차이로 구분되기에
		c.method3();
		c.method3(1);
		c.method3(1, 2);
		
		/* 결과
		 * CCC: method1... 
		 * CCC: method2... 
		 * AAA: method3... 
		 * BBB: method3... 
		 * CCC: method3...
		 */
		
		// Car 상속객체 생성
		
		Sedan sonata = new Sedan("소나타", "흰색",0,2000);
		Truck bongo = new Truck("봉고","남색",0,0);
		
		sonata.speedUp(80);
		sonata.show();
		
		
		bongo.speedUp(80);
		bongo.show();
		
		
	}
}

