package sub2;

import java.awt.Container;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
날짜 : 2023/07/06
이름 : 정영재
내용 : JAVA Swing 실습하기
	
GUI프로그래밍
	- 사용자가 편리하게 프로그램을 사용할 수 있게 윈도우를 지원하는 프로그래밍
	- JAVA는 GUI 개발을 위해 Swing 라이브러리 지원
	- GUI개발의 편의성을 위해 WindowBuilder 설치
*/
public class HelloSwingTest {

	public static void main(String[] args) {
		
	
		// 윈도우 생성
		JFrame frame = new JFrame("Hello Swing!");
		frame.setPreferredSize(new Dimension(300,200));
		frame.pack();
		frame.setVisible(true);
		
		
		
		//컨테이너 배치
		Container pane = frame.getContentPane();
				
		// 컴포넌트 배치
				
		JLabel label  = new JLabel("Hello Swing");
		pane.add(label);
				
		JButton button = new JButton("확인");
		pane.add(button);
		
				
	}

}
