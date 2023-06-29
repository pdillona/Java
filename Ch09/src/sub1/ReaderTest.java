package sub1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
날짜 : 2023/06/29
이름 : 정영재
내용 : JAVA 파일 입출력 스트림 실습

문자스트림
	- 아시아권 문자를 위한 문자 전용 스트림
	- 유니코드 기반으로 UTF-8 인코딩으로 아시아권 문자 인코딩 처리

*/
public class ReaderTest {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\GG\\Desktop\\Sample1.txt";  // 확장자까지 포함해야 한다.
		String target = "C:\\Users\\GG\\Desktop\\Sample2.txt"; // 파일 복사.
		
		
		
		try {
			// 스트림 생성(연결)
			FileReader fr = new FileReader(path);
			FileWriter fw = new FileWriter(target);
			
			
			while(true) {
				// 파일 읽기 read()는 IOException에러라 따로 처리해 줘야함. 이 때 try catch를 또 해도 되지만 따로 IO를위한 catch를 추가(try)없이 하던지 Exception으로 처리하던지.
				int data = fr.read();
				
				if(data == -1) {
					// 파일을 모두 읽어오면 종료
					break;
				}
				
				// 숫자(아스키 코드로 들어오는 데이터)를 문자로 변환
				char ch = (char) data; // 아스키코드가 정수로 들어오니 정수를 문자로 변환
				System.out.print(ch);  // 한글은 유니코드라 아스키코드 값이 없어 확인 불가.
				
				//System.out.println(data);
				
				//파일 쓰기
				fw.write(data);
				
				
				
			}
			// while을 벗어나 파일다읽고 닫기
			fr.close();
			// writer 해제
			fw.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) { // Exception보단 세밀하게 핸들링 가능
			
			e.printStackTrace();
		}      
		
		
		
		
		
		System.out.println("프로그램 종료.....");
		
		
	}

}
