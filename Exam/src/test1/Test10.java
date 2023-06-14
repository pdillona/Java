package test1;
/*
 * 
 * 날짜: 2023/06/14
 * 이름: 정영재
 * 내용: Java 반복문 연습문제
 *  
 * 
 * 
 */
public class Test10 {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.print(n1+", ");
		System.out.print(n2+", ");
		
		for(int i=1; i<=10; i++) {
			
			n3 = n1 + n2;
			
			System.out.print(n3+", ");
			
			n1 = n2;
			
			n2 = n3;
			// 규칙을 발견하는게 중요
			//1회차: 0(n1), 1(n2), 1(n3)
			//2회차:         (n1)   (n2)   2(n3) 
			// 이런식의 규칙을 발견해야 작성이 편하다.
		}
	}
}
