package sub1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.util.ArrayList;
import javax.swing.JRadioButton;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 572);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Components Test");
		lblNewLabel.setBounds(12, 10, 145, 15);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		
		JButton btn4 = new JButton("button");
		btn4.setBounds(343, 228, 79, 23);
		btn4.setFont(new Font("굴림", Font.BOLD, 12));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn4클릭");
				}
		});
		
		JButton btn1 = new JButton("button");
		btn1.setBounds(12, 228, 79, 23);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn1클릭");
			}
		});
		btn1.setFont(new Font("굴림", Font.BOLD, 12));
		
		JButton btn2 = new JButton("button");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2클릭");
			}
		});
		btn2.setBounds(127, 228, 79, 23);
		btn2.setFont(new Font("굴림", Font.BOLD, 12));
		
		JButton btn3 = new JButton("button");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int answer = JOptionPane.showConfirmDialog(null, "btn3클릭","확인 대화상자",JOptionPane.YES_NO_OPTION);
			
			if(answer == JOptionPane.YES_OPTION) {
				System.out.println("yes클릭");
				}else {
				System.out.println("no클릭");
				}
			}
		});
		btn3.setBounds(237, 228, 79, 23);
		btn3.setFont(new Font("굴림", Font.BOLD, 12));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		frame.getContentPane().add(btn3);
		frame.getContentPane().add(btn4);
		
		JLabel lblNewLabel_1 = new JLabel("TextFiled실습");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_1.setBounds(12, 35, 91, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Button실습");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(12, 203, 79, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("아이디");
		lblNewLabel_1_2.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(12, 60, 47, 15);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("이름");
		lblNewLabel_1_3.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(12, 99, 41, 15);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("휴대폰");
		lblNewLabel_1_4.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(12, 136, 47, 15);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		

		JLabel lbUid = new JLabel("결과:");
		lbUid.setFont(new Font("굴림", Font.BOLD, 12));
		lbUid.setBounds(282, 60, 123, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lbName = new JLabel("결과:");
		lbName.setFont(new Font("굴림", Font.BOLD, 12));
		lbName.setBounds(281, 99, 124, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("결과:");
		lbHp.setFont(new Font("굴림", Font.BOLD, 12));
		lbHp.setBounds(281, 136, 141, 15);
		frame.getContentPane().add(lbHp);
		
		
		txtUid = new JTextField();
		txtUid.setBounds(62, 60, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		
		
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid = txtUid.getText();
				lbUid.setText("결과: "+uid);
				
			}
		});
		btnUid.setFont(new Font("굴림", Font.BOLD, 12));
		btnUid.setBounds(190, 56, 79, 23);
		frame.getContentPane().add(btnUid);
		
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(62, 96, 116, 21);
		frame.getContentPane().add(txtName);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(62, 133, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				lbName.setText("결과: "+ name);
			}
		});
		btnName.setFont(new Font("굴림", Font.BOLD, 12));
		btnName.setBounds(190, 95, 79, 23);
		frame.getContentPane().add(btnName);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = txtHp.getText();
				lbHp.setText("결과: "+hp);
				
			}
		});
		btnHp.setFont(new Font("굴림", Font.BOLD, 12));
		btnHp.setBounds(190, 132, 79, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lblNewLabel_2 = new JLabel("CheckBox실습");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_2.setBounds(12, 267, 91, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setFont(new Font("굴림", Font.BOLD, 12));
		chk1.setBounds(8, 288, 54, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setFont(new Font("굴림", Font.BOLD, 12));
		chk2.setBounds(62, 288, 54, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("수박");
		chk3.setFont(new Font("굴림", Font.BOLD, 12));
		chk3.setBounds(120, 288, 54, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("포도");
		chk4.setFont(new Font("굴림", Font.BOLD, 12));
		chk4.setBounds(178, 288, 54, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("바나나");
		chk5.setFont(new Font("굴림", Font.BOLD, 12));
		chk5.setBounds(234, 288, 69, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkFruit = new JLabel("선택한 과일:");
		lbChkFruit.setFont(new Font("굴림", Font.BOLD, 12));
		lbChkFruit.setBounds(12, 317, 410, 23);
		frame.getContentPane().add(lbChkFruit);
				
		JButton btnChkFruit = new JButton("확인");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fruits = new ArrayList<>();
								
				if(chk1.isSelected()) {
					fruits.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					fruits.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					fruits.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					fruits.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					fruits.add(chk5.getText());
				}
				
				lbChkFruit.setText("선택한 과일: "+fruits);
				
				
			}
		});
		btnChkFruit.setFont(new Font("굴림", Font.BOLD, 12));
		btnChkFruit.setBounds(325, 288, 97, 23);
		frame.getContentPane().add(btnChkFruit);
		
		JLabel lblNewLabel_3 = new JLabel("RadioButton실습");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_3.setBounds(12, 382, 123, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setFont(new Font("굴림", Font.BOLD, 12));
		rdMale.setBounds(12, 415, 54, 23);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setFont(new Font("굴림", Font.BOLD, 12));
		rdFemale.setBounds(81, 415, 54, 23);
		frame.getContentPane().add(rdFemale);
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
		
		JLabel lbGender = new JLabel("선택결과: ");
		lbGender.setFont(new Font("굴림", Font.BOLD, 12));
		lbGender.setBounds(12, 465, 242, 15);
		frame.getContentPane().add(lbGender);
		
			
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				
				
				if(rdMale.isSelected()) {
					lbGender.setText("선택결과: " +rdMale.getText());
					
				}else {
					lbGender.setText("선택결과: "+ rdFemale.getText());
				}
				
			}
		});
		
	
		
		btnGender.setFont(new Font("굴림", Font.BOLD, 12));
		btnGender.setBounds(157, 415, 97, 23);
		frame.getContentPane().add(btnGender);
		
	
	
		

	}
}
