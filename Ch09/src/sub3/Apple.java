package sub3;

import java.io.Serializable;

public class Apple implements Serializable { //객체 내보낼 때 Serializable interface사용

	private static final long serialVersionUID = 1L;  // 별의미 없음 걍 시리얼 넘버 매겨주는 행위 컴퓨터를위해
	private String 	country;
	private int		price;
	
	public Apple(String country, int price) {
		
		this.country = country;
		this.price 	 = price;
		
	}
	public void show() {
		
		System.out.println("원산지: "+ country);
		System.out.println("가격: "+  price);
	}
		
}
