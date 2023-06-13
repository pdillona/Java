package sub1;

/**
 * 날짜 : 2023/06/12
 * 이름 : 정영재
 * 내용 : ch01.Java 개발환경 구축
 */
/**
 * 
 * 	System.out.println("Hello World~");
 *	shift enter 누르니까 밖으로나가서 줄바꿈됨
 *
 *	//는 한줄짜리 주석
 *	/** 엔터후 /로 닫아주는건 긴 주석
 */
public class Hello {

	// 프로그램 진입점
	public static void main(String[] args) {
		
		// 기본 출력
		System.out.println("Hello World~"); // 결과: Hello World~
		System.out.println("Hello Wo"
				+ "rld~"); // 적다가 엔터 누르면 줄바뀜+나뉨 결과: Hello World~
		//System.out.println("Hello" "World"); //나뉘어도 +없으니까 에러뜸
		System.out.println("Hello Java~");
		
		//한줄 출력  결과: Hello Korea~
		System.out.print("Hello ");  //ln은 라인을 의미
		System.out.print("Korea~");
		
		// 개행(줄바꿈) 처리  "\n"이 없을때 결과: Hello Korea~Hello Busan~
		System.out.println("\n");
		System.out.print("Hello Busan~");
		//\n빠지면 한줄로 나옴 줄이안바뀜.
		
		//교재 1장까지 내용
		
		
	}

}
