package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
날짜 : 2023/07/11
이름 : 정영재
내용 : JAVA Transaction 실습

트랜잭션(Transaction)
	- 트랜잭션은 DB 처리의 최소 작업단위로 하나의 작업은 소작업으로 구성
	- 트랜잭션은 모두 성고아 또는 모두 실패해야 한다.
	- commit은 모든 작업의 성공처리, rollback은 모든 작업 실패처리

*/
public class TransactionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("에러를 발생 하시겠습니까?");
		
		int answer = sc.nextInt();
		
		//DB정보
		
		String host = "JDBC:mysql://localhost:3306/bank";
		String name = "root";
		String pass = "1234";
		
		Connection conn = null;
		
		try {
			//1단계 - JDBC드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - DB접속
			conn = DriverManager.getConnection(host, name, pass);
			
			// 트랜잭션 시작
			conn.setAutoCommit(false);   //평소에 묵시적으로 자동커밋되는걸 일부러 트랜잭션을위해 끔 false
			
			//3단계 - SQL실행 객체 생성
            String sql1 = "UPDATE bank_account SET "
                    + " a_balance = a_balance - 10000 "
                    + " WHERE a_no = ?";
            String sql2 = "UPDATE bank_account SET "
                    + " a_balance = a_balance + 10000 "
                    + " WHERE a_no = ?";
            
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-11-1003");
			
			
			
			//4단계 - SQL실행 
			psmt1.executeUpdate();
			
			if(answer == 1) {
				throw new Exception("에러가 발생 했습니다.");
				
			}
			
			
			psmt2.executeUpdate();
			
			//트랜잭션 확정 - 성공처리
			conn.commit(); //여기까지 도달하면 비로소 commit을 한다. 
			//5단계
			//6단계 - 연결해제
			
			psmt1.close();
			psmt2.close();
			conn.close();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				// 익센션 발생시 작업취소 - 실패처리
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		

	}

}
