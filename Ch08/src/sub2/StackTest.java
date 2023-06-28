package sub2;

import java.util.Stack;

/*
날짜 : 2023/06/28
이름 : 정영재
내용 : JAVA 자료구조 스택 실습

스택(Stack)
	- 스택은 데이터가 순서대로 쌓이는 구조
	- 변수 선언과 메서드 실행에 사용

*/
public class StackTest {
	
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();                  	//E = Element 원소 //<>은 참조변수만 참조하기에 primitive타입을 사용불가.   Syntax error, insert "Dimensions" to complete ReferenceType
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		/*
		 * System.out.println("stack의 팝:"+ stack.pop());//parameta에 데이터 못넣음 The method pop() in the type Stack<Integer> is not applicable for the arguments (int)
		 * System.out.println("stack의 팝:"+ stack.pop()); System.out.println("stack의 팝:"+
		 * stack.pop()); System.out.println("stack의 팝:"+ stack.pop());
		 * System.out.println("stack의 팝:"+ stack.pop()); System.out.println("stack의 팝:"+
		 * stack.pop()); System.out.println("stack의 팝:"+ stack.pop());
		 * System.out.println("stack의 팝:"+ stack.pop());
		 */
		
		
		while(!stack.empty()) {//스택이 비어있지 않으면
			System.out.println("stack pop: "+stack.pop());
		}
		
		
	}
}
