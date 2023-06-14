package sub4;
/*
 * 
 * 날짜: 2023/06/14
 * 이름: 정영재
 * 내용: Java while문 실습하기
 *  
 * 
 * 
 */
public class WhileTest {

	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int sum = 0;
		int k 	= 1;
		
		while(k <= 10) {
			
			sum += k;
			k++;
			
		}
		System.out.println("1~10까지의합: " + sum);

		/*while(조건식 들어가는 자리) {
			// 조건식이 ture일 때 계속해서 돌아간다.
			// 초기식이 아래에 들어갈 수 있다.
			// 증감식이 아래에 들어갈 수 있다.
			
		}*/
		
		// do while
		int tot = 0;
		int i 	= 1;
		
		do{
			
			if(i % 2 == 0) {
				tot += i;
			}
			
			i++;
			
		}
		while(i <= 10); 
		
		System.out.println("1~10까지 짝수의합: " + tot);
		
		/*
		do{
		//무조건 내부를 한 번 실행 후 조건에 따라 실행 여부를 결정
			
		}
		while();
		 */
		
		// break
		
		int num = 1;
		
		while(true) {
			
			if(num % 5 == 0 && num % 7 == 0) {
				// &&(and) 계속 늘려진다.
				break;
				
			}
			
			num++;
			
		}
		System.out.println("5와7의 최소공배수: " + num);
		
		
		
		/*
		while(true) { //true이기에 항상 조건을 만족
			
			if(조건) {
				
				break;  //조건에 만족 할 때 반복문을 탈출할 수 있게 해준다.
				
			}
			
		}*/
		
		//continue
		int total = 0;
		int j = 0;
		
		while(j <= 10) {
			
			j++;
			
			if(j % 2 == 1) {
				
				continue; 
				//continue는 다시 상위로(반복문의 처음) 흐름을 올린다. 즉 95번라인인 j++로 올라간다. 
				//2는 짝수로 false이니 내려가서 total에 짝수를 더 하고 다시 올라간다.
				
			}
			total += j;
		}
		
		System.out.println("1~10까지 짝수의 합: " + total);
		
		
	}
}
