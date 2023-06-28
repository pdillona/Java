package sub3;

import java.util.ArrayList;
import java.util.List;


/*
날짜 : 2023/06/27
이름 : 정영재
내용 : JAVA 자료구조 리스트 실습

List
	- 배열과 유사하지만 동적으로 생성되는 선형 자료구조
	- List를 구현한 ArrayList
*/
public class ListTest {

	public static void main(String[] args) {
		
		// List생성
		List<Integer> list = new ArrayList();  //유연성을 위해 다형성을 활용 인터페이스 List로 선언해 준다.
		
		// 데이터 입력 list는 .add()를사용
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//데이터삽입 .add()
		list.add(1, 6); //.add의 parameta를 보면 index, element가 있으니 1번 인덱스에 6을 삽입한다. 결과: [1, 6, 2, 3, 4, 5] 2가 밀려나고 인덱스 가 0~5로 증가함
		
		//데이터 제거 .remove()
		list.remove(2);  // argument인덱스 제거.  결과: [1, 6, 3, 4, 5] 

		
		System.out.println(list);
		
		
		//데이터 출력 .get()
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		
		//리스트 크기 .size()
		System.out.println("list크기: "+list.size()); // 사이즈는 index 넘버로 세지 않음  결과: 5
		
		
		//리스트 반복문
		
		for(int num:list) {    //auto unboxing
			
		System.out.println(num);	
		
		}
		
		//문자열 리스트
		List<String> people = new ArrayList<>();
		
		
		people.add("강감찬");
		people.add("홍길동");
		people.add("이순신");
		people.add("이이");
		people.add("김좌진");
		people.add("장보고");
		
		System.out.println(people);
		
		
		//객체 리스트
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국",3000); 
		Apple a2 = new Apple("미국",2000); 
		
		apples.add(a1);
		apples.add(a2);
		
		apples.add(new Apple("일본",1000));
		
		Apple apple = apples.get(0);
		apple.show();
		
		apples.get(1).show();  //연달아 실행하는 행위 chain이라고함.
		apples.get(2).show();
		
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(apples.get(2));
		
	}

}
