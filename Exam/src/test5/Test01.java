package test5;

public class Test01 {
	
	public static void main(String[] args) {
		
		char a = 'A';
		int b = a;
		char c = 66;
		int d = a + b;
		
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		
		
		float n1 = 3.145922645458134f;
		double n2 = 3.132456456465456d;
		
		int n3 = (int) n1;
		int n4 = (int) n2;
		
		

		byte as = 10;
		byte ab = 20;

		byte rs =  (byte) (as + ab); 
		
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("n3: " + n3);
		System.out.println("n4: " + n4);
		System.out.println("rs: " + rs);
		
		String str1 = "홍길동";
		String str2 = null;
		String str3 = "Hello\n"
				+ "World\n"
				+ "Korea";
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		
		
	}
}
