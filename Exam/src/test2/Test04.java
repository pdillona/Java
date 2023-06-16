package test2;
/**
 * 
 * 날짜: 2023/06/15
 * 이름: 정영재
 * 내용: Java 배열 선택 정렬 연습문제
 * 
 * 선택정렬
 * 	- 알고리즘에서 배열의 우너소를 정렬하는 가장 기본적인 방법
 * 	- 정렬 알고리즘에는 선택정렬, 삽입정렬, 퀵정렬, 버블정렬 등이 있다.
 * 
 * 정렬 단계
 * 	1단계: 배열의 첫 번째 원소를 2, 3, 4, 5번째 원소와 차례로 비교
 * 	2단계: 첫 번째 원소보다 작은 원소를 찾으면 서로 자리 교환
 * 	3단계: 배열의 두 번째 원소를 3, 4, 5번째 원소와 차례로 비교
 * 	4단계: 두 번째 원소보다 작은 원소를 찾으면 서로 자리교환
 * 	5단계: 위와 같이 최종 숫자가 하나 남을 때 까지 반복 수정
 *  
 */
public class Test04 {

	public static void main(String[] args) {
		
		int arr[] = {4, 2, 1, 5, 3};
		
		
		for (int i=0; i<4; i++) {
			
			for(int j = i+1; j<5; j++) {
				 //System.out.print(arr[1]);
				 
				 //System.out.print(arr[0]);
				if(arr[i] > arr[j]) {
					
					int temp =arr[j];
					
					arr[j] = arr[i]; // 이 라인에서 배열 변경 일어남
					
					arr[i] = temp;
					
				}
			}
			
		}
		
		//정렬된 배열 출력하기
		for(int n : arr) {
			System.out.print(n+" ");
		}
	}

}
