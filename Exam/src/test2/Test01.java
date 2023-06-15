package test2;
/**
 * 
 * 날짜: 2023/06/15
 * 이름: 정영재
 * 내용: Java 배열 문자 출력 연습문제
 *  
 * 
 * 
 */

public class Test01 {

	public static void main(String[] args) {
		
		char str[] = {'I',' ','L','O','V','E',' ','Y','O','U'};
		int row, col;
		
		for(row = 1; row<10; row++) { //9번돔 
			
			for (col = 0; col <= row; col++) {
				
				System.out.print(str[col]);
				
			}
			
			System.out.print("\n");
		}
		
		

	}

}
/**
 * 배열에 뭐가 담긴지 모른다고 가정 최소 값 뽑아내기.
 *  
int[] array = {5, 3, 9, 1, 7};
int min = array[0]; // 배열의 첫 번째 요소로 초기화

for (int i = 1; i < array.length; i++) {
    if (array[i] < min) {
        min = array[i];
    }
}

System.out.println("최소값: " + min);

*/
