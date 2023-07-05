package sub5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
날짜 : 2023/07/04
이름 : 정영재
내용 : JAVA 스트림 매핑 실습

맵 스트림
	- 스트림 요소(컬렉션 원소)를 다른 요소로 변환 시키는 스트림
	- map(), flatMap() 등 

*/
public class MapStreamTest {

	public static void main(String[] args) {
	
		List<Person>	people = new ArrayList<>();
		
		people.add(new Person("김유신",45));
		people.add(new Person("강감찬",48));
		people.add(new Person("김춘추",24));
		people.add(new Person("장보고",37));
		people.add(new Person("이순신",54));

		// map
		people.stream().map((person)->person.getName()).forEach((name) -> System.out.print(name + ", "));
		
		System.out.println();
		
		List<String> list = Arrays.asList("1,2,3","4,5,6","7,8,9");
		System.out.println(list);
		
		
		// flatMap
		list .stream().flatMap((str)-> Arrays.stream(str.split(","))).forEach(num-> System.out.print(num+", "));
		
		
		System.out.println();

		
		//flatMapToInt
		int result = list.stream().flatMapToInt((str)->{
			String[] strArr = str.split(",");
			
			int[] nums = new int[strArr.length];
			
			for(int i = 0; i<strArr.length; i++) {
				nums[i] = Integer.parseInt(strArr[i]);
				
			}
			return Arrays.stream(nums);
			
		}).sum();
		
		System.out.println(result);
		
		
		int a = 180;
		byte b = (byte)a;
		
		System.out.println(a);
		System.out.println(b);
		
		
		int a1 = 50;
		double b1 = 20.5;
		double rs = a1+b1; 
		System.out.println(rs);
		
	}

}
