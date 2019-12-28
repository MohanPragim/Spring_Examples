package springfirstapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class client {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		HelloWorldUsingSpring bean = factory.getBean("id1", HelloWorldUsingSpring.class);
		bean.getDisplay();
	}
}
