package Test1;
/*
날짜 : 2023/07/05
이름 : 정영재
내용 : JAVA 정기 수행평가 문제 2

*/
public class Star2 {

	public static void main(String[] args) {
		
		int n = 4;
				
		for(int i = 0; i<n; i++) {
			for(int j = 0; j < n-i-1; j++) {
				System.out.print("☆");
			}
			
			for(int k = 0; k < i*2+1; k++) {
				System.out.print("★");
			}
			
			for(int j = 0; j < n-i-1; j++) {
				System.out.print("☆");
			}
			
			System.out.println();
			
		} 
	}

}
