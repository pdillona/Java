package sub4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
날짜 : 2023/06/27
이름 : 정영재
내용 : JAVA 자료구조 집합 실습

집합(Set)
	- 입력된 데이터의 순서를 고려하지 않고, 중복을 허용하지 않는 자료구조
	- 중복된 데이터를 제거 또는 데이터 존재여부 확인

*/
public class SetTest {
	
	public static void main(String[] args) {
	
		//집합 생성
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set); // 결과: [1, 2, 3, 4, 5] 중복 불허에 의해 1,2,3 제거 
		
		//반복자를 이용한 데이터 출력
		
		Iterator<Integer> iter = set.iterator();   //Iterator 인터페이스로 반복자라고 한다.
		
		
		while(iter.hasNext()) {
			//다음번 데이터가 있을 때 까지 반복 실행
			System.out.println(iter.next());
		}
		
		
		//반복문을 이용한 데이터 출력
		for(int num: set) {
			
			System.out.println("num: " + num);
		}
		
		
	}

}
