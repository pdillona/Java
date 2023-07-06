package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
날짜 : 2023/07/06
이름 : 정영재
내용 : JAVA HTTP통신 실습

*/
public class HttpTest {

	public static void main(String[] args) {

		FileOutputStream fos = null; //파일에 기록을 위한 스트림
		BufferedReader br = null;	//버퍼를 달아서
		
		try {
			URL url = new URL("https://www.google.co.kr/"); // java.net의 url
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos = new FileOutputStream("./Result.txt");
			
			String line = null;
			
			while((line = br.readLine()) !=null) {
				
				System.out.println(line);
				
				fos.write(line.getBytes());
				
			}
			
			br.close();
			fos.close();
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println("프로그램종료");
	}

}
