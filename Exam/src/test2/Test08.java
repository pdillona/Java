package test2;
/**
 * 
 * 날짜: 2023/06/13
 * 이름: 정영재
 * 내용: Java 팩토리얼 재귀 메서드 연습문제
 *  
 * 
 * 
 */
public class Test08 {

	public static void main(String[] args) {
		System.out.println("3! = " + factorial(3));
		System.out.println("4! = " + factorial(4));
		System.out.println("5! = " + factorial(5));

	}

	public static int factorial(int n) {
		
		if(n <=1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}//recursive (재귀함수) 일종의 반복문 리턴으로 다시 팩토리올 함수 부르고 다시 리턴 ~~이 되니까
}
