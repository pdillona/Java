package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
날짜 : 2023/07/10
이름 : 정영재
내용 : JAVA Update 실습

*/
public class UpdateTest {

	public static void main(String[] args) {

		String host ="jdbc:mysql://127.0.0.1:3306/userdb"; //"jdbc:mysql://localhost:3306/userdb" 도 가능 localhost = 127.0.0.1 이기 때문에.  
		String user	="root";
		String pass ="1234";
				
				
		try {
			// 1 단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2 단계 - 데이터 베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3 단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4 단계 - SQL 실행
			String sql  = "update User1 set ";  //띄워쓰기 주의
				   sql += "hp = '010-1234-1111',";
				   sql += "age = 89 ";
				   sql += "where uid = 'J104'";
			stmt.executeUpdate(sql);
					
			// 5 단계 - 결과처리
			// 6 단계 - 연결해제
			stmt.close();
			conn.close();

			
			
			
		} catch (ClassNotFoundException e) {
            System.out.println("Driver 정보 없음 : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("DB 접속 불가 : " +e.getMessage());
        }
		
		
		System.out.println("update 완료.....");
	}

}
