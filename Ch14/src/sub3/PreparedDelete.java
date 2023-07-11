package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
날짜 : 2023/07/11
이름 : 정영재
내용 : JAVA ProparedStatement 실습

*/

public class PreparedDelete {

	public static void main(String[] args) {
		// DB정보
		String host = "JDBC:mysql://127.0.0.1:3306/userdb";
		String name = "root";
		String pass = "1234";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(host, name, pass);
			
			String sql = "DELETE FROM `User2` WHERE `uid` = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "A103");
			
			
			
			psmt.executeUpdate();
			
			
			psmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("delte완료");
	}

}
