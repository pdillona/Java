package sub1;

import java.util.Scanner;


class comp{
	
	
	private Scanner sc = new Scanner(System.in);
	
	
	public Scanner getSc() {
		return sc;
	}


	public void setSc(Scanner sc) {
		this.sc = sc;
	}




	long compair(long a) {
		
		while(true) {
			
			
			if(0 < a && a <= Math.pow(10, 12)) {
				
				break;
				
			}else {
				
				a = sc.nextLong();
			}
		}
		
		return a;
	}
}



public class Baek_Test11 {

	private Scanner sc = new Scanner(System.in);
	
	long compair(long a) {
		
		while(true) {
			
			
			if(0 < a && a <= Math.pow(10, 12)) {
				
				break;
				
			}else {
				
				a = sc.nextLong();
			}
		}
		
		return a;
	}
	
	
	public static void main(String[] args) {
		
		
			
		comp c = new comp();
		
		
		Scanner sc = c.getSc();
		
		
		long aa = sc.nextLong();
		long bb = sc.nextLong();
		long cc = sc.nextLong();
				

		
		
		
		long rs =  c.compair(aa) + c.compair(bb) + c.compair(cc);
		System.out.println(rs);
		
		
		sc.close();
		
		
		
		
		
		
		
	}
}