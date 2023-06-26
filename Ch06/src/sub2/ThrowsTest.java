package sub2;

import java.util.Scanner;

/*
날짜 : 2023/06/26
이름 : 정영재
내용 : 자바 Throws 실습.

*/
public class ThrowsTest {
	
	public static void main(String[] args) {  // 메인에서 마저 throws하면 에러시 정상종료 안됨. JVM까지 떠넘길시 에러나면 그냥 바로 종료시킴. 때문에 아무리 미뤄도 main에서는 반드시 예외 처리해줘야함.
		
		try {
			myMethod1(10);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상종료");
	}
	
	public static void myMethod1(int n1) throws Exception {
		
		myMethod2(n1);
		
	}
	
	public static void myMethod2(int n1) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("n2 입력: ");
		int n2 = sc.nextInt();
		
		int result = n1/n2;
		System.out.println(result);
		
	}
	
	
}
