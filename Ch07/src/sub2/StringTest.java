package sub2;
/*
날짜 : 2023/06/27
이름 : 정영재
내용 : JAVA Object Class 실습

String 클래스

	- String 문자열을 처리하는 클래스
	- 문자열 비교는 equals, 다양한 문자열 가공 메서드 제공
	- String 클래스의 immutable 특성으로 인한 성능을 개선하기 위해 StringBuilder 사용.


*/
public class StringTest {
	
	public static void main(String[] args) {
		
		//문자열(문자+배열) 생성
		String str1 = "Hello";  				// 리터럴 방식(암시적)
		String str2 = new String("Hello");  	// 명시적. 리터럴방식을 명시적으로 풀어낸것. 원래라면 이렇게 문자열 생성해야함.
		

		
		System.out.println("str1 :" +str1);
		System.out.println("str2 :" +str2);
		
		if(str1 == str2) {
			
			System.out.println("1과 2의 주소가 같다.");
		}else {
			System.out.println("1과 2의 주소가 다르다.");
			
		}
		
		
		if(str1.equals(str2)) {   //equals로는 int값을 비교 불가 Cannot invoke equals(int) on the primitive type int.  primitive type은 클래스가 아니라서 메서드 호출 불가
			System.out.println("1과 2는 값이가 같다.");
		}else {
			System.out.println("1과 2는 값이가 다르다.");
		}
		
		int a = 51;
		
		// 문자열 길이
		String msg = "Hello Korea"; //공백도 문자포함.
		System.out.println("msg길이: "+msg.length()); // 결과: 11
		
		
		// 문자열 추출
		char c1 = msg.charAt(0);// ()안은 인덱스번호
		char c2 = msg.charAt(6);
		
		
		System.out.println("msg 1번째 문자: "+ c1); 
		System.out.println("msg 1번째 문자: "+ c2);
		
		
		// 문자열 자르기
		String sub1 = msg.substring(0,5);  // 0~5까지 자르란 의미.
		String sub2 = msg.substring(6);		// 6번 부터 마지막 까지 잘라 준다.
		
		System.out.println("sub1: "+sub1);
		System.out.println("sub1: "+sub2);
		
		// 문자열 인덱스
		int idx = msg.indexOf("e"); // msg 문자열에 대한 e의 인덱스 번호를 앞에서부터 구한다. msg에는 e가 두 개있는데 먼저 있는 것부터 구한다. 결과: 1 
		int idx2 = msg.lastIndexOf("e"); // indexOf와 반대 뒤에서부터 찾기 시작한다.  //결과: 9
		
		System.out.println("idx: "+ idx);
		System.out.println("idx2: "+ idx2);
		
		
		// 문자열 교체
		
		String rs1 = msg.replace("Korea", "Busan");
		String rs2 = msg.replace("Hello", "Welcome");
		
		
		System.out.println("rs1: "+rs1);// 결과: rs1: Hello Busan
		System.out.println("rs2: "+rs2);// 결과: rs2: Welcome Korea
		
		// 문자열 변환: 문자열이 아닌것들을 문자열로 변환한다.
		int 	var1 = 1;
		double 	var2 = 3.14;
		boolean var3 = true;
		
		/*
		 * 아래와 같은 시도를 하는중. 캐스팅과는 다른 변환의 개념 
		 * String s1 = var1; 
		 * String s2 = var2; 
		 * String s3 = var3;
		 */
		
		String s1 = String.valueOf(var1); 
		String s2 = String.valueOf(var2); 	
		String s3 = "" + var3;				//이렇게도 변환가능.
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
	
}
