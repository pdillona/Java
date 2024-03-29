package test2;

import java.util.Scanner;

/**
 * 
 * 날짜: 2023/06/15
 * 이름: 정영재
 * 내용: Java 배열 이진 탐색 연습문제
 * 
 * 이진탐색
 * 	- 이진 탐색은 전체 원소가 정렬된 상태에서 중앙값을 기준으로 절반은 버리고
 * 	  나머지 절반을 대상으로 검색을 수행하는 알고리즘 이다.	
 * 
 * 정렬 단계
 * 	1단계: 배열의 중앙값을 찾는다. 
 * 	2단계: 검색하고자 하는 값보다 중앙값이 크면 중아값의 오른쪽을 버린다.
 * 	3단계: 다시 왼쪽 절번에 대해서 중앙값을 찾는다.
 * 	4단계: 위와 같이 반복 수행을 통해 검색하고자 하는 값을 발견 할 수 있다.
 * 
 *  
 */
public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {5, 10, 18, 22, 35, 55, 75, 103, 152};
		
		System.out.print("검색할 값 입력 : ");
		int value = sc.nextInt();
		
		int start = 0;
		int end	  = arr.length -1; // 8 
		int loc	  = 0;
		boolean state = false;
		
		while(start <= end) {
			int mid = (start + end) /2;  //4
			
			if(arr[mid] > value) { //35 > 5 
				end = mid - 1;  //입력값이 35 보다 작을때
			} else if(arr[mid] < value) { //입력값이 35 보다 클때
				start = mid + 1;
				
			} else {
				loc = mid;
				state = true;
				break;
				
			}
				
		}
		if(state) {
			System.out.printf("찾은 위치: %d 번째 있습니다.", loc + 1);
		}else {
			System.out.println("찾는 숫자가 없습니다.");
		}
		sc.close();
	}

}
