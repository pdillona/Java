package sub3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
날짜 : 2023/07/04
이름 : 정영재
내용 : JAVA 스트림 실습

스트림(Stream)
	- 컬렉션 원소를 람다식으로 일괄처리(batch) 할 수 있는 API
	- 내부적으로 병렬 처리를 수행하여 대용량 데이터 처리에 더 나은 성능을 제공한다.

*/
public class CollectionStreamTest {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("김유신");
		names.add("김춘추");
		names.add("장보고");
		names.add("강감찬");
		names.add("이순신");
		
		//외부 반복자를 이용한 출력
		for(String name: names ) {
			
			System.out.println("name: "+ name);
		}
		
		//내부반복자를 이용한 출력 
		Stream<String> stream = names.stream();
		stream.forEach( (name) ->{
			System.out.println("name: " + name);
		} );
		
		// 대용량 데이터가 있을 경우 for문은 메인스레드가 담당하나 stream은 스레드를 사용해서 효율적으로 프로그램이 돌아간다.
		
		
		
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("김유신",23));
		people.add(new Person("김춘추",44));
		people.add(new Person("강감찬",27));
		people.add(new Person("장보고",53));
		people.add(new Person("이순신",51));
		
		
		//외부 반복자를 이용한 출력
		
		for(Person person : people) {
			System.out.println("이름: "+person.getName() + ", 나이: "+ person.getAge());
		}
		
		//내부 반복자를 이용한 출력
		Stream<Person> stream2 = people.stream();
		stream2.forEach( (Person) ->{
			System.out.println("이름: "+Person.getName() + ", 나이: "+ Person.getAge());
		} );
		
		
		
		
	}

}
