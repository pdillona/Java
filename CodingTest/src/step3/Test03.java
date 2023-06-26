package step3;
/*
날짜 : 2023/06/23
이름 : 정영재
내용 : 자바 테스트

*/
class Car{
	private String 	brand;
	private String 	name;
	private int		price;
	
	public Car(String brand, String name, int price) {
		this.brand 	= brand;
		this.name 	= name;
		this.price 	= price;
		
		
	}
	
	public void drive() {
		
		System.out.println(name+" 운행중.....");
	}
	
	public void info() {
		
		System.out.println("브랜드: "+brand);
		System.out.println("차량명: "+name);
		System.out.println("가격: "+price);
		
	}
	
}




public class Test03 {

	public static void main(String[] args) {
		
		Car sonata 	= null;  // 생성자에 += 하면 초기화 값도 같이들어감
		Car bmw 	= null;
		
		sonata 	= new Car("현대","소나타",3000);
		bmw 	= new Car("bmw","520d",5000);
		
		sonata.drive();
		sonata.info();
		
		bmw.drive();
		bmw.info();
		
		
		
	}

}
