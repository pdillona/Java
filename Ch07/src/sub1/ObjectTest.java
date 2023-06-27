package sub1;
/*
날짜 : 2023/06/27
이름 : 정영재
내용 : JAVA Object Class 실습

object 클래스
	- 자바의 최상위 클래스로 모든 클래스는 object를 암시적으로 상속 받음.
	- 주요기능은 개체 비교를 위한 equals(), 객체 정보 조회를 위한 toString() 제공.

*/
public class ObjectTest {

	public static void main(String[] args) {
		
		Object a1 = new Apple("한국",3000);
		Object a2 = new Apple("일본",2000);
		
		
		
		System.out.println(a1);
		System.out.println();
		System.out.println(a2);
		System.out.println();
		
		a1.toString();
		System.out.println();
		a2.toString();
		System.out.println();
		
		// 객체 비교
		
		//객체의 주소를 비교한다.
		if(a1 == a2) {
			System.out.println("a1,a2의 주소가 같다.");
		}else {
			System.out.println("주소가 다르다");
		}
		
		System.out.println();
		
		// 가리키는 객체가 같은지를 비교
		if(a1.equals(a2)) {
			System.out.println("a1,a2의 가 가리키는 객체가 같다.");
		}else {
			System.out.println("a1,a2의 가 가리키는 객체가 다르다");
		}
		
		
		
	}

}
