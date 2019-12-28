package springwithobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		Person bean = factory.getBean("id3", Person.class);
		bean.getDevice();

	}
}
