package Test1;

import java.util.Scanner;

/*
날짜 : 2023/07/05
이름 : 정영재
내용 : JAVA 정기 수행평가 문제 1

*/
public class Star1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력:");
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {

			for(int j = n-1; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
