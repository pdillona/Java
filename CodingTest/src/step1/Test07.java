package step1;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = A;
		
		if(A == B) {
			
			String C = A + "??!";
			
			System.out.println(C);
			
		}	
		
	}

}
