package sub2;

/**
 * 
 * 날짜: 2023/06/12
 * 이름: 정영재
 * 내용: Java 자료형 실습하기
 * 
 * 자료형(Data Type)
 *  - 변수에 저장되는 데이터의 종류와 크기를 나타낸 키워드
 *  - 자료형은 기본형과 참조형(객체)으로 나뉨
 *  
 * 
 * 
 */

public class DataTypeTest {
	
	public static void main(String[] args) {
		
		// 정수형
		byte num1 = 127;   //정수형중 가장 크기가 작은타입 1byte 127까지 저장가능 
		//byte num1 = 128; 127넘어서 아래의 에러가난다.  
		//Type mismatch: cannot convert from int to byte
		//1byte는 8bit  bit는 컴퓨터의 최소단위 메모리에서 젤 앞칸은 부호(음수 양수)표기하는 칸이다
		short num2 = 32767;  //2byte 32767까지 
		
		int num3 = 2147483647; //   2147483647까지 사실상 이거보다 클 일 없음
		
		long num4 = 922337203685477507L;  // 922337203685477507L 롱타입의 표시를 위해 마지막에 L을 붙임
		
		System.out.println("num1 : "+ num1);
		System.out.println("num1 : "+ num2);
		System.out.println("num1 : "+ num3);
		System.out.println("num1 : "+ num4);

		/*
		 *결과:  num1 : 127
				num1 : 32767
				num1 : 2147483647
				num1 : 922337203685477507
				앞에 - 붙이면 음수도가능  ex) long num4 = -922337203685477507L;
		 */
		
		// 실수형
		float var1 = 0.123456789f; // float은 마지막에 소문자 f를 써서 float임을 표기
								   // 결과: 0.12345679	float는 8자리까지 표시 (마지막8이 반올림되며 9로 바뀜)
		double var2 = 0.1234567890123456789; // 소수점을 사용하는것은 정밀데이터를 표기 할 확률이 높기 때문에 double을 더 많이 씀
											 // 결과: 0.12345678901234568 double은 17자리까지표시
		System.out.println(var1);
		System.out.println(var2);
		
		
		
		// 논리형
		boolean data1 = true;
		boolean data2 = false;
		
		System.out.println("data1 :" + data1);	//결과: data1 :true
		

		System.out.println("data2 :" + data2);  //결과: data2 :false
		
		
		// 문자형
		char c1 = 'A';  //char는 결국 int 문자를 아스키 코드로 변환화여 저장 하기때문에.
		char c2 = '가';  //char는 ''(홑따옴표)를 이용하여 표기  
		
		System.out.println("c1: " + c1);   //결과: c1: A		
		System.out.println("c2: " + c2);   //결과: c2: 가 
		
		//프로그래밍에서는 단어를 문자열이라고 한다. 문자열 부터는 String을 쓴다. 
		
		// 문자열
		String str1 = "A";
		String str2 = "가";
		String str3 = "Apple";
		String str4 = "가을";
		//String은 객체 이기 때문에 String만 S 즉 대문자로 표긴된다.
		
		System.out.println("str1: " + str1); //결과: str1: A
		System.out.println("str2: " + str2); //결과: str2: 가
		System.out.println("str3: " + str3); //결과: str3: Apple
		System.out.println("str4: " + str4); //결과: str4: 가을
		
		// int, double, String, boolean이 가장 중요하고 많이 씀 
		
		
	}

}
