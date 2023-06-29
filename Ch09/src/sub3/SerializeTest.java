package sub3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
날짜 : 2023/06/29
이름 : 정영재
내용 : JAVA 직렬화 실습

객체 직렬화, 역 직렬화
	- 직렬화(serialize)는 자바 객체를 스트림을 통해 외부 파일로 생성하는 작업.
	- 역 직렬화(deserialize)는 외부 객체파일을 다시 자바 객체(인스턴스)로 생성하는 작업.
	- 스트림으로 전송될 객체는 serializable 인터페이스를 구현해 줘야한다. 
*/
public class SerializeTest {

	public static void main(String[] args) {
		
		//객체생성
		
		Apple apple = new Apple("한국", 3000);
		
		
		String path =  "C:\\Users\\GG\\Desktop\\Apple.txt";

		
		try {
			// 객체 스트림 생성
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos); // 보조 스트릠
			
			// 객체 직렬화(내보내기)
			oos.writeObject(apple);
			
			// 스트림 해제
			oos.close(); //항상 보조먼저 종료 후 메인을 종료.
			fos.close(); 	
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");

	}

}
