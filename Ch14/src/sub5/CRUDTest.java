package sub5;

import java.util.List;
import java.util.Scanner;

/*
 
날짜 : 2023.07.12
내용 : CRUD 실습
CRUD
Create, Read, Update, Delete 의미
데이터베이스의 기본 처리 기능을 의미
Insert, Select, Update, Delete 처리 기능
*/
public class CRUDTest {

    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("회원 관리 매니저 v1.0");
        System.out.println("=========================");

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("종료: 0 | 입력: 1 | 조회: 2 | 검색: 3 | 수정: 4 | 삭제: 5");
            System.out.print("선택 : ");

            int answer = sc.nextInt();

            if(answer == 0) {
                break;
            }else if(answer == 1) {
            	UserVO vo = new UserVO();
            	
            	
                System.out.print("아이디 입력 : ");
                vo.setUid(sc.next());

                System.out.print("이름 입력 : ");
                vo.setName(sc.next());
                
                System.out.print("전화번호 입력 : ");
                vo.setHp(sc.next());

                System.out.print("나이 입력 : ");
                vo.setAge(sc.nextInt());
                
                UserDAO dao = UserDAO.getInstance();
                dao.insertUser(vo);

            }else if(answer == 2){
            	//조회
                List<UserVO> users = UserDAO.getInstance().selectUsers();  //여러명이니 리스트로받아옴
            	
                System.out.println("===================전체조회==================");
                for(UserVO user: users) {
                	System.out.println(user);
                }
            	
            }else if(answer == 3) {
            	//검색
            	System.out.println("아이디 검색: ");
            	String uid = sc.next();
            	
            	UserVO user = UserDAO.getInstance().selectUser(uid);
            	
            	System.out.println("===============검색결과===============");
            	System.out.println(user);
            	System.out.println("====================================");
            	
            }else if(answer == 4) {
            	
            	
            	UserVO vo = new UserVO();
            	
            	System.out.println("수정할 회원 아이디 입력: ");
            	vo.setUid(sc.next()); 
            	
            	System.out.println("수정 회원 이름: ");
            	vo.setName(sc.next());
            	
            	System.out.println("수정 회원 휴대폰 입력: ");
            	vo.setHp(sc.next());
            	
            	System.out.println("수정 회원 나이 입력: ");
            	vo.setAge(sc.nextInt());
            	
            	
            	int result = UserDAO.getInstance().updateUser(vo);
            	
                   	
            	if(result > 0) {
            		System.out.println("수정완료");
            		
            	}else {
            		System.out.println("수정할 사용자가 존재하지 않습니다.");
            	}
            	
            }else if(answer == 5){
            	UserVO vo = new UserVO();
            	
            	System.out.println("삭제 하고자 하는 아이디를 입력하세요: ");
            	vo.setUid(sc.next());
            	
            	
            	int drs = UserDAO.getInstance().deleteUser(vo);
            	
            	if(drs == 0) {
            		System.out.println("삭제실패");            		
            	}else {
            		System.out.println("삭제 되었 습니다.");
            	}
            	
            	
            }
            
        } // while end
        System.out.println("프로그램 종료");
        sc.close();
    } // main end
}