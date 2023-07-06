package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
날짜 : 2023/07/06
이름 : 정영재
내용 : JAVA 채팅 프로그램 실습하기

*/
public class ThreadReceiver extends Thread{

	
	private Socket socket;
	
	public ThreadReceiver(Socket socket) {
		this.socket = socket;
	}
	
	
	public void run() {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				
				String msg = br.readLine();
				
				if(msg == null) {
					break;
					
				}
				
				System.out.println("수신> " + msg);
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
}
