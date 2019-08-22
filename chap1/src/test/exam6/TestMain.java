package test.exam6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("src/test/exam6/test.xml");
		BeanTest beanTest = (BeanTest) context.getBean("beanTest");
		BeanTest beanTest2 = (BeanTest) context.getBean("beanTest");
		System.out.println(beanTest);
		System.out.println(beanTest2);
	}

}
