package sub8;
// 추상 클래스란 최소 하나 이상의 추상 메서드를 갖는 클래스
// 추상 메서드를 가지면 클래스도 추상화 되어야 한다.
public abstract class Car {

	protected String 	name;
	protected String 	color;
	protected int		speed;
	
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color =color;
		this.speed = speed;
		
	}
	
	public abstract void speedUp(int speed); 
	
	public abstract void speedDown(int speed); 
	
	public void show() {
		
		System.out.println("차량 명: "+name);
		System.out.println("차량 색: "+color);
		System.out.println("차량 속도: "+speed);
		
	}
	
}
