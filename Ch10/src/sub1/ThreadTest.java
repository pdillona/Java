package sub1;
/*
날짜 : 2023/07/03
이름 : 정영재
내용 : JAVA Thread 실습

스레드(Thread)
	- 하나의 프로세스 안에서 실행되는 프로그램 실행흐름
	- 스레드는 동시에 실행되는 병행 실행
	- Thread 클래스를 상속 받아 start로 실행
	
*/
public class ThreadTest {

	public static void main(String[] args) {
		
		// 스레드 객체 생성
		SubThread st1 = new SubThread("Sub1");
		SubThread st2 = new SubThread("Sub2");
		
		// 자식 스레드 실행
		st1.start();
		st2.start();
		
		
		for(int i =0; i<10; i++) {
			
			try {
				Thread.sleep(1000); // 1000이: 1초 sleep: 대기
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}  
			
			System.out.println("메인스레드 실행@@@@@@@");
			
		}
		
		System.out.println("메인스레드 종료/////////");

	}

}
