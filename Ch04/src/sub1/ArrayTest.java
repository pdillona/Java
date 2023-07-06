package sub1;
/*
 * 날짜 : 2023/06/14
 * 이름 : 정영재
 * 내용 : 자바 배열 실습하기
 * 
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		//배열
		int[] arr1 = {1, 2, 3, 4, 5}; 
		//배열의 기본형태  타입[] 변수 = {  , , , , } 
		// []의 위치는 변수 앞뒤에 붙어도 무방하다.
		//이때 인덱스는 1 = 0, 2 = 1, 3 = 2~~
		char[] arr2 = {'A','B','C',}; // 배열은 같은 타입의 데이터만 묶을 수 있다. char[] arr2 = {'A', 2, 'C',};과 같은 배열은 작성 불가.
			   
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"}; 
		
		
		//원소 출력
		System.out.println("arr1[0]:" + arr1[0]);
		System.out.println("arr1[1]:" + arr1[1]);
		System.out.println("arr1[2]:" + arr1[2]);
		System.out.println("arr1[3]:" + arr1[3]);
		
		/*	결과:
		 *  arr1[0]:1
			arr1[1]:2
			arr1[2]:3
			arr1[3]:4
		 */
		System.out.println("arr2[0]:" + arr2[0]);
		System.out.println("arr2[2]:" + arr2[2]);
		System.out.println("arr2[1]:" + arr2[1]);
		/* 	결과:
		 * 	arr2[0]:A
			arr2[2]:C
			arr2[1]:B
		 * 
		 */
		
		
		System.out.println("arr3[0]:" + arr3[0]);
		System.out.println("arr3[4]:" + arr3[4]);
		System.out.println("arr3[2]:" + arr3[2]);
		
		/* 	결과:
		 * 	arr3[0]:서울
			arr3[4]:광주
			arr3[2]:대구
		 * 
		 */
		
		
		
		
		//배열 길이
		//원소의 개수를 길이라고 한다.
		
		System.out.println("arr1 길이:" + arr1.length);
		System.out.println("arr2 길이:" + arr2.length);
		System.out.println("arr3 길이:" + arr3.length);
		
		/*  결과:
		 * 	arr1 길이:5   //0 부터해서 4개 인줄 알았는데 길이는 1부터 세는듯.
			arr2 길이:3
			arr3 길이:5
		 * 
		 */
		
		
		
		//배열 반복문
		
		for(int i = 0; i<arr1.length; i++) { //자꾸 까먹는데 0번도 횟수 배열길이가 5 0 ~ 4까지 5번돈다.
			
			System.out.print(arr1[i] + " ");
			
		}
		
		System.out.println(); //개행처리 \n하면 한 줄더 띄워짐
		
		for(char c : arr2) { //c는 그냥 변수이름  // 배열의 길이만큼 반복한다.
			
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		for(String city : arr3) { 
			
			System.out.print(city + " ");
		}
		
		System.out.println();
		
		//1차원 배열
		int[] scores = {80, 60, 78, 62, 92};  //배열의 변수명은 항상 복수로 작성해줘야 한다. ex) score (X) scores (O)
 		int total = 0;
 		
 		for(int s : scores) {
 			
 			total += s;
 			
 			
 		}
		System.out.println("scores 합:" + total);
		
		//2차원 배열
		int[][] arr2d = {	{1,2,3,4}, 
							{5,6,7,8}, 
							{9,10,11,12}}; //배열 안에 또 다른 작은 배열이 있는 형태
		//2차원 부터 행과 열이생김  행과 열 번호는 0부터 시작. 인덱스와 같음. 번호를 부를때는 행부터 행(가로) 열(세로)
		
		for(int a=0; a<3; a++) {
			
			for(int b=0; b<4; b++) {
				System.out.println("arr2d["+a+"]["+b+"]: " + arr2d[a][b]);  //"arr2d["+a+"]["+b+"]: " 헷갈렸어어 해설: "arr2d[" 문자열 + a변수값 "[]" 가 문자열~~~식으로나가는거임 "arr2d["+a+"]["+b+"]: " 저거 통체로 문자열이 아님 
				
			}
			
		}
		
		//3차원 배열
		// 2차원 배열이 여러개 있는것.
		int[][][] arr3d = {{{1,2,3},
							{4,5,6},
							{7,8,9}},
				
							{{10,11,12},
							{13,14,15},
							{16,17,18}},
							
							{{19,20,21},
							{22,23,24},
							{25,26,27}}};  
		
		for(int a = 0; a<3; a++) {
			
			for(int b = 0; b<3; b++) {
				
				for(int c = 0; c<3; c++) {
					
					System.out.printf("arr2d[%d][%d][%d]: %d\n", a, b, c, arr3d[a][b][c]);
				}
				
			}
			
		}
		
		
		
		
		
	}
}
