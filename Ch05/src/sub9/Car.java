package sub9;

// 공통된 설계를 위한 설계도 약속? 가이드 를 만들고 그 가이드에 따라 만들게함.
public interface Car {

	public abstract void speedUp(int speed);
	public abstract void speedDown(int speed);
	public void show();	//abstract 생략 가능 추상클래스 에서는 생략이 불가하나 인터페이스 에서는 생략가능.
}
