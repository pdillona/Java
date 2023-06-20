package sub3;

public class Car {
	
	//heap에 저장
	private String 	name;
	private String 	color;
	private int		speed;
	
	//클래스 변수(=정적 변수)
	public static int 	count;  // 인스터스로 참조가 아닌 클래스로 직접 참조 하기에 static에는 public으로 쓰인다. static이 붙었기에 method area에 저장 된다.
	
	public Car(String name,String color, int speed) {
		
		this.name 	= name;
		this.color	= color;
		this.speed	= speed;
		
		count++;  //this.count++도 가능하나 워닝이 떠서 this빼줬다. //static이라 따로 관리되어 디버깅시 증가하는 모습이 보이지 않음
		//인스턴스로 Car생성 때마다 count가 증가한다.
		
	}
	
	//클래스 메서드(= 정적 메서드)
	public static int getCount() {  //static을 다루는 메서드는 static키워드가 같이 붙어 사용 된다. 
		
		return count;
		//static 변수는 오롯이 static만 참조 가능
		// 만약 return이 name이라면 메모리에 static이 먼저뜨는데 이 때 name은 메모리에 존재하지 않기 때문에 절대 사용할 수 없다. 
	}
	
	public void speedUp(int speed) {
		
		this.speed += speed;
		
		
	}
	
	public void speedDown(int speed) {
		
		this.speed -= speed;
		
	}
	
	public void show() {
		
		System.out.println("차량명: " + this.name);
		System.out.println("차량색: " + this.color);
		System.out.println("속도  : " + this.speed);
		
		
	}
	
	
	
}
