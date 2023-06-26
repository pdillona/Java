package sub2;

import java.util.Scanner;

/*
날짜 : 2023/06/26
이름 : 정영재
내용 : 자바 예외 발생 시키기 실습.

*/


//사용자 정의 예외클래스  개발자가 직접 만든 예외 클래스
class MinusException extends Exception{
	
	public MinusException(String msg) {
		
		super(msg);
		
	}
	
}


class OverException extends Exception{
	
	public OverException(String msg) {
		
		super(msg);
		
	}
	
} 

class Score{
	
	public void check(int score) throws MinusException, OverException {  // throws MinusException, OverException 는 Exception으로 단일처리 가능하다. (다형성)
		
		if(score < 0) {  //스코어가 음수일순없으니 0 보다 작으면 예외발생시키기
			// 예외 발생시키기
			throw new MinusException("점수는 음수가 될 수 없습니다.");
			
		}else if(score> 100){ //스코어가 100보다 클 순 없으니 예외 발생.
			//예외 발생 시키기
			throw new OverException("100점을 초과 할 수 없습니다.");
			
		}else {
			System.out.println("점수가 정상입니다.");
		}
		
	}
	
}



public class ThrowTest {

	public static void main(String[] args) {
		
		
		Score score = new Score();
		
		try {
		score.check(-3);
		score.check(102);
		score.check(96);
		}
		catch(MinusException e){
			e.printStackTrace();
		}catch (OverException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 정상종료");
		
		
		
		
	}

}
