package sub2;
/*
날짜 : 2023/07/03
이름 : 정영재
내용 : JAVA Thread 동기화 실습

스레드 동기화, 비동기화
	- 동기 방식은 순서를 지키며 실행되는 처리 흐름
	- 비동기 방식은 순서를 지킺 않고 처리되는 실행 흐름


*/
public class ThreadSyncTest {

	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		//자식 스레드 실행(비동기 방식)
		ct1.start();
		ct2.start();
		ct3.start();
		

		// 자식 스레드 작업이 완료 후 다시 메인 스레드로 합류 시켜준다. (스레드 대기)
		ct1.join();
		ct2.join();
		ct3.join();

		
		
		System.out.println("count: "+ count.getNum());
		
	}

}
