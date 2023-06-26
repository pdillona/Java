package step3;
/*
날짜 : 2023/06/23
이름 : 정영재
내용 : 자바 테스트

*/
class Rent{
	
	public void payment() {
		
		System.out.println("임대료를 받습니다.");
	}
	
}

class Landload extends Rent{
	
	public void getMoney() {
		System.out.println("건물주 입니다.");
		payment();
	}
	
}


public class Test06 {

	public static void main(String[] args) {
		
		Landload master = new Landload();
		master.getMoney();
		
	}

}
