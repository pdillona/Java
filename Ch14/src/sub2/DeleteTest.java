package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
날짜 : 2023/07/10
이름 : 정영재
내용 : JAVA Delete 실습

*/
public class DeleteTest {

	public static void main(String[] args) {

		String host = "JDBC:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		try {
			// 1 단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2 단계 - JDBC연결
			Connection conn = DriverManager.getConnection(host, user, pass);
						
			// 3 단계 - JDBC연결
			Statement stmt = conn.createStatement();
			
			// 4 단계 - JDBC연결
			String sql = "delete from User1 where `uid` = 'J105'";
			stmt.executeUpdate(sql);
			
			// 5 단계 - JDBC연결
			// 6 단계 - JDBC연결
			
			stmt.close();
			conn.close();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("delete 완료....");
		
	}

}
