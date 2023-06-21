package sub6;

public class Car {

	protected String name;
	protected String color;
	protected int	speed;
	
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color =color;
		this.speed = speed;
		
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
		
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
	
	public void show() {
		System.out.println("차량 명: "+name);
		System.out.println("차량 색: "+color);
		System.out.println("차량 속도: "+speed);
		
		
	}
	
}
