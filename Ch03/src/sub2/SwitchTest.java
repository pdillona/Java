package sub2;

import java.util.Scanner;

/**
 * 
 * 날짜: 2023/06/13
 * 이름: 정영재
 * 내용: Java 조건문 switch 실습하기
 * 
 * 
 * 
 */
public class SwitchTest {
	public static void main(String[] args) {
		
		System.out.print("숫자 입력: ");
		
		// 사용자 입력
		Scanner Scan = new Scanner(System.in);
		int number = Scan.nextInt();  
		//프로그램 흐름: 쭉 실행되다가 Scan.nextInt(); 에서 프로그램 흐름이 한번 멈추고, 사용자의 입력을 받은 후에 number로 값이 넘어간다. 넘어간 넘버가 출력되며 프로그램 종료
		System.out.println("입력한 숫자: " + number);
		/* 결과
		 * 숫자 입력: 17
		 * 입력한 숫자: 17
		*/
		
		
		switch(number % 2) {  //0,1을 나눔 0짝수 1홀수
		
		case 0:
			System.out.println("number는 짝수");
			break;
			
		case 1:
			System.out.println("number는 홀수");
			break;
		
		}
		
		//값이 case 0을 만났을때 조건에 맞으면 break switch문을 빠져나감 false이면 다음 case로 넘어간다.
		//결과: number는 홀수

		/*
		switch(값이 들어가는 자리) {
		
		
		}
		*/
		
		
		
	}

}
