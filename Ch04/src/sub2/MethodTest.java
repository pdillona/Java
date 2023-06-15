package sub2;
/**
 * 
 * 날짜: 2023/06/15
 * 이름: 정영재
 * 내용: Java 메서드 실습하기
 *  
 * 
 * 
 */
public class MethodTest {
	//전역변수: 메서드 밖에서 선언된 변수.(즉 클래스 영역에서 생성된 변수), 객체가 해제 될때 해제.
	int num = 1; 
	
	
	// main method: 프로그램 진입점
	public static void main(String[] args) {  //main도 메서드
		// 메서드는 클래스의 내부에서만 존재 가능하다.
		
		//메서드 호출
		int y1 = f(1);
		
		int y2 = f(2);   // 매개 변수에 대입 되는 값을 인자값 (= parameter or argument) 여기서는 f(2); ()안에 있는 2가 인자값이다.
		
		int y3 = f(3);
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		
		//메서드 디버깅시 f5를 사용하여 메서드 내부로 들어가야 한다. 내부에서는 f6 즉 둘을 섞어 써야한다.

		
		// 메서드 지역 변수와 스택
		
		int t1 = sum(1,10);
		int t2 = sum(1,100);
		
		System.out.println(t1);
		System.out.println(t2);
		
		
		
	}
	
	// 메서드 정의(실습)
	public static int f(int x) { //void 자리는 리턴타입을 정의함 void 때문에 return 불가.
		
		int y = 2*x + 3;
		
		return y;
		
	}
	
	/*
	 * public static void f(int x) { //void 자리는 리턴타입을 정의함 void 때문에 return 불가.
		
		int y = 2*x + 3;
		
		return y;
		//Void methods cannot return a value 에러가 뜬다.
		
	}
 
	 */
	
	// 메서드 정의 (실습2)
	public static int sum(int start, int end) {  //메서드 명은 소문자로 해야한다.
		
		//지역 변수: 메서드가 종료되면 스택에서 해제 되는 변수. (매개 변수도 지역변수에 해당된다.)
		int total = 0;
		
		for(int k=start; k<=end; k++) {
			
			total +=k;
			
		}
		
		return total;  // void가 없을 경우 return이 있다는 의미 이기에 리턴하는 데이터 타입에 맞춰서 메서드 타입을 설정해 줘야 한다.
		
	}

}
