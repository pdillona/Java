package sub1;

import java.util.Scanner;


class Add{
	
	public int add(int r1, int r2) {
		
		
		
		int result = r1*r2; 
		
		return result;
	}
	
	
    public int[] splitIntoDigits(int number) {
        int numDigits = (int) Math.log10(number) + 1;
        int[] digits = new int[numDigits];

        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }
    
	

    
	
}




public class Test10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
		

		Add a1 = new Add();
	
		System.out.println("첫 번째 값을 입력하세요: ");
		int r1 = sc.nextInt();
		
		System.out.println("두 번째 값을 입력하세요: ");
		int r2 = sc.nextInt();
		
		int[] p1 = a1.splitIntoDigits(r2);
		
		System.out.println(p1.length);
		System.out.println(p1[1]);
		

		
		
		System.out.println(r2);
		
		for(i=0; p1[i]==p1.length; i++) {
			
			
			
		}
		
	
		
		System.out.println(a1.add(r1, r2));
		

		

		
		
		
	}



}
