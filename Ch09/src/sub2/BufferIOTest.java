package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
날짜 : 2023/06/29
이름 : 정영재
내용 : JAVA 버퍼 입출력 스트림 실습

보조스트림(Buffer)
	- 기본 입출력 스트림에 Buffer를 장착해서 빠른 입출력을 지원하는 보조 스트림.

*/
public class BufferIOTest {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\GG\\Desktop\\Workspace.zip"; 
		String target = "C:\\Users\\GG\\Desktop\\Workspace2.zip";
		
		
		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			//보조스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
			
			while(true) {
				
				//버퍼를 달았으니 버퍼를 단채로 읽어야함.
				int data = bis.read();
				
				if(data == -1) {
					
					break;
				}
				//버퍼를 달았으니 버퍼를 단채로 써야함.
				bos.write(data);
				
			}
			
			bis.close();
			bos.flush(); //순서대로 플러쉬 하고 클로즈 해야한다.
			bos.close();
			
			fis.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료.....");
	}

}
