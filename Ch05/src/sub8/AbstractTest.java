package sub8;
/*
 * 날짜 : 2023/06/22
 * 이름 : 정영재
 * 내용 : 자바 추상클래스 실습
 * 
 * 추상 클래스(Abstract Class)
 *  - 일반 클래스를 정의하기 위한 기본 틀을 제공하는 클래스
 * 	- 추상 클래스를 상속 받아 자식 클래스에서 미완성 메서드(추상메서드)를 완성한다. 다형성 활용.
 * 
 */
public class AbstractTest {
	
	public static void main(String[] args) {
		
		
		// 추상 클래스 객체 생성
		//Car car = new Car("","",0); //Cannot instantiate the type Car에러 추상클래스라 생성안됨 // 설계도 랍시고 constructor 만들어 뒀더니 다 찢어서 지맘대로 분해 결합하는 급인듯.
		
		
		Car sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		Car bongo = new Truck("흰색","봉고",0,0);
		bongo.speedUp(80);
		bongo.speedDown(60);
		bongo.show();
			
		
		
		
	}

}
