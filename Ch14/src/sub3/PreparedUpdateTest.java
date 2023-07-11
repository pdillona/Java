package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
날짜 : 2023/07/11
이름 : 정영재
내용 : JAVA ProparedStatement 실습

*/


public class PreparedUpdateTest {

	public static void main(String[] args) {
		
		//DB정보
		String host = "JDBC:mysql://127.0.0.1:3306/userdb";
		String name = "root";
		String pass = "1234";
		
		
		try {
			// 1단계 - JDBC드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, name, pass);
			
			// 3단계 - SQL실행 객체 생성
			String sql = "UPDATE `User2` SET `hp`= ?, `age`= ? WHERE `uid`= ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "010-1234-6487");
			psmt.setInt(2, 67);
			psmt.setString(3, "A103");
			
			// 4단계 - 
			psmt.executeUpdate();
			
			// 5단계 - 
			
			// 6단계 -
			psmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		System.out.println("실행완료");
	}

}
