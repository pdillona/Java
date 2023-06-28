package sub2;

import java.util.LinkedList;
import java.util.Queue;

/*
날짜 : 2023/06/28
이름 : 정영재
내용 : JAVA 자료구조 큐 실습

큐(Queue)
	- 큐는 데이터가 차례대로 쌓이는 자료구조(FIFO:선입선출)
	- 이벤트, 애니메이션 실행에 사용

*/
public class QueueTest {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();  //큐는 인터페이스만있고 구현 클래스가 없어서 LinkedList를 사용
		
		//queue는 .offer()사용
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		while(!queue.isEmpty()) {
			
			System.out.println("큐 빠짐: "+queue.poll());
		}

	}

}
