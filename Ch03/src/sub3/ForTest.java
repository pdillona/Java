package sub3;
/**
 * 
 * 날짜: 2023/06/13
 * 이름: 정영재
 * 내용: Java 반복문 for문 실습하기
 *  
 * 
 * 
 */
public class ForTest {

	public static void main(String[] args) {
		
		//for
		for(int i=1; i<=5; i++) {
			//i는 1 i<=5 비교 조건이 참 이니 for문 수행 i++에 의해 증가 한번더 포문실행 ~~ 조건이 거짓이 될때 까지 반복한다.
			System.out.println("i: "+ i);
			
		}
		/*  결과
		 *  i: 1
			i: 2
			i: 3
			i: 4
			i: 5

		 
		 */
		
		//보통 i를 많이 사용한다.
		
		/*
		 * for(초기식; 조건식; 증감식 서로 세미콜론으로 구분) {
			
			
		}
		*/
		
		
		//1부터 10까지 합
		
		int sum = 0;
		
		for(int k=1; k<=10; k++) {
			
			sum += k;  
		
		}
		
		System.out.println("1부터 10까지의 합: " + sum);
		//결과: 1부터 10까지의 합: 55
		
	    //  =+라는건 없음 sum =+ k;를 풀어보면 sum 에 그냥 k최종값이 들어가게됨 그걸 +부호로 결합하는 식인듯하다. 결과: 1부터 10까지의 합: 10 이렇게나온다.
		
		//디버깅
		/*원하는 라인 넘버 앞을 더블클릭 점이찍히는데 중단점 (break point) 가찍힌다.
		실행버튼 옆 벌레 버튼 클릭 실행 되며 중단점에서 프로그램이 일단 멈춤 f6번 단축키로 수동 실행하며 한 줄씩 체크하여 오류를 체크 할 수 있다.
		더블 클릭으로 브레이킹 포인트를 해제 할 수 있다.*/
		
		
		// 1부터 10까지 짝수합
		int tot = 0;
		
		for(int k=1; k<=10; k++) {
			
			if(k % 2 == 0) { 
				
				tot+=k;
				
			}
			
		}
		//scope에 의해 { }단위로 for문의범위가 국한되기 때문에 변수 k가 같아도 사용이 가능함 이 k같은 변수를 지역 변수라고 한다.
		System.out.println("1부터 10까지 짝수의 합: "+ tot);
		//결과: 1부터 10까지 짝수의 합: 30
		
		// breakpoint가 두 개 이상일때 순서대로 멈추게 되며 건너뛰기 버튼으로 브레이킹 포인트를 건너 뛰는것이 가능하다. 
		
		
		// for중첩
		
		for(int a=1; a<=3; a++) {
			
			System.out.println("a: " + a);
			
			for(int b=1; b<=5; b++) {
				
				System.out.println("b: " + b);
				
				for(int c=1; c<=7; c++) {
					
					System.out.println("c: " + c);
				}
				
			}
			
		}
		//a가 1번 반복 될때 b가 5번 반복 되는 것을 볼 수 있다.
		// 3중 for문도 가능.
		/*	결과
		 *  a: 1
			b: 1
			b: 2
			b: 3
			b: 4
			b: 5
			a: 2
			b: 1
			b: 2
			b: 3
			b: 4
			b: 5	
			a: 3
			b: 1
			b: 2
			b: 3
			b: 4
			b: 5
		 * 
		 * */
		
		
		// 구구단
		
		for(int x=2; x<=9; x++) {
			
				System.out.println(x+"단");
				
			for(int y=1; y<=9; y++) {
				
				int z = x*y;
				System.out.printf("%d x %d = %d\n", x, y, z);
				//포멧 문자열: printf 형식을 지정하는 문자열
				//("%d x %d = %d", x, y, z); 첫 번째 %d에 x 두 번째에 y 세 번째에 z가 대입되는 식의 형식을 지정해 주는 방법
				// 결과: 2단부터 9단까지 출력됨.
			}
			
			
		}
		
		
		
		// 별 삼각형
		
		for(int start=1; start<=10; start++) {
			
			
			
			for(int end = 1; end<=start; end++) {
				
				System.out.print("★");
				
			}
			
			System.out.print("\n"); //개행 (줄바꿈)
			
		}
		
		System.out.println("\n");
		
		// 역 별 삼각형
		for(int start=10; start>=1; start--) {
			
			
			
			for(int end = 1; end<=start; end++) {
				
				System.out.print("★");
				
			}
			
			System.out.print("\n"); //개행 (줄바꿈)
			
		}
		
		// for문 조건에 따라 실행 조건이 바뀔 수 있다. 기본 for문 중첩은 내부 for문이 매번 10번 돌아야 하지만 내부 for문 조건에 의해 매번 반복의 횟수가 바뀜. 
		
		
		
	}
	
}
