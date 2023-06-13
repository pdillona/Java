package sub1;

/*  /* 별 하나 엔터로도 생성가능
 * 
 * 날짜: 2023/06/12
 * 이름: 정영재
 * 내용: ch02.Java 변수와 연산자 실습
 * 
 * 변수(variable)
 *  - 데이터 처리를 위한 데이터 그릇
 *  - 변수는 메모리 공간이며 각 데이터의 종류에 따라 크기가 다름
 * 
 * 상수(Constant)
 * 	- 최초 저장된 데이터로 고정되는 변수
 *  - 대문자로 표기
 *  
 */


public class VariableTest {

	public static void main(String[] args) {
		
		//변수
		int a = 3;  //a라는 변수에 숫자 3을 대입한다.
		int b = 7;  //마지막에는 무조건 ;(세미콜론) 붙인다.
		
		System.out.println("a: " + a);
		// 결과: a: 3
		//이때까진 a가 3 이지만 아래에서 덮어씌워져서 5가됨
		
		a = 5;		//a에 3이있었는데 3을 지우고 5를 넣는 행위(덮어쓰기)
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		/*
		 * 결과: a: 5
				b: 7
		 */
		
		//변수중 문자열
		
		String name = "홍길동"; //문자열은 ""(쌍따옴표) 를 사용해야함
		System.out.println(name + "님 반갑습니다.");
		//결과: 홍길동님 반갑습니다.
		
		
		//상수
		
		final int NUM = 5; // final이 없으면 상수이나 항상 num을 5로 쓰고싶다하면 final을 붙여 쓴다. 상수는 대문자로 표현하는 규칙이있다. 
		
		// NUM = 7; // The final local variable NUM cannot be assigned. It must be blank and not using a compound assignment 에러뜸. 상수인데 바꾸려고 해서.
		
		System.out.println("NUM: " + NUM);
		// 결과: NUM: 5
		
		//ctrl + s 로 저장하고 실행해야한다.
		
		
	}
}
