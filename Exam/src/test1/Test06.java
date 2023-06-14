package test1;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/13 
 * 이름 : 정영재
 * 내용 : 자바 조건문 연습문제
 * 
 */

public class Test06 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력: ");
		int x = sc.nextInt();
		
		System.out.print("y값 입력: ");
		int y = sc.nextInt();
		
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다.";
		//3항 연산자 ?의 앞이 조건 조건이 참일때 : 의 왼편 즉 true가 리턴, 조건이 거짓일 때 :의 오른편이 리턴된다. 
		
		System.out.println(result);
		
	}
}
