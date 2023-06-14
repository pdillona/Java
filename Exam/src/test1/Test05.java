package test1;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/13 
 * 이름 : 정영재
 * 내용 : 자바 조건문 연습문제
 * 
 */


public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		
		System.out.println("입력한 점수는 "+score+"입니다.");
		
		switch(score / 10) {
		case 10:
		case 9:  //프로그래밍에서 92나누기 10을하면 9만남음 2떨어져 나간다.(int라서 그런듯? double이면 잡았을듯하다.)
			System.out.println("A 입니다.");
			break;
		
		case 8:
			System.out.println("B 입니다.");
			break;
			
		case 7:
			System.out.println("C 입니다.");
			break;
			
		case 6:
			System.out.println("D 입니다.");
			break;
			
		default:   // 모든 케이스가 해당 되지 않으면 마지막으로 default가 실행된다.
			System.out.println("F 입니다.");
			break;
			
		}
		
		sc.close();
		
		
	}
}
