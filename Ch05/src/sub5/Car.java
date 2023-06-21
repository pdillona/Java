package sub5;

public class Car {
	//private에서 protected로 접근권한 변경을 통해 자식 클래스에 참조가 가능해 진다.
	protected String 	name;
	protected String 	color;
	protected int		speed;
	
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		
	}
	
	public void speedUp(int speed) {
		
		this.speed += speed;
		
	}
	
	public void speedDown(int speed) {
		
		this.speed -= speed;
		
	}
	
	public void show() {
		System.out.println("차량 명: "+ name);
		System.out.println("차량 색깔: "+ color);
		System.out.println("차량 속도: "+ speed);
		
	}
	
	
}
