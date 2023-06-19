package step1;


import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		
		int p1 = (A+B)%C;
		int p2 = ((A%C)+(B%C))%C;
		int p3 = (A*B)%C;
		int p4 = ((A%C)*(B%C))%C;

		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		

	}

}
