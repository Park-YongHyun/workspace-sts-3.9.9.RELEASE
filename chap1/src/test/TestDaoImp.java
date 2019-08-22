package test;

import org.springframework.stereotype.Component;

@Component
public class TestDaoImp implements TestDao {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("실행확인");
	}

}
