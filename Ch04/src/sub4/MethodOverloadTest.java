package sub4;
/**
 * 
 * 날짜: 2023/06/15
 * 이름: 정영재
 * 내용: Java 메서드 오버로딩 실습하기
 *  
 * 메서드 오버로딩
 * 
 */
public class MethodOverloadTest {
//클래스이름의 첫 자는 반드시 대문자 메서드는 반드시 소문자로 작성해야 한다.
	public static void main(String[] args) {
	
		int a = plus(97);
		int s = plus(415,67);
		double d = plus(1.23,6.24);
		String c = plus("정신 ", "나갈 것 같애");
		
		System.out.println("a값은:" + a + " 입니다.");
		System.out.println("s값은:" + s + " 입니다.");
		System.out.println("d값은:" + d + " 입니다.");
		System.out.println("c값은:" + c + " 입니다.");
		

	}

	//오버로딩 메서드 정의
	public static int plus(int a) {
		
		return a + a;
	}
	
	public static int plus(int a, int b) {
		
		return a + b;
	}
	
	public static double plus(double a, double b) {
		
		return a + b;
	}
	
	public static String plus(String a, String b) {
		
		return a + b;
	}
	
}
