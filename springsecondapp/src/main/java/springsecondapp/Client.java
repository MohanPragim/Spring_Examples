package springsecondapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		HelloWorldUsingSpring bean = factory.getBean("id1", HelloWorldUsingSpring.class);

		bean.getDisplay();

	}
}
