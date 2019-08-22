package life.exam1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("src/life/exam1/test.xml");
		LifeBean lifeBean = (LifeBean) context.getBean("idLifeBean");
		lifeBean.life();
	}

}
