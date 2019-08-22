package life.exam1;

public class LifeBeanImp implements LifeBean {

	@Override
	public void life() {
		System.out.println("비즈니스 로직 실행...");
	}
	public void begin() {
		System.out.println("로직 실행 전 수행");
	}
	public void end() {
		System.out.println("로직 실행 후 수행");
	}
	
}
