package sub2;

public class StringBuilderTest {

	public static void main(String[] args) {
		//String immutable특성.
		String str = "Java";
		System.out.println("str 객체 주소 확인: " + System.identityHashCode(str));

		str +="Programming";
		System.out.println("str 객체 주소 확인: " + System.identityHashCode(str)); 
		//String의 값 변경시 같은 주소안에 값만 변경 하는 것이 아닌 다른 공간을 새로 생성해서 변경된 값을 잡아 넣는다. 실제로 7번 라인과 10번 라인의 주소가 다르다.
		
		
		//String의 immutable 특성을 개선한 StringBuilder.
		//StringBuilder를 사용하면 같은 주소 값에서 값을 변경 해준다. 메모리적 효율을 추구하는법 (요즘 메모리 이슈가 아니더라도 성능의 문제). 
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 객체 주소:" + System.identityHashCode(sb));
		
		sb.append("Programming");
		System.out.println("sb 객체 주소:" + System.identityHashCode(sb));
		
		System.out.println("sb: "+ sb);
	}
		 
}
