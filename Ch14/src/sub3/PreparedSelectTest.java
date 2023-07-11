package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/*
날짜 : 2023/07/11
이름 : 정영재
내용 : JAVA ProparedStatement 실습

PreparedStatement
	- 기존 statment보다 향상된 동적 sql 생성을 위한 statement.
	- Query Parameter에 값을 Mapping 시켜 쿼리 실행.
	
	 
VO(Value Object)객체
	- sql 도메인 값을 속성으로 갖는 객체.
	- 테이블 개체(Entity)를 객체(Object)로 변환할 때 사용하는 객체.
	- DTO와 구분해야 한다. 

*/

//VO객체: 테이블 Entity가 변환되는 객체
class User2VO{             //DB의 Entity를 Object로 받을 때 VO객체 사용
  private String uid;
  private String name;
  private String hp;
  private int age;
  
  public String getUid() {
	return uid;
}
  public void setUid(String uid) {
	this.uid = uid;
}
  
  public String getName() {
	return name;
}
  public void setName(String name) {
	this.name = name;
}
  
  public String getHp() {
	return hp;
}
  public void setHp(String hp) {
	this.hp = hp;
}
  
  public int getAge() {
	return age;
}
  public void setAge(int age) {
	this.age = age;
}
  
	
}









public class PreparedSelectTest {

	public static void main(String[] args) {
		
		//DB정보
		String host = "JDBC:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		//결과처리 사용할 리스트 생성
		List<User2VO> users = new ArrayList<>(); 
		
	
		try {
			//DB드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//데이터 베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//SQL실행 객체 생성
			String sql = "SELECT * FROM `User2`";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			//SQL실행
			
			ResultSet rs= psmt.executeQuery();
			
			
			//결과처리
			while(rs.next()) {
				
			
				//VO객체 생성및 초기화
				User2VO vo = new User2VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				//VO객체 List저장
				users.add(vo);
				
			}
			
			
			//연결해제
			rs.close();
			psmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// List결과 출력
		
		for(User2VO vo : users) {
			
			System.out.println("===========================");
			System.out.println("아이디: "+ vo.getUid());
			System.out.println("이름: "+ vo.getName());
			System.out.println("전화번호: "+ vo.getHp());
			System.out.println("나이: "+ vo.getAge());
			
		}
		
		System.out.println("===========================");
		System.out.println("SELECT완료.....");
	

	}

}
