package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("src/test/test.xml");
		TestDao testDao = (TestDao) context.getBean("testDaoImp");
		testDao.print();
	}

}
