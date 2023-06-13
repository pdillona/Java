package sub1;
/**
 * 
 * 날짜: 2023/06/13
 * 이름: 정영재
 * 내용: Java 조건문 if 실습하기
 *  
 * 
 * 
 */
public class IfTest {

	public static void main(String[] args) {
		
		// if
		
		int num1 = 1;
		int num2 = 2;
		
		/*
		if(조건식이 들어가는자리, 이 조건에 부합하면 안의 내용을 실행, false라면 해당 if문 건너뛰고 다음 라인 실행) {
				// 조건이 true라면 실행될 내용
		
			}
		*/
		
		
		if(num1 < num2) {
			//조건이 참일때 실행
			System.out.println("num1은 num2보다 작다.");
			//결과: num1은 num2보다 작다.
		}
		
		if(num1 > 1) {
			System.out.println("num1은 1보다 크다.");
			//결과: false이기에 아무 것도 출력 되지 않음. 
		}
		
		if(num1 > 0) {
			if(num2 > 1) {
			System.out.println("num1은 0보다 크고 num2는 1보다 크다");
			//결과: num1은 0보다 크고 num2는 1보다 크다. 
			// 첫번째 if문 통과 후 두 번째 if문 까지 ture여야 실행된다.
		 }
		}
		
		if(num1 > 0 && num2 > 1) {
			System.out.println("num1은 0보다 크고 그리고 num2는 1보다 크다.");
			//결과: num1은 0보다 크고 그리고 num2는 1보다 크다.
		}
		
		

		
		
		// if ~ else
		
		int var1 = 1, var2 =2;
		
		if(var1 < var2){
			//조건이 참 일때
			System.out.println("va1이 va2보다 작다.");
			
		}else {
			//조건이 거짓 일때
			System.out.println("va1이 va2보다 크다.");
			
		}
		// 결과: va1이 va2보다 작다.
		
		// 조건이 true라면 if문실행 false라면 else문을 실행한다.
		
		
		// if ~ else if ~else
		
		int n1 =1, n2 = 2, n3 = 3, n4 = 4;
		
		if(n1 > n2) {
			System.out.println("n1이 n2보다 크다.");
		}else if(n2 > n3) {
			System.out.println("n2가 n3보다 크다.");
		}else if(n3 > n4 ) {
			System.out.println("n3가 n4보다 크다.");
		}else {
			System.out.println("n4가 가장 크다.");
		}
		// n1과 n2비교 false n1보다 큰 n2가 n3와 비교 false n2보다 큰 n3와 n4비교 false 즉 n4가 가장 크다.
		// 결과: n4가 가장 크다.
		
		
		
	}
	
}
