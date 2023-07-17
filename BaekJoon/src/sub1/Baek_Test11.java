package sub1;

import java.util.Scanner;



class comp{
	

	
	long compair(long a) {
		
		
		
		
		while(true) {
			
			
			
			if(0< a && a<= Math.pow(10, 12)) {
				
				break;
				
			}else {
				
				continue;
				
			}
			
			
		}
		
		return a;
	}
	
}



public class Baek_Test11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		comp c = new comp();
		
		
		
		long aa = sc.nextLong();
		long bb = sc.nextLong();
		long cc = sc.nextLong();
				

		
		long rs = aa + bb + cc;
		System.out.println(rs);
		
	}
}

