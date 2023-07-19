package Ch06.sec;

public class MemberService {

	
	
	
	
	
	public boolean login(String id, String password) {
		
		//if문 사용시 반드시 조건에 만족하지 않는 경우에는 어떤걸 리턴 할지도 작성해 줘야한다. This method must return a result of type boolean 와 같이 리턴 하라는 에러가 뜬다.
		if(id == "hong" && password == "1234") {
		
			return true;
			
		}else {
			
			return false;
		}
		
	}
	
	public void logout(String id) {
		
		System.out.println(id + " 님이 로그아웃 되었습니다.");
	}
	
	
}
