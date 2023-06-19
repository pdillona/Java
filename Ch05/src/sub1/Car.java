package sub1;  //클래스 파일이 위치한 패키지명
/*
 * 날짜 : 2023/06/19
 * 이름 : 정영재
 * 내용 : 자바 클래스 실습하기
 * 
 */

// Car 클래스 정의
public class Car { //클래스 구조체 public으로 시작하며 class네임이 붙는다.

	//추상화: 속성과 기능으로 추상화 한다. 
	
	//필드와 메서드는 정답이 없으며 내가 스스로 정의한다.
	
	//필드(속성)(변수선언)
	String 	name;
	String 	color;
	int		speed;
	
	
	
	
	//메서드(기능)
	public void speedUp(int speed) {
		this.speed += speed;
		
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
	
	public void show(){  
		
		System.out.println("차량명: "+  this.name);
		System.out.println("색깔: "+  this.color);
		System.out.println("속도: "+  this.speed);
	
	}

} //이렇게 만들어진 클래스를 통해 객체를 생성해야 한다.(Instance 생성)
// 클래스 설계후 메인으로 돌아감.
