package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
날짜 : 2023/06/29
이름 : 정영재
내용 : JAVA 파일 입출력 스트림 실습

입출력 스트림(Stream)
	- 프로그램은 데이터 처리와 함께 데이터 저장을 위해 파일 입출력 수행 
	- 파일 입출력을 위해 스트림(데이터 연결 통로) 사용

*/
public class FileIOTest {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\GG\\Desktop\\Sample1.txt";  // 확장자까지 포함해야 한다.
		String target = "C:\\Users\\GG\\Desktop\\Sample2.txt"; // 파일 복사.
		
		
		
		try {
			// 스트림 생성(연결)
			FileInputStream fis = new FileInputStream(path);    // 객체 네이밍시 앞자리만 따는게 일반적 입력스트림  FileInputStream()  argument로 경로를 넣어줘야 한다.
																// Resource leak: 'fis' is never closed 리소스 누수. 객체의 메모리 자원을 해제치 않았다는 경고.
			
			FileOutputStream fos = new FileOutputStream(target); // 출력 스트림
			
			while(true) {
				// 파일 읽기 read()는 IOException에러라 따로 처리해 줘야함. 이 때 try catch를 또 해도 되지만 따로 IO를위한 catch를 추가(try)없이 하던지 Exception으로 처리하던지.
				int data = fis.read();
				
				if(data == -1) {
					// 파일을 모두 읽어오면 종료
					break;
				}
				
				// 숫자(아스키 코드로 들어오는 데이터)를 문자로 변환
				char ch = (char) data; // 아스키코드가 정수로 들어오니 정수를 문자로 변환
				System.out.print(ch);  // 한글은 유니코드라 아스키코드 값이 없어 확인 불가.
				
				//System.out.println(data);
				
				//파일 쓰기
				fos.write(data);
				
				
				
			}
			// while을 벗어나 파일다읽고 닫기
			fis.close();
			// 아웃풋 해제
			fos.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) { // Exception보단 세밀하게 핸들링 가능
			
			e.printStackTrace();
		}      
		
		
		
		
		
		System.out.println("프로그램 종료.....");
		
		
	}

}
