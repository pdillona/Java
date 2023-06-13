package sub3;
/**
 * 
 * 날짜: 2023/06/13
 * 이름: 정영재
 * 내용: Java 연산자 실습 
 *  
 * 연산자 (Operator)
 *  - 변수의 데이터를 처리하기 위한 연산식
 *  - 일반적으로(프로그래밍에서) 산술, 복합대입, 비교, 논리연산을 수행
 *  
 */
public class OperatorTest {
	
	public static void main(String[] args) {
		
		// 산술 연산자
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num2 * num3;
		int result4 = num4 / num2;
		int result5 = num4 % num3; //나머지를 구하는 연산자
		int result6 = num4 % 5;  // 지수가 더 클때 몫은 4가된다.  
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
		System.out.println("result5: " + result5);
		System.out.println("result6: " + result6);
		/*  결과:
		 *  result1: 3
			result2: -1
			result3: 6
			result4: 2
			result5: 1
			result6: 4
		 */
		
		
		// 증감 연산자
		
		int num = 0;
		int num0; // 선언만 하는것도 가능
		
		//선언은 메모리에 데이터공간을 만듬(int num부분) 공간을 비울수 없으니 값을 최초대입 하는것을 초기화라함(num = 0 부분)

		num++;
		++num;
		
		System.out.println("num:"+ num);
		//결과: num:2
		
		
		num--;
		--num;
		
		System.out.println("num:"+ num);
		//결과: num:0
		
		
		// 복합 대입 연산자
		
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4, n5 = 5; //이렇게 해도 각각 초기화됨
		
		n1 += 1;	// n1 = n1 + 1 과 같음
		n2 -= 2; 	// n2 = n2 - 2
		n3 *= 3;	// n3 = n3 * 3
		n4 /= 4;	// n4 = n4 / 4
		n5 %= 4;  	// n5 = n5 % 4
		// n5 = n5 % 4와 같은 방식은 cpu가 n5를 두번 참조 해야되기 때문에  n5 %= 4;(한번참조) 와같은 방식의 코딩을 해야한다.
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("n3: " + n3);
		System.out.println("n4: " + n4);
		System.out.println("n5: " + n5);
		
		
		/*결과
		 *  n1: 2
			n2: 0
			n3: 9
			n4: 1
			n5: 1
		 */
		
		
		
		// 비교 연산자
		
		int var1 = 1;
		int var2 = 2;
		
		boolean rs1 = var1 > var2;	// va1은 var2 보다 크다.  
		boolean rs2 = var1 < var2;	// va1은 var2 보다 작다.
		boolean rs3 = var1 >= var2; // va1은 var2 보다 크거나 같다.
		boolean rs4 = var1 <= var2;	// va1은 var2 보다 작거나 같다.
		boolean rs5 = var1 == var2;	// va1은 var2 와 서로 같다.
		boolean rs6 = var1 != var2;	// va1은 var2 와 서로 다르다.
		
		//비교시 기준은 항상 왼쪽이 기준! 비교값은 숫자가 아닌 true false 이기 때문에 boolean을 쓴다.
		
		System.out.println("rs1: " + rs1);
		System.out.println("rs2: " + rs2);
		System.out.println("rs3: " + rs3);
		System.out.println("rs4: " + rs4);
		System.out.println("rs5: " + rs5);
		System.out.println("rs6: " + rs6);
		
		/* 결과
		 *  rs1: false
			rs2: true
			rs3: false
			rs4: true
			rs5: false
			rs6: true

		 */
		
		// 논리 연산자
		
		int var3 = 3;
		int var4 = 4;
		
		boolean res1 = (var3 > 3) && (var4 > 3); // &&는 그리고 즉 해당 라인은 둘다 트루여야 ture
		// 0은 false 1은 ture를 뜻한다. 즉 &&시 1 1이어야 ture
		// res1은 0 1 즉 false ture 기 때문에 결과값은 false
		// var3는 3보다 크고 그리고 var4는 3보다 작다.
		boolean res2 = (var3 > 2) && (var4 > 3);
		// var3는 2보다 크고 그리고 var4는 3보다 크다.
		boolean res3 = (var3 > 2) || (var4 > 3); // ||는 or의 의미를 가진다.
		// var3는 2보다 크거나 var4는 3보다 크다.
		boolean res4 = (var3 > 3) || (var4 > 5);
		// var3는 3보다 크거나 var4는 5보다 크다.
		boolean res5 = !(var3 > var4); 
		// var3는 var4보다 크지않다.
		
		
		System.out.println("res1: "+ res1);
		System.out.println("res2: "+ res2);
		System.out.println("res3: "+ res3);
		System.out.println("res4: "+ res4);
		System.out.println("res5: "+ res5);
		
		/* 결과
		 *  res1: false
			res2: true
			res3: true
			res4: false
			res5: true
		 */
	
		
		
	}

}

// 단축키  ctrl alt  방향키 = 한줄복사
// ctrl d  한줄 제거