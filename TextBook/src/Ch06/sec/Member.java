package Ch06.sec;

public class Member {

	String name;
	String id;
	String password;
	int age;
	
	public Member(String n, String i, String p) {
		this.name = n;
		this.id = i;
		this.password = p;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Member User1 = new Member("홍길동", "hong", "1234");
		
		System.out.println(User1.name);
		System.out.println(User1.id);
		
		
		MemberService ms = new MemberService();
		boolean rs = ms.login("hong", "1234");
		if(rs) {
			System.out.println("로그인 되었습니다.");
			ms.logout("hong");
		}else {
			System.out.println("id또는 password가 올바르지 않습니다.");
		}
		
		
		
		
	}
	

}
