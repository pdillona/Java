package test7;

class Bus{
	private String number;
	private int fee;
	
	
	public Bus(String n,  int f) {
		this.number = n;
		this.fee = f;
		
	}
	
	

	public void Take(String name) {
		System.out.printf("%s은 %s버스를 탑니다.\n", name, number);
		System.out.printf("버스 요금은 %,d 입니다.\n", fee);
	}
}

class Subway{
	private String line;
	private int fee;
	
	
	public Subway(String l, int f) {
		this.line = l;
		this.fee = f;
		
	}
	
	
	
	public void Take(String name) {
		System.out.printf("%s는 %s호선 지하철을 탑니다.\n", name, line);
		System.out.printf("지하철 요금은 %,d입니다\n", fee);
	}
	
}

class User{
	private String name;
	private int age;
	
	public User(String n, int a) {
		this.name = n;
		this.age = a;
		
	}
	
	
	
	public void takeBuse(Bus bus) {
		bus.Take(name);
	}
	public void takeSubway(Subway subway) {
		subway.Take(name);
	}
	
	
}




public class Test03 {

	public static void main(String[] args) {
		
		
		User kim = new User("김유신", 24);
		User lee = new User("이순신", 34);
		
		
		Bus bus = new Bus("64", 1500);
		Subway subway = new Subway("1", 1600);
		
		kim.takeBuse(bus);
		lee.takeSubway(subway);
		
		

		
		
	}
}
