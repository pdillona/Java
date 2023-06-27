package sub4;
/*
날짜 : 2023/06/27
이름 : 정영재
내용 : JAVA Object Class 실습


*/
public class MathTest {

	public static void main(String[] args) {
		
		
		// math = new Math(); 불가

		System.out.println("절대값: "+Math.abs(-5));
		System.out.println("제곱근: "+Math.sqrt(9));
		System.out.println("올림값: "+Math.ceil(1.2)); //해당 값에서 가장 가까운정수 +로
		System.out.println("올림값: "+Math.ceil(1.8));
		System.out.println("내림값: "+Math.floor(1.2));//해당 값에서 가장 가까운정수 -로
		System.out.println("내림값: "+Math.floor(1.8));
		System.out.println("내림값: "+Math.floor(0.9));// 0까지는 출력 
		System.out.println("내림값: "+Math.floor(-0.9));// 결과 -1.0 
		System.out.println("반올림: "+Math.round(1.2));
		System.out.println("반올림: "+Math.round(1.8));

		
		//random 메서드
		
		double num1 = Math.random();
		System.out.println("num1: "+num1); // 0~1사이 실수 구하기
		
		double num2 = num1 * 10;
		System.out.println("num2: "+num2); // 0~10사이 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3: " +num3);
		
		
		int rand = (int) Math.ceil(Math.random()*45);
		
		System.out.println("rand: "+rand);
		

	}

}
