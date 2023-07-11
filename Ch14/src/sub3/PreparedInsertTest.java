package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
날짜 : 2023/07/11
이름 : 정영재
내용 : JAVA ProparedStatement 실습

*/

public class PreparedInsertTest {

	public static void main(String[] args) {

		//DB정보
		String host = "JDBC:mysql://127.0.0.1:3306/userdb";
		String name = "root";
		String pass = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(host, name, pass);
			
			String sql = "INSERT into `User2` VALUES(?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "A105");
			psmt.setString(2, "강감찬");
			psmt.setString(3, "010-1234-6488");
			psmt.setInt(4, 54);
			
			psmt.executeUpdate();
			
			
			psmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		System.out.println("inset완료");
		
	}

}
