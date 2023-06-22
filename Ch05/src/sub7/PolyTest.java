package sub7;
/*
 * 날짜 : 2023/06/22
 * 이름 : 정영재
 * 내용 : 자바 다형성 실습
 * 
 * 다형성(Polymorphism)
 *  - 상속관계에서 부모클래스의 기능이 자식클래스에서 다양한 기능으로 변하는 특징
 *  - 객체의 타입선언을 부모 클래스 타입으로 선언
 *  - 다형성을 활용해서 프로그래밍의 중복을 줄이고 유연성을 높임
 *  
 */ 
public class PolyTest {
	
	public static void main(String[] args) {
		
		// 다형성을 적용한 객체 생성    가독성 측면의 효율화 
		// Animal로 업캐스팅해 주었다.
		Animal a1 = new Tiger();		// Tiger a1= new Tiger();였음
		Animal a2 = new Eagle();		// Eagle
		Animal a3 = new Shark();		// Shark
		
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
		
		System.out.println("\n");
		
		
		// 다운캐스팅
		Tiger tiger = (Tiger)a1;
		Eagle eagle = (Eagle)a2;
		Shark shark = (Shark)a3;
		
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		System.out.println("\n");
		
		
		
		// 객체 타입 비교연산
		if(a1 instanceof Tiger) { //a1이라는 참조변수가 실제 어떤 인스턴스인지 확인하는 과정.   Tiger가 맞으면 출력
			
			System.out.println("a1은 Tiger입니다.");
		}else if(a1 instanceof Eagle) {
			System.out.println("a1은 Eagle입니다.");
			
		}else if(a1 instanceof Shark) {
			System.out.println("a1은 Shark입니다.");
			
			
		}
		
		System.out.println("\n");
		
		// 다형성을 활용한 객체배열
		// 다형성을 활요해 줘야한다.
		Animal arr[] =	{tiger, eagle, shark};
		
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		
		
	}

}
