package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
날짜 : 2023/06/29
이름 : 정영재
내용 : JAVA properties 실습

프로퍼티
	- 문자열 데이터만 취급하는 key - value형 자료구조 클래스
	- 프로그램의 환경설정 값을 저장할 때 많이 사용
	- 입출력 스트림으로 데이터 입출력

*/
public class PropertiesTest {

	public static void main(String[] args) {
		
		// 프로퍼티 생싱
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		//System.out.println(prop);
		
		String path =  "C:\\Users\\GG\\Desktop\\Fruit.properties"; //확장자가 properties 여야 한다.
		
		
		// 프로퍼티 파일 저장(내보내기)
		try {
			FileOutputStream fos = new FileOutputStream(path);
			
			prop.store(fos, null); //output을 첫 번째 인자값 으로 두 번째는 비운다.(왜?)
			fos.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//프로퍼티 파일 읽기
		String target =  "C:\\Users\\GG\\Desktop\\Cities.properties";
		
		Properties propCities = new  Properties();
		
		try {
			FileInputStream fis = new FileInputStream(target);
			
			propCities.load(fis);
			
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(propCities);
		System.out.println("한국: " + propCities.get("kor"));
		System.out.println("일본: " + propCities.get("jp"));
		System.out.println("미국: " + propCities.get("usa"));
		
		System.out.println("프로그램종료");
		
	}

}
