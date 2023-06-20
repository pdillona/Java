package sub2;

public class Car {
	
	private String 	name;
	private String 	color;
	private	int		speed;
	
	
	// 생성자 생성자란? : 클래스 이름과 동일한 메서드
	// 생성자란 캡슐화된 속성을 초기화 하기 위한 메서드
	// 생성자는 클래스와 동일한 이름을 가지고 있으며, 객체가 생성될 때 자동으로 호출됩니다.
	public Car(String name, String color, int speed) {  // private시 여기서 초기화를 해준다.  // 필드와 동일한 매개변수 선언해 준다. // 메서드 이름인데 대문자로 사용된다.
		
		this.name  = name;
		this.color = color;
		this.speed = speed;
		
	}
	
	
	
	//클래스의 필드는 무조건 private로 숨겨야 한다.
	
	public void speedUp(int speed) {
		
		this.speed += speed;
		
	}
	
	public void speedDown(int speed) {
		
		this.speed -= speed;
		
	}
	
	public void show() {
		
		System.out.println("차량 명: " + name);
		System.out.println("차량 색깔: " + color);
		System.out.println("차량 속도: " + speed);
		
	}
	
	//Getter와 Setter 정의
	// 겟터 셋터는 필요에 따라서 정의 한다.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}
