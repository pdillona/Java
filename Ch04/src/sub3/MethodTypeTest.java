package sub3;
/**
 * 
 * 날짜: 2023/06/15
 * 이름: 정영재
 * 내용: Java 메서드 형태(타입) 실습하기
 *  
 * 
 * 
 */

public class MethodTypeTest {

	public static void main(String[] args) {
		
		//형태1
		double r1 = type1(1.1);
		double r2 = type1(2.1);
		
		System.out.println("r1: "+ r1);
		System.out.println("r2: "+ r2);
		
		
		//형태2
		type2(true); // 리턴이 없으니 변수로 받을 필요도 없다.
		type2(false); // 변수도 없으니 sys도 필요없다. if안에 다있으니
		
		
		//형태3
		boolean r3 = type3();
		
		System.out.println("r3 = " + r3 + "입니다.");

		
		//형태4
		type4();
	
	}

	
	// 형태1:매개변수: O, 리턴: O
	public static double type1(double x) {
		
		double y = x + 3.14;
		
		return y;
		
	}
	
	// 형태2:매개변수: O, 리턴: X
	public static void type2(boolean status) {
		
		if(status) {
			System.out.println("참 입니다.");
			
		}else {
			System.out.println("거짓 입니다.");
		}
		
	}
	
	
	// 형태3:매개변수: X, 리턴: O
	public static boolean type3() {
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
			
		}else{
			return false;
		}
		
	}
	
	
	// 형태4:매개변수: X, 리턴: X 
	// 함수에서 다른 함수를 호출하는 형태, 잘 사용되지 않는다.
	public static void type4() {
		
		double result = type1(0.3);
		System.out.println("type4 실행결과:" + result);
		
	}
	
}
