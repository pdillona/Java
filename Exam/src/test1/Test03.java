package test1;
/**
 * 
 * 날짜: 2023/06/13
 * 이름: 정영재
 * 내용: Java 연산자 연습문제
 *  
 * 
 * 
 */
public class Test03 {
	
	public static void main(String[] args) {
		
		int result = 0;
		int num = 1;
		
		result = num++;  //++이 뒤 에있으면 대입과 증감의 우선순위는 대입이 먼저이다. 해서 result = num 이먼저 대입된 후 num값이 증가한다.
		System.out.println("result : "+ result);
		// System.out.println(num);//결과: 2 result가 1이된후 num이 2가되니 result는 1 num은 2 가 된다. 
		
		result = ++num;  // 결과:3 즉 num값이 증가하고 대입이 실행 되었다. ++이 앞에 있기에 증가후 대입이 되어 result값 도 3이됨
		System.out.println("result : "+ result);
		
		result = num--;
		System.out.println("result : "+ result);
		
		result = --num;
		System.out.println("result : "+ result);
		
		
	}
}
