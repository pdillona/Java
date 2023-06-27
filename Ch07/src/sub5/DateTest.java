package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
날짜 : 2023/06/27
이름 : 정영재
내용 : JAVA Data Class 실습


*/
public class DateTest {

	public static void main(String[] args) {
		
		//Data클래스
		Date data = new Date(); //sql date아님
		System.out.println(data);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		String result = sdf.format(data);
		
		System.out.println("result: "+result);
		
		
		//Calendar클래스
		//Calendar cal = new Calendar();  //싱글톤이라 new안됨.
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //1월이 0월로 나오기때문에 +1을 해준다.
		int d = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY); //Hour와 Hour_of_day는 다르다. Hour는 12시가 0시가 된다.
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		
		System.out.printf("%d-%d-%d %d:%d:%d", year, month, d, hour, minute, second);

	}

}
