package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
날짜 : 2023/07/10
이름 : 정영재
내용 : JAVA JDBC 프로그래밍 실습

JDBC(Java DataBase Connectivity)
	- 자바에서 데이터베이스 연결을 위한 기술 표준
	- Java는 기본적으로 java.sql 패키지를 포함하고 별도로 DBMS에 맞는 드라이버를 설정해주어 사용 한다.
	


*/
public class JDBCTest {

	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
				
		// 데이터 베이스 접속
		try {
			// Class.forName은 JDBC 드라이버 로드 
			// argument를 통해 드라이버를 로드 해서 실행해준다.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 데이터 베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			if(conn != null) {
				System.out.println("데이터 베이스 접속 성공!");
			}else {
				System.out.println("데이터 베이스 접속 실패!");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}

}
