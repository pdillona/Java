package sub1;
/*
날짜 : 2023/06/26
이름 : 정영재
내용 : 자바 Exception 실습

예외 처리(Exception)
	- 예외는 츠로그램 실행중에 발생하는 모든 에러(Error)
	- 실행중(runtime) 발생하는 예외와 컴파일 타임(compile time)에 발생하는 예외를 처리
	- 메서드 내부에 발생하는 예외를 호출한 쪽으로 throws로 처리한다. 
	- 사용자가 생성한 예외를 throw로 처리한다.
*/
public class ExceptionTest {
	public static void main(String[] args) {
		
		//실행예외
		
		// 예외상황1: 어떤수를 0으로 나눌 때 
		int num1 = 1;
		int num2 = 0;
		
		int rs1 = 0;
		int rs2 = 0;
		int rs3 = 0;
		int rs4 = 0;  //초기화 해주지 않으면 try구문 안의 지역변수를 참조 못한다.
					  //에러는 rs4에서 나지만 일관성을 위해 한번에 넣어준모습.
		
		
		try {
			//예외가 발생할 가능성이 있는 코드 작성
			
			rs1 = num1 + num2;
			rs2 = num1 - num2;
			rs3 = num1 * num2;
			rs4 = num1 / num2;  //나누는 수가 0이되면 java.lang.ArithmeticException 이 뜬다. /여기서 에러나도 실행되도록 예외처리
			
		} catch (ArithmeticException e) {  //(Exception e)
			//예외가 발생 했을 때 처리할 코드 작성
			e.printStackTrace(); //예외 내용 출력
		}
		
		
		System.out.println(rs1);
		System.out.println(rs2);
		System.out.println(rs3);
		System.out.println(rs4);
		
		
		// 예외상황2: 배열의 index 범위를 벗어났을 때
		
		int[] arr = {1,2,3,4,5};
		
		
		try {
			
			for(int i=0; i<6; i++) { 	//java.lang.ArrayIndexOutOfBoundsException 인덱스 범위를 벗어날 경우
										// 
				
				System.out.println("arr["+i+"]:" + arr[i]);
				
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			
		}
		
		
		// 예외상황3: NullPointerException
		Animal ani = null; //  // NullPointerException 호출한 함수가 NUll값을 가질때.
		
		
		try {
			
			ani.move(); 
			ani.hunt();
		} catch (NullPointerException e) {
			//객체 생성 없이 참조(Null point) 
			e.printStackTrace();
		}
		
		
		// 예외상황4:
		Animal a1 = new Tiger(); //업캐스팅
		Animal a2 = new Eagle(); //업캐스팅
		Animal a3 = new Shark(); //업캐스팅
		
		
		try {
			
			Eagle eagle = (Eagle) a1; // 다운캐스팅 Tiger를 Eagle로 다운캐스팅 못함. 에러가 난다. 아래도 마찬가지. ClassCastException 이 뜬다.
			Shark shark = (Shark) a2;
			Tiger tiger = (Tiger) a3;
			
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		
		
		//일반예외
		
		try {
		
			Class animal = Class.forName("sub1.Lion");  //ClassNotFoundException
		
		} catch (ClassNotFoundException e) {
			// 찾을 수 없는 클래스 선언
			e.printStackTrace();
			
		} finally {
			// 예외 처리 발생 유무에 상관없이 마지막에 항상 실행되는 코드
			
			System.gc();  //가비지 컬렉터 garbage collector, 메모리정리, heap의 즉각 instance정리 시키는
			
			System.out.println("finally실행");
			
		}		
		
		System.out.println("프로그램 정상종료");
		
	}
}
