package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
날짜 : 2023/06/29
이름 : 정영재
내용 : JAVA 역직렬화 실습


*/
public class DeSerializeTest {

	public static void main(String[] args) {
		
		String path =  "C:\\Users\\GG\\Desktop\\Apple.txt";
		
		try {
			FileInputStream fis =  new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//역직렬화
			Apple apple = (Apple)ois.readObject();  //ois가 오브젝트 타입이니 어느객체로도 다운캐스팅 가능.
			
			apple.show();
			
			//스트림해제
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		System.out.println("프로그램종료");
		
		
	}

}
